package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "d", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class a8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f52000q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52001r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52002s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52003t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52004u0;
    public static final byte[] v0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ getTotalElapsedTimeout f52005p0;

    static {
        c();
        f52003t0 = 0;
        f52004u0 = 1;
        f52001r0 = 0;
        f52002s0 = 1;
        f52000q0 = 6727108134284773922L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(getTotalElapsedTimeout gettotalelapsedtimeout) {
        super(1);
        this.f52005p0 = gettotalelapsedtimeout;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x01a1  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f52004u0 + 123;
        int i12 = i11 % 128;
        f52003t0 = i12;
        char c10 = 2;
        int i13 = i11 % 2;
        int i14 = i12 + 91;
        f52004u0 = i14 % 128;
        if (i14 % 2 == 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i15 >= charArray.length) {
                break;
            }
            char c11 = charArray[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1195);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f52000q0 ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 43 - ((byte) KeyEvent.getModifierMetaStateMask()), 729 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, b12, (byte) (b13 - 1), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                int i16 = f52003t0 + 123;
                f52004u0 = i16 % 128;
                int i17 = i16 % 2;
                c10 = 2;
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
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i18 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i18 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i19 = f52003t0 + 87;
            f52004u0 = i19 % 128;
            int i20 = i19 % 2;
            cArr[i18] = (char) jArr[i18];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 727);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 + 1);
                Object[] objArr7 = new Object[1];
                b(b15, b14, (byte) (b15 - 1), objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 110 - r6
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.a8.v0
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L35
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            int r8 = r8 + 1
            r3 = r2[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L35:
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.a8.b(int, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        v0 = new byte[]{72, 66, 70, -36};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f52002s0 + 25;
        f52001r0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a("\ua9db䖙煂洷", Color.rgb(0, 0, 0) + 16837709, objArr);
        String strIntern = ((String) objArr[0]).intern();
        getTotalElapsedTimeout gettotalelapsedtimeout = this.f52005p0;
        mo.setY(new Object[]{moVar, strIntern, (String) getTotalElapsedTimeout.setOnFocusChangeListener(new Object[]{gettotalelapsedtimeout}, -669080270, 669080270, System.identityHashCode(gettotalelapsedtimeout))}, -52655784, 52655794, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a("꧃欄ࡋ宛\ueaf4", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 20681, objArr2);
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), (String) getTotalElapsedTimeout.setOnFocusChangeListener(new Object[]{gettotalelapsedtimeout}, -88803646, 88803647, System.identityHashCode(gettotalelapsedtimeout))}, -52655784, 52655794, System.identityHashCode(moVar));
        int i12 = f52001r0 + 125;
        f52002s0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f52002s0 + 125;
        f52001r0 = i10 % 128;
        int i11 = i10 % 2;
        d(moVar);
        if (i11 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }
}
