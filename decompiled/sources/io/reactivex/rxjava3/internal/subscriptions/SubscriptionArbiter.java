package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public class SubscriptionArbiter extends AtomicInteger implements Subscription {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Subscription f78069p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f78070q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicReference<Subscription> f78071r0 = new AtomicReference<>();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicLong f78072s0 = new AtomicLong();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicLong f78073t0 = new AtomicLong();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f78074u0;
    protected boolean unbounded;
    public volatile boolean v0;

    public SubscriptionArbiter(boolean z10) {
        this.f78074u0 = z10;
    }

    public final void c() {
        int iAddAndGet = 1;
        long jAddCap = 0;
        Subscription subscription = null;
        do {
            Subscription andSet = this.f78071r0.get();
            if (andSet != null) {
                andSet = this.f78071r0.getAndSet(null);
            }
            long andSet2 = this.f78072s0.get();
            if (andSet2 != 0) {
                andSet2 = this.f78072s0.getAndSet(0L);
            }
            long andSet3 = this.f78073t0.get();
            if (andSet3 != 0) {
                andSet3 = this.f78073t0.getAndSet(0L);
            }
            Subscription subscription2 = this.f78069p0;
            if (this.v0) {
                if (subscription2 != null) {
                    subscription2.cancel();
                    this.f78069p0 = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jAddCap2 = this.f78070q0;
                if (jAddCap2 != Long.MAX_VALUE) {
                    jAddCap2 = BackpressureHelper.addCap(jAddCap2, andSet2);
                    if (jAddCap2 != Long.MAX_VALUE) {
                        jAddCap2 -= andSet3;
                        if (jAddCap2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jAddCap2);
                            jAddCap2 = 0;
                        }
                    }
                    this.f78070q0 = jAddCap2;
                }
                if (andSet != null) {
                    if (subscription2 != null && this.f78074u0) {
                        subscription2.cancel();
                    }
                    this.f78069p0 = andSet;
                    if (jAddCap2 != 0) {
                        jAddCap = BackpressureHelper.addCap(jAddCap, jAddCap2);
                        subscription = andSet;
                    }
                } else if (subscription2 != null && andSet2 != 0) {
                    jAddCap = BackpressureHelper.addCap(jAddCap, andSet2);
                    subscription = subscription2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jAddCap != 0) {
            subscription.request(jAddCap);
        }
    }

    public void cancel() {
        if (this.v0) {
            return;
        }
        this.v0 = true;
        if (getAndIncrement() != 0) {
            return;
        }
        c();
    }

    public final boolean isCancelled() {
        return this.v0;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public void onSubscribe(Subscription subscription) {
        setSubscription(subscription);
    }

    public final void produced(long j10) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.f78073t0, j10);
            if (getAndIncrement() != 0) {
                return;
            }
            c();
            return;
        }
        long j11 = this.f78070q0;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                SubscriptionHelper.reportMoreProduced(j12);
                j12 = 0;
            }
            this.f78070q0 = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        c();
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j10) {
        if (!SubscriptionHelper.validate(j10) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.f78072s0, j10);
            if (getAndIncrement() != 0) {
                return;
            }
            c();
            return;
        }
        long j11 = this.f78070q0;
        if (j11 != Long.MAX_VALUE) {
            long jAddCap = BackpressureHelper.addCap(j11, j10);
            this.f78070q0 = jAddCap;
            if (jAddCap == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        Subscription subscription = this.f78069p0;
        if (decrementAndGet() != 0) {
            c();
        }
        if (subscription != null) {
            subscription.request(j10);
        }
    }

    public final void setSubscription(Subscription subscription) {
        if (this.v0) {
            subscription.cancel();
            return;
        }
        Objects.requireNonNull(subscription, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Subscription andSet = this.f78071r0.getAndSet(subscription);
            if (andSet != null && this.f78074u0) {
                andSet.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            c();
            return;
        }
        Subscription subscription2 = this.f78069p0;
        if (subscription2 != null && this.f78074u0) {
            subscription2.cancel();
        }
        this.f78069p0 = subscription;
        long j10 = this.f78070q0;
        if (decrementAndGet() != 0) {
            c();
        }
        if (j10 != 0) {
            subscription.request(j10);
        }
    }
}
