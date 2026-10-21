package com.google.zxing;

import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface Writer {
    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11) throws WriterException;

    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException;
}
