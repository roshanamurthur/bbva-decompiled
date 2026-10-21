package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TransactionApproved implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f51891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f51892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f51895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f51896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f51897i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final deactivate f51898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f51899b;

    static {
        c();
        f51895g = 0;
        f51896h = 1;
        f51893e = 0;
        f51894f = 1;
        f51892d = (char) 53957;
        f51891c = new char[]{59188, 59181, 59198, 59193, 59176, 59196, 59190, 59179, 59194, 59199, 59183, 59191, 59186, 59140, 59192, 59189};
    }

    public TransactionApproved(@NotNull deactivate deactivateVar) {
        Intrinsics.checkNotNullParameter(deactivateVar, "");
        this.f51898a = deactivateVar;
        this.f51899b = getTransactionPortrait.setCompoundDrawableTintBlendMode;
    }

    public static void a(int i10, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f51895g + 125;
        f51896h = i12 % 128;
        int i13 = i12 % 2;
        char[] charArray = "\n\u0001\u0002\u0003\b\u0003\u0004\u0007\u0003\u000e\t\u000e\u0006\u0000㙟㙟\r\f\u0006\u0005\u000e\u0001\f\u000b\u0007\u000f\u0001\n".toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f51891c;
        int i14 = 290255894;
        float f6 = 0.0f;
        int i15 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i15] = Integer.valueOf(cArr[i16]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i14));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), 45 - (PointF.length(f6, f6) > f6 ? 1 : (PointF.length(f6, f6) == f6 ? 0 : -1)), (Process.myTid() >> 22) + 1116);
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b12, b12, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16++;
                    i14 = 290255894;
                    f6 = 0.0f;
                    i15 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f51892d)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45, 1116 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            b(b14, b14, b13, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i17 = f51895g + 85;
            f51896h = i17 % 128;
            int i18 = i17 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i19 = f51896h + 45;
            f51895g = i19 % 128;
            int i20 = i19 % 2;
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i21 = setincludefontpadding.setDividerPadding;
                if (i21 >= i11) {
                    break;
                }
                char c10 = charArray[i21];
                setincludefontpadding.setY = c10;
                int i22 = i21 + 1;
                char c11 = charArray[i22];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    int i23 = f51896h + 23;
                    f51895g = i23 % 128;
                    int i24 = i23 % 2;
                    cArr3[i21] = (char) (c10 - b10);
                    cArr3[i22] = (char) (c11 - b10);
                } else {
                    Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 27, 2311 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        b((byte) (b16 + 3), b16, b15, objArr7);
                        String str = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i25 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i25) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf("", "") + 49103), 35 - View.combineMeasuredStates(0, 0), 2545 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            byte b17 = (byte) 0;
                            byte b18 = b17;
                            Object[] objArr9 = new Object[1];
                            b((byte) (b18 | 7), b18, b17, objArr9);
                            String str2 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i26 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i27 = setincludefontpadding.setDividerPadding;
                        cArr3[i27] = cArr[iIntValue2];
                        cArr3[i27 + 1] = cArr[i26];
                    } else {
                        int i28 = setincludefontpadding.setX;
                        int i29 = setincludefontpadding.setOnFocusChangeListener;
                        if (i28 == i29) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i25, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i30 = (i29 * cCharValue) + iA2;
                            int i31 = setincludefontpadding.setDividerPadding;
                            cArr3[i31] = cArr[(i28 * cCharValue) + iA];
                            cArr3[i31 + 1] = cArr[i30];
                        } else {
                            int i32 = (i28 * cCharValue) + i25;
                            int i33 = (i29 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i34 = setincludefontpadding.setDividerPadding;
                            cArr3[i34] = cArr[i32];
                            cArr3[i34 + 1] = cArr[i33];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                int i35 = f51895g + 67;
                f51896h = i35 % 128;
                int i36 = i35 % 2;
            }
        }
        int i37 = f51895g + 71;
        f51896h = i37 % 128;
        int i38 = i37 % 2;
        int i39 = 0;
        while (i39 < i10) {
            cArr3[i39] = (char) (cArr3[i39] ^ 13722);
            i39++;
            int i40 = f51896h + 33;
            f51895g = i40 % 128;
            int i41 = i40 % 2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r6 = r6 + 99
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.TransactionApproved.f51897i
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L30:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.TransactionApproved.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f51897i = new byte[]{107, -84, 8, 70};
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        int i10 = f51894f + 95;
        f51893e = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f51899b;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c1, code lost:
    
        if ((r0 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d2, code lost:
    
        return (com.mypinpad.tsdk.isolation.setAutoSizeTextTypeUniformWithPresetSizes) com.mypinpad.tsdk.isolation.setPersistentDrawingCache.setDividerPadding(new java.lang.Object[]{r12}, -2060556907, 2060556908, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d3, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.setAutoSizeTextTypeUniformWithPresetSizes) com.mypinpad.tsdk.isolation.setPersistentDrawingCache.setDividerPadding(new java.lang.Object[]{r12}, -2060556907, 2060556908, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e3, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.setAutoSizeTextTypeUniformWithPresetSizes) com.mypinpad.tsdk.isolation.setPersistentDrawingCache.setDividerPadding(new java.lang.Object[]{r12, java.lang.Integer.valueOf(((java.lang.Integer) com.mypinpad.tsdk.i.deactivate.setY.setOnFocusChangeListener(new java.lang.Object[]{r0}, 770353159, -770353159, java.lang.System.identityHashCode(r0))).intValue())}, 728146901, -728146899, (int) java.lang.System.currentTimeMillis());
        r3 = com.mypinpad.tsdk.isolation.TransactionApproved.f51894f + 17;
        com.mypinpad.tsdk.isolation.TransactionApproved.f51893e = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0119, code lost:
    
        if ((r3 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x011b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0065, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.i.deactivate.setY.setOnFocusChangeListener(new java.lang.Object[]{r0}, 770353159, -770353159, java.lang.System.identityHashCode(r0))).intValue() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b0, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.i.deactivate.setY.setOnFocusChangeListener(new java.lang.Object[]{r0}, 770353159, -770353159, java.lang.System.identityHashCode(r0))).intValue() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b2, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.TransactionApproved.f51893e + 125;
        com.mypinpad.tsdk.isolation.TransactionApproved.f51894f = r0 % 128;
     */
    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mypinpad.tsdk.isolation.setAutoSizeTextTypeUniformWithPresetSizes setX() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.TransactionApproved.setX():com.mypinpad.tsdk.i.setAutoSizeTextTypeUniformWithPresetSizes");
    }
}
