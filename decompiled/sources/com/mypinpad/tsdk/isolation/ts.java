package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/ts;", "", "setDividerPadding", "setOnFocusChangeListener"}, k = 1, mv = {1, 8, 0})
public final class ts {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean getNavBarTitleString;
    private static int setCompoundDrawableTintBlendMode;
    public static final ts setDividerPadding;
    private static int setLayoutAnimation;
    private static boolean setNavigationOnClickListener;
    public static final ts setOnFocusChangeListener;
    private static int setOnLongClickListener;
    private static char[] setX;
    private static final /* synthetic */ ts[] setY;

    static {
        ts[] tsVarArr;
        c();
        $10 = 0;
        $11 = 1;
        setLayoutAnimation = 0;
        setOnLongClickListener = 1;
        d();
        Object[] objArr = new Object[1];
        a(127 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0084\u0083\u0082\u0081", objArr);
        ts tsVar = new ts(((String) objArr[0]).intern(), 0);
        setDividerPadding = tsVar;
        Object[] objArr2 = new Object[1];
        a(127 - TextUtils.indexOf("", "", 0), "\u0082\u0084\u0087\u0085\u0088\u0081\u0087\u0086\u0085", objArr2);
        ts tsVar2 = new ts(((String) objArr2[0]).intern(), 1);
        setOnFocusChangeListener = tsVar2;
        int i10 = setLayoutAnimation;
        int i11 = i10 + 63;
        setOnLongClickListener = i11 % 128;
        if (i11 % 2 == 0) {
            tsVarArr = new ts[3];
            tsVarArr[1] = tsVar;
            tsVarArr[0] = tsVar2;
        } else {
            tsVarArr = new ts[]{tsVar, tsVar2};
        }
        int i12 = i10 + 41;
        int i13 = i12 % 128;
        setOnLongClickListener = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        setY = tsVarArr;
        int i14 = i13 + 43;
        setLayoutAnimation = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 79 / 0;
        }
    }

    public ts() {
        throw null;
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = setX;
        int i11 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                int i13 = $10 + 85;
                $11 = i13 % 128;
                int i14 = i13 % i11;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (26288 - (ViewConfiguration.getScrollBarSize() >> 8)), 64 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1594);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, (byte) (b11 + 2), b11, objArr3);
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
        Object[] objArr4 = {Integer.valueOf(setCompoundDrawableTintBlendMode)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (KeyEvent.keyCodeFromString("") + 10744), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42, 566 - (KeyEvent.getMaxKeyCode() >> 16));
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr5 = new Object[1];
            b(b12, (byte) (b13 + 1), b13, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!setNavigationOnClickListener) {
            if (!getNavBarTitleString) {
                throw null;
            }
            int i15 = $11 + 55;
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i16 = setz.setDividerPadding;
            int i17 = setz.setOnFocusChangeListener;
            if (i16 >= i17) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i16] = (char) (cArr[bytes[(i17 - 1) - i16] + i10] - iIntValue);
            Object[] objArr6 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) Color.red(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, ((byte) KeyEvent.getModifierMetaStateMask()) + 2881);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 * 2
            int r7 = 122 - r7
            byte[] r0 = com.mypinpad.tsdk.isolation.ts.$$a
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ts.b(byte, byte, short, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{Constants.CVR_B1b85_0110_TERMINAL, UtilitiesSDKConstants.SRP_LABEL_ENC, -21, -9};
        $$b = ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND;
    }

    public static void d() {
        getNavBarTitleString = true;
        setNavigationOnClickListener = true;
        setCompoundDrawableTintBlendMode = 1794962101;
        setX = new char[]{62204, 62201, 62177, 62200, 62196, 62198, 62185, 62187};
    }

    public static ts valueOf(String str) {
        int i10 = setOnLongClickListener + 85;
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        ts tsVar = (ts) Enum.valueOf(ts.class, str);
        int i12 = setLayoutAnimation + 51;
        setOnLongClickListener = i12 % 128;
        int i13 = i12 % 2;
        return tsVar;
    }

    public static ts[] values() {
        int i10 = setOnLongClickListener + 87;
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        ts[] tsVarArr = (ts[]) setY.clone();
        int i12 = setOnLongClickListener + 69;
        setLayoutAnimation = i12 % 128;
        int i13 = i12 % 2;
        return tsVarArr;
    }
}
