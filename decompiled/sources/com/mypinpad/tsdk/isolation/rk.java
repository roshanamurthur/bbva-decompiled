package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/mypinpad/tsdk/i/rk;", "", "setDividerPadding", "setY", "setX", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode", "setLayoutAnimation", "setOnDragListener"}, k = 1, mv = {1, 8, 0})
public final class rk {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ rk[] getNavBarTitleString;
    private static int setAlwaysDrawnWithCacheEnabled;
    public static final rk setCompoundDrawableTintBlendMode;
    public static final rk setDividerPadding;
    public static final rk setLayoutAnimation;
    private static int setNavigationOnClickListener;
    public static final rk setOnDragListener;
    public static final rk setOnFocusChangeListener;
    private static int setOnLongClickListener;
    public static final rk setX;
    public static final rk setY;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setOnLongClickListener = 0;
        setAlwaysDrawnWithCacheEnabled = 1;
        d();
        Object[] objArr = new Object[1];
        a(23 - TextUtils.lastIndexOf("", '0'), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 272, 19 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0001\u0004�\u0011\ufff5\u0001\u0000\u0000\ufff7\ufff5\u0006\ufffb\u0001\u0000\u0011\ufff7\u0004\u0004\u0001\u0004\u0000\ufff7\u0006\t", false, objArr);
        rk rkVar = new rk(((String) objArr[0]).intern(), 0);
        setDividerPadding = rkVar;
        Object[] objArr2 = new Object[1];
        a(20 - ExpandableListView.getPackedPositionGroup(0L), 271 - TextUtils.getOffsetBefore("", 0), 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\ufff5\b\u0007\u0013\ufff9\ufff7�\n\ufff9\ufff8\ufff9\u0006\t\u0000�\ufff5\ufffa\u0013\ufff9\b", true, objArr2);
        rk rkVar2 = new rk(((String) objArr2[0]).intern(), 1);
        setY = rkVar2;
        Object[] objArr3 = new Object[1];
        a(29 - KeyEvent.keyCodeFromString(""), View.getDefaultSize(0, 0) + 271, View.getDefaultSize(0, 0) + 12, "�\ufff7\ufff5\u0000\u0013\ufffa\ufff5�\u0000\t\u0006\ufff9\ufff8\ufff9\n�\ufff7\ufff9\u0013\u0007\b\ufff5\b\ufff9\u0013\ufff7\u0006�\b", false, objArr3);
        rk rkVar3 = new rk(((String) objArr3[0]).intern(), 2);
        setX = rkVar3;
        Object[] objArr4 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 9, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 273, 2 - ((Process.getThreadPriority(0) + 20) >> 6), "\ufff8\u0000\u0004\u0001\u0004\u0004\ufff7\u0011\ufff5", true, objArr4);
        rk rkVar4 = new rk(((String) objArr4[0]).intern(), 3);
        setOnFocusChangeListener = rkVar4;
        Object[] objArr5 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 37, 270 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0', 0, 0) + 32, "\t\u0006\ufff5\b�\u0003\u0002\u0013\n\ufff5\u0000�\ufff8\ufff5\b�\u0003\u0002\u0013￼\ufff5\u0007￼\u0013\ufffa\ufff5�\u0000\t\u0006\ufff9\ufff7\u0003\u0002\ufffa�\ufffb", false, objArr5);
        rk rkVar5 = new rk(((String) objArr5[0]).intern(), 4);
        setCompoundDrawableTintBlendMode = rkVar5;
        Object[] objArr6 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 11, 267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 5 - TextUtils.getOffsetBefore("", 0), "\f\ufffb\ufff9�￼￼�\f\ufff9\u000e\u0001", true, objArr6);
        rk rkVar6 = new rk(((String) objArr6[0]).intern(), 5);
        setLayoutAnimation = rkVar6;
        Object[] objArr7 = new Object[1];
        a(14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 273 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 13, "\u0001\u0004\u0004\ufff7\u0011\ufffe\ufff3\u0000\u0004\ufff7\u0006\u0000\ufffb\u0004", true, objArr7);
        rk rkVar7 = new rk(((String) objArr7[0]).intern(), 6);
        setOnDragListener = rkVar7;
        int i10 = setOnLongClickListener;
        int i11 = i10 + 67;
        setAlwaysDrawnWithCacheEnabled = i11 % 128;
        int i12 = i11 % 2;
        rk[] rkVarArr = {rkVar, rkVar2, rkVar3, rkVar4, rkVar5, rkVar6, rkVar7};
        int i13 = i10 + 115;
        int i14 = i13 % 128;
        setAlwaysDrawnWithCacheEnabled = i14;
        if (i13 % 2 == 0) {
            throw null;
        }
        getNavBarTitleString = rkVarArr;
        int i15 = i14 + 123;
        setOnLongClickListener = i15 % 128;
        int i16 = i15 % 2;
    }

    public rk() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x019d  */
    /* JADX WARN: Code duplicated, block: B:36:0x019e  */
    public static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13 = $10 + 25;
        $11 = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i16 = getnavbartitlestring.setY;
            if (i16 >= i10) {
                break;
            }
            int i17 = $10 + 89;
            $11 = i17 % 128;
            int i18 = i17 % i14;
            char c10 = charArray[i16];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i16] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(setNavigationOnClickListener);
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 41, ExpandableListView.getPackedPositionType(0L) + 483);
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    b((byte) (b11 - 1), b10, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 55966), (ViewConfiguration.getTapTimeout() >> 16) + 43, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2267);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b13, b12, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 2;
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
            int i19 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i19, i19);
            int i20 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i20, cArr, 0, i10 - i20);
        }
        if (z10) {
            char[] cArr3 = new char[i10];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i21 = getnavbartitlestring.setY;
                if (i21 >= i10) {
                    break;
                }
                cArr3[i21] = cArr[(i10 - i21) - 1];
                Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 55965), 43 - (ViewConfiguration.getTapTimeout() >> 16), 2267 - ImageFormat.getBitsPerPixel(0));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b15, b14, b15, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        String str3 = new String(cArr);
        int i22 = $11 + 15;
        $10 = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.mypinpad.tsdk.isolation.rk.$$a
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = r8 + 65
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L33
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.rk.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{10, -57, 40, -93};
        $$b = 149;
    }

    public static void d() {
        setNavigationOnClickListener = -443080165;
    }

    public static rk valueOf(String str) {
        int i10 = setAlwaysDrawnWithCacheEnabled + 107;
        setOnLongClickListener = i10 % 128;
        int i11 = i10 % 2;
        rk rkVar = (rk) Enum.valueOf(rk.class, str);
        int i12 = setAlwaysDrawnWithCacheEnabled + 97;
        setOnLongClickListener = i12 % 128;
        int i13 = i12 % 2;
        return rkVar;
    }

    public static rk[] values() {
        int i10 = setOnLongClickListener + 1;
        setAlwaysDrawnWithCacheEnabled = i10 % 128;
        int i11 = i10 % 2;
        rk[] rkVarArr = (rk[]) getNavBarTitleString.clone();
        int i12 = setOnLongClickListener + 33;
        setAlwaysDrawnWithCacheEnabled = i12 % 128;
        int i13 = i12 % 2;
        return rkVarArr;
    }
}
