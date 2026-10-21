package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class lo implements km {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f42342e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f42343c;

    public static final class e extends nk {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f42344e;

        public e(ns nsVar) {
            super(nsVar);
        }

        @Override // com.facetec.sdk.nk, com.facetec.sdk.ns
        public final void c(nb nbVar, long j10) throws IOException {
            super.c(nbVar, j10);
            this.f42344e += j10;
        }
    }

    static {
        init$0();
        f42342e = -1817348490;
    }

    public lo(boolean z10) {
        this.f42343c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a2  */
    private static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        int i13;
        Throwable cause;
        char[] charArray = str != null ? str.toCharArray() : str;
        gz gzVar = new gz();
        char[] cArr = new char[i12];
        int i14 = 0;
        gzVar.f41846c = 0;
        while (true) {
            int i15 = gzVar.f41846c;
            if (i15 >= i12) {
                break;
            }
            char c10 = charArray[i15];
            gzVar.f41844a = c10;
            char c11 = (char) (i10 + c10);
            cArr[i15] = c11;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(f42342e);
                objArr2[i14] = Integer.valueOf(c11);
                Map map = bp.f40694x;
                Object method = map.get(1917901234);
                if (method == null) {
                    Class cls = (Class) bp.a((CdmaCellLocation.convertQuartSecToDecDegrees(i14) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i14) == 0.0d ? 0 : -1)) + 23, 1025 - Color.blue(i14), (char) (38453 - (ViewConfiguration.getEdgeSlop() >> 16)));
                    byte b10 = (byte) 1;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(1917901234, method);
                }
                cArr[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {gzVar, gzVar};
                Object method2 = map.get(-1709307603);
                if (method2 == null) {
                    Class cls3 = (Class) bp.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, 813 - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36772));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1709307603, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 0;
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
            gzVar.f41845b = i11;
            char[] cArr2 = new char[i12];
            i13 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i16 = gzVar.f41845b;
            System.arraycopy(cArr2, 0, cArr, i12 - i16, i16);
            int i17 = gzVar.f41845b;
            System.arraycopy(cArr2, i17, cArr, 0, i12 - i17);
        } else {
            i13 = 0;
        }
        if (z10) {
            char[] cArr3 = new char[i12];
            gzVar.f41846c = i13;
            while (true) {
                int i18 = gzVar.f41846c;
                if (i18 >= i12) {
                    break;
                }
                cArr3[i18] = cArr[(i12 - i18) - 1];
                Object[] objArr6 = {gzVar, gzVar};
                Map map2 = bp.f40694x;
                Object method3 = map2.get(-1709307603);
                if (method3 == null) {
                    Class cls4 = (Class) bp.a(23 - MotionEvent.axisFromString(""), 764 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36772));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, b15, objArr7);
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
    private static void b(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 5
            int r7 = 106 - r7
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = com.facetec.sdk.lo.$$a
            int r8 = r8 * 2
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
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.lo.b(int, short, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{116, -68, 50, 70};
        $$b = 58;
    }

    @Override // com.facetec.sdk.km
    public final kq c(km.e eVar) throws Throwable {
        kq.d dVarC;
        ls lsVar = (ls) eVar;
        lr lrVar = lsVar.f42351d;
        lj ljVarC = lsVar.c();
        lm lmVar = lsVar.f42348a;
        kr krVarD = lsVar.d();
        try {
            Object[] objArr = new Object[1];
            a(147 - ImageFormat.getBitsPerPixel(0), 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011", true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(Color.red(0) + 155, 12 - TextUtils.getOffsetAfter("", 0), 17 - View.getDefaultSize(0, 0), "￤￼\u0004\u0000￫\u000b\u0005￼\t\t\f\ufffa\n\u0000\u0003\u0003\u0000", true, objArr2);
            long jLongValue = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue();
            lsVar.j();
            lsVar.h();
            lrVar.e(krVarD);
            lsVar.j();
            lsVar.h();
            if (!lv.d(krVarD.c()) || krVarD.e() == null) {
                dVarC = null;
            } else {
                if ("100-continue".equalsIgnoreCase(krVarD.d("Expect"))) {
                    lrVar.b();
                    lsVar.j();
                    lsVar.h();
                    dVarC = lrVar.c(true);
                } else {
                    dVarC = null;
                }
                if (dVarC == null) {
                    lsVar.j();
                    lsVar.h();
                    ni niVarC = no.c(new e(lrVar.e(krVarD, krVarD.e().d())));
                    krVarD.e().b(niVarC);
                    niVarC.close();
                    lsVar.j();
                    lsVar.h();
                } else if (!lmVar.e()) {
                    ljVarC.d();
                }
            }
            lrVar.a();
            if (dVarC == null) {
                lsVar.j();
                lsVar.h();
                dVarC = lrVar.c(false);
            }
            kq.d dVarB = dVarC.a(krVarD).e(ljVarC.e().d()).b(jLongValue);
            Object[] objArr3 = new Object[1];
            a(148 - ExpandableListView.getPackedPositionGroup(0L), 12 - View.resolveSizeAndState(0, 0, 0), 15 - TextUtils.indexOf((CharSequence) "", '0'), "\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011", true, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((ViewConfiguration.getTouchSlop() >> 8) + 155, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, 17 - TextUtils.indexOf("", "", 0, 0), "￤￼\u0004\u0000￫\u000b\u0005￼\t\t\f\ufffa\n\u0000\u0003\u0003\u0000", true, objArr4);
            kq kqVarC = dVarB.d(((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue()).c();
            int iE = kqVarC.e();
            if (iE == 100) {
                kq.d dVarB2 = lrVar.c(false).a(krVarD).e(ljVarC.e().d()).b(jLongValue);
                Object[] objArr5 = new Object[1];
                a((ViewConfiguration.getWindowTouchSlop() >> 8) + 148, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, 16 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011", true, objArr5);
                Class<?> cls3 = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                a(154 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 12 - View.MeasureSpec.getSize(0), 16 - TextUtils.lastIndexOf("", '0'), "￤￼\u0004\u0000￫\u000b\u0005￼\t\t\f\ufffa\n\u0000\u0003\u0003\u0000", true, objArr6);
                kqVarC = dVarB2.d(((Long) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).longValue()).c();
                iE = kqVarC.e();
            }
            lsVar.j();
            lsVar.h();
            kq kqVarC2 = (this.f42343c && iE == 101) ? kqVarC.j().c(kz.f42209d).c() : kqVarC.j().c(lrVar.e(kqVarC)).c();
            if (HearingDisabilitiesConstants.CLOSE_MODAL.equalsIgnoreCase(kqVarC2.b().d("Connection")) || HearingDisabilitiesConstants.CLOSE_MODAL.equalsIgnoreCase(kqVarC2.d("Connection"))) {
                ljVarC.d();
            }
            if ((iE != 204 && iE != 205) || kqVarC2.a().c() <= 0) {
                return kqVarC2;
            }
            StringBuilder sbC = androidx.appcompat.widget.o1.c("HTTP ", iE, " had non-zero Content-Length: ");
            sbC.append(kqVarC2.a().c());
            throw new ProtocolException(sbC.toString());
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
