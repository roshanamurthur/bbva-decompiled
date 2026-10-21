package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class w9 extends FunctionReferenceImpl implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f61613p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f61614q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61615r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61616s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final byte[] f61617t0 = null;

    static {
        c();
        f61615r0 = 0;
        f61616s0 = 1;
        f61614q0 = 3901010898986712308L;
        f61613p0 = new char[]{17280, 14689, 46678, 13108, 43044, 9477, 41672, 8153, 38086, 4498, 36509, 1121, 33149, 32325, 64299, 28676, 61573, 35428, 1363, 32817, 6945, 38400, 4557, 44252, 10179, 41623, 15768, 46948, 12920, 52544, 18478, 49921, 24133, 55724, 21739};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w9(Object obj) throws Throwable {
        Object[] objArr = new Object[1];
        a((char) (View.resolveSize(0, 0) + 34292), ViewConfiguration.getKeyRepeatDelay() >> 16, 16 - TextUtils.getTrimmedLength(""), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (AndroidCharacter.getMirror('0') + 14017), 15 - TextUtils.lastIndexOf("", '0', 0), 19 - Color.red(0), objArr2);
        super(0, obj, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x01d9  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        long j10;
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i12 = setcompounddrawabletintblendmode.setDividerPadding;
            j10 = 0;
            if (i12 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f61613p0[i10 + i12])};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.getSize(0), 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), 729 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f61614q0), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (46116 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 43 - Color.argb(0, 0, 0, 0), 1776 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b((byte) (b13 + 1), b12, b13, objArr5);
                    String str = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 27, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2311);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b((byte) (b15 + 5), b14, b15, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method3);
                }
                ((Method) method3).invoke(null, objArr6);
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
        char[] cArr = new char[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i13 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i13] = (char) jArr[i13];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object method4 = map2.get(1606688712);
            if (method4 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionType(j10) + 27, 2311 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr9 = new Object[1];
                b((byte) (b17 + 5), b16, b17, objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            j10 = 0;
        }
    }

    public static void b(int i10, short s4, short s7, Object[] objArr) {
        int i11 = s4 * 3;
        int i12 = i10 + 67;
        int i13 = 4 - (s7 * 2);
        byte[] bArr = new byte[1 - i11];
        int i14 = 0 - i11;
        int i15 = -1;
        byte[] bArr2 = f61617t0;
        if (bArr2 == null) {
            i12 += i13;
            i13++;
            objArr = objArr;
            bArr = bArr;
            i15 = -1;
            bArr2 = bArr2;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr[i16] = (byte) i12;
            if (i16 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            Object[] objArr2 = objArr;
            int i17 = i13;
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            i12 += bArr2[i13];
            i13 = i17 + 1;
            objArr = objArr2;
            bArr = bArr4;
            i15 = i16;
            bArr2 = bArr3;
        }
    }

    public static void c() {
        f61617t0 = new byte[]{100, -100, -71, -56};
    }

    public final void d() throws Throwable {
        int i10 = f61616s0 + 99;
        f61615r0 = i10 % 128;
        if (i10 % 2 == 0) {
            ul.setX((ul) this.receiver);
        } else {
            ul.setX((ul) this.receiver);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() throws Throwable {
        int i10 = f61615r0 + 119;
        f61616s0 = i10 % 128;
        int i11 = i10 % 2;
        d();
        if (i11 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i12 = f61616s0 + 69;
        f61615r0 = i12 % 128;
        if (i12 % 2 == 0) {
            return unit2;
        }
        throw null;
    }
}
