package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class SorterFunction<T> implements Function<List<T>, List<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Comparator<? super T> f78093p0;

    public SorterFunction(Comparator<? super T> comparator) {
        this.f78093p0 = comparator;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public List<T> apply(List<T> list) {
        Collections.sort(list, this.f78093p0);
        return list;
    }
}
