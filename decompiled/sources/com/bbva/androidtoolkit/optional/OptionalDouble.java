package com.bbva.androidtoolkit.optional;

import androidx.annotation.RequiresApi;
import com.bbva.androidtoolkit.optional.function.DoubleConsumer;
import com.bbva.androidtoolkit.optional.function.DoubleSupplier;
import com.bbva.androidtoolkit.optional.function.Supplier;
import java.util.NoSuchElementException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class OptionalDouble {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final OptionalDouble f26477c = new OptionalDouble(0.0d, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f26479b;

    public OptionalDouble(double d2, boolean z10) {
        this.f26478a = z10;
        this.f26479b = d2;
    }

    public static OptionalDouble empty() {
        return f26477c;
    }

    public static OptionalDouble of(double d2) {
        return new OptionalDouble(d2, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OptionalDouble) && isPresent() && this.f26479b == ((OptionalDouble) obj).f26479b;
    }

    public double getAsDouble() {
        if (isPresent()) {
            return this.f26479b;
        }
        throw new NoSuchElementException("No value present");
    }

    @RequiresApi(api = 24)
    public int hashCode() {
        if (!isPresent()) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f26479b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public void ifPresent(DoubleConsumer doubleConsumer) {
        if (isPresent()) {
            doubleConsumer.accept(this.f26479b);
        }
    }

    public void ifPresentOrElse(DoubleConsumer doubleConsumer, Runnable runnable) {
        if (isPresent()) {
            doubleConsumer.accept(this.f26479b);
        } else {
            runnable.run();
        }
    }

    public boolean isPresent() {
        return this.f26478a;
    }

    public double orElse(double d2) {
        return isPresent() ? this.f26479b : d2;
    }

    public double orElseGet(DoubleSupplier doubleSupplier) {
        return isPresent() ? this.f26479b : doubleSupplier.get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> double orElseThrow(Supplier<? extends X> supplier) throws Throwable {
        if (isPresent()) {
            return this.f26479b;
        }
        throw supplier.get();
    }

    public String toString() {
        if (!isPresent()) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.f26479b + Constant.BRACKET_CLOSE;
    }
}
