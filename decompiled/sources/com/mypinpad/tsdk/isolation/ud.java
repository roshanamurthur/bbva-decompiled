package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/mypinpad/tsdk/i/ud;", "", "setOnFocusChangeListener", "setDividerPadding", "setX", "setY", "setCompoundDrawableTintBlendMode", "getNavBarTitleString", "setOnLongClickListener"}, k = 1, mv = {1, 8, 0})
public final class ud {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final ud getNavBarTitleString;
    private static int setAlwaysDrawnWithCacheEnabled;
    public static final ud setCompoundDrawableTintBlendMode;
    public static final ud setDividerPadding;
    private static final /* synthetic */ ud[] setLayoutAnimation;
    private static int setNavigationOnClickListener;
    private static long setOnDragListener;
    public static final ud setOnFocusChangeListener;
    public static final ud setOnLongClickListener;
    public static final ud setX;
    public static final ud setY;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setNavigationOnClickListener = 0;
        setAlwaysDrawnWithCacheEnabled = 1;
        setCompoundDrawableTintBlendMode();
        Object[] objArr = new Object[1];
        a("哣턵役양䏏짩瘼ﱠ窞\ue0d2滦\ueb3dᅯ龁ו菽ࠪ뙯㲒뫕⃧", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 34253, objArr);
        ud udVar = new ud(((String) objArr[0]).intern(), 0);
        setOnFocusChangeListener = udVar;
        Object[] objArr2 = new Object[1];
        a("哳﹁ƚ哉︄Ś咈ￜĖ呟ﾕˋ后ａʊ嗓３", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43712, objArr2);
        ud udVar2 = new ud(((String) objArr2[0]).intern(), 1);
        setDividerPadding = udVar2;
        Object[] objArr3 = new Object[1];
        a("哧⚫끓ȗ鶦潐欄璶왆倕⎤뵓༈骳ᑜ\ue619熫썓崙⢽멗㐑螭ᅝ\ue302线졚娕햯", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29268, objArr3);
        ud udVar3 = new ud(((String) objArr3[0]).intern(), 2);
        setX = udVar3;
        Object[] objArr4 = new Object[1];
        a("哧竹ࣷ\udefd\uecee닚䃉ᛔⓖ쫗颥꺳粮ʩ킚\ue68b뒓", ((byte) KeyEvent.getModifierMetaStateMask()) + 11784, objArr4);
        ud udVar4 = new ud(((String) objArr4[0]).intern(), 3);
        setY = udVar4;
        Object[] objArr5 = new Object[1];
        a("哶椑⼅\ued26ꌴ慚❌\ue548뭮票㾀ﶉ뎝熿㞴\uf5c4诘䧄\u0ff3췱舌䀊ؐ쐱騬塓ṍ\udc5f鉮偵ᚂ풏\uea83", Color.alpha(0) + 15859, objArr5);
        ud udVar5 = new ud(((String) objArr5[0]).intern(), 4);
        setCompoundDrawableTintBlendMode = udVar5;
        Object[] objArr6 = new Object[1];
        a("哵䭳毾ੳ⫤쥼\ue9e6衁꣑佞濚๔⻂촻\uedb4谳겲䌶", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8069, objArr6);
        ud udVar6 = new ud(((String) objArr6[0]).intern(), 5);
        getNavBarTitleString = udVar6;
        Object[] objArr7 = new Object[1];
        a("哤ة\uf152걵ᾒ쪿ꗛ᜕숻뵍桴\udb9b뚼懽팙", View.resolveSize(0, 0) + 21211, objArr7);
        ud udVar7 = new ud(((String) objArr7[0]).intern(), 6);
        setOnLongClickListener = udVar7;
        int i10 = setNavigationOnClickListener + 103;
        int i11 = i10 % 128;
        setAlwaysDrawnWithCacheEnabled = i11;
        int i12 = i10 % 2;
        ud[] udVarArr = {udVar, udVar2, udVar3, udVar4, udVar5, udVar6, udVar7};
        int i13 = i11 + 59;
        int i14 = i13 % 128;
        setNavigationOnClickListener = i14;
        if (i13 % 2 != 0) {
            int i15 = 9 / 0;
        }
        setLayoutAnimation = udVarArr;
        int i16 = i14 + 73;
        setAlwaysDrawnWithCacheEnabled = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public ud() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x01fd  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        long j10;
        Throwable cause;
        int i11 = $10 + 107;
        int i12 = i11 % 128;
        $11 = i12;
        int i13 = 2;
        int i14 = i11 % 2;
        int i15 = i12 + 61;
        $10 = i15 % 128;
        int i16 = i15 % 2;
        char[] charArray = str.toCharArray();
        int i17 = $10 + 33;
        $11 = i17 % 128;
        int i18 = i17 % 2;
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i19 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            j10 = 0;
            if (i19 >= charArray.length) {
                break;
            }
            int i20 = $10 + 103;
            $11 = i20 % 128;
            int i21 = i20 % i13;
            char c10 = charArray[i19];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[i13] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c10);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1196 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b10 = (byte) 1;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i19] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (setOnDragListener ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 44, 728 - View.resolveSizeAndState(0, 0, 0));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b13, b12, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i13 = 2;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i22 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i22 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i23 = $10 + 113;
            $11 = i23 % 128;
            if (i23 % 2 == 0) {
                cArr[i22] = (char) jArr[i22];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 45, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 728);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b15, b14, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                throw null;
            }
            cArr[i22] = (char) jArr[i22];
            Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
            Map map3 = setTextScaleX.setMaxEms;
            Object method4 = map3.get(645183118);
            if (method4 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1)) + 727);
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr9 = new Object[1];
                b(b17, b16, b17, objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(645183118, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            j10 = 0;
        }
    }

    public static void b(byte b10, short s4, short s7, Object[] objArr) {
        int i10 = (s4 * 3) + 107;
        int i11 = 4 - (b10 * 2);
        int i12 = s7 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i12];
        int i13 = 0 - i12;
        int i14 = -1;
        if (bArr == null) {
            i11++;
            int i15 = i13 + (-i11);
            i13 = i13;
            i10 = i15;
        }
        while (true) {
            i14++;
            bArr2[i14] = (byte) i10;
            if (i14 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b11 = bArr[i11];
            int i16 = i13;
            i11++;
            i13 = i16;
            i10 += -b11;
        }
    }

    public static void c() {
        $$a = new byte[]{107, -84, 8, 70};
        $$b = 44;
    }

    public static void setCompoundDrawableTintBlendMode() {
        setOnDragListener = -8731431060113737952L;
    }

    public static ud valueOf(String str) {
        int i10 = setAlwaysDrawnWithCacheEnabled + 51;
        setNavigationOnClickListener = i10 % 128;
        if (i10 % 2 != 0) {
            Enum.valueOf(ud.class, str);
            throw null;
        }
        ud udVar = (ud) Enum.valueOf(ud.class, str);
        int i11 = setAlwaysDrawnWithCacheEnabled + 123;
        setNavigationOnClickListener = i11 % 128;
        int i12 = i11 % 2;
        return udVar;
    }

    public static ud[] values() {
        int i10 = setNavigationOnClickListener + 111;
        setAlwaysDrawnWithCacheEnabled = i10 % 128;
        int i11 = i10 % 2;
        ud[] udVarArr = (ud[]) setLayoutAnimation.clone();
        int i12 = setAlwaysDrawnWithCacheEnabled + 11;
        setNavigationOnClickListener = i12 % 128;
        int i13 = i12 % 2;
        return udVarArr;
    }
}
