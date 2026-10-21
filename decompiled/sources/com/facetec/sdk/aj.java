package com.facetec.sdk;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes9.dex */
abstract class aj {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f40274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f40275b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f40276e;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f40275b = 0;
        f40274a = 1;
        f40276e = -1817348552;
    }

    public static byte[] c(Cipher cipher, byte[] bArr) throws Exception {
        int i10 = f40274a + 5;
        f40275b = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                cipher.doFinal(bArr);
                throw null;
            }
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            int i11 = f40274a + 123;
            f40275b = i11 % 128;
            int i12 = i11 % 2;
            return bArrDoFinal;
        } catch (Exception e5) {
            k.c(e5);
            return null;
        }
    }

    public static byte[] d() throws Exception {
        SecureRandom secureRandom = new SecureRandom();
        try {
            Object[] objArr = new Object[1];
            l(Color.alpha(0) + 3, "\ufff9�\u000b", 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 196 - (ViewConfiguration.getScrollDefaultDelay() >> 16), false, objArr);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr[0]).intern());
            keyGenerator.init(128, secureRandom);
            byte[] encoded = keyGenerator.generateKey().getEncoded();
            int i10 = f40274a + 69;
            f40275b = i10 % 128;
            int i11 = i10 % 2;
            return encoded;
        } catch (NoSuchAlgorithmException e5) {
            throw new Exception(ay.a(e5.getMessage()));
        }
    }

    public static byte[] e(Cipher cipher, byte[] bArr) throws Exception {
        int i10 = f40275b + 83;
        f40274a = i10 % 128;
        int i11 = i10 % 2;
        try {
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            int i12 = f40274a + 5;
            f40275b = i12 % 128;
            int i13 = i12 % 2;
            return bArrDoFinal;
        } catch (Exception e5) {
            k.c(e5);
            return null;
        }
    }

    public static void init$0() {
        $$d = new byte[]{75, -55, -56, -106};
        $$e = 95;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x01cf  */
    private static void l(int i10, String str, int i11, int i12, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13 = $10 + 69;
        $11 = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        char[] charArray = str != null ? str.toCharArray() : str;
        gz gzVar = new gz();
        char[] cArr = new char[i10];
        int i16 = 0;
        gzVar.f41846c = 0;
        while (true) {
            int i17 = gzVar.f41846c;
            if (i17 >= i10) {
                break;
            }
            char c10 = charArray[i17];
            gzVar.f41844a = c10;
            char c11 = (char) (i12 + c10);
            cArr[i17] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(f40276e);
                objArr2[i16] = Integer.valueOf(c11);
                Map map = bp.f40694x;
                Object method = map.get(1917901234);
                if (method == null) {
                    Class cls = (Class) bp.a(23 - (ExpandableListView.getPackedPositionForGroup(i16) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i16) == 0L ? 0 : -1)), 1024 - TextUtils.indexOf((CharSequence) "", '0', i16), (char) (TextUtils.getCapsMode("", i16, i16) + 38453));
                    byte b10 = (byte) i16;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    m(b10, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(1917901234, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {gzVar, gzVar};
                Object method2 = map.get(-1709307603);
                if (method2 == null) {
                    Class cls3 = (Class) bp.a(23 - MotionEvent.axisFromString(""), 764 - TextUtils.lastIndexOf("", '0'), (char) (36773 - Color.green(0)));
                    byte b12 = (byte) ($$e & 1);
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    m(b12, b13, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1709307603, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 2;
                i16 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        if (i11 > 0) {
            int i18 = $10 + 83;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            gzVar.f41845b = i11;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i20 = gzVar.f41845b;
            System.arraycopy(cArr2, 0, cArr, i10 - i20, i20);
            int i21 = gzVar.f41845b;
            System.arraycopy(cArr2, i21, cArr, 0, i10 - i21);
        }
        if (z10) {
            int i22 = $11 + 47;
            $10 = i22 % 128;
            int i23 = i22 % 2;
            char[] cArr3 = new char[i10];
            gzVar.f41846c = 0;
            while (true) {
                int i24 = gzVar.f41846c;
                if (i24 >= i10) {
                    break;
                }
                int i25 = $10 + 99;
                $11 = i25 % 128;
                int i26 = i25 % 2;
                cArr3[i24] = cArr[(i10 - i24) - 1];
                Object[] objArr6 = {gzVar, gzVar};
                Map map2 = bp.f40694x;
                Object method3 = map2.get(-1709307603);
                if (method3 == null) {
                    Class cls4 = (Class) bp.a(24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 764 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (36773 - TextUtils.indexOf("", "", 0)));
                    byte b14 = (byte) ($$e & 1);
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    m(b14, b15, b15, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1709307603, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r7 = r7 * 5
            int r7 = r7 + 101
            byte[] r0 = com.facetec.sdk.aj.$$d
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r8]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L31:
            int r8 = r8 + 1
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.aj.m(byte, short, int, java.lang.Object[]):void");
    }
}
