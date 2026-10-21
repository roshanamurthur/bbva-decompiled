package com.google.zxing.qrcode.encoder;

import androidx.fragment.app.a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

/* JADX INFO: loaded from: classes10.dex */
public final class QRCode {
    public static final int NUM_MASK_PATTERNS = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mode f50071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ErrorCorrectionLevel f50072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Version f50073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50074d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteMatrix f50075e;

    public static boolean isValidMaskPattern(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public ErrorCorrectionLevel getECLevel() {
        return this.f50072b;
    }

    public int getMaskPattern() {
        return this.f50074d;
    }

    public ByteMatrix getMatrix() {
        return this.f50075e;
    }

    public Mode getMode() {
        return this.f50071a;
    }

    public Version getVersion() {
        return this.f50073c;
    }

    public void setECLevel(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f50072b = errorCorrectionLevel;
    }

    public void setMaskPattern(int i10) {
        this.f50074d = i10;
    }

    public void setMatrix(ByteMatrix byteMatrix) {
        this.f50075e = byteMatrix;
    }

    public void setMode(Mode mode) {
        this.f50071a = mode;
    }

    public void setVersion(Version version) {
        this.f50073c = version;
    }

    public String toString() {
        StringBuilder sbA = a.a(200, "<<\n mode: ");
        sbA.append(this.f50071a);
        sbA.append("\n ecLevel: ");
        sbA.append(this.f50072b);
        sbA.append("\n version: ");
        sbA.append(this.f50073c);
        sbA.append("\n maskPattern: ");
        sbA.append(this.f50074d);
        if (this.f50075e == null) {
            sbA.append("\n matrix: null\n");
        } else {
            sbA.append("\n matrix:\n");
            sbA.append(this.f50075e);
        }
        sbA.append(">>\n");
        return sbA.toString();
    }
}
