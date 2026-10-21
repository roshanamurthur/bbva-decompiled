package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/getTransactionPortrait;", "", "", "setCompoundDrawablePadding", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setCompoundDrawableTintBlendMode", "()I", "setDividerPadding", "setX", "setOnFocusChangeListener", "setY", "setOnLongClickListener", "setNavigationOnClickListener", "setLayoutAnimation", "setOnDragListener", "getNavBarTitleString", "setTextAlignment", "setZ", "setAlwaysDrawnWithCacheEnabled", "setIncludeFontPadding", "UiMessageCallbackKtWhenMappings", "getAmountFieldTextColor"}, k = 1, mv = {1, 5, 1})
public final class getTransactionPortrait {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final getTransactionPortrait UiMessageCallbackKtWhenMappings;
    public static final getTransactionPortrait getAmountFieldTextColor;
    public static final getTransactionPortrait getNavBarTitleString;
    private static char getSuppressed;
    public static final getTransactionPortrait setAlwaysDrawnWithCacheEnabled;
    private static long setChildDivider;
    public static final getTransactionPortrait setCompoundDrawableTintBlendMode;
    private static int setCursorVisible;
    public static final getTransactionPortrait setDividerPadding;
    private static char setImageResource;
    public static final getTransactionPortrait setIncludeFontPadding;
    public static final getTransactionPortrait setLayoutAnimation;
    private static int setLayoutDirection;
    private static char setMaxEms;
    private static char setMinHeight;
    public static final getTransactionPortrait setNavigationOnClickListener;
    public static final getTransactionPortrait setOnDragListener;
    private static final /* synthetic */ getTransactionPortrait[] setOnEditorActionListener;
    public static final getTransactionPortrait setOnFocusChangeListener;
    public static final getTransactionPortrait setOnLongClickListener;
    public static final getTransactionPortrait setTextAlignment;
    private static char[] setTextScaleX;
    public static final getTransactionPortrait setY;
    public static final getTransactionPortrait setZ;

    /* JADX INFO: renamed from: setCompoundDrawablePadding, reason: from kotlin metadata */
    private final int setDividerPadding;

