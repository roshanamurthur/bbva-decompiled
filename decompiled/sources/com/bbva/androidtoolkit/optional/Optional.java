package com.bbva.androidtoolkit.optional;

import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.optional.function.Function;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.androidtoolkit.optional.function.Supplier;
import java.util.NoSuchElementException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class Optional<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Optional<?> f26475b = new Optional<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f26476a;

    public Optional(T t10) {
        this.f26476a = t10;
    }

    public static <T> Optional<T> empty() {
        return (Optional<T>) f26475b;
    }

    public static <T> Optional<T> of(T t10) {
        t10.getClass();
        return new Optional<>(t10);
    }

    public static <T> Optional<T> ofNullable(T t10) {
        return t10 != null ? new Optional<>(t10) : empty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Optional) && isPresent()) {
            return this.f26476a.equals(((Optional) obj).f26476a);
        }
        return false;
    }

    public Optional<T> filter(Predicate<? super T> predicate) {
        return (isPresent() && predicate.test(this.f26476a)) ? this : empty();
    }

    public <U> Optional<U> flatMap(Function<? super T, Optional<U>> function) {
        return isPresent() ? function.apply(this.f26476a) : empty();
    }

    public T get() {
        if (isPresent()) {
            return this.f26476a;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (isPresent()) {
            return this.f26476a.hashCode();
        }
        return 0;
    }

    public void ifPresent(Consumer<? super T> consumer) {
        if (isPresent()) {
            consumer.accept(this.f26476a);
        }
    }

    public void ifPresentOrElse(Consumer<? super T> consumer, Runnable runnable) {
        if (isPresent()) {
            consumer.accept(this.f26476a);
        } else {
            runnable.run();
        }
    }

    public boolean isPresent() {
        return this.f26476a != null;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        return isPresent() ? ofNullable(function.apply(this.f26476a)) : empty();
    }

    public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier) {
        if (isPresent()) {
            return this;
        }
        supplier.getClass();
        Optional<? extends T> optional = supplier.get();
        optional.getClass();
        return optional;
    }

    public T orElse(T t10) {
        return isPresent() ? this.f26476a : t10;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        return isPresent() ? this.f26476a : supplier.get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws Throwable {
        if (isPresent()) {
            return this.f26476a;
        }
        throw supplier.get();
    }

    public String toString() {
        if (!isPresent()) {
            return "Optional.empty";
        }
        return "Optional[" + this.f26476a.toString() + Constant.BRACKET_CLOSE;
    }
}
