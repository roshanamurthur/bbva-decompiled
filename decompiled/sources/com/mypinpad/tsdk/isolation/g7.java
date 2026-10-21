package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g7 extends FunctionReferenceImpl implements Function3<Integer, String, Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f55632p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55633q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55634r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55635s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55636t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f55637u0 = null;

    static {
        c();
        f55635s0 = 0;
        f55636t0 = 1;
        f55633q0 = 0;
        f55634r0 = 1;
        f55632p0 = -443079984;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g7(ss ssVar) throws Throwable {
        Object[] objArr = new Object[1];
        a(11 - ((Process.getThreadPriority(0) + 20) >> 6), 109 - View.MeasureSpec.makeMeasureSpec(0, 0), 2 - View.combineMeasuredStates(0, 0), "\u0000\r\u0002\n\uffe7\uffff\u0000\u000f\ufffe￼\uffff", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(74 - (ViewConfiguration.getScrollBarSize() >> 8), 103 - TextUtils.getCapsMode("", 0, 0), View.combineMeasuredStates(0, 0) + 36, "\u0002\u000b￭￪\uffc9\u0006\u0014\u0002\u0006\r\u0006\u0013\u0000\u0005\n\u0010\u0013\u0005\u000f\u0002\u0000\f\u0005\u0014ￅ\b\u0010￭\u0005\u0006\u0015\u0004\u0002\u0005\u0006\u0013\ufff7ￊￜ\u0006\r\u0003\u0002\u0018\u0010\u0013\t\ufff5\uffd0\b\u000f\u0002\r\uffd0\u0002\u0017\u0002\u000b￭ￜ\b\u000f\n\u0013\u0015\ufff4\uffd0\b\u000f\u0002\r\uffd0\u0002\u0017", objArr2);
        super(3, ssVar, ss.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e6  */
    public static void a(int i10, int i11, int i12, String str, Object[] objArr) throws Throwable {
        char[] charArray;
        Throwable cause;
        int i13 = f55636t0 + 49;
        f55635s0 = i13 % 128;
        int i14 = 2;
        char c10 = 0;
        if (i13 % 2 != 0) {
            charArray = str.toCharArray();
            int i15 = 12 / 0;
        } else {
            charArray = str.toCharArray();
        }
        int i16 = f55636t0 + 91;
        f55635s0 = i16 % 128;
        int i17 = i16 % 2;
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        int i18 = f55635s0 + 91;
        f55636t0 = i18 % 128;
        int i19 = i18 % 2;
        while (true) {
            int i20 = getnavbartitlestring.setY;
            if (i20 >= i10) {
                break;
            }
            int i21 = f55636t0 + 83;
            f55635s0 = i21 % 128;
            int i22 = i21 % i14;
            char c11 = charArray[i20];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c11;
            char c12 = (char) (i11 + c11);
            cArr[i20] = c12;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(f55632p0);
                objArr2[c10] = Integer.valueOf(c12);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 40 - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 482);
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i20] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55965 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777259, Process.getGidForName("") + 2269);
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 + 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 2;
                c10 = 0;
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
        if (i12 > 0) {
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i23 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i23, i23);
            int i24 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i24, cArr, 0, i10 - i24);
        }
        int i25 = f55635s0 + 87;
        f55636t0 = i25 % 128;
        int i26 = i25 % 2;
        char[] cArr3 = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i27 = getnavbartitlestring.setY;
            if (i27 >= i10) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i28 = f55635s0 + 105;
            f55636t0 = i28 % 128;
            int i29 = i28 % 2;
            cArr3[i27] = cArr[(i10 - i27) - 1];
            Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 55966), (KeyEvent.getMaxKeyCode() >> 16) + 43, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2267);
                byte b14 = (byte) (-1);
                byte b15 = (byte) (b14 + 1);
                Object[] objArr7 = new Object[1];
                b(b14, b15, (byte) (b15 + 1), objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r8 = 66 - r8
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.g7.f55637u0
            if (r2 != 0) goto L14
            r4 = r8
            r3 = r1
            r8 = r7
            r7 = r6
            goto L2c
        L14:
            r3 = r1
        L15:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L22:
            int r6 = r6 + 1
            r4 = r2[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.g7.b(short, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55637u0 = new byte[]{28, 69, -30, 27};
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, String str, Throwable th2) {
        int i10 = f55633q0 + 69;
        f55634r0 = i10 % 128;
        int i11 = i10 % 2;
        int iIntValue = num.intValue();
        int i12 = f55633q0 + 25;
        f55634r0 = i12 % 128;
        int i13 = i12 % 2;
        ss.setX(new Object[]{Integer.valueOf(iIntValue), str, th2}, -311013729, 311013730, iIntValue);
        int i14 = f55634r0 + 77;
        f55633q0 = i14 % 128;
        int i15 = i14 % 2;
        Unit unit = Unit.INSTANCE;
        int i16 = f55633q0 + 63;
        f55634r0 = i16 % 128;
        int i17 = i16 % 2;
        return unit;
    }
}
