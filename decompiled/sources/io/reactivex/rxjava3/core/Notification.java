package io.reactivex.rxjava3.core;

import androidx.collection.j;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public final class Notification<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Notification<Object> f73942b = new Notification<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f73943a;

    public Notification(@Nullable Object obj) {
        this.f73943a = obj;
    }

    @NonNull
    public static <T> Notification<T> createOnComplete() {
        return (Notification<T>) f73942b;
    }

    @NonNull
    public static <T> Notification<T> createOnError(@NonNull Throwable th2) {
        Objects.requireNonNull(th2, "error is null");
        return new Notification<>(NotificationLite.error(th2));
    }

    @NonNull
    public static <T> Notification<T> createOnNext(T t10) {
        Objects.requireNonNull(t10, "value is null");
        return new Notification<>(t10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return Objects.equals(this.f73943a, ((Notification) obj).f73943a);
        }
        return false;
    }

    @Nullable
    public Throwable getError() {
        Object obj = this.f73943a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        T t10 = (T) this.f73943a;
        if (t10 == null || NotificationLite.isError(t10)) {
            return null;
        }
        return t10;
    }

    public int hashCode() {
        Object obj = this.f73943a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean isOnComplete() {
        return this.f73943a == null;
    }

    public boolean isOnError() {
        return NotificationLite.isError(this.f73943a);
    }

    public boolean isOnNext() {
        Object obj = this.f73943a;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public String toString() {
        Object obj = this.f73943a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!NotificationLite.isError(obj)) {
            return j.b("OnNextNotification[", obj, Constant.BRACKET_CLOSE);
        }
        return "OnErrorNotification[" + NotificationLite.getError(obj) + Constant.BRACKET_CLOSE;
    }
}
