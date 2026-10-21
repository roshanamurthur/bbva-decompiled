package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class QueueDrainHelper {
    public QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> boolean a(long j10, Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j11 = j10 & Long.MIN_VALUE;
        while (true) {
            if (j11 != j10) {
                try {
                    if (booleanSupplier.getAsBoolean()) {
                        break;
                    }
                    T tPoll = queue.poll();
                    if (tPoll == null) {
                        subscriber.onComplete();
                        return true;
                    }
                    subscriber.onNext(tPoll);
                    j11++;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                }
            } else {
                try {
                    if (booleanSupplier.getAsBoolean()) {
                        return true;
                    }
                    if (queue.isEmpty()) {
                        subscriber.onComplete();
                        return true;
                    }
                    j10 = atomicLong.get();
                    if (j10 == j11) {
                        long jAddAndGet = atomicLong.addAndGet(-(j11 & Long.MAX_VALUE));
                        if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                            return false;
                        }
                        j10 = jAddAndGet;
                        j11 = jAddAndGet & Long.MIN_VALUE;
                    } else {
                        continue;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                }
            }
        }
        return true;
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, Subscriber<?> subscriber, boolean z12, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            Throwable thError = queueDrain.error();
            if (thError != null) {
                subscriber.onError(thError);
            } else {
                subscriber.onComplete();
            }
            return true;
        }
        Throwable thError2 = queueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            subscriber.onError(thError2);
            return true;
        }
        if (!z11) {
            return false;
        }
        subscriber.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int i10) {
        return i10 < 0 ? new SpscLinkedArrayQueue(-i10) : new SpscArrayQueue(i10);
    }

    public static <T, U> void drainLoop(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z10, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        int iLeave = 1;
        while (!checkTerminated(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer, z10, simplePlainQueue, disposable, observableQueueDrain)) {
            while (true) {
                boolean zDone = observableQueueDrain.done();
                T tPoll = simplePlainQueue.poll();
                boolean z11 = tPoll == null;
                if (checkTerminated(zDone, z11, observer, z10, simplePlainQueue, disposable, observableQueueDrain)) {
                    return;
                }
                if (z11) {
                    break;
                } else {
                    observableQueueDrain.accept(observer, tPoll);
                }
            }
            iLeave = observableQueueDrain.leave(-iLeave);
            if (iLeave == 0) {
                return;
            }
        }
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, Subscriber<? super U> subscriber, boolean z10, Disposable disposable, QueueDrain<T, U> queueDrain) {
        int iLeave = 1;
        while (true) {
            boolean zDone = queueDrain.done();
            T tPoll = simplePlainQueue.poll();
            boolean z11 = tPoll == null;
            if (checkTerminated(zDone, z11, subscriber, z10, simplePlainQueue, queueDrain)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            } else if (z11) {
                iLeave = queueDrain.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else {
                long jRequested = queueDrain.requested();
                if (jRequested == 0) {
                    simplePlainQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    subscriber.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (queueDrain.accept(subscriber, tPoll) && jRequested != Long.MAX_VALUE) {
                    queueDrain.produced(1L);
                }
            }
        }
    }

    public static <T> void postComplete(Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j10;
        long j11;
        if (queue.isEmpty()) {
            subscriber.onComplete();
            return;
        }
        if (a(atomicLong.get(), subscriber, queue, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j10 = atomicLong.get();
            if ((j10 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j11 = j10 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
        if (j10 != 0) {
            a(j11, subscriber, queue, atomicLong, booleanSupplier);
        }
    }

    public static <T> boolean postCompleteRequest(long j10, Subscriber<? super T> subscriber, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j11;
        do {
            j11 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j11, BackpressureHelper.addCap(Long.MAX_VALUE & j11, j10) | (j11 & Long.MIN_VALUE)));
        if (j11 != Long.MIN_VALUE) {
            return false;
        }
        a(j10 | Long.MIN_VALUE, subscriber, queue, atomicLong, booleanSupplier);
        return true;
    }

    public static void request(Subscription subscription, int i10) {
        subscription.request(i10 < 0 ? Long.MAX_VALUE : i10);
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, Observer<?> observer, boolean z12, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable thError = observableQueueDrain.error();
            if (thError != null) {
                observer.onError(thError);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable thError2 = observableQueueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thError2);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }
}
