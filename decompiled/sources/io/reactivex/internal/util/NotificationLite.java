package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import mx.openpay.library.domain.util.Constant;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class NotificationLite {
    private static final /* synthetic */ NotificationLite[] $VALUES;
    public static final NotificationLite COMPLETE;

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Disposable f73794p0;

        public a(Disposable disposable) {
            this.f73794p0 = disposable;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.f73794p0 + Constant.BRACKET_CLOSE;
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Throwable f73795p0;

        public b(Throwable th2) {
            this.f73795p0 = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return ObjectHelper.equals(this.f73795p0, ((b) obj).f73795p0);
            }
            return false;
        }

        public final int hashCode() {
            return this.f73795p0.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f73795p0 + Constant.BRACKET_CLOSE;
        }
    }

    public static final class c implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscription f73796p0;

        public c(Subscription subscription) {
            this.f73796p0 = subscription;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.f73796p0 + Constant.BRACKET_CLOSE;
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        COMPLETE = notificationLite;
        $VALUES = new NotificationLite[]{notificationLite};
    }

    public NotificationLite() {
        throw null;
    }

    public static <T> boolean accept(Object obj, Subscriber<? super T> subscriber) {
        if (obj == COMPLETE) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof b) {
            subscriber.onError(((b) obj).f73795p0);
            return true;
        }
        subscriber.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Subscriber<? super T> subscriber) {
        if (obj == COMPLETE) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof b) {
            subscriber.onError(((b) obj).f73795p0);
            return true;
        }
        if (obj instanceof c) {
            subscriber.onSubscribe(((c) obj).f73796p0);
            return false;
        }
        subscriber.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(Disposable disposable) {
        return new a(disposable);
    }

    public static Object error(Throwable th2) {
        return new b(th2);
    }

    public static Disposable getDisposable(Object obj) {
        return ((a) obj).f73794p0;
    }

    public static Throwable getError(Object obj) {
        return ((b) obj).f73795p0;
    }

    public static Subscription getSubscription(Object obj) {
        return ((c) obj).f73796p0;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof c;
    }

    public static Object subscription(Subscription subscription) {
        return new c(subscription);
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof b) {
            observer.onError(((b) obj).f73795p0);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof b) {
            observer.onError(((b) obj).f73795p0);
            return true;
        }
        if (obj instanceof a) {
            observer.onSubscribe(((a) obj).f73794p0);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t10) {
        return t10;
    }
}
