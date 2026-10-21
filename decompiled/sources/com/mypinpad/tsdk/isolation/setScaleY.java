package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setScaleY {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f60434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f60436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f60437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f60438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f60441i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f60442j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f60443a;

    static {
        b();
        f60439g = 0;
        f60440h = 1;
        f60438f = 1;
        f60436d = true;
        f60437e = true;
        f60435c = 1794962252;
        f60434b = new char[]{62084, 62108, 62081};
    }

    public setScaleY(@NotNull byte[] bArr) throws Throwable {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f60443a = bArr;
        if (bArr.length <= Integer.MAX_VALUE) {
            return;
        }
        int i10 = 0;
        int capsMode = TextUtils.getCapsMode("", 0, 0) + 127;
        int i11 = f60439g + 49;
        f60440h = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        byte[] bytes = "\u0083\u0082\u0081".getBytes("ISO-8859-1");
        setZ setz = new setZ();
        int i14 = 1;
        char[] cArr = f60434b;
        if (cArr != null) {
            int i15 = f60439g + 101;
            f60440h = i15 % 128;
            int i16 = i15 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                int i18 = f60440h + 111;
                f60439g = i18 % 128;
                int i19 = i18 % i12;
                byte[] bArr2 = f60441i;
                if (i19 != 0) {
                    try {
                        Object[] objArr = new Object[i14];
                        objArr[i10] = Integer.valueOf(cArr[i17]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(1129500232);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (26288 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 65 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1595 - TextUtils.indexOf("", "", i10));
                            byte b10 = bArr2[1];
                            byte b11 = (byte) (b10 - 2);
                            Object[] objArr2 = new Object[1];
                            a(b11, b10, b11, objArr2);
                            method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(1129500232, method);
                        }
                        cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    length = length;
                    Object[] objArr3 = {Integer.valueOf(cArr[i17])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1129500232);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (26287 - TextUtils.indexOf((CharSequence) "", '0')), MotionEvent.axisFromString("") + 65, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1596);
                        byte b12 = bArr2[1];
                        byte b13 = (byte) (b12 - 2);
                        Object[] objArr4 = new Object[1];
                        a(b13, b12, b13, objArr4);
                        method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                        map2.put(1129500232, method2);
                    }
                    cArr2[i17] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i17++;
                }
                length = length;
                i10 = 0;
                i12 = 2;
                i14 = 1;
            }
            cArr = cArr2;
        }
        Object[] objArr5 = {Integer.valueOf(f60435c)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method3 = map3.get(1019674483);
        if (method3 == null) {
            Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.getOffsetAfter("", 0) + 10744), (ViewConfiguration.getEdgeSlop() >> 16) + 43, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 565);
            byte b14 = (byte) (f60442j & 3);
            byte b15 = (byte) (b14 - 1);
            Object[] objArr6 = new Object[1];
            a(b15, b14, b15, objArr6);
            method3 = cls3.getMethod((String) objArr6[0], Integer.TYPE);
            map3.put(1019674483, method3);
        }
        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
        if (!f60437e) {
            if (!f60436d) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i20 = setz.setDividerPadding;
            int i21 = setz.setOnFocusChangeListener;
            if (i20 >= i21) {
                throw new setChildIndicatorBoundsRelative(n1.f(cArr3));
            }
            int i22 = f60440h + 119;
            f60439g = i22 % 128;
            int i23 = i22 % 2;
            cArr3[i20] = (char) (cArr[bytes[(i21 - 1) - i20] + capsMode] - iIntValue);
            Object[] objArr7 = {setz, setz};
            Map map4 = setTextScaleX.setMaxEms;
            Object method4 = map4.get(-1539766653);
            if (method4 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 51, 2880 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr8 = new Object[1];
                a(b17, b16, b17, objArr8);
                method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-1539766653, method4);
            }
            ((Method) method4).invoke(null, objArr7);
        }
    }

    public static void a(int i10, short s4, short s7, Object[] objArr) {
        int i11 = 122 - (s4 * 2);
        int i12 = s7 * 3;
        int i13 = (i10 * 4) + 4;
        byte[] bArr = new byte[1 - i12];
        int i14 = 0 - i12;
        byte[] bArr2 = f60441i;
        int i15 = -1;
        if (bArr2 == null) {
            i13++;
            i11 += -i14;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr[i16] = (byte) i11;
            if (i16 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b10 = bArr2[i13];
            i13++;
            i11 += -b10;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = i16;
        }
    }

    public static void b() {
        f60441i = new byte[]{59, 2, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 31};
        f60442j = 61;
    }

    @NotNull
    public final byte[] setX() {
        int i10 = f60438f;
        int i11 = i10 + 13;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        int i14 = i10 + 81;
        int i15 = i14 % 128;
        if (i14 % 2 == 0) {
            return this.f60443a;
        }
        throw null;
    }
}
