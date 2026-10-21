package com.google.zxing;

import com.bbva.cellswidgets.MaskTextWatcher;

/* JADX INFO: loaded from: classes10.dex */
public abstract class LuminanceSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49648b;

    public LuminanceSource(int i10, int i11) {
        this.f49647a = i10;
        this.f49648b = i11;
    }

    public LuminanceSource crop(int i10, int i11, int i12, int i13) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int getHeight() {
        return this.f49648b;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i10, byte[] bArr);

    public final int getWidth() {
        return this.f49647a;
    }

    public LuminanceSource invert() {
        return new InvertedLuminanceSource(this);
    }

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    public LuminanceSource rotateCounterClockwise() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public LuminanceSource rotateCounterClockwise45() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        char c10;
        int i10 = this.f49647a;
        byte[] row = new byte[i10];
        int i11 = this.f49648b;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            row = getRow(i12, row);
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = row[i13] & 255;
                if (i14 < 64) {
                    c10 = MaskTextWatcher.WILDCARD;
                } else if (i14 < 128) {
                    c10 = '+';
                } else {
                    c10 = i14 < 192 ? '.' : ' ';
                }
                sb2.append(c10);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
