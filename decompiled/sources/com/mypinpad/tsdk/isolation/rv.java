package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/rv;", "", "Ljava/io/Serializable;", "setDividerPadding", "setOnFocusChangeListener", "setY", "setCompoundDrawableTintBlendMode", "setX", "setOnLongClickListener", "getNavBarTitleString"}, k = 1, mv = {1, 8, 0})
public final class rv implements Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final rv getNavBarTitleString;
    private static int setAlwaysDrawnWithCacheEnabled;
    public static final rv setCompoundDrawableTintBlendMode;
    public static final rv setDividerPadding;
    private static long setLayoutAnimation;
    private static int setNavigationOnClickListener;
    private static final /* synthetic */ rv[] setOnDragListener;
    public static final rv setOnFocusChangeListener;
    public static final rv setOnLongClickListener;
    public static final rv setX;
    public static final rv setY;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setNavigationOnClickListener = 0;
        setAlwaysDrawnWithCacheEnabled = 1;
        setCompoundDrawableTintBlendMode();
        Object[] objArr = new Object[1];
        a("箍ᯟ묨孲變騘㩯\ud9c3礟ᥪ뢰堚\uf868龰㼌", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24660, objArr);
        rv rvVar = new rv(((String) objArr[0]).intern(), 0);
        setDividerPadding = rvVar;
        Object[] objArr2 = new Object[1];
        a("箍Ἓ늺噓\ue9f7貗‽믄彾\uf210閷⥛쳿枟וּ黗", 25759 - Color.green(0), objArr2);
        rv rvVar2 = new rv(((String) objArr2[0]).intern(), 1);
        setOnFocusChangeListener = rvVar2;
        Object[] objArr3 = new Object[1];
        a("箋\uf791掮\udfd4䯺윚㌨꽖᭫隒ʴ纵\uead1曩툝丢멓㙻ꆁᶪ览\u05fc燸\ued18央핖", 35869 - View.resolveSizeAndState(0, 0, 0), objArr3);
        rv rvVar3 = new rv(((String) objArr3[0]).intern(), 2);
        setY = rvVar3;
        Object[] objArr4 = new Object[1];
        a("箌䂖ණ쫐韯尗ᤤ\ue620ꍛ桡㒜\uf1a7뻏篞䃹ഃ쨻靆屪", 15131 - Color.alpha(0), objArr4);
        rv rvVar4 = new rv(((String) objArr4[0]).intern(), 3);
        setCompoundDrawableTintBlendMode = rvVar4;
        Object[] objArr5 = new Object[1];
        a("箌ꪚ\ud9b3ࣄ㿟滣鴌찼\uf33b≝兴聳뚟\ue5aaᓁ㯏櫻養젒Ｈ⹝嵤豴늖\ue1a9Ⴉ䟛盽ꔙ퐔יּ⩘奯衴뺘\ueda4Ჶ䏔独", ExpandableListView.getPackedPositionType(0L) + 53527, objArr5);
        rv rvVar5 = new rv(((String) objArr5[0]).intern(), 4);
        setX = rvVar5;
        Object[] objArr6 = new Object[1];
        a("箒\uf123滫\udb98克컮㮣녮⸔鯎ᅣ踶ﯴ炇\uee47寭", TextUtils.getCapsMode("", 0, 0) + 35507, objArr6);
        rv rvVar6 = new rv(((String) objArr6[0]).intern(), 5);
        setOnLongClickListener = rvVar6;
        Object[] objArr7 = new Object[1];
        a("箁툲⣲蚕\udd59⯲膶\ud847㘅販", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43440, objArr7);
        rv rvVar7 = new rv(((String) objArr7[0]).intern(), 6);
        getNavBarTitleString = rvVar7;
        int i10 = setNavigationOnClickListener;
        int i11 = i10 + 111;
        setAlwaysDrawnWithCacheEnabled = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 95;
        int i14 = i13 % 128;
        setAlwaysDrawnWithCacheEnabled = i14;
        int i15 = i13 % 2;
        setOnDragListener = new rv[]{rvVar, rvVar2, rvVar3, rvVar4, rvVar5, rvVar6, rvVar7};
        int i16 = i14 + 75;
        setNavigationOnClickListener = i16 % 128;
        int i17 = i16 % 2;
    }

    public rv() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x02e1  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = $11 + 89;
        $10 = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i14 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i14 >= charArray.length) {
                break;
            }
            int i15 = $10 + 47;
            $11 = i15 % 128;
            if (i15 % i12 == 0) {
                char c10 = charArray[i14];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i12] = setlayoutanimation;
                    objArr2[1] = setlayoutanimation;
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(0), 33 - ExpandableListView.getPackedPositionGroup(0L), 1196 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr3 = new Object[1];
                        b((byte) (-b11), b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i14] = (setLayoutAnimation / 1779209353347916695L) * ((Long) ((Method) method).invoke(null, objArr2)).longValue();
                    Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.resolveSize(0, 0) + 44, (ViewConfiguration.getWindowTouchSlop() >> 8) + 728);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b((byte) (b13 - 1), b12, b13, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                Object[] objArr6 = {Integer.valueOf(charArray[i14]), setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(-764403778);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0), 32 - MotionEvent.axisFromString(""), 1196 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    b((byte) (-b15), b14, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE, Object.class, Object.class);
                    map2.put(-764403778, method3);
                }
                jArr[i14] = ((Long) ((Method) method3).invoke(null, objArr6)).longValue() ^ (setLayoutAnimation ^ 1779209353347916695L);
                Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
                Object method4 = map2.get(645183118);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), View.resolveSizeAndState(0, 0, 0) + 44, ((Process.getThreadPriority(0) + 20) >> 6) + 728);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    b((byte) (b17 - 1), b16, b17, objArr9);
                    method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map2.put(645183118, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
            i12 = 2;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        int i16 = $10 + 3;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            int i18 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i18 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i19 = $11 + 83;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                cArr[i18] = (char) jArr[i18];
                Object[] objArr10 = {setlayoutanimation, setlayoutanimation};
                Map map3 = setTextScaleX.setMaxEms;
                Object method5 = map3.get(645183118);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, (KeyEvent.getMaxKeyCode() >> 16) + 728);
                    byte b18 = (byte) 0;
                    byte b19 = b18;
                    Object[] objArr11 = new Object[1];
                    b((byte) (b19 - 1), b18, b19, objArr11);
                    method5 = cls5.getMethod((String) objArr11[0], Object.class, Object.class);
                    map3.put(645183118, method5);
                }
                ((Method) method5).invoke(null, objArr10);
                int i20 = 71 / 0;
            } else {
                cArr[i18] = (char) jArr[i18];
                Object[] objArr12 = {setlayoutanimation, setlayoutanimation};
                Map map4 = setTextScaleX.setMaxEms;
                Object method6 = map4.get(645183118);
                if (method6 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 44 - (ViewConfiguration.getTouchSlop() >> 8), 728 - ExpandableListView.getPackedPositionType(0L));
                    byte b20 = (byte) 0;
                    byte b21 = b20;
                    Object[] objArr13 = new Object[1];
                    b((byte) (b21 - 1), b20, b21, objArr13);
                    method6 = cls6.getMethod((String) objArr13[0], Object.class, Object.class);
                    map4.put(645183118, method6);
                }
                ((Method) method6).invoke(null, objArr12);
            }
        }
    }

    public static void b(int i10, short s4, short s7, Object[] objArr) {
        int i11 = (s7 * 3) + 107;
        int i12 = s4 * 4;
        byte[] bArr = $$a;
        int i13 = i10 + 4;
        byte[] bArr2 = new byte[1 - i12];
        int i14 = 0 - i12;
        int i15 = -1;
        if (bArr == null) {
            objArr = objArr;
            bArr2 = bArr2;
            bArr = bArr;
            i15 = -1;
            i11 = i14 + i11;
            i14 = i14;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr2[i16] = (byte) i11;
            if (i16 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i13++;
            byte b10 = bArr[i13];
            objArr = objArr;
            bArr2 = bArr2;
            bArr = bArr;
            i15 = i16;
            i11 = b10 + i11;
            i14 = i14;
        }
    }

    public static void c() {
        $$a = new byte[]{76, -6, -8, -33};
        $$b = 59;
    }

    public static void setCompoundDrawableTintBlendMode() {
        setLayoutAnimation = 8919592521687210069L;
    }

    public static rv valueOf(String str) {
        int i10 = setAlwaysDrawnWithCacheEnabled + 13;
        setNavigationOnClickListener = i10 % 128;
        int i11 = i10 % 2;
        rv rvVar = (rv) Enum.valueOf(rv.class, str);
        if (i11 != 0) {
            int i12 = 63 / 0;
        }
        int i13 = setNavigationOnClickListener + 49;
        setAlwaysDrawnWithCacheEnabled = i13 % 128;
        int i14 = i13 % 2;
        return rvVar;
    }

    public static rv[] values() {
        rv[] rvVarArr;
        int i10 = setAlwaysDrawnWithCacheEnabled + 5;
        setNavigationOnClickListener = i10 % 128;
        if (i10 % 2 != 0) {
            rvVarArr = (rv[]) setOnDragListener.clone();
            int i11 = 12 / 0;
        } else {
            rvVarArr = (rv[]) setOnDragListener.clone();
        }
        int i12 = setNavigationOnClickListener + 21;
        setAlwaysDrawnWithCacheEnabled = i12 % 128;
        if (i12 % 2 != 0) {
            return rvVarArr;
        }
        throw null;
    }
}
