package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class pw implements getDynamicButtonIconTextSpacingDp {
    public static final byte[] E0 = null;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f57770u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f57771w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f57772x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f57773y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f57774p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f57775q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final String f57776r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final yj f57777s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public final Integer f57778t0;

    static {
        c();
        f57772x0 = 0;
        f57773y0 = 1;
        v0 = 0;
        f57771w0 = 1;
        f57770u0 = -443079940;
    }

    public pw(int i10, @NotNull Map<String, String> map, @Nullable String str, @Nullable yj yjVar) {
        Intrinsics.checkNotNullParameter(map, "");
        this.f57774p0 = i10;
        this.f57775q0 = map;
        this.f57776r0 = str;
        this.f57777s0 = yjVar;
        this.f57778t0 = str != null ? Integer.valueOf(str.length()) : null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c3  */
    public static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        int i13;
        int i14;
        Throwable cause;
        int i15 = f57773y0 + 35;
        f57772x0 = i15 % 128;
        int i16 = 2;
        if (i15 % 2 != 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        int i17 = f57772x0 + 11;
        f57773y0 = i17 % 128;
        int i18 = i17 % 2;
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        int i19 = 0;
        getnavbartitlestring.setY = 0;
        int i20 = f57772x0 + 11;
        f57773y0 = i20 % 128;
        int i21 = i20 % 2;
        while (true) {
            int i22 = getnavbartitlestring.setY;
            if (i22 >= i10) {
                break;
            }
            char c10 = charArray[i22];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i22] = c11;
            try {
                Object[] objArr2 = new Object[i16];
                objArr2[1] = Integer.valueOf(f57770u0);
                objArr2[i19] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) Color.green(i19), 41 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 483);
                    byte b10 = (byte) i19;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i22] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55966 - TextUtils.indexOf("", "", 0, 0)), TextUtils.getTrimmedLength("") + 43, TextUtils.indexOf("", "", 0, 0) + 2268);
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    b(b12, (byte) (b13 - 1), b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i16 = 2;
                i19 = 0;
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
            int i23 = f57772x0 + 61;
            f57773y0 = i23 % 128;
            int i24 = i23 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            i13 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i25 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i25, i25);
            int i26 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i26, cArr, 0, i10 - i26);
        } else {
            i13 = 0;
        }
        if (z10) {
            char[] cArr3 = new char[i10];
            getnavbartitlestring.setY = i13;
            int i27 = f57773y0 + 39;
            f57772x0 = i27 % 128;
            int i28 = 2;
            int i29 = i27 % 2;
            while (true) {
                int i30 = getnavbartitlestring.setY;
                if (i30 >= i10) {
                    break;
                }
                cArr3[i30] = cArr[(i10 - i30) - 1];
                Object[] objArr6 = new Object[i28];
                objArr6[1] = getnavbartitlestring;
                objArr6[0] = getnavbartitlestring;
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 != null) {
                    i14 = 2;
                } else {
                    Class cls4 = (Class) setTextScaleX.setX((char) (55966 - TextUtils.getCapsMode("", 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 43, 2268 - View.MeasureSpec.getMode(0));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    b(b14, (byte) (b15 - 1), b15, objArr7);
                    i14 = 2;
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i28 = i14;
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    public static void b(byte b10, byte b11, int i10, Object[] objArr) {
        int i11 = 66 - i10;
        int i12 = (b10 * 2) + 4;
        int i13 = b11 * 2;
        byte[] bArr = new byte[i13 + 1];
        byte[] bArr2 = E0;
        int i14 = -1;
        if (bArr2 == null) {
            i11 = i12 + (-i11);
            i12++;
            i13 = i13;
        }
        while (true) {
            i14++;
            bArr[i14] = (byte) i11;
            if (i14 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i15 = i13;
            int i16 = i12;
            i11 += -bArr2[i12];
            i12 = i16 + 1;
            i13 = i15;
        }
    }

    public static void c() {
        E0 = new byte[]{45, -95, 79, -40};
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        pw pwVar = (pw) objArr[0];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pwVar.f57774p0);
        Object[] objArr2 = new Object[1];
        a(1 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.resolveSizeAndState(0, 0, 0) + 74, 2 - (Process.myTid() >> 22), "\u0006\ufffa", false, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(pwVar.f57778t0);
        String string = sb2.toString();
        int i13 = v0 + 101;
        f57771w0 = i13 % 128;
        if (i13 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @NotNull
    public final Map<String, String> setCompoundDrawableTintBlendMode() {
        int i10 = f57771w0 + 31;
        int i11 = i10 % 128;
        v0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 103;
        f57771w0 = i13 % 128;
        int i14 = i13 % 2;
        Map<String, String> map = this.f57775q0;
        if (i14 == 0) {
            int i15 = 3 / 0;
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00bd  */
    @Nullable
    public final JSONObject setOnFocusChangeListener() {
        String str;
        boolean z10;
        String str2;
        boolean z11 = false;
        mt.setX(new Object[]{null, setX()}, 135701020, -135701017, (int) System.currentTimeMillis());
        yj yjVar = this.f57777s0;
        if (yjVar != null) {
            str = (String) yj.setX(new Object[]{yjVar}, -1745004322, 1745004327, System.identityHashCode(yjVar));
        } else {
            int i10 = f57771w0 + 77;
            v0 = i10 % 128;
            int i11 = i10 % 2;
            str = null;
        }
        Object[] objArr = new Object[1];
        a(12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 142 - ((Process.getThreadPriority(0) + 20) >> 6), 6 - Color.red(0), "\ufff9\ufff7\n\uffff\u0005\u0004\ufff7\u0006\u0006\u0002\uffff", false, objArr);
        if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            String str3 = (String) yj.setX(new Object[]{yjVar}, -1751399784, 1751399791, System.identityHashCode(yjVar));
            Object[] objArr2 = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0) + 4, (ViewConfiguration.getTouchSlop() >> 8) + 146, -TextUtils.lastIndexOf("", '0'), "￼\u0000\u0001\u0005", true, objArr2);
            if (Intrinsics.areEqual(str3, ((String) objArr2[0]).intern())) {
                int i12 = f57771w0 + 13;
                v0 = i12 % 128;
                if (i12 % 2 != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        Integer num = this.f57778t0;
        if (num != null) {
            int i13 = f57771w0 + 23;
            v0 = i13 % 128;
            int i14 = i13 % 2;
            if (num.intValue() > 0) {
                int i15 = f57771w0;
                int i16 = i15 + 85;
                v0 = i16 % 128;
                int i17 = i16 % 2;
                int i18 = i15 + 25;
                v0 = i18 % 128;
                int i19 = i18 % 2;
                z11 = true;
            }
        }
        if (z10 && z11 && (str2 = this.f57776r0) != null) {
            return new JSONObject(str2);
        }
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
    @NotNull
    public final String setX() {
        String string;
        int i10 = f57771w0 + 45;
        v0 = i10 % 128;
        int i11 = i10 % 2;
        String strTake = null;
        yj yjVar = this.f57777s0;
        if (yjVar != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringsKt___StringsKt.take((String) yj.setX(new Object[]{yjVar}, -1745004322, 1745004327, System.identityHashCode(yjVar)), 1));
            sb2.append(StringsKt___StringsKt.take((String) yj.setX(new Object[]{yjVar}, -1751399784, 1751399791, System.identityHashCode(yjVar)), 1));
            string = sb2.toString();
        } else {
            string = null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f57774p0);
        sb3.append(AbstractJsonLexerKt.COMMA);
        sb3.append(string);
        sb3.append(AbstractJsonLexerKt.COMMA);
        sb3.append(this.f57778t0);
        sb3.append(AbstractJsonLexerKt.COMMA);
        String str = this.f57776r0;
        if (str != null) {
            int i12 = f57771w0 + 37;
            v0 = i12 % 128;
            int i13 = i12 % 2;
            strTake = StringsKt___StringsKt.take(str, 5);
        } else {
            int i14 = f57771w0 + 83;
            v0 = i14 % 128;
            int i15 = i14 % 2;
        }
        sb3.append(strTake);
        return sb3.toString();
    }

    public final int setY() {
        int i10 = f57771w0 + 111;
        int i11 = i10 % 128;
        v0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 123;
        f57771w0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f57774p0;
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 88164921, -88164921, System.identityHashCode(this));
    }

    @Nullable
    public final String setDividerPadding() {
        int i10 = f57771w0;
        int i11 = i10 + 39;
        v0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 125;
        v0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f57776r0;
    }
}
