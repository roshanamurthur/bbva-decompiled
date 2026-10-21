package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class DaggerCollections {
    public static boolean hasDuplicates(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new HashSet(list).size();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i10) {
        int i11;
        if (i10 < 3) {
            i11 = i10 + 1;
        } else {
            i11 = i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new LinkedHashMap<>(i11);
    }

    public static <T> List<T> presizedList(int i10) {
        return i10 == 0 ? Collections.emptyList() : new ArrayList(i10);
    }
}
