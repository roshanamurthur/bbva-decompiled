package com.google.zxing.oned;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.component_devicemanager.data.datasource.BlackBoxDataSource;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.google.zxing.common.BitArray;
import com.mastercard.sonic.StatusCode;
import com.salesforce.marketingcloud.analytics.b;
import com.vierge.bluetoothlibrary.BluetoothState;
import eh.a;
import eh.d;
import java.util.Arrays;
import java.util.Map;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: loaded from: classes10.dex */
public abstract class UPCEANReader extends OneDReader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f49942d = {1, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f49943e = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f49944f = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f49945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f49946h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f49947a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f49948b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f49949c = new a();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f49945g = iArr;
        int[][] iArr2 = new int[20][];
        f49946h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f49945g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f49946h[i10] = iArr4;
        }
    }

    public static boolean b(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return g(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    public static int c(BitArray bitArray, int[] iArr, int i10, int[][] iArr2) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i10, iArr);
        int length = iArr2.length;
        float f6 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i12], 0.7f);
            if (fPatternMatchVariance < f6) {
                i11 = i12;
                f6 = fPatternMatchVariance;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] d(BitArray bitArray, int i10, boolean z10, int[] iArr, int[] iArr2) throws NotFoundException {
        int size = bitArray.getSize();
        int nextUnset = z10 ? bitArray.getNextUnset(i10) : bitArray.getNextSet(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = nextUnset;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, nextUnset};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            nextUnset++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] e(BitArray bitArray) throws NotFoundException {
        int[] iArr = new int[3];
        int[] iArrD = null;
        boolean zIsRange = false;
        int i10 = 0;
        while (!zIsRange) {
            Arrays.fill(iArr, 0, 3, 0);
            iArrD = d(bitArray, i10, false, f49942d, iArr);
            int i11 = iArrD[0];
            int i12 = iArrD[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                zIsRange = bitArray.isRange(i13, i11, false);
            }
            i10 = i12;
        }
        return iArrD;
    }

    public static int g(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int iCharAt = charSequence.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i10 += iCharAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int iCharAt2 = charSequence.charAt(i13) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i12 += iCharAt2;
        }
        return (1000 - i12) % 10;
    }

    public boolean checkChecksum(String str) throws FormatException {
        return b(str);
    }

    public int[] decodeEnd(BitArray bitArray, int i10) throws NotFoundException {
        return d(bitArray, i10, false, f49942d, new int[3]);
    }

    public abstract int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException;

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return decodeRow(i10, bitArray, e(bitArray), map);
    }

    public abstract BarcodeFormat f();

    public Result decodeRow(int i10, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String str = null;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f49947a;
        sb2.setLength(0);
        int iDecodeMiddle = decodeMiddle(bitArray, iArr, sb2);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint(iDecodeMiddle, i10));
        }
        int[] iArrDecodeEnd = decodeEnd(bitArray, iDecodeMiddle);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArrDecodeEnd[0] + iArrDecodeEnd[1]) / 2.0f, i10));
        }
        int i11 = iArrDecodeEnd[1];
        int i12 = (i11 - iArrDecodeEnd[0]) + i11;
        if (i12 >= bitArray.getSize() || !bitArray.isRange(i11, i12, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!checkChecksum(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f6 = (iArr[1] + iArr[0]) / 2.0f;
        float f10 = (iArrDecodeEnd[1] + iArrDecodeEnd[0]) / 2.0f;
        BarcodeFormat barcodeFormatF = f();
        float f11 = i10;
        Result result = new Result(string, null, new ResultPoint[]{new ResultPoint(f6, f11), new ResultPoint(f10, f11)}, barcodeFormatF);
        try {
            Result resultA = this.f49948b.a(i10, iArrDecodeEnd[1], bitArray);
            result.putMetadata(ResultMetadataType.UPC_EAN_EXTENSION, resultA.getText());
            result.putAllMetadata(resultA.getResultMetadata());
            result.addResultPoints(resultA.getResultPoints());
            length = resultA.getText().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS);
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (length == iArr2[i13]) {
                    break;
                }
                i13++;
            }
        }
        if (barcodeFormatF == BarcodeFormat.EAN_13 || barcodeFormatF == BarcodeFormat.UPC_A) {
            a aVar = this.f49949c;
            synchronized (aVar) {
                if (aVar.f68350a.isEmpty()) {
                    aVar.a("US/CA", new int[]{0, 19});
                    aVar.a("US", new int[]{30, 39});
                    aVar.a("US/CA", new int[]{60, 139});
                    aVar.a("FR", new int[]{300, 379});
                    aVar.a("BG", new int[]{380});
                    aVar.a("SI", new int[]{383});
                    aVar.a("HR", new int[]{BluetoothState.REQUEST_ENABLE_BT});
                    aVar.a("BA", new int[]{387});
                    aVar.a("DE", new int[]{400, 440});
                    aVar.a("JP", new int[]{450, 459});
                    aVar.a("RU", new int[]{460, 469});
                    aVar.a("TW", new int[]{471});
                    aVar.a("EE", new int[]{474});
                    aVar.a("LV", new int[]{475});
                    aVar.a("AZ", new int[]{476});
                    aVar.a("LT", new int[]{477});
                    aVar.a("UZ", new int[]{478});
                    aVar.a("LK", new int[]{479});
                    aVar.a("PH", new int[]{480});
                    aVar.a("BY", new int[]{481});
                    aVar.a("UA", new int[]{482});
                    aVar.a("MD", new int[]{484});
                    aVar.a("AM", new int[]{485});
                    aVar.a("GE", new int[]{486});
                    aVar.a("KZ", new int[]{487});
                    aVar.a("HK", new int[]{489});
                    aVar.a("JP", new int[]{490, 499});
                    aVar.a(BlackBoxDataSource.GIGA_BYTE, new int[]{500, 509});
                    aVar.a("GR", new int[]{520});
                    aVar.a(ExpandedProductParsedResult.POUND, new int[]{528});
                    aVar.a("CY", new int[]{529});
                    aVar.a("MK", new int[]{531});
                    aVar.a("MT", new int[]{535});
                    aVar.a("IE", new int[]{539});
                    aVar.a("BE/LU", new int[]{540, 549});
                    aVar.a("PT", new int[]{560});
                    aVar.a("IS", new int[]{569});
                    aVar.a("DK", new int[]{570, 579});
                    aVar.a("PL", new int[]{590});
                    aVar.a("RO", new int[]{594});
                    aVar.a("HU", new int[]{599});
                    aVar.a("ZA", new int[]{600, 601});
                    aVar.a("GH", new int[]{TypedValues.MotionType.TYPE_EASING});
                    aVar.a("BH", new int[]{TypedValues.MotionType.TYPE_DRAW_PATH});
                    aVar.a("MU", new int[]{TypedValues.MotionType.TYPE_POLAR_RELATIVETO});
                    aVar.a("MA", new int[]{TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE});
                    aVar.a("DZ", new int[]{613});
                    aVar.a("KE", new int[]{616});
                    aVar.a("CI", new int[]{618});
                    aVar.a("TN", new int[]{619});
                    aVar.a("SY", new int[]{621});
                    aVar.a("EG", new int[]{622});
                    aVar.a("LY", new int[]{624});
                    aVar.a("JO", new int[]{625});
                    aVar.a("IR", new int[]{626});
                    aVar.a("KW", new int[]{627});
                    aVar.a("SA", new int[]{628});
                    aVar.a("AE", new int[]{629});
                    aVar.a("FI", new int[]{640, 649});
                    aVar.a(LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS, new int[]{690, 695});
                    aVar.a("NO", new int[]{700, 709});
                    aVar.a("IL", new int[]{729});
                    aVar.a("SE", new int[]{730, 739});
                    aVar.a("GT", new int[]{740});
                    aVar.a("SV", new int[]{741});
                    aVar.a("HN", new int[]{742});
                    aVar.a("NI", new int[]{743});
                    aVar.a("CR", new int[]{744});
                    aVar.a(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PA, new int[]{745});
                    aVar.a("DO", new int[]{746});
                    aVar.a("MX", new int[]{750});
                    aVar.a("CA", new int[]{754, 755});
                    aVar.a("VE", new int[]{759});
                    aVar.a("CH", new int[]{760, 769});
                    aVar.a("CO", new int[]{770});
                    aVar.a("UY", new int[]{773});
                    aVar.a(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PE, new int[]{775});
                    aVar.a("BO", new int[]{777});
                    aVar.a("AR", new int[]{779});
                    aVar.a("CL", new int[]{780});
                    aVar.a("PY", new int[]{784});
                    aVar.a(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PE, new int[]{785});
                    aVar.a(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, new int[]{786});
                    aVar.a("BR", new int[]{789, 790});
                    aVar.a("IT", new int[]{StatusCode.SUCCESS, 839});
                    aVar.a("ES", new int[]{840, 849});
                    aVar.a("CU", new int[]{850});
                    aVar.a("SK", new int[]{858});
                    aVar.a("CZ", new int[]{859});
                    aVar.a("YU", new int[]{860});
                    aVar.a("MN", new int[]{865});
                    aVar.a("KP", new int[]{867});
                    aVar.a("TR", new int[]{868, 869});
                    aVar.a("NL", new int[]{870, 879});
                    aVar.a("KR", new int[]{880});
                    aVar.a("TH", new int[]{885});
                    aVar.a("SG", new int[]{b.C});
                    aVar.a("IN", new int[]{890});
                    aVar.a("VN", new int[]{893});
                    aVar.a("PK", new int[]{896});
                    aVar.a("ID", new int[]{EglobalUtils.DOUBLE_AUTH_ERROR_CODE});
                    aVar.a("AT", new int[]{TypedValues.Custom.TYPE_INT, 919});
                    aVar.a("AU", new int[]{930, 939});
                    aVar.a("AZ", new int[]{940, 949});
                    aVar.a("MY", new int[]{955});
                    aVar.a("MO", new int[]{958});
                }
            }
            int i14 = Integer.parseInt(string.substring(0, 3));
            int size = aVar.f68350a.size();
            for (int i15 = 0; i15 < size; i15++) {
                int[] iArr3 = (int[]) aVar.f68350a.get(i15);
                int i16 = iArr3[0];
                if (i14 < i16) {
                    break;
                }
                if (iArr3.length != 1) {
                    i16 = iArr3[1];
                }
                if (i14 <= i16) {
                    str = (String) aVar.f68351b.get(i15);
                    break;
                }
            }
            if (str != null) {
                result.putMetadata(ResultMetadataType.POSSIBLE_COUNTRY, str);
            }
        }
        return result;
    }
}
