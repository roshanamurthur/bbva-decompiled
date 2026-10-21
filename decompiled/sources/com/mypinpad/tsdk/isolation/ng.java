package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/ng;", "", "setDividerPadding", "setY", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 8, 0})
public final class ng {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final ng setCompoundDrawableTintBlendMode;
    public static final ng setDividerPadding;
    private static int setLayoutAnimation;
    private static int setOnDragListener;
    public static final ng setOnFocusChangeListener;
    private static int[] setOnLongClickListener;
    private static final /* synthetic */ ng[] setX;
    public static final ng setY;

    static {
        ng[] ngVarArr;
        c();
        $10 = 0;
        $11 = 1;
        setOnDragListener = 0;
        setLayoutAnimation = 1;
        d();
        Object[] objArr = new Object[1];
        a(new int[]{2126935419, 427826472}, 3 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        ng ngVar = new ng(((String) objArr[0]).intern(), 0);
        setDividerPadding = ngVar;
        Object[] objArr2 = new Object[1];
        a(new int[]{175725182, 1230645719, -458540326, 1382071413, -1023145215, -191408643}, 10 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
        ng ngVar2 = new ng(((String) objArr2[0]).intern(), 1);
        setY = ngVar2;
        Object[] objArr3 = new Object[1];
        a(new int[]{676000666, 1660838800, 777881560, 1076874511, -1023145215, -191408643}, 10 - View.MeasureSpec.getMode(0), objArr3);
        ng ngVar3 = new ng(((String) objArr3[0]).intern(), 2);
        setOnFocusChangeListener = ngVar3;
        Object[] objArr4 = new Object[1];
        a(new int[]{-1971356208, 1217071878, -571412756, 560705577}, (ViewConfiguration.getEdgeSlop() >> 16) + 8, objArr4);
        ng ngVar4 = new ng(((String) objArr4[0]).intern(), 3);
        setCompoundDrawableTintBlendMode = ngVar4;
        int i10 = setLayoutAnimation + 39;
        int i11 = i10 % 128;
        setOnDragListener = i11;
        if (i10 % 2 != 0) {
            ngVarArr = new ng[5];
            ngVarArr[0] = ngVar;
            ngVarArr[0] = ngVar2;
            ngVarArr[5] = ngVar3;
            ngVarArr[5] = ngVar4;
        } else {
            ngVarArr = new ng[]{ngVar, ngVar2, ngVar3, ngVar4};
        }
        int i12 = i11 + 19;
        int i13 = i12 % 128;
        setLayoutAnimation = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        setX = ngVarArr;
        int i14 = i13 + 63;
        setOnDragListener = i14 % 128;
        int i15 = i14 % 2;
    }

    public ng() {
        throw null;
    }

    public static void a(int[] iArr, int i10, Object[] objArr) throws Throwable {
        char[] cArr;
        Object method;
        int length;
        int[] iArr2;
        int length2;
        int[] iArr3;
        int i11;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr4 = setOnLongClickListener;
        int i12 = 1;
        int i13 = 1833429914;
        int i14 = 0;
        if (iArr4 != null) {
            int i15 = $10 + 99;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i11 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i11 = 0;
            }
            while (i11 < length2) {
                try {
                    Object[] objArr2 = new Object[i12];
                    objArr2[i14] = Integer.valueOf(iArr4[i11]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method2 = map.get(Integer.valueOf(i13));
                    if (method2 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 728);
                        byte b10 = (byte) i14;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        method2 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1833429914, method2);
                    }
                    iArr3[i11] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i11++;
                    iArr4 = iArr4;
                    i12 = 1;
                    i13 = 1833429914;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = setOnLongClickListener;
        if (iArr6 != null) {
            int i16 = $11 + 77;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i17 = 0;
            while (i17 < length) {
                Object[] objArr4 = {Integer.valueOf(iArr6[i17])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1833429914);
                if (method3 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(0), Color.argb(0, 0, 0, 0) + 44, 728 - ExpandableListView.getPackedPositionGroup(0L));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, b13, objArr5);
                    method3 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(1833429914, method3);
                }
                iArr2[i17] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                i17++;
                iArr6 = iArr6;
                length = length;
                cArr3 = cArr3;
            }
            cArr = cArr3;
            iArr6 = iArr2;
        } else {
            cArr = cArr3;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i18 = setonlongclicklistener.setDividerPadding;
            if (i18 >= iArr.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i19 = $10 + 1;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = iArr[i18];
            char c10 = (char) (i21 >> 16);
            cArr2[0] = c10;
            char c11 = (char) i21;
            cArr2[1] = c11;
            int i22 = iArr[i18 + 1];
            char c12 = (char) (i22 >> 16);
            cArr2[2] = c12;
            char c13 = (char) i22;
            cArr2[3] = c13;
            setonlongclicklistener.setY = (c10 << 16) + c11;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
            setOnLongClickListener.setX(iArr5);
            int i23 = 0;
            for (int i24 = 16; i23 < i24; i24 = 16) {
                int i25 = setonlongclicklistener.setY ^ iArr5[i23];
                setonlongclicklistener.setY = i25;
                Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i25)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object method4 = map3.get(-350984188);
                if (method4 == null) {
                    method4 = ((Class) setTextScaleX.setX((char) TextUtils.indexOf("", ""), 41 - ExpandableListView.getPackedPositionGroup(0L), KeyEvent.getDeadChar(0, 0) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i23++;
            }
            int i26 = setonlongclicklistener.setY;
            int i27 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i28 = i26 ^ iArr5[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i28;
            int i29 = i27 ^ iArr5[17];
            setonlongclicklistener.setY = i29;
            cArr2[0] = (char) (i29 >>> 16);
            cArr2[1] = (char) i29;
            cArr2[2] = (char) (i28 >>> 16);
            cArr2[3] = (char) i28;
            setOnLongClickListener.setX(iArr5);
            int i30 = setonlongclicklistener.setDividerPadding * 2;
            cArr[i30] = cArr2[0];
            cArr[i30 + 1] = cArr2[1];
            cArr[i30 + 2] = cArr2[2];
            cArr[i30 + 3] = cArr2[3];
            Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object obj = map4.get(-147294223);
            if (obj != null) {
                method = obj;
            } else {
                Class cls3 = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(0, 0), 41 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 483);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr8 = new Object[1];
                b(b14, (byte) (b15 + 1), b15, objArr8);
                method = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-147294223, method);
            }
            ((Method) method).invoke(null, objArr7);
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
            byte[] r0 = com.mypinpad.tsdk.isolation.ng.$$a
            int r9 = r9 * 4
            int r9 = r9 + 104
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r10 = r10 * 2
            int r10 = r10 + 1
            byte[] r1 = new byte[r10]
            r2 = 0
            if (r0 != 0) goto L1a
            r9 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r11
            r11 = r10
            goto L37
        L1a:
            r3 = r2
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r10) goto L2c
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r2)
            r11[r2] = r8
            return
        L2c:
            r3 = r0[r8]
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
            int r8 = r8 + r10
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
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ng.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{Constants.STATE_ERROR, -56, MessageUtils.MESSAGE_18_DC2, Constants.CVR_B1b85_0110_TERMINAL};
        $$b = 246;
    }

    public static void d() {
        setOnLongClickListener = new int[]{-83566930, 1255985762, 263226641, -1863366456, -649267992, -611673197, -1099496704, 972983009, 619449655, -907170097, 1635122229, -761667419, 1694537965, 576125125, 1633546106, 2115258870, -1663452239, -1644178686};
    }

    public static ng valueOf(String str) {
        int i10 = setLayoutAnimation + 11;
        setOnDragListener = i10 % 128;
        if (i10 % 2 != 0) {
            Enum.valueOf(ng.class, str);
            throw null;
        }
        ng ngVar = (ng) Enum.valueOf(ng.class, str);
        int i11 = setLayoutAnimation + 39;
        setOnDragListener = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 31 / 0;
        }
        return ngVar;
    }

    public static ng[] values() {
        int i10 = setLayoutAnimation + 119;
        setOnDragListener = i10 % 128;
        if (i10 % 2 == 0) {
            return (ng[]) setX.clone();
        }
        throw null;
    }
}
