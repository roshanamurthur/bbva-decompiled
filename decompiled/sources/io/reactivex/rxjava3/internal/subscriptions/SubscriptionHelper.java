package io.reactivex.rxjava3.internal.subscriptions;

import androidx.camera.core.impl.v;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SubscriptionHelper implements Subscription {
    private static final /* synthetic */ SubscriptionHelper[] $VALUES;
    public static final SubscriptionHelper CANCELLED;

    static {
        SubscriptionHelper subscriptionHelper = new SubscriptionHelper("CANCELLED", 0);
        CANCELLED = subscriptionHelper;
        $VALUES = new SubscriptionHelper[]{subscriptionHelper};
    }

    public SubscriptionHelper() {
        throw null;
    }

    public static void deferredRequest(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, long j10) {
        Subscription subscription = atomicReference.get();
        if (subscription != null) {
            subscription.request(j10);
            return;
        }
        if (validate(j10)) {
            BackpressureHelper.add(atomicLong, j10);
            Subscription subscription2 = atomicReference.get();
            if (subscription2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    subscription2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, Subscription subscription) {
        if (!setOnce(atomicReference, subscription)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        subscription.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        while (true) {
            Subscription subscription2 = atomicReference.get();
            if (subscription2 != CANCELLED) {
                while (!atomicReference.compareAndSet(subscription2, subscription)) {
                    if (atomicReference.get() != subscription2) {
                    }
                }
                return true;
            }
            if (subscription == null) {
                return false;
            }
            subscription.cancel();
            return false;
        }
    }

    public static void reportMoreProduced(long j10) {
        RxJavaPlugins.onError(new ProtocolViolationException(v.c("More produced than requested: ", j10)));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        while (true) {
            Subscription subscription2 = atomicReference.get();
            if (subscription2 == CANCELLED) {
                if (subscription == null) {
                    return false;
                }
                subscription.cancel();
                return false;
            }
            do {
                if (atomicReference.compareAndSet(subscription2, subscription)) {
                    if (subscription2 == null) {
                        return true;
                    }
                    subscription2.cancel();
                    return true;
                }
            } while (atomicReference.get() == subscription2);
        }
    }

    public static boolean setOnce(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        Objects.requireNonNull(subscription, "s is null");
        while (!atomicReference.compareAndSet(null, subscription)) {
            if (atomicReference.get() != null) {
                subscription.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                reportSubscriptionSet();
                return false;
            }
        }
        return true;
    }

    public static boolean validate(Subscription subscription, Subscription subscription2) {
        if (subscription2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (subscription == null) {
            return true;
        }
        subscription2.cancel();
        reportSubscriptionSet();
        return false;
    }

    public static SubscriptionHelper valueOf(String str) {
        return (SubscriptionHelper) Enum.valueOf(SubscriptionHelper.class, str);
    }

    public static SubscriptionHelper[] values() {
        return (SubscriptionHelper[]) $VALUES.clone();
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    public static boolean cancel(AtomicReference<Subscription> atomicReference) {
        Subscription andSet;
        Subscription subscription = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (subscription == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j10) {
        if (j10 > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException(v.c("n > 0 required but it was ", j10)));
        return false;
    }

    public static boolean setOnce(AtomicReference<Subscription> atomicReference, Subscription subscription, long j10) {
        if (!setOnce(atomicReference, subscription)) {
            return false;
        }
        subscription.request(j10);
        return true;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
    }
}
