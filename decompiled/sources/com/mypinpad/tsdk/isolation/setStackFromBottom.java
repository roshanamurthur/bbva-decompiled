package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setStackFromBottom;", "Lcom/mypinpad/tsdk/i/setLayerType;", "", "p0", "<init>", "([B)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setStackFromBottom extends setLayerType {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static long f60577t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60578u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f60579w0 = null;

    static {
        b();
        f60578u0 = 0;
        v0 = 1;
        e();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:61:0x02df  */
    /* JADX WARN: Code duplicated, block: B:62:0x02e0  */
    public setStackFromBottom(@NotNull byte[] bArr) throws Throwable {
        Throwable cause;
        super(bArr, false, 2, null);
        Intrinsics.checkNotNullParameter(bArr, "");
        int i10 = 2;
        if (bArr.length == 16) {
            return;
        }
        long j10 = 0;
        int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 51631;
        int i12 = v0 + 95;
        f60578u0 = i12 % 128;
        if (i12 % 2 != 0) {
            "\uf55b㳓昪\ua87c폄Ԓ伧皦렀\ue24bᖾ忱腛좛\uf2e2\u2439澃釶\udb7d".toCharArray();
            throw null;
        }
        char[] charArray = "\uf55b㳓昪\ua87c폄Ԓ伧皦렀\ue24bᖾ忱腛좛\uf2e2\u2439澃釶\udb7d".toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i13 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i13 >= charArray.length) {
                break;
            }
            int i14 = v0 + 21;
            f60578u0 = i14 % 128;
            if (i14 % i10 != 0) {
                char c10 = charArray[i13];
                try {
                    Object[] objArr = new Object[3];
                    objArr[i10] = setlayoutanimation;
                    objArr[1] = setlayoutanimation;
                    objArr[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) View.getDefaultSize(0, 0), 33 - (Process.myPid() >> 22), (SystemClock.elapsedRealtime() > j10 ? 1 : (SystemClock.elapsedRealtime() == j10 ? 0 : -1)) + 1194);
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, (byte) (b11 - 1), objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i13] = ((Long) ((Method) method).invoke(null, objArr)).longValue() + (f60577t0 | 1779209353347916695L);
                    Object[] objArr3 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) Color.green(0), (Process.myTid() >> 22) + 44, (ViewConfiguration.getTapTimeout() >> 16) + 728);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, b13, objArr4);
                        method2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(charArray[i13]), setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(-764403778);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 33, 1194 - ImageFormat.getBitsPerPixel(0));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr6 = new Object[1];
                    a(b14, b15, (byte) (b15 - 1), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Integer.TYPE, Object.class, Object.class);
                    map2.put(-764403778, method3);
                }
                jArr[i13] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (f60577t0 ^ 1779209353347916695L);
                Object[] objArr7 = {setlayoutanimation, setlayoutanimation};
                Object method4 = map2.get(645183118);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 44, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 729);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr8 = new Object[1];
                    a(b16, b17, b17, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(645183118, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
            i10 = 2;
            j10 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i15 >= charArray.length) {
                throw new IllegalArgumentException(n1.f(cArr).toString());
            }
            int i16 = f60578u0 + 39;
            v0 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr[i15] = (char) jArr[i15];
                Object[] objArr9 = {setlayoutanimation, setlayoutanimation};
                Map map3 = setTextScaleX.setMaxEms;
                Object method5 = map3.get(645183118);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), 44 - ExpandableListView.getPackedPositionType(0L), 728 - Color.argb(0, 0, 0, 0));
                    byte b18 = (byte) 0;
                    byte b19 = b18;
                    Object[] objArr10 = new Object[1];
                    a(b18, b19, b19, objArr10);
                    method5 = cls5.getMethod((String) objArr10[0], Object.class, Object.class);
                    map3.put(645183118, method5);
                }
                ((Method) method5).invoke(null, objArr9);
                throw null;
            }
            cArr[i15] = (char) jArr[i15];
            Object[] objArr11 = {setlayoutanimation, setlayoutanimation};
            Map map4 = setTextScaleX.setMaxEms;
            Object method6 = map4.get(645183118);
            if (method6 == null) {
                Class cls6 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 727);
                byte b20 = (byte) 0;
                byte b21 = b20;
                Object[] objArr12 = new Object[1];
                a(b20, b21, b21, objArr12);
                method6 = cls6.getMethod((String) objArr12[0], Object.class, Object.class);
                map4.put(645183118, method6);
            }
            ((Method) method6).invoke(null, objArr11);
        }
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
    public static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 107
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.setStackFromBottom.f60579w0
            r2 = 0
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
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setStackFromBottom.a(int, int, int, java.lang.Object[]):void");
    }

    public static void b() {
        f60579w0 = new byte[]{25, -30, -107, -39};
    }

    public static void e() {
        f60577t0 = -4314872283576265078L;
    }
}
