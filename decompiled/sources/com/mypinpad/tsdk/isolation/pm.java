package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pm extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f57725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f57726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f57727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f57728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f57729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f57730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f57731t = null;

    @NotNull
    public final UUID m;

    static {
        b();
        f57729r = 0;
        f57730s = 1;
        f57725n = 1333026070;
        f57726o = -1454817106;
        f57727p = -777052904;
        f57728q = new byte[]{-106, 105, -112, 118, -109, 101, 107, -77, 45, -110, -99, 123, -91, 69, -112, -105, GenerateAcResponseApdu.DDA_HEADER, 105, -74, 118, -111, -100, 110, UtilitiesSDKConstants.SRP_LABEL_MAC, 92, -109, -118, -108};
    }

    public pm(@NotNull UUID uuid) throws Throwable {
        Class<?> cls;
        short s4;
        int i10;
        int i11;
        int i12;
        Object method;
        byte[] bArr;
        int i13;
        int i14;
        byte[] bArr2;
        Class<?> cls2 = Object.class;
        Intrinsics.checkNotNullParameter(uuid, "");
        short s7 = (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        int iIndexOf = TextUtils.indexOf("", "", 0, 0) - 30;
        int iIndexOf2 = TextUtils.indexOf("", "", 0) - 2028363064;
        int size = 432202366 - View.MeasureSpec.getSize(0);
        byte b10 = (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
        int i15 = f57726o;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr = {Integer.valueOf(iIndexOf), Integer.valueOf(i15)};
            Map map = setTextScaleX.setMaxEms;
            Object method2 = map.get(-769569468);
            if (method2 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getWindowTouchSlop() >> 8) + 49, View.MeasureSpec.makeMeasureSpec(0, 0) + 434);
                byte b11 = (byte) 0;
                byte b12 = (byte) (b11 - 1);
                Object[] objArr2 = new Object[1];
                c(b11, b12, (byte) (b12 + 1), objArr2);
                String str = (String) objArr2[0];
                Class<?> cls4 = Integer.TYPE;
                method2 = cls3.getMethod(str, cls4, cls4);
                map.put(-769569468, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr)).intValue();
            boolean z10 = iIntValue == -1;
            int i16 = f57725n;
            byte[] bArr3 = f57728q;
            if (z10) {
                if (bArr3 != null) {
                    int length = bArr3.length;
                    bArr2 = new byte[length];
                    int i17 = 0;
                    while (i17 < length) {
                        int i18 = f57730s + 79;
                        f57729r = i18 % 128;
                        if (i18 % 2 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr3[i17])};
                            Map map2 = setTextScaleX.setMaxEms;
                            Object method3 = map2.get(510767826);
                            if (method3 == null) {
                                method3 = ((Class) setTextScaleX.setX((char) (49110 - MotionEvent.axisFromString("")), 41 - ExpandableListView.getPackedPositionGroup(0L), 52 - View.MeasureSpec.getSize(0))).getMethod("s", Integer.TYPE);
                                map2.put(510767826, method3);
                            }
                            bArr2[i17] = ((Byte) ((Method) method3).invoke(null, objArr3)).byteValue();
                        } else {
                            cls2 = cls2;
                            iIndexOf2 = iIndexOf2;
                            Object[] objArr4 = {Integer.valueOf(bArr3[i17])};
                            Map map3 = setTextScaleX.setMaxEms;
                            Object method4 = map3.get(510767826);
                            if (method4 == null) {
                                method4 = ((Class) setTextScaleX.setX((char) (Color.green(0) + 49111), View.getDefaultSize(0, 0) + 41, View.MeasureSpec.makeMeasureSpec(0, 0) + 52)).getMethod("s", Integer.TYPE);
                                map3.put(510767826, method4);
                            }
                            bArr2[i17] = ((Byte) ((Method) method4).invoke(null, objArr4)).byteValue();
                        }
                        i17++;
                        length = length;
                        s7 = s7;
                        cls2 = cls2;
                        iIndexOf2 = iIndexOf2;
                    }
                    cls = cls2;
                    s4 = s7;
                    i10 = iIndexOf2;
                } else {
                    cls = cls2;
                    s4 = s7;
                    i10 = iIndexOf2;
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                Object[] objArr5 = {Integer.valueOf(size), Integer.valueOf(i16)};
                Map map4 = setTextScaleX.setMaxEms;
                Object method5 = map4.get(-769569468);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((-1) - Process.getGidForName("")), (KeyEvent.getMaxKeyCode() >> 16) + 49, 434 - View.MeasureSpec.getMode(0));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    c(b13, b14, (byte) (b14 + 1), objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls6 = Integer.TYPE;
                    method5 = cls5.getMethod(str2, cls6, cls6);
                    map4.put(-769569468, method5);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method5).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i15) ^ 7616081452308447380L)));
            } else {
                cls = cls2;
                s4 = s7;
                i10 = iIndexOf2;
            }
            if (iIntValue > 0) {
                int i19 = ((size + iIntValue) - 2) + ((int) (((long) i16) ^ 7616081452308447380L));
                if (z10) {
                    int i20 = f57729r + 71;
                    f57730s = i20 % 128;
                    int i21 = i20 % 2;
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                settextalignment.setX = i19 + i11;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i10), Integer.valueOf(f57727p), sb2};
                Map map5 = setTextScaleX.setMaxEms;
                Object obj = map5.get(193260760);
                if (obj != null) {
                    i12 = 0;
                    method = obj;
                } else {
                    Class cls7 = (Class) setTextScaleX.setX((char) View.resolveSizeAndState(0, 0, 0), 41 - ImageFormat.getBitsPerPixel(0), (KeyEvent.getMaxKeyCode() >> 16) + 2803);
                    i12 = 0;
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr8 = new Object[1];
                    c(b15, b16, (byte) (-b16), objArr8);
                    String str3 = (String) objArr8[0];
                    Class<?> cls8 = Integer.TYPE;
                    method = cls7.getMethod(str3, cls, cls8, cls8, cls);
                    map5.put(193260760, method);
                }
                ((StringBuilder) ((Method) method).invoke(null, objArr7)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr = new byte[length2];
                    for (int i22 = i12; i22 < length2; i22++) {
                        bArr[i22] = (byte) (((long) bArr3[i22]) ^ 7616081452308447380L);
                    }
                } else {
                    bArr = bArr3;
                }
                if (bArr != null) {
                    int i23 = f57730s + 109;
                    f57729r = i23 % 128;
                    int i24 = i23 % 2;
                    i14 = 1;
                    i13 = 1;
                } else {
                    i13 = i12;
                    i14 = 1;
                }
                settextalignment.setDividerPadding = i14;
                while (settextalignment.setDividerPadding < iIntValue) {
                    if ((i13 ^ 1) != 0) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i25 = settextalignment.setX;
                    settextalignment.setX = i25 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i25]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    settextalignment.setDividerPadding++;
                }
            }
            super(null, sb2.toString().intern(), null, 0L, 13, null);
            this.m = uuid;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void b() {
        f57731t = new byte[]{122, -107, 66, -93};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r8 = r8 * 3
            int r8 = r8 + 109
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.pm.f57731t
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L35
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L35:
            int r6 = -r6
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pm.c(int, int, int, java.lang.Object[]):void");
    }

    @NotNull
    public final UUID setCompoundDrawableTintBlendMode() {
        return this.m;
    }
}
