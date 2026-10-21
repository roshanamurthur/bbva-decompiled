package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
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

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setIndeterminate;", "", "setY", "setOnFocusChangeListener", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class setIndeterminate {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getNavBarTitleString;
    private static final /* synthetic */ setIndeterminate[] setCompoundDrawableTintBlendMode;
    public static final setIndeterminate setDividerPadding;
    private static int setNavigationOnClickListener;
    private static long setOnDragListener;
    public static final setIndeterminate setOnFocusChangeListener;
    private static char[] setX;
    public static final setIndeterminate setY;

    static {
        setIndeterminate[] setindeterminateArr;
        c();
        $10 = 0;
        $11 = 1;
        setNavigationOnClickListener = 0;
        getNavBarTitleString = 1;
        d();
        Object[] objArr = new Object[1];
        a((char) (47169 - (Process.myPid() >> 22)), (-1) - ExpandableListView.getPackedPositionChild(0L), 8 - Color.alpha(0), objArr);
        setIndeterminate setindeterminate = new setIndeterminate(((String) objArr[0]).intern(), 0);
        setY = setindeterminate;
        Object[] objArr2 = new Object[1];
        a((char) (Color.blue(0) + 26402), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, 6 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
        setIndeterminate setindeterminate2 = new setIndeterminate(((String) objArr2[0]).intern(), 1);
        setOnFocusChangeListener = setindeterminate2;
        Object[] objArr3 = new Object[1];
        a((char) (Gravity.getAbsoluteGravity(0, 0) + 49553), 15 - KeyEvent.keyCodeFromString(""), 8 - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
        setIndeterminate setindeterminate3 = new setIndeterminate(((String) objArr3[0]).intern(), 2);
        setDividerPadding = setindeterminate3;
        int i10 = getNavBarTitleString + 65;
        int i11 = i10 % 128;
        setNavigationOnClickListener = i11;
        if (i10 % 2 != 0) {
            setindeterminateArr = new setIndeterminate[4];
            setindeterminateArr[0] = setindeterminate;
            setindeterminateArr[1] = setindeterminate2;
            setindeterminateArr[4] = setindeterminate3;
        } else {
            setindeterminateArr = new setIndeterminate[]{setindeterminate, setindeterminate2, setindeterminate3};
        }
        int i12 = i11 + 95;
        getNavBarTitleString = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        setCompoundDrawableTintBlendMode = setindeterminateArr;
        int i13 = i11 + 45;
        getNavBarTitleString = i13 % 128;
        int i14 = i13 % 2;
    }

    public setIndeterminate() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f6  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        int i12 = 0;
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i13 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i12] = Integer.valueOf(setX[i10 + i13]);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", i12), (ViewConfiguration.getTouchSlop() >> 8) + 44, 728 - View.MeasureSpec.getSize(i12));
                    byte b10 = (byte) 5;
                    byte b11 = (byte) (b10 - 5);
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    String str = (String) objArr3[i12];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i12] = Integer.TYPE;
                    method = cls.getMethod(str, clsArr);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(setOnDragListener), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 46116), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42, 1776 - View.MeasureSpec.getSize(0));
                    byte length = (byte) $$a.length;
                    byte b12 = (byte) (length - 4);
                    Object[] objArr5 = new Object[1];
                    b(length, b12, b12, objArr5);
                    String str2 = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i13] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) KeyEvent.keyCodeFromString(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 26, 2311 - Color.alpha(0));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    b(b13, b14, b14, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                int i14 = $11 + 107;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                i12 = 0;
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
            int i16 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i16 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = $10 + 119;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr[i16] = (char) jArr[i16];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object method4 = map2.get(1606688712);
            if (method4 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), 27 - (ViewConfiguration.getWindowTouchSlop() >> 8), Color.red(0) + 2311);
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr9 = new Object[1];
                b(b15, b16, b16, objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            int i19 = $11 + 109;
            $10 = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 72 - r6
            byte[] r0 = com.mypinpad.tsdk.isolation.setIndeterminate.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L32
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L32:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setIndeterminate.b(int, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{122, -107, 66, -93};
        $$b = 200;
    }

    public static void d() {
        setOnDragListener = 735708837790013731L;
        setX = new char[]{32270, 24886, 16482, 9134, 741, 57895, 50549, 42144, 41325, 48713, 40713, 64709, 56726, 15680, 6656, 2014, 6394, 14758, 23158, 31543, 39930, 48306, 56688};
    }

    public static setIndeterminate valueOf(String str) {
        int i10 = getNavBarTitleString + 17;
        setNavigationOnClickListener = i10 % 128;
        int i11 = i10 % 2;
        setIndeterminate setindeterminate = (setIndeterminate) Enum.valueOf(setIndeterminate.class, str);
        if (i11 != 0) {
            int i12 = 16 / 0;
        }
        int i13 = setNavigationOnClickListener + 41;
        getNavBarTitleString = i13 % 128;
        int i14 = i13 % 2;
        return setindeterminate;
    }

    public static setIndeterminate[] values() {
        int i10 = getNavBarTitleString + 119;
        setNavigationOnClickListener = i10 % 128;
        if (i10 % 2 == 0) {
            return (setIndeterminate[]) setCompoundDrawableTintBlendMode.clone();
        }
        int i11 = 21 / 0;
        return (setIndeterminate[]) setCompoundDrawableTintBlendMode.clone();
    }
}
