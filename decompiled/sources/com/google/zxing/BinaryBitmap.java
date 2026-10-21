package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes10.dex */
public final class BinaryBitmap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Binarizer f49640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BitMatrix f49641b;

    public BinaryBitmap(Binarizer binarizer) {
        if (binarizer == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f49640a = binarizer;
    }

    public BinaryBitmap crop(int i10, int i11, int i12, int i13) {
        Binarizer binarizer = this.f49640a;
        return new BinaryBitmap(binarizer.createBinarizer(binarizer.getLuminanceSource().crop(i10, i11, i12, i13)));
    }

    public BitMatrix getBlackMatrix() throws NotFoundException {
        if (this.f49641b == null) {
            this.f49641b = this.f49640a.getBlackMatrix();
        }
        return this.f49641b;
    }

    public BitArray getBlackRow(int i10, BitArray bitArray) throws NotFoundException {
        return this.f49640a.getBlackRow(i10, bitArray);
    }

    public int getHeight() {
        return this.f49640a.getHeight();
    }

    public int getWidth() {
        return this.f49640a.getWidth();
    }

    public boolean isCropSupported() {
        return this.f49640a.getLuminanceSource().isCropSupported();
    }

    public boolean isRotateSupported() {
        return this.f49640a.getLuminanceSource().isRotateSupported();
    }

    public BinaryBitmap rotateCounterClockwise() {
        Binarizer binarizer = this.f49640a;
        return new BinaryBitmap(binarizer.createBinarizer(binarizer.getLuminanceSource().rotateCounterClockwise()));
    }

    public BinaryBitmap rotateCounterClockwise45() {
        Binarizer binarizer = this.f49640a;
        return new BinaryBitmap(binarizer.createBinarizer(binarizer.getLuminanceSource().rotateCounterClockwise45()));
    }

    public String toString() {
        try {
            return getBlackMatrix().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
