package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setAnimationMatrix;", "Lcom/mypinpad/tsdk/i/setLayerType;", "", "p0", "<init>", "([B)V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setAnimationMatrix extends setLayerType {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static char[] f59462t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static char f59463u0;
    public static final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f59464w0 = null;

    static {
        b();
        v0 = 1;
        e();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAnimationMatrix(@NotNull byte[] bArr) throws Throwable {
        setIncludeFontPadding setincludefontpadding;
        int i10;
        super(bArr, false, 2, null);
        Intrinsics.checkNotNullParameter(bArr, "");
        int i11 = 0;
        if (bArr.length >= 10) {
            return;
        }
        int deadChar = KeyEvent.getDeadChar(0, 0);
        int i12 = 19 - deadChar;
        char cResolveSizeAndState = (byte) (View.resolveSizeAndState(0, 0, 0) + 97);
        char[] charArray = "\u0003\u0004\u0000\u0002\u0001\r\b\u0006\u000e\u0005\u000b\u0000\u0005\f\t\u0001\n\u0003㘕".toCharArray();
        setIncludeFontPadding setincludefontpadding2 = new setIncludeFontPadding();
        char[] cArr = f59462t0;
        int i13 = 1;
        int i14 = v0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr = new Object[i13];
                    objArr[i11] = Integer.valueOf(cArr[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(290255894);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) Color.red(i11), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 44, View.resolveSizeAndState(i11, i11, i11) + 1116);
                        byte b10 = (byte) i11;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b11, b10, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i15++;
                    int i16 = i14 + 89;
                    int i17 = i16 % 128;
                    int i18 = i16 % 2;
                    length = length;
                    cArr = cArr;
                    setincludefontpadding2 = setincludefontpadding2;
                    i11 = 0;
                    i13 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            setincludefontpadding = setincludefontpadding2;
            cArr = cArr2;
        } else {
            setincludefontpadding = setincludefontpadding2;
        }
        Object[] objArr3 = {Integer.valueOf(f59463u0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 44 - TextUtils.lastIndexOf("", '0', 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 1116);
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr4 = new Object[1];
            a(b13, b12, b13, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i12];
        if (i12 % 2 != 0) {
            int i19 = i14 + 45;
            int i20 = i19 % 128;
            if (i19 % 2 != 0) {
                i10 = 27 - deadChar;
                cArr3[i10] = (char) (charArray[i10] % cResolveSizeAndState);
            } else {
                i10 = 18 - deadChar;
                cArr3[i10] = (char) (charArray[i10] - cResolveSizeAndState);
            }
        } else {
            i10 = i12;
        }
        if (i10 > 1) {
            setIncludeFontPadding setincludefontpadding3 = setincludefontpadding;
            setincludefontpadding3.setDividerPadding = 0;
            while (true) {
                int i21 = setincludefontpadding3.setDividerPadding;
                if (i21 >= i10) {
                    break;
                }
                char c10 = charArray[i21];
                setincludefontpadding3.setY = c10;
                int i22 = i21 + 1;
                char c11 = charArray[i22];
                setincludefontpadding3.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i21] = (char) (c10 - cResolveSizeAndState);
                    cArr3[i22] = (char) (c11 - cResolveSizeAndState);
                    i10 = i10;
                    cResolveSizeAndState = cResolveSizeAndState;
                } else {
                    Object[] objArr5 = {setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2311);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr6 = new Object[1];
                        a((byte) (b15 + 3), b14, b15, objArr6);
                        String str = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    int i23 = setincludefontpadding3.setNavigationOnClickListener;
                    if (iIntValue == i23) {
                        int i24 = i14 + 15;
                        int i25 = i24 % 128;
                        int i26 = i24 % 2;
                        Object[] objArr7 = {setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - (Process.myTid() >> 22)), 35 - TextUtils.getOffsetAfter("", 0), 2545 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            byte b16 = (byte) 0;
                            byte b17 = b16;
                            Object[] objArr8 = new Object[1];
                            a((byte) (b17 | 7), b16, b17, objArr8);
                            String str2 = (String) objArr8[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                        int i27 = (setincludefontpadding3.setOnFocusChangeListener * cCharValue) + setincludefontpadding3.setNavigationOnClickListener;
                        int i28 = setincludefontpadding3.setDividerPadding;
                        cArr3[i28] = cArr[iIntValue2];
                        cArr3[i28 + 1] = cArr[i27];
                    } else {
                        int i29 = setincludefontpadding3.setX;
                        int i30 = setincludefontpadding3.setOnFocusChangeListener;
                        if (i29 == i30) {
                            int iA = a.a(setincludefontpadding3.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding3.setOnLongClickListener = iA;
                            int iA2 = a.a(i23, cCharValue, 1, cCharValue);
                            setincludefontpadding3.setNavigationOnClickListener = iA2;
                            int i31 = (i30 * cCharValue) + iA2;
                            int i32 = setincludefontpadding3.setDividerPadding;
                            cArr3[i32] = cArr[(i29 * cCharValue) + iA];
                            cArr3[i32 + 1] = cArr[i31];
                        } else {
                            int i33 = (i30 * cCharValue) + setincludefontpadding3.setOnLongClickListener;
                            int i34 = setincludefontpadding3.setDividerPadding;
                            cArr3[i34] = cArr[(i29 * cCharValue) + i23];
                            cArr3[i34 + 1] = cArr[i33];
                        }
                    }
                }
                setincludefontpadding3.setDividerPadding += 2;
                i10 = i10;
                cResolveSizeAndState = cResolveSizeAndState;
            }
        }
        for (int i35 = 0; i35 < i12; i35++) {
            cArr3[i35] = (char) (cArr3[i35] ^ 13722);
        }
        throw new IllegalArgumentException(n1.f(cArr3).toString());
    }

    public static void a(int i10, short s4, short s7, Object[] objArr) {
        int i11 = 3 - (s4 * 4);
        int i12 = i10 + 99;
        int i13 = s7 * 3;
        byte[] bArr = new byte[1 - i13];
        int i14 = 0 - i13;
        byte[] bArr2 = f59464w0;
        int i15 = -1;
        if (bArr2 == null) {
            int i16 = i11 + i14;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = -1;
            i11 = i11;
            i12 = i16;
        }
        while (true) {
            int i17 = i11 + 1;
            int i18 = i15 + 1;
            bArr[i18] = (byte) i12;
            if (i18 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = i18;
            i11 = i17;
            i12 = bArr2[i17] + i12;
        }
    }

    public static void b() {
        f59464w0 = new byte[]{22, 117, -35, 69};
    }

    public static void e() {
        f59463u0 = (char) 53957;
        f59462t0 = new char[]{59165, 59191, 59183, 59186, 59177, 59190, 59178, 59194, 59182, 59199, 59259, 59189, 59164, 59198, 59253, 59167};
    }
}
