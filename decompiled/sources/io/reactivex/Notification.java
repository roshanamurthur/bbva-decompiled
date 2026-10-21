package io.reactivex;

import androidx.collection.j;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes7.dex */
public final class Notification<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Notification<Object> f69860b = new Notification<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f69861a;

    public Notification(Object obj) {
        this.f69861a = obj;
    }

    @NonNull
    public static <T> Notification<T> createOnComplete() {
        return (Notification<T>) f69860b;
    }

    @NonNull
    public static <T> Notification<T> createOnError(@NonNull Throwable th2) {
        ObjectHelper.requireNonNull(th2, "error is null");
        return new Notification<>(NotificationLite.error(th2));
    }

    @NonNull
    public static <T> Notification<T> createOnNext(@NonNull T t10) {
        ObjectHelper.requireNonNull(t10, "value is null");
        return new Notification<>(t10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return ObjectHelper.equals(this.f69861a, ((Notification) obj).f69861a);
        }
        return false;
    }

    @Nullable
    public Throwable getError() {
        Object obj = this.f69861a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        T t10 = (T) this.f69861a;
        if (t10 == null || NotificationLite.isError(t10)) {
            return null;
        }
        return t10;
    }

    public int hashCode() {
        Object obj = this.f69861a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean isOnComplete() {
        return this.f69861a == null;
    }

    public boolean isOnError() {
        return NotificationLite.isError(this.f69861a);
    }

    public boolean isOnNext() {
        Object obj = this.f69861a;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public String toString() {
        Object obj = this.f69861a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!NotificationLite.isError(obj)) {
            return j.b("OnNextNotification[", obj, Constant.BRACKET_CLOSE);
        }
        return "OnErrorNotification[" + NotificationLite.getError(obj) + Constant.BRACKET_CLOSE;
    }
}
