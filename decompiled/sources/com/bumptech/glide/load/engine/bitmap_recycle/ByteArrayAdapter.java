package com.bumptech.glide.load.engine.bitmap_recycle;

import uc.a;

/* JADX INFO: loaded from: classes9.dex */
public final class ByteArrayAdapter implements a<byte[]> {
    @Override // uc.a
    public int getElementSizeInBytes() {
        return 1;
    }

    @Override // uc.a
    public String getTag() {
        return "ByteArrayPool";
    }

    @Override // uc.a
    public int getArrayLength(byte[] bArr) {
        return bArr.length;
    }

    @Override // uc.a
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
