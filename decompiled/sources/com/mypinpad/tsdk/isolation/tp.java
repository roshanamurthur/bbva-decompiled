package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSdkTerminalSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTerminalSession.kt\ncom/mypinpad/tsdk/internal/terminal/session/SdkTerminalSession\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,183:1\n7#2,8:184\n7#2,8:192\n*S KotlinDebug\n*F\n+ 1 SdkTerminalSession.kt\ncom/mypinpad/tsdk/internal/terminal/session/SdkTerminalSession\n*L\n75#1:184,8\n79#1:192,8\n*E\n"})
public final class tp implements getDynamicButtonIconTextSpacingDp {
    public static final int E0;
    public static final int F0;
    public static final byte[] G0;
    public static final int[] H0;
    public static int I0;
    public static int J0;
    public static int K0;
    public static int L0;
    public static final byte[] M0 = null;
    public static final int N0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f61183y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final td f61184p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final UUID f61185q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ti f61186r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final op f61187s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final String f61188t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final long f61189u0;

    @NotNull
    public final ub v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public ul f61190w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f61191x0;

    static {
        c();
        K0 = 0;
        L0 = 1;
        I0 = 0;
        J0 = 1;
        f61183y0 = 2058100178;
        E0 = -1454817054;
        F0 = 1368027917;
        G0 = new byte[]{24, -116, Base64.padSymbol, Constants.FCI_TEMPLATE, 78, -76, UtilitiesSDKConstants.SRP_LABEL_ENC, 100, -74, 109, -79, -106, -124, 100, -59, 121, 39, 102, -113, 120, -124, -117, -105, -120, UtilitiesSDKConstants.SRP_LABEL_ENC, -106, 103, -39, 81, -117, -124, -112, -76};
        H0 = new int[]{1065137638, 1773143678, 1600109422, 1431579729, 1806692541, 296841791, -1224049100, 1730586583, -1685834772, -1365762405, -558937477, -1341332305, 435008431, -1142325930, -1805707774, -791370890, 271708834, -759857472};
    }

