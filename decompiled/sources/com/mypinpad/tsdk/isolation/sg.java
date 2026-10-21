package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/sg;", "", "Ljava/io/Serializable;", "setY", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setX", "setDividerPadding"}, k = 1, mv = {1, 8, 0})
public final class sg implements Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getNavBarTitleString;
    private static int setAlwaysDrawnWithCacheEnabled;
    public static final sg setCompoundDrawableTintBlendMode;
    public static final sg setDividerPadding;
    private static char setLayoutAnimation;
    private static long setNavigationOnClickListener;
    private static final /* synthetic */ sg[] setOnDragListener;
    public static final sg setOnFocusChangeListener;
    private static int setOnLongClickListener;
    public static final sg setX;
    public static final sg setY;

    static {
        sg[] sgVarArr;
        c();
        $10 = 0;
        $11 = 1;
        getNavBarTitleString = 0;
        setAlwaysDrawnWithCacheEnabled = 1;
        d();
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "ҩꕷ̈́羾", AndroidCharacter.getMirror('0') - '0', "㡍妩\uf834⎤놹٨㓗ₒ류\ud89c", objArr);
        sg sgVar = new sg(((String) objArr[0]).intern(), 0);
        setY = sgVar;
        Object[] objArr2 = new Object[1];
        a((char) (45820 - Color.argb(0, 0, 0, 0)), "驴햷ﳚ沲", TextUtils.getOffsetAfter("", 0), "ꦻ﮺라煅", objArr2);
        sg sgVar2 = new sg(((String) objArr2[0]).intern(), 1);
        setCompoundDrawableTintBlendMode = sgVar2;
        Object[] objArr3 = new Object[1];
        a((char) (53455 - (Process.myPid() >> 22)), "㉗ស켐쟐", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), "깠쫸￮\uf518\ueb71蛎\ue422킌쒈蟁㧂\uf624ະ\ue43d봅忦", objArr3);
        sg sgVar3 = new sg(((String) objArr3[0]).intern(), 2);
        setOnFocusChangeListener = sgVar3;
        Object[] objArr4 = new Object[1];
        a((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "珏ﱆ\uda54鐑", 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "멒᪳髱\ud8b8壩芇伤퍢", objArr4);
        sg sgVar4 = new sg(((String) objArr4[0]).intern(), 3);
        setX = sgVar4;
        Object[] objArr5 = new Object[1];
        a((char) (34019 - (Process.myPid() >> 22)), "ᣰ凭\ue3b1趄", TextUtils.indexOf("", ""), "섡矏徚짥뚿ꦰ", objArr5);
        sg sgVar5 = new sg(((String) objArr5[0]).intern(), 4);
        setDividerPadding = sgVar5;
        int i10 = getNavBarTitleString + 81;
        int i11 = i10 % 128;
        setAlwaysDrawnWithCacheEnabled = i11;
        if (i10 % 2 == 0) {
            sgVarArr = new sg[4];
            sgVarArr[0] = sgVar;
            sgVarArr[0] = sgVar2;
            sgVarArr[4] = sgVar3;
            sgVarArr[5] = sgVar4;
            sgVarArr[2] = sgVar5;
        } else {
            sgVarArr = new sg[]{sgVar, sgVar2, sgVar3, sgVar4, sgVar5};
        }
        int i12 = i11 + 97;
        int i13 = i12 % 128;
        getNavBarTitleString = i13;
        if (i12 % 2 != 0) {
            int i14 = 64 / 0;
        }
        setOnDragListener = sgVarArr;
        int i15 = i13 + 55;
        setAlwaysDrawnWithCacheEnabled = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    public sg() {
        throw null;
    }

    public static void a(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        int i11 = $11 + 101;
        int i12 = i11 % 128;
        $10 = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 79;
        $11 = i14 % 128;
        int i15 = 0;
        if (i14 % 2 == 0) {
            charArray = str2.toCharArray();
            int i16 = 89 / 0;
        } else {
            charArray = str2.toCharArray();
        }
        int i17 = $10 + 63;
        $11 = i17 % 128;
        if (i17 % 2 == 0) {
            "飋澆ݺ傸".toCharArray();
            throw null;
        }
        char[] charArray2 = "飋澆ݺ傸".toCharArray();
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
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i15] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.getOffsetAfter("", i15) + 50678), 39 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1737 - View.combineMeasuredStates(i15, i15));
                    byte b10 = (byte) i15;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b11, (byte) (b11 - 1), b10, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8126 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 37, TextUtils.indexOf((CharSequence) "", '0', 0) + 647);
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 3);
                    Object[] objArr5 = new Object[1];
                    b(b13, (byte) (b13 - 4), b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode("", 0, 0), 48 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 434);
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    b(b15, (byte) (-b15), b14, objArr7);
                    String str3 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str3, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (4449 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1022 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    byte b16 = (byte) 0;
                    Object[] objArr9 = new Object[1];
                    b((byte) (b16 | 6), (byte) (-1), b16, objArr9);
                    String str4 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str4, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i18 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i18] = (char) (((((long) (c11 ^ charArray[i18])) ^ (setNavigationOnClickListener ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) setOnLongClickListener) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) setLayoutAnimation) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i18 + 1;
                length3 = length3;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str5 = new String(cArr3);
        int i19 = $11 + 65;
        $10 = i19 % 128;
        int i20 = i19 % 2;
        objArr[0] = str5;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 113
            byte[] r0 = com.mypinpad.tsdk.isolation.sg.$$a
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L34
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.sg.b(byte, byte, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{75, 85, 67, -51};
        $$b = 131;
    }

    public static void d() {
        setLayoutAnimation = (char) 30296;
        setNavigationOnClickListener = -8165187209117372781L;
        setOnLongClickListener = -461867432;
    }

    public static sg valueOf(String str) {
        int i10 = setAlwaysDrawnWithCacheEnabled + 57;
        getNavBarTitleString = i10 % 128;
        int i11 = i10 % 2;
        sg sgVar = (sg) Enum.valueOf(sg.class, str);
        int i12 = setAlwaysDrawnWithCacheEnabled + 41;
        getNavBarTitleString = i12 % 128;
        if (i12 % 2 == 0) {
            return sgVar;
        }
        throw null;
    }

    public static sg[] values() {
        sg[] sgVarArr;
        int i10 = setAlwaysDrawnWithCacheEnabled + 91;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 != 0) {
            sgVarArr = (sg[]) setOnDragListener.clone();
            int i11 = 52 / 0;
        } else {
            sgVarArr = (sg[]) setOnDragListener.clone();
        }
        int i12 = getNavBarTitleString + 71;
        setAlwaysDrawnWithCacheEnabled = i12 % 128;
        if (i12 % 2 != 0) {
            return sgVarArr;
        }
        throw null;
    }
}
