package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/w8;", "", "setY", "setX", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
final class w8 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getNavBarTitleString;
    public static final w8 setCompoundDrawableTintBlendMode;
    private static final /* synthetic */ w8[] setDividerPadding;
    private static boolean setLayoutAnimation;
    private static int setNavigationOnClickListener;
    private static boolean setOnDragListener;
    private static char[] setOnFocusChangeListener;
    private static int setOnLongClickListener;
    public static final w8 setX;
    public static final w8 setY;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setOnLongClickListener = 0;
        getNavBarTitleString = 1;
        d();
        Object[] objArr = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, "\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        w8 w8Var = new w8(((String) objArr[0]).intern(), 0);
        setY = w8Var;
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u008d\u0082\u008c\u0086\u008b\u008a\u0082\u0084\u008b\u0088\u008a\u0089", objArr2);
        w8 w8Var2 = new w8(((String) objArr2[0]).intern(), 1);
        setX = w8Var2;
        Object[] objArr3 = new Object[1];
        a(127 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0088\u008a\u0089", objArr3);
        w8 w8Var3 = new w8(((String) objArr3[0]).intern(), 2);
        setCompoundDrawableTintBlendMode = w8Var3;
        int i10 = getNavBarTitleString;
        int i11 = i10 + 23;
        setOnLongClickListener = i11 % 128;
        int i12 = i11 % 2;
        w8[] w8VarArr = {w8Var, w8Var2, w8Var3};
        int i13 = i10 + 93;
        setOnLongClickListener = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 47 / 0;
        }
        setDividerPadding = w8VarArr;
        int i15 = i10 + 51;
        setOnLongClickListener = i15 % 128;
        int i16 = i15 % 2;
    }

    public w8() {
        throw null;
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        byte[] bytes = str.getBytes("ISO-8859-1");
        int i11 = $10 + 7;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        setZ setz = new setZ();
        char[] cArr = setOnFocusChangeListener;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = $10 + 9;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 < length; i15++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i15])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (26289 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 64 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.normalizeMetaState(0) + 1595);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b((byte) (b11 - 1), b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(setNavigationOnClickListener)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10744), '[' - AndroidCharacter.getMirror('0'), (-16776650) - Color.rgb(0, 0, 0));
            byte b12 = (byte) ($$b & 3);
            byte b13 = (byte) (b12 - 1);
            Object[] objArr5 = new Object[1];
            b((byte) (b13 - 1), b12, b13, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!setOnDragListener) {
            if (!setLayoutAnimation) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i16 = setz.setDividerPadding;
            int i17 = setz.setOnFocusChangeListener;
            if (i16 >= i17) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i16] = (char) (cArr[bytes[(i17 - 1) - i16] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), View.resolveSizeAndState(0, 0, 0) + 51, 2880 - TextUtils.getOffsetAfter("", 0));
                byte b14 = (byte) 2;
                byte b15 = (byte) (b14 - 2);
                Object[] objArr7 = new Object[1];
                b((byte) (b15 - 1), b14, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = com.mypinpad.tsdk.isolation.w8.$$a
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = r7 + 118
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L36
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.w8.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{32, 60, 120, Constants.STATE_ERROR};
        $$b = 205;
    }

    public static void d() {
        setLayoutAnimation = true;
        setOnDragListener = true;
        setNavigationOnClickListener = 1794962213;
        setOnFocusChangeListener = new char[]{62101, 62097, 62308, 62105, 62315, 62098, 62103, 62096, 62317, 62102, 62082, 62099, 62108};
    }

    public static w8 valueOf(String str) {
        int i10 = setOnLongClickListener + 123;
        getNavBarTitleString = i10 % 128;
        int i11 = i10 % 2;
        w8 w8Var = (w8) Enum.valueOf(w8.class, str);
        int i12 = getNavBarTitleString + 1;
        setOnLongClickListener = i12 % 128;
        int i13 = i12 % 2;
        return w8Var;
    }

    public static w8[] values() {
        int i10 = setOnLongClickListener + 125;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        w8[] w8VarArr = (w8[]) setDividerPadding.clone();
        int i11 = setOnLongClickListener + 83;
        getNavBarTitleString = i11 % 128;
        if (i11 % 2 != 0) {
            return w8VarArr;
        }
        throw null;
    }
}
