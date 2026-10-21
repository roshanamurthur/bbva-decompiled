package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class SorterFunction<T> implements Function<List<T>, List<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Comparator<? super T> f73802p0;

    public SorterFunction(Comparator<? super T> comparator) {
        this.f73802p0 = comparator;
    }

    @Override // io.reactivex.functions.Function
    public List<T> apply(List<T> list) throws Exception {
        Collections.sort(list, this.f73802p0);
        return list;
    }
}
