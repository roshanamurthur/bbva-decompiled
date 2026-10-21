package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/sz;", "", "setY", "setX", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setOnFocusChangeListener"}, k = 1, mv = {1, 8, 0})
public final class sz {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getNavBarTitleString;
    public static final sz setCompoundDrawableTintBlendMode;
    public static final sz setDividerPadding;
    private static final /* synthetic */ sz[] setLayoutAnimation;
    private static int setNavigationOnClickListener;
    private static char setOnDragListener;
    public static final sz setOnFocusChangeListener;
    private static char[] setOnLongClickListener;
    public static final sz setX;
    public static final sz setY;

    static {
        c();
        $10 = 0;
        $11 = 1;
        getNavBarTitleString = 0;
        setNavigationOnClickListener = 1;
        d();
        Object[] objArr = new Object[1];
        a(View.resolveSize(0, 0) + 4, "\f\u0007\u0001\u0012", (byte) (42 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr);
        sz szVar = new sz(((String) objArr[0]).intern(), 0);
        setY = szVar;
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 5, "\u0006\u0015\u0016\u0007㗛", (byte) (24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr2);
        sz szVar2 = new sz(((String) objArr2[0]).intern(), 1);
        setX = szVar2;
        Object[] objArr3 = new Object[1];
        a(10 - TextUtils.indexOf("", "", 0, 0), "\f\u000f\u0001\u000e\u000b\u0002\u0012\u0003\u0011\u0004", (byte) (ExpandableListView.getPackedPositionType(0L) + 49), objArr3);
        sz szVar3 = new sz(((String) objArr3[0]).intern(), 2);
        setCompoundDrawableTintBlendMode = szVar3;
        Object[] objArr4 = new Object[1];
        a(11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0012\n\u0006\u0015\u000b\u0002\u0012\u0003\u0011\u0004", (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 63), objArr4);
        sz szVar4 = new sz(((String) objArr4[0]).intern(), 3);
        setDividerPadding = szVar4;
        Object[] objArr5 = new Object[1];
        a(8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0007\f\b\u0010\u000b\b㘤", (byte) (69 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr5);
        sz szVar5 = new sz(((String) objArr5[0]).intern(), 4);
        setOnFocusChangeListener = szVar5;
        int i10 = getNavBarTitleString + 73;
        int i11 = i10 % 128;
        setNavigationOnClickListener = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 75;
        getNavBarTitleString = i13 % 128;
        int i14 = i13 % 2;
        setLayoutAnimation = new sz[]{szVar, szVar2, szVar3, szVar4, szVar5};
        int i15 = i11 + 107;
        getNavBarTitleString = i15 % 128;
        int i16 = i15 % 2;
    }

    public sz() {
        throw null;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        char c10;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = setOnLongClickListener;
        int i12 = 2;
        char c11 = '0';
        int i13 = 290255894;
        int i14 = 0;
        if (cArr != null) {
            int i15 = $10 + 41;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                int i18 = $10 + 17;
                $11 = i18 % 128;
                if (i18 % i12 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i14] = Integer.valueOf(cArr[i17]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i13));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", c11)), 45 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Drawable.resolveOpacity(i14, i14) + 1116);
                            byte b11 = (byte) i14;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            b(b12, b11, b12, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(290255894, method);
                        }
                        cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr[i17])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(290255894);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), (Process.myTid() >> 22) + 45, 1116 - Color.green(0));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b14, b13, b14, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(290255894, method2);
                    }
                    cArr2[i17] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                }
                i17++;
                i12 = 2;
                c11 = '0';
                i13 = 290255894;
                i14 = 0;
            }
            cArr = cArr2;
        }
        Object[] objArr6 = {Integer.valueOf(setOnDragListener)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method3 = map3.get(290255894);
        char c12 = '\b';
        if (method3 == null) {
            Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.getTrimmedLength(""), 45 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1116 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            byte b15 = (byte) 0;
            byte b16 = b15;
            Object[] objArr7 = new Object[1];
            b(b16, b15, b16, objArr7);
            method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
            map3.put(290255894, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i19 = setincludefontpadding.setDividerPadding;
                if (i19 >= i11) {
                    break;
                }
                char c13 = charArray[i19];
                setincludefontpadding.setY = c13;
                int i20 = i19 + 1;
                char c14 = charArray[i20];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c14;
                if (c13 == c14) {
                    cArr3[i19] = (char) (c13 - b10);
                    cArr3[i20] = (char) (c14 - b10);
                    c10 = c12;
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = setincludefontpadding;
                    objArr8[11] = Integer.valueOf(cCharValue);
                    objArr8[10] = setincludefontpadding;
                    objArr8[9] = setincludefontpadding;
                    objArr8[c12] = Integer.valueOf(cCharValue);
                    objArr8[7] = setincludefontpadding;
                    objArr8[6] = setincludefontpadding;
                    objArr8[5] = Integer.valueOf(cCharValue);
                    objArr8[4] = setincludefontpadding;
                    objArr8[3] = setincludefontpadding;
                    objArr8[2] = Integer.valueOf(cCharValue);
                    objArr8[1] = setincludefontpadding;
                    objArr8[0] = setincludefontpadding;
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(180437302);
                    if (method4 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 27 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2312);
                        byte b17 = (byte) ($$b & 15);
                        byte b18 = (byte) (b17 - 3);
                        Object[] objArr9 = new Object[1];
                        b(b18, b17, b18, objArr9);
                        String str2 = (String) objArr9[0];
                        Class<?> cls5 = Integer.TYPE;
                        method4 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map4.put(180437302, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    int i21 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i21) {
                        Object[] objArr10 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method5 = map4.get(1989802713);
                        if (method5 != null) {
                            c10 = '\b';
                        } else {
                            Class cls6 = (Class) setTextScaleX.setX((char) (49103 - Color.argb(0, 0, 0, 0)), ImageFormat.getBitsPerPixel(0) + 36, 2545 - (ViewConfiguration.getEdgeSlop() >> 16));
                            byte b19 = (byte) 0;
                            Object[] objArr11 = new Object[1];
                            b(b19, (byte) 7, b19, objArr11);
                            String str3 = (String) objArr11[0];
                            Class<?> cls7 = Integer.TYPE;
                            c10 = '\b';
                            method5 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map4.put(1989802713, method5);
                        }
                        int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                        int i22 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i23 = setincludefontpadding.setDividerPadding;
                        cArr3[i23] = cArr[iIntValue2];
                        cArr3[i23 + 1] = cArr[i22];
                    } else {
                        c10 = '\b';
                        int i24 = setincludefontpadding.setX;
                        int i25 = setincludefontpadding.setOnFocusChangeListener;
                        if (i24 == i25) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i21, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i26 = (i25 * cCharValue) + iA2;
                            int i27 = setincludefontpadding.setDividerPadding;
                            cArr3[i27] = cArr[(i24 * cCharValue) + iA];
                            cArr3[i27 + 1] = cArr[i26];
                        } else {
                            int i28 = (i24 * cCharValue) + i21;
                            int i29 = (i25 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i30 = setincludefontpadding.setDividerPadding;
                            cArr3[i30] = cArr[i28];
                            cArr3[i30 + 1] = cArr[i29];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                c12 = c10;
            }
        }
        for (int i31 = 0; i31 < i10; i31++) {
            cArr3[i31] = (char) (cArr3[i31] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 + 99
            byte[] r0 = com.mypinpad.tsdk.isolation.sz.$$a
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L30:
            int r8 = -r8
            int r7 = r7 + r8
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.sz.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{89, 113, 13, -86};
        $$b = 51;
    }

    public static void d() {
        setOnDragListener = (char) 53956;
        setOnLongClickListener = new char[]{53956, 59145, 59167, 59159, 59160, 53952, 59144, 59154, 53955, 53954, 59161, 59152, 59164, 59156, 53961, 59165, 59166, 59162, 59147, 59157, 53958, 59138, 53957, 59150, 53959};
    }

    public static sz valueOf(String str) {
        int i10 = setNavigationOnClickListener + 61;
        getNavBarTitleString = i10 % 128;
        int i11 = i10 % 2;
        sz szVar = (sz) Enum.valueOf(sz.class, str);
        if (i11 != 0) {
            int i12 = 87 / 0;
        }
        return szVar;
    }

    public static sz[] values() {
        int i10 = getNavBarTitleString + 15;
        setNavigationOnClickListener = i10 % 128;
        int i11 = i10 % 2;
        sz[] szVarArr = (sz[]) setLayoutAnimation.clone();
        int i12 = setNavigationOnClickListener + 17;
        getNavBarTitleString = i12 % 128;
        int i13 = i12 % 2;
        return szVarArr;
    }
}
