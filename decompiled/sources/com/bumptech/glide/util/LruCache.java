package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class LruCache<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f38913a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38916d;

    public static final class a<Y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y f38917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f38918b;

        public a(Y y7, int i10) {
            this.f38917a = y7;
            this.f38918b = i10;
        }
    }

    public LruCache(long j10) {
        this.f38914b = j10;
        this.f38915c = j10;
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public synchronized boolean contains(@NonNull T t10) {
        return this.f38913a.containsKey(t10);
    }

    @Nullable
    public synchronized Y get(@NonNull T t10) {
        a aVar;
        aVar = (a) this.f38913a.get(t10);
        return aVar != null ? aVar.f38917a : null;
    }

    public synchronized int getCount() {
        return this.f38913a.size();
    }

    public synchronized long getCurrentSize() {
        return this.f38916d;
    }

    public synchronized long getMaxSize() {
        return this.f38915c;
    }

    public int getSize(@Nullable Y y7) {
        return 1;
    }

    @Nullable
    public synchronized Y put(@NonNull T t10, @Nullable Y y7) {
        int size = getSize(y7);
        long j10 = size;
        if (j10 >= this.f38915c) {
            onItemEvicted(t10, y7);
            return null;
        }
        if (y7 != null) {
            this.f38916d += j10;
        }
        a aVar = (a) this.f38913a.put(t10, y7 == null ? null : new a(y7, size));
        if (aVar != null) {
            this.f38916d -= (long) aVar.f38918b;
            if (!aVar.f38917a.equals(y7)) {
                onItemEvicted(t10, aVar.f38917a);
            }
        }
        trimToSize(this.f38915c);
        return aVar != null ? aVar.f38917a : null;
    }

    @Nullable
    public synchronized Y remove(@NonNull T t10) {
        a aVar = (a) this.f38913a.remove(t10);
        if (aVar == null) {
            return null;
        }
        this.f38916d -= (long) aVar.f38918b;
        return aVar.f38917a;
    }

    public synchronized void setSizeMultiplier(float f6) {
        try {
            if (f6 < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            long jRound = Math.round(this.f38914b * f6);
            this.f38915c = jRound;
            trimToSize(jRound);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void trimToSize(long j10) {
        while (this.f38916d > j10) {
            Iterator it = this.f38913a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f38916d -= (long) aVar.f38918b;
            Object key = entry.getKey();
            it.remove();
            onItemEvicted(key, aVar.f38917a);
        }
    }

    public void onItemEvicted(@NonNull T t10, @Nullable Y y7) {
    }
}
