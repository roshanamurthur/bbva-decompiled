package com.google.zxing;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class RGBLuminanceSource extends LuminanceSource {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f49658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49662g;

    public RGBLuminanceSource(int i10, int i11, int[] iArr) {
        super(i10, i11);
        this.f49659d = i10;
        this.f49660e = i11;
        this.f49661f = 0;
        this.f49662g = 0;
        int i12 = i10 * i11;
        this.f49658c = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            this.f49658c[i13] = (byte) (((((i14 >> 16) & 255) + ((i14 >> 7) & TypedValues.PositionType.TYPE_POSITION_TYPE)) + (i14 & 255)) / 4);
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i10, int i11, int i12, int i13) {
        return new RGBLuminanceSource(this.f49658c, this.f49659d, this.f49660e, this.f49661f + i10, this.f49662g + i11, i12, i13);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        byte[] bArr = this.f49658c;
        int i10 = this.f49659d;
        if (width == i10 && height == this.f49660e) {
            return bArr;
        }
        int i11 = width * height;
        byte[] bArr2 = new byte[i11];
        int i12 = (this.f49662g * i10) + this.f49661f;
        if (width == i10) {
            System.arraycopy(bArr, i12, bArr2, 0, i11);
            return bArr2;
        }
        for (int i13 = 0; i13 < height; i13++) {
            System.arraycopy(bArr, i12, bArr2, i13 * width, width);
            i12 += i10;
        }
        return bArr2;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= getHeight()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i10)));
        }
        int width = getWidth();
        if (bArr == null || bArr.length < width) {
            bArr = new byte[width];
        }
        System.arraycopy(this.f49658c, ((i10 + this.f49662g) * this.f49659d) + this.f49661f, bArr, 0, width);
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    public RGBLuminanceSource(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i14, i15);
        if (i14 + i12 <= i10 && i15 + i13 <= i11) {
            this.f49658c = bArr;
            this.f49659d = i10;
            this.f49660e = i11;
            this.f49661f = i12;
            this.f49662g = i13;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
}
