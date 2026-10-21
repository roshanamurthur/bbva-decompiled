package com.google.zxing.qrcode.decoder;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes10.dex */
public final class QRCodeDecoderMetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50029a = true;

    public void applyMirroredCorrection(ResultPoint[] resultPointArr) {
        if (!this.f50029a || resultPointArr == null || resultPointArr.length < 3) {
            return;
        }
        ResultPoint resultPoint = resultPointArr[0];
        resultPointArr[0] = resultPointArr[2];
        resultPointArr[2] = resultPoint;
    }

    public boolean isMirrored() {
        return this.f50029a;
    }
}
