package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class UPCAReader extends UPCEANReader {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EAN13Reader f49940i = new EAN13Reader();

    public static Result h(Result result) throws FormatException {
        String text = result.getText();
        if (text.charAt(0) != '0') {
            throw FormatException.getFormatInstance();
        }
        Result result2 = new Result(text.substring(1), null, result.getResultPoints(), BarcodeFormat.UPC_A);
        if (result.getResultMetadata() != null) {
            result2.putAllMetadata(result.getResultMetadata());
        }
        return result2;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return h(this.f49940i.decode(binaryBitmap));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        return this.f49940i.decodeMiddle(bitArray, iArr, sb2);
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public Result decodeRow(int i10, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return h(this.f49940i.decodeRow(i10, bitArray, iArr, map));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public final BarcodeFormat f() {
        return BarcodeFormat.UPC_A;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return h(this.f49940i.decode(binaryBitmap, map));
    }

    @Override // com.google.zxing.oned.UPCEANReader, com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return h(this.f49940i.decodeRow(i10, bitArray, map));
    }
}
