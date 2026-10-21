package androidx.core.util;

import android.annotation.SuppressLint;
import androidx.core.content.r;
import java.util.Objects;

/* JADX INFO: compiled from: Predicate.java */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i {
    @SuppressLint({"MissingNullability"})
    public static Predicate a(final Predicate predicate, @SuppressLint({"MissingNullability"}) final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: androidx.core.util.g
            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate3) {
                return i.a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate negate() {
                return i.b(this);
            }

            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate3) {
                return i.c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return i.d(predicate, predicate2, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    public static Predicate b(final Predicate predicate) {
        return new Predicate() { // from class: androidx.core.util.h
            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return i.a(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate negate() {
                return i.b(this);
            }

            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return i.c(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return i.e(predicate, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    public static Predicate c(final Predicate predicate, @SuppressLint({"MissingNullability"}) final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: androidx.core.util.e
            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate3) {
                return i.a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate negate() {
                return i.b(this);
            }

            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate3) {
                return i.c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return i.f(predicate, predicate2, obj);
            }
        };
    }

    public static /* synthetic */ boolean d(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    public static /* synthetic */ boolean e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    public static /* synthetic */ boolean f(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) || predicate2.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    public static <T> Predicate<T> g(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new r(1) : new Predicate() { // from class: androidx.core.util.f
            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return i.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate negate() {
                return i.b(this);
            }

            @Override // androidx.core.util.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return i.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    public static /* synthetic */ boolean h(Object obj) {
        return obj == null;
    }

    @SuppressLint({"MissingNullability"})
    public static <T> Predicate<T> j(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }
}
