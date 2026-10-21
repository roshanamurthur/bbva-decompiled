package com.facetec.sdk;

import android.os.Build;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;

/* JADX INFO: loaded from: classes9.dex */
final class cr {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f40987k = 0;
    private static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f40988n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f40989o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f40992c = {"2109119DG", "M2010J19CG", "Pixel 6a"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f40990a = 0.8f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f40993d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f40994e = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f40999j = 0.8f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f40995f = 0.55f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f40996g = 0.6f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f40998i = 0.45f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f40997h = 0.5f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f40991b = a();

    static {
        c();
        f40989o = 0;
        m = 1;
    }

    private boolean a() {
        for (String str : this.f40992c) {
            if (Build.MODEL.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static void c() {
        f40988n = new byte[]{41, UtilitiesSDKConstants.SRP_LABEL_MAC, -97, -39, 2, -7, -1, 3, -8, -1, 4, -9, -1, 5, -10, 8, -12, -1, 6, -11, -1, 7, -12, -1, 8, -13, 9, -13, 10, -14, -1, 9, -14, 11, -15, -1, 10, -15, -1, 2, -3, -6, 3, -3, -6, 3, -2, -7, 3, -1, -8, 3, 0, -9, -1, 2, -2, -7, 3, 2, -11, -1, 2, -1, -8, -1, 2, 0, -9, -1, 2, 1, -10, -1, 2, 2, -11, -1, 3, -8, -1, 4, -9, -1, 5, -10, 8, -12, -1, 6, -11, -1, 7, -12, 3, 4, -13, 3, 5, -14, -1, 8, -13, -1, 2, 3, -12, 4, -4, -6, -1, 2, 4, -13, 4, -3, -7, -1, 2, 4, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 31, -4, -11, 3, -9, -5, -6, -5, 9, -11, 19, -23, -53, 60, -13, 11, -9, -59, 25, 35, 4, ByteSourceJsonBootstrapper.UTF8_BOM_1, 0, -4, 11, -23, 9, 7, -18, -24, MessageUtils.MESSAGE_21_NAK, 3, 4, -32, 9, 9, 7, -18};
        f40987k = 227;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void l(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.facetec.sdk.cr.f40988n
            int r6 = r6 + 4
            int r8 = 118 - r8
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r1
            r4 = r2
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r8 = r8 + r6
            int r6 = r8 + 2
            int r7 = r7 + 1
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
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.cr.l(int, int, short, java.lang.Object[]):void");
    }

    public final boolean b() {
        return this.f40991b;
    }

    public final float d() {
        return this.f40991b ? 0.45f : 0.5f;
    }

    public final float e() {
        return this.f40991b ? 0.6f : 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x029f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized void d(long j10, long j11) {
        dl dlVar = new dl(j10, j11);
        byte[] bArr = f40988n;
        char c10 = '4';
        short s4 = bArr[52];
        Object[] objArr = new Object[1];
        l(s4, (byte) (s4 | 116), (byte) 73, objArr);
        char c11 = 0;
        String str = (String) objArr[0];
        short s7 = (short) 116;
        byte b10 = bArr[52];
        Object[] objArr2 = new Object[1];
        l(s7, b10, (byte) (b10 | 74), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            int i10 = 16;
            Object[] objArr4 = new Object[1];
            l(s7, (byte) (-bArr[34]), (byte) (-bArr[16]), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            l((short) (f40987k & 911), bArr[10], bArr[7], objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            l(s7, (byte) (-bArr[34]), (byte) (-bArr[16]), objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i11 = 0;
            while (i11 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c11] = objArr7[i11];
                short s9 = (short) 135;
                byte b11 = (byte) i10;
                byte[] bArr2 = f40988n;
                byte b12 = (byte) (-bArr2[i10]);
                Object[] objArr9 = new Object[1];
                l(s9, b11, b12, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c11]);
                byte b13 = bArr2[18];
                byte b14 = bArr2[c10];
                Object[] objArr10 = new Object[1];
                l((short) 151, b13, b14, objArr10);
                String str3 = (String) objArr10[0];
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                l(s7, (byte) (-bArr2[34]), (byte) (-bArr2[16]), objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                l(s9, b11, (byte) (-bArr2[16]), objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                l((short) 157, bArr2[21], (byte) (-bArr2[25]), objArr14);
                iArr[i11] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i11++;
                objArr7 = objArr11;
                c10 = '4';
                c11 = 0;
                i10 = 16;
            }
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                try {
                    switch (dlVar.b(iArr[i12])) {
                        case -17:
                            i12 = 33;
                            break;
                        case -16:
                            try {
                                dlVar.b(19);
                                int i14 = dlVar.f41258e;
                                i12 = (i14 == 57 || i14 != 75) ? 1 : 24;
                            } catch (Throwable th2) {
                                th = th2;
                                if (i13 >= 30) {
                                }
                                throw th;
                            }
                            break;
                        case -15:
                            dlVar.b(16);
                            throw ((Throwable) dlVar.f41263j);
                        case -14:
                            i12 = 34;
                            break;
                        case -13:
                            i12 = 36;
                            break;
                        case -12:
                            dlVar.b(14);
                            i12 = dlVar.f41258e == 0 ? 22 : i13;
                            break;
                        case -11:
                            dlVar.f41257d = 1;
                            dlVar.b(3);
                            dlVar.b(5);
                            f40989o = dlVar.f41258e;
                            break;
                        case -10:
                            dlVar.f41257d = m;
                            dlVar.b(1);
                            break;
                        case -9:
                            break;
                        case -8:
                            i12 = 13;
                            break;
                        case -7:
                            i12 = 11;
                            break;
                        case -6:
                            bn.b();
                            break;
                        case -5:
                            dlVar.f41257d = 1;
                            dlVar.b(3);
                            dlVar.b(5);
                            bn.f40664d = dlVar.f41258e;
                            break;
                        case -4:
                            try {
                                dlVar.f41257d = 1;
                                dlVar.b(3);
                                dlVar.b(4);
                                try {
                                    dlVar.f41257d = ((Class) bp.a(26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 53, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getField("i").getInt(dlVar.f41263j);
                                    dlVar.b(1);
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (i13 >= 30) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            break;
                        case -3:
                            try {
                                try {
                                    try {
                                        try {
                                            dlVar.f41261h = ((Class) bp.a(26 - TextUtils.getOffsetBefore("", 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 52, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)))).getField("b").get(null);
                                            dlVar.b(2);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            if (i13 >= 30 || i13 > 33) {
                                                throw th;
                                            }
                                            dlVar.f41261h = th;
                                            dlVar.b(22);
                                            i12 = 23;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (i13 >= 30) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                            break;
                        case -2:
                            dlVar.f41257d = bn.f40664d;
                            dlVar.b(1);
                            break;
                        case -1:
                            i12 = 8;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            }
        } catch (Throwable th10) {
            Throwable cause = th10.getCause();
            if (cause == null) {
                throw th10;
            }
            throw cause;
        }
    }
}
