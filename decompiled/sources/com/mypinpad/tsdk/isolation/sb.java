package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0010\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u0006j\u0002\b\u000bj\u0002\b\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/sb;", "", "Ljava/io/Serializable;", "", "setZ", "B", "setY", "()B", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setX", "setOnFocusChangeListener", "getNavBarTitleString", "setOnDragListener", "setNavigationOnClickListener", "setOnLongClickListener", "setLayoutAnimation", "setAlwaysDrawnWithCacheEnabled", "UiMessageCallbackKtWhenMappings", "setTextAlignment"}, k = 1, mv = {1, 8, 0})
public final class sb implements Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final sb UiMessageCallbackKtWhenMappings;
    private static long getAmountFieldTextColor;
    public static final sb getNavBarTitleString;
    private static int getSuppressed;
    public static final sb setAlwaysDrawnWithCacheEnabled;
    private static char[] setChildDivider;
    private static boolean setCompoundDrawablePadding;
    public static final sb setCompoundDrawableTintBlendMode;
    public static final sb setDividerPadding;
    private static char setImageResource;
    private static final /* synthetic */ sb[] setIncludeFontPadding;
    public static final sb setLayoutAnimation;
    private static int setLayoutDirection;
    private static int setMaxEms;
    public static final sb setNavigationOnClickListener;
    public static final sb setOnDragListener;
    private static int setOnEditorActionListener;
    public static final sb setOnFocusChangeListener;
    public static final sb setOnLongClickListener;
    public static final sb setTextAlignment;
    private static boolean setTextScaleX;
    public static final sb setX;
    public static final sb setY;

    /* JADX INFO: renamed from: setZ, reason: from kotlin metadata */
    private final byte setCompoundDrawableTintBlendMode;

    static {
        d();
        $10 = 0;
        $11 = 1;
        setMaxEms = 0;
        setLayoutDirection = 1;
        e();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 128, "\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
        sb sbVar = new sb(((String) objArr[0]).intern(), 0, (byte) 3);
        setDividerPadding = sbVar;
        Object[] objArr2 = new Object[1];
        a(127 - TextUtils.indexOf("", "", 0, 0), "\u0087\u0086\u008e\u008d\u0083\u0084\u008c\u0089\u008b\u0081\u008a\u0089\u0084\u0088", objArr2);
        sb sbVar2 = new sb(((String) objArr2[0]).intern(), 1, (byte) 7);
        setX = sbVar2;
        Object[] objArr3 = new Object[1];
        b((char) (47105 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "쭯췹u꾸", ViewConfiguration.getScrollBarSize() >> 8, "⁾\u0e7c꺙\u09d3끫ᾇꄯᓬಷ皱ႁူ㓋\uedb8\uf09b睍", objArr3);
        sb sbVar3 = new sb(((String) objArr3[0]).intern(), 2, (byte) 9);
        setY = sbVar3;
        Object[] objArr4 = new Object[1];
        b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19351), "檄㨠飵齋", TextUtils.indexOf((CharSequence) "", '0', 0) + 1, "钂ῄ\uf09bञ佁퍵⟯᳅椘戏鮧⦬\uf8b0ꑢ㨲劘", objArr4);
        sb sbVar4 = new sb(((String) objArr4[0]).intern(), 3, (byte) 15);
        setOnFocusChangeListener = sbVar4;
        Object[] objArr5 = new Object[1];
        a(View.getDefaultSize(0, 0) + 127, "\u0087\u0083\u0081\u008f\u008a\u0089\u0088\u0086\u008e\u0086\u0083\u0082", objArr5);
        sb sbVar5 = new sb(((String) objArr5[0]).intern(), 4, MessageUtils.MESSAGE_21_NAK);
        setCompoundDrawableTintBlendMode = sbVar5;
        Object[] objArr6 = new Object[1];
        a(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0086\u0085\u0084\u0092\u0086\u0083\u008a\u0086\u008e\u0081\u0086\u0091\u0082\u008a\u0090\u0084\u008a\u0087\u0081\u0086\u0083\u008a\u0087\u0083\u0081\u008f", objArr6);
        sb sbVar6 = new sb(((String) objArr6[0]).intern(), 5, (byte) 23);
        getNavBarTitleString = sbVar6;
        Object[] objArr7 = new Object[1];
        b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "铐㻦֝蒳", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "㐷ᔷ맣畄㝃㓩㲘眆⹒깞\ueb5e☯ɗﴣ偆\ue8f5ƿ\uecf6铢廲", objArr7);
        sb sbVar7 = new sb(((String) objArr7[0]).intern(), 6, MessageUtils.MESSAGE_26_SUB);
        setOnDragListener = sbVar7;
        Object[] objArr8 = new Object[1];
        a(View.resolveSize(0, 0) + 127, "\u0089\u008d\u0081\u0094\u008a\u0086\u008e\u0081\u0086\u0091\u0082\u008a\u0093\u0088\u008d\u008e\u008d\u0083\u0084\u008c\u0089\u008b\u0081", objArr8);
        sb sbVar8 = new sb(((String) objArr8[0]).intern(), 7, (byte) 27);
        setNavigationOnClickListener = sbVar8;
        Object[] objArr9 = new Object[1];
        a(View.resolveSize(0, 0) + 127, "\u0087\u0083\u0081\u008f\u008a\u0083\u0086\u008c\u0089\u0084\u0088\u0081\u008a\u0095\u0083\u0089", objArr9);
        sb sbVar9 = new sb(((String) objArr9[0]).intern(), 8, (byte) 28);
        setOnLongClickListener = sbVar9;
        Object[] objArr10 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, "\u0095\u0081\u0091\u0082\u008e\u008d\u0087\u008a\u0083\u0081\u0086\u0091\u008f", objArr10);
        sb sbVar10 = new sb(((String) objArr10[0]).intern(), 9, MessageUtils.MESSAGE_30_RS);
        setLayoutAnimation = sbVar10;
        Object[] objArr11 = new Object[1];
        b((char) KeyEvent.keyCodeFromString(""), "\ue5d3\ue1ee蔺盖", 987885286 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\uf3e2蘻ꉴ㌺쿮睔⢄䰙\uef7e", objArr11);
        sb sbVar11 = new sb(((String) objArr11[0]).intern(), 10, (byte) 32);
        setAlwaysDrawnWithCacheEnabled = sbVar11;
        Object[] objArr12 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0088\u008d\u0081\u0093\u0081\u008a\u0087\u0083\u0081\u008f\u008a\u0089\u0088\u0086\u008e\u0086\u0083\u0082", objArr12);
        sb sbVar12 = new sb(((String) objArr12[0]).intern(), 11, (byte) 33);
        UiMessageCallbackKtWhenMappings = sbVar12;
        Object[] objArr13 = new Object[1];
        a(TextUtils.indexOf("", "", 0) + 127, "\u0091\u0091\u008d\u0089\u008e\u008a\u0087\u0091\u0084\u008c", objArr13);
        sb sbVar13 = new sb(((String) objArr13[0]).intern(), 12, Constants.CVR_B1b85_0111_VERIFIED_CLOUD);
        setTextAlignment = sbVar13;
        int i10 = setLayoutDirection;
        int i11 = i10 + 11;
        setMaxEms = i11 % 128;
        int i12 = i11 % 2;
        sb[] sbVarArr = {sbVar, sbVar2, sbVar3, sbVar4, sbVar5, sbVar6, sbVar7, sbVar8, sbVar9, sbVar10, sbVar11, sbVar12, sbVar13};
        int i13 = i10 + 69;
        setMaxEms = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        setIncludeFontPadding = sbVarArr;
        int i14 = i10 + 121;
        setMaxEms = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public sb(String str, int i10, byte b10) {
        super(str, i10);
        this.setCompoundDrawableTintBlendMode = b10;
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = setChildDivider;
        if (cArr != null) {
            int i11 = $10 + 91;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i13 = 0; i13 < length; i13++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26288), 64 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 1595);
                        byte length2 = (byte) $$a.length;
                        Object[] objArr3 = new Object[1];
                        c((byte) 0, length2, (byte) (length2 - 4), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
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
        Object[] objArr4 = {Integer.valueOf(setOnEditorActionListener)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10744), (ViewConfiguration.getTouchSlop() >> 8) + 43, 567 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            byte b10 = (byte) 0;
            byte b11 = (byte) (b10 + 2);
            Object[] objArr5 = new Object[1];
            c(b10, b11, (byte) (b11 - 2), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!setCompoundDrawablePadding) {
            if (!setTextScaleX) {
                throw null;
            }
            int i14 = $11 + 119;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            throw null;
        }
        int i16 = $11 + 75;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        int length3 = bytes.length;
        setz.setOnFocusChangeListener = length3;
        char[] cArr3 = new char[length3];
        setz.setDividerPadding = 0;
        while (true) {
            int i18 = setz.setDividerPadding;
            int i19 = setz.setOnFocusChangeListener;
            if (i18 >= i19) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i18] = (char) (cArr[bytes[(i19 - 1) - i18] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 1), View.resolveSize(0, 0) + 51, 2879 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                byte b12 = (byte) 0;
                byte b13 = b12;
                Object[] objArr7 = new Object[1];
                c(b12, b13, b13, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    public static void b(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        int i11;
        int i12 = $11 + 63;
        $10 = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        int i15 = $10 + 59;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        char[] charArray3 = str.toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i17 = $11 + 115;
            $10 = i17 % 128;
            int i18 = i17 % i13;
            try {
                Object[] objArr2 = {uiMessageCallbackKtWhenMappings};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (50678 - KeyEvent.keyCodeFromString("")), ExpandableListView.getPackedPositionChild(0L) + 40, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1737);
                    byte b10 = (byte) 0;
                    Object[] objArr3 = new Object[1];
                    c(b10, (byte) (b10 | 9), b10, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8125 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 37 - View.resolveSize(0, 0), 646 - TextUtils.getTrimmedLength(""));
                    byte b11 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    c(b11, (byte) (b11 | 6), b11, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 49, (KeyEvent.getMaxKeyCode() >> 16) + 434);
                    byte b12 = (byte) 0;
                    Object[] objArr7 = new Object[1];
                    c(b12, (byte) (b12 | 8), b12, objArr7);
                    String str3 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str3, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    i11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (4449 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, 1021 - ((Process.getThreadPriority(0) + 20) >> 6));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 3);
                    Object[] objArr9 = new Object[1];
                    c(b13, b14, (byte) (b14 - 3), objArr9);
                    String str4 = (String) objArr9[0];
                    i11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str4, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i19 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i19] = (char) (((((long) (c11 ^ charArray[i19])) ^ (getAmountFieldTextColor ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) getSuppressed) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) setImageResource) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i19 + 1;
                i13 = i11;
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

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 122 - r8
            byte[] r0 = com.mypinpad.tsdk.isolation.sb.$$a
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r9 = r9 * 2
            int r1 = r9 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L36
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L36:
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.sb.c(int, short, short, java.lang.Object[]):void");
    }

    public static void d() {
        $$a = new byte[]{89, Constants.CVR_B2b65_CLEAR_BITS, -86, 63};
        $$b = ErrorCodes.ERR_CRY_BAD_PIN_SIZE;
    }

    public static void e() {
        setTextScaleX = true;
        setCompoundDrawablePadding = true;
        setOnEditorActionListener = 1794962259;
        setChildDivider = new char[]{62098, 62083, 62085, 62080, 62089, 62102, 62103, 62081, 62087, 62128, 62086, 62107, 62106, 62084, 62100, 62108, 62111, 62110, 62104, 62088, 62090};
        setImageResource = (char) 31621;
        getAmountFieldTextColor = -2443367703579691432L;
        getSuppressed = -461867432;
    }

    public static sb valueOf(String str) {
        int i10 = setMaxEms + 125;
        setLayoutDirection = i10 % 128;
        int i11 = i10 % 2;
        sb sbVar = (sb) Enum.valueOf(sb.class, str);
        int i12 = setMaxEms + 47;
        setLayoutDirection = i12 % 128;
        int i13 = i12 % 2;
        return sbVar;
    }

    public static sb[] values() {
        int i10 = setMaxEms + 61;
        setLayoutDirection = i10 % 128;
        int i11 = i10 % 2;
        sb[] sbVarArr = (sb[]) setIncludeFontPadding.clone();
        int i12 = setLayoutDirection + 45;
        setMaxEms = i12 % 128;
        if (i12 % 2 == 0) {
            return sbVarArr;
        }
        throw null;
    }

    @JvmName(name = "setY")
    public final byte setY() {
        int i10 = setMaxEms + 17;
        int i11 = i10 % 128;
        setLayoutDirection = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        byte b10 = this.setCompoundDrawableTintBlendMode;
        int i12 = i11 + 49;
        setMaxEms = i12 % 128;
        if (i12 % 2 == 0) {
            return b10;
        }
        throw null;
    }
}
