package com.bbva.androidtoolkit.optional;

import androidx.annotation.RequiresApi;
import androidx.collection.h;
import com.bbva.androidtoolkit.optional.function.LongConsumer;
import com.bbva.androidtoolkit.optional.function.LongSupplier;
import com.bbva.androidtoolkit.optional.function.Supplier;
import java.util.NoSuchElementException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class OptionalLong {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final OptionalLong f26483c = new OptionalLong(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26485b;

    public OptionalLong(long j10, boolean z10) {
        this.f26484a = z10;
        this.f26485b = j10;
    }

    public static OptionalLong empty() {
        return f26483c;
    }

    public static OptionalLong of(long j10) {
        return new OptionalLong(j10, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OptionalLong) && isPresent() && this.f26485b == ((OptionalLong) obj).f26485b;
    }

    public long getAsLong() {
        if (isPresent()) {
            return this.f26485b;
        }
        throw new NoSuchElementException("No value present");
    }

    @RequiresApi(api = 24)
    public int hashCode() {
        if (!isPresent()) {
            return 0;
        }
        long j10 = this.f26485b;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public void ifPresent(LongConsumer longConsumer) {
        if (isPresent()) {
            longConsumer.accept(this.f26485b);
        }
    }

    public void ifPresentOrElse(LongConsumer longConsumer, Runnable runnable) {
        if (isPresent()) {
            longConsumer.accept(this.f26485b);
        } else {
            runnable.run();
        }
    }

    public boolean isPresent() {
        return this.f26484a;
    }

    public long orElse(long j10) {
        return isPresent() ? this.f26485b : j10;
    }

    public long orElseGet(LongSupplier longSupplier) {
        return isPresent() ? this.f26485b : longSupplier.get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> long orElseThrow(Supplier<? extends X> supplier) throws Throwable {
        if (isPresent()) {
            return this.f26485b;
        }
        throw supplier.get();
    }

    public String toString() {
        return isPresent() ? h.d(new StringBuilder("OptionalLong["), this.f26485b, Constant.BRACKET_CLOSE) : "OptionalLong.empty";
    }
}
