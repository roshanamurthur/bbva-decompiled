package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class UPCAWriter implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EAN13Writer f49941a = new EAN13Writer();

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11) throws WriterException {
        return encode(str, barcodeFormat, i10, i11, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f49941a.encode("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
