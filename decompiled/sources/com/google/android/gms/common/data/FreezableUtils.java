package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.nulabinc.zxcvbn.matchers.DateMatcher;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        DateMatcher.d dVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            dVar.add(arrayList.get(i10).freeze());
        }
        return dVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        DateMatcher.d dVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            dVar.add(it.next().freeze());
        }
        return dVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        DateMatcher.d dVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e5 : eArr) {
            dVar.add(e5.freeze());
        }
        return dVar;
    }
}
