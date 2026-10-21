package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class PriorityMapping {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray<Priority> f43891a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<Priority, Integer> f43892b;

    static {
        HashMap<Priority, Integer> map = new HashMap<>();
        f43892b = map;
        map.put(Priority.DEFAULT, 0);
        map.put(Priority.VERY_LOW, 1);
        map.put(Priority.HIGHEST, 2);
        for (Priority priority : map.keySet()) {
            f43891a.append(f43892b.get(priority).intValue(), priority);
        }
    }

    public static int toInt(@NonNull Priority priority) {
        Integer num = f43892b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    public static Priority valueOf(int i10) {
        Priority priority = f43891a.get(i10);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(g0.c("Unknown Priority for value ", i10));
    }
}
