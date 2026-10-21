package eh;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;
import java.util.EnumMap;

/* JADX INFO: compiled from: UPCEANExtensionSupport.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f68357c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f68358a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f68359b = new c();

    public final Result a(int i10, int i11, BitArray bitArray) throws NotFoundException {
        EnumMap enumMap;
        int[] iArrD = UPCEANReader.d(bitArray, i11, false, f68357c, new int[3]);
        try {
            return this.f68359b.a(bitArray, i10, iArrD);
        } catch (ReaderException unused) {
            b bVar = this.f68358a;
            StringBuilder sb2 = bVar.f68353b;
            sb2.setLength(0);
            int[] iArr = bVar.f68352a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int size = bitArray.getSize();
            int nextUnset = iArrD[1];
            int i12 = 0;
            for (int i13 = 0; i13 < 2 && nextUnset < size; i13++) {
                int iC = UPCEANReader.c(bitArray, iArr, nextUnset, UPCEANReader.f49946h);
                sb2.append((char) ((iC % 10) + 48));
                for (int i14 : iArr) {
                    nextUnset += i14;
                }
                if (iC >= 10) {
                    i12 |= 1 << (1 - i13);
                }
                if (i13 != 1) {
                    nextUnset = bitArray.getNextUnset(bitArray.getNextSet(nextUnset));
                }
            }
            if (sb2.length() != 2) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (Integer.parseInt(sb2.toString()) % 4 != i12) {
                throw NotFoundException.getNotFoundInstance();
            }
            String string = sb2.toString();
            if (string.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(ResultMetadataType.class);
                enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(string));
            }
            float f6 = i10;
            Result result = new Result(string, null, new ResultPoint[]{new ResultPoint((iArrD[0] + iArrD[1]) / 2.0f, f6), new ResultPoint(nextUnset, f6)}, BarcodeFormat.UPC_EAN_EXTENSION);
            if (enumMap != null) {
                result.putAllMetadata(enumMap);
            }
            return result;
        }
    }
}
