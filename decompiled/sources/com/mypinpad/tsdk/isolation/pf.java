package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.activity.a;
import androidx.camera.camera2.internal.n1;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/pf;", "Lcom/mypinpad/tsdk/i/getCode;", "", "a", "Ljava/lang/String;", "setNavigationOnClickListener", "()Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "b", "getNavBarTitleString", "setOnFocusChangeListener", "c", "setLayoutAnimation", "setY", "", "d", "J", "setOnDragListener", "()J", "setX"}, k = 1, mv = {1, 8, 0})
public class pf extends getCode {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f57678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f57679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f57684k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f57685l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setOnFocusChangeListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long setX;

    static {
        b();
        f57682i = 0;
        f57683j = 1;
        f57680g = 0;
        f57681h = 1;
        f57679f = (char) 53955;
        f57678e = new char[]{59144, 59167, 59147, 59152};
    }

    public pf(String str, String str2, String str3, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        String strF;
        String string;
        long time;
        int i11;
        char c10 = 0;
        int i12 = 1;
        if ((i10 & 1) != 0) {
            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
            int i13 = doubleTapTimeout + 3;
            char c11 = (byte) (58 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            int i14 = f57682i + 107;
            f57683j = i14 % 128;
            if (i14 % 2 == 0) {
                "\u0001\u0000㘊".toCharArray();
                throw null;
            }
            char[] charArray = "\u0001\u0000㘊".toCharArray();
            setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
            int i15 = 290255894;
            char[] cArr = f57678e;
            if (cArr != null) {
                int i16 = f57683j + 9;
                f57682i = i16 % 128;
                int i17 = i16 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    try {
                        Object[] objArr = new Object[i12];
                        objArr[c10] = Integer.valueOf(cArr[i18]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i15));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45, 1116 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            Object[] objArr2 = new Object[1];
                            a(b11, b10, b11, objArr2);
                            method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(290255894, method);
                        }
                        cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                        i18++;
                        c10 = 0;
                        i12 = 1;
                        i15 = 290255894;
                        length = length;
                        cArr = cArr;
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
            Object[] objArr3 = {Integer.valueOf(f57679f)};
            Map map2 = setTextScaleX.setMaxEms;
            Object method2 = map2.get(290255894);
            if (method2 == null) {
                Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.alpha(0) + 45, 1116 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                byte b12 = (byte) 0;
                byte b13 = b12;
                Object[] objArr4 = new Object[1];
                a(b13, b12, b13, objArr4);
                method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                map2.put(290255894, method2);
            }
            char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i13];
            if (i13 % 2 != 0) {
                int i19 = f57682i + 59;
                f57683j = i19 % 128;
                if (i19 % 2 == 0) {
                    i11 = doubleTapTimeout + 108;
                    cArr3[i11] = (char) (charArray[i11] % c11);
                } else {
                    i11 = doubleTapTimeout + 2;
                    cArr3[i11] = (char) (charArray[i11] - c11);
                }
            } else {
                i11 = i13;
            }
            char c12 = 5;
            if (i11 > 1) {
                int i20 = f57683j + 65;
                f57682i = i20 % 128;
                int i21 = i20 % 2;
                setincludefontpadding.setDividerPadding = 0;
                while (true) {
                    int i22 = setincludefontpadding.setDividerPadding;
                    if (i22 >= i11) {
                        break;
                    }
                    char c13 = charArray[i22];
                    setincludefontpadding.setY = c13;
                    int i23 = i22 + 1;
                    char c14 = charArray[i23];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c14;
                    if (c13 == c14) {
                        int i24 = f57682i + 59;
                        f57683j = i24 % 128;
                        int i25 = i24 % 2;
                        cArr3[i22] = (char) (c13 - c11);
                        cArr3[i23] = (char) (c14 - c11);
                        i11 = i11;
                    } else {
                        Object[] objArr5 = new Object[13];
                        objArr5[12] = setincludefontpadding;
                        objArr5[11] = Integer.valueOf(cCharValue);
                        objArr5[10] = setincludefontpadding;
                        objArr5[9] = setincludefontpadding;
                        objArr5[8] = Integer.valueOf(cCharValue);
                        objArr5[7] = setincludefontpadding;
                        objArr5[6] = setincludefontpadding;
                        objArr5[c12] = Integer.valueOf(cCharValue);
                        objArr5[4] = setincludefontpadding;
                        objArr5[3] = setincludefontpadding;
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[1] = setincludefontpadding;
                        objArr5[0] = setincludefontpadding;
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(180437302);
                        if (method3 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 27 - (Process.myTid() >> 22), 2310 - TextUtils.indexOf((CharSequence) "", '0'));
                            byte b14 = (byte) 3;
                            byte b15 = (byte) (b14 - 3);
                            Object[] objArr6 = new Object[1];
                            a(b15, b14, b15, objArr6);
                            String str4 = (String) objArr6[0];
                            Class<?> cls4 = Integer.TYPE;
                            method3 = cls3.getMethod(str4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                            map3.put(180437302, method3);
                        }
                        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                        int i26 = setincludefontpadding.setNavigationOnClickListener;
                        if (iIntValue == i26) {
                            Object[] objArr7 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                            Object method4 = map3.get(1989802713);
                            if (method4 == null) {
                                Class cls5 = (Class) setTextScaleX.setX((char) (49102 - Process.getGidForName("")), TextUtils.indexOf("", "") + 35, 2544 - MotionEvent.axisFromString(""));
                                byte b16 = (byte) 0;
                                Object[] objArr8 = new Object[1];
                                a(b16, (byte) (f57685l - 2), b16, objArr8);
                                String str5 = (String) objArr8[0];
                                Class<?> cls6 = Integer.TYPE;
                                method4 = cls5.getMethod(str5, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                                map3.put(1989802713, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                            int i27 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                            int i28 = setincludefontpadding.setDividerPadding;
                            cArr3[i28] = cArr[iIntValue2];
                            cArr3[i28 + 1] = cArr[i27];
                        } else {
                            int i29 = setincludefontpadding.setX;
                            int i30 = setincludefontpadding.setOnFocusChangeListener;
                            if (i29 == i30) {
                                int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                                setincludefontpadding.setOnLongClickListener = iA;
                                int iA2 = a.a(i26, cCharValue, 1, cCharValue);
                                setincludefontpadding.setNavigationOnClickListener = iA2;
                                int i31 = (i30 * cCharValue) + iA2;
                                int i32 = setincludefontpadding.setDividerPadding;
                                cArr3[i32] = cArr[(i29 * cCharValue) + iA];
                                cArr3[i32 + 1] = cArr[i31];
                            } else {
                                int i33 = (i29 * cCharValue) + i26;
                                int i34 = (i30 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                                int i35 = setincludefontpadding.setDividerPadding;
                                cArr3[i35] = cArr[i33];
                                cArr3[i35 + 1] = cArr[i34];
                            }
                        }
                    }
                    setincludefontpadding.setDividerPadding += 2;
                    i11 = i11;
                    c12 = 5;
                }
            }
            int i36 = f57682i + 5;
            f57683j = i36 % 128;
            int i37 = i36 % 2;
            int i38 = 0;
            while (i38 < i13) {
                cArr3[i38] = (char) (cArr3[i38] ^ 13722);
                i38++;
                int i39 = f57683j + 37;
                f57682i = i39 % 128;
                int i40 = i39 % 2;
            }
            strF = n1.f(cArr3);
        } else {
            strF = str;
        }
        if ((i10 & 4) != 0) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else {
            string = str3;
        }
        if ((i10 & 8) != 0) {
            nx nxVar = nx.INSTANCE;
            time = ((Date) nx.setY(new Object[]{nxVar}, 2098183372, -2098183372, System.identityHashCode(nxVar))).getTime();
        } else {
            time = j10;
        }
        Intrinsics.checkNotNullParameter(strF, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(string, "");
        this.setCompoundDrawableTintBlendMode = strF;
        this.setOnFocusChangeListener = str2;
        this.setY = string;
        this.setX = time;
    }

    public static void a(byte b10, short s4, short s7, Object[] objArr) {
        int i10 = s4 + 99;
        int i11 = 4 - (s7 * 2);
        int i12 = b10 * 4;
        byte[] bArr = new byte[i12 + 1];
        byte[] bArr2 = f57684k;
        int i13 = -1;
        if (bArr2 == null) {
            i11++;
            i10 = (-i10) + i11;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i13 = -1;
        }
        while (true) {
            int i14 = i13 + 1;
            bArr[i14] = (byte) i10;
            if (i14 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b11 = bArr2[i11];
            i11++;
            i10 = (-b11) + i10;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i13 = i14;
        }
    }

    public static void b() {
        f57684k = new byte[]{94, -105, -29, 99};
        f57685l = 9;
    }

    @JvmName(name = "getNavBarTitleString")
    @NotNull
    public final String getNavBarTitleString() {
        int i10 = f57680g;
        int i11 = i10 + 45;
        f57681h = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 101;
        f57681h = i12 % 128;
        int i13 = i12 % 2;
        return this.setOnFocusChangeListener;
    }

    @JvmName(name = "setLayoutAnimation")
    @NotNull
    public final String setLayoutAnimation() {
        int i10 = f57680g + 33;
        int i11 = i10 % 128;
        f57681h = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 31;
        f57680g = i13 % 128;
        int i14 = i13 % 2;
        return this.setY;
    }

    @JvmName(name = "setNavigationOnClickListener")
    @NotNull
    public final String setNavigationOnClickListener() {
        int i10 = f57681h;
        int i11 = i10 + 3;
        f57680g = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 61;
        f57680g = i13 % 128;
        int i14 = i13 % 2;
        return this.setCompoundDrawableTintBlendMode;
    }

    @JvmName(name = "setOnDragListener")
    public final long setOnDragListener() {
        int i10 = f57680g;
        int i11 = i10 + 45;
        f57681h = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 95;
        f57681h = i13 % 128;
        int i14 = i13 % 2;
        long j10 = this.setX;
        if (i14 == 0) {
            int i15 = 77 / 0;
        }
        return j10;
    }
}
