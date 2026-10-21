package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public final class UnitTransformation<T> implements Transformation<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UnitTransformation f38530a = new UnitTransformation();

    @NonNull
    public static <T> UnitTransformation<T> get() {
        return f38530a;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource<T> transform(@NonNull Context context, @NonNull Resource<T> resource, int i10, int i11) {
        return resource;
    }
}
