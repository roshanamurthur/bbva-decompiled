package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/ph;", "Lcom/mypinpad/tsdk/i/pf;", "Ljava/util/UUID;", "m", "Ljava/util/UUID;", "setY", "()Ljava/util/UUID;", "", "n", "Ljava/lang/String;", "setDividerPadding", "()Ljava/lang/String;", "o", "setX", "p", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener"}, k = 1, mv = {1, 8, 0})
public final class ph extends pf {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final char[] f57695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f57696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f57697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f57698t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f57699u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f57700v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f57701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f57702x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f57703y = 0;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final UUID setY;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setDividerPadding;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setX;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setOnFocusChangeListener;

    static {
        b();
        f57700v = 0;
        f57701w = 1;
        f57699u = 0;
        f57697s = true;
        f57698t = true;
        f57696r = 1794962357;
        f57695q = new char[]{62437, 62236, 62211, 62215, 62210, 62208, 62213, 62217, 62456, 62219, 62232, 62400, 62441, 62438, 62457, 62462, 62404, 62403, 62405};
    }

    public ph(UUID uuid, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String str4;
        Object method;
        int length;
        char[] cArr;
        String str5 = (i10 & 8) != 0 ? null : str3;
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iGreen = 127 - Color.green(0);
        int i11 = f57701w + 87;
        f57700v = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        byte[] bytes = "\u0093\u0092\u0091\u008c\u0090\u008f\u008e\u008d\u008c\u0088\u0083\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0081\u0083\u0082\u0081".getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr2 = f57695q;
        if (cArr2 != null) {
            int i14 = f57700v + 15;
            f57701w = i14 % 128;
            if (i14 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i15 = 0;
            while (i15 < length) {
                int i16 = f57700v + 93;
                f57701w = i16 % 128;
                if (i16 % i12 == 0) {
                    try {
                        Object[] objArr = {Integer.valueOf(cArr2[i15])};
                        Map map = setTextScaleX.setMaxEms;
                        Object method2 = map.get(1129500232);
                        if (method2 == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (Color.alpha(0) + 26288), 64 - Drawable.resolveOpacity(0, 0), ImageFormat.getBitsPerPixel(0) + 1596);
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            Object[] objArr2 = new Object[1];
                            c(b11, b11, b10, objArr2);
                            method2 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(1129500232, method2);
                        }
                        cArr[i15] = ((Character) ((Method) method2).invoke(null, objArr)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    length = length;
                    str5 = str5;
                    Object[] objArr3 = {Integer.valueOf(cArr2[i15])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(1129500232);
                    if (method3 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (Drawable.resolveOpacity(0, 0) + 26288), 63 - TextUtils.lastIndexOf("", '0', 0, 0), 1594 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr4 = new Object[1];
                        c(b13, b13, b12, objArr4);
                        method3 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                        map2.put(1129500232, method3);
                    }
                    cArr[i15] = ((Character) ((Method) method3).invoke(null, objArr3)).charValue();
                    i15++;
                }
                length = length;
                str5 = str5;
                i12 = 2;
            }
            str4 = str5;
            cArr2 = cArr;
        } else {
            str4 = str5;
        }
        Object[] objArr5 = {Integer.valueOf(f57696r)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method4 = map3.get(1019674483);
        if (method4 == null) {
            Class cls3 = (Class) setTextScaleX.setX((char) (10743 - MotionEvent.axisFromString("")), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 566);
            byte b14 = (byte) (f57703y & 3);
            byte b15 = (byte) (b14 - 1);
            Object[] objArr6 = new Object[1];
            c(b15, b15, b14, objArr6);
            method4 = cls3.getMethod((String) objArr6[0], Integer.TYPE);
            map3.put(1019674483, method4);
        }
        int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr5)).intValue();
        if (!f57698t) {
            if (!f57697s) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i17 = setz.setDividerPadding;
            int i18 = setz.setOnFocusChangeListener;
            if (i17 >= i18) {
                super(null, n1.f(cArr3), null, 0L, 13, null);
                this.setY = uuid;
                this.setDividerPadding = str;
                this.setX = str2;
                this.setOnFocusChangeListener = str4;
                return;
            }
            cArr3[i17] = (char) (cArr2[bytes[(i18 - 1) - i17] + iGreen] - iIntValue);
            Object[] objArr7 = {setz, setz};
            Map map4 = setTextScaleX.setMaxEms;
            Object obj = map4.get(-1539766653);
            if (obj != null) {
                method = obj;
            } else {
                Class cls4 = (Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 51, KeyEvent.normalizeMetaState(0) + 2880);
                byte b16 = (byte) 2;
                byte b17 = (byte) (b16 - 2);
                Object[] objArr8 = new Object[1];
                c(b17, b17, b16, objArr8);
                method = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-1539766653, method);
            }
            ((Method) method).invoke(null, objArr7);
            iIntValue = iIntValue;
        }
    }

    public static void b() {
        f57702x = new byte[]{24, 55, -101, -128};
        f57703y = 149;
    }

    public static void c(byte b10, byte b11, short s4, Object[] objArr) {
        int i10 = 3 - (b10 * 3);
        int i11 = (s4 * 2) + 118;
        int i12 = b11 * 4;
        byte[] bArr = new byte[i12 + 1];
        int i13 = -1;
        byte[] bArr2 = f57702x;
        if (bArr2 == null) {
            objArr = objArr;
            bArr = bArr;
            i13 = -1;
            bArr2 = bArr2;
            i11 = (-i12) + i11;
            i12 = i12;
        }
        while (true) {
            int i14 = i13 + 1;
            bArr[i14] = (byte) i11;
            if (i14 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i10++;
            int i15 = i11;
            int i16 = i12;
            objArr = objArr;
            bArr = bArr;
            i13 = i14;
            bArr2 = bArr2;
            i11 = (-bArr2[i10]) + i15;
            i12 = i16;
        }
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @Nullable
    public final String setCompoundDrawableTintBlendMode() {
        int i10 = f57699u;
        int i11 = i10 + 23;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        int i14 = i10 + 33;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        return this.setOnFocusChangeListener;
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        int i10 = f57699u + 15;
        int i11 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 103;
        f57699u = i12 % 128;
        if (i12 % 2 == 0) {
            return this.setDividerPadding;
        }
        throw null;
    }

    @JvmName(name = "setX")
    @NotNull
    public final String setX() {
        int i10 = f57699u;
        int i11 = i10 + 25;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        int i14 = i10 + 67;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        return this.setX;
    }

    @JvmName(name = "setY")
    @NotNull
    public final UUID setY() {
        int i10 = f57699u + 19;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        int i13 = i11 + 105;
        f57699u = i13 % 128;
        int i14 = i13 % 2;
        UUID uuid = this.setY;
        if (i14 != 0) {
            int i15 = 67 / 0;
        }
        return uuid;
    }
}
