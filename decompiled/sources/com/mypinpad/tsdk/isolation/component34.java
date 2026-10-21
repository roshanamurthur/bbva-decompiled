package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class component34 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f54955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f54956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f54957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f54958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f54959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f54960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f54961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f54962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f54963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f54964l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final component28 f54966b;

    static {
        d();
        f54962j = 0;
        f54963k = 1;
        f54960h = 0;
        f54961i = 1;
        f54955c = new char[]{59063, 59084, 59108, 59129, 59134, 59100, 59053, 59081, 59134, 59055, 59104, 59079, 59077, 59105, 59107, 59107, 59113, 58900, 59074, 59077, 59106, 59114, 59119, 59116, 59116, 59111, 59074, 59040, 59091, 59129, 59107, 59108, 59117, 59119, 59077, 59077, 59106, 59114, 59119, 59116, 59074, 59087, 58903, 58901, 58900, 59074, 59098, 59106, 59113, 59113, 59113, 59107, 59119, 59119, 59077, 59075, 59119, 59116, 59129, 59129, 59114, 59085, 59077, 59106, 59113, 58901, 59012, 59070, 59047, 59044, 59054, 59054, 59054, 59047, 59129, 59129, 59134, 59134, 59122, 59125, 59012, 59071, 59040, 59050, 59089, 59089, 59094, 59094, 59089};
        f54959g = (char) 52110;
        f54958f = (char) 23577;
        f54956d = (char) 37378;
        f54957e = (char) 48407;
    }

    public component34(boolean z10, @NotNull component28 component28Var) {
        Intrinsics.checkNotNullParameter(component28Var, "");
        this.f54965a = z10;
        this.f54966b = component28Var;
    }

    public static void a(String str, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        char c10;
        byte[] bytes = str.getBytes("ISO-8859-1");
        int i11 = f54963k + 43;
        f54962j = i11 % 128;
        int i12 = i11 % 2;
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        char c11 = 0;
        int i13 = iArr[0];
        int i14 = 1;
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        char[] cArr = f54955c;
        long j10 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[c11] = Integer.valueOf(cArr[i18]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > j10 ? 1 : (SystemClock.uptimeMillis() == j10 ? 0 : -1)) - 1), (ViewConfiguration.getEdgeSlop() >> 16) + 37, 608 - ExpandableListView.getPackedPositionChild(j10));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr3 = new Object[1];
                        c((byte) (b11 - 1), b11, b10, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18++;
                    length = length;
                    cArr = cArr;
                    i16 = i16;
                    c11 = 0;
                    i14 = 1;
                    j10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i16;
            cArr = cArr2;
        } else {
            i10 = i16;
        }
        char[] cArr3 = new char[i15];
        System.arraycopy(cArr, i13, cArr3, 0, i15);
        if (bytes != null) {
            int i19 = f54962j + 21;
            f54963k = i19 % 128;
            int i20 = 2;
            int i21 = i19 % 2;
            char[] cArr4 = new char[i15];
            setnavigationonclicklistener.setX = 0;
            char c12 = 0;
            while (true) {
                int i22 = setnavigationonclicklistener.setX;
                if (i22 >= i15) {
                    break;
                }
                if (bytes[i22] == 1) {
                    char c13 = cArr3[i22];
                    Object[] objArr4 = new Object[i20];
                    objArr4[1] = Integer.valueOf(c12);
                    objArr4[0] = Integer.valueOf(c13);
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1737824323);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (4449 - ((Process.getThreadPriority(0) + 20) >> 6)), 42 - View.getDefaultSize(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + PointerIconCompat.TYPE_GRABBING);
                        byte length2 = (byte) f54964l.length;
                        Object[] objArr5 = new Object[1];
                        c((byte) (length2 - 4), length2, (byte) 0, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str2, cls3, cls3);
                        map2.put(1737824323, method2);
                    }
                    cArr4[i22] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    Object[] objArr6 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c12)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-504758789);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 45 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2628 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr7 = new Object[1];
                        c(b13, b13, b12, objArr7);
                        String str3 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str3, cls5, cls5);
                        map3.put(-504758789, method3);
                    }
                    cArr4[i22] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c12 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr8 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31346), (Process.myTid() >> 22) + 48, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 840);
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 3);
                    Object[] objArr9 = new Object[1];
                    c((byte) (b15 - 3), b15, b14, objArr9);
                    method4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr8);
                i20 = 2;
            }
            cArr3 = cArr4;
        }
        if (i17 > 0) {
            int i23 = f54963k + 27;
            f54962j = i23 % 128;
            int i24 = i23 % 2;
            char[] cArr5 = new char[i15];
            System.arraycopy(cArr3, 0, cArr5, 0, i15);
            int i25 = i15 - i17;
            System.arraycopy(cArr5, 0, cArr3, i25, i17);
            System.arraycopy(cArr5, i17, cArr3, 0, i25);
            int i26 = f54962j + 89;
            f54963k = i26 % 128;
            c10 = 2;
            int i27 = i26 % 2;
        } else {
            c10 = 2;
        }
        if (i10 > 0) {
            int i28 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i28;
                int i29 = setnavigationonclicklistener.setX;
                if (i29 >= i15) {
                    break;
                }
                cArr3[i29] = (char) (cArr3[i29] - iArr[c10]);
                i28 = i29 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        char[] charArray;
        int i11 = f54963k + 55;
        f54962j = i11 % 128;
        int i12 = 0;
        if (i11 % 2 != 0) {
            charArray = str.toCharArray();
            int i13 = 62 / 0;
        } else {
            charArray = str.toCharArray();
        }
        int i14 = f54963k + 59;
        f54962j = i14 % 128;
        int i15 = i14 % 2;
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        int i16 = f54963k + 9;
        f54962j = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            int i18 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i18 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i12] = charArray[i18];
            cArr2[1] = charArray[i18 + 1];
            int i19 = 58224;
            int i20 = i12;
            while (i20 < 16) {
                int i21 = f54963k + 75;
                f54962j = i21 % 128;
                int i22 = i21 % 2;
                char c10 = cArr2[1];
                char c11 = cArr2[i12];
                setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled2 = setalwaysdrawnwithcacheenabled;
                try {
                    Object[] objArr2 = {Integer.valueOf(c10), Integer.valueOf((c11 + i19) ^ ((c11 << 4) + ((char) (((long) f54958f) ^ 4333817592127744003L)))), Integer.valueOf(c11 >>> 5), Integer.valueOf(f54959g)};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48534 - TextUtils.indexOf("", "", 0)), ImageFormat.getBitsPerPixel(0) + 48, ExpandableListView.getPackedPositionType(0L) + 2672);
                        byte b10 = (byte) 0;
                        Object[] objArr3 = new Object[1];
                        c(b10, (byte) (b10 | 6), b10, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) f54956d) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f54957e)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - Color.red(0)), 47 - (Process.myTid() >> 22), Color.green(0) + 2672);
                        byte b11 = (byte) 0;
                        Object[] objArr5 = new Object[1];
                        c(b11, (byte) (b11 | 6), b11, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i19 -= 40503;
                    i20++;
                    setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled2;
                    i12 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled3 = setalwaysdrawnwithcacheenabled;
            int i23 = setalwaysdrawnwithcacheenabled3.setOnFocusChangeListener;
            cArr[i23] = cArr2[0];
            cArr[i23 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled3, setalwaysdrawnwithcacheenabled3};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 36 - ImageFormat.getBitsPerPixel(0), TextUtils.getCapsMode("", 0, 0) + 2145);
                byte b12 = (byte) 0;
                Object[] objArr7 = new Object[1];
                c(b12, (byte) (b12 | 8), b12, objArr7);
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled3;
            i12 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 + 97
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.component34.f54964l
            if (r2 != 0) goto L17
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L31
        L17:
            r3 = r1
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L31:
            int r7 = r7 + r8
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.component34.c(byte, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f54964l = new byte[]{41, -42, 76, 2};
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int color;
        component34 component34Var = (component34) objArr[0];
        int i13 = f54961i + 89;
        f54960h = i13 % 128;
        int i14 = i13 % 2;
        if (component34Var.f54965a) {
            Object[] objArr2 = new Object[1];
            b("虵\u009c諛㾈캞\ud947씈㥰覙㱠", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, objArr2);
            color = Color.parseColor(((String) objArr2[0]).intern());
            int i15 = f54960h + 77;
            f54961i = i15 % 128;
            int i16 = i15 % 2;
        } else {
            Object[] objArr3 = new Object[1];
            a("\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{80, 9, 0, 9}, objArr3);
            color = Color.parseColor(((String) objArr3[0]).intern());
            int i17 = f54961i + 113;
            f54960h = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
        }
        return Integer.valueOf(color);
    }

    public final int e() throws Throwable {
        Object obj;
        int i10 = f54960h;
        int i11 = i10 + 9;
        f54961i = i11 % 128;
        int i12 = i11 % 2;
        if (!this.f54965a) {
            Object[] objArr = new Object[1];
            b("∿㕲⚚푣⚚푣☓ᵷ", 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            return Color.parseColor(((String) objArr[0]).intern());
        }
        int i13 = i10 + 51;
        f54961i = i13 % 128;
        if (i13 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            a("\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new int[]{66, 7, 0, 0}, objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            a("\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new int[]{66, 7, 0, 0}, objArr3);
            obj = objArr3[0];
        }
        return Color.parseColor(((String) obj).intern());
    }

    public final int f() throws Throwable {
        int i10 = f54960h + 29;
        f54961i = i10 % 128;
        int i11 = i10 % 2;
        if (!this.f54965a) {
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{73, 7, 50, 6}, objArr);
            return Color.parseColor(((String) objArr[0]).intern());
        }
        Object[] objArr2 = new Object[1];
        b("∿㕲⚚푣⚚푣☓ᵷ", Gravity.getAbsoluteGravity(0, 0) + 7, objArr2);
        int color = Color.parseColor(((String) objArr2[0]).intern());
        int i12 = f54961i + 9;
        f54960h = i12 % 128;
        int i13 = i12 % 2;
        return color;
    }

    @NotNull
    public final component32 setY() throws Throwable {
        Object obj;
        int color;
        int color2;
        component28 component28Var = this.f54966b;
        Integer onFocusChangeListener = component28Var.setOnFocusChangeListener();
        int iIntValue = onFocusChangeListener != null ? onFocusChangeListener.intValue() : 0;
        Integer x4 = component28Var.setX();
        int iIntValue2 = x4 != null ? x4.intValue() : e();
        Integer y7 = component28Var.setY();
        int iIntValue3 = y7 != null ? y7.intValue() : e();
        String strIntern = (String) component28.setY(new Object[]{component28Var}, 437400864, -437400861, System.identityHashCode(component28Var));
        if (strIntern == null) {
            Object[] objArr = new Object[1];
            a("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", new int[]{0, 9, 0, 0}, objArr);
            strIntern = ((String) objArr[0]).intern();
        }
        Integer num = (Integer) component28.setY(new Object[]{component28Var}, 195057493, -195057493, System.identityHashCode(component28Var));
        int iIntValue4 = num != null ? num.intValue() : f();
        Float onLongClickListener = component28Var.setOnLongClickListener();
        float fFloatValue = onLongClickListener != null ? onLongClickListener.floatValue() : 16.0f;
        Integer layoutAnimation = component28Var.setLayoutAnimation();
        if (layoutAnimation != null) {
            color = layoutAnimation.intValue();
        } else {
            int i10 = f54961i + 45;
            f54960h = i10 % 128;
            if (i10 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                b("퍆⧱見\u07bd鼷Ễ멇\ue54f", 90 << TextUtils.indexOf((CharSequence) "", (char) 7, 1), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                b("퍆⧱見\u07bd鼷Ễ멇\ue54f", TextUtils.indexOf((CharSequence) "", '0', 0) + 8, objArr3);
                obj = objArr3[0];
            }
            color = Color.parseColor(((String) obj).intern());
        }
        Integer onDragListener = component28Var.setOnDragListener();
        int iIntValue5 = onDragListener != null ? onDragListener.intValue() : e();
        String navBarTitleString = component28Var.getNavBarTitleString();
        Integer num2 = (Integer) component28.setY(new Object[]{component28Var}, 1625124627, -1625124623, System.identityHashCode(component28Var));
        int iIntValue6 = num2 != null ? num2.intValue() : e();
        Integer num3 = (Integer) component28.setY(new Object[]{component28Var}, -1783073287, 1783073288, System.identityHashCode(component28Var));
        int iIntValue7 = num3 != null ? num3.intValue() : f();
        Float textAlignment = component28Var.setTextAlignment();
        float fFloatValue2 = textAlignment != null ? textAlignment.floatValue() : 20.0f;
        String str = (String) component28.setY(new Object[]{component28Var}, -1134961482, 1134961484, System.identityHashCode(component28Var));
        Integer alwaysDrawnWithCacheEnabled = component28Var.setAlwaysDrawnWithCacheEnabled();
        int iIntValue8 = alwaysDrawnWithCacheEnabled != null ? alwaysDrawnWithCacheEnabled.intValue() : e();
        Integer includeFontPadding = component28Var.setIncludeFontPadding();
        int iIntValue9 = includeFontPadding != null ? includeFontPadding.intValue() : f();
        Float compoundDrawablePadding = component28Var.setCompoundDrawablePadding();
        float fFloatValue3 = compoundDrawablePadding != null ? compoundDrawablePadding.floatValue() : 16.0f;
        String textScaleX = component28Var.setTextScaleX();
        if (textScaleX == null) {
            Object[] objArr4 = new Object[1];
            a("\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{9, 57, 14, 49}, objArr4);
            textScaleX = ((String) objArr4[0]).intern();
        }
        String str2 = textScaleX;
        Integer childDivider = component28Var.setChildDivider();
        if (childDivider != null) {
            color2 = childDivider.intValue();
        } else {
            Object[] objArr5 = new Object[1];
            b("蓃羽풛拠\uef36\ua95b뙐闁", TextUtils.lastIndexOf("", '0') + 8, objArr5);
            color2 = Color.parseColor(((String) objArr5[0]).intern());
        }
        int i11 = color2;
        int amountFieldTextColor = component28Var.getAmountFieldTextColor();
        float onEditorActionListener = component28Var.setOnEditorActionListener();
        Integer maxEms = component28Var.setMaxEms();
        if (maxEms == null) {
            maxEms = (Integer) setX(new Object[]{this}, -770693002, 770693002, System.identityHashCode(this));
        }
        return new component32(iIntValue, iIntValue2, iIntValue3, strIntern, iIntValue4, fFloatValue, color, iIntValue5, navBarTitleString, iIntValue6, iIntValue7, fFloatValue2, str, iIntValue8, iIntValue9, fFloatValue3, str2, i11, amountFieldTextColor, onEditorActionListener, maxEms.intValue(), component28Var.setMinHeight(), component28Var.setLayoutDirection(), component28Var.setImageResource());
    }
}
