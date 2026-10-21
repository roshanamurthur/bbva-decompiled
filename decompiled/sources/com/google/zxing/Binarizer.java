package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Binarizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LuminanceSource f49639a;

    public Binarizer(LuminanceSource luminanceSource) {
        this.f49639a = luminanceSource;
    }

    public abstract Binarizer createBinarizer(LuminanceSource luminanceSource);

    public abstract BitMatrix getBlackMatrix() throws NotFoundException;

    public abstract BitArray getBlackRow(int i10, BitArray bitArray) throws NotFoundException;

    public final int getHeight() {
        return this.f49639a.getHeight();
    }

    public final LuminanceSource getLuminanceSource() {
        return this.f49639a;
    }

    public final int getWidth() {
        return this.f49639a.getWidth();
    }
}
