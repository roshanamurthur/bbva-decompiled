package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.nfc.tech.IsoDep;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class oe implements ns {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f57452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f57453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f57454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char[] f57455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f57456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f57459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f57460l;
    public static final byte[] m = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final nm f57461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IsoDep f57462b;

    static {
        d();
        f57459k = 0;
        f57460l = 1;
        f57457i = 0;
        f57458j = 1;
        f57451c = -2954180;
        f57452d = -1454817086;
        f57453e = 1348707118;
        f57454f = new byte[]{46, 32, -52, 63, -55, -9, -53, Base64.padSymbol, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -53, -103, -107, -53, -40, 84, -56, 47, -48, -32, Constants.CVR_B2b87_11_RFU, -117, -52, 109, 5, -87, -113, -74, -68, -62, -73, -113, -87, -40};
        f57456h = (char) 53956;
        f57455g = new char[]{59186, 59183, 59187, 59176, 59188, 59189, 59157, 59196, 59197, 59192, 59165, 59193, 59259, 59181, 59151, 59191, 59160, 59198, 59199, 59177, 59253, 59179, 59233, 59194, 59190};
    }

    public oe(@NotNull nm nmVar, @NotNull IsoDep isoDep) {
        Intrinsics.checkNotNullParameter(nmVar, "");
        Intrinsics.checkNotNullParameter(isoDep, "");
        this.f57461a = nmVar;
        this.f57462b = isoDep;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01c6 A[PHI: r1
      0x01c6: PHI (r1v9 int) = (r1v8 int), (r1v29 int) binds: [B:46:0x01c4, B:43:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01c8 A[PHI: r1
      0x01c8: PHI (r1v26 int) = (r1v8 int), (r1v29 int) binds: [B:46:0x01c4, B:43:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        boolean z10;
        byte[] bArr2;
        int length;
        int i16 = f57452d;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i17 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i16)};
            int i18 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionGroup(0L), 49 - ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0', 0) + 435);
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                c(b11, b12, (byte) (b12 | 10), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            boolean z11 = iIntValue == -1;
            int i19 = f57451c;
            byte[] bArr3 = f57454f;
            if (z11) {
                if (bArr3 != null) {
                    int i20 = f57460l + 63;
                    int i21 = i20 % 128;
                    f57459k = i21;
                    if (i20 % 2 != 0) {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                    } else {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                    }
                    f57459k = i21;
                    int i22 = 0;
                    while (i22 < length) {
                        Object[] objArr4 = new Object[i17];
                        objArr4[i18] = Integer.valueOf(bArr3[i22]);
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (49111 - View.resolveSize(i18, i18)), (ViewConfiguration.getLongPressTimeout() >> 16) + 41, 52 - (CdmaCellLocation.convertQuartSecToDecDegrees(i18) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i18) == 0.0d ? 0 : -1)))).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i22] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i22++;
                        length = length;
                        i17 = 1;
                        i18 = 0;
                    }
                } else {
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i19)};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-769569468);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 49 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 433);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    c(b13, b14, (byte) (b14 | 10), objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str2, cls4, cls4);
                    map3.put(-769569468, method3);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i16) ^ 7616081452308447380L)));
            }
            if (iIntValue > 0) {
                int i23 = f57460l + 45;
                f57459k = i23 % 128;
                if (i23 % 2 != 0) {
                    i13 = ((i12 << iIntValue) * 5) % ((int) (((long) i19) - 7616081452308447380L));
                    if (z11) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                } else {
                    i13 = ((i12 + iIntValue) - 2) + ((int) (((long) i19) ^ 7616081452308447380L));
                    if (z11) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                }
                settextalignment.setX = i13 + i14;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f57453e), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2803);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    c(b15, b16, (byte) (b16 | 13), objArr8);
                    String str3 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                    map4.put(193260760, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr = new byte[length2];
                    int i24 = 0;
                    while (i24 < length2) {
                        int i25 = f57460l + 5;
                        f57459k = i25 % 128;
                        if (i25 % 2 != 0) {
                            bArr[i24] = (byte) (((long) bArr3[i24]) * 7616081452308447380L);
                        } else {
                            bArr[i24] = (byte) (((long) bArr3[i24]) ^ 7616081452308447380L);
                            i24++;
                        }
                    }
                } else {
                    bArr = bArr3;
                }
                if (bArr != null) {
                    int i26 = f57460l + 67;
                    f57459k = i26 % 128;
                    int i27 = i26 % 2;
                    i15 = 1;
                    z10 = true;
                } else {
                    i15 = 1;
                    z10 = false;
                }
                while (true) {
                    settextalignment.setDividerPadding = i15;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i28 = f57460l + 95;
                    f57459k = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = settextalignment.setX;
                    settextalignment.setX = i30 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i30]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i15 = settextalignment.setDividerPadding + 1;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void b(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        char c10;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f57455g;
        int i12 = 290255894;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i12));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 44, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1116);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13++;
                    i12 = 290255894;
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
        Object[] objArr4 = {Integer.valueOf(f57456h)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        char c11 = '\b';
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), 45 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1117 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            c(b13, b14, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        int i14 = 2;
        if (i11 > 1) {
            int i15 = f57460l;
            int i16 = i15 + 123;
            f57459k = i16 % 128;
            int i17 = i16 % 2;
            setincludefontpadding.setDividerPadding = 0;
            int i18 = i15 + 57;
            f57459k = i18 % 128;
            int i19 = i18 % 2;
            while (true) {
                int i20 = setincludefontpadding.setDividerPadding;
                if (i20 >= i11) {
                    break;
                }
                char c12 = charArray[i20];
                setincludefontpadding.setY = c12;
                int i21 = i20 + 1;
                char c13 = charArray[i21];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                if (c12 == c13) {
                    int i22 = f57459k + 75;
                    int i23 = i22 % 128;
                    f57460l = i23;
                    if (i22 % i14 == 0) {
                        cArr3[i20] = (char) (c12 / b10);
                        cArr3[i20 >>> 1] = (char) (c13 >> b10);
                    } else {
                        cArr3[i20] = (char) (c12 - b10);
                        cArr3[i21] = (char) (c13 - b10);
                    }
                    int i24 = i23 + 121;
                    f57459k = i24 % 128;
                    int i25 = i24 % i14;
                    c10 = c11;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = setincludefontpadding;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = setincludefontpadding;
                    objArr6[9] = setincludefontpadding;
                    objArr6[c11] = Integer.valueOf(cCharValue);
                    objArr6[7] = setincludefontpadding;
                    objArr6[6] = setincludefontpadding;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = setincludefontpadding;
                    objArr6[3] = setincludefontpadding;
                    objArr6[i14] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[0] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 27, 2311 - Color.red(0));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        c(b15, b16, (byte) (b16 + 3), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i26 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i26) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 != null) {
                            c10 = '\b';
                        } else {
                            Class cls5 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49103), 35 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 2545);
                            byte b17 = (byte) 0;
                            byte b18 = b17;
                            Object[] objArr9 = new Object[1];
                            c(b17, b18, (byte) (b18 | 7), objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            c10 = '\b';
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i27 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i28 = setincludefontpadding.setDividerPadding;
                        cArr3[i28] = cArr[iIntValue2];
                        cArr3[i28 + 1] = cArr[i27];
                    } else {
                        c10 = '\b';
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
                c11 = c10;
                i14 = 2;
            }
        }
        for (int i36 = 0; i36 < i10; i36++) {
            int i37 = f57460l + 59;
            f57459k = i37 % 128;
            int i38 = i37 % 2;
            cArr3[i36] = (char) (cArr3[i36] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void c(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = (i10 * 4) + 4;
        int i12 = b10 * 4;
        int i13 = s4 + 99;
        byte[] bArr = new byte[i12 + 1];
        int i14 = -1;
        byte[] bArr2 = m;
        if (bArr2 == null) {
            objArr = objArr;
            bArr = bArr;
            i14 = -1;
            bArr2 = bArr2;
            i13 = i11 + i13;
            i11++;
        }
        while (true) {
            int i15 = i14 + 1;
            bArr[i15] = (byte) i13;
            if (i15 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i16 = i13;
            objArr = objArr;
            bArr = bArr;
            i14 = i15;
            bArr2 = bArr2;
            i13 = bArr2[i11] + i16;
            i11++;
        }
    }

    public static void d() {
        m = new byte[]{12, -82, -41, -21};
    }

    @Override // com.mypinpad.tsdk.isolation.ns
    public final void setCompoundDrawableTintBlendMode(long j10) throws Throwable {
        int i10 = f57458j + 27;
        f57457i = i10 % 128;
        int i11 = i10 % 2;
        mr mrVar = mr.setOnFocusChangeListener;
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0) - 87, (byte) ((-44) - ImageFormat.getBitsPerPixel(0)), (short) (121 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 131407033, (-1453042856) + (ViewConfiguration.getTapTimeout() >> 16), objArr);
        mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        IsoDep isoDep = this.f57462b;
        isoDep.setTimeout((int) j10);
        try {
            isoDep.connect();
            int i12 = f57458j + 113;
            f57457i = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 43 / 0;
            }
        } catch (IOException unused) {
            mr mrVar2 = mr.setOnFocusChangeListener;
            Object[] objArr2 = new Object[1];
            b(31 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\f\u0004\u0016\u0011\u0005\u000b\u0011\u000b\r\u0018\f\u0011\u000e\t㘑㘑\u0013\u0007\u0002\u0001\u0000\t\r\u0007\u0014\u0003\u0010\u0012\u000f\u0017", (byte) (29 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr2);
            mt.setX(new Object[]{mrVar2, ((String) objArr2[0]).intern()}, -855939515, 855939522, (int) System.currentTimeMillis());
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ns
    @NotNull
    public final byte[] setDividerPadding(@NotNull byte[] bArr) throws Throwable {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f57461a.setY();
        mr mrVar = mr.setOnFocusChangeListener;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) - 86, (byte) (TextUtils.getCapsMode("", 0, 0) + 108), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 71), 114629817 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) - 1453042840, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append((String) ux.setCompoundDrawableTintBlendMode(new Object[]{bArr}, -907784665, 907784665, (int) System.currentTimeMillis()));
        mt.setX(new Object[]{mrVar, sb2.toString()}, -225944049, 225944051, (int) System.currentTimeMillis());
        byte[] bArrTransceive = this.f57462b.transceive(bArr);
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b(18 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0004\u0010\u0014\b\u0004\b\u000f\u0002\f\u0012\u000e\u0011\u0013\u0007\f\u0017㗠", (byte) (39 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr2);
        sb3.append(((String) objArr2[0]).intern());
        Intrinsics.checkNotNullExpressionValue(bArrTransceive, "");
        sb3.append((String) ux.setCompoundDrawableTintBlendMode(new Object[]{bArrTransceive}, -907784665, 907784665, (int) System.currentTimeMillis()));
        mt.setX(new Object[]{mrVar, sb3.toString()}, -225944049, 225944051, (int) System.currentTimeMillis());
        Intrinsics.checkNotNullExpressionValue(bArrTransceive, "");
        int i10 = f57457i + 39;
        f57458j = i10 % 128;
        int i11 = i10 % 2;
        return bArrTransceive;
    }

    @Override // com.mypinpad.tsdk.isolation.ns
    public final void setX() throws Throwable {
        int i10 = f57458j + 51;
        f57457i = i10 % 128;
        int i11 = i10 % 2;
        IsoDep isoDep = this.f57462b;
        if (i11 != 0) {
            mr mrVar = mr.setOnFocusChangeListener;
            Object[] objArr = new Object[1];
            b(102 / ((byte) KeyEvent.getModifierMetaStateMask()), "\u0004\u0002\u0001\u0018\u000b\u0016\u0018\t\u0007\u0013㙍㙍\u0005\n㙡", (byte) (6 / TextUtils.getTrimmedLength("")), objArr);
            mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        } else {
            mr mrVar2 = mr.setOnFocusChangeListener;
            Object[] objArr2 = new Object[1];
            b(((byte) KeyEvent.getModifierMetaStateMask()) + 16, "\u0004\u0002\u0001\u0018\u000b\u0016\u0018\t\u0007\u0013㙍㙍\u0005\n㙡", (byte) (100 - TextUtils.getTrimmedLength("")), objArr2);
            mt.setX(new Object[]{mrVar2, ((String) objArr2[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        }
        isoDep.close();
        int i12 = f57458j + 79;
        f57457i = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 97 / 0;
        }
    }
}
