package com.mypinpad.tsdk.isolation;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getTransactionLandscape implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55969b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55970c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f55971a = getTransactionPortrait.getNavBarTitleString;

    public static final class a extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f55972p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55973q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55974r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f55975s0 = null;

        static {
            b();
            f55973q0 = 0;
            f55974r0 = 1;
            f55972p0 = new a();
            int i10 = f55973q0;
            int i11 = (i10 ^ 109) + ((i10 & 109) << 1);
            f55974r0 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002d  */
        /* JADX WARN: Code duplicated, block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 2
                int r0 = r8 + 4
                int r7 = r7 * 4
                int r7 = 3 - r7
                int r6 = r6 * 3
                int r6 = r6 + 115
                byte[] r0 = new byte[r0]
                int r8 = r8 + 3
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.getTransactionLandscape.a.f55975s0
                if (r2 != 0) goto L1b
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                goto L36
            L1b:
                r3 = r1
            L1c:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L2d
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L2d:
                r3 = r2[r7]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r5
            L36:
                int r6 = -r6
                int r8 = r8 + r6
                int r6 = r8 + (-6)
                r8 = r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.getTransactionLandscape.a.a(byte, short, short, java.lang.Object[]):void");
        }

        public static void b() {
            f55975s0 = new byte[]{85, 2, -89, 93, 8, -21, MessageUtils.MESSAGE_21_NAK};
        }

        public static /* synthetic */ Integer c(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = (i11 * (-448)) + (i10 * 450);
            int i14 = ~((~i10) | i11);
            int i15 = ~i11;
            if ((((~(i10 | i15 | (~i12))) | i14) * 449) + (i14 * (-1347)) + (((~(i15 | i10 | i12)) | i14) * 449) + i13 != 1) {
                Object obj = objArr[1];
                int i16 = f55973q0;
                int i17 = ((i16 & (-80)) | ((~i16) & 79)) + ((i16 & 79) << 1);
                f55974r0 = i17 % 128;
                int i18 = i17 % 2;
                int iIntValue = ((Number) obj).intValue();
                Integer numC = c(new Object[]{Integer.valueOf(iIntValue)}, -651235083, 651235084, iIntValue);
                int i19 = f55974r0;
                int i20 = i19 & 3;
                int i21 = -(-((i19 ^ 3) | i20));
                int i22 = (i20 & i21) + (i21 | i20);
                f55973q0 = i22 % 128;
                int i23 = i22 % 2;
                return numC;
            }
            int iIntValue2 = ((Number) objArr[0]).intValue();
            int i24 = f55974r0;
            int i25 = i24 & 25;
            int i26 = -(-((i24 ^ 25) | i25));
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f55973q0 = i27 % 128;
            try {
                if (i27 % 2 == 0) {
                    Object[] objArr2 = {Integer.valueOf(iIntValue2)};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(587885529);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 50, (ViewConfiguration.getWindowTouchSlop() >> 8) + 434);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        a(b11, b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(587885529, method);
                    }
                    return Integer.valueOf(((Integer) ((Method) method).invoke(null, objArr2)).intValue());
                }
                Object[] objArr4 = {Integer.valueOf(iIntValue2)};
                Map map2 = setTextScaleX.setMaxEms;
                Object method2 = map2.get(587885529);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) KeyEvent.getDeadChar(0, 0), 50 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 434 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    a(b13, b12, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(587885529, method2);
                }
                ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                throw null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Integer invoke(Integer num) {
            return c(new Object[]{this, num}, -1366993486, 1366993486, System.identityHashCode(this));
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = (i11 * (-1917)) + (i10 * 960);
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i10 | i15)) | (~(i14 | i12))) * 959) + (i14 * (-959)) + (((~(i14 | i15)) | (~(i10 | i12))) * 959) + i13 != 1) {
            getTransactionLandscape gettransactionlandscape = (getTransactionLandscape) objArr[0];
            int i16 = f55970c;
            int i17 = i16 & 37;
            int i18 = (i16 ^ 37) | i17;
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            f55969b = i19 % 128;
            int i20 = i19 % 2;
            obj = gettransactionlandscape.f55971a;
            int i21 = i16 & 83;
            int i22 = (i16 | 83) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f55969b = i24 % 128;
            if (i24 % 2 != 0) {
                throw null;
            }
        } else {
            getTransactionLandscape gettransactionlandscape2 = (getTransactionLandscape) objArr[0];
            int i25 = f55969b;
            int i26 = i25 & 17;
            int i27 = (((i25 | 17) & (~i26)) - (~(i26 << 1))) - 1;
            f55970c = i27 % 128;
            int i28 = i27 % 2;
            obj = (setAutoSizeTextTypeUniformWithPresetSizes) SessionActivationFailure.setX(new Object[]{gettransactionlandscape2, a.f55972p0}, -1911780895, 1911780896, (int) System.currentTimeMillis());
            int i29 = f55970c;
            int i30 = (i29 & (-102)) | ((~i29) & 101);
            int i31 = (i29 & 101) << 1;
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            f55969b = i32 % 128;
            if (i32 % 2 != 0) {
                int i33 = 16 / 0;
            }
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setDividerPadding(new Object[]{this}, 218877293, -218877292, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        return (getTransactionPortrait) setDividerPadding(new Object[]{this}, -644647280, 644647280, System.identityHashCode(this));
    }
}
