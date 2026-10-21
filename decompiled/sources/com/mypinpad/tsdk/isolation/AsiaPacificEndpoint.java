package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/AsiaPacificEndpoint;", "", "", "p0", "Lcom/mypinpad/tsdk/i/getApplicationFilteringSelectors$setY;", "setX", "([B)Lcom/mypinpad/tsdk/i/getApplicationFilteringSelectors$setY;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/getApplicationFilteringSelectors$setY;)[B", "", "setY", "()V", "Lcom/mypinpad/tsdk/i/setColorFilter;", "<init>", "(Lcom/mypinpad/tsdk/i/setColorFilter;)V"}, k = 1, mv = {1, 5, 1})
public final class AsiaPacificEndpoint {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static byte[] f51732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static char f51733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static char f51734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static char f51735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static char f51736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f51737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f51738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f51739l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f51740n = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setColorFilter f51741a;

    static {
        d();
        f51739l = 0;
        m = 1;
        f51737j = 0;
        f51738k = 1;
        e();
        Color.blue(0);
        Process.myTid();
        ViewConfiguration.getTapTimeout();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        View.getDefaultSize(0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.getTrimmedLength("");
        TextUtils.getOffsetAfter("", 0);
        TextUtils.indexOf((CharSequence) "", '0');
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getKeyRepeatDelay();
        PointF.length(0.0f, 0.0f);
        PointF.length(0.0f, 0.0f);
        TextUtils.indexOf("", "", 0, 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        INSTANCE = new Companion(null);
        int i10 = f51737j + 109;
        f51738k = i10 % 128;
        int i11 = i10 % 2;
    }

    public AsiaPacificEndpoint(@NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f51741a = setcolorfilter;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0260 A[PHI: r3
      0x0260: PHI (r3v11 int) = (r3v10 int), (r3v53 int) binds: [B:50:0x025e, B:47:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x026a A[PHI: r3
      0x026a: PHI (r3v50 int) = (r3v10 int), (r3v53 int) binds: [B:50:0x025e, B:47:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        boolean z10;
        int i13;
        int i14;
        int i15;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(f51730c)};
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) Color.red(0), View.MeasureSpec.getSize(0) + 49, 434 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                byte b11 = (byte) (-1);
                byte b12 = (byte) (b11 + 4);
                Object[] objArr3 = new Object[1];
                b(b12, b11, (byte) (b12 - 3), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i16 = m + 81;
                f51739l = i16 % 128;
                int i17 = i16 % 2;
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i18 = m;
                int i19 = i18 + 85;
                f51739l = i19 % 128;
                int i20 = i19 % 2;
                byte[] bArr = f51732e;
                float f6 = 0.0f;
                char c10 = '0';
                if (bArr != null) {
                    int i21 = i18 + 111;
                    f51739l = i21 % 128;
                    int i22 = i21 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i23 = 0;
                    while (i23 < length) {
                        Object[] objArr4 = {Integer.valueOf(bArr[i23])};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", c10, 0) + 49112), TextUtils.indexOf("", "", 0, 0) + 41, 53 - (AudioTrack.getMaxVolume() > f6 ? 1 : (AudioTrack.getMaxVolume() == f6 ? 0 : -1)))).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i23] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i23++;
                        f6 = 0.0f;
                        c10 = '0';
                    }
                    bArr = bArr2;
                }
                bArr.getClass();
                int i24 = m + 25;
                f51739l = i24 % 128;
                if (i24 % 2 != 0) {
                    byte[] bArr3 = f51732e;
                    Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(f51729b)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-769569468);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 49, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 434);
                        byte b13 = (byte) (-1);
                        byte b14 = (byte) (b13 + 4);
                        Object[] objArr6 = new Object[1];
                        b(b14, b13, (byte) (b14 - 3), objArr6);
                        String str2 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, cls4, cls4);
                        map3.put(-769569468, method3);
                    }
                    i15 = ((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) - 7616081452308447380L)) * ((int) (((long) f51730c) - 7616081452308447380L));
                } else {
                    byte[] bArr4 = f51732e;
                    Object[] objArr7 = {Integer.valueOf(i12), Integer.valueOf(f51729b)};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-769569468);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 50, 434 - Color.green(0));
                        byte b15 = (byte) (-1);
                        byte b16 = (byte) (b15 + 4);
                        Object[] objArr8 = new Object[1];
                        b(b16, b15, (byte) (b16 - 3), objArr8);
                        String str3 = (String) objArr8[0];
                        Class<?> cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str3, cls6, cls6);
                        map4.put(-769569468, method4);
                    }
                    i15 = ((byte) (((long) bArr4[((Integer) ((Method) method4).invoke(null, objArr7)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) f51730c) ^ 7616081452308447380L));
                }
                iIntValue = (byte) i15;
            }
            if (iIntValue > 0) {
                int i25 = m + 13;
                int i26 = i25 % 128;
                f51739l = i26;
                if (i25 % 2 != 0) {
                    i13 = ((i12 + iIntValue) >>> 2) % ((int) (((long) f51729b) % 7616081452308447380L));
                    if (z10) {
                        int i27 = i26 + 85;
                        m = i27 % 128;
                        int i28 = i27 % 2;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                } else {
                    i13 = ((i12 + iIntValue) - 2) + ((int) (((long) f51729b) ^ 7616081452308447380L));
                    if (z10) {
                        int i29 = i26 + 85;
                        m = i29 % 128;
                        int i210 = i29 % 2;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                }
                settextalignment.setX = i13 + i14;
                Object[] objArr9 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f51731d), sb2};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(193260760);
                if (method5 == null) {
                    Class cls7 = (Class) setTextScaleX.setX((char) View.combineMeasuredStates(0, 0), 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 2803 - KeyEvent.getDeadChar(0, 0));
                    byte b17 = (byte) (-1);
                    byte b18 = (byte) (b17 + 1);
                    Object[] objArr10 = new Object[1];
                    b(b18, b17, b18, objArr10);
                    String str4 = (String) objArr10[0];
                    Class<?> cls8 = Integer.TYPE;
                    method5 = cls7.getMethod(str4, Object.class, cls8, cls8, Object.class);
                    map5.put(193260760, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr9)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                byte[] bArr5 = f51732e;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i30 = 0; i30 < length2; i30++) {
                        bArr6[i30] = (byte) (((long) bArr5[i30]) ^ 7616081452308447380L);
                    }
                    bArr5 = bArr6;
                }
                boolean z11 = bArr5 != null;
                settextalignment.setDividerPadding = 1;
                while (settextalignment.setDividerPadding < iIntValue) {
                    int i31 = m;
                    int i32 = i31 + 11;
                    f51739l = i32 % 128;
                    int i33 = i32 % 2;
                    if (!z11) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i34 = i31 + 125;
                    f51739l = i34 % 128;
                    if (i34 % 2 != 0) {
                        byte[] bArr7 = f51732e;
                        int i35 = settextalignment.setX;
                        settextalignment.setX = i35;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY >>> (((byte) (((byte) (((long) bArr7[i35]) / 7616081452308447380L)) / s4)) ^ b10));
                    } else {
                        byte[] bArr8 = f51732e;
                        int i36 = settextalignment.setX;
                        settextalignment.setX = i36 - 1;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr8[i36]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    }
                    sb2.append(settextalignment.setCompoundDrawableTintBlendMode);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    settextalignment.setDividerPadding++;
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

    public static void b(int i10, short s4, short s7, Object[] objArr) {
        int i11 = s4 + 4;
        int i12 = s7 * 4;
        int i13 = 112 - i10;
        byte[] bArr = new byte[1 - i12];
        int i14 = 0 - i12;
        int i15 = -1;
        byte[] bArr2 = f51740n;
        if (bArr2 == null) {
            int i16 = i11 + i14;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            i15 = -1;
            bArr2 = bArr2;
            i11 = i11;
            i13 = i16;
        }
        while (true) {
            int i17 = i15 + 1;
            bArr[i17] = (byte) i13;
            if (i17 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i18 = i11 + 1;
            int i19 = i14;
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            Object[] objArr2 = objArr;
            int i20 = bArr2[i18] + i13;
            i14 = i19;
            objArr = objArr2;
            bArr = bArr4;
            i15 = i17;
            bArr2 = bArr3;
            i11 = i18;
            i13 = i20;
        }
    }

    public static void c(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        int i13 = m + 5;
        f51739l = i13 % 128;
        int i14 = 2;
        if (i13 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i15 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i16 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i17 = f51739l + 23;
            m = i17 % 128;
            int i18 = 58224;
            if (i17 % i14 == 0) {
                cArr2[1] = charArray[i16];
                cArr2[i15] = charArray[i16 % 0];
                i11 = 1;
            } else {
                cArr2[i15] = charArray[i16];
                cArr2[1] = charArray[i16 + 1];
                i11 = i15;
            }
            while (i11 < 16) {
                char c10 = cArr2[1];
                char c11 = cArr2[i15];
                int i19 = (c11 + i18) ^ ((c11 << 4) + ((char) (((long) f51735h) ^ 4333817592127744003L)));
                int i20 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f51736i);
                    objArr2[i14] = Integer.valueOf(i20);
                    objArr2[1] = Integer.valueOf(i19);
                    objArr2[i15] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((ExpandableListView.getPackedPositionForChild(i15, i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == 0L ? 0 : -1)) + 48535), 47 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 2672 - Gravity.getAbsoluteGravity(i15, i15));
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) i15;
                        Object[] objArr3 = new Object[1];
                        b((byte) (b10 & 9), b10, b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) f51733f) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f51734g)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - TextUtils.indexOf("", "", 0)), MotionEvent.axisFromString("") + 48, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2672);
                        byte b12 = (byte) (-1);
                        Object[] objArr5 = new Object[1];
                        b((byte) (b12 & 9), b12, (byte) 0, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 -= 40503;
                    i11++;
                    i14 = 2;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i21 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i21] = cArr2[0];
            cArr[i21 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i12 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') - 11, TextUtils.indexOf("", "", 0) + 2145);
                byte b13 = (byte) (-1);
                Object[] objArr7 = new Object[1];
                b((byte) (b13 & 7), b13, (byte) 0, objArr7);
                i12 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i12;
            i15 = 0;
        }
    }

    public static void d() {
        f51740n = new byte[]{39, -122, -47, 78};
    }

    public static void e() {
        f51729b = -395645290;
        f51730c = -1454817059;
        f51731d = -2055565402;
        f51732e = new byte[]{77, 37, -37, 31, -102, 53, Constants.CVR_B2b87_11_RFU, 48, 8, -58, 10, 25, -102, 8, -52, 8, -33, -61, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -54, -40, -52, 34, -38, -58, 108, -124, -62, 44, -88, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.CVR_B2b87_11_RFU, 10, -33, 46, Constants.CVR_B1b85_0110_TERMINAL, 110, 82, -50, 126, -10, -100, -41, 105, -105, -38, -10, -9, Constants.CVR_B2b8765_1111_APP_DISABLED, 99, -53, -128, 68, -22, 8, -52, 79, -6, 53, -27, -3, 11, -1, -50, 79, -3, 49, -3, 12, 48, -92, 63, 13, 49, 23, 15, 11, 92, -7, -67, -67, UtilitiesSDKConstants.SRP_LABEL_MAC, -77, -31, -79, -79, -121, 28, -76, -26, -102, -58, UtilitiesSDKConstants.SRP_LABEL_ENC, -66, 86, -14, 6, -12, -91, 93, 27, -55, 19, -15, -53};
        f51736i = (char) 48687;
        f51735h = (char) 47943;
        f51733f = (char) 52203;
        f51734g = (char) 17416;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        AsiaPacificEndpoint asiaPacificEndpoint = (AsiaPacificEndpoint) objArr[0];
        setColorFilter setcolorfilter = asiaPacificEndpoint.f51741a;
        Object[] objArr2 = new Object[1];
        a((-74) - TextUtils.indexOf("", ""), (byte) ((-84) - View.resolveSize(0, 0)), (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 8), (-741592779) - (ViewConfiguration.getPressedStateDuration() >> 16), (-1092857346) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{asiaPacificEndpoint.f51741a, 28, null, null, 6}, 1173867142, -1173867141, 28);
        Object[] objArr3 = new Object[1];
        a(Color.alpha(0) - 74, (byte) (11 - ImageFormat.getBitsPerPixel(0)), (short) (14 - (KeyEvent.getMaxKeyCode() >> 16)), (-741592816) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) - 1092857311, objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 75, (byte) ((-63) - Color.blue(0)), (short) ((-40) - Drawable.resolveOpacity(0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 741592818, TextUtils.indexOf((CharSequence) "", '0') - 1092857308, objArr4);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(strIntern, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 75, (byte) (View.combineMeasuredStates(0, 0) + 108), (short) ((-5) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-741592767) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), KeyEvent.normalizeMetaState(0) - 1092857294, objArr5);
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(((String) objArr5[0]).intern(), 3);
        builder.setKeySize(256);
        Object[] objArr6 = new Object[1];
        c("씲ꇐរ椱", (ViewConfiguration.getPressedStateDuration() >> 16) + 3, objArr6);
        builder.setBlockModes(((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        c("醐㏀\uf457팍蟜\ue074闪뢸퓽杀", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9, objArr7);
        builder.setEncryptionPaddings(((String) objArr7[0]).intern());
        KeyGenParameterSpec keyGenParameterSpecBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "");
        int i13 = f51738k + 115;
        f51737j = i13 % 128;
        if (i13 % 2 == 0) {
            return secretKeyGenerateKey;
        }
        throw null;
    }

    public final SecretKey f() throws Throwable {
        KeyStore.SecretKeyEntry secretKeyEntry;
        SecretKey secretKey;
        int i10 = f51737j + 39;
        f51738k = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = new Object[1];
        a((-75) - TextUtils.lastIndexOf("", '0'), (byte) ((-63) - TextUtils.indexOf("", "", 0, 0)), (short) (AndroidCharacter.getMirror('0') - 'X'), (-741592816) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-1092857309) - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
        keyStore.load(null);
        Object[] objArr2 = new Object[1];
        a((-73) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0', 0) + 109), (short) ((-6) - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 741592768, (-1092857294) - Color.argb(0, 0, 0, 0), objArr2);
        KeyStore.Entry entry = keyStore.getEntry(((String) objArr2[0]).intern(), null);
        if (entry instanceof KeyStore.SecretKeyEntry) {
            secretKeyEntry = (KeyStore.SecretKeyEntry) entry;
        } else {
            int i12 = f51737j + 83;
            f51738k = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            secretKeyEntry = null;
        }
        if (secretKeyEntry == null) {
            int i13 = f51737j + 35;
            f51738k = i13 % 128;
            int i14 = i13 % 2;
            secretKey = null;
        } else {
            secretKey = secretKeyEntry.getSecretKey();
        }
        if (secretKey != null) {
            return secretKey;
        }
        int i15 = f51737j + 33;
        f51738k = i15 % 128;
        if (i15 % 2 != 0) {
            return (SecretKey) setDividerPadding(new Object[]{this}, 792048417, -792048417, System.identityHashCode(this));
        }
        throw null;
    }

    @NotNull
    public final byte[] setOnFocusChangeListener(@NotNull getApplicationFilteringSelectors.setY p4) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0) - 74, (byte) (89 - (ViewConfiguration.getTouchSlop() >> 8)), (short) (View.MeasureSpec.getMode(0) + 51), (-741592817) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) - 1092857269, objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        cipher.init(2, f(), new GCMParameterSpec(128, setScrollIndicators.setOnFocusChangeListener((String) getApplicationFilteringSelectors.setY.setOnFocusChangeListener(new Object[]{p4}, -1861453730, 1861453731, System.identityHashCode(p4)))));
        byte[] bArrDoFinal = cipher.doFinal(setScrollIndicators.setOnFocusChangeListener((String) getApplicationFilteringSelectors.setY.setOnFocusChangeListener(new Object[]{p4}, -61382174, 61382174, System.identityHashCode(p4))));
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        int i10 = f51738k + 101;
        f51737j = i10 % 128;
        int i11 = i10 % 2;
        return bArrDoFinal;
    }

    @NotNull
    public final getApplicationFilteringSelectors.setY setX(@NotNull byte[] p4) {
        Intrinsics.checkNotNullParameter(p4, "");
        Object[] objArr = new Object[1];
        a((-74) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (89 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 51), Color.alpha(0) - 741592817, (-1092857269) - TextUtils.indexOf("", "", 0, 0), objArr);
        Cipher cipher = Cipher.getInstance(((String) objArr[0]).intern());
        cipher.init(1, f());
        byte[] bArrDoFinal = cipher.doFinal(p4);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        String x4 = setScrollIndicators.setX(bArrDoFinal);
        byte[] iv = cipher.getIV();
        Intrinsics.checkNotNullExpressionValue(iv, "");
        getApplicationFilteringSelectors.setY sety = new getApplicationFilteringSelectors.setY(x4, setScrollIndicators.setX(iv));
        int i10 = f51737j + 103;
        f51738k = i10 % 128;
        int i11 = i10 % 2;
        return sety;
    }

    public final void setY() throws Throwable {
        int i10 = f51737j + 49;
        f51738k = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = new Object[1];
        a((-74) - TextUtils.indexOf("", "", 0), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 105), (short) (8 - ExpandableListView.getPackedPositionChild(0L)), (-741592782) + (KeyEvent.getMaxKeyCode() >> 16), (-1092857252) - TextUtils.getCapsMode("", 0, 0), objArr);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f51741a, 29, null, null, 6}, 1173867142, -1173867141, 29);
        Object[] objArr2 = new Object[1];
        a((-73) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 63), (short) ((-40) - (ViewConfiguration.getFadingEdgeLength() >> 16)), (-741592818) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.combineMeasuredStates(0, 0) - 1092857309, objArr2);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr2[0]).intern());
        keyStore.load(null);
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 74, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 108), (short) ((-6) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.getCapsMode("", 0, 0) - 741592767, KeyEvent.getDeadChar(0, 0) - 1092857294, objArr3);
        keyStore.deleteEntry(((String) objArr3[0]).intern());
        int i12 = f51737j + 1;
        f51738k = i12 % 128;
        int i13 = i12 % 2;
    }
}
