package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/qs;", "", "setY", "setDividerPadding", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 8, 0})
public final class qs {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int UiMessageCallbackKtWhenMappings;
    private static short[] getNavBarTitleString;
    public static final qs setCompoundDrawableTintBlendMode;
    public static final qs setDividerPadding;
    private static int setLayoutAnimation;
    private static byte[] setNavigationOnClickListener;
    private static int setOnDragListener;
    private static int setOnFocusChangeListener;
    private static int setOnLongClickListener;
    private static final /* synthetic */ qs[] setX;
    public static final qs setY;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setLayoutAnimation = 0;
        UiMessageCallbackKtWhenMappings = 1;
        d();
        Object[] objArr = new Object[1];
        a((-13) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) (56 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 1633754645, (-1950539834) - TextUtils.indexOf("", ""), objArr);
        qs qsVar = new qs(((String) objArr[0]).intern(), 0);
        setY = qsVar;
        Object[] objArr2 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0, 0) - 9, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (short) ((-25) - TextUtils.indexOf("", "")), 1633754657 + (ViewConfiguration.getLongPressTimeout() >> 16), (-1950539822) - TextUtils.indexOf("", "", 0, 0), objArr2);
        qs qsVar2 = new qs(((String) objArr2[0]).intern(), 1);
        setDividerPadding = qsVar2;
        Object[] objArr3 = new Object[1];
        a((-17) - View.getDefaultSize(0, 0), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (26 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1633754642 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1950539807, objArr3);
        qs qsVar3 = new qs(((String) objArr3[0]).intern(), 2);
        setCompoundDrawableTintBlendMode = qsVar3;
        int i10 = setLayoutAnimation + 115;
        int i11 = i10 % 128;
        UiMessageCallbackKtWhenMappings = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 47;
        int i14 = i13 % 128;
        setLayoutAnimation = i14;
        int i15 = i13 % 2;
        setX = new qs[]{qsVar, qsVar2, qsVar3};
        int i16 = i14 + 57;
        UiMessageCallbackKtWhenMappings = i16 % 128;
        int i17 = i16 % 2;
    }

    public qs() {
        throw null;
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        int i14 = 2;
        try {
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(setOnDragListener)};
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            char c10 = '0';
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 49, 433 - ExpandableListView.getPackedPositionChild(0L));
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                b(b11, b12, (byte) (b12 - 1), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i15 = $10 + 115;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                i13 = 1;
            } else {
                i13 = 0;
            }
            if (i13 != 0) {
                byte[] bArr = setNavigationOnClickListener;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i17 = 0;
                    while (i17 < length) {
                        Object[] objArr4 = {Integer.valueOf(bArr[i17])};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (49111 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.indexOf("", c10, 0) + 42, 51 - MotionEvent.axisFromString(""))).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i17] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i17++;
                        c10 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = setNavigationOnClickListener;
                    Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(setOnFocusChangeListener)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-769569468);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) Color.green(0), KeyEvent.normalizeMetaState(0) + 49, TextUtils.indexOf("", "", 0) + 434);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, (byte) (b14 - 1), objArr6);
                        String str2 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, cls4, cls4);
                        map3.put(-769569468, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) setOnDragListener) ^ 7616081452308447380L)));
                    int i18 = $11 + 69;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    i14 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) getNavBarTitleString[i12 + ((int) (((long) setOnFocusChangeListener) ^ 7616081452308447380L))]) ^ 7616081452308447380L)) + ((int) (((long) setOnDragListener) ^ 7616081452308447380L)));
                    int i20 = $10 + 9;
                    $11 = i20 % 128;
                    i14 = 2;
                    int i21 = i20 % 2;
                }
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - i14) + ((int) (((long) setOnFocusChangeListener) ^ 7616081452308447380L)) + i13;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(setOnLongClickListener), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 42, (ViewConfiguration.getTapTimeout() >> 16) + 2803);
                    byte b15 = (byte) 1;
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr8);
                    String str3 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                    map4.put(193260760, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                byte[] bArr4 = setNavigationOnClickListener;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i22 = 0; i22 < length2; i22++) {
                        bArr5[i22] = (byte) (((long) bArr4[i22]) ^ 7616081452308447380L);
                    }
                    bArr4 = bArr5;
                }
                boolean z10 = bArr4 != null;
                settextalignment.setDividerPadding = 1;
                while (settextalignment.setDividerPadding < iIntValue) {
                    if (z10) {
                        byte[] bArr6 = setNavigationOnClickListener;
                        int i23 = settextalignment.setX;
                        settextalignment.setX = i23 - 1;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr6[i23]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    } else {
                        short[] sArr = getNavBarTitleString;
                        int i24 = settextalignment.setX;
                        settextalignment.setX = i24 - 1;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((short) (((short) (((long) sArr[i24]) ^ 7616081452308447380L)) + s4)) ^ b10));
                        int i25 = $10 + 29;
                        $11 = i25 % 128;
                        int i26 = i25 % 2;
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

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.mypinpad.tsdk.isolation.qs.$$a
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 * 3
            int r7 = r7 + 109
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L34
        L18:
            r3 = r2
        L19:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L34:
            int r8 = -r8
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qs.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{24, 55, -101, -128};
        $$b = 114;
    }

    public static void d() {
        setOnFocusChangeListener = -586440530;
        setOnDragListener = -1454817137;
        setOnLongClickListener = 936878757;
        setNavigationOnClickListener = new byte[]{42, 67, 40, 65, 94, 40, 40, Constants.RESP_MSG_TEMPLATE_FORMAT_2, Constants.STATE_ERROR, 46, 88, 70, -116, ComputeCcCommandApdu.EXPECTED_P1, -116, -115, -124, -100, -90, -126, -105, -92, -102, -77, -104, -79, ComputeCcCommandApdu.EXPECTED_P1, -104, 102, Constants.RESP_MSG_TEMPLATE_FORMAT_2, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 65, 107, 118, 126, 115, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -108, -108, -108};
    }

    public static qs valueOf(String str) {
        int i10 = setLayoutAnimation + 93;
        UiMessageCallbackKtWhenMappings = i10 % 128;
        int i11 = i10 % 2;
        qs qsVar = (qs) Enum.valueOf(qs.class, str);
        int i12 = setLayoutAnimation + 67;
        UiMessageCallbackKtWhenMappings = i12 % 128;
        if (i12 % 2 != 0) {
            return qsVar;
        }
        throw null;
    }

    public static qs[] values() {
        int i10 = UiMessageCallbackKtWhenMappings + 41;
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        qs[] qsVarArr = (qs[]) setX.clone();
        int i12 = UiMessageCallbackKtWhenMappings + 31;
        setLayoutAnimation = i12 % 128;
        if (i12 % 2 == 0) {
            return qsVarArr;
        }
        throw null;
    }
}
