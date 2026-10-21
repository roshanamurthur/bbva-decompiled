package io.reactivex.schedulers;

import androidx.camera.core.impl.a;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public final class Timed<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f78608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f78610c;

    public Timed(@NonNull T t10, long j10, @NonNull TimeUnit timeUnit) {
        this.f78608a = t10;
        this.f78609b = j10;
        this.f78610c = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Timed)) {
            return false;
        }
        Timed timed = (Timed) obj;
        return ObjectHelper.equals(this.f78608a, timed.f78608a) && this.f78609b == timed.f78609b && ObjectHelper.equals(this.f78610c, timed.f78610c);
    }

    public int hashCode() {
        T t10 = this.f78608a;
        int iHashCode = t10 != null ? t10.hashCode() : 0;
        long j10 = this.f78609b;
        return this.f78610c.hashCode() + (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31);
    }

    public long time() {
        return this.f78609b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Timed[time=");
        sb2.append(this.f78609b);
        sb2.append(", unit=");
        sb2.append(this.f78610c);
        sb2.append(", value=");
        return a.e(sb2, this.f78608a, Constant.BRACKET_CLOSE);
    }

    @NonNull
    public TimeUnit unit() {
        return this.f78610c;
    }

    @NonNull
    public T value() {
        return this.f78608a;
    }

    public long time(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.f78609b, this.f78610c);
    }
}
