package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ui implements uc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61313b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61314c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ScheduledExecutorService f61315a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3<Runnable, Long, TimeUnit, ScheduledFuture<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f61316p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f61317q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f61318r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f61319s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final byte[] f61320t0 = null;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final int f61321u0 = 0;

        static {
            c();
            f61316p0 = 420568460;
            f61317q0 = -1454817050;
            f61318r0 = -664478877;
            f61319s0 = new byte[]{2, -62, Constants.CVR_B2b87_11_RFU, -6, -56, -50, -10, -39, 102, 127, -100, -122, -126, -128, -48, 99, -128, -102, -104, UtilitiesSDKConstants.SRP_LABEL_MAC, -128, -122, ComputeCcCommandApdu.EXPECTED_P1, -79, -83, 68, -113, -118, -100, KSUtils.PLAIN_BUFFER, -122, -77, -98, -128, -75, -35, 76, -116, -98, -128, Constants.CVR_B2b65_CLEAR_BITS, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -108, -66, -104, -89, -84, -105, 72, -76, -124, -70, -111, -103, -115, -66, -82, 68, -113, -118, -100, KSUtils.PLAIN_BUFFER, -122, -77, -98, -128, -75, -35, 76, -116, -98, -128, Constants.CVR_B2b65_CLEAR_BITS, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -108, -66, -104, -89, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, UtilitiesSDKConstants.SRP_LABEL_ENC, 127, -102, -117, -126, -100, KSUtils.PLAIN_BUFFER, -102, -84, -84, 73, -102, -74, -98, -58, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -108, -66, -104, -89, -83, 76, -102, -104, UtilitiesSDKConstants.SRP_LABEL_MAC, -128, -122, ComputeCcCommandApdu.EXPECTED_P1, -111};
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(ScheduledExecutorService scheduledExecutorService) throws Throwable {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 115, (byte) View.resolveSizeAndState(0, 0, 0), (short) (Color.blue(0) - 93), (-1898814339) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1336402664 - View.resolveSize(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((-115) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (short) (ImageFormat.getBitsPerPixel(0) - 20), (-1898814340) - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1336402672, objArr2);
            super(3, scheduledExecutorService, ScheduledExecutorService.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
            byte[] bArr;
            byte[] bArr2;
            int i13 = f61317q0;
            setTextAlignment settextalignment = new setTextAlignment();
            StringBuilder sb2 = new StringBuilder();
            try {
                int i14 = 1;
                Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i13)};
                char c10 = 0;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-769569468);
                int i15 = f61321u0;
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 49 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 434);
                    byte b11 = (byte) (i15 & 3);
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(-769569468, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                int i16 = iIntValue == -1 ? 1 : 0;
                int i17 = f61316p0;
                byte[] bArr3 = f61319s0;
                if (i16 != 0) {
                    if (bArr3 != null) {
                        int length = bArr3.length;
                        bArr2 = new byte[length];
                        int i18 = 0;
                        while (i18 < length) {
                            Object[] objArr4 = new Object[i14];
                            objArr4[c10] = Integer.valueOf(bArr3[i18]);
                            Map map2 = setTextScaleX.setMaxEms;
                            Object method2 = map2.get(510767826);
                            if (method2 == null) {
                                method2 = ((Class) setTextScaleX.setX((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49111), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40, 51 - ExpandableListView.getPackedPositionChild(0L))).getMethod("s", Integer.TYPE);
                                map2.put(510767826, method2);
                            }
                            bArr2[i18] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                            i18++;
                            length = length;
                            i14 = 1;
                            c10 = 0;
                        }
                    } else {
                        bArr2 = bArr3;
                    }
                    bArr2.getClass();
                    Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i17)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-769569468);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 49 - View.combineMeasuredStates(0, 0), (-16776782) - Color.rgb(0, 0, 0));
                        byte b13 = (byte) (i15 & 3);
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, b14, objArr6);
                        String str2 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, cls4, cls4);
                        map3.put(-769569468, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i13) ^ 7616081452308447380L)));
                }
                if (iIntValue > 0) {
                    settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) i17) ^ 7616081452308447380L)) + i16;
                    Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f61318r0), sb2};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(193260760);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2803 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        b(b15, b16, b16, objArr8);
                        String str3 = (String) objArr8[0];
                        Class<?> cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                        map4.put(193260760, method4);
                    }
                    ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(settextalignment.setCompoundDrawableTintBlendMode);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    if (bArr3 != null) {
                        int length2 = bArr3.length;
                        bArr = new byte[length2];
                        for (int i19 = 0; i19 < length2; i19++) {
                            bArr[i19] = (byte) (((long) bArr3[i19]) ^ 7616081452308447380L);
                        }
                    } else {
                        bArr = bArr3;
                    }
                    int i20 = 1;
                    boolean z10 = bArr != null;
                    while (true) {
                        settextalignment.setDividerPadding = i20;
                        if (settextalignment.setDividerPadding >= iIntValue) {
                            break;
                        }
                        if (!z10) {
                            settextalignment.setX--;
                            throw null;
                        }
                        int i21 = settextalignment.setX;
                        settextalignment.setX = i21 - 1;
                        char c11 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i21]) ^ 7616081452308447380L)) + s4)) ^ b10));
                        settextalignment.setCompoundDrawableTintBlendMode = c11;
                        sb2.append(c11);
                        settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                        i20 = settextalignment.setDividerPadding + 1;
                    }
                }
                objArr[0] = sb2.toString();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 3
                int r7 = 112 - r7
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r9 = r9 * 4
                int r9 = r9 + 1
                byte[] r0 = new byte[r9]
                byte[] r1 = com.mypinpad.tsdk.i.ui.a.f61320t0
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r8
                r7 = r9
                r5 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r0[r3] = r4
                if (r5 != r9) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r1[r8]
                r6 = r9
                r9 = r7
                r7 = r6
            L2c:
                int r8 = r8 + 1
                int r3 = -r3
                int r9 = r9 + r3
                r3 = r5
                r6 = r9
                r9 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.ui.a.b(byte, byte, short, java.lang.Object[]):void");
        }

        public static void c() {
            f61320t0 = new byte[]{22, 117, -35, 69};
            f61321u0 = 205;
        }

        public final ScheduledFuture<?> d(Runnable runnable, long j10, TimeUnit timeUnit) {
            return ((ScheduledExecutorService) this.receiver).schedule(runnable, j10, timeUnit);
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ ScheduledFuture<?> invoke(Runnable runnable, Long l6, TimeUnit timeUnit) {
            return d(runnable, l6.longValue(), timeUnit);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r0
      0x0024: PHI (r0v5 java.util.concurrent.ScheduledExecutorService) = (r0v4 java.util.concurrent.ScheduledExecutorService), (r0v13 java.util.concurrent.ScheduledExecutorService) binds: [B:8:0x0022, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        ScheduledExecutorService scheduledExecutorService;
        ui uiVar = (ui) objArr[0];
        int i13 = f61313b;
        int i14 = i13 & 31;
        int i15 = ((~i14) & (i13 | 31)) + (i14 << 1);
        f61314c = i15 % 128;
        if (i15 % 2 == 0) {
            scheduledExecutorService = uiVar.f61315a;
            int i16 = 55 / 0;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                int i17 = f61314c + 37;
                f61313b = i17 % 128;
                int i18 = i17 % 2;
            } else {
                int i19 = i13 & 73;
                int i20 = -(-((i13 ^ 73) | i19));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f61314c = i21 % 128;
                int i22 = i21 % 2;
            }
        } else {
            scheduledExecutorService = uiVar.f61315a;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                int i110 = f61314c + 37;
                f61313b = i110 % 128;
                int i111 = i110 % 2;
            } else {
                int i112 = i13 & 73;
                int i23 = -(-((i13 ^ 73) | i112));
                int i24 = ((i112 | i23) << 1) - (i23 ^ i112);
                f61314c = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        uiVar.f61315a = null;
        mu.setCompoundDrawableTintBlendMode(new Object[]{160004, null, null, 6}, -1968587119, 1968587120, 160004);
        int i26 = f61314c;
        int i27 = i26 & 49;
        int i28 = (i26 | 49) & (~i27);
        int i29 = -(-(i27 << 1));
        int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
        f61313b = i30 % 128;
        if (i30 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.uc
    public final void setOnFocusChangeListener() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 627963139, -627963139, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.uc
    @NotNull
    public final synchronized uf setX(@NotNull String str) {
        try {
            int i10 = f61313b;
            int i11 = i10 & 77;
            int i12 = ((i10 | 77) & (~i11)) + (i11 << 1);
            f61314c = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            ScheduledExecutorService scheduledExecutorService = this.f61315a;
            if (scheduledExecutorService != null) {
                int i14 = f61314c;
                int i15 = ((i14 ^ 113) | (i14 & 113)) << 1;
                int i16 = -(((~i14) & 113) | (i14 & (-114)));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                int i18 = i17 % 128;
                f61313b = i18;
                if (i17 % 2 != 0) {
                    throw null;
                }
                int i19 = i18 + 45;
                f61314c = i19 % 128;
                if (i19 % 2 == 0) {
                    scheduledExecutorService.isShutdown();
                    throw null;
                }
                if (!scheduledExecutorService.isShutdown()) {
                    int i20 = f61314c;
                    int i21 = i20 & 75;
                    int i22 = (i21 - (~((i20 ^ 75) | i21))) - 1;
                    f61313b = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    int i24 = f61314c;
                    int i25 = (((i24 | 108) << 1) - (i24 ^ 108)) - 1;
                    f61313b = i25 % 128;
                    int i26 = i25 % 2;
                    mu.setCompoundDrawableTintBlendMode(new Object[]{160003, null, null, 6}, -1968587119, 1968587120, 160003);
                    this.f61315a = Executors.newSingleThreadScheduledExecutor();
                    int i27 = f61313b;
                    int i28 = i27 & 57;
                    int i29 = (i27 ^ 57) | i28;
                    int i30 = (i28 & i29) + (i29 | i28);
                    f61314c = i30 % 128;
                    int i31 = i30 % 2;
                }
                throw th;
            }
            mu.setCompoundDrawableTintBlendMode(new Object[]{160003, null, null, 6}, -1968587119, 1968587120, 160003);
            this.f61315a = Executors.newSingleThreadScheduledExecutor();
            int i210 = f61313b;
            int i211 = i210 & 57;
            int i212 = (i210 ^ 57) | i211;
            int i32 = (i211 & i212) + (i212 | i211);
            f61314c = i32 % 128;
            int i33 = i32 % 2;
            ScheduledExecutorService scheduledExecutorService2 = this.f61315a;
            Intrinsics.checkNotNull(scheduledExecutorService2);
            tx txVar = new tx(new a(scheduledExecutorService2));
            mu.setCompoundDrawableTintBlendMode(new Object[]{160005, getDisplayExponent.setY(str), null, 4}, -1968587119, 1968587120, 160005);
            int i34 = f61314c + 15;
            f61313b = i34 % 128;
            if (i34 % 2 == 0) {
                return txVar;
            }
            int i35 = 78 / 0;
            return txVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
