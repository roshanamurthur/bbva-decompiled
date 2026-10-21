package com.google.zxing;

import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanarYUVLuminanceSource extends LuminanceSource {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f49653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49657g;

    public PlanarYUVLuminanceSource(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f49653c = bArr;
        this.f49654d = i10;
        this.f49655e = i11;
        this.f49656f = i12;
        this.f49657g = i13;
        if (z10) {
            int i16 = (i13 * i10) + i12;
            int i17 = 0;
            while (i17 < i15) {
                int i18 = (i14 / 2) + i16;
                int i19 = (i16 + i14) - 1;
                int i20 = i16;
                while (i20 < i18) {
                    byte[] bArr2 = this.f49653c;
                    byte b10 = bArr2[i20];
                    bArr2[i20] = bArr2[i19];
                    bArr2[i19] = b10;
                    i20++;
                    i19--;
                }
                i17++;
                i16 += i10;
            }
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i10, int i11, int i12, int i13) {
        return new PlanarYUVLuminanceSource(this.f49653c, this.f49654d, this.f49655e, this.f49656f + i10, this.f49657g + i11, i12, i13, false);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        byte[] bArr = this.f49653c;
        int i10 = this.f49654d;
        if (width == i10 && height == this.f49655e) {
            return bArr;
        }
        int i11 = width * height;
        byte[] bArr2 = new byte[i11];
        int i12 = (this.f49657g * i10) + this.f49656f;
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
        System.arraycopy(this.f49653c, ((i10 + this.f49657g) * this.f49654d) + this.f49656f, bArr, 0, width);
        return bArr;
    }

    public int getThumbnailHeight() {
        return getHeight() / 2;
    }

    public int getThumbnailWidth() {
        return getWidth() / 2;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    public int[] renderThumbnail() {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int[] iArr = new int[width * height];
        int i10 = this.f49657g;
        int i11 = this.f49654d;
        int i12 = (i10 * i11) + this.f49656f;
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = i13 * width;
            for (int i15 = 0; i15 < width; i15++) {
                iArr[i14 + i15] = ((this.f49653c[(i15 << 1) + i12] & 255) * 65793) | ViewCompat.MEASURED_STATE_MASK;
            }
            i12 += i11 << 1;
        }
        return iArr;
    }
}
