package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class MultiFormatUPCEANReader extends OneDReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UPCEANReader[] f49939a;

    public MultiFormatUPCEANReader(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new EAN13Reader());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new UPCAReader());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new EAN8Reader());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new UPCEReader());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new EAN13Reader());
            arrayList.add(new EAN8Reader());
            arrayList.add(new UPCEReader());
        }
        this.f49939a = (UPCEANReader[]) arrayList.toArray(new UPCEANReader[arrayList.size()]);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        int[] iArrE = UPCEANReader.e(bitArray);
        for (UPCEANReader uPCEANReader : this.f49939a) {
            try {
                Result resultDecodeRow = uPCEANReader.decodeRow(i10, bitArray, iArrE, map);
                boolean z10 = resultDecodeRow.getBarcodeFormat() == BarcodeFormat.EAN_13 && resultDecodeRow.getText().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                boolean z11 = collection == null || collection.contains(BarcodeFormat.UPC_A);
                if (!z10 || !z11) {
                    return resultDecodeRow;
                }
                Result result = new Result(resultDecodeRow.getText().substring(1), resultDecodeRow.getRawBytes(), resultDecodeRow.getResultPoints(), BarcodeFormat.UPC_A);
                result.putAllMetadata(resultDecodeRow.getResultMetadata());
                return result;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        for (UPCEANReader uPCEANReader : this.f49939a) {
            uPCEANReader.reset();
        }
    }
}
