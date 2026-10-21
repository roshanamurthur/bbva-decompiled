package io.reactivex.rxjava3.schedulers;

import androidx.camera.core.impl.a;
import io.reactivex.rxjava3.annotations.NonNull;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public final class Timed<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f78364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f78366c;

    public Timed(@NonNull T t10, long j10, @NonNull TimeUnit timeUnit) {
        Objects.requireNonNull(t10, "value is null");
        this.f78364a = t10;
        this.f78365b = j10;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.f78366c = timeUnit;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Timed)) {
            return false;
        }
        Timed timed = (Timed) obj;
        return Objects.equals(this.f78364a, timed.f78364a) && this.f78365b == timed.f78365b && Objects.equals(this.f78366c, timed.f78366c);
    }

    public int hashCode() {
        int iHashCode = this.f78364a.hashCode() * 31;
        long j10 = this.f78365b;
        return this.f78366c.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 31)))) * 31);
    }

    public long time() {
        return this.f78365b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Timed[time=");
        sb2.append(this.f78365b);
        sb2.append(", unit=");
        sb2.append(this.f78366c);
        sb2.append(", value=");
        return a.e(sb2, this.f78364a, Constant.BRACKET_CLOSE);
    }

    @NonNull
    public TimeUnit unit() {
        return this.f78366c;
    }

    @NonNull
    public T value() {
        return this.f78364a;
    }

    public long time(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.f78365b, this.f78366c);
    }
}
