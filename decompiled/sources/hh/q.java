package hh;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;
import com.google.zxing.NotFoundException;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: compiled from: FieldParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f69457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[][] f69458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[][] f69459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[][] f69460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[][] f69461e;

    static {
        Object obj = new Object();
        f69457a = obj;
        f69458b = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", obj, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND, 2}, new Object[]{"21", obj, 20}, new Object[]{"22", obj, 29}, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, new Object[]{EglobalUtils.READ_MODE_MAGNETIC_STRIPE, obj, 30}, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, new Object[]{"94", obj, 30}, new Object[]{"95", obj, 30}, new Object[]{EglobalUtils.NO_NFC, obj, 30}, new Object[]{EglobalUtils.NFC_DISABLE, obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        f69459c = new Object[][]{new Object[]{"240", obj, 30}, new Object[]{"241", obj, 30}, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{AsoResponse.ERROR_TOKEN_SOFTWARE_BLOQUED, 17}, new Object[]{AsoResponse.ERROR_TOKEN_SOFTWARE_UNKNOWN, obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, new Object[]{"422", 3}, new Object[]{"423", obj, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        f69460d = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{AsoResponse.ERROR_CODE_OTP_EXPIRED, 6}, new Object[]{AsoResponse.ERROR_CODE_OTP_BLOCKED, 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj, 15}, new Object[]{"391", obj, 18}, new Object[]{"392", obj, 15}, new Object[]{"393", obj, 18}, new Object[]{"703", obj, 30}};
        f69461e = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj, 20}, new Object[]{"8003", obj, 30}, new Object[]{"8004", obj, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj, 30}, new Object[]{"8008", obj, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj, 70}, new Object[]{"8200", obj, 70}};
    }

    public static String a(String str) throws NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, 2);
        Object[][] objArr = f69458b;
        int i10 = 0;
        while (true) {
            Object obj = f69457a;
            if (i10 >= 24) {
                if (str.length() < 3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                String strSubstring2 = str.substring(0, 3);
                Object[][] objArr2 = f69459c;
                for (int i11 = 0; i11 < 23; i11++) {
                    Object[] objArr3 = objArr2[i11];
                    if (objArr3[0].equals(strSubstring2)) {
                        Object obj2 = objArr3[1];
                        return obj2 == obj ? c(3, ((Integer) objArr3[2]).intValue(), str) : b(3, ((Integer) obj2).intValue(), str);
                    }
                }
                Object[][] objArr4 = f69460d;
                for (int i12 = 0; i12 < 57; i12++) {
                    Object[] objArr5 = objArr4[i12];
                    if (objArr5[0].equals(strSubstring2)) {
                        Object obj3 = objArr5[1];
                        return obj3 == obj ? c(4, ((Integer) objArr5[2]).intValue(), str) : b(4, ((Integer) obj3).intValue(), str);
                    }
                }
                if (str.length() < 4) {
                    throw NotFoundException.getNotFoundInstance();
                }
                String strSubstring3 = str.substring(0, 4);
                Object[][] objArr6 = f69461e;
                for (int i13 = 0; i13 < 18; i13++) {
                    Object[] objArr7 = objArr6[i13];
                    if (objArr7[0].equals(strSubstring3)) {
                        Object obj4 = objArr7[1];
                        return obj4 == obj ? c(4, ((Integer) objArr7[2]).intValue(), str) : b(4, ((Integer) obj4).intValue(), str);
                    }
                }
                throw NotFoundException.getNotFoundInstance();
            }
            Object[] objArr8 = objArr[i10];
            if (objArr8[0].equals(strSubstring)) {
                Object obj5 = objArr8[1];
                return obj5 == obj ? c(2, ((Integer) objArr8[2]).intValue(), str) : b(2, ((Integer) obj5).intValue(), str);
            }
            i10++;
        }
    }

    public static String b(int i10, int i11, String str) throws NotFoundException {
        if (str.length() < i10) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, i10);
        int i12 = i11 + i10;
        if (str.length() < i12) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring2 = str.substring(i10, i12);
        String strSubstring3 = str.substring(i12);
        String str2 = "(" + strSubstring + RootService.CLOSE_BRACKET + strSubstring2;
        String strA = a(strSubstring3);
        return strA == null ? str2 : u.f(str2, strA);
    }

    public static String c(int i10, int i11, String str) throws NotFoundException {
        String strSubstring = str.substring(0, i10);
        int length = i11 + i10;
        if (str.length() < length) {
            length = str.length();
        }
        String strSubstring2 = str.substring(i10, length);
        String strSubstring3 = str.substring(length);
        String str2 = "(" + strSubstring + RootService.CLOSE_BRACKET + strSubstring2;
        String strA = a(strSubstring3);
        return strA == null ? str2 : u.f(str2, strA);
    }
}
