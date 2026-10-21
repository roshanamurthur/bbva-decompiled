package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class startTransactiondefault {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f60926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f60931g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f60932h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getScope f60933a;

    static {
        c();
        f60929e = 0;
        f60930f = 1;
        f60927c = 0;
        f60928d = 1;
        f60926b = new int[]{203158505, 23616081, 407304975, 941784850, 446430086, -918167995, -510788909, 1303730930, 2090711477, -484505709, 600224868, -700612286, -1323916525, -359589003, 917218150, 1699944701, -1385090016, 458958017};
    }

    public startTransactiondefault(@NotNull dispose disposeVar, @NotNull getScope getscope) {
        Intrinsics.checkNotNullParameter(disposeVar, "");
        Intrinsics.checkNotNullParameter(getscope, "");
        this.f60933a = getscope;
    }

    public static void a(int[] iArr, int i10, Object[] objArr) throws Throwable {
        int[] iArr2;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr = new char[4];
        int i11 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f60926b;
        int i12 = 1;
        int i13 = f60932h;
        int i14 = 1833429914;
        char c10 = 0;
        if (iArr3 != null) {
            int i15 = f60929e + 77;
            f60930f = i15 % 128;
            int i16 = i15 % 2;
            int length = iArr3.length;
            iArr2 = new int[length];
            int i17 = 0;
            while (i17 < length) {
                int i18 = f60930f + 105;
                f60929e = i18 % 128;
                if (i18 % i11 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[c10] = Integer.valueOf(iArr3[i17]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i14));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 44 - (ViewConfiguration.getTapTimeout() >> 16), (Process.myTid() >> 22) + 728);
                            byte b10 = (byte) (i13 & 1);
                            byte b11 = (byte) (b10 - 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, b10, b11, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(1833429914, method);
                        }
                        iArr2[i17] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    length = length;
                    Object[] objArr4 = {Integer.valueOf(iArr3[i17])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1833429914);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 44, Color.alpha(0) + 728);
                        byte b12 = (byte) (i13 & 1);
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b12, b13, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(1833429914, method2);
                    }
                    iArr2[i17] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    i17++;
                }
                length = length;
                i11 = 2;
                i14 = 1833429914;
                c10 = 0;
            }
        } else {
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int i19 = 0;
            while (i19 < length3) {
                Object[] objArr6 = new Object[i12];
                objArr6[0] = Integer.valueOf(iArr3[i19]);
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(1833429914);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) View.resolveSize(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 728);
                    byte b14 = (byte) (i13 & 1);
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    b(b15, b14, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
                    map3.put(1833429914, method3);
                }
                iArr5[i19] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                i19++;
                iArr3 = iArr3;
                length3 = length3;
                i13 = i13;
                i12 = 1;
            }
            int i20 = f60929e + 55;
            f60930f = i20 % 128;
            int i21 = i20 % 2;
            iArr3 = iArr5;
        }
        System.arraycopy(iArr3, 0, iArr4, 0, length2);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i22 = setonlongclicklistener.setDividerPadding;
            if (i22 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
            int i23 = f60930f + 119;
            f60929e = i23 % 128;
            int i24 = i23 % 2;
            int i25 = iArr[i22];
            char c11 = (char) (i25 >> 16);
            cArr[0] = c11;
            char c12 = (char) i25;
            cArr[1] = c12;
            int i26 = iArr[i22 + 1];
            char c13 = (char) (i26 >> 16);
            cArr[2] = c13;
            char c14 = (char) i26;
            cArr[3] = c14;
            setonlongclicklistener.setY = (c11 << 16) + c12;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
            setOnLongClickListener.setX(iArr4);
            int i27 = f60930f + 69;
            f60929e = i27 % 128;
            int i28 = 2;
            int i29 = i27 % 2;
            int i30 = 0;
            while (i30 < 16) {
                int i31 = f60930f + 101;
                f60929e = i31 % 128;
                int i32 = i31 % i28;
                int i33 = setonlongclicklistener.setY ^ iArr4[i30];
                setonlongclicklistener.setY = i33;
                Object[] objArr8 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i33)), setonlongclicklistener, setonlongclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-350984188);
                if (method4 == null) {
                    method4 = ((Class) setTextScaleX.setX((char) Color.alpha(0), (ViewConfiguration.getScrollBarSize() >> 8) + 41, View.MeasureSpec.makeMeasureSpec(0, 0) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map4.put(-350984188, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i30++;
                i28 = 2;
            }
            int i34 = setonlongclicklistener.setY;
            int i35 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i36 = i34 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i36;
            int i37 = i35 ^ iArr4[17];
            setonlongclicklistener.setY = i37;
            cArr[0] = (char) (i37 >>> 16);
            cArr[1] = (char) i37;
            cArr[2] = (char) (i36 >>> 16);
            cArr[3] = (char) i36;
            setOnLongClickListener.setX(iArr4);
            int i38 = setonlongclicklistener.setDividerPadding * 2;
            cArr2[i38] = cArr[0];
            cArr2[i38 + 1] = cArr[1];
            cArr2[i38 + 2] = cArr[2];
            cArr2[i38 + 3] = cArr[3];
            Object[] objArr9 = {setonlongclicklistener, setonlongclicklistener};
            Map map5 = setTextScaleX.setMaxEms;
            Object method5 = map5.get(-147294223);
            if (method5 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 40, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 483);
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr10 = new Object[1];
                b(b17, b16, b17, objArr10);
                method5 = cls4.getMethod((String) objArr10[0], Object.class, Object.class);
                map5.put(-147294223, method5);
            }
            ((Method) method5).invoke(null, objArr9);
        }
    }

    public static void b(int i10, short s4, short s7, Object[] objArr) {
        int i11 = (s7 * 2) + 4;
        int i12 = 108 - (s4 * 4);
        int i13 = i10 * 3;
        byte[] bArr = new byte[i13 + 1];
        int i14 = -1;
        byte[] bArr2 = f60931g;
        if (bArr2 == null) {
            i11++;
            i12 = i13 + i12;
            i13 = i13;
        }
        while (true) {
            i14++;
            bArr[i14] = (byte) i12;
            if (i14 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i15 = i12;
            int i16 = i13;
            i11++;
            i12 = i15 + bArr2[i11];
            i13 = i16;
        }
    }

    public static void c() {
        f60931g = new byte[]{58, 35, -30, 127};
        f60932h = 71;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:22:0x00a8->B:39:?, LOOP_END, SYNTHETIC] */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        boolean dividerPadding;
        List<String> y7;
        Iterator<T> it;
        int i13;
        startTransactiondefault starttransactiondefault = (startTransactiondefault) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        String str = (String) objArr[2];
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        CertPath certPathEngineGenerateCertPath = new aoi().engineGenerateCertPath(new ByteArrayInputStream(bArr), str);
        Intrinsics.checkNotNullExpressionValue(certPathEngineGenerateCertPath, "");
        if (!TerminalSessionCallbackKt.setCompoundDrawableTintBlendMode(certPathEngineGenerateCertPath)) {
            throw new setHorizontalScrollbarThumbDrawable();
        }
        X509Certificate x4 = TerminalSessionCallbackKt.setX(certPathEngineGenerateCertPath);
        X509Certificate dividerPadding2 = TerminalSessionCallbackKt.setDividerPadding(certPathEngineGenerateCertPath);
        if (x4 == null) {
            int i14 = f60927c + 107;
            f60928d = i14 % 128;
            int i15 = i14 % 2;
            dividerPadding = false;
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{-1830179275, -1891644614, 291108643, -796013837, 873516893, 313458556, 1685936154, 58618400, -1531791682, -917170373, -1617785495, -1499842491, 267817994, -1247702164, -332411325, 160460794, -190149749, -5286663, -65905032, 69505125, 77734593, 437479727}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, objArr2);
            dividerPadding = TerminalSessionCallbackKt.setDividerPadding(x4, ((String) objArr2[0]).intern());
            int i16 = f60927c + 85;
            f60928d = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
        }
        if (!(!dividerPadding)) {
            int i17 = f60928d + 63;
            f60927c = i17 % 128;
            int i18 = i17 % 2;
            starttransactiondefault.getClass();
            int i19 = f60927c + 115;
            f60928d = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 53 / 0;
                if (dividerPadding2 != null) {
                    y7 = dispose.setY();
                    if ((y7 instanceof Collection) || !y7.isEmpty()) {
                        it = y7.iterator();
                        while (it.hasNext()) {
                            if (((Boolean) TerminalSessionCallbackKt.setOnFocusChangeListener(new Object[]{dividerPadding2, (String) it.next()}, -589787074, 589787074, (int) System.currentTimeMillis())).booleanValue()) {
                                i13 = f60927c + 13;
                                f60928d = i13 % 128;
                                if (i13 % 2 == 0) {
                                    int i21 = 35 / 0;
                                }
                                Intrinsics.checkNotNull(x4);
                                byte[] encoded = x4.getPublicKey().getEncoded();
                                Intrinsics.checkNotNullExpressionValue(encoded, "");
                                int i22 = f60928d + 33;
                                f60927c = i22 % 128;
                                int i23 = i22 % 2;
                                return encoded;
                            }
                        }
                    }
                }
            } else if (dividerPadding2 != null) {
                y7 = dispose.setY();
                if (y7 instanceof Collection) {
                    it = y7.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) TerminalSessionCallbackKt.setOnFocusChangeListener(new Object[]{dividerPadding2, (String) it.next()}, -589787074, 589787074, (int) System.currentTimeMillis())).booleanValue()) {
                            i13 = f60927c + 13;
                            f60928d = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i24 = 35 / 0;
                            }
                            Intrinsics.checkNotNull(x4);
                            byte[] encoded2 = x4.getPublicKey().getEncoded();
                            Intrinsics.checkNotNullExpressionValue(encoded2, "");
                            int i25 = f60928d + 33;
                            f60927c = i25 % 128;
                            int i26 = i25 % 2;
                            return encoded2;
                        }
                    }
                } else {
                    it = y7.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) TerminalSessionCallbackKt.setOnFocusChangeListener(new Object[]{dividerPadding2, (String) it.next()}, -589787074, 589787074, (int) System.currentTimeMillis())).booleanValue()) {
                            i13 = f60927c + 13;
                            f60928d = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i27 = 35 / 0;
                            }
                            Intrinsics.checkNotNull(x4);
                            byte[] encoded3 = x4.getPublicKey().getEncoded();
                            Intrinsics.checkNotNullExpressionValue(encoded3, "");
                            int i28 = f60928d + 33;
                            f60927c = i28 % 128;
                            int i29 = i28 % 2;
                            return encoded3;
                        }
                    }
                }
            }
        }
        throw new setHorizontalScrollbarThumbDrawable();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a2  */
    @NotNull
    public final byte[] setOnFocusChangeListener() throws Throwable {
        byte b10;
        int i10;
        getScope getscope = this.f60933a;
        String compoundDrawableTintBlendMode = getscope.setCompoundDrawableTintBlendMode();
        String strReplace = setNetworkAvailable.setY().replace(getscope.setY(), "");
        if (!(strReplace.length() % 2 == 0)) {
            Object[] objArr = new Object[1];
            a(new int[]{-1998058394, -883482280, -1893746890, 787484688, 1240623041, -1004640121, 393368931, 1977445169, -724530184, 1437202720}, AndroidCharacter.getMirror('0') - 29, objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern().toString());
        }
        byte[] bArr = new byte[strReplace.length() / 2];
        for (int i11 = 0; i11 < strReplace.length(); i11 += 2) {
            int i12 = f60927c + 45;
            f60928d = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 / 2;
            Pair pair = TuplesKt.to(Character.valueOf(strReplace.charAt(i11)), Character.valueOf(strReplace.charAt(i11 + 1)));
            char cCharValue = ((Character) pair.getFirst()).charValue();
            if (cCharValue == '0') {
                b10 = 0;
            } else if (cCharValue == '1') {
                b10 = 1;
            } else if (cCharValue == '2') {
                b10 = 2;
            } else if (cCharValue == '3') {
                b10 = 3;
            } else if (cCharValue == '4') {
                b10 = 4;
            } else if (cCharValue == '5') {
                b10 = 5;
            } else if (cCharValue == '6') {
                b10 = 6;
            } else if (cCharValue == '7') {
                b10 = 7;
            } else if (cCharValue == '8') {
                b10 = 8;
            } else if (cCharValue == '9') {
                b10 = 9;
            } else if (cCharValue == 'a' || cCharValue == 'A') {
                b10 = 10;
            } else if (cCharValue == 'b' || cCharValue == 'B') {
                b10 = 11;
            } else if (cCharValue == 'c' || cCharValue == 'C') {
                b10 = 12;
            } else if (cCharValue == 'd' || cCharValue == 'D') {
                b10 = 13;
            } else if (cCharValue == 'e' || cCharValue == 'E') {
                b10 = 14;
            } else {
                if (cCharValue != 'f') {
                    if (cCharValue != 'F') {
                        throw new IllegalArgumentException(String.valueOf(cCharValue));
                    }
                    int i15 = f60928d + 121;
                    f60927c = i15 % 128;
                    int i16 = i15 % 2;
                }
                b10 = 15;
            }
            int iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(UByte.m5545constructorimpl((byte) 16) & 255) * UInt.m5570constructorimpl(UByte.m5545constructorimpl(b10) & 255));
            char cCharValue2 = ((Character) pair.getSecond()).charValue();
            if (cCharValue2 == '0') {
                int i17 = f60928d + 11;
                f60927c = i17 % 128;
                int i18 = i17 % 2;
                i10 = 0;
            } else if (cCharValue2 == '1') {
                int i19 = f60928d + 79;
                f60927c = i19 % 128;
                int i20 = i19 % 2;
                i10 = 1;
            } else if (cCharValue2 == '2') {
                int i21 = f60927c + 21;
                f60928d = i21 % 128;
                i10 = i21 % 2 == 0 ? 3 : 2;
            } else if (cCharValue2 == '3') {
                int i22 = f60927c + 7;
                f60928d = i22 % 128;
                int i23 = i22 % 2;
            } else if (cCharValue2 == '4') {
                i10 = 4;
            } else if (cCharValue2 == '5') {
                i10 = 5;
            } else if (cCharValue2 == '6') {
                i10 = 6;
            } else if (cCharValue2 == '7') {
                int i24 = f60928d;
                int i25 = i24 + 11;
                f60927c = i25 % 128;
                int i26 = i25 % 2;
                int i27 = i24 + 93;
                f60927c = i27 % 128;
                int i28 = i27 % 2;
                i10 = 7;
            } else if (cCharValue2 == '8') {
                i10 = 8;
            } else if (cCharValue2 == '9') {
                i10 = 9;
            } else if (cCharValue2 == 'a') {
                i10 = 10;
            } else if (cCharValue2 == 'A') {
                int i29 = f60927c + 45;
                f60928d = i29 % 128;
                if (i29 % 2 == 0) {
                    i10 = 107;
                } else {
                    i10 = 10;
                }
            } else if (cCharValue2 == 'b' || cCharValue2 == 'B') {
                i10 = 11;
            } else if (cCharValue2 == 'c' || cCharValue2 == 'C') {
                i10 = 12;
            } else if (cCharValue2 == 'd' || cCharValue2 == 'D') {
                i10 = 13;
            } else if (cCharValue2 == 'e' || cCharValue2 == 'E') {
                i10 = 14;
            } else {
                if (cCharValue2 != 'f') {
                    if (cCharValue2 != 'F') {
                        throw new IllegalArgumentException(String.valueOf(cCharValue2));
                    }
                    int i30 = f60928d + 1;
                    f60927c = i30 % 128;
                    int i31 = i30 % 2;
                }
                i10 = 15;
            }
            bArr[i14] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(i10) + iM5570constructorimpl);
        }
        if (((Boolean) dispose.setX(new Object[]{bArr, compoundDrawableTintBlendMode}, 622734011, -622734011, (int) System.currentTimeMillis())).booleanValue()) {
            return bArr;
        }
        throw new setAutoLinkMask();
    }

    public final void setOnFocusChangeListener(@NotNull byte[] bArr) {
        char c10;
        String str = "";
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 0) {
            int i10 = f60927c + 111;
            f60928d = i10 % 128;
            int i11 = i10 % 2;
        } else {
            char[] cArr = new char[bArr.length << 1];
            for (int i12 = 0; i12 < bArr.length; i12++) {
                byte b10 = bArr[i12];
                int i13 = i12 << 1;
                byte b11 = (byte) ((b10 >>> 4) & 15);
                char c11 = '0';
                switch (b11) {
                    case 0:
                        c10 = '0';
                        break;
                    case 1:
                        c10 = '1';
                        break;
                    case 2:
                        c10 = '2';
                        break;
                    case 3:
                        c10 = '3';
                        break;
                    case 4:
                        c10 = '4';
                        break;
                    case 5:
                        c10 = '5';
                        break;
                    case 6:
                        c10 = '6';
                        break;
                    case 7:
                        c10 = '7';
                        break;
                    case 8:
                        c10 = '8';
                        break;
                    case 9:
                        c10 = '9';
                        break;
                    case 10:
                        c10 = 'a';
                        break;
                    case 11:
                        c10 = 'b';
                        break;
                    case 12:
                        c10 = 'c';
                        break;
                    case 13:
                        c10 = 'd';
                        break;
                    case 14:
                        c10 = 'e';
                        break;
                    case 15:
                        c10 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b11));
                }
                cArr[i13] = c10;
                int i14 = i13 + 1;
                byte b12 = (byte) (b10 & 15);
                switch (b12) {
                    case 0:
                        break;
                    case 1:
                        c11 = '1';
                        break;
                    case 2:
                        c11 = '2';
                        break;
                    case 3:
                        c11 = '3';
                        break;
                    case 4:
                        c11 = '4';
                        break;
                    case 5:
                        c11 = '5';
                        break;
                    case 6:
                        c11 = '6';
                        break;
                    case 7:
                        c11 = '7';
                        break;
                    case 8:
                        int i15 = f60927c + 27;
                        f60928d = i15 % 128;
                        int i16 = i15 % 2;
                        c11 = '8';
                        break;
                    case 9:
                        c11 = '9';
                        break;
                    case 10:
                        c11 = 'a';
                        break;
                    case 11:
                        c11 = 'b';
                        break;
                    case 12:
                        c11 = 'c';
                        break;
                    case 13:
                        c11 = 'd';
                        break;
                    case 14:
                        c11 = 'e';
                        break;
                    case 15:
                        int i17 = f60927c + 111;
                        f60928d = i17 % 128;
                        int i18 = i17 % 2;
                        c11 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b12));
                }
                cArr[i14] = c11;
            }
            str = new String(cArr);
        }
        this.f60933a.setDividerPadding(str, dispose.setY(bArr));
    }

    @NotNull
    public final byte[] setOnFocusChangeListener(@NotNull byte[] bArr, @NotNull String str) {
        return (byte[]) setDividerPadding(new Object[]{this, bArr, str}, 134364618, -134364618, System.identityHashCode(this));
    }
}
