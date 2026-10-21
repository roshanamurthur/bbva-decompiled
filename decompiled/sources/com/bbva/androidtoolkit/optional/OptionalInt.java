package com.bbva.androidtoolkit.optional;

import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.a;
import com.bbva.androidtoolkit.optional.function.IntConsumer;
import com.bbva.androidtoolkit.optional.function.IntSupplier;
import com.bbva.androidtoolkit.optional.function.Supplier;
import java.util.NoSuchElementException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class OptionalInt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final OptionalInt f26480c = new OptionalInt(false, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26482b;

    public OptionalInt(boolean z10, int i10) {
        this.f26481a = z10;
        this.f26482b = i10;
    }

    public static OptionalInt empty() {
        return f26480c;
    }

    public static OptionalInt of(int i10) {
        return new OptionalInt(true, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OptionalInt) && isPresent() && this.f26482b == ((OptionalInt) obj).f26482b;
    }

    public int getAsInt() {
        if (isPresent()) {
            return this.f26482b;
        }
        throw new NoSuchElementException("No value present");
    }

    @RequiresApi(api = 24)
    public int hashCode() {
        if (isPresent()) {
            return this.f26482b;
        }
        return 0;
    }

    public void ifPresent(IntConsumer intConsumer) {
        if (isPresent()) {
            intConsumer.accept(this.f26482b);
        }
    }

    public void ifPresentOrElse(IntConsumer intConsumer, Runnable runnable) {
        if (isPresent()) {
            intConsumer.accept(this.f26482b);
        } else {
            runnable.run();
        }
    }

    public boolean isPresent() {
        return this.f26481a;
    }

    public int orElse(int i10) {
        return isPresent() ? this.f26482b : i10;
    }

    public int orElseGet(IntSupplier intSupplier) {
        return isPresent() ? this.f26482b : intSupplier.get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> int orElseThrow(Supplier<? extends X> supplier) throws Throwable {
        if (isPresent()) {
            return this.f26482b;
        }
        throw supplier.get();
    }

    public String toString() {
        return isPresent() ? a.c(new StringBuilder("OptionalInt["), this.f26482b, Constant.BRACKET_CLOSE) : "OptionalInt.empty";
    }
}
