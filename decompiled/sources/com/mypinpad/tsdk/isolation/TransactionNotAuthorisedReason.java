package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0011\u0010\u0005\u001a\u00020\u0002X\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/TransactionNotAuthorisedReason;", "", "", "setX", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setCompoundDrawableTintBlendMode", "setY", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1})
public final class TransactionNotAuthorisedReason {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char getNavBarTitleString;
    private static char setCompoundDrawableTintBlendMode;
    private static final /* synthetic */ TransactionNotAuthorisedReason[] setDividerPadding;
    private static int setLayoutAnimation;
    private static char setNavigationOnClickListener;
    private static char setOnDragListener;
    public static final TransactionNotAuthorisedReason setOnFocusChangeListener;
    private static int setOnLongClickListener;
    public static final TransactionNotAuthorisedReason setY;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    public int setCompoundDrawableTintBlendMode;

    static {
        c();
        $10 = 0;
        $11 = 1;
        setLayoutAnimation = 0;
        setOnLongClickListener = 1;
        d();
        Object[] objArr = new Object[1];
        a("乌紡\uabfb췠ᴑ⎱N\ue9bb", 9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        TransactionNotAuthorisedReason transactionNotAuthorisedReason = new TransactionNotAuthorisedReason(((String) objArr[0]).intern(), 0, 0);
        setY = transactionNotAuthorisedReason;
        Object[] objArr2 = new Object[1];
        a("柮\uec56뇛\u0efa", KeyEvent.keyCodeFromString("") + 3, objArr2);
        TransactionNotAuthorisedReason transactionNotAuthorisedReason2 = new TransactionNotAuthorisedReason(((String) objArr2[0]).intern(), 1, 1);
        setOnFocusChangeListener = transactionNotAuthorisedReason2;
        int i10 = setOnLongClickListener + 83;
        int i11 = i10 % 128;
        setLayoutAnimation = i11;
        TransactionNotAuthorisedReason[] transactionNotAuthorisedReasonArr = i10 % 2 != 0 ? new TransactionNotAuthorisedReason[]{transactionNotAuthorisedReason, transactionNotAuthorisedReason2} : new TransactionNotAuthorisedReason[]{transactionNotAuthorisedReason, transactionNotAuthorisedReason2};
        int i12 = i11 + 69;
        setOnLongClickListener = i12 % 128;
        int i13 = i12 % 2;
        setDividerPadding = transactionNotAuthorisedReasonArr;
        int i14 = i11 + 105;
        setOnLongClickListener = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 34 / 0;
        }
    }

    public TransactionNotAuthorisedReason(String str, int i10, int i11) {
        super(str, i10);
        this.setCompoundDrawableTintBlendMode = i11;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        int i13 = $11 + 95;
        $10 = i13 % 128;
        int i14 = 2;
        if (i13 % 2 != 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i15 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i16 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i17 = $11 + 45;
            $10 = i17 % 128;
            int i18 = 58224;
            if (i17 % i14 != 0) {
                cArr2[1] = charArray[i16];
                cArr2[1] = charArray[i16 % 0];
                i11 = 1;
            } else {
                cArr2[i15] = charArray[i16];
                cArr2[1] = charArray[i16 + 1];
                i11 = i15;
            }
            while (i11 < 16) {
                char c10 = cArr2[1];
                char c11 = cArr2[i15];
                char[] cArr3 = cArr2;
                int i19 = (c11 + i18) ^ ((c11 << 4) + ((char) (((long) getNavBarTitleString) ^ 4333817592127744003L)));
                int i20 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(setNavigationOnClickListener);
                    objArr2[i14] = Integer.valueOf(i20);
                    objArr2[1] = Integer.valueOf(i19);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48534 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 47, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2672);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) setCompoundDrawableTintBlendMode) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(setOnDragListener)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 48534), TextUtils.getOffsetBefore("", 0) + 47, TextUtils.getOffsetAfter("", 0) + 2672);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 -= 40503;
                    i11++;
                    cArr2 = cArr3;
                    i14 = 2;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr2;
            int i21 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i21] = cArr4[0];
            cArr[i21 + 1] = cArr4[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i12 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) View.resolveSize(0, 0), Process.getGidForName("") + 38, 2145 - View.getDefaultSize(0, 0));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, (byte) (b15 + 1), b15, objArr7);
                i12 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i12;
            cArr2 = cArr4;
            i15 = 0;
        }
    }

    public static void b(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = (i10 * 2) + 103;
        byte[] bArr = $$a;
        int i12 = 3 - (b10 * 4);
        int i13 = s4 * 4;
        byte[] bArr2 = new byte[i13 + 1];
        int i14 = -1;
        if (bArr == null) {
            int i15 = (-i12) + i13;
            i13 = i13;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = -1;
            i11 = i15;
            i12 = i12;
        }
        while (true) {
            int i16 = i12 + 1;
            int i17 = i14 + 1;
            bArr2[i17] = (byte) i11;
            if (i17 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b11 = bArr[i16];
            i13 = i13;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = i17;
            i11 = (-b11) + i11;
            i12 = i16;
        }
    }

    public static void c() {
        $$a = new byte[]{110, 102, -9, -112};
        $$b = 227;
    }

    public static void d() {
        setNavigationOnClickListener = (char) 59006;
        getNavBarTitleString = (char) 58694;
        setCompoundDrawableTintBlendMode = (char) 10699;
        setOnDragListener = (char) 17574;
    }

    public static TransactionNotAuthorisedReason valueOf(String str) {
        int i10 = setLayoutAnimation + 13;
        setOnLongClickListener = i10 % 128;
        int i11 = i10 % 2;
        TransactionNotAuthorisedReason transactionNotAuthorisedReason = (TransactionNotAuthorisedReason) Enum.valueOf(TransactionNotAuthorisedReason.class, str);
        int i12 = setOnLongClickListener + 109;
        setLayoutAnimation = i12 % 128;
        int i13 = i12 % 2;
        return transactionNotAuthorisedReason;
    }

    public static TransactionNotAuthorisedReason[] values() {
        int i10 = setLayoutAnimation + 57;
        setOnLongClickListener = i10 % 128;
        int i11 = i10 % 2;
        TransactionNotAuthorisedReason[] transactionNotAuthorisedReasonArr = (TransactionNotAuthorisedReason[]) setDividerPadding.clone();
        int i12 = setLayoutAnimation + 63;
        setOnLongClickListener = i12 % 128;
        if (i12 % 2 != 0) {
            return transactionNotAuthorisedReasonArr;
        }
        throw null;
    }
}
