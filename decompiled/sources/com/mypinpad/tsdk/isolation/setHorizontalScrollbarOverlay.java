package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0011\u0010\u0005\u001a\u00020\u0002X\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0003\u001a\u00020\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/mypinpad/tsdk/i/setHorizontalScrollbarOverlay;", "", "", "setDividerPadding", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setOnFocusChangeListener", "", "C", "setX", "setY", "setCompoundDrawableTintBlendMode", "setOnLongClickListener", "setOnDragListener", "getNavBarTitleString"}, k = 1, mv = {1, 5, 1})
public final class setHorizontalScrollbarOverlay {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean UiMessageCallbackKtWhenMappings;
    private static setHorizontalScrollbarOverlay getNavBarTitleString;
    private static int setAlwaysDrawnWithCacheEnabled;
    public static final setHorizontalScrollbarOverlay setCompoundDrawableTintBlendMode;
    private static int setIncludeFontPadding;
    private static char[] setLayoutAnimation;
    private static final /* synthetic */ setHorizontalScrollbarOverlay[] setNavigationOnClickListener;
    public static final setHorizontalScrollbarOverlay setOnDragListener;
    public static final setHorizontalScrollbarOverlay setOnLongClickListener;
    private static boolean setTextAlignment;
    public static final setHorizontalScrollbarOverlay setX;
    public static final setHorizontalScrollbarOverlay setY;
    private static int setZ;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    public int setOnFocusChangeListener;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    public char setDividerPadding;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setZ = 0;
        setAlwaysDrawnWithCacheEnabled = 1;
        setCompoundDrawableTintBlendMode();
        Object[] objArr = new Object[1];
        a(127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0082\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = new setHorizontalScrollbarOverlay(((String) objArr[0]).intern(), 0, 2, 'V');
        setX = sethorizontalscrollbaroverlay;
        Object[] objArr2 = new Object[1];
        a(127 - ExpandableListView.getPackedPositionGroup(0L), "\u0089\u0088\u0084\u0082\u0087", objArr2);
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay2 = new setHorizontalScrollbarOverlay(((String) objArr2[0]).intern(), 1, 3, 'D');
        setY = sethorizontalscrollbaroverlay2;
        Object[] objArr3 = new Object[1];
        a(127 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0085\u008c\u008b\u008a", objArr3);
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay3 = new setHorizontalScrollbarOverlay(((String) objArr3[0]).intern(), 2, 4, 'I');
        setCompoundDrawableTintBlendMode = sethorizontalscrollbaroverlay3;
        Object[] objArr4 = new Object[1];
        a(Process.getGidForName("") + 128, "\u008b\u0083\u008e\u008d", objArr4);
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay4 = new setHorizontalScrollbarOverlay(((String) objArr4[0]).intern(), 3, 5, 'W');
        setOnLongClickListener = sethorizontalscrollbaroverlay4;
        Object[] objArr5 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "\u0083\u0085\u0083\u0083\u0082", objArr5);
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay5 = new setHorizontalScrollbarOverlay(((String) objArr5[0]).intern(), 4, 6, 'E');
        setOnDragListener = sethorizontalscrollbaroverlay5;
        Object[] objArr6 = new Object[1];
        a(128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u008f\u0083\u0082\u0086\u0086\u008e", objArr6);
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay6 = new setHorizontalScrollbarOverlay(((String) objArr6[0]).intern(), 5, 7, 'A');
        getNavBarTitleString = sethorizontalscrollbaroverlay6;
        int i10 = setAlwaysDrawnWithCacheEnabled + 37;
        int i11 = i10 % 128;
        setZ = i11;
        int i12 = i10 % 2;
        setHorizontalScrollbarOverlay[] sethorizontalscrollbaroverlayArr = {sethorizontalscrollbaroverlay, sethorizontalscrollbaroverlay2, sethorizontalscrollbaroverlay3, sethorizontalscrollbaroverlay4, sethorizontalscrollbaroverlay5, sethorizontalscrollbaroverlay6};
        int i13 = i11 + 1;
        int i14 = i13 % 128;
        setAlwaysDrawnWithCacheEnabled = i14;
        if (i13 % 2 == 0) {
            throw null;
        }
        setNavigationOnClickListener = sethorizontalscrollbaroverlayArr;
        int i15 = i14 + 95;
        setZ = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 33 / 0;
        }
    }

