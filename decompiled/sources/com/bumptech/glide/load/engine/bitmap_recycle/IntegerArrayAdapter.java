package com.bumptech.glide.load.engine.bitmap_recycle;

import uc.a;

/* JADX INFO: loaded from: classes9.dex */
public final class IntegerArrayAdapter implements a<int[]> {
    @Override // uc.a
    public int getElementSizeInBytes() {
        return 4;
    }

    @Override // uc.a
    public String getTag() {
        return "IntegerArrayPool";
    }

    @Override // uc.a
    public int getArrayLength(int[] iArr) {
        return iArr.length;
    }

    @Override // uc.a
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
