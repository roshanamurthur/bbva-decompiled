package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.veridas.Veridas;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes9.dex */
final class ne {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f42680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f42681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char[] f42682e;

    static {
        init$0();
        b();
        f42680c = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, Constants.CVR_B1b85_0101_MOBILE_APP, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102, 103, 104, 105, GenerateAcResponseApdu.DDA_HEADER, 107, 108, 109, 110, Constants.FCI_TEMPLATE, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 113, 114, 115, 116, 117, 118, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    }

    private static String a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) << 2];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            bArr3[i10] = bArr2[(bArr[i11] & 255) >> 2];
            int i12 = i11 + 1;
            bArr3[i10 + 1] = bArr2[((bArr[i11] & 3) << 4) | ((bArr[i12] & 255) >> 4)];
            int i13 = i10 + 3;
            int i14 = (bArr[i12] & 15) << 2;
            int i15 = i11 + 2;
            bArr3[i10 + 2] = bArr2[i14 | ((bArr[i15] & 255) >> 6)];
            i10 += 4;
            bArr3[i13] = bArr2[bArr[i15] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i10 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i10 + 2] = Base64.padSymbol;
            bArr3[i10 + 3] = Base64.padSymbol;
        } else if (length2 == 2) {
            bArr3[i10] = bArr2[(bArr[length] & 255) >> 2];
            int i16 = (bArr[length] & 3) << 4;
            int i17 = length + 1;
            bArr3[i10 + 1] = bArr2[((bArr[i17] & 255) >> 4) | i16];
            bArr3[i10 + 2] = bArr2[(bArr[i17] & 15) << 2];
            bArr3[i10 + 3] = Base64.padSymbol;
        }
        try {
            return new String(bArr3, Veridas.US_ASCII);
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    public static byte[] b(String str) {
        int i10;
        char cCharAt;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i11 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                i10 = cCharAt2 - 'A';
            } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                i10 = cCharAt2 - 'G';
            } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                i10 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i10 = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i10 = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i13 = ((byte) i10) | (i13 << 6);
            i12++;
            if (i12 % 4 == 0) {
                bArr[i14] = (byte) (i13 >> 16);
                int i16 = i14 + 2;
                bArr[i14 + 1] = (byte) (i13 >> 8);
                i14 += 3;
                bArr[i16] = (byte) i13;
            }
        }
        int i17 = i12 % 4;
        if (i17 == 1) {
            return null;
        }
        if (i17 == 2) {
            bArr[i14] = (byte) ((i13 << 12) >> 16);
            i14++;
        } else if (i17 == 3) {
            int i18 = i13 << 6;
            int i19 = i14 + 1;
            bArr[i14] = (byte) (i18 >> 16);
            i14 += 2;
            bArr[i19] = (byte) (i18 >> 8);
        }
        if (i14 == i11) {
            return bArr;
        }
        byte[] bArr2 = new byte[i14];
        try {
            Object[] objArr = {bArr, 0, bArr2, 0, Integer.valueOf(i14)};
            Object[] objArr2 = new Object[1];
            f((byte) ((Process.myPid() >> 22) + 7), "\u0005\u0006\u000f\t\b\r\u0007\n\u0012\b\u0007\u0015\u0015\u000e\u0000\u0001", 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            f((byte) (84 - ExpandableListView.getPackedPositionType(0L)), "\u0006\u0000\u0000\u0006\u0002\f\u0017\u0010㘷", 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
            String str2 = (String) objArr3[0];
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod(str2, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
            return bArr2;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static void f(byte b10, String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = str != null ? str.toCharArray() : str;
        gv gvVar = new gv();
        char[] cArr = f42682e;
        long j10 = 0;
        int i12 = -324767611;
        int i13 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Map map = bp.f40694x;
                    Object method = map.get(Integer.valueOf(i12));
                    if (method == null) {
                        Class cls = (Class) bp.a(Color.blue(0) + 24, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1411, (char) (1 - (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1))));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        g(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-324767611, method);
                    }
                    cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i14++;
                    j10 = 0;
                    i12 = -324767611;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f42681d)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-324767611);
        if (method2 == null) {
            Class cls2 = (Class) bp.a(24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0) + 1411, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            g(b13, b14, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-324767611, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            gvVar.f41832e = 0;
            while (true) {
                int i15 = gvVar.f41832e;
                if (i15 >= i11) {
                    break;
                }
                char c10 = charArray[i15];
                gvVar.f41829b = c10;
                char c11 = charArray[i15 + 1];
                gvVar.f41831d = c11;
                if (c10 == c11) {
                    cArr3[i15] = (char) (c10 - b10);
                    cArr3[i15 + 1] = (char) (c11 - b10);
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = gvVar;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = gvVar;
                    objArr6[9] = gvVar;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = gvVar;
                    objArr6[6] = gvVar;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = gvVar;
                    objArr6[3] = gvVar;
                    objArr6[2] = Integer.valueOf(cCharValue);
                    objArr6[1] = gvVar;
                    objArr6[i13] = gvVar;
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-779085347);
                    if (method3 == null) {
                        Class cls3 = (Class) bp.a(TextUtils.lastIndexOf("", '0', i13, i13) + 24, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 719, (char) (TypedValue.complexToFloat(i13) > 0.0f ? 1 : (TypedValue.complexToFloat(i13) == 0.0f ? 0 : -1)));
                        byte b15 = (byte) i13;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        g(b15, b16, (byte) (b16 + 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(-779085347, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i16 = gvVar.f41833g;
                    if (iIntValue == i16) {
                        Object[] objArr8 = {gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, Integer.valueOf(cCharValue), gvVar};
                        Object method4 = map3.get(531504056);
                        if (method4 == null) {
                            Class cls5 = (Class) bp.a(24 - ExpandableListView.getPackedPositionType(0L), Drawable.resolveOpacity(0, 0) + 221, (char) (Process.myTid() >> 22));
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod("l", Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(531504056, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i17 = (gvVar.f41828a * cCharValue) + gvVar.f41833g;
                        int i18 = gvVar.f41832e;
                        cArr3[i18] = cArr[iIntValue2];
                        cArr3[i18 + 1] = cArr[i17];
                    } else {
                        int i19 = gvVar.f41830c;
                        int i20 = gvVar.f41828a;
                        if (i19 == i20) {
                            int iA = androidx.activity.a.a(gvVar.f41834j, cCharValue, 1, cCharValue);
                            gvVar.f41834j = iA;
                            int iA2 = androidx.activity.a.a(i16, cCharValue, 1, cCharValue);
                            gvVar.f41833g = iA2;
                            int i21 = (i20 * cCharValue) + iA2;
                            int i22 = gvVar.f41832e;
                            cArr3[i22] = cArr[(i19 * cCharValue) + iA];
                            cArr3[i22 + 1] = cArr[i21];
                        } else {
                            int i23 = (i19 * cCharValue) + i16;
                            int i24 = (i20 * cCharValue) + gvVar.f41834j;
                            int i25 = gvVar.f41832e;
                            cArr3[i25] = cArr[i23];
                            cArr3[i25 + 1] = cArr[i24];
                        }
                    }
                }
                gvVar.f41832e += 2;
                i13 = 0;
            }
        }
        for (int i26 = 0; i26 < i10; i26++) {
            cArr3[i26] = (char) (cArr3[i26] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = com.facetec.sdk.ne.$$a
            int r8 = r8 * 6
            int r8 = r8 + 105
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L30
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L1c:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r4 = -r4
            int r7 = r7 + 1
            int r6 = r6 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ne.g(short, short, byte, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{84, 121, 52, 82};
        $$b = 118;
    }

    public static String b(byte[] bArr) {
        return a(bArr, f42680c);
    }

    public static void b() {
        f42682e = new char[]{25164, 25171, 25155, 25103, 25156, 25152, 25202, 25154, 25165, 25163, 25153, 25173, 25167, 25158, 25018, 25019, 25016, 25159, 25169, 25175, 25017, 25166, 25176, 25157, 25170};
        f42681d = (char) 22462;
    }
}
