package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setElegantTextHeight;", "", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode", "setX", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class setElegantTextHeight {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final setElegantTextHeight setCompoundDrawableTintBlendMode;
    public static final setElegantTextHeight setDividerPadding;
    private static int setLayoutAnimation;
    private static int setNavigationOnClickListener;
    public static final setElegantTextHeight setOnFocusChangeListener;
    private static char[] setOnLongClickListener;
    public static final setElegantTextHeight setX;
    private static final /* synthetic */ setElegantTextHeight[] setY;

    static {
        setElegantTextHeight[] seteleganttextheightArr;
        c();
        $10 = 0;
        $11 = 1;
        setNavigationOnClickListener = 0;
        setLayoutAnimation = 1;
        d();
        Object[] objArr = new Object[1];
        a("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001", false, new int[]{0, 14, 0, 0}, objArr);
        setElegantTextHeight seteleganttextheight = new setElegantTextHeight(((String) objArr[0]).intern(), 0);
        setOnFocusChangeListener = seteleganttextheight;
        Object[] objArr2 = new Object[1];
        a("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", true, new int[]{14, 13, 0, 11}, objArr2);
        setElegantTextHeight seteleganttextheight2 = new setElegantTextHeight(((String) objArr2[0]).intern(), 1);
        setCompoundDrawableTintBlendMode = seteleganttextheight2;
        Object[] objArr3 = new Object[1];
        a("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001", true, new int[]{27, 13, 0, 0}, objArr3);
        setElegantTextHeight seteleganttextheight3 = new setElegantTextHeight(((String) objArr3[0]).intern(), 2);
        setX = seteleganttextheight3;
        Object[] objArr4 = new Object[1];
        a("\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false, new int[]{40, 11, 29, 2}, objArr4);
        setElegantTextHeight seteleganttextheight4 = new setElegantTextHeight(((String) objArr4[0]).intern(), 3);
        setDividerPadding = seteleganttextheight4;
        int i10 = setNavigationOnClickListener + 125;
        int i11 = i10 % 128;
        setLayoutAnimation = i11;
        if (i10 % 2 == 0) {
            seteleganttextheightArr = new setElegantTextHeight[2];
            seteleganttextheightArr[0] = seteleganttextheight;
            seteleganttextheightArr[0] = seteleganttextheight2;
            seteleganttextheightArr[2] = seteleganttextheight3;
            seteleganttextheightArr[2] = seteleganttextheight4;
        } else {
            seteleganttextheightArr = new setElegantTextHeight[]{seteleganttextheight, seteleganttextheight2, seteleganttextheight3, seteleganttextheight4};
        }
        int i12 = i11 + 73;
        int i13 = i12 % 128;
        setNavigationOnClickListener = i13;
        int i14 = i12 % 2;
        setY = seteleganttextheightArr;
        int i15 = i13 + 107;
        setLayoutAnimation = i15 % 128;
        int i16 = i15 % 2;
    }

    public setElegantTextHeight() {
        throw null;
    }

    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        int i12;
        int i13 = $10;
        int i14 = i13 + 99;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i13 + 19;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i18 = 0;
        int i19 = iArr[0];
        int i20 = 1;
        int i21 = iArr[1];
        int i22 = iArr[2];
        int i23 = iArr[3];
        char[] cArr = setOnLongClickListener;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i24 = 0;
            while (i24 < length) {
                try {
                    Object[] objArr2 = new Object[i20];
                    objArr2[i18] = Integer.valueOf(cArr[i24]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) View.resolveSizeAndState(i18, i18, i18), 38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 608 - MotionEvent.axisFromString(""));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 3);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, (byte) (b11 - 4), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr2[i24] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i24++;
                    cArr = cArr;
                    length = length;
                    i22 = i22;
                    i23 = i23;
                    i18 = 0;
                    i20 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i22;
            i11 = i23;
            cArr = cArr2;
        } else {
            i10 = i22;
            i11 = i23;
        }
        char[] cArr3 = new char[i21];
        System.arraycopy(cArr, i19, cArr3, 0, i21);
        if (bytes != null) {
            char[] cArr4 = new char[i21];
            setnavigationonclicklistener.setX = 0;
            char c10 = 0;
            while (true) {
                int i25 = setnavigationonclicklistener.setX;
                if (i25 >= i21) {
                    break;
                }
                if (bytes[i25] == 1) {
                    int i26 = $11 + 105;
                    $10 = i26 % 128;
                    if (i26 % 2 != 0) {
                        Object[] objArr4 = {Integer.valueOf(cArr3[i25]), Integer.valueOf(c10)};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(1737824323);
                        if (method2 == null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf("", "", 0) + 4449), 43 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1020 - TextUtils.lastIndexOf("", '0', 0, 0));
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            Object[] objArr5 = new Object[1];
                            b(b12, b13, (byte) (b13 - 1), objArr5);
                            String str2 = (String) objArr5[0];
                            Class<?> cls3 = Integer.TYPE;
                            method2 = cls2.getMethod(str2, cls3, cls3);
                            map2.put(1737824323, method2);
                        }
                        cArr4[i25] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        int i27 = 12 / 0;
                    } else {
                        Object[] objArr6 = {Integer.valueOf(cArr3[i25]), Integer.valueOf(c10)};
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(1737824323);
                        if (method3 == null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) ((-16772767) - Color.rgb(0, 0, 0)), TextUtils.getCapsMode("", 0, 0) + 42, 1021 - ExpandableListView.getPackedPositionGroup(0L));
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            Object[] objArr7 = new Object[1];
                            b(b14, b15, (byte) (b15 - 1), objArr7);
                            String str3 = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method3 = cls4.getMethod(str3, cls5, cls5);
                            map3.put(1737824323, method3);
                        }
                        cArr4[i25] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    }
                } else {
                    Object[] objArr8 = {Integer.valueOf(cArr3[i25]), Integer.valueOf(c10)};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-504758789);
                    if (method4 == null) {
                        Class cls6 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> 16), 45 - TextUtils.getTrimmedLength(""), (Process.myPid() >> 22) + 2627);
                        byte length2 = (byte) $$a.length;
                        Object[] objArr9 = new Object[1];
                        b((byte) 0, length2, (byte) (length2 - 5), objArr9);
                        String str4 = (String) objArr9[0];
                        Class<?> cls7 = Integer.TYPE;
                        method4 = cls6.getMethod(str4, cls7, cls7);
                        map4.put(-504758789, method4);
                    }
                    cArr4[i25] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                }
                c10 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr10 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(-265085633);
                if (method5 == null) {
                    Class cls8 = (Class) setTextScaleX.setX((char) (TextUtils.getCapsMode("", 0, 0) + 31347), Color.argb(0, 0, 0, 0) + 48, 840 - Color.argb(0, 0, 0, 0));
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 + 1);
                    Object[] objArr11 = new Object[1];
                    b(b16, b17, (byte) (-b17), objArr11);
                    method5 = cls8.getMethod((String) objArr11[0], Object.class, Object.class);
                    map5.put(-265085633, method5);
                }
                ((Method) method5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            char[] cArr5 = new char[i21];
            i12 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i21);
            int i28 = i21 - i11;
            int i29 = i11;
            System.arraycopy(cArr5, 0, cArr3, i28, i29);
            System.arraycopy(cArr5, i29, cArr3, 0, i28);
        } else {
            i12 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i21];
            while (true) {
                setnavigationonclicklistener.setX = i12;
                int i30 = setnavigationonclicklistener.setX;
                if (i30 >= i21) {
                    break;
                }
                cArr6[i30] = cArr3[(i21 - i30) - 1];
                i12 = i30 + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i31 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i31;
                int i32 = setnavigationonclicklistener.setX;
                if (i32 >= i21) {
                    break;
                }
                cArr3[i32] = (char) (cArr3[i32] - iArr[2]);
                i31 = i32 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = com.mypinpad.tsdk.isolation.setElegantTextHeight.$$a
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = 101 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L33
        L15:
            r3 = r2
        L16:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L33:
            int r8 = r8 + r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setElegantTextHeight.b(int, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{83, 37, -54, -111};
        $$b = 225;
    }

    public static void d() {
        setOnLongClickListener = new char[]{59060, 59095, 59090, 59101, 59089, 59101, 59072, 59074, 59076, 59102, 59097, 59078, 59097, 59089, 59057, 59088, 59095, 59103, 59097, 59089, 59076, 59086, 59099, 59090, 59098, 59096, 59089, 59063, 59089, 59102, 59078, 59097, 59102, 59103, 59101, 59074, 59086, 59099, 59090, 59098, 59044, 59124, 59124, 59124, 59125, 59082, 59133, 59134, 59129, 59133, 59122};
    }

    public static setElegantTextHeight valueOf(String str) {
        int i10 = setNavigationOnClickListener + 83;
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        setElegantTextHeight seteleganttextheight = (setElegantTextHeight) Enum.valueOf(setElegantTextHeight.class, str);
        int i12 = setLayoutAnimation + 37;
        setNavigationOnClickListener = i12 % 128;
        int i13 = i12 % 2;
        return seteleganttextheight;
    }

    public static setElegantTextHeight[] values() {
        int i10 = setLayoutAnimation + 123;
        setNavigationOnClickListener = i10 % 128;
        int i11 = i10 % 2;
        setElegantTextHeight[] seteleganttextheightArr = (setElegantTextHeight[]) setY.clone();
        int i12 = setNavigationOnClickListener + 49;
        setLayoutAnimation = i12 % 128;
        if (i12 % 2 != 0) {
            return seteleganttextheightArr;
        }
        throw null;
    }
}
