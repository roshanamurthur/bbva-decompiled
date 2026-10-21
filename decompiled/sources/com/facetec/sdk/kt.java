package com.facetec.sdk;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kt implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f42172a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f42173c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f42174d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f42175e;

    static {
        e();
        f42172a = 0;
        f42175e = 1;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x02d9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static synchronized void e(long j10, long j11) {
        boolean z10;
        ku kuVar = new ku(j10, j11);
        byte[] bArr = f42173c;
        byte b10 = bArr[6];
        short s4 = bArr[59];
        int i10 = 1;
        Object[] objArr = new Object[1];
        f(b10, s4, (byte) (s4 & 122), objArr);
        char c10 = 0;
        String str = (String) objArr[0];
        byte b11 = bArr[52];
        byte b12 = b11;
        Object[] objArr2 = new Object[1];
        f(b12, (short) (b12 | 121), b11, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            int i11 = f42174d;
            short s7 = (short) 121;
            Object[] objArr4 = new Object[1];
            f((byte) (i11 | 18), s7, bArr[34], objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            f((byte) 71, (short) 136, bArr[114], objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            f((byte) (i11 | 18), s7, bArr[34], objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i12 = 0;
            while (i12 < objArr7.length) {
                Object[] objArr8 = new Object[i10];
                objArr8[c10] = objArr7[i12];
                int i13 = f42174d;
                short s9 = (short) 140;
                byte[] bArr2 = f42173c;
                Object[] objArr9 = new Object[i10];
                f((byte) (i13 | 18), s9, (byte) (bArr2[157] - 1), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c10]);
                Object[] objArr10 = new Object[i10];
                f((byte) 74, (short) 156, bArr2[41], objArr10);
                String str3 = (String) objArr10[0];
                Class<?>[] clsArr = new Class[i10];
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                f((byte) (i13 | 18), s7, bArr2[34], objArr12);
                clsArr[0] = Class.forName((String) objArr12[0]);
                Object objInvoke = cls2.getMethod(str3, clsArr).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                f((byte) (i13 | 18), s9, (byte) (bArr2[157] - 1), objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((byte) (i13 | 17), (short) 162, bArr2[5], objArr14);
                iArr[i12] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i12++;
                objArr7 = objArr11;
                c10 = 0;
                i10 = 1;
            }
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                try {
                    switch (kuVar.e(iArr[i14])) {
                        case -18:
                            i14 = 35;
                            break;
                        case -17:
                            kuVar.e(19);
                            i14 = kuVar.f42181c != 0 ? 1 : 25;
                            break;
                        case -16:
                            z10 = true;
                            try {
                                kuVar.f42179a = 1;
                                kuVar.e(3);
                                kuVar.e(4);
                                kuVar.f42179a = kuVar.f42186h.hashCode();
                                try {
                                    kuVar.e(1);
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (i15 >= 31) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (i15 >= 31) {
                                }
                                throw th;
                            }
                            break;
                        case -15:
                            kuVar.e(17);
                            throw ((Throwable) kuVar.f42186h);
                        case -14:
                            i14 = 36;
                            break;
                        case -13:
                            i14 = 38;
                            break;
                        case -12:
                            kuVar.e(16);
                            i14 = kuVar.f42181c == 0 ? 23 : i15;
                            break;
                        case -11:
                            z10 = true;
                            try {
                                kuVar.f42179a = 1;
                                kuVar.e(3);
                                try {
                                    kuVar.e(6);
                                    f42172a = kuVar.f42181c;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (i15 >= 31) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (i15 >= 31) {
                                }
                                throw th;
                            }
                            break;
                        case -10:
                            kuVar.f42179a = f42175e;
                            kuVar.e(1);
                            break;
                        case -9:
                            break;
                        case -8:
                            i14 = 13;
                            break;
                        case -7:
                            i14 = 11;
                            break;
                        case -6:
                            bn.b();
                            break;
                        case -5:
                            kuVar.f42179a = 1;
                            kuVar.e(3);
                            try {
                                kuVar.e(6);
                                bn.f40664d = kuVar.f42181c;
                            } catch (Throwable th6) {
                                th = th6;
                                if (i15 >= 31) {
                                }
                                throw th;
                            }
                            break;
                        case -4:
                            try {
                                kuVar.f42179a = 1;
                                kuVar.e(3);
                                kuVar.e(4);
                                try {
                                    kuVar.f42179a = ((Class) bp.a(26 - (ViewConfiguration.getPressedStateDuration() >> 16), 52 - TextUtils.indexOf("", ""), (char) TextUtils.indexOf("", "", 0))).getField("i").getInt(kuVar.f42186h);
                                    try {
                                        kuVar.e(1);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        if (i15 >= 31) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    if (i15 >= 31) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                            }
                            break;
                        case -3:
                            try {
                                try {
                                    kuVar.f42187i = ((Class) bp.a(View.MeasureSpec.getSize(0) + 26, TextUtils.indexOf("", "", 0) + 52, (char) (ViewConfiguration.getWindowTouchSlop() >> 8))).getField("b").get(null);
                                    kuVar.e(2);
                                } catch (Throwable th10) {
                                    th = th10;
                                    if (i15 >= 31) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                if (i15 >= 31) {
                                }
                                throw th;
                            }
                            break;
                        case -2:
                            kuVar.f42179a = bn.f40664d;
                            try {
                                kuVar.e(1);
                            } catch (Throwable th12) {
                                th = th12;
                                if (i15 >= 31 || i15 > 35) {
                                    throw th;
                                }
                                kuVar.f42187i = th;
                                kuVar.e(22);
                                i14 = 24;
                            }
                            break;
                        case -1:
                            i14 = 8;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th13) {
                    th = th13;
                }
            }
        } catch (Throwable th14) {
            Throwable cause = th14.getCause();
            if (cause == null) {
                throw th14;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r0 = r8 + 1
            int r6 = r6 + 44
            byte[] r1 = com.facetec.sdk.kt.f42173c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L33
        L14:
            r3 = r2
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.kt.f(int, int, byte, java.lang.Object[]):void");
    }

    public final String a() throws IOException {
        nh nhVarB = b();
        try {
            kn knVarD = d();
            return nhVarB.e(kz.c(nhVarB, knVarD != null ? knVarD.a(kz.f42210e) : kz.f42210e));
        } finally {
            kz.a(nhVarB);
        }
    }

    public abstract nh b();

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        kz.a(b());
    }

    @Nullable
    public abstract kn d();

    public static void e() {
        f42173c = new byte[]{92, -29, 58, -120, -2, 7, 1, -3, 8, 1, -4, 9, 1, -5, 10, -7, 11, 1, -6, 11, 1, -7, 12, 1, -8, 13, -9, 13, -10, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, -9, Constants.CVR_B1b41_1110_ONLINE_PIN, -11, 15, 1, -10, 15, 1, -2, 3, 6, -3, 3, 6, -3, 2, 7, -3, 1, 8, -3, 0, 9, 1, -2, 2, 7, -3, -1, 10, -3, -2, 11, 1, -2, 1, 8, 1, -2, 0, 9, 1, -2, -1, 10, 1, -2, -2, 11, 1, -3, 8, 1, -4, 9, 1, -5, 10, -7, 11, 1, -6, 11, 1, -7, 12, -3, -5, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, -2, -3, 12, -10, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, -8, 13, 1, -2, -4, 13, -4, 4, 6, 1, -2, -5, Constants.CVR_B1b41_1110_ONLINE_PIN, -4, 3, 7, 1, -2, -5, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -31, 4, 11, -3, 9, 5, 6, 5, -9, 11, -19, 23, 53, -60, 13, -11, 9, 59, -25, -35, -4, 17, 0, 4, -11, 23, -9, -7, MessageUtils.MESSAGE_18_DC2, 24, -21, -3, -4, 32, -9, -9, -7, MessageUtils.MESSAGE_18_DC2};
        f42174d = 44;
    }

    public static kt a(byte[] bArr) {
        final nb nbVarA = new nb().a(bArr);
        final long length = bArr.length;
        if (nbVarA != null) {
            return new kt() { // from class: com.facetec.sdk.kt.2

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ kn f42178c = null;

                @Override // com.facetec.sdk.kt
                public final nh b() {
                    return nbVarA;
                }

                @Override // com.facetec.sdk.kt
                public final long c() {
                    return length;
                }

                @Override // com.facetec.sdk.kt
                @Nullable
                public final kn d() {
                    return this.f42178c;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
