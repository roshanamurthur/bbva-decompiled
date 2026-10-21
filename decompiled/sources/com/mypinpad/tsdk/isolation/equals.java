package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class equals {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f55396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f55398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f55399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f55401g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f55402a;

    static {
        b();
        f55400f = 1;
        f55398d = true;
        f55399e = true;
        f55397c = 1794962320;
        f55396b = new char[]{62376, 62368, 62372};
    }

    public equals(@NotNull byte[] bArr) throws Throwable {
        String str = "";
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f55402a = bArr;
        if (bArr.length < Integer.MAX_VALUE) {
            return;
        }
        int i10 = 0;
        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 128;
        byte[] bytes = "\u0083\u0082\u0081".getBytes("ISO-8859-1");
        setZ setz = new setZ();
        int i11 = 1;
        char[] cArr = f55396b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr = new Object[i11];
                    objArr[i10] = Integer.valueOf(cArr[i12]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (26288 - (TypedValue.complexToFloat(i10) > 0.0f ? 1 : (TypedValue.complexToFloat(i10) == 0.0f ? 0 : -1))), (Process.myPid() >> 22) + 64, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1595);
                        byte b10 = (byte) i10;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i12] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i12++;
                    cArr = cArr;
                    i10 = 0;
                    i11 = 1;
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
        Object[] objArr3 = {Integer.valueOf(f55397c)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (10744 - TextUtils.getCapsMode("", 0, 0)), 43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 566 - (ViewConfiguration.getScrollBarSize() >> 8));
            byte b12 = (byte) 0;
            byte b13 = (byte) (b12 + 1);
            Object[] objArr4 = new Object[1];
            a(b12, b13, (byte) (b13 - 1), objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (!f55399e) {
            if (!f55398d) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i13 = setz.setDividerPadding;
            int i14 = setz.setOnFocusChangeListener;
            if (i13 >= i14) {
                throw new setChildIndicatorBoundsRelative(n1.f(cArr3));
            }
            cArr3[i13] = (char) (cArr[bytes[(i14 - 1) - i13] + iLastIndexOf] - iIntValue);
            Object[] objArr5 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 52, TextUtils.getCapsMode(str, 0, 0) + 2880);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 + 2);
                Object[] objArr6 = new Object[1];
                a(b14, b15, (byte) (b15 - 2), objArr6);
                method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            str = str;
        }
    }

    public static void a(byte b10, byte b11, byte b12, Object[] objArr) {
        int i10 = (b11 * 2) + 118;
        int i11 = b12 * 2;
        int i12 = (b10 * 3) + 4;
        byte[] bArr = new byte[i11 + 1];
        int i13 = -1;
        byte[] bArr2 = f55401g;
        if (bArr2 == null) {
            int i14 = i12 + i11;
            i11 = i11;
            objArr = objArr;
            bArr = bArr;
            i13 = -1;
            bArr2 = bArr2;
            i10 = i14;
            i12++;
        }
        while (true) {
            int i15 = i13 + 1;
            bArr[i15] = (byte) i10;
            if (i15 == i11) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i16 = i10;
            i11 = i11;
            objArr = objArr;
            bArr = bArr;
            i13 = i15;
            bArr2 = bArr2;
            i10 = bArr2[i12] + i16;
            i12++;
        }
    }

    public static void b() {
        f55401g = new byte[]{Constants.CVR_B1b85_0110_TERMINAL, UtilitiesSDKConstants.SRP_LABEL_ENC, -21, -9};
    }

    @NotNull
    public final byte[] setDividerPadding() {
        int i10 = f55400f;
        int i11 = i10 + 33;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        int i14 = i10 + 51;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        byte[] bArr = this.f55402a;
        if (i16 != 0) {
            int i17 = 40 / 0;
        }
        return bArr;
    }

    public final boolean setOnFocusChangeListener() {
        int i10 = f55400f;
        int i11 = i10 + 17;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        byte[] bArr = this.f55402a;
        if (i13 != 0) {
            int length = bArr.length;
            throw null;
        }
        if (bArr.length == 0) {
            int i14 = i10 + 117;
            int i15 = i14 % 128;
            int i16 = i14 % 2;
            return false;
        }
        int i17 = i10 + 3;
        int i18 = i17 % 128;
        int i19 = i17 % 2;
        return true;
    }
}
