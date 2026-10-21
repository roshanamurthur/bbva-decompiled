package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<? extends T>[] f70350q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f70351r0;

    public static final class a<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public final AtomicInteger E0;
        public int F0;
        public ArrayList G0;
        public long H0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Subscriber<? super T> f70352w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final Publisher<? extends T>[] f70353x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final boolean f70354y0;

        public a(Publisher<? extends T>[] publisherArr, boolean z10, Subscriber<? super T> subscriber) {
            super(false);
            this.f70352w0 = subscriber;
            this.f70353x0 = publisherArr;
            this.f70354y0 = z10;
            this.E0 = new AtomicInteger();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            AtomicInteger atomicInteger = this.E0;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            Publisher<? extends T>[] publisherArr = this.f70353x0;
            int length = publisherArr.length;
            int i10 = this.F0;
            while (true) {
                Subscriber<? super T> subscriber = this.f70352w0;
                if (i10 == length) {
                    ArrayList arrayList = this.G0;
                    if (arrayList == null) {
                        subscriber.onComplete();
                        return;
                    } else if (arrayList.size() == 1) {
                        subscriber.onError((Throwable) arrayList.get(0));
                        return;
                    } else {
                        subscriber.onError(new CompositeException(arrayList));
                        return;
                    }
                }
                Publisher<? extends T> publisher = publisherArr[i10];
                if (publisher == null) {
                    NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                    if (!this.f70354y0) {
                        subscriber.onError(nullPointerException);
                        return;
                    }
                    ArrayList arrayList2 = this.G0;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList((length - i10) + 1);
                        this.G0 = arrayList2;
                    }
                    arrayList2.add(nullPointerException);
                    i10++;
                } else {
                    long j10 = this.H0;
                    if (j10 != 0) {
                        this.H0 = 0L;
                        produced(j10);
                    }
                    publisher.subscribe(this);
                    i10++;
                    this.F0 = i10;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (!this.f70354y0) {
                this.f70352w0.onError(th2);
                return;
            }
            ArrayList arrayList = this.G0;
            if (arrayList == null) {
                arrayList = new ArrayList((this.f70353x0.length - this.F0) + 1);
                this.G0 = arrayList;
            }
            arrayList.add(th2);
            onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.H0++;
            this.f70352w0.onNext(t10);
        }
    }

    public FlowableConcatArray(Publisher<? extends T>[] publisherArr, boolean z10) {
        this.f70350q0 = publisherArr;
        this.f70351r0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(this.f70350q0, this.f70351r0, subscriber);
        subscriber.onSubscribe(aVar);
        aVar.onComplete();
    }
}
