package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/so;", "", "", "setX", "B", "()B", "setY", "setOnFocusChangeListener"}, k = 1, mv = {1, 8, 0})
public final class so {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getNavBarTitleString;
    private static final /* synthetic */ so[] setCompoundDrawableTintBlendMode;
    private static long setDividerPadding;
    private static int setLayoutAnimation;
    public static final so setOnFocusChangeListener;
    public static final so setY;
    private final byte setX;

    static {
        so[] soVarArr;
        c();
        $10 = 0;
        $11 = 1;
        getNavBarTitleString = 0;
        setLayoutAnimation = 1;
        d();
        Object[] objArr = new Object[1];
        a("黄狨䚔媬\u2e78Șᘱ\uebce", TextUtils.lastIndexOf("", '0', 0) + 60458, objArr);
        so soVar = new so(((String) objArr[0]).intern(), 0, (byte) 0);
        setY = soVar;
        Object[] objArr2 = new Object[1];
        a("黆ꫦ\uf6bcɤ丆鯃", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13367, objArr2);
        so soVar2 = new so(((String) objArr2[0]).intern(), 1, (byte) 32);
        setOnFocusChangeListener = soVar2;
        int i10 = getNavBarTitleString;
        int i11 = i10 + 95;
        setLayoutAnimation = i11 % 128;
        if (i11 % 2 == 0) {
            soVarArr = new so[5];
            soVarArr[0] = soVar;
            soVarArr[1] = soVar2;
        } else {
            soVarArr = new so[]{soVar, soVar2};
        }
        int i12 = i10 + 73;
        int i13 = i12 % 128;
        setLayoutAnimation = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        setCompoundDrawableTintBlendMode = soVarArr;
        int i14 = i13 + 99;
        getNavBarTitleString = i14 % 128;
        int i15 = i14 % 2;
    }

    public so(String str, int i10, byte b10) {
        super(str, i10);
        this.setX = b10;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x017d  */
    /* JADX WARN: Code duplicated, block: B:33:0x017e  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i11 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i11 >= charArray.length) {
                break;
            }
            int i12 = $11 + 85;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr2 = {Integer.valueOf(charArray[i11]), setlayoutanimation, setlayoutanimation};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 33, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1195);
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, (byte) (b11 - 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i11] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (setDividerPadding ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), 44 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b13, b12, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
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
            int i14 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i14 >= charArray.length) {
                break;
            }
            int i15 = $11 + 45;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[i14] = (char) jArr[i14];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) ('0' - AndroidCharacter.getMirror('0')), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, 728 - (Process.myPid() >> 22));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, b14, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
        String str2 = new String(cArr);
        int i17 = $11 + 65;
        $10 = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
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
            int r6 = r6 * 3
            int r6 = r6 + 107
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = com.mypinpad.tsdk.isolation.so.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L33:
            int r6 = r6 + r8
            int r8 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.so.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{110, 102, -9, -112};
        $$b = 249;
    }

    public static void d() {
        setDividerPadding = 6759187554019147011L;
    }

    public static so valueOf(String str) {
        int i10 = getNavBarTitleString + 39;
        setLayoutAnimation = i10 % 128;
        if (i10 % 2 == 0) {
            Enum.valueOf(so.class, str);
            throw null;
        }
        so soVar = (so) Enum.valueOf(so.class, str);
        int i11 = setLayoutAnimation + 17;
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        return soVar;
    }

    public static so[] values() {
        int i10 = getNavBarTitleString + 99;
        setLayoutAnimation = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        so[] soVarArr = (so[]) setCompoundDrawableTintBlendMode.clone();
        int i11 = setLayoutAnimation + 23;
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        return soVarArr;
    }

    @JvmName(name = "setX")
    public final byte setX() {
        int i10 = getNavBarTitleString + 69;
        setLayoutAnimation = i10 % 128;
        if (i10 % 2 != 0) {
            return this.setX;
        }
        throw null;
    }
}
