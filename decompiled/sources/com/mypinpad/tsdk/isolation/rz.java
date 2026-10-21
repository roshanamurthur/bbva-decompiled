package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/rz;", "", "Ljava/io/Serializable;", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setY"}, k = 1, mv = {1, 8, 0})
public final class rz implements Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final rz setCompoundDrawableTintBlendMode;
    public static final rz setDividerPadding;
    private static int setNavigationOnClickListener;
    private static int setOnDragListener;
    private static final /* synthetic */ rz[] setOnFocusChangeListener;
    private static char setOnLongClickListener;
    private static char[] setX;
    public static final rz setY;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setNavigationOnClickListener = 0;
        setOnDragListener = 1;
        d();
        Object[] objArr = new Object[1];
        a(Color.alpha(0) + 4, "\u000f\u0001\u0001\u0005", (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 103), objArr);
        rz rzVar = new rz(((String) objArr[0]).intern(), 0);
        setCompoundDrawableTintBlendMode = rzVar;
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 6, "\u0003\u0004\u0002\u000f\u000e\r", (byte) (15 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr2);
        rz rzVar2 = new rz(((String) objArr2[0]).intern(), 1);
        setDividerPadding = rzVar2;
        Object[] objArr3 = new Object[1];
        a(Color.green(0) + 7, "\f\u0004\u0004\u0002\u000e\t㘡", (byte) (AndroidCharacter.getMirror('0') + 18), objArr3);
        rz rzVar3 = new rz(((String) objArr3[0]).intern(), 2);
        setY = rzVar3;
        int i10 = setNavigationOnClickListener;
        int i11 = i10 + 31;
        setOnDragListener = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 77;
        int i14 = i13 % 128;
        setOnDragListener = i14;
        int i15 = i13 % 2;
        setOnFocusChangeListener = new rz[]{rzVar, rzVar2, rzVar3};
        int i16 = i14 + 109;
        setNavigationOnClickListener = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 93 / 0;
        }
    }

    public rz() {
        throw null;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        long j10;
        int length;
        char[] cArr;
        int i12;
        int i13 = $10 + 89;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr2 = setX;
        char c10 = '0';
        int i14 = 290255894;
        int i15 = 0;
        if (cArr2 != null) {
            int i16 = $10 + 91;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 0;
            }
            while (i12 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i15] = Integer.valueOf(cArr2[i12]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i14));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", c10) + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 45, (ViewConfiguration.getTouchSlop() >> 8) + 1116);
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b12, b11, (byte) (b12 | 7), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12++;
                    c10 = '0';
                    i14 = 290255894;
                    i15 = 0;
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
        Object[] objArr4 = {Integer.valueOf(setOnLongClickListener)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        long j11 = 0;
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(0), 45 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1116);
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            b(b14, b13, (byte) (b14 | 7), objArr5);
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
        if (i11 > 1) {
            int i17 = $11 + 15;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i19 = setincludefontpadding.setDividerPadding;
                if (i19 >= i11) {
                    break;
                }
                int i20 = $11 + 65;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    char c11 = charArray[i19];
                    setincludefontpadding.setY = c11;
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                } else {
                    char c12 = charArray[i19];
                    setincludefontpadding.setY = c12;
                    char c13 = charArray[i19 + 1];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                    if (c12 != c13) {
                        Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(180437302);
                        if (method3 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 28 - (ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1)), 2310 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            byte b15 = (byte) 0;
                            Object[] objArr7 = new Object[1];
                            b(b15, b15, (byte) $$a.length, objArr7);
                            String str2 = (String) objArr7[0];
                            Class<?> cls4 = Integer.TYPE;
                            method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                            map3.put(180437302, method3);
                        }
                        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                        int i21 = setincludefontpadding.setNavigationOnClickListener;
                        if (iIntValue == i21) {
                            Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                            Object method4 = map3.get(1989802713);
                            if (method4 != null) {
                                j10 = 0;
                            } else {
                                j10 = 0;
                                Class cls5 = (Class) setTextScaleX.setX((char) (49103 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.resolveSizeAndState(0, 0, 0) + 35, ExpandableListView.getPackedPositionType(0L) + 2545);
                                byte b16 = (byte) 0;
                                byte b17 = b16;
                                Object[] objArr9 = new Object[1];
                                b(b17, b16, b17, objArr9);
                                String str3 = (String) objArr9[0];
                                Class<?> cls6 = Integer.TYPE;
                                method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                                map3.put(1989802713, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                            int i22 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                            int i23 = setincludefontpadding.setDividerPadding;
                            cArr3[i23] = cArr2[iIntValue2];
                            cArr3[i23 + 1] = cArr2[i22];
                        } else {
                            j10 = 0;
                            int i24 = setincludefontpadding.setX;
                            int i25 = setincludefontpadding.setOnFocusChangeListener;
                            if (i24 == i25) {
                                int i26 = $11 + 123;
                                $10 = i26 % 128;
                                int i27 = i26 % 2;
                                int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                                setincludefontpadding.setOnLongClickListener = iA;
                                int iA2 = a.a(i21, cCharValue, 1, cCharValue);
                                setincludefontpadding.setNavigationOnClickListener = iA2;
                                int i28 = (i25 * cCharValue) + iA2;
                                int i29 = setincludefontpadding.setDividerPadding;
                                cArr3[i29] = cArr2[(i24 * cCharValue) + iA];
                                cArr3[i29 + 1] = cArr2[i28];
                            } else {
                                int i30 = (i24 * cCharValue) + i21;
                                int i31 = (i25 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                                int i32 = setincludefontpadding.setDividerPadding;
                                cArr3[i32] = cArr2[i30];
                                cArr3[i32 + 1] = cArr2[i31];
                            }
                        }
                    }
                    setincludefontpadding.setDividerPadding += 2;
                    j11 = j10;
                }
                cArr3[i19] = (char) (setincludefontpadding.setY - b10);
                cArr3[i19 + 1] = (char) (setincludefontpadding.setCompoundDrawableTintBlendMode - b10);
                j10 = j11;
                setincludefontpadding.setDividerPadding += 2;
                j11 = j10;
            }
        }
        int i33 = 0;
        while (i33 < i10) {
            int i34 = $10 + 29;
            $11 = i34 % 128;
            if (i34 % 2 == 0) {
                cArr3[i33] = (char) (cArr3[i33] ^ 20687);
                i33 += 45;
            } else {
                cArr3[i33] = (char) (cArr3[i33] ^ 13722);
                i33++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void b(byte b10, short s4, short s7, Object[] objArr) {
        int i10 = b10 * 3;
        int i11 = (s4 * 2) + 4;
        int i12 = 106 - s7;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i10];
        int i13 = 0 - i10;
        int i14 = -1;
        if (bArr == null) {
            i12 = i13 + (-i11);
            i13 = i13;
            i11++;
        }
        while (true) {
            i14++;
            bArr2[i14] = (byte) i12;
            if (i14 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b11 = bArr[i11];
            i12 += -b11;
            i13 = i13;
            i11++;
        }
    }

    public static void c() {
        $$a = new byte[]{94, Constants.CVR_B2b8765_1111_APP_DISABLED, 73, 34};
        $$b = 227;
    }

    public static void d() {
        setOnLongClickListener = (char) 53957;
        setX = new char[]{59162, 59166, 59165, 59156, 59168, 59171, 59159, 59158, 59161, 59169, 59160, 59167, 59151, 59157, 59150, 59164};
    }

    public static rz valueOf(String str) {
        int i10 = setOnDragListener + 23;
        setNavigationOnClickListener = i10 % 128;
        int i11 = i10 % 2;
        rz rzVar = (rz) Enum.valueOf(rz.class, str);
        int i12 = setNavigationOnClickListener + 85;
        setOnDragListener = i12 % 128;
        int i13 = i12 % 2;
        return rzVar;
    }

    public static rz[] values() {
        int i10 = setNavigationOnClickListener + 7;
        setOnDragListener = i10 % 128;
        if (i10 % 2 != 0) {
            return (rz[]) setOnFocusChangeListener.clone();
        }
        int i11 = 37 / 0;
        return (rz[]) setOnFocusChangeListener.clone();
    }
}