    public setHorizontalScrollbarOverlay(String str, int i10, int i11, char c10) {
        super(str, i10);
        this.setOnFocusChangeListener = i11;
        this.setDividerPadding = c10;
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i11;
        int i12 = $10 + 29;
        int i13 = i12 % 128;
        $11 = i13;
        int i14 = i12 % 2;
        int i15 = i13 + 107;
        $10 = i15 % 128;
        if (i15 % 2 != 0) {
            str.getBytes("ISO-8859-1");
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr2 = setLayoutAnimation;
        if (cArr2 != null) {
            int i16 = $10 + 95;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i11 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i11 = 0;
            }
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (26288 - KeyEvent.getDeadChar(0, 0)), TextUtils.getTrimmedLength("") + 64, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1594);
                        byte b10 = (byte) (-$$a[3]);
                        Object[] objArr3 = new Object[1];
                        b((byte) 0, b10, (byte) (b10 - 3), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr[i11] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i11++;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        Object[] objArr4 = {Integer.valueOf(setIncludeFontPadding)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((KeyEvent.getMaxKeyCode() >> 16) + 10744), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43, Gravity.getAbsoluteGravity(0, 0) + 566);
            byte b11 = (byte) 0;
            byte b12 = (byte) (b11 + 1);
            Object[] objArr5 = new Object[1];
            b(b11, b12, (byte) (-b12), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!setTextAlignment) {
            if (!UiMessageCallbackKtWhenMappings) {
                throw null;
            }
            int i17 = $11 + 15;
            $10 = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
            throw null;
        }
        int i18 = $11 + 15;
        $10 = i18 % 128;
        int i19 = i18 % 2;
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i20 = setz.setDividerPadding;
            int i21 = setz.setOnFocusChangeListener;
            if (i20 >= i21) {
                break;
            }
            cArr3[i20] = (char) (cArr2[bytes[(i21 - 1) - i20] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), View.resolveSize(0, 0) + 51, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2880);
                byte b13 = (byte) 0;
                byte b14 = b13;
                Object[] objArr7 = new Object[1];
                b(b13, b14, (byte) (b14 - 1), objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
        String str2 = new String(cArr3);
        int i22 = $10 + 125;
        $11 = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 * 2
            int r7 = 122 - r7
            byte[] r1 = com.mypinpad.tsdk.isolation.setHorizontalScrollbarOverlay.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L1a
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L36
        L1a:
            r3 = r2
        L1b:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setHorizontalScrollbarOverlay.b(int, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{109, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 25, -2};
        $$b = 139;
    }

    public static void setCompoundDrawableTintBlendMode() {
        UiMessageCallbackKtWhenMappings = true;
        setTextAlignment = true;
        setIncludeFontPadding = 1794962106;
        setLayoutAnimation = new char[]{61968, 62177, 62188, 62204, 62187, 62191, 62206, 61969, 62179, 62181, 62184, 62176, 61971, 62205, 62190};
    }

    public static setHorizontalScrollbarOverlay valueOf(String str) {
        int i10 = setZ + 35;
        setAlwaysDrawnWithCacheEnabled = i10 % 128;
        int i11 = i10 % 2;
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = (setHorizontalScrollbarOverlay) Enum.valueOf(setHorizontalScrollbarOverlay.class, str);
        if (i11 == 0) {
            int i12 = 5 / 0;
        }
        return sethorizontalscrollbaroverlay;
    }

    public static setHorizontalScrollbarOverlay[] values() {
        int i10 = setZ + 29;
        setAlwaysDrawnWithCacheEnabled = i10 % 128;
        int i11 = i10 % 2;
        setHorizontalScrollbarOverlay[] sethorizontalscrollbaroverlayArr = (setHorizontalScrollbarOverlay[]) setNavigationOnClickListener.clone();
        int i12 = setAlwaysDrawnWithCacheEnabled + 57;
        setZ = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 73 / 0;
        }
        return sethorizontalscrollbaroverlayArr;
    }
}
