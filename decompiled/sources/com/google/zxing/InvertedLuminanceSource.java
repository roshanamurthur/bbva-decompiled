package com.google.zxing;

/* JADX INFO: loaded from: classes10.dex */
public final class InvertedLuminanceSource extends LuminanceSource {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LuminanceSource f49646c;

    public InvertedLuminanceSource(LuminanceSource luminanceSource) {
        super(luminanceSource.getWidth(), luminanceSource.getHeight());
        this.f49646c = luminanceSource;
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i10, int i11, int i12, int i13) {
        return new InvertedLuminanceSource(this.f49646c.crop(i10, i11, i12, i13));
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        byte[] matrix = this.f49646c.getMatrix();
        int height = getHeight() * getWidth();
        byte[] bArr = new byte[height];
        for (int i10 = 0; i10 < height; i10++) {
            bArr[i10] = (byte) (255 - (matrix[i10] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i10, byte[] bArr) {
        byte[] row = this.f49646c.getRow(i10, bArr);
        int width = getWidth();
        for (int i11 = 0; i11 < width; i11++) {
            row[i11] = (byte) (255 - (row[i11] & 255));
        }
        return row;
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource invert() {
        return this.f49646c;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return this.f49646c.isCropSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isRotateSupported() {
        return this.f49646c.isRotateSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise() {
        return new InvertedLuminanceSource(this.f49646c.rotateCounterClockwise());
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise45() {
        return new InvertedLuminanceSource(this.f49646c.rotateCounterClockwise45());
    }
}