    static {
        d();
        $10 = 0;
        $11 = 1;
        setLayoutDirection = 0;
        setCursorVisible = 1;
        e();
        Object[] objArr = new Object[1];
        a((char) Drawable.resolveOpacity(0, 0), ViewConfiguration.getTapTimeout() >> 16, 12 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        getTransactionPortrait gettransactionportrait = new getTransactionPortrait(((String) objArr[0]).intern(), 0, 0);
        setCompoundDrawableTintBlendMode = gettransactionportrait;
        Object[] objArr2 = new Object[1];
        a((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.blue(0) + 12, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, objArr2);
        getTransactionPortrait gettransactionportrait2 = new getTransactionPortrait(((String) objArr2[0]).intern(), 1, 1);
        setOnFocusChangeListener = gettransactionportrait2;
        Object[] objArr3 = new Object[1];
        a((char) View.resolveSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 26, 17 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
        getTransactionPortrait gettransactionportrait3 = new getTransactionPortrait(((String) objArr3[0]).intern(), 2, 2);
        setY = gettransactionportrait3;
        Object[] objArr4 = new Object[1];
        a((char) View.MeasureSpec.getSize(0), TextUtils.indexOf("", "", 0, 0) + 43, Drawable.resolveOpacity(0, 0) + 11, objArr4);
        getTransactionPortrait gettransactionportrait4 = new getTransactionPortrait(((String) objArr4[0]).intern(), 3, 3);
        setDividerPadding = gettransactionportrait4;
        Object[] objArr5 = new Object[1];
        a((char) (45448 - TextUtils.getOffsetAfter("", 0)), 55 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr5);
        getTransactionPortrait gettransactionportrait5 = new getTransactionPortrait(((String) objArr5[0]).intern(), 4, 4);
        setOnLongClickListener = gettransactionportrait5;
        Object[] objArr6 = new Object[1];
        b("蘈耠⛹俩꾔鹇ౢ￥鎢㠄ۨ\ud930\ueeda∫嬌⸨", 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
        getTransactionPortrait gettransactionportrait6 = new getTransactionPortrait(((String) objArr6[0]).intern(), 5, 5);
        setNavigationOnClickListener = gettransactionportrait6;
        Object[] objArr7 = new Object[1];
        b("ᾆ渾㱁噻캼늅\ue881䒇톊䅑㏀찿碅᱿⟁ᣒ膟ᩄ", 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr7);
        getTransactionPortrait gettransactionportrait7 = new getTransactionPortrait(((String) objArr7[0]).intern(), 6, 6);
        setLayoutAnimation = gettransactionportrait7;
        Object[] objArr8 = new Object[1];
        b("▎㚋\uf664㙴㡖袾渑鉶潉뵑䓁\uf7a5露쏍▎㚋惇忶蜍Ὥʧ悧ࡑ敠", TextUtils.getOffsetAfter("", 0) + 23, objArr8);
        getTransactionPortrait gettransactionportrait8 = new getTransactionPortrait(((String) objArr8[0]).intern(), 7, 7);
        setOnDragListener = gettransactionportrait8;
        Object[] objArr9 = new Object[1];
        a((char) (ImageFormat.getBitsPerPixel(0) + 25517), 73 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, objArr9);
        getTransactionPortrait gettransactionportrait9 = new getTransactionPortrait(((String) objArr9[0]).intern(), 8, 8);
        getNavBarTitleString = gettransactionportrait9;
        Object[] objArr10 = new Object[1];
        a((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 97 - (ViewConfiguration.getScrollBarSize() >> 8), 27 - View.resolveSizeAndState(0, 0, 0), objArr10);
        getTransactionPortrait gettransactionportrait10 = new getTransactionPortrait(((String) objArr10[0]).intern(), 9, 9);
        setTextAlignment = gettransactionportrait10;
        Object[] objArr11 = new Object[1];
        a((char) (7633 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 124 - (ViewConfiguration.getJumpTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 38, objArr11);
        getTransactionPortrait gettransactionportrait11 = new getTransactionPortrait(((String) objArr11[0]).intern(), 10, 10);
        setZ = gettransactionportrait11;
        Object[] objArr12 = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) "", '0') + 43335), 162 - (KeyEvent.getMaxKeyCode() >> 16), Color.green(0) + 23, objArr12);
        getTransactionPortrait gettransactionportrait12 = new getTransactionPortrait(((String) objArr12[0]).intern(), 11, 11);
        setAlwaysDrawnWithCacheEnabled = gettransactionportrait12;
        Object[] objArr13 = new Object[1];
        a((char) (17468 - TextUtils.indexOf((CharSequence) "", '0', 0)), 185 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 13, objArr13);
        getTransactionPortrait gettransactionportrait13 = new getTransactionPortrait(((String) objArr13[0]).intern(), 12, 12);
        setIncludeFontPadding = gettransactionportrait13;
        Object[] objArr14 = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) "", '0') + 44333), 197 - View.MeasureSpec.makeMeasureSpec(0, 0), Color.alpha(0) + 21, objArr14);
        getTransactionPortrait gettransactionportrait14 = new getTransactionPortrait(((String) objArr14[0]).intern(), 13, 13);
        UiMessageCallbackKtWhenMappings = gettransactionportrait14;
        Object[] objArr15 = new Object[1];
        b("剿\uf74c앉伷镜\ue6e4\ueeda∫ᴜ㟰", 10 - ((Process.getThreadPriority(0) + 20) >> 6), objArr15);
        getTransactionPortrait gettransactionportrait15 = new getTransactionPortrait(((String) objArr15[0]).intern(), 14, 14);
        getAmountFieldTextColor = gettransactionportrait15;
        int i10 = setCursorVisible + 113;
        int i11 = i10 % 128;
        setLayoutDirection = i11;
        int i12 = i10 % 2;
        getTransactionPortrait[] gettransactionportraitArr = {gettransactionportrait, gettransactionportrait2, gettransactionportrait3, gettransactionportrait4, gettransactionportrait5, gettransactionportrait6, gettransactionportrait7, gettransactionportrait8, gettransactionportrait9, gettransactionportrait10, gettransactionportrait11, gettransactionportrait12, gettransactionportrait13, gettransactionportrait14, gettransactionportrait15};
        int i13 = i11 + 3;
        setCursorVisible = i13 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i13 % 2 == 0) {
            throw null;
        }
        setOnEditorActionListener = gettransactionportraitArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i14 = setLayoutDirection + 7;
        setCursorVisible = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public getTransactionPortrait(String str, int i10, int i11) {
        super(str, i10);
        this.setDividerPadding = i11;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:39:0x01ec  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i12 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i12 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(setTextScaleX[i10 + i12])};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 728);
                    byte b10 = (byte) 0;
                    Object[] objArr3 = new Object[1];
                    c(b10, b10, (byte) (b10 | GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH), objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(setChildDivider), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (Process.getGidForName("") + 46117), 43 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 1777);
                    byte b11 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    c(b11, b11, (byte) (b11 | 37), objArr5);
                    String str = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 27 - Color.green(0), TextUtils.getCapsMode("", 0, 0) + 2311);
                    byte b12 = (byte) 0;
                    Object[] objArr7 = new Object[1];
                    c(b12, b12, (byte) (b12 | 33), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method3);
                }
                ((Method) method3).invoke(null, objArr6);
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
        char[] cArr = new char[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i13 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i14 = $11 + 111;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[i13] = (char) jArr[i13];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object method4 = map2.get(1606688712);
            if (method4 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) Color.green(0), View.resolveSize(0, 0) + 27, 2310 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                byte b13 = (byte) 0;
                Object[] objArr9 = new Object[1];
                c(b13, b13, (byte) (b13 | 33), objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            int i16 = $11 + 91;
            $10 = i16 % 128;
            int i17 = i16 % 2;
        }
    }

    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = $11 + 115;
        int i13 = i12 % 128;
        $10 = i13;
        int i14 = 2;
        if (i12 % 2 != 0) {
            throw null;
        }
        int i15 = i13 + 15;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i17 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i18 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i18 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i19 = $11 + 69;
            $10 = i19 % 128;
            int i20 = i19 % i14;
            cArr2[i17] = charArray[i18];
            cArr2[1] = charArray[i18 + 1];
            int i21 = 58224;
            int i22 = i17;
            while (i22 < 16) {
                char c10 = cArr2[1];
                char c11 = cArr2[i17];
                int i23 = (c11 + i21) ^ ((c11 << 4) + ((char) (((long) getSuppressed) ^ 4333817592127744003L)));
                int i24 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(setMaxEms);
                    objArr2[i14] = Integer.valueOf(i24);
                    objArr2[1] = Integer.valueOf(i23);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48533 - TextUtils.lastIndexOf("", '0')), 47 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2672 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 2);
                        Object[] objArr3 = new Object[1];
                        c(b10, (byte) (b11 - 2), b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i21) ^ ((cCharValue << 4) + ((char) (((long) setImageResource) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(setMinHeight)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 48535), 47 - TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 2673);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 2);
                        Object[] objArr5 = new Object[1];
                        c(b12, (byte) (b13 - 2), b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i21 -= 40503;
                    i22++;
                    i14 = 2;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i25 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i25] = cArr2[0];
            cArr[i25 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) View.resolveSize(0, 0), 36 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), KeyEvent.normalizeMetaState(0) + 2145);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                c(b14, b15, b15, objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i11;
            i17 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 4
            int r0 = r5 + 1
            byte[] r1 = com.mypinpad.tsdk.isolation.getTransactionPortrait.$$a
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = 105 - r7
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L18
            r7 = r6
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r5
            goto L35
        L18:
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L1c:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r6) goto L2c
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L2c:
            r3 = r1[r7]
            r4 = r8
            r8 = r6
            r6 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r4
        L35:
            int r6 = -r6
            int r5 = r5 + r6
            int r7 = r7 + 1
            r6 = r8
            r8 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getTransactionPortrait.c(byte, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        $$a = new byte[]{25, -30, -107, -39};
        $$b = 157;
    }

    public static void e() {
        setChildDivider = -1671488361291312051L;
        setTextScaleX = new char[]{50776, 5128, 25320, 45232, 36619, 56780, 11182, 1663, 21725, 41611, 61809, 53044, 50781, 5149, 25326, 45232, 36636, 56780, 11192, 1662, 21715, 41602, 61815, 53029, 7580, 26692, 50776, 5128, 25340, 45242, 36639, 56782, 11199, 1657, 21707, 41604, 61794, 53043, 7569, 26690, 17978, 38118, 58184, 50778, 5151, 25335, 45227, 36633, 56790, 11186, 1636, 21723, 41614, 61797, 30685, 42379, 54117, 307, 16017, 27725, 39486, 47074, 58696, 4868, 16625, 32417, 44039, 55770, 63413, 9598, 21206, 32950, 48739, 42484, 30628, 330, 54020, 60577, 48740, 18436, 26051, 14183, 49453, 37599, 44169, 32297, 3050, 9601, 63307, 32997, 21125, 27719, 14832, 52144, 58716, 46857, 16569, 50776, 5128, 25318, 45224, 36621, 56776, 11176, 1647, 21707, 41600, 61819, 53042, 7580, 26688, 17958, 38124, 58206, 12578, 4074, 23130, 43036, 34556, 54441, 8975, 29133, 20410, 39528, 56200, 2520, 32566, 44408, 37597, 49176, 13944, 7103, 18715, 48963, 60591, 53989, 'T', 30084, 23523, 35135, 65155, 11496, 4656, 18329, 46545, 39739, 51573, 16069, 27673, 21088, 34744, 62739, 56143, 2213, 32503, 44119, 37289, 51198, 13658, 6806, 18663, 48695, 28446, 48462, 52128, 6638, 9803, 29838, 33518, 44841, 64909, 3019, 22591, 26222, 46301, 49432, 61296, 15776, 18974, 39038, 42667, 62221, 327, 12208, 32226, 33381, 20533, 9921, 62599, 52002, 39403, 28549, 16964, 4320, 59068, 46412, 35615, 27518, 47399, 53201, 7580, 8765, 28907, 34434, 43842, 63978, 4015, 23643, 25096, 45241, 50546, 60174, 14813, 20069, 39938, 41671, 63357, 1328};
        setMaxEms = (char) 36910;
        getSuppressed = (char) 8972;
        setImageResource = (char) 55222;
        setMinHeight = (char) 7869;
    }

    public static getTransactionPortrait valueOf(String str) {
        int i10 = setLayoutDirection + 119;
        setCursorVisible = i10 % 128;
        if (i10 % 2 == 0) {
            Enum.valueOf(getTransactionPortrait.class, str);
            throw null;
        }
        getTransactionPortrait gettransactionportrait = (getTransactionPortrait) Enum.valueOf(getTransactionPortrait.class, str);
        int i11 = setCursorVisible + 65;
        setLayoutDirection = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 56 / 0;
        }
        return gettransactionportrait;
    }

    public static getTransactionPortrait[] values() {
        int i10 = setLayoutDirection + 93;
        setCursorVisible = i10 % 128;
        if (i10 % 2 != 0) {
            return (getTransactionPortrait[]) setOnEditorActionListener.clone();
        }
        int i11 = 33 / 0;
        return (getTransactionPortrait[]) setOnEditorActionListener.clone();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final int setCompoundDrawableTintBlendMode() {
        int i10 = setLayoutDirection + 85;
        int i11 = i10 % 128;
        setCursorVisible = i11;
        int i12 = i10 % 2;
        int i13 = this.setDividerPadding;
        int i14 = i11 + 109;
        setLayoutDirection = i14 % 128;
        int i15 = i14 % 2;
        return i13;
    }
}
