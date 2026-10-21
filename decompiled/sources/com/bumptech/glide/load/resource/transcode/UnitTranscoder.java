package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes9.dex */
public class UnitTranscoder<Z> implements ResourceTranscoder<Z, Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UnitTranscoder<?> f38693a = new UnitTranscoder<>();

    public static <Z> ResourceTranscoder<Z, Z> get() {
        return f38693a;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource<Z> transcode(@NonNull Resource<Z> resource, @NonNull Options options) {
        return resource;
    }
}
