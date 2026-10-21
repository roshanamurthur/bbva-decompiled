package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.ListPreloader;

/* JADX INFO: loaded from: classes9.dex */
public class FixedPreloadSizeProvider<T> implements ListPreloader.PreloadSizeProvider<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f38909a;

    public FixedPreloadSizeProvider(int i10, int i11) {
        this.f38909a = new int[]{i10, i11};
    }

    @Override // com.bumptech.glide.ListPreloader.PreloadSizeProvider
    @Nullable
    public int[] getPreloadSize(@NonNull T t10, int i10, int i11) {
        return this.f38909a;
    }
}