    public tp(@NotNull td tdVar, @NotNull UUID uuid, @NotNull ti tiVar, @NotNull op opVar, @NotNull String str, long j10, @NotNull ub ubVar) {
        Intrinsics.checkNotNullParameter(tdVar, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(tiVar, "");
        Intrinsics.checkNotNullParameter(opVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ubVar, "");
        this.f61184p0 = tdVar;
        this.f61185q0 = uuid;
        this.f61186r0 = tiVar;
        this.f61187s0 = opVar;
        this.f61188t0 = str;
        this.f61189u0 = j10;
        this.v0 = ubVar;
        this.f61191x0 = new AtomicBoolean(false);
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        byte[] bArr;
        byte[] bArr2;
        int i14 = E0;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i15 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i14)};
            int i16 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            int i17 = N0;
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (Process.myTid() >> 22) + 49, 434 - (KeyEvent.getMaxKeyCode() >> 16));
                byte b11 = (byte) (i17 & 11);
                byte b12 = (byte) (b11 - 3);
                Object[] objArr3 = new Object[1];
                b(b11, b12, b12, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            boolean z10 = iIntValue == -1;
            int i18 = f61183y0;
            byte[] bArr3 = G0;
            if (z10) {
                if (bArr3 != null) {
                    int length = bArr3.length;
                    bArr2 = new byte[length];
                    int i19 = 0;
                    while (i19 < length) {
                        Object[] objArr4 = new Object[i15];
                        objArr4[i16] = Integer.valueOf(bArr3[i19]);
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (49110 - (ExpandableListView.getPackedPositionForChild(i16, i16) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i16, i16) == 0L ? 0 : -1))), View.getDefaultSize(i16, i16) + 41, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 51)).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i19] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i19++;
                        length = length;
                        i15 = 1;
                        i16 = 0;
                    }
                } else {
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i18)};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-769569468);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 49 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 434);
                    byte b13 = (byte) (i17 & 11);
                    byte b14 = (byte) (b13 - 3);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str2, cls4, cls4);
                    map3.put(-769569468, method3);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i14) ^ 7616081452308447380L)));
                int i20 = K0 + 109;
                L0 = i20 % 128;
                int i21 = i20 % 2;
            }
            if (iIntValue > 0) {
                int i22 = ((i12 + iIntValue) - 2) + ((int) (((long) i18) ^ 7616081452308447380L));
                if (z10) {
                    int i23 = K0 + 57;
                    L0 = i23 % 128;
                    int i24 = i23 % 2;
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                settextalignment.setX = i22 + i13;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(F0), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(0, 0), 42 - Color.red(0), 2803 - KeyEvent.getDeadChar(0, 0));
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
                    loop1: while (true) {
                        int i25 = 0;
                        while (true) {
                            if (i25 >= length2) {
                                break loop1;
                            }
                            int i26 = K0 + 43;
                            L0 = i26 % 128;
                            if (i26 % 2 == 0) {
                                break;
                            }
                            bArr[i25] = (byte) (((long) bArr3[i25]) ^ 7616081452308447380L);
                            i25++;
                        }
                        bArr[i25] = (byte) (((long) bArr3[i25]) + 7616081452308447380L);
                    }
                } else {
                    bArr = bArr3;
                }
                int i27 = 1;
                boolean z11 = bArr != null;
                while (true) {
                    settextalignment.setDividerPadding = i27;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    if (!z11) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i28 = K0 + 5;
                    L0 = i28 % 128;
                    if (i28 % 2 == 0) {
                        int i29 = settextalignment.setX;
                        settextalignment.setX = i29;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY >> (((byte) (((byte) (((long) bArr3[i29]) / 7616081452308447380L)) >>> s4)) ^ b10));
                    } else {
                        int i30 = settextalignment.setX;
                        settextalignment.setX = i30 - 1;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i30]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    }
                    sb2.append(settextalignment.setCompoundDrawableTintBlendMode);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i27 = settextalignment.setDividerPadding + 1;
                }
            }
            String string = sb2.toString();
            int i31 = K0 + 27;
            L0 = i31 % 128;
            if (i31 % 2 == 0) {
                throw null;
            }
            objArr[0] = string;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r7 = 112 - r7
            byte[] r0 = new byte[r9]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.tp.M0
            if (r2 != 0) goto L18
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L34
        L18:
            r3 = r1
        L19:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r0[r3] = r5
            if (r4 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2a:
            r3 = r2[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L34:
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.tp.b(int, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        M0 = new byte[]{75, 85, 67, -51};
        N0 = 39;
    }

    public static final /* synthetic */ td setCompoundDrawableTintBlendMode(tp tpVar) {
        int i10 = J0 + 7;
        int i11 = i10 % 128;
        I0 = i11;
        int i12 = i10 % 2;
        td tdVar = tpVar.f61184p0;
        int i13 = i11 + 63;
        J0 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 39 / 0;
        }
        return tdVar;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        tp tpVar;
        mr mrVar;
        int i13;
        int[] iArr;
        String str;
        Unit unit;
        String str2;
        Object method;
        int length;
        int[] iArr2;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ((~(i14 | i15)) * 979) + (i11 * (-978)) + (i10 * 980);
        int i17 = ((~(i10 | i15)) | (~(i14 | i12))) * 979;
        int i18 = 0;
        int i19 = 1;
        if (i17 + ((i10 | i12) * (-979)) + i16 != 1) {
            tp tpVar2 = (tp) objArr[0];
            int i20 = I0 + 43;
            J0 = i20 % 128;
            if (i20 % 2 == 0) {
                ul ulVar = tpVar2.f61190w0;
                throw null;
            }
            ul ulVar2 = tpVar2.f61190w0;
            if (ulVar2 != null) {
                ulVar2.setNavigationOnClickListener();
                int i21 = I0 + 91;
                J0 = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 98 / 0;
                }
            }
            return null;
        }
        tp tpVar3 = (tp) objArr[0];
        mr mrVar2 = mr.UiMessageCallbackKtWhenMappings;
        int[] iArr3 = {317119317, -237149988, -601235615, 1284644458, 925406168, 1827396774};
        int i23 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr = new char[4];
        char[] cArr2 = new char[12];
        String str3 = "";
        int[] iArr4 = H0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            iArr = new int[length2];
            int i24 = 0;
            while (i24 < length2) {
                try {
                    Object[] objArr2 = new Object[i19];
                    objArr2[i18] = Integer.valueOf(iArr4[i24]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method2 = map.get(1833429914);
                    if (method2 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionForGroup(i18) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i18) == 0L ? 0 : -1)), 43 - TextUtils.indexOf((CharSequence) "", '0'), View.getDefaultSize(0, 0) + 728);
                        byte b10 = (byte) 0;
                        Object[] objArr3 = new Object[1];
                        b((byte) 8, b10, b10, objArr3);
                        method2 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1833429914, method2);
                    }
                    iArr[i24] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i24++;
                    int i25 = L0 + 55;
                    K0 = i25 % 128;
                    int i26 = i25 % 2;
                    length2 = length2;
                    tpVar3 = tpVar3;
                    mrVar2 = mrVar2;
                    i23 = i23;
                    i18 = 0;
                    i19 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            tpVar = tpVar3;
            mrVar = mrVar2;
            i13 = i23;
        } else {
            tpVar = tpVar3;
            mrVar = mrVar2;
            i13 = i23;
            iArr = iArr4;
        }
        int length3 = iArr.length;
        int[] iArr5 = new int[length3];
        if (iArr4 != null) {
            int i27 = L0 + 97;
            K0 = i27 % 128;
            if (i27 % 2 != 0) {
                length = iArr4.length;
                iArr2 = new int[length];
            } else {
                length = iArr4.length;
                iArr2 = new int[length];
            }
            int i28 = 0;
            while (i28 < length) {
                Object[] objArr4 = {Integer.valueOf(iArr4[i28])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1833429914);
                if (method3 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.blue(0) + 44, 727 - ExpandableListView.getPackedPositionChild(0L));
                    byte b11 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    b((byte) 8, b11, b11, objArr5);
                    method3 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(1833429914, method3);
                }
                iArr2[i28] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                i28++;
                length = length;
                iArr4 = iArr4;
                str3 = str3;
            }
            str = str3;
            iArr4 = iArr2;
        } else {
            str = "";
        }
        char c10 = 0;
        System.arraycopy(iArr4, 0, iArr5, 0, length3);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i29 = setonlongclicklistener.setDividerPadding;
            if (i29 >= 6) {
                break;
            }
            int i30 = iArr3[i29];
            char c11 = (char) (i30 >> 16);
            cArr[c10] = c11;
            char c12 = (char) i30;
            cArr[1] = c12;
            int i31 = iArr3[i29 + 1];
            char c13 = (char) (i31 >> 16);
            cArr[2] = c13;
            char c14 = (char) i31;
            cArr[3] = c14;
            setonlongclicklistener.setY = (c11 << 16) + c12;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
            setOnLongClickListener.setX(iArr5);
            for (int i32 = 0; i32 < 16; i32++) {
                int i33 = setonlongclicklistener.setY ^ iArr5[i32];
                setonlongclicklistener.setY = i33;
                Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i33)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object obj = map3.get(-350984188);
                if (obj != null) {
                    method = obj;
                } else {
                    method = ((Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 42, View.MeasureSpec.makeMeasureSpec(0, 0) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
            }
            int i34 = setonlongclicklistener.setY;
            int i35 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i36 = i34 ^ iArr5[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i36;
            int i37 = i35 ^ iArr5[17];
            setonlongclicklistener.setY = i37;
            cArr[0] = (char) (i37 >>> 16);
            cArr[1] = (char) i37;
            cArr[2] = (char) (i36 >>> 16);
            cArr[3] = (char) i36;
            setOnLongClickListener.setX(iArr5);
            int i38 = setonlongclicklistener.setDividerPadding * 2;
            cArr2[i38] = cArr[0];
            cArr2[i38 + 1] = cArr[1];
            cArr2[i38 + 2] = cArr[2];
            cArr2[i38 + 3] = cArr[3];
            Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object method4 = map4.get(-147294223);
            if (method4 != null) {
                str2 = str;
            } else {
                str2 = str;
                Class cls3 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 41, TextUtils.lastIndexOf(str2, '0', 0) + 484);
                byte length4 = (byte) M0.length;
                byte b12 = (byte) (length4 - 4);
                Object[] objArr8 = new Object[1];
                b(length4, b12, b12, objArr8);
                method4 = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-147294223, method4);
            }
            ((Method) method4).invoke(null, objArr7);
            str = str2;
            c10 = 0;
        }
        mt.setX(new Object[]{mrVar, new String(cArr2, 0, i13).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
        tp tpVar4 = tpVar;
        ul ulVar3 = tpVar4.f61190w0;
        if (ulVar3 != null) {
            int i39 = J0 + 87;
            I0 = i39 % 128;
            int i40 = i39 % 2;
            ulVar3.setOnDragListener();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            int i41 = I0 + 41;
            J0 = i41 % 128;
            int i42 = i41 % 2;
            td tdVar = tpVar4.f61184p0;
            if (i42 == 0) {
                tdVar.setY();
                int i43 = 42 / 0;
            } else {
                tdVar.setY();
            }
            int i44 = I0 + 35;
            J0 = i44 % 128;
            int i45 = i44 % 2;
        }
        return null;
    }

    public static final /* synthetic */ AtomicBoolean setX(tp tpVar) {
        int i10 = I0 + 109;
        int i11 = i10 % 128;
        J0 = i11;
        int i12 = i10 % 2;
        AtomicBoolean atomicBoolean = tpVar.f61191x0;
        if (i12 == 0) {
            int i13 = 16 / 0;
        }
        int i14 = i11 + 43;
        I0 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 86 / 0;
        }
        return atomicBoolean;
    }

    public final void getNavBarTitleString() {
        synchronized (this.f61191x0) {
            try {
                if (!this.f61191x0.getAndSet(true)) {
                    ul ulVar = this.f61190w0;
                    if (ulVar != null) {
                        ulVar.setTextAlignment();
                    }
                    this.f61190w0 = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long setDividerPadding() {
        int i10 = I0 + 5;
        int i11 = i10 % 128;
        J0 = i11;
        if (i10 % 2 == 0) {
            int i12 = 27 / 0;
        }
        int i13 = i11 + 67;
        I0 = i13 % 128;
        int i14 = i13 % 2;
        long j10 = this.f61189u0;
        if (i14 != 0) {
            int i15 = 50 / 0;
        }
        return j10;
    }

    public final void setOnDragListener() throws Throwable {
        setOnFocusChangeListener(new Object[]{this}, -1626337076, 1626337077, System.identityHashCode(this));
    }

    public final boolean setOnLongClickListener() {
        if (this.f61190w0 == null) {
            return false;
        }
        int i10 = J0 + 61;
        I0 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f61191x0.get()) {
            return false;
        }
        int i12 = I0 + 41;
        J0 = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    @NotNull
    public final UUID setY() {
        int i10 = I0 + 103;
        J0 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 30 / 0;
        }
        return this.f61185q0;
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "");
        ul ulVar = this.f61190w0;
        if (ulVar != null) {
            int i10 = J0 + 71;
            I0 = i10 % 128;
            int i11 = i10 % 2;
            ulVar.setCompoundDrawableTintBlendMode(th2);
            int i12 = J0 + 89;
            I0 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 78 / 0;
            }
        }
    }

    @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
    @NotNull
    public final String setX() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f61191x0);
        Object[] objArr = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 120, (byte) (6 - Drawable.resolveOpacity(0, 0)), (short) ((-38) - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 121425043, ExpandableListView.getPackedPositionChild(0L) + 739943099, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.f61190w0);
        String string = sb2.toString();
        int i10 = I0 + 9;
        J0 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final void setCompoundDrawableTintBlendMode() {
        ul ulVar = this.f61190w0;
        if (ulVar != null) {
            int i10 = I0 + 117;
            J0 = i10 % 128;
            if (i10 % 2 != 0) {
                ulVar.getNavBarTitleString();
                return;
            } else {
                ulVar.getNavBarTitleString();
                int i11 = 7 / 0;
                return;
            }
        }
        int i12 = I0 + 23;
        J0 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 50 / 0;
        }
    }

    public final void setOnFocusChangeListener(@NotNull Context context, @NotNull setAccessibilityDelegate setaccessibilitydelegate, @NotNull sq sqVar, @NotNull Function1<? super sa, Unit> function1, @NotNull Function1<? super Boolean, Unit> function2, @NotNull nt ntVar, @NotNull Function1<? super rs, Unit> function3) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setaccessibilitydelegate, "");
        Intrinsics.checkNotNullParameter(sqVar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(ntVar, "");
        Intrinsics.checkNotNullParameter(function3, "");
        synchronized (this.f61191x0) {
            try {
                mr mrVar = mr.UiMessageCallbackKtWhenMappings;
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr = new Object[1];
                a((-119) - (Process.myPid() >> 22), (byte) (22 - TextUtils.lastIndexOf("", '0')), (short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 10), (ViewConfiguration.getJumpTapTimeout() >> 16) + 121425114, 739943100 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
                sb2.append(((String) objArr[0]).intern());
                sb2.append(sqVar);
                mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                mu.setCompoundDrawableTintBlendMode(new Object[]{130001, sqVar, null, 4}, -1968587119, 1968587120, 130001);
                pc.setY(new pj(this.f61185q0, sqVar.setX()));
                try {
                    if (!this.f61191x0.get()) {
                        if (this.f61190w0 == null) {
                            Boolean bool = mg.setCompoundDrawableTintBlendMode;
                            Intrinsics.checkNotNullExpressionValue(bool, "");
                            hashCode onFocusChangeListener = bool.booleanValue() ? mk.setOnFocusChangeListener.setOnFocusChangeListener() : mk.setOnFocusChangeListener.setCompoundDrawableTintBlendMode();
                            if (onFocusChangeListener instanceof hashCode.setX) {
                                function3.invoke(new rn(mi.setCompoundDrawableTintBlendMode((hashCode.setX) onFocusChangeListener)));
                                return;
                            }
                            component24 compoundDrawableTintBlendMode = this.f61184p0.setCompoundDrawableTintBlendMode();
                            np dividerPadding = this.f61184p0.setDividerPadding();
                            nr onFocusChangeListener2 = this.f61184p0.setOnFocusChangeListener();
                            v9 v9Var = new v9(this, function3);
                            int i10 = I0 + 69;
                            J0 = i10 % 128;
                            int i11 = i10 % 2;
                            ul ulVar = new ul(context, compoundDrawableTintBlendMode, dividerPadding, ntVar, onFocusChangeListener2, setaccessibilitydelegate, sqVar, function1, function2, v9Var, this.v0, this.f61186r0, this.f61188t0, this.f61185q0, new tj(this.f61186r0, this.f61187s0, this.f61188t0, this.f61185q0, this.f61184p0.setOnFocusChangeListener()), null, 32768, null);
                            this.f61190w0 = ulVar;
                            ni.setCompoundDrawableTintBlendMode(new Object[]{ulVar}, 1060895242, -1060895242, System.identityHashCode(ulVar));
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        TerminalException terminalException = new TerminalException(5, null, null);
                        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                        throw terminalException;
                    }
                    TerminalException terminalException2 = new TerminalException(4, null, null);
                    mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException2;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void setOnFocusChangeListener(@NotNull ns nsVar) {
        Intrinsics.checkNotNullParameter(nsVar, "");
        ul ulVar = this.f61190w0;
        if (ulVar != null) {
            int i10 = I0 + 15;
            J0 = i10 % 128;
            int i11 = i10 % 2;
            ulVar.setX(nsVar);
            int i12 = I0 + 77;
            J0 = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public final void setOnFocusChangeListener() throws Throwable {
        setOnFocusChangeListener(new Object[]{this}, 434867013, -434867013, System.identityHashCode(this));
    }
}
