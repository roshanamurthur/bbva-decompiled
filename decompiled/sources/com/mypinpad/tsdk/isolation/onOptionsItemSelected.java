package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/onOptionsItemSelected;", "Lcom/mypinpad/tsdk/i/getMessage;", "", "p0", "<init>", "([C)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class onOptionsItemSelected extends getMessage {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int[] f57523t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f57524u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f57525w0 = null;

    static {
        b();
        f57524u0 = 0;
        v0 = 1;
        e();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onOptionsItemSelected(@NotNull char[] cArr) throws Throwable {
        int i10;
        char[] cArr2;
        int i11;
        Object method;
        int length;
        int[] iArr;
        int i12;
        int length2;
        int[] iArr2;
        super(cArr, false, 2, null);
        Intrinsics.checkNotNullParameter(cArr, "");
        int i13 = 0;
        int i14 = 2;
        if (cArr.length == 10) {
            return;
        }
        int[] iArr3 = {-1404487059, -215685217, -973630582, 428511071, -46533852, -1303660885, -1123820457, 1054769031, 785062486, 613913259};
        int iRed = Color.red(0) + 19;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[20];
        int[] iArr4 = f57523t0;
        int i15 = 1;
        if (iArr4 != null) {
            int i16 = f57524u0 + 57;
            v0 = i16 % 128;
            if (i16 % 2 == 0) {
                length2 = iArr4.length;
                iArr2 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr2 = new int[length2];
            }
            int i17 = 0;
            while (i17 < length2) {
                int i18 = v0 + 113;
                f57524u0 = i18 % 128;
                if (i18 % i14 != 0) {
                    try {
                        Object[] objArr = new Object[i15];
                        objArr[i13] = Integer.valueOf(iArr4[i17]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method2 = map.get(1833429914);
                        if (method2 == null) {
                            Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.makeMeasureSpec(i13, i13), KeyEvent.keyCodeFromString("") + 44, TextUtils.getTrimmedLength("") + 728);
                            byte b10 = (byte) 1;
                            byte b11 = (byte) (b10 - 1);
                            Object[] objArr2 = new Object[1];
                            a(b10, b11, b11, objArr2);
                            method2 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(1833429914, method2);
                        }
                        iArr2[i17] = ((Integer) ((Method) method2).invoke(null, objArr)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    length2 = length2;
                    iRed = iRed;
                    Object[] objArr3 = {Integer.valueOf(iArr4[i17])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(1833429914);
                    if (method3 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ((-1) - Process.getGidForName("")), 44 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 728);
                        byte b12 = (byte) 1;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, b13, objArr4);
                        method3 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                        map2.put(1833429914, method3);
                    }
                    iArr2[i17] = ((Integer) ((Method) method3).invoke(null, objArr3)).intValue();
                    i17++;
                }
                length2 = length2;
                iRed = iRed;
                i13 = 0;
                i14 = 2;
                i15 = 1;
            }
            i10 = iRed;
            iArr4 = iArr2;
        } else {
            i10 = iRed;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f57523t0;
        if (iArr6 != null) {
            int i19 = v0 + 55;
            f57524u0 = i19 % 128;
            if (i19 % 2 != 0) {
                length = iArr6.length;
                iArr = new int[length];
                i12 = 1;
            } else {
                length = iArr6.length;
                iArr = new int[length];
                i12 = 0;
            }
            while (i12 < length) {
                Object[] objArr5 = {Integer.valueOf(iArr6[i12])};
                Map map3 = setTextScaleX.setMaxEms;
                Object method4 = map3.get(1833429914);
                if (method4 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Color.rgb(0, 0, 0) + 16777216), AndroidCharacter.getMirror('0') - 4, 728 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    byte b14 = (byte) 1;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr6 = new Object[1];
                    a(b14, b15, b15, objArr6);
                    method4 = cls3.getMethod((String) objArr6[0], Integer.TYPE);
                    map3.put(1833429914, method4);
                }
                iArr[i12] = ((Integer) ((Method) method4).invoke(null, objArr5)).intValue();
                i12++;
                iArr6 = iArr6;
                length = length;
                cArr4 = cArr4;
            }
            cArr2 = cArr4;
            iArr6 = iArr;
        } else {
            cArr2 = cArr4;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        setonlongclicklistener.setDividerPadding = 0;
        int i20 = v0 + 15;
        f57524u0 = i20 % 128;
        int i21 = 2;
        int i22 = i20 % 2;
        while (true) {
            int i23 = setonlongclicklistener.setDividerPadding;
            if (i23 >= 10) {
                throw new IllegalArgumentException(new String(cArr2, 0, i10).intern().toString());
            }
            int i24 = v0 + 81;
            f57524u0 = i24 % 128;
            int i25 = i24 % i21;
            int i26 = iArr3[i23];
            char c10 = (char) (i26 >> 16);
            cArr3[0] = c10;
            char c11 = (char) i26;
            cArr3[1] = c11;
            int i27 = iArr3[i23 + 1];
            char c12 = (char) (i27 >> 16);
            cArr3[2] = c12;
            char c13 = (char) i27;
            cArr3[3] = c13;
            setonlongclicklistener.setY = (c10 << 16) + c11;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
            setOnLongClickListener.setX(iArr5);
            int i28 = 0;
            for (int i29 = 16; i28 < i29; i29 = 16) {
                int i30 = setonlongclicklistener.setY ^ iArr5[i28];
                setonlongclicklistener.setY = i30;
                Object[] objArr7 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i30)), setonlongclicklistener, setonlongclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object obj = map4.get(-350984188);
                if (obj != null) {
                    method = obj;
                } else {
                    method = ((Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 42 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map4.put(-350984188, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr7)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i28++;
            }
            int i31 = setonlongclicklistener.setY;
            int i32 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i33 = i31 ^ iArr5[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i33;
            int i34 = i32 ^ iArr5[17];
            setonlongclicklistener.setY = i34;
            cArr3[0] = (char) (i34 >>> 16);
            cArr3[1] = (char) i34;
            cArr3[2] = (char) (i33 >>> 16);
            cArr3[3] = (char) i33;
            setOnLongClickListener.setX(iArr5);
            int i35 = setonlongclicklistener.setDividerPadding * 2;
            cArr2[i35] = cArr3[0];
            cArr2[i35 + 1] = cArr3[1];
            cArr2[i35 + 2] = cArr3[2];
            cArr2[i35 + 3] = cArr3[3];
            Object[] objArr8 = {setonlongclicklistener, setonlongclicklistener};
            Map map5 = setTextScaleX.setMaxEms;
            Object method5 = map5.get(-147294223);
            if (method5 != null) {
                i11 = 2;
            } else {
                Class cls4 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 41, (ViewConfiguration.getEdgeSlop() >> 16) + 483);
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr9 = new Object[1];
                a(b16, b17, b17, objArr9);
                i11 = 2;
                method5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map5.put(-147294223, method5);
            }
            ((Method) method5).invoke(null, objArr8);
            i21 = i11;
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
    public static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r6 = 108 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.onOptionsItemSelected.f57525w0
            if (r2 != 0) goto L1b
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L37
        L1b:
            r3 = r1
            r5 = r8
            r8 = r6
            r6 = r5
        L1f:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2c:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r9
            r9 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L37:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.onOptionsItemSelected.a(int, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f57525w0 = new byte[]{24, -27, 46, Constants.FCI_TEMPLATE};
    }

    public static void e() {
        f57523t0 = new int[]{1405006308, -2147416734, -1209440918, -2032976365, 538525559, 1890796450, -1968095152, -1802541247, -1347337375, 1392434109, -733839365, -960716929, -1416182825, -1620697388, 2094952103, -341945660, 138459332, 606146055};
    }
}
