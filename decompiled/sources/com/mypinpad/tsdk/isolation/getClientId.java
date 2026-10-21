package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getClientId extends setVerticalScrollbarTrackDrawable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int[] f55735t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f55736u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f55737w0 = null;

    static {
        b();
        f55736u0 = 0;
        v0 = 1;
        f55735t0 = new int[]{35288747, -1605627265, -1613682437, -677744295, 346702932, -1358090720, 1818181081, -1280955448, 20709621, 585603638, -1651749020, -1317550698, 272995330, -739075380, 1180484458, 749658699, 1269465437, 686715653};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getClientId(@NotNull byte[] bArr, int i10) throws Throwable {
        int i11;
        int[] iArr;
        char[] cArr;
        Object method;
        Object method2;
        Object method3;
        super(bArr);
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 80) {
            return;
        }
        int[] iArr2 = {-691234626, 981365279, -1543658426, -449701049, -421764806, 1452221516, 408214044, -2061328627, -1603586218, 1508473761};
        int i12 = 0;
        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 20;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[20];
        int i13 = 2;
        int i14 = 16;
        int i15 = 1;
        int[] iArr3 = f55735t0;
        if (iArr3 != null) {
            int length = iArr3.length;
            iArr = new int[length];
            int i16 = 0;
            while (i16 < length) {
                int i17 = f55736u0 + 35;
                v0 = i17 % 128;
                if (i17 % i13 == 0) {
                    try {
                        Object[] objArr = new Object[i15];
                        objArr[i12] = Integer.valueOf(iArr3[i16]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method4 = map.get(1833429914);
                        if (method4 == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> i14), ExpandableListView.getPackedPositionGroup(0L) + 44, 728 - View.resolveSizeAndState(i12, i12, i12));
                            byte b10 = (byte) 1;
                            byte b11 = (byte) (-b10);
                            Object[] objArr2 = new Object[1];
                            a(b10, (byte) (b11 + 1), b11, objArr2);
                            method4 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(1833429914, method4);
                        }
                        iArr[i16] = ((Integer) ((Method) method4).invoke(null, objArr)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    iIndexOf = iIndexOf;
                    length = length;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i16])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method5 = map2.get(1833429914);
                    if (method5 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) Color.blue(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, 728 - Gravity.getAbsoluteGravity(0, 0));
                        byte b12 = (byte) 1;
                        byte b13 = (byte) (-b12);
                        Object[] objArr4 = new Object[1];
                        a(b12, (byte) (b13 + 1), b13, objArr4);
                        method5 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                        map2.put(1833429914, method5);
                    }
                    iArr[i16] = ((Integer) ((Method) method5).invoke(null, objArr3)).intValue();
                    i16++;
                }
                length = length;
                iIndexOf = iIndexOf;
                i12 = 0;
                i13 = 2;
                i14 = 16;
                i15 = 1;
            }
            i11 = iIndexOf;
        } else {
            i11 = iIndexOf;
            iArr = iArr3;
        }
        int length2 = iArr.length;
        int[] iArr4 = new int[length2];
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int i18 = 0;
            while (i18 < length3) {
                int i19 = f55736u0 + 1;
                v0 = i19 % 128;
                int i20 = i19 % 2;
                Object[] objArr5 = {Integer.valueOf(iArr3[i18])};
                Map map3 = setTextScaleX.setMaxEms;
                Object method6 = map3.get(1833429914);
                if (method6 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 44, ((Process.getThreadPriority(0) + 20) >> 6) + 728);
                    byte b14 = (byte) 1;
                    byte b15 = (byte) (-b14);
                    Object[] objArr6 = new Object[1];
                    a(b14, (byte) (b15 + 1), b15, objArr6);
                    method6 = cls3.getMethod((String) objArr6[0], Integer.TYPE);
                    map3.put(1833429914, method6);
                }
                iArr5[i18] = ((Integer) ((Method) method6).invoke(null, objArr5)).intValue();
                i18++;
                length3 = length3;
                iArr3 = iArr3;
                cArr3 = cArr3;
            }
            cArr = cArr3;
            iArr3 = iArr5;
        } else {
            cArr = cArr3;
        }
        System.arraycopy(iArr3, 0, iArr4, 0, length2);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i21 = setonlongclicklistener.setDividerPadding;
            if (i21 >= 10) {
                throw new IllegalArgumentException(new String(cArr, 0, i11).intern().toString());
            }
            int i22 = v0 + 117;
            f55736u0 = i22 % 128;
            int i23 = i22 % 2;
            int i24 = iArr2[i21];
            char c10 = (char) (i24 >> 16);
            cArr2[0] = c10;
            char c11 = (char) i24;
            cArr2[1] = c11;
            int i25 = iArr2[i21 + 1];
            char c12 = (char) (i25 >> 16);
            cArr2[2] = c12;
            char c13 = (char) i25;
            cArr2[3] = c13;
            setonlongclicklistener.setY = (c10 << 16) + c11;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
            setOnLongClickListener.setX(iArr4);
            int i26 = 0;
            for (int i27 = 16; i26 < i27; i27 = 16) {
                int i28 = v0 + 69;
                f55736u0 = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = setonlongclicklistener.setY ^ iArr4[i26];
                    setonlongclicklistener.setY = i29;
                    Object[] objArr7 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i29)), setonlongclicklistener, setonlongclicklistener};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object obj = map4.get(-350984188);
                    if (obj != null) {
                        method3 = obj;
                    } else {
                        method3 = ((Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 41, 181 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map4.put(-350984188, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr7)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                    i26 += 68;
                } else {
                    int i30 = setonlongclicklistener.setY ^ iArr4[i26];
                    setonlongclicklistener.setY = i30;
                    Object[] objArr8 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i30)), setonlongclicklistener, setonlongclicklistener};
                    Map map5 = setTextScaleX.setMaxEms;
                    Object obj2 = map5.get(-350984188);
                    if (obj2 != null) {
                        method2 = obj2;
                    } else {
                        method2 = ((Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 41 - ExpandableListView.getPackedPositionGroup(0L), Color.argb(0, 0, 0, 0) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map5.put(-350984188, method2);
                    }
                    int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr8)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue2;
                    i26++;
                }
            }
            int i31 = setonlongclicklistener.setY;
            int i32 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i33 = i31 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i33;
            int i34 = i32 ^ iArr4[17];
            setonlongclicklistener.setY = i34;
            cArr2[0] = (char) (i34 >>> 16);
            cArr2[1] = (char) i34;
            cArr2[2] = (char) (i33 >>> 16);
            cArr2[3] = (char) i33;
            setOnLongClickListener.setX(iArr4);
            int i35 = setonlongclicklistener.setDividerPadding * 2;
            cArr[i35] = cArr2[0];
            cArr[i35 + 1] = cArr2[1];
            cArr[i35 + 2] = cArr2[2];
            cArr[i35 + 3] = cArr2[3];
            Object[] objArr9 = {setonlongclicklistener, setonlongclicklistener};
            Map map6 = setTextScaleX.setMaxEms;
            Object obj3 = map6.get(-147294223);
            if (obj3 != null) {
                method = obj3;
            } else {
                Class cls4 = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 41, 483 - View.MeasureSpec.getMode(0));
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 - 1);
                Object[] objArr10 = new Object[1];
                a(b16, (byte) (b17 + 1), b17, objArr10);
                method = cls4.getMethod((String) objArr10[0], Object.class, Object.class);
                map6.put(-147294223, method);
            }
            ((Method) method).invoke(null, objArr9);
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
    public static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r6 = 108 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.getClientId.f55737w0
            if (r2 != 0) goto L19
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L34
        L19:
            r3 = r1
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r2[r8]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L34:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getClientId.a(byte, byte, short, java.lang.Object[]):void");
    }

    public static void b() {
        f55737w0 = new byte[]{72, 65, MessageUtils.MESSAGE_18_DC2, -53};
    }
}
