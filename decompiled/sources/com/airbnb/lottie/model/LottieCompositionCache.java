package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class LottieCompositionCache {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LottieCompositionCache f25961b = new LottieCompositionCache();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache<String, LottieComposition> f25962a = new LruCache<>(20);

    @VisibleForTesting
    public LottieCompositionCache() {
    }

    public static LottieCompositionCache getInstance() {
        return f25961b;
    }

    public void clear() {
        this.f25962a.evictAll();
    }

    @Nullable
    public LottieComposition get(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f25962a.get(str);
    }

    public void put(@Nullable String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.f25962a.put(str, lottieComposition);
    }

    public void resize(int i10) {
        this.f25962a.resize(i10);
    }
}
