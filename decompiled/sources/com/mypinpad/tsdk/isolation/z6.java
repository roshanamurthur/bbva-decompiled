package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/mypinpad/tsdk/i/z6;", "", "setX", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setY", "setLayoutAnimation", "setOnLongClickListener", "setNavigationOnClickListener", "setOnDragListener", "getNavBarTitleString", "setIncludeFontPadding"}, k = 1, mv = {1, 8, 0})
final class z6 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long UiMessageCallbackKtWhenMappings;
    public static final z6 getNavBarTitleString;
    private static char setAlwaysDrawnWithCacheEnabled;
    private static int setChildDivider;
    public static final z6 setCompoundDrawableTintBlendMode;
    public static final z6 setDividerPadding;
    public static final z6 setIncludeFontPadding;
    public static final z6 setLayoutAnimation;
    public static final z6 setNavigationOnClickListener;
    public static final z6 setOnDragListener;
    private static int setOnEditorActionListener;
    public static final z6 setOnFocusChangeListener;
    public static final z6 setOnLongClickListener;
    private static int setTextAlignment;
    private static int setTextScaleX;
    public static final z6 setX;
    public static final z6 setY;
    private static final /* synthetic */ z6[] setZ;

    static {
        d();
        $10 = 0;
        $11 = 1;
        setChildDivider = 0;
        setOnEditorActionListener = 1;
        e();
        Object[] objArr = new Object[1];
        a((char) Drawable.resolveOpacity(0, 0), "ꬃ满鴜㝄", 477028778 - ExpandableListView.getPackedPositionChild(0L), "\uf4b6追傍ಚ\ud954췟┺ྜ\uda6a", objArr);
        z6 z6Var = new z6(((String) objArr[0]).intern(), 0);
        setX = z6Var;
        Object[] objArr2 = new Object[1];
        b(19 - TextUtils.lastIndexOf("", '0', 0, 0), 290 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 3, "\u0005�\uffe7\u0006\u0004\u0001\u0006�￪�\t\r�\u000b\f\uffe7\r\f\ufffb\u0007", false, objArr2);
        z6 z6Var2 = new z6(((String) objArr2[0]).intern(), 1);
        setOnFocusChangeListener = z6Var2;
        Object[] objArr3 = new Object[1];
        b(27 - (ViewConfiguration.getScrollBarSize() >> 8), 288 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 1, "\ufffe￨\u0007\u0005\u0002\u0007\ufffe￫\ufffe\n\u000e\ufffe\f\r\ufff0\u0002\r\u0001￩\u0002\u0007￨\u000e\r￼\b\u0006", false, objArr3);
        z6 z6Var3 = new z6(((String) objArr3[0]).intern(), 2);
        setCompoundDrawableTintBlendMode = z6Var3;
        Object[] objArr4 = new Object[1];
        b(17 - (Process.myTid() >> 22), (KeyEvent.getMaxKeyCode() >> 16) + 289, 2 - TextUtils.indexOf((CharSequence) "", '0'), "\u0006\u0001￨�\u0005\u0007\ufffb\f\r\uffe7\f\u000b�\r\t�￪", true, objArr4);
        z6 z6Var4 = new z6(((String) objArr4[0]).intern(), 3);
        setDividerPadding = z6Var4;
        Object[] objArr5 = new Object[1];
        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21, 288 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, "￼\ufffe\uffdd\ufffe\u0006\b￼\r\u000e￨\r\f\ufffe\u000e\n\ufffe￫\ufffe\u0007\u0002\u0005", true, objArr5);
        z6 z6Var5 = new z6(((String) objArr5[0]).intern(), 4);
        setY = z6Var5;
        Object[] objArr6 = new Object[1];
        b(TextUtils.lastIndexOf("", '0') + 24, 290 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 8, "\u000b￦\f\u000b\ufffa\u0006\u0004￼￪\u0000\ufffe\u0005\ufff8\u000b\f\t￼￩￼\b\f￼\n", false, objArr6);
        z6 z6Var6 = new z6(((String) objArr6[0]).intern(), 5);
        setLayoutAnimation = z6Var6;
        Object[] objArr7 = new Object[1];
        a((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 63906), "ᬾ湀ꌔ矹", ViewConfiguration.getMinimumFlingVelocity() >> 16, "હ予䱐\ude4e\ud820ￃ鸅\uf725뻳ﲹ忨㝑㰷ꑞʬ픝ു蝀틂◖\uf6b8崨뤐\uea14휧역", objArr7);
        z6 z6Var7 = new z6(((String) objArr7[0]).intern(), 6);
        setOnLongClickListener = z6Var7;
        Object[] objArr8 = new Object[1];
        a((char) (63056 - (ViewConfiguration.getTouchSlop() >> 8)), "\uf85f˩僛闶", TextUtils.indexOf("", "", 0, 0) - 620566024, "ᛎ鸷䁨랑淿聻\uf8afꭄ\udcff귤⼮\uddb8\ue074ᛤⵆꏲ\uef87♶嫸༠\ue065ꈓⳂᜡ\ud933\ueb8bᦲ", objArr8);
        z6 z6Var8 = new z6(((String) objArr8[0]).intern(), 7);
        setNavigationOnClickListener = z6Var8;
        Object[] objArr9 = new Object[1];
        a((char) (12862 - TextUtils.getCapsMode("", 0, 0)), "굆\udcf6㸾㠲", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1054668460, "萚욯\ue26c㜁㼉칛넁\udf71艸럠極럂\uab00眙焲\uf103⠺讋\uee13", objArr9);
        z6 z6Var9 = new z6(((String) objArr9[0]).intern(), 8);
        setOnDragListener = z6Var9;
        Object[] objArr10 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionType(0L) + 44234), "ጳ㯹쩬䞬", 1815869716 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "ﺕ꿡鼷谲鬚㡆蜆暴挮\u0ee5ᇨ䮺婲䚀ꬊ롂ᕁ俗䃀", objArr10);
        z6 z6Var10 = new z6(((String) objArr10[0]).intern(), 9);
        getNavBarTitleString = z6Var10;
        Object[] objArr11 = new Object[1];
        a((char) (ViewConfiguration.getJumpTapTimeout() >> 16), "ᕳꩬ묇陃", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 128609301, "抔\uf3fa쑈彋깧ଢ\u244c", objArr11);
        z6 z6Var11 = new z6(((String) objArr11[0]).intern(), 10);
        setIncludeFontPadding = z6Var11;
        int i10 = setOnEditorActionListener;
        int i11 = i10 + 21;
        setChildDivider = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 117;
        setChildDivider = i13 % 128;
        int i14 = i13 % 2;
        setZ = new z6[]{z6Var, z6Var2, z6Var3, z6Var4, z6Var5, z6Var6, z6Var7, z6Var8, z6Var9, z6Var10, z6Var11};
        int i15 = i10 + 9;
        setChildDivider = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public z6() {
        throw null;
    }

    public static void a(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char[] charArray = str2.toCharArray();
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        int i11 = $10 + 81;
        $11 = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        char[] charArray3 = str.toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        int i14 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i15 = $11 + 99;
            $10 = i15 % 128;
            int i16 = i15 % i12;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i14] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.indexOf("", "") + 50678), View.MeasureSpec.makeMeasureSpec(i14, i14) + 39, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1737);
                    byte b10 = (byte) i14;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, (byte) (b11 | 6), objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8125 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), AndroidCharacter.getMirror('0') - 11, TextUtils.getOffsetAfter("", 0) + 646);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b12, b13, (byte) (b13 + 3), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.getDeadChar(0, 0) + 49, 435 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    c(b14, b15, (byte) (b15 + 5), objArr7);
                    String str3 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str3, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (4449 - View.MeasureSpec.getMode(0)), 41 - TextUtils.indexOf((CharSequence) "", '0'), 1021 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    c(b16, b17, b17, objArr9);
                    String str4 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str4, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i17 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i17] = (char) (((((long) (c11 ^ charArray[i17])) ^ (UiMessageCallbackKtWhenMappings ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) setTextAlignment) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) setAlwaysDrawnWithCacheEnabled) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i17 + 1;
                int i18 = $11 + 101;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                i12 = 2;
                length3 = length3;
                cArr3 = cArr3;
                i14 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x01bc  */
    public static void b(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13 = $11 + 95;
        $10 = i13 % 128;
        int i14 = 2;
        if (i13 % 2 != 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i15 = getnavbartitlestring.setY;
            if (i15 >= i10) {
                break;
            }
            int i16 = $11 + 25;
            $10 = i16 % 128;
            int i17 = i16 % i14;
            char c10 = charArray[i15];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i15] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(setTextScaleX);
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 41, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 483);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, (byte) (b11 | 53), objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55966 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), KeyEvent.getDeadChar(0, 0) + 43, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2268);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b12, b13, (byte) (b13 | 54), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 2;
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
        if (i12 > 0) {
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i18 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i18, i18);
            int i19 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i19, cArr, 0, i10 - i19);
        }
        if (z10) {
            char[] cArr3 = new char[i10];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i20 = getnavbartitlestring.setY;
                if (i20 >= i10) {
                    break;
                }
                int i21 = $11 + 69;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                cArr3[i20] = cArr[(i10 - i20) - 1];
                Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (55966 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 44 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 2269);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    c(b14, b15, (byte) (b15 | 54), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                int i23 = $11 + 17;
                $10 = i23 % 128;
                int i24 = i23 % 2;
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    public static void c(byte b10, byte b11, int i10, Object[] objArr) {
        int i11 = 119 - i10;
        int i12 = 3 - (b11 * 2);
        int i13 = b10 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i13 + 1];
        int i14 = -1;
        if (bArr == null) {
            i11 = i13 + (-i11);
            i13 = i13;
            i12 = i12;
        }
        while (true) {
            i14++;
            int i15 = i12 + 1;
            bArr2[i14] = (byte) i11;
            if (i14 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b12 = bArr[i15];
            i11 += -b12;
            i13 = i13;
            i12 = i15;
        }
    }

    public static void d() {
        $$a = new byte[]{GenerateAcResponseApdu.DDA_HEADER, Constants.CVR_B2b65_CLEAR_BITS, -41, Constants.STATE_ERROR};
        $$b = 239;
    }

    public static void e() {
        setAlwaysDrawnWithCacheEnabled = (char) 30296;
        UiMessageCallbackKtWhenMappings = -2443367703579691432L;
        setTextAlignment = 561959629;
        setTextScaleX = -443080095;
    }

    public static z6 valueOf(String str) {
        int i10 = setChildDivider + 81;
        setOnEditorActionListener = i10 % 128;
        int i11 = i10 % 2;
        z6 z6Var = (z6) Enum.valueOf(z6.class, str);
        if (i11 == 0) {
            int i12 = 92 / 0;
        }
        int i13 = setChildDivider + 37;
        setOnEditorActionListener = i13 % 128;
        int i14 = i13 % 2;
        return z6Var;
    }

    public static z6[] values() {
        int i10 = setChildDivider + 57;
        setOnEditorActionListener = i10 % 128;
        int i11 = i10 % 2;
        z6[] z6VarArr = (z6[]) setZ.clone();
        int i12 = setChildDivider + 57;
        setOnEditorActionListener = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 79 / 0;
        }
        return z6VarArr;
    }
}
