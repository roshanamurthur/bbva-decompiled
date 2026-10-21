package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'setX' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\u0005j\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/setForegroundGravity;", "", "", "setY", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setCompoundDrawableTintBlendMode", "()I", "setX", "setOnFocusChangeListener", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class setForegroundGravity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] getNavBarTitleString;
    public static final setForegroundGravity setCompoundDrawableTintBlendMode;
    public static final setForegroundGravity setDividerPadding;
    private static boolean setLayoutAnimation;
    private static boolean setNavigationOnClickListener;
    private static int setOnDragListener;
    public static final setForegroundGravity setOnFocusChangeListener;
    private static final /* synthetic */ setForegroundGravity[] setOnLongClickListener;
    private static int setTextAlignment;
    public static final setForegroundGravity setX;
    private static int setZ;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    private final int setCompoundDrawableTintBlendMode;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setZ = 0;
        setTextAlignment = 1;
        d();
        Object[] objArr = new Object[1];
        a((Process.myPid() >> 22) + 127, "\u0086\u0085\u0085\u0084\u0083\u0082\u0081", objArr);
        setForegroundGravity setforegroundgravity = new setForegroundGravity(((String) objArr[0]).intern(), 0, 224);
        setX = setforegroundgravity;
        Object[] objArr2 = new Object[1];
        a(127 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0088\u0087\u0085\u0084\u0083\u0082\u0081", objArr2);
        setForegroundGravity setforegroundgravity2 = new setForegroundGravity(((String) objArr2[0]).intern(), 1, 256);
        setOnFocusChangeListener = setforegroundgravity2;
        Object[] objArr3 = new Object[1];
        a(127 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0086\u008a\u0089\u0084\u0083\u0082\u0081", objArr3);
        setForegroundGravity setforegroundgravity3 = new setForegroundGravity(((String) objArr3[0]).intern(), 2, BluetoothState.REQUEST_CONNECT_DEVICE);
        setCompoundDrawableTintBlendMode = setforegroundgravity3;
        Object[] objArr4 = new Object[1];
        a(126 - Process.getGidForName(""), "\u0085\u008b\u0087\u0084\u0083\u0082\u0081", objArr4);
        setForegroundGravity setforegroundgravity4 = new setForegroundGravity(((String) objArr4[0]).intern(), 3, 512);
        setDividerPadding = setforegroundgravity4;
        int i10 = setZ + 39;
        int i11 = i10 % 128;
        setTextAlignment = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 15;
        setZ = i13 % 128;
        int i14 = i13 % 2;
        setOnLongClickListener = new setForegroundGravity[]{setforegroundgravity, setforegroundgravity2, setforegroundgravity3, setforegroundgravity4};
        int i15 = i11 + 99;
        setZ = i15 % 128;
        int i16 = i15 % 2;
    }

    public setForegroundGravity(String str, int i10, int i11) {
        super(str, i10);
        this.setCompoundDrawableTintBlendMode = i11;
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = getNavBarTitleString;
        int i11 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 26289), 63 - TextUtils.lastIndexOf("", '0', 0, 0), 1595 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b10 = (byte) i11;
                        byte b11 = (byte) (b10 - 2);
                        Object[] objArr3 = new Object[1];
                        b(b11, b11, b10, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12++;
                    i11 = 2;
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
        Object[] objArr4 = {Integer.valueOf(setOnDragListener)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((Process.myPid() >> 22) + 10744), (ViewConfiguration.getTapTimeout() >> 16) + 43, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 566);
            byte b12 = (byte) 1;
            byte b13 = (byte) (b12 - 1);
            Object[] objArr5 = new Object[1];
            b(b13, b13, b12, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!setLayoutAnimation) {
            if (!setNavigationOnClickListener) {
                throw null;
            }
            int i13 = $10 + 55;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            throw null;
        }
        int i15 = $11 + 43;
        $10 = i15 % 128;
        int i16 = i15 % 2;
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i17 = setz.setDividerPadding;
            int i18 = setz.setOnFocusChangeListener;
            if (i17 >= i18) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i17] = (char) (cArr[bytes[(i18 - 1) - i17] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 51, 2880 - TextUtils.indexOf("", "", 0, 0));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, b15, b14, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 122 - r8
            byte[] r0 = com.mypinpad.tsdk.isolation.setForegroundGravity.$$a
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r8
            r3 = r2
            r8 = r7
            r7 = r6
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setForegroundGravity.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{22, 117, -35, 69};
        $$b = 188;
    }

    public static void d() {
        setNavigationOnClickListener = true;
        setLayoutAnimation = true;
        setOnDragListener = 1794962061;
        getNavBarTitleString = new char[]{62206, 62197, 62156, 62186, 62175, 62145, 62144, 62147, 62174, 62149, 62172};
    }

    public static setForegroundGravity valueOf(String str) {
        int i10 = setTextAlignment + 75;
        setZ = i10 % 128;
        if (i10 % 2 != 0) {
            Enum.valueOf(setForegroundGravity.class, str);
            throw null;
        }
        setForegroundGravity setforegroundgravity = (setForegroundGravity) Enum.valueOf(setForegroundGravity.class, str);
        int i11 = setZ + 43;
        setTextAlignment = i11 % 128;
        int i12 = i11 % 2;
        return setforegroundgravity;
    }

    public static setForegroundGravity[] values() {
        int i10 = setZ + 93;
        setTextAlignment = i10 % 128;
        int i11 = i10 % 2;
        setForegroundGravity[] setforegroundgravityArr = (setForegroundGravity[]) setOnLongClickListener.clone();
        int i12 = setZ + 113;
        setTextAlignment = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 57 / 0;
        }
        return setforegroundgravityArr;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final int setCompoundDrawableTintBlendMode() {
        int i10 = setTextAlignment + 15;
        setZ = i10 % 128;
        if (i10 % 2 == 0) {
            return this.setCompoundDrawableTintBlendMode;
        }
        throw null;
    }
}
