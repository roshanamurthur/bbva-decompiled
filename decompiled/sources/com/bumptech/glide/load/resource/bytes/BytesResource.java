package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public class BytesResource implements Resource<byte[]> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f38623p0;

    public BytesResource(byte[] bArr) {
        this.f38623p0 = (byte[]) Preconditions.checkNotNull(bArr);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class<byte[]> getResourceClass() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.f38623p0.length;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public byte[] get() {
        return this.f38623p0;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
    }
}
