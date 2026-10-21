package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.animation.core.AnimationKt;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class nd extends ny {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    static nd f42666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f42667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f42668c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f42669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f42670h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f42671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static byte[] f42672k;
    private static short[] m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f42674f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private nd f42675i;

    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r1.e();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.facetec.sdk.nd> r0 = com.facetec.sdk.nd.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.facetec.sdk.nd r1 = com.facetec.sdk.nd.c()     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r1 = move-exception
                goto L1b
            Ld:
                com.facetec.sdk.nd r2 = com.facetec.sdk.nd.f42666a     // Catch: java.lang.Throwable -> Lb
                if (r1 != r2) goto L16
                r1 = 0
                com.facetec.sdk.nd.f42666a = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                r1.e()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.nd.c.run():void");
        }
    }

    static {
        init$0();
        g();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f42667b = millis;
        f42668c = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static nd c() throws Throwable {
        nd ndVar = f42666a.f42675i;
        try {
            if (ndVar != null) {
                Object[] objArr = new Object[1];
                n((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 38, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (short) (89 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 359537228, (Process.myTid() >> 22) - 1669096874, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                n(Color.alpha(0) - 46, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (short) ((-103) - (ViewConfiguration.getWindowTouchSlop() >> 8)), 359537242 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-1669096871) - ImageFormat.getBitsPerPixel(0), objArr2);
                long jE = ndVar.e(((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue());
                if (jE > 0) {
                    long j10 = jE / AnimationKt.MillisToNanos;
                    nd.class.wait(j10, (int) (jE - (AnimationKt.MillisToNanos * j10)));
                    return null;
                }
                f42666a.f42675i = ndVar.f42675i;
                ndVar.f42675i = null;
                return ndVar;
            }
            Object[] objArr3 = new Object[1];
            n((Process.myTid() >> 22) - 38, (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 89), 359537226 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1669096874, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            n((-46) - (ViewConfiguration.getTapTimeout() >> 16), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((-103) - TextUtils.getOffsetAfter("", 0)), 359537242 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1669096870, objArr4);
            long jLongValue = ((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue();
            nd.class.wait(f42667b);
            if (f42666a.f42675i == null) {
                Object[] objArr5 = new Object[1];
                n((-38) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (short) ((Process.myTid() >> 22) + 89), Color.rgb(0, 0, 0) + 376314443, View.resolveSizeAndState(0, 0, 0) - 1669096874, objArr5);
                Class<?> cls3 = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                n((ViewConfiguration.getScrollBarSize() >> 8) - 46, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 103), 359537242 - View.MeasureSpec.getSize(0), (-1669096870) - (ViewConfiguration.getScrollBarSize() >> 8), objArr6);
                if (((Long) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() - jLongValue >= f42668c) {
                    return f42666a;
                }
            }
            return null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void g() {
        f42670h = -128380141;
        f42669g = 315160208;
        f42671j = 1907658930;
        f42672k = new byte[]{9, 62, Constants.CVR_B1b41_1110_ONLINE_PIN, 7, 107, GenerateAcResponseApdu.DDA_HEADER, -56, 6, MessageUtils.MESSAGE_18_DC2, 58, 67, -46, 52, MessageUtils.MESSAGE_26_SUB, 56, -7, -51, -38, -22, -50, -46, -4, -90, -90};
    }

    public static void init$0() {
        $$a = new byte[]{19, -45, Constants.STATE_ERROR, -5};
        $$b = 181;
    }

    private static void n(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        long j10;
        gy gyVar = new gy();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(f42669g)};
            int i13 = 0;
            Map map = bp.f40694x;
            Object method = map.get(-131541546);
            double d2 = 0.0d;
            if (method == null) {
                Class cls = (Class) bp.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, 1624 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                byte b11 = (byte) 0;
                byte b12 = (byte) (b11 + 1);
                Object[] objArr3 = new Object[1];
                o(b11, b12, (byte) (b12 - 1), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-131541546, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            int i14 = iIntValue == -1 ? 1 : 0;
            if (i14 == 0) {
                j10 = 8685730852850169510L;
            } else {
                byte[] bArr = f42672k;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i15 = 0;
                    while (i15 < length) {
                        Object[] objArr4 = new Object[1];
                        objArr4[i13] = Integer.valueOf(bArr[i15]);
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1703225588);
                        if (method2 == null) {
                            Class cls3 = (Class) bp.a(24 - (CdmaCellLocation.convertQuartSecToDecDegrees(i13) > d2 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i13) == d2 ? 0 : -1)), 1167 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (45988 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                            byte b13 = (byte) i13;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            o(b13, b14, b14, objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], Integer.TYPE);
                            map2.put(1703225588, method2);
                        }
                        bArr2[i15] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i15++;
                        i13 = 0;
                        d2 = 0.0d;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f42672k;
                    Object[] objArr6 = {Integer.valueOf(i11), Integer.valueOf(f42670h)};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-131541546);
                    if (method3 == null) {
                        Class cls4 = (Class) bp.a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (ViewConfiguration.getPressedStateDuration() >> 16) + 1624, (char) ('0' - AndroidCharacter.getMirror('0')));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 1);
                        Object[] objArr7 = new Object[1];
                        o(b15, b16, (byte) (b16 - 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str2, cls5, cls5);
                        map3.put(-131541546, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr6)).intValue()]) ^ 8685730852850169510L)) + ((int) (((long) f42669g) ^ 8685730852850169510L)));
                    j10 = 8685730852850169510L;
                } else {
                    j10 = 8685730852850169510L;
                    iIntValue = (short) (((short) (((long) m[i11 + ((int) (((long) f42670h) ^ 8685730852850169510L))]) ^ 8685730852850169510L)) + ((int) (((long) f42669g) ^ 8685730852850169510L)));
                }
            }
            if (iIntValue > 0) {
                gyVar.f41841b = ((i11 + iIntValue) - 2) + ((int) (((long) f42670h) ^ j10)) + i14;
                Object[] objArr8 = {gyVar, Integer.valueOf(i12), Integer.valueOf(f42671j), sb2};
                Map map4 = bp.f40694x;
                Object method4 = map4.get(-1555392445);
                if (method4 == null) {
                    Class cls6 = (Class) bp.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1482, (char) (KeyEvent.getMaxKeyCode() >> 16));
                    byte b17 = (byte) 0;
                    byte b18 = (byte) (b17 + 2);
                    Object[] objArr9 = new Object[1];
                    o(b17, b18, (byte) (b18 - 2), objArr9);
                    String str3 = (String) objArr9[0];
                    Class<?> cls7 = Integer.TYPE;
                    method4 = cls6.getMethod(str3, Object.class, cls7, cls7, Object.class);
                    map4.put(-1555392445, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr8)).append(gyVar.f41843e);
                gyVar.f41842d = gyVar.f41843e;
                byte[] bArr4 = f42672k;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 8685730852850169510L);
                    }
                    bArr4 = bArr5;
                }
                boolean z10 = bArr4 != null;
                gyVar.f41840a = 1;
                while (gyVar.f41840a < iIntValue) {
                    if (z10) {
                        byte[] bArr6 = f42672k;
                        int i17 = gyVar.f41841b;
                        gyVar.f41841b = i17 - 1;
                        gyVar.f41843e = (char) (gyVar.f41842d + (((byte) (((byte) (((long) bArr6[i17]) ^ 8685730852850169510L)) + s4)) ^ b10));
                    } else {
                        short[] sArr = m;
                        int i18 = gyVar.f41841b;
                        gyVar.f41841b = i18 - 1;
                        gyVar.f41843e = (char) (gyVar.f41842d + (((short) (((short) (((long) sArr[i18]) ^ 8685730852850169510L)) + s4)) ^ b10));
                    }
                    sb2.append(gyVar.f41843e);
                    gyVar.f41842d = gyVar.f41843e;
                    gyVar.f41840a++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void o(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.facetec.sdk.nd.$$a
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r7 = r7 + 66
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L34:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.nd.o(byte, byte, int, java.lang.Object[]):void");
    }

    public final boolean a() {
        if (!this.f42673e) {
            return false;
        }
        this.f42673e = false;
        return e(this);
    }

    public final void d() {
        if (this.f42673e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jA_ = a_();
        boolean zB_ = b_();
        if (jA_ != 0 || zB_) {
            this.f42673e = true;
            d(this, jA_, zB_);
        }
    }

    public void e() {
    }

    private static synchronized boolean e(nd ndVar) {
        nd ndVar2 = f42666a;
        while (ndVar2 != null) {
            nd ndVar3 = ndVar2.f42675i;
            if (ndVar3 == ndVar) {
                ndVar2.f42675i = ndVar.f42675i;
                ndVar.f42675i = null;
                return false;
            }
            ndVar2 = ndVar3;
        }
        return true;
    }

    public final void a(boolean z10) throws IOException {
        if (a() && z10) {
            throw d((IOException) null);
        }
    }

    private static synchronized void d(nd ndVar, long j10, boolean z10) {
        if (f42666a == null) {
            f42666a = new nd();
            new c().start();
        }
        try {
            Object[] objArr = new Object[1];
            n((-38) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (short) (View.combineMeasuredStates(0, 0) + 89), 359537227 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0') - 1669096873, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            n((ViewConfiguration.getDoubleTapTimeout() >> 16) - 46, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (short) (TextUtils.lastIndexOf("", '0', 0) - 102), View.getDefaultSize(0, 0) + 359537242, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1669096871, objArr2);
            long jLongValue = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue();
            if (j10 != 0 && z10) {
                ndVar.f42674f = Math.min(j10, ndVar.c_() - jLongValue) + jLongValue;
            } else if (j10 != 0) {
                ndVar.f42674f = j10 + jLongValue;
            } else if (z10) {
                ndVar.f42674f = ndVar.c_();
            } else {
                throw new AssertionError();
            }
            long jE = ndVar.e(jLongValue);
            nd ndVar2 = f42666a;
            while (true) {
                nd ndVar3 = ndVar2.f42675i;
                if (ndVar3 == null || jE < ndVar3.e(jLongValue)) {
                    break;
                    break;
                }
                ndVar2 = ndVar2.f42675i;
            }
            ndVar.f42675i = ndVar2.f42675i;
            ndVar2.f42675i = ndVar;
            if (ndVar2 == f42666a) {
                nd.class.notify();
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private long e(long j10) {
        return this.f42674f - j10;
    }

    public final IOException e(IOException iOException) throws IOException {
        return !a() ? iOException : d(iOException);
    }

    public IOException d(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
