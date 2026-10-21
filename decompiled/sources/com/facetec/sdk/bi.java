package com.facetec.sdk;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public final class bi {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f40577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f40578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f40579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f40580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f40581e;

    static {
        init$0();
        b();
        f40581e = "0123456789ABCDEF".toCharArray();
    }

    public static String b(String str) throws Exception {
        return d(c(str.getBytes(StandardCharsets.UTF_8)));
    }

    public static byte[] c(byte[]... bArr) throws Exception {
        return MessageDigest.getInstance("SHA-256").digest(b(bArr));
    }

    public static String d(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 << 1;
            char[] cArr2 = f40581e;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static byte[] e(String str) throws Exception {
        return c(str.getBytes(StandardCharsets.UTF_8));
    }

    private static void f(String str, int i10, Object[] objArr) throws Throwable {
        char c10;
        char[] charArray = str != null ? str.toCharArray() : str;
        gu guVar = new gu();
        char[] cArr = new char[charArray.length];
        guVar.f41827b = 0;
        char c11 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i11 = guVar.f41827b;
            if (i11 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[0] = charArray[i11];
            char c12 = 1;
            cArr2[1] = charArray[i11 + 1];
            int i12 = 58224;
            int i13 = 0;
            while (i13 < 16) {
                char c13 = cArr2[c12];
                char c14 = cArr2[0];
                int i14 = i13;
                int i15 = (c14 + i12) ^ ((c14 << 4) + ((char) (((long) f40580d) ^ (-6773320768317835938L))));
                int i16 = c14 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f40577a);
                    objArr2[c11] = Integer.valueOf(i16);
                    objArr2[1] = Integer.valueOf(i15);
                    objArr2[0] = Integer.valueOf(c13);
                    Map map = bp.f40694x;
                    Object method = map.get(753387582);
                    if (method == null) {
                        Class cls = (Class) bp.a(25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1119 - ExpandableListView.getPackedPositionGroup(0L), (char) View.getDefaultSize(0, 0));
                        byte b10 = (byte) ($$b - 4);
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        g(b10, b11, (byte) (b11 - 1), objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(753387582, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) f40579c) ^ (-6773320768317835938L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f40578b)};
                    Object method2 = map.get(753387582);
                    if (method2 == null) {
                        Class cls3 = (Class) bp.a(ImageFormat.getBitsPerPixel(0) + 25, 1119 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ExpandableListView.getPackedPositionGroup(0L));
                        byte b12 = (byte) ($$b - 4);
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        g(b12, b13, (byte) (b13 - 1), objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(753387582, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i12 -= 40503;
                    i13 = i14 + 1;
                    c11 = 2;
                    c12 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i17 = guVar.f41827b;
            cArr[i17] = cArr2[0];
            cArr[i17 + 1] = cArr2[1];
            Object[] objArr6 = {guVar, guVar};
            Map map2 = bp.f40694x;
            Object method3 = map2.get(52059537);
            if (method3 != null) {
                c10 = 2;
            } else {
                Class cls5 = (Class) bp.a(Gravity.getAbsoluteGravity(0, 0) + 24, 434 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (10110 - (ViewConfiguration.getLongPressTimeout() >> 16)));
                byte b14 = (byte) ($$b - 4);
                byte b15 = (byte) (b14 + 1);
                Object[] objArr7 = new Object[1];
                g(b14, b15, (byte) (-b15), objArr7);
                c10 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(52059537, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            c11 = c10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.facetec.sdk.bi.$$a
            int r7 = r7 * 2
            int r7 = r7 + 69
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L18:
            r3 = r2
        L19:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bi.g(short, int, short, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -102, 6, 45};
        $$b = 4;
    }

    public static String b(byte[] bArr, String str) throws Exception {
        return d(c(bArr, str.getBytes(StandardCharsets.UTF_8)));
    }

    public static byte[] c(byte[] bArr, String str) throws Exception {
        return c(bArr, str.getBytes(StandardCharsets.UTF_8));
    }

    private static byte[] c(byte[] bArr, byte[]... bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return mac.doFinal(b(bArr2));
    }

    private static byte[] b(byte[]... bArr) throws Throwable {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            try {
                Object[] objArr = {bArr4, 0, bArr3, Integer.valueOf(length2), Integer.valueOf(bArr4.length)};
                Object[] objArr2 = new Object[1];
                f("ᇌஅೆ\ue287ν긁\ue2a5迮\udbda癶닁\uf370迉ࢁ㟩呶", 16 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                f("툁촼ⷷ\uf4ae羐ﳚ뺌ĈᎴ뭂", 9 - TextUtils.getCapsMode("", 0, 0), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                length2 += bArr4.length;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        return bArr3;
    }

    public static void b() {
        f40579c = (char) 6683;
        f40578b = (char) 34190;
        f40580d = (char) 7294;
        f40577a = (char) 64593;
    }
}
