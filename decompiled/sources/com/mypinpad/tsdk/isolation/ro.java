package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/ro;", "", "Ljava/io/Serializable;", "setCompoundDrawableTintBlendMode", "setY", "setX", "setOnFocusChangeListener", "setDividerPadding", "setLayoutAnimation", "getNavBarTitleString", "setOnLongClickListener", "setOnDragListener", "setNavigationOnClickListener", "setZ", "setIncludeFontPadding", "setAlwaysDrawnWithCacheEnabled", "UiMessageCallbackKtWhenMappings", "setTextAlignment", "getAmountFieldTextColor"}, k = 1, mv = {1, 8, 0})
public final class ro implements Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final ro UiMessageCallbackKtWhenMappings;
    public static final ro getAmountFieldTextColor;
    public static final ro getNavBarTitleString;
    private static int getSuppressed;
    public static final ro setAlwaysDrawnWithCacheEnabled;
    private static long setChildDivider;
    private static char setCompoundDrawablePadding;
    public static final ro setCompoundDrawableTintBlendMode;
    public static final ro setDividerPadding;
    public static final ro setIncludeFontPadding;
    public static final ro setLayoutAnimation;
    private static int setMinHeight;
    public static final ro setNavigationOnClickListener;
    public static final ro setOnDragListener;
    private static final /* synthetic */ ro[] setOnEditorActionListener;
    public static final ro setOnFocusChangeListener;
    public static final ro setOnLongClickListener;
    public static final ro setTextAlignment;
    private static char[] setTextScaleX;
    public static final ro setX;
    public static final ro setY;
    public static final ro setZ;

    static {
        d();
        $10 = 0;
        $11 = 1;
        getSuppressed = 0;
        setMinHeight = 1;
        e();
        Object[] objArr = new Object[1];
        a("퉧툩䳗稣錍☏꽍겍硜妔׆礙蛌\uf31d偏\u07fc\u2d7e╭껡걷篸壴ն端虱\uf264匒݄", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr);
        ro roVar = new ro(((String) objArr[0]).intern(), 0);
        setCompoundDrawableTintBlendMode = roVar;
        Object[] objArr2 = new Object[1];
        b(26 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0011\u0000\u0002\n\f\n\u0015\r\u0017\u000e\u0007\u000f\u0005\t\u000b\u000e\t\u000f\u0012\u0017\n\u0003\u0017\u0012㙁", (byte) (99 - View.MeasureSpec.getMode(0)), objArr2);
        ro roVar2 = new ro(((String) objArr2[0]).intern(), 1);
        setY = roVar2;
        Object[] objArr3 = new Object[1];
        a("Тѡ\uda67\uf8b8熐낻\u2dcf丂긄켷蝉鮎備斣틝\ue56aﬡ돚Ⱬ价궷칉蟦顲倢", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
        ro roVar3 = new ro(((String) objArr3[0]).intern(), 2);
        setX = roVar3;
        Object[] objArr4 = new Object[1];
        b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, "\u000b\u0012\u0017\u0012\u000e\u0016\u0007\u0017\n\u0005\u0005\u0012\u000e\r\t\u0006\u0012\u000e\u0017\u0012\u0003\u000f\u000e\u0012", (byte) (72 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr4);
        ro roVar4 = new ro(((String) objArr4[0]).intern(), 3);
        setOnFocusChangeListener = roVar4;
        Object[] objArr5 = new Object[1];
        b(TextUtils.indexOf("", "", 0, 0) + 21, "\u0010\r\u0017\r\u0014\u0007\f\u0017\t\r\b\u000e\u000f\t\u0011\u0003\u0012\n\f\u0010㗸", (byte) (42 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr5);
        ro roVar5 = new ro(((String) objArr5[0]).intern(), 4);
        setDividerPadding = roVar5;
        Object[] objArr6 = new Object[1];
        a("\uf880\uf8c4ﴝﰑ䷸韉⥸牬劻\ue85a菺\ua7e1갱䋇홧\ud90eޑ钡⣈犞億", -ExpandableListView.getPackedPositionChild(0L), objArr6);
        ro roVar6 = new ro(((String) objArr6[0]).intern(), 5);
        setLayoutAnimation = roVar6;
        Object[] objArr7 = new Object[1];
        a("㫰㪠ꅢ∋鏫쮶\uf77f걣郁됽己秲湁Ẹࡨܗ엯죎\uf6d0겍鍬땎嵕稉滰\u1fdcଡ\u07b9쐅졲\uf1b6괱鎈", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr7);
        ro roVar7 = new ro(((String) objArr7[0]).intern(), 6);
        getNavBarTitleString = roVar7;
        Object[] objArr8 = new Object[1];
        b(16 - TextUtils.lastIndexOf("", '0'), "\f\u0004\u0014\t\u000e\u0017\u0011\r\u0007\u0006\u0011\u0003\u0012\n\f\u0010㙇", (byte) (121 - TextUtils.getOffsetBefore("", 0)), objArr8);
        ro roVar8 = new ro(((String) objArr8[0]).intern(), 7);
        setOnLongClickListener = roVar8;
        Object[] objArr9 = new Object[1];
        b(View.resolveSize(0, 0) + 33, "\u0007\u0012\u0017\u0003\f\r\u0001\u0016\r\u0017\u0001\f\u0014\t\u0004\u0016\t\n\r\f\u000b\r\u000e\b\u0005\u0006\u0011\u0003\u0012\n\f\u0010㗧", (byte) (25 - KeyEvent.getDeadChar(0, 0)), objArr9);
        ro roVar9 = new ro(((String) objArr9[0]).intern(), 8);
        setOnDragListener = roVar9;
        Object[] objArr10 = new Object[1];
        b((ViewConfiguration.getScrollBarSize() >> 8) + 14, "\u0004\u0016\u0017\u0012\u000e\u0016\u0007\u0017\b\n㗮㗮\f\r", (byte) (38 - View.resolveSize(0, 0)), objArr10);
        ro roVar10 = new ro(((String) objArr10[0]).intern(), 9);
        setNavigationOnClickListener = roVar10;
        Object[] objArr11 = new Object[1];
        b(19 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0015\r\b\u0013\n\u0005\u0007\u0017\u0017\u0002\u0005\u0003\u0000\u0006\u000e\r\r\f㘀", (byte) ('h' - AndroidCharacter.getMirror('0')), objArr11);
        ro roVar11 = new ro(((String) objArr11[0]).intern(), 10);
        setZ = roVar11;
        Object[] objArr12 = new Object[1];
        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, "\f\u0004\u0014\t\r\t\u000f\t\r\u0001\u0005\u0004\u0016\u0011\u000e\u0012\b\n㘀㘀\f\r", (byte) (ExpandableListView.getPackedPositionType(0L) + 56), objArr12);
        ro roVar12 = new ro(((String) objArr12[0]).intern(), 11);
        setIncludeFontPadding = roVar12;
        Object[] objArr13 = new Object[1];
        b(Color.green(0) + 22, "\f\u0004\u0014\t\r\t\u000f\t\u0012\u000e\u0017\r\u0003\u0014\u000e\u0012\b\n㘹㘹\f\r", (byte) (113 - ExpandableListView.getPackedPositionType(0L)), objArr13);
        ro roVar13 = new ro(((String) objArr13[0]).intern(), 12);
        setAlwaysDrawnWithCacheEnabled = roVar13;
        Object[] objArr14 = new Object[1];
        a("ସ୨䝔꾂猃ⶀ競䲋ꄜ刄큨餗徜\uf890藵\ue7f2\uf427⻥筋䱤ꊡ却탍髫弩李", Color.argb(0, 0, 0, 0) + 1, objArr14);
        ro roVar14 = new ro(((String) objArr14[0]).intern(), 13);
        UiMessageCallbackKtWhenMappings = roVar14;
        Object[] objArr15 = new Object[1];
        b((ViewConfiguration.getPressedStateDuration() >> 16) + 9, "\u0014\u0015\u0005\n\u000e\r\r\f㗮", (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 38), objArr15);
        ro roVar15 = new ro(((String) objArr15[0]).intern(), 14);
        setTextAlignment = roVar15;
        Object[] objArr16 = new Object[1];
        a("ভ৬牰㠇暾ᢽ\ued6d夶ꎐ术䟶買崄춶ቮ\uf246\uf6a3ᯆ\uecc4姃ꀹ", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr16);
        ro roVar16 = new ro(((String) objArr16[0]).intern(), 15);
        getAmountFieldTextColor = roVar16;
        int i10 = setMinHeight + 87;
        int i11 = i10 % 128;
        getSuppressed = i11;
        int i12 = i10 % 2;
        ro[] roVarArr = {roVar, roVar2, roVar3, roVar4, roVar5, roVar6, roVar7, roVar8, roVar9, roVar10, roVar11, roVar12, roVar13, roVar14, roVar15, roVar16};
        int i13 = i11 + 55;
        setMinHeight = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        setOnEditorActionListener = roVarArr;
        int i14 = i11 + 93;
        setMinHeight = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public ro() {
        throw null;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = $11 + 15;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        char[] charArray = str.toCharArray();
        setOnDragListener setondraglistener = new setOnDragListener();
        char[] y7 = setOnDragListener.setY(setChildDivider ^ 2122665171656649951L, charArray, i10);
        setondraglistener.setDividerPadding = 4;
        while (true) {
            int i13 = setondraglistener.setDividerPadding;
            if (i13 >= y7.length) {
                objArr[0] = new String(y7, 4, y7.length - 4);
                return;
            }
            int i14 = $11 + 69;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 - 4;
            setondraglistener.setX = i16;
            try {
                Object[] objArr2 = {Long.valueOf(y7[i13] ^ y7[i13 % 4]), Long.valueOf(i16), Long.valueOf(setChildDivider)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (9779 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 42 - Process.getGidForName(""), Drawable.resolveOpacity(0, 0) + 3187);
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) Color.argb(0, 0, 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 52, (Process.myTid() >> 22) + 3029);
                    byte b10 = (byte) (-$$a[1]);
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr4 = new Object[1];
                    c(b10, b11, b11, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-62642757, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                int i17 = $11 + 39;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void b(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = $10;
        int i13 = i12 + 119;
        $11 = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        int i16 = i12 + 35;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = setTextScaleX;
        long j10 = 0;
        int i18 = 290255894;
        int i19 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i20 = 0;
            while (i20 < length) {
                int i21 = $10 + 105;
                $11 = i21 % 128;
                int i22 = i21 % i14;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i19] = Integer.valueOf(cArr[i20]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i18));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 1), 45 - TextUtils.getOffsetBefore("", i19), ExpandableListView.getPackedPositionType(j10) + 1116);
                        byte b11 = $$a[1];
                        byte b12 = (byte) (-b11);
                        byte b13 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        c(b12, (byte) (b12 & MessageUtils.MESSAGE_18_DC2), b13, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i20] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i20++;
                    i14 = 2;
                    j10 = 0;
                    i18 = 290255894;
                    i19 = 0;
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
        Object[] objArr4 = {Integer.valueOf(setCompoundDrawablePadding)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 1), Gravity.getAbsoluteGravity(0, 0) + 45, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1117);
            byte b14 = $$a[1];
            byte b15 = (byte) (-b14);
            Object[] objArr5 = new Object[1];
            c(b15, (byte) (b15 & MessageUtils.MESSAGE_18_DC2), (byte) (b14 - 1), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i23 = $11 + 125;
            $10 = i23 % 128;
            int i24 = i23 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
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
                int i26 = $11 + 31;
                $10 = i26 % 128;
                int i27 = i26 % 2;
                char c10 = charArray[i25];
                setincludefontpadding.setY = c10;
                int i28 = i25 + 1;
                char c11 = charArray[i28];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i25] = (char) (c10 - b10);
                    cArr3[i28] = (char) (c11 - b10);
                } else {
                    Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 27 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0', 0) + 2312);
                        byte b16 = $$a[1];
                        byte b17 = (byte) (-b16);
                        Object[] objArr7 = new Object[1];
                        c(b17, (byte) (b17 & 15), (byte) (b16 - 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i29 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i29) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36, AndroidCharacter.getMirror('0') + 2497);
                            byte b18 = $$a[1];
                            byte b19 = (byte) (-b18);
                            Object[] objArr9 = new Object[1];
                            c(b19, (byte) (b19 & 11), (byte) (b18 - 1), objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i30 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i31 = setincludefontpadding.setDividerPadding;
                        cArr3[i31] = cArr[iIntValue2];
                        cArr3[i31 + 1] = cArr[i30];
                    } else {
                        int i32 = setincludefontpadding.setX;
                        int i33 = setincludefontpadding.setOnFocusChangeListener;
                        if (i32 == i33) {
                            int i34 = $11 + 63;
                            $10 = i34 % 128;
                            int i35 = i34 % 2;
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i29, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i36 = (i33 * cCharValue) + iA2;
                            int i37 = setincludefontpadding.setDividerPadding;
                            cArr3[i37] = cArr[(i32 * cCharValue) + iA];
                            cArr3[i37 + 1] = cArr[i36];
                        } else {
                            int i38 = (i32 * cCharValue) + i29;
                            int i39 = (i33 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i40 = setincludefontpadding.setDividerPadding;
                            cArr3[i40] = cArr[i38];
                            cArr3[i40 + 1] = cArr[i39];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        int i41 = 0;
        while (i41 < i10) {
            int i42 = $10 + 91;
            $11 = i42 % 128;
            if (i42 % 2 == 0) {
                cArr3[i41] = (char) (cArr3[i41] ^ 13013);
                i41 += 80;
            } else {
                cArr3[i41] = (char) (cArr3[i41] ^ 13722);
                i41++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = com.mypinpad.tsdk.isolation.ro.$$a
            int r7 = 117 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ro.c(int, short, short, java.lang.Object[]):void");
    }

    public static void d() {
        $$a = new byte[]{82, 1, 85, -74};
        $$b = 219;
    }

    public static void e() {
        setChildDivider = -6092146241214921150L;
        setCompoundDrawablePadding = (char) 53956;
        setTextScaleX = new char[]{59160, 59152, 59154, 59161, 59163, 59140, 59138, 59169, 59162, 59144, 59164, 59156, 59145, 59166, 59147, 59158, 59139, 59150, 59151, 59167, 59165, 59137, 59159, 59155, 59157};
    }

    public static ro valueOf(String str) {
        int i10 = getSuppressed + 13;
        setMinHeight = i10 % 128;
        if (i10 % 2 != 0) {
            return (ro) Enum.valueOf(ro.class, str);
        }
        Enum.valueOf(ro.class, str);
        throw null;
    }

    public static ro[] values() {
        int i10 = setMinHeight + 51;
        getSuppressed = i10 % 128;
        int i11 = i10 % 2;
        ro[] roVarArr = (ro[]) setOnEditorActionListener.clone();
        int i12 = getSuppressed + 107;
        setMinHeight = i12 % 128;
        int i13 = i12 % 2;
        return roVarArr;
    }
}
