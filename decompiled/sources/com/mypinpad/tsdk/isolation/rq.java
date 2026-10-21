package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/rq;", "", "Ljava/io/Serializable;", "setOnFocusChangeListener", "setDividerPadding", "setCompoundDrawableTintBlendMode", "setY", "setX", "getNavBarTitleString", "setNavigationOnClickListener"}, k = 1, mv = {1, 8, 0})
public final class rq implements Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int UiMessageCallbackKtWhenMappings;
    public static final rq getNavBarTitleString;
    private static byte[] setAlwaysDrawnWithCacheEnabled;
    public static final rq setCompoundDrawableTintBlendMode;
    public static final rq setDividerPadding;
    private static int setIncludeFontPadding;
    private static int setLayoutAnimation;
    public static final rq setNavigationOnClickListener;
    private static int setOnDragListener;
    public static final rq setOnFocusChangeListener;
    private static final /* synthetic */ rq[] setOnLongClickListener;
    private static int setTextAlignment;
    public static final rq setX;
    public static final rq setY;
    private static short[] setZ;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setIncludeFontPadding = 0;
        setTextAlignment = 1;
        d();
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 66, (byte) Color.argb(0, 0, 0, 0), (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) - 651314515, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1138505265, objArr);
        rq rqVar = new rq(((String) objArr[0]).intern(), 0);
        setOnFocusChangeListener = rqVar;
        Object[] objArr2 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 70, (byte) View.MeasureSpec.getSize(0), (short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getOffsetAfter("", 0) - 651314514, 1138505290 - TextUtils.getOffsetBefore("", 0), objArr2);
        rq rqVar2 = new rq(((String) objArr2[0]).intern(), 1);
        setDividerPadding = rqVar2;
        Object[] objArr3 = new Object[1];
        a((Process.myPid() >> 22) - 73, (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 651314516, 1138505311 - View.getDefaultSize(0, 0), objArr3);
        rq rqVar3 = new rq(((String) objArr3[0]).intern(), 2);
        setCompoundDrawableTintBlendMode = rqVar3;
        Object[] objArr4 = new Object[1];
        a(AndroidCharacter.getMirror('0') - 'x', (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') - 651314530, KeyEvent.keyCodeFromString("") + 1138505329, objArr4);
        rq rqVar4 = new rq(((String) objArr4[0]).intern(), 3);
        setY = rqVar4;
        Object[] objArr5 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 63, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (short) TextUtils.indexOf("", "", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 651314531, 1138505347 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
        rq rqVar5 = new rq(((String) objArr5[0]).intern(), 4);
        setX = rqVar5;
        Object[] objArr6 = new Object[1];
        a((-76) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), View.resolveSize(0, 0) - 651314515, TextUtils.lastIndexOf("", '0', 0, 0) + 1138505377, objArr6);
        rq rqVar6 = new rq(((String) objArr6[0]).intern(), 5);
        getNavBarTitleString = rqVar6;
        Object[] objArr7 = new Object[1];
        a((-75) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0', 0) - 651314514, 1138505391 - Color.green(0), objArr7);
        rq rqVar7 = new rq(((String) objArr7[0]).intern(), 6);
        setNavigationOnClickListener = rqVar7;
        int i10 = setTextAlignment + 97;
        int i11 = i10 % 128;
        setIncludeFontPadding = i11;
        int i12 = i10 % 2;
        rq[] rqVarArr = {rqVar, rqVar2, rqVar3, rqVar4, rqVar5, rqVar6, rqVar7};
        int i13 = i11 + 49;
        setTextAlignment = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 55 / 0;
        }
        setOnLongClickListener = rqVarArr;
        int i15 = i11 + 75;
        setTextAlignment = i15 % 128;
        int i16 = i15 % 2;
    }

    public rq() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0284  */
    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        long j10;
        boolean z10;
        int length;
        byte[] bArr;
        int i14;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        int i15 = 2;
        try {
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(setLayoutAnimation)};
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            float f6 = 0.0f;
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49, 433 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                b(b11, b12, b12, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i16 = $11 + 21;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    i13 = 0;
                } else {
                    i13 = 1;
                }
            } else {
                i13 = 0;
            }
            if (i13 == 0) {
                j10 = 7616081452308447380L;
            } else {
                byte[] bArr2 = setAlwaysDrawnWithCacheEnabled;
                if (bArr2 != null) {
                    int i17 = $11 + 23;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i14 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i14 = 0;
                    }
                    while (i14 < length) {
                        int i18 = $10 + 113;
                        $11 = i18 % 128;
                        int i19 = i18 % i15;
                        Object[] objArr4 = {Integer.valueOf(bArr2[i14])};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (49111 - TextUtils.getTrimmedLength("")), 41 - (AudioTrack.getMinVolume() > f6 ? 1 : (AudioTrack.getMinVolume() == f6 ? 0 : -1)), 52 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr[i14] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i14++;
                        i15 = 2;
                        f6 = 0.0f;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = setAlwaysDrawnWithCacheEnabled;
                    Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(setOnDragListener)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-769569468);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 49, 434 - (ViewConfiguration.getScrollBarSize() >> 8));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, b14, objArr6);
                        String str2 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, cls4, cls4);
                        map3.put(-769569468, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) setLayoutAnimation) ^ 7616081452308447380L)));
                    j10 = 7616081452308447380L;
                } else {
                    j10 = 7616081452308447380L;
                    iIntValue = (short) (((short) (((long) setZ[i12 + ((int) (((long) setOnDragListener) ^ 7616081452308447380L))]) ^ 7616081452308447380L)) + ((int) (((long) setLayoutAnimation) ^ 7616081452308447380L)));
                }
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) setOnDragListener) ^ j10)) + i13;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(UiMessageCallbackKtWhenMappings), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 43, 2803 - TextUtils.getCapsMode("", 0, 0));
                    byte b15 = (byte) ($$a[0] - 1);
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    String str3 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                    map4.put(193260760, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                byte[] bArr4 = setAlwaysDrawnWithCacheEnabled;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i20 = 0; i20 < length2; i20++) {
                        int i21 = $10 + 5;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        bArr5[i20] = (byte) (((long) bArr4[i20]) ^ 7616081452308447380L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i23 = $11 + 101;
                    $10 = i23 % 128;
                    if (i23 % 2 != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                settextalignment.setDividerPadding = 1;
                int i24 = $10 + 41;
                $11 = i24 % 128;
                int i25 = i24 % 2;
                while (settextalignment.setDividerPadding < iIntValue) {
                    if (z10) {
                        byte[] bArr6 = setAlwaysDrawnWithCacheEnabled;
                        int i26 = settextalignment.setX;
                        settextalignment.setX = i26 - 1;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr6[i26]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    } else {
                        short[] sArr = setZ;
                        int i27 = settextalignment.setX;
                        settextalignment.setX = i27 - 1;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((short) (((short) (((long) sArr[i27]) ^ 7616081452308447380L)) + s4)) ^ b10));
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

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r8, byte r9, int r10, java.lang.Object[] r11) {
        /*
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r10 = r10 * 4
            int r10 = r10 + 1
            byte[] r0 = com.mypinpad.tsdk.isolation.rq.$$a
            int r8 = r8 * 3
            int r8 = r8 + 109
            byte[] r1 = new byte[r10]
            r2 = 0
            if (r0 != 0) goto L1a
            r8 = r9
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r11
            r11 = r10
            goto L37
        L1a:
            r3 = r2
        L1b:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r10) goto L2c
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r2)
            r11[r2] = r8
            return
        L2c:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r1
            r1 = r0
            r0 = r7
        L37:
            int r10 = -r10
            int r9 = r9 + r10
            r10 = r11
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.rq.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{2, -109, 33, 44};
        $$b = 102;
    }

    public static void d() {
        setOnDragListener = 359303515;
        setLayoutAnimation = -1454817080;
        UiMessageCallbackKtWhenMappings = -1885665997;
        setAlwaysDrawnWithCacheEnabled = new byte[]{107, 101, -121, 103, -111, 104, Constants.FCI_TEMPLATE, -103, 101, Constants.DIRECTORY_ENTRY, -104, -122, 126, 108, -123, 107, -110, Constants.DIRECTORY_ENTRY, -123, -106, 122, -111, -103, 123, GenerateAcResponseApdu.DDA_HEADER, -105, 101, 101, -123, -111, 109, 101, -113, 107, 109, -108, -109, -106, Constants.DIRECTORY_ENTRY, -103, GenerateAcResponseApdu.DDA_HEADER, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -103, -103, 102, GenerateAcResponseApdu.DDA_HEADER, 107, 101, -121, 127, -103, Constants.DIRECTORY_ENTRY, -123, -106, 104, -107, 113, -123, 107, -110, 98, -108, -102, 102, 103, 105, -99, -105, -100, Constants.FCI_TEMPLATE, 115, ComputeCcCommandApdu.EXPECTED_P1, 101, -121, 121, -107, Constants.CVR_B1b85_0110_TERMINAL, ComputeCcCommandApdu.EXPECTED_P1, -106, 110, 103, -123, -107, 103, 105, -99, -105, -100, Constants.FCI_TEMPLATE, 115, -121, -97, GenerateAcResponseApdu.DDA_HEADER, 110, Constants.DIRECTORY_ENTRY, -97, 99, -101, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, ComputeCcCommandApdu.EXPECTED_P1, 101, -121, 121, -107, Constants.CVR_B1b85_0110_TERMINAL, ComputeCcCommandApdu.EXPECTED_P1, -106, 110, 103, -123, -107, -105, 105, -108, -103, 114, -128, -100, GenerateAcResponseApdu.DDA_HEADER, 105, -111, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, ComputeCcCommandApdu.EXPECTED_P1, 108, -112, Constants.DIRECTORY_ENTRY, 107, 102, -112, 107, 105, -98, -111, 113, -121, -97, 103, -111, 104, Constants.FCI_TEMPLATE, -103, 101, -108, -108, -108, -108, -108, -108, -108};
    }

    public static rq valueOf(String str) {
        int i10 = setIncludeFontPadding + 23;
        setTextAlignment = i10 % 128;
        int i11 = i10 % 2;
        rq rqVar = (rq) Enum.valueOf(rq.class, str);
        int i12 = setIncludeFontPadding + 45;
        setTextAlignment = i12 % 128;
        int i13 = i12 % 2;
        return rqVar;
    }

    public static rq[] values() {
        int i10 = setIncludeFontPadding + 113;
        setTextAlignment = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        rq[] rqVarArr = (rq[]) setOnLongClickListener.clone();
        int i11 = setTextAlignment + 21;
        setIncludeFontPadding = i11 % 128;
        if (i11 % 2 == 0) {
            return rqVarArr;
        }
        throw null;
    }
}
