package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.activity.a;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/ug;", "", "setDividerPadding", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode", "setX", "setY", "setOnLongClickListener"}, k = 1, mv = {1, 8, 0})
public final class ug {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int UiMessageCallbackKtWhenMappings;
    private static int getNavBarTitleString;
    public static final ug setCompoundDrawableTintBlendMode;
    public static final ug setDividerPadding;
    private static char setLayoutAnimation;
    private static char[] setNavigationOnClickListener;
    private static final /* synthetic */ ug[] setOnDragListener;
    public static final ug setOnFocusChangeListener;
    public static final ug setOnLongClickListener;
    public static final ug setX;
    public static final ug setY;

    static {
        ug[] ugVarArr;
        c();
        $10 = 0;
        $11 = 1;
        getNavBarTitleString = 0;
        UiMessageCallbackKtWhenMappings = 1;
        d();
        Object[] objArr = new Object[1];
        a(4 - Color.alpha(0), "\u0000\u0001\u0016\u0004", (byte) (27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
        ug ugVar = new ug(((String) objArr[0]).intern(), 0);
        setDividerPadding = ugVar;
        Object[] objArr2 = new Object[1];
        a(5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0011\u0003\u0004\u0001㗷", (byte) ((-16777164) - Color.rgb(0, 0, 0)), objArr2);
        ug ugVar2 = new ug(((String) objArr2[0]).intern(), 1);
        setOnFocusChangeListener = ugVar2;
        Object[] objArr3 = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 11, "\u0010\u0013\u0007\u0013\u0000\u0016\u0018\u0000\u0003\u000b", (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 69), objArr3);
        ug ugVar3 = new ug(((String) objArr3[0]).intern(), 2);
        setCompoundDrawableTintBlendMode = ugVar3;
        Object[] objArr4 = new Object[1];
        a(Color.blue(0) + 10, "\u0006\u0004\u0004\t\u0002\u0003\u0005\u0012\u0000\u0002", (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 35), objArr4);
        ug ugVar4 = new ug(((String) objArr4[0]).intern(), 3);
        setX = ugVar4;
        Object[] objArr5 = new Object[1];
        a(12 - MotionEvent.axisFromString(""), "\u0001\u0017\u0014\b\b\u0013\u0002\u000e\b\u0003\t\u000e㗙", (byte) (Color.argb(0, 0, 0, 0) + 5), objArr5);
        ug ugVar5 = new ug(((String) objArr5[0]).intern(), 4);
        setY = ugVar5;
        Object[] objArr6 = new Object[1];
        a(AndroidCharacter.getMirror('0') - ')', "\u0001\u0000\u0000\u0014\u0005\u0018㙊", (byte) (TextUtils.indexOf((CharSequence) "", '0') + 108), objArr6);
        ug ugVar6 = new ug(((String) objArr6[0]).intern(), 5);
        setOnLongClickListener = ugVar6;
        int i10 = UiMessageCallbackKtWhenMappings;
        int i11 = i10 + 43;
        getNavBarTitleString = i11 % 128;
        if (i11 % 2 != 0) {
            ugVarArr = new ug[54];
            ugVarArr[0] = ugVar;
            ugVarArr[1] = ugVar2;
            ugVarArr[4] = ugVar3;
            ugVarArr[5] = ugVar4;
            ugVarArr[3] = ugVar5;
            ugVarArr[4] = ugVar6;
        } else {
            ugVarArr = new ug[]{ugVar, ugVar2, ugVar3, ugVar4, ugVar5, ugVar6};
        }
        setOnDragListener = ugVarArr;
        int i12 = i10 + 67;
        getNavBarTitleString = i12 % 128;
        int i13 = i12 % 2;
    }

    public ug() {
        throw null;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        long j10;
        int length;
        char[] cArr;
        int i12 = $11 + 53;
        int i13 = i12 % 128;
        $10 = i13;
        int i14 = 0;
        if (i12 % 2 != 0) {
            int i15 = 32 / 0;
        }
        int i16 = i13 + 69;
        $11 = i16 % 128;
        if (i16 % 2 == 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr2 = setNavigationOnClickListener;
        int i17 = 290255894;
        if (cArr2 != null) {
            int i18 = $10 + 29;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i19])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i17));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), 45 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1116 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        b((byte) (b12 + 1), b11, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i19++;
                    i17 = 290255894;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        Object[] objArr4 = {Integer.valueOf(setLayoutAnimation)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        long j11 = 0;
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), 46 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1116 - TextUtils.getOffsetAfter("", 0));
            byte b13 = (byte) 0;
            byte b14 = (byte) (b13 - 1);
            Object[] objArr5 = new Object[1];
            b((byte) (b14 + 1), b13, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i20 = $11 + 17;
            int i21 = i20 % 128;
            $10 = i21;
            int i22 = i20 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
            int i23 = i21 + 47;
            $11 = i23 % 128;
            int i24 = i23 % 2;
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i25 = setincludefontpadding.setDividerPadding;
                if (i25 >= i11) {
                    break;
                }
                char c10 = charArray[i25];
                setincludefontpadding.setY = c10;
                int i26 = i25 + 1;
                char c11 = charArray[i26];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i25] = (char) (c10 - b10);
                    cArr3[i26] = (char) (c11 - b10);
                    j10 = j11;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = setincludefontpadding;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = setincludefontpadding;
                    objArr6[9] = setincludefontpadding;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = setincludefontpadding;
                    objArr6[6] = setincludefontpadding;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = setincludefontpadding;
                    objArr6[3] = setincludefontpadding;
                    objArr6[2] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[i14] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) Color.alpha(i14), (SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)) + 26, (ViewConfiguration.getLongPressTimeout() >> 16) + 2311);
                        byte b15 = (byte) i14;
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr7 = new Object[1];
                        b((byte) (b16 + 4), b15, b16, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i27 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i27) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 != null) {
                            j10 = 0;
                        } else {
                            j10 = 0;
                            Class cls5 = (Class) setTextScaleX.setX((char) (49104 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 36, 2544 - TextUtils.indexOf((CharSequence) "", '0'));
                            byte b17 = (byte) 0;
                            byte b18 = (byte) (b17 - 1);
                            Object[] objArr9 = new Object[1];
                            b((byte) (b18 & 7), b17, b18, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i28 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i29 = setincludefontpadding.setDividerPadding;
                        cArr3[i29] = cArr2[iIntValue2];
                        cArr3[i29 + 1] = cArr2[i28];
                        int i30 = $11 + 23;
                        $10 = i30 % 128;
                        int i31 = i30 % 2;
                    } else {
                        j10 = 0;
                        int i32 = setincludefontpadding.setX;
                        int i33 = setincludefontpadding.setOnFocusChangeListener;
                        if (i32 == i33) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i27, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i34 = (i33 * cCharValue) + iA2;
                            int i35 = setincludefontpadding.setDividerPadding;
                            cArr3[i35] = cArr2[(i32 * cCharValue) + iA];
                            cArr3[i35 + 1] = cArr2[i34];
                        } else {
                            int i36 = (i32 * cCharValue) + i27;
                            int i37 = (i33 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i38 = setincludefontpadding.setDividerPadding;
                            cArr3[i38] = cArr2[i36];
                            cArr3[i38 + 1] = cArr2[i37];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                j11 = j10;
                i14 = 0;
            }
        }
        int i39 = $10 + 89;
        $11 = i39 % 128;
        int i40 = i39 % 2;
        for (int i41 = 0; i41 < i10; i41++) {
            cArr3[i41] = (char) (cArr3[i41] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void b(byte b10, int i10, short s4, Object[] objArr) {
        byte[] bArr = $$a;
        int i11 = b10 + 99;
        int i12 = s4 + 4;
        int i13 = i10 * 3;
        byte[] bArr2 = new byte[i13 + 1];
        int i14 = -1;
        if (bArr == null) {
            int i15 = i13 + i12;
            i12 = i12;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = -1;
            i13 = i13;
            i11 = i15;
        }
        while (true) {
            int i16 = i14 + 1;
            bArr2[i16] = (byte) i11;
            if (i16 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i17 = i12 + 1;
            byte b11 = bArr[i17];
            int i18 = i11;
            int i19 = i13;
            int i20 = b11 + i18;
            i12 = i17;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = i16;
            i13 = i19;
            i11 = i20;
        }
    }

    public static void c() {
        $$a = new byte[]{118, 91, ByteSourceJsonBootstrapper.UTF8_BOM_3, -74};
        $$b = 250;
    }

    public static void d() {
        setLayoutAnimation = (char) 53956;
        setNavigationOnClickListener = new char[]{59167, 59157, 59166, 59162, 59154, 59155, 59138, 59175, 59140, 59156, 59172, 59168, 59137, 59164, 59170, 59147, 59169, 59160, 59145, 59173, 59144, 59150, 59171, 59151, 59159};
    }

    public static ug valueOf(String str) {
        int i10 = getNavBarTitleString + 25;
        UiMessageCallbackKtWhenMappings = i10 % 128;
        int i11 = i10 % 2;
        ug ugVar = (ug) Enum.valueOf(ug.class, str);
        int i12 = UiMessageCallbackKtWhenMappings + 105;
        getNavBarTitleString = i12 % 128;
        int i13 = i12 % 2;
        return ugVar;
    }

    public static ug[] values() {
        int i10 = UiMessageCallbackKtWhenMappings + 107;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        ug[] ugVarArr = (ug[]) setOnDragListener.clone();
        int i11 = getNavBarTitleString + 117;
        UiMessageCallbackKtWhenMappings = i11 % 128;
        int i12 = i11 % 2;
        return ugVarArr;
    }
}
