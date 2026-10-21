package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class EAN8Writer extends UPCEANWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.encode(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + UPCEANReader.g(str);
            } catch (FormatException e5) {
                throw new IllegalArgumentException(e5);
            }
        } else if (length == 8) {
            try {
                if (!UPCEANReader.b(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, UPCEANReader.f49942d, true);
        for (int i10 = 0; i10 <= 3; i10++) {
            iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, UPCEANReader.f49945g[Character.digit(str.charAt(i10), 10)], false);
        }
        int iAppendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, UPCEANReader.f49943e, false) + iAppendPattern;
        for (int i11 = 4; i11 <= 7; i11++) {
            iAppendPattern2 += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, UPCEANReader.f49945g[Character.digit(str.charAt(i11), 10)], true);
        }
        OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, UPCEANReader.f49942d, true);
        return zArr;
    }
}
