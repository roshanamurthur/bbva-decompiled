package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/pq;", "", "setDividerPadding", "setOnFocusChangeListener", "setY", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 8, 0})
public final class pq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] getNavBarTitleString;
    public static final pq setCompoundDrawableTintBlendMode;
    public static final pq setDividerPadding;
    private static int setLayoutAnimation;
    private static int setNavigationOnClickListener;
    public static final pq setOnFocusChangeListener;
    private static char setOnLongClickListener;
    private static final /* synthetic */ pq[] setX;
    public static final pq setY;

    static {
        pq[] pqVarArr;
        c();
        $10 = 0;
        $11 = 1;
        setLayoutAnimation = 0;
        setNavigationOnClickListener = 1;
        d();
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 14, "\u0015\u0010\u0017\u0001\t\u000b\u0007\u0002\u000b\u0018㙃㙃\u0001\u0006", (byte) (TextUtils.lastIndexOf("", '0') + 110), objArr);
        pq pqVar = new pq(((String) objArr[0]).intern(), 0);
        setDividerPadding = pqVar;
        Object[] objArr2 = new Object[1];
        a(View.MeasureSpec.getMode(0) + 13, "\t\u0017\u0018\u0006\u0005\u0015\u0015\r\u000b\u0013\u0001\u0017㘐", (byte) (Color.alpha(0) + 50), objArr2);
        pq pqVar2 = new pq(((String) objArr2[0]).intern(), 1);
        setOnFocusChangeListener = pqVar2;
        Object[] objArr3 = new Object[1];
        a(13 - TextUtils.getOffsetAfter("", 0), "\t\u0017\u0018\u0006\u000b\u0006\u0016\u0010\u0004\f\u000b\u0016㘐", (byte) (49 - ImageFormat.getBitsPerPixel(0)), objArr3);
        pq pqVar3 = new pq(((String) objArr3[0]).intern(), 2);
        setY = pqVar3;
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, "\u0006\u0001\u0004\f\u0013\u0016\u0007\u0003\u0010\u0016㗻", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 29), objArr4);
        pq pqVar4 = new pq(((String) objArr4[0]).intern(), 3);
        setCompoundDrawableTintBlendMode = pqVar4;
        int i10 = setLayoutAnimation + 109;
        int i11 = i10 % 128;
        setNavigationOnClickListener = i11;
        if (i10 % 2 == 0) {
            pqVarArr = new pq[2];
            pqVarArr[1] = pqVar;
            pqVarArr[0] = pqVar2;
            pqVarArr[4] = pqVar3;
            pqVarArr[3] = pqVar4;
        } else {
            pqVarArr = new pq[]{pqVar, pqVar2, pqVar3, pqVar4};
        }
        int i12 = i11 + 111;
        int i13 = i12 % 128;
        setLayoutAnimation = i13;
        if (i12 % 2 != 0) {
            int i14 = 58 / 0;
        }
        setX = pqVarArr;
        int i15 = i13 + 125;
        setNavigationOnClickListener = i15 % 128;
        int i16 = i15 % 2;
    }

    public pq() {
        throw null;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = $10 + 31;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = getNavBarTitleString;
        int i13 = -1;
        int i14 = 1;
        long j10 = 0;
        int i15 = 290255894;
        int i16 = 0;
        if (cArr != null) {
            int i17 = $10 + 33;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[i16] = Integer.valueOf(cArr[i19]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i15));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 46 - (SystemClock.elapsedRealtime() > j10 ? 1 : (SystemClock.elapsedRealtime() == j10 ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1116);
                        byte b11 = (byte) i16;
                        Object[] objArr3 = new Object[1];
                        b(b11, (byte) i13, (byte) (b11 | 7), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i19++;
                    int i20 = $10 + 37;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    i13 = -1;
                    i14 = 1;
                    j10 = 0;
                    i15 = 290255894;
                    i16 = 0;
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
        Object[] objArr4 = {Integer.valueOf(setOnLongClickListener)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), 45 - ExpandableListView.getPackedPositionGroup(0L), 1116 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            byte b12 = (byte) 0;
            Object[] objArr5 = new Object[1];
            b(b12, (byte) (-1), (byte) (b12 | 7), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i22 = $10 + 91;
            $11 = i22 % 128;
            int i23 = i22 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i24 = $10 + 109;
            $11 = i24 % 128;
            int i25 = i24 % 2;
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i26 = setincludefontpadding.setDividerPadding;
                if (i26 >= i11) {
                    break;
                }
                int i27 = $11 + 99;
                int i28 = i27 % 128;
                $10 = i28;
                if (i27 % 2 != 0) {
                    char c10 = charArray[i26];
                    setincludefontpadding.setY = c10;
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c10;
                } else {
                    char c11 = charArray[i26];
                    setincludefontpadding.setY = c11;
                    char c12 = charArray[i26 + 1];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c12;
                    if (c11 != c12) {
                        Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(180437302);
                        if (method3 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), 27 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 2311);
                            byte length2 = (byte) $$a.length;
                            Object[] objArr7 = new Object[1];
                            b((byte) 0, (byte) (length2 - 5), length2, objArr7);
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
                                Class cls5 = (Class) setTextScaleX.setX((char) (49103 - TextUtils.indexOf("", "")), 35 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2545);
                                byte b13 = (byte) 0;
                                byte b14 = b13;
                                Object[] objArr9 = new Object[1];
                                b(b13, (byte) (b14 - 1), b14, objArr9);
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
                                int i34 = $10 + 121;
                                $11 = i34 % 128;
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
                            setincludefontpadding.setDividerPadding += 2;
                        }
                    }
                    setincludefontpadding.setDividerPadding += 2;
                }
                cArr3[i26] = (char) (setincludefontpadding.setY - b10);
                cArr3[i26 + 1] = (char) (setincludefontpadding.setCompoundDrawableTintBlendMode - b10);
                int i41 = i28 + 39;
                $11 = i41 % 128;
                int i42 = i41 % 2;
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        for (int i43 = 0; i43 < i10; i43++) {
            cArr3[i43] = (char) (cArr3[i43] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.mypinpad.tsdk.isolation.pq.$$a
            int r8 = 106 - r8
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r8 = r6
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r7
            goto L36
        L16:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L1b:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L36:
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pq.b(byte, byte, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{67, 5, -30, -3};
        $$b = 104;
    }

    public static void d() {
        setOnLongClickListener = (char) 53956;
        getNavBarTitleString = new char[]{53952, 59167, 59162, 59145, 53957, 53961, 59140, 59159, 59149, 59148, 53959, 59144, 59155, 53955, 59160, 53954, 59150, 59151, 53956, 53958, 59156, 59166, 59157, 59161, 59154};
    }

    public static pq valueOf(String str) {
        int i10 = setNavigationOnClickListener + 107;
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        pq pqVar = (pq) Enum.valueOf(pq.class, str);
        int i12 = setNavigationOnClickListener + 63;
        setLayoutAnimation = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 81 / 0;
        }
        return pqVar;
    }

    public static pq[] values() {
        int i10 = setNavigationOnClickListener + 117;
        setLayoutAnimation = i10 % 128;
        if (i10 % 2 == 0) {
            return (pq[]) setX.clone();
        }
        throw null;
    }
}
