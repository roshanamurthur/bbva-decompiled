package com.jakewharton.rxrelay3;

import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: classes10.dex */
public final class AppendOnlyLinkedArrayList<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f50719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f50720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50721c;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        boolean test(T t10);
    }

    public AppendOnlyLinkedArrayList() {
        Object[] objArr = new Object[5];
        this.f50719a = objArr;
        this.f50720b = objArr;
    }

    public final void a(T t10) {
        int i10 = this.f50721c;
        if (i10 == 4) {
            Object[] objArr = new Object[5];
            this.f50720b[4] = objArr;
            this.f50720b = objArr;
            i10 = 0;
        }
        this.f50720b[i10] = t10;
        this.f50721c = i10 + 1;
    }
}
