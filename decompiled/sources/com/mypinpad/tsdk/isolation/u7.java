package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
final class u7 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f61249q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final long f61250r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61251s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f61252t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f61253u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f61254w0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setOnTouchListener f61255p0;

    static {
        c();
        f61253u0 = 0;
        v0 = 1;
        f61251s0 = 0;
        f61252t0 = 1;
        f61250r0 = 3649320846027450294L;
        f61249q0 = new char[]{50796, 59351, 34108, 41610, 50803, 59331, 34108, 41618, 16577, 28218};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(setOnTouchListener setontouchlistener) {
        super(1);
        this.f61255p0 = setontouchlistener;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x03be  */
    /* JADX WARN: Code duplicated, block: B:69:0x03bf  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Object method;
        Throwable cause;
        int i12 = i11;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i12];
        int i13 = 0;
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        int i14 = 1;
        int i15 = v0 + 1;
        f61253u0 = i15 % 128;
        int i16 = 2;
        int i17 = i15 % 2;
        while (true) {
            int i18 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i18 >= i12) {
                break;
            }
            int i19 = f61253u0 + 111;
            v0 = i19 % 128;
            int i20 = i19 % i16;
            long j10 = f61250r0;
            char[] cArr = f61249q0;
            byte[] bArr = f61254w0;
            if (i20 == 0) {
                char c11 = cArr[i10 - i18];
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[i13] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method2 = map.get(1832327647);
                    if (method2 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 44 - View.MeasureSpec.getMode(i13), 729 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        byte b10 = (byte) i13;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[i14];
                        b(b11, (byte) (b11 + 5), b10, objArr3);
                        String str = (String) objArr3[0];
                        Class<?>[] clsArr = new Class[i14];
                        clsArr[0] = Integer.TYPE;
                        method2 = cls.getMethod(str, clsArr);
                        map.put(1832327647, method2);
                    }
                    Object[] objArr4 = {Long.valueOf(((Long) ((Method) method2).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(j10), Integer.valueOf(c10)};
                    Object method3 = map.get(2012362404);
                    if (method3 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(0) + 46117), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 42, Gravity.getAbsoluteGravity(0, 0) + 1776);
                        byte b12 = (byte) 0;
                        Object[] objArr5 = new Object[1];
                        b(b12, (byte) bArr.length, b12, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls3 = Long.TYPE;
                        method3 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                        map.put(2012362404, method3);
                    }
                    jArr[i18] = ((Long) ((Method) method3).invoke(null, objArr4)).longValue();
                    Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                    Object method4 = map.get(1606688712);
                    if (method4 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf("", "", 0, 0) + 27, (ViewConfiguration.getScrollBarSize() >> 8) + 2311);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr7 = new Object[1];
                        b(b14, b14, b13, objArr7);
                        method4 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map.put(1606688712, method4);
                    }
                    ((Method) method4).invoke(null, objArr6);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                Object[] objArr8 = {Integer.valueOf(cArr[i10 + i18])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method5 = map2.get(1832327647);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 727);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    b(b16, (byte) (b16 + 5), b15, objArr9);
                    method5 = cls5.getMethod((String) objArr9[0], Integer.TYPE);
                    map2.put(1832327647, method5);
                }
                Object[] objArr10 = {Long.valueOf(((Long) ((Method) method5).invoke(null, objArr8)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(j10), Integer.valueOf(c10)};
                Object method6 = map2.get(2012362404);
                if (method6 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (46116 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44, 1777 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    byte b17 = (byte) 0;
                    Object[] objArr11 = new Object[1];
                    b(b17, (byte) bArr.length, b17, objArr11);
                    String str3 = (String) objArr11[0];
                    Class<?> cls7 = Long.TYPE;
                    method6 = cls6.getMethod(str3, cls7, cls7, cls7, Integer.TYPE);
                    map2.put(2012362404, method6);
                }
                jArr[i18] = ((Long) ((Method) method6).invoke(null, objArr10)).longValue();
                Object[] objArr12 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method7 = map2.get(1606688712);
                if (method7 == null) {
                    Class cls8 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 28, 2311 - KeyEvent.normalizeMetaState(0));
                    byte b18 = (byte) 0;
                    byte b19 = b18;
                    Object[] objArr13 = new Object[1];
                    b(b19, b19, b18, objArr13);
                    method7 = cls8.getMethod((String) objArr13[0], Object.class, Object.class);
                    map2.put(1606688712, method7);
                }
                ((Method) method7).invoke(null, objArr12);
            }
            i12 = i11;
            i13 = 0;
            i14 = 1;
            i16 = 2;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr2 = new char[i12];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i21 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i21 >= i12) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i22 = f61253u0 + 21;
            v0 = i22 % 128;
            if (i22 % 2 == 0) {
                cArr2[i21] = (char) jArr[i21];
                Object[] objArr14 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Map map3 = setTextScaleX.setMaxEms;
                Object method8 = map3.get(1606688712);
                if (method8 == null) {
                    Class cls9 = (Class) setTextScaleX.setX((char) (Process.getGidForName("") + 1), 27 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2311 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b20 = (byte) 0;
                    byte b21 = b20;
                    Object[] objArr15 = new Object[1];
                    b(b21, b21, b20, objArr15);
                    method8 = cls9.getMethod((String) objArr15[0], Object.class, Object.class);
                    map3.put(1606688712, method8);
                }
                ((Method) method8).invoke(null, objArr14);
                throw null;
            }
            cArr2[i21] = (char) jArr[i21];
            Object[] objArr16 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map4 = setTextScaleX.setMaxEms;
            Object obj = map4.get(1606688712);
            if (obj != null) {
                method = obj;
            } else {
                Class cls10 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 27, 2311 - KeyEvent.getDeadChar(0, 0));
                byte b22 = (byte) 0;
                byte b23 = b22;
                Object[] objArr17 = new Object[1];
                b(b23, b23, b22, objArr17);
                method = cls10.getMethod((String) objArr17[0], Object.class, Object.class);
                map4.put(1606688712, method);
            }
            ((Method) method).invoke(null, objArr16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 72 - r7
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.u7.f61254w0
            if (r2 != 0) goto L18
            r7 = r6
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L32
        L18:
            r3 = r1
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            r3 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L32:
            int r6 = r6 + r8
            int r7 = r7 + 1
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.u7.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f61254w0 = new byte[]{58, 74, 17, 39};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f61251s0 + 115;
        f61252t0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.resolveSize(0, 0), 4 - Color.alpha(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        setOnTouchListener setontouchlistener = this.f61255p0;
        mo.setY(new Object[]{moVar, strIntern, (String) setOnTouchListener.setY(new Object[]{setontouchlistener}, 103510472, -103510471, System.identityHashCode(setontouchlistener))}, -52655784, 52655794, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 6 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), (String) setOnTouchListener.setY(new Object[]{setontouchlistener}, -1408297812, 1408297812, System.identityHashCode(setontouchlistener))}, -52655784, 52655794, System.identityHashCode(moVar));
        int i12 = f61252t0 + 77;
        f61251s0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f61251s0 + 73;
        f61252t0 = i10 % 128;
        int i11 = i10 % 2;
        d(moVar);
        Unit unit = Unit.INSTANCE;
        int i12 = f61252t0 + 9;
        f61251s0 = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }
}
