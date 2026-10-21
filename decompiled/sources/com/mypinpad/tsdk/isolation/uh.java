package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B7\u0012\u0006\u0010%\u001a\u00020$\u0012\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0015j\u0002`\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0015j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R \u0010\u001c\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/mypinpad/tsdk/internal/terminal/timeout/TransactionTimeoutHandler;", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutHandler;", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TransactionTimeoutState;", "", "onAuthorization", "onDispose", "onIdle", "onOnlinePin", "onProcessing", "onReady", "state", "setState", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutCounterType;", "timeoutCounterType", "timeoutCounterHandler", "Lcom/mypinpad/tsdk/internal/terminal/timeout/Counter;", "authorizationInProgressTimeoutCounter", "Lcom/mypinpad/tsdk/internal/terminal/timeout/Counter;", "currentState", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TransactionTimeoutState;", "discoveryTimeoutCounter", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionErrorCause;", "Lcom/mypinpad/tsdk/internal/terminal/timeout/OnTransactionTimeoutHandler;", "onTransactionTimeoutHandler", "Lkotlin/jvm/functions/Function1;", "pinEntryAccumulatedTimeoutCounter", "pinEntryTimeoutCounter", "totalElapsedTimeoutCounter", "getTotalElapsedTimeoutCounter", "()Lcom/mypinpad/tsdk/internal/terminal/timeout/Counter;", "getTotalElapsedTimeoutCounter$annotations", "()V", "Ljava/util/UUID;", "transactionId", "Ljava/util/UUID;", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutConfiguration;", "configuration", "Lcom/mypinpad/tsdk/internal/terminal/timeout/CounterFactory;", "counterFactory", "<init>", "(Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutConfiguration;Lkotlin/jvm/functions/Function1;Lcom/mypinpad/tsdk/internal/terminal/timeout/CounterFactory;Ljava/util/UUID;)V", "Companion", "sdk-android_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimeoutHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeoutHandler.kt\ncom/mypinpad/tsdk/internal/terminal/timeout/TransactionTimeoutHandler\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,214:1\n7#2,8:215\n7#2,8:223\n7#2,8:231\n7#2,8:239\n*S KotlinDebug\n*F\n+ 1 TimeoutHandler.kt\ncom/mypinpad/tsdk/internal/terminal/timeout/TransactionTimeoutHandler\n*L\n87#1:215,8\n109#1:223,8\n119#1:231,8\n140#1:239,8\n*E\n"})
public final class uh implements ue<ug> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static char[] f61265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f61266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f61267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f61268l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f61269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f61270o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f61271p = 0;

    @NotNull
    public static final setY setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<ro, Unit> f61272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UUID f61273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ug f61274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final tq f61275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final tq f61276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final tq f61277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final tq f61278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final tq f61279h;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<ud, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f61280p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f61281q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f61282r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f61283s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61284t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f61285u0;
        public static int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f61286w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final byte[] f61287x0 = null;

        static {
            c();
            v0 = 0;
            f61286w0 = 1;
            f61284t0 = 0;
            f61285u0 = 1;
            f61280p0 = 141040160;
            f61281q0 = -1454817053;
            f61282r0 = 1803075327;
            f61283s0 = new byte[]{-33, -93, -46, -96, -33, -61, -128, -33, -69, -48, -93, -48, -2, -103, -87, -48, -36, -94, -42, -89, MessageUtils.MESSAGE_26_SUB, -37, -93, -62, -52, MessageUtils.MESSAGE_18_DC2, -41, -6, -58, -13, -50, -13, 25, -92, -12, -13, -1, -51, -15, -30, MessageUtils.MESSAGE_18_DC2, -120, -12, -13, -1, -51, -15, -62, 50, UtilitiesSDKConstants.SRP_LABEL_ENC, -8, Constants.CVR_B2b87_11_RFU, -14, -55, -56, -6, -58, 50, UtilitiesSDKConstants.SRP_LABEL_ENC, -8, Constants.CVR_B2b87_11_RFU, -55, -6, -58, -13, -14, 15, -79, -4, -58, -12, 50, -72, Constants.CVR_B2b8765_1111_APP_DISABLED, -58, -9, -14, -50, -52, -7, 11, -73, -53, -7, -20, 17, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -6, -50, -3, -61, -6, -18, -93, -6, -58, -13, -50, -13, 25, -92, -12, -13, -1, -51, -15, -62, -108, -108};
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Object obj) throws Throwable {
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.getSize(0) - 98, (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((Process.myPid() >> 22) - 62), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1036911112, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1591649612, objArr);
            String strIntern = ((String) objArr[0]).intern();
            short s4 = (short) ((-97) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 31, (byte) TextUtils.getCapsMode("", 0, 0), s4, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1036911113, 1591649631 - ImageFormat.getBitsPerPixel(0), objArr2);
            super(1, obj, uh.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
            int i13;
            byte[] bArr;
            byte[] bArr2;
            int length;
            int i14;
            int i15 = f61281q0;
            setTextAlignment settextalignment = new setTextAlignment();
            StringBuilder sb2 = new StringBuilder();
            int i16 = 2;
            try {
                Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i15)};
                char c10 = 0;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-769569468);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionChild(0L) + 50, 434 - KeyEvent.normalizeMetaState(0));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, (byte) (b12 - 1), b12, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(-769569468, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                boolean z10 = iIntValue == -1;
                int i17 = f61280p0;
                byte[] bArr3 = f61283s0;
                if (z10) {
                    if (bArr3 != null) {
                        int i18 = v0 + 79;
                        f61286w0 = i18 % 128;
                        if (i18 % 2 == 0) {
                            length = bArr3.length;
                            bArr2 = new byte[length];
                            i14 = 1;
                        } else {
                            length = bArr3.length;
                            bArr2 = new byte[length];
                            i14 = 0;
                        }
                        int i19 = i14;
                        while (i19 < length) {
                            int i20 = f61286w0 + 91;
                            v0 = i20 % 128;
                            int i21 = i20 % i16;
                            Object[] objArr4 = new Object[1];
                            objArr4[c10] = Integer.valueOf(bArr3[i19]);
                            Map map2 = setTextScaleX.setMaxEms;
                            Object method2 = map2.get(510767826);
                            if (method2 == null) {
                                method2 = ((Class) setTextScaleX.setX((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49110), (KeyEvent.getMaxKeyCode() >> 16) + 41, (ViewConfiguration.getWindowTouchSlop() >> 8) + 52)).getMethod("s", Integer.TYPE);
                                map2.put(510767826, method2);
                            }
                            bArr2[i19] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                            i19++;
                            i16 = 2;
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
                        Class cls3 = (Class) setTextScaleX.setX((char) View.resolveSize(0, 0), Color.red(0) + 49, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 434);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        b(b13, (byte) (b14 - 1), b14, objArr6);
                        String str2 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, cls4, cls4);
                        map3.put(-769569468, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i15) ^ 7616081452308447380L)));
                }
                if (iIntValue > 0) {
                    int i22 = v0;
                    int i23 = i22 + 109;
                    f61286w0 = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = ((i12 + iIntValue) - 2) + ((int) (((long) i17) ^ 7616081452308447380L));
                    if (z10) {
                        i13 = 1;
                    } else {
                        int i26 = i22 + 21;
                        f61286w0 = i26 % 128;
                        int i27 = i26 % 2;
                        i13 = 0;
                    }
                    settextalignment.setX = i25 + i13;
                    Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f61282r0), sb2};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(193260760);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), AndroidCharacter.getMirror('0') + 2755);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 1);
                        Object[] objArr8 = new Object[1];
                        b(b15, (byte) (-b16), b16, objArr8);
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
                        int i28 = 0;
                        while (i28 < length2) {
                            int i29 = f61286w0 + 13;
                            v0 = i29 % 128;
                            if (i29 % 2 != 0) {
                                bArr[i28] = (byte) (((long) bArr3[i28]) ^ 7616081452308447380L);
                                i28 >>= 1;
                            } else {
                                bArr[i28] = (byte) (((long) bArr3[i28]) ^ 7616081452308447380L);
                                i28++;
                            }
                        }
                    } else {
                        bArr = bArr3;
                    }
                    boolean z11 = bArr != null;
                    settextalignment.setDividerPadding = 1;
                    while (settextalignment.setDividerPadding < iIntValue) {
                        if (!z11) {
                            settextalignment.setX--;
                            throw null;
                        }
                        int i30 = settextalignment.setX;
                        settextalignment.setX = i30 - 1;
                        char c11 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i30]) ^ 7616081452308447380L)) + s4)) ^ b10));
                        settextalignment.setCompoundDrawableTintBlendMode = c11;
                        sb2.append(c11);
                        settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                        settextalignment.setDividerPadding++;
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

        public static void b(byte b10, int i10, short s4, Object[] objArr) {
            int i11 = (s4 * 3) + 109;
            int i12 = i10 + 4;
            int i13 = b10 * 2;
            byte[] bArr = new byte[1 - i13];
            int i14 = 0 - i13;
            int i15 = -1;
            byte[] bArr2 = f61287x0;
            if (bArr2 == null) {
                i11 = i14 + i11;
                i14 = i14;
                i12 = i12;
            }
            while (true) {
                i15++;
                int i16 = i12 + 1;
                bArr[i15] = (byte) i11;
                if (i15 == i14) {
                    objArr[0] = new String(bArr, 0);
                    return;
                }
                byte b11 = bArr2[i16];
                i11 += b11;
                i14 = i14;
                i12 = i16;
            }
        }

        public static void c() {
            f61287x0 = new byte[]{15, -41, -95, -53};
        }

        public final void d(@NotNull ud udVar) throws Throwable {
            int i10 = f61285u0 + 35;
            f61284t0 = i10 % 128;
            if (i10 % 2 == 0) {
                Intrinsics.checkNotNullParameter(udVar, "");
                uh.setY((uh) this.receiver, udVar);
            } else {
                Intrinsics.checkNotNullParameter(udVar, "");
                uh.setY((uh) this.receiver, udVar);
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ud udVar) throws Throwable {
            int i10 = f61284t0 + 121;
            f61285u0 = i10 % 128;
            int i11 = i10 % 2;
            d(udVar);
            Unit unit = Unit.INSTANCE;
            if (i11 == 0) {
                int i12 = 34 / 0;
            }
            return unit;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<ud, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final long f61288p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61289q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61290r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f61291s0 = null;

        static {
            c();
            f61289q0 = 0;
            f61290r0 = 1;
            f61288p0 = 4458009225538914324L;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(Object obj) throws Throwable {
            Object[] objArr = new Object[1];
            a("꯷홝傀틃崰\udf65妽\udbc1䙔삙䋋촪佲즺䯉\uf65b炝\uf2c0紱ｳ禽", (Process.myPid() >> 22) + 32183, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("꯷\ue95f⺄揹ꄸ\ue67f㯉礳비\uf3abヿ瘰讚죀อ䍹肽엢᭕墉鷕퍲၁喣\ueb14⡃淎ꋹ\ue036╲竜렆ﵓ㊷短딓쪃࿙䴹艻쟤ԗ婟龐\udcfaሠ坫铙⨟漉겭\ue1e9✵撗맄．㱺熢뚮\uf440আ仏谰셧ڶ䐂餆\ude88\u13fe儧隘⯟椞깪\ue392⃫晊뮜\uf8d1㸽獡낒\uf600ଡ଼䢂趡썤V", 17078 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            super(1, obj, uh.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0170  */
        /* JADX WARN: Code duplicated, block: B:33:0x0171  */
        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            Throwable cause;
            char[] charArray = str.toCharArray();
            setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
            setlayoutanimation.setOnFocusChangeListener = i10;
            int length = charArray.length;
            long[] jArr = new long[length];
            setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
            while (true) {
                int i11 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                if (i11 >= charArray.length) {
                    break;
                }
                try {
                    Object[] objArr2 = {Integer.valueOf(charArray[i11]), setlayoutanimation, setlayoutanimation};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-16777183) - Color.rgb(0, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1194);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i11] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f61288p0 ^ 1779209353347916695L);
                    Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionType(0L), 44 - KeyEvent.getDeadChar(0, 0), 728 - TextUtils.indexOf("", "", 0, 0));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, (byte) (b13 + 1), b13, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            char[] cArr = new char[length];
            setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
            while (true) {
                int i12 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                if (i12 >= charArray.length) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i12] = (char) jArr[i12];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 44 - Color.green(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 727);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b14, (byte) (b15 + 1), b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002d  */
        /* JADX WARN: Code duplicated, block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x003a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r0 = 1 - r6
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r7 = r7 * 3
                int r7 = 110 - r7
                byte[] r0 = new byte[r0]
                r1 = 0
                int r6 = 0 - r6
                byte[] r2 = com.mypinpad.tsdk.i.uh.b.f61291s0
                if (r2 != 0) goto L1c
                r7 = r6
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                goto L3a
            L1c:
                r3 = r1
                r5 = r8
                r8 = r7
            L1f:
                r7 = r5
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L2d
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L2d:
                int r3 = r3 + 1
                r4 = r2[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L3a:
                int r8 = r8 + 1
                int r6 = r6 + r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r7
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.uh.b.b(int, byte, int, java.lang.Object[]):void");
        }

        public static void c() {
            f61291s0 = new byte[]{15, 17, 90, 8};
        }

        public final void d(@NotNull ud udVar) throws Throwable {
            int i10 = f61290r0 + 57;
            f61289q0 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(udVar, "");
            uh.setY((uh) this.receiver, udVar);
            int i12 = f61289q0 + 15;
            f61290r0 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ud udVar) throws Throwable {
            int i10 = f61290r0 + 15;
            f61289q0 = i10 % 128;
            int i11 = i10 % 2;
            d(udVar);
            Unit unit = Unit.INSTANCE;
            if (i11 != 0) {
                int i12 = 48 / 0;
            }
            int i13 = f61289q0 + 31;
            f61290r0 = i13 % 128;
            if (i13 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<ud, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final char f61292p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final char f61293q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final char f61294r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final char f61295s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61296t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f61297u0;
        public static int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f61298w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final byte[] f61299x0 = null;

        static {
            c();
            v0 = 0;
            f61298w0 = 1;
            f61296t0 = 0;
            f61297u0 = 1;
            f61295s0 = (char) 53459;
            f61294r0 = (char) 37192;
            f61292p0 = (char) 34575;
            f61293q0 = (char) 29867;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Object obj) throws Throwable {
            Object[] objArr = new Object[1];
            a("⹑婌ぇ遒ᴒ࣫⿑謽ᴒ࣫硫ꔯ❶\ue05fꄮ燱ʨ㈊뫚\uf8ac虖劮", (ViewConfiguration.getWindowTouchSlop() >> 8) + 21, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("⹑婌ぇ遒ᴒ࣫⿑謽ᴒ࣫硫ꔯ❶\ue05fꄮ燱ʨ㈊뫚\uf8ac얫釜彰⨌뚦䠚엙⇚椙勁≼\ueb68朓蠯䛡\uf8a2ﲘ㮞Ⳙ뵝㗑娲硫ꔯ❶\ue05f㔅◠⩇펒㕱䇧৶꣥≼\ueb68⪽队䷥靝䪌哸ﻮ\uf22c䒶襵ꡒ췧䪌哸ﻮ\uf22c䒶襵ￛ䶕۪딋㕱䇧≵諘椙勁ꀖ\udba4辠㞨", 88 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
            super(1, obj, uh.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            int i11;
            int i12 = v0 + 15;
            f61298w0 = i12 % 128;
            int i13 = 2;
            if (i12 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            char[] charArray = str.toCharArray();
            int i14 = f61298w0 + 51;
            v0 = i14 % 128;
            int i15 = i14 % 2;
            setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
            char[] cArr = new char[charArray.length];
            setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
            char[] cArr2 = new char[2];
            while (true) {
                int i16 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
                if (i16 >= charArray.length) {
                    objArr[0] = new String(cArr, 0, i10);
                    return;
                }
                int i17 = f61298w0 + 99;
                v0 = i17 % 128;
                int i18 = i17 % i13;
                cArr2[0] = charArray[i16];
                cArr2[1] = charArray[i16 + 1];
                int i19 = 58224;
                int i20 = 0;
                while (i20 < 16) {
                    int i21 = f61298w0 + 61;
                    v0 = i21 % 128;
                    int i22 = i21 % i13;
                    char c10 = cArr2[1];
                    char c11 = cArr2[0];
                    setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled2 = setalwaysdrawnwithcacheenabled;
                    int i23 = (c11 + i19) ^ ((c11 << 4) + ((char) (((long) f61294r0) ^ 4333817592127744003L)));
                    int i24 = c11 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(f61295s0);
                        objArr2[i13] = Integer.valueOf(i24);
                        objArr2[1] = Integer.valueOf(i23);
                        objArr2[0] = Integer.valueOf(c10);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(-1434759016);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (48534 - View.MeasureSpec.getMode(0)), 47 - KeyEvent.getDeadChar(0, 0), 2672 - View.MeasureSpec.getSize(0));
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 1);
                            Object[] objArr3 = new Object[1];
                            b(b10, b11, (byte) (b11 - 1), objArr3);
                            String str2 = (String) objArr3[0];
                            Class<?> cls2 = Integer.TYPE;
                            method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                            map.put(-1434759016, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr2[1] = cCharValue;
                        Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) f61292p0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f61293q0)};
                        Object method2 = map.get(-1434759016);
                        if (method2 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) (48534 - TextUtils.getTrimmedLength("")), 47 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 2672);
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 + 1);
                            Object[] objArr5 = new Object[1];
                            b(b12, b13, (byte) (b13 - 1), objArr5);
                            String str3 = (String) objArr5[0];
                            Class<?> cls4 = Integer.TYPE;
                            method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                            map.put(-1434759016, method2);
                        }
                        cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i19 -= 40503;
                        i20++;
                        setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled2;
                        i13 = 2;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled3 = setalwaysdrawnwithcacheenabled;
                int i25 = setalwaysdrawnwithcacheenabled3.setOnFocusChangeListener;
                cArr[i25] = cArr2[0];
                cArr[i25 + 1] = cArr2[1];
                Object[] objArr6 = {setalwaysdrawnwithcacheenabled3, setalwaysdrawnwithcacheenabled3};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1396159716);
                if (method3 != null) {
                    i11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, TextUtils.indexOf("", "") + 2145);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, b15, objArr7);
                    i11 = 2;
                    method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1396159716, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled3;
                i13 = i11;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0030  */
        /* JADX WARN: Code duplicated, block: B:8:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:11:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0030
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 2
                int r8 = 3 - r8
                int r6 = r6 * 4
                int r0 = 1 - r6
                int r7 = r7 * 2
                int r7 = 105 - r7
                byte[] r0 = new byte[r0]
                r1 = 0
                int r6 = 0 - r6
                byte[] r2 = com.mypinpad.tsdk.i.uh.c.f61299x0
                if (r2 != 0) goto L1b
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                goto L39
            L1b:
                r3 = r1
            L1c:
                r5 = r8
                r8 = r7
                r7 = r5
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L30
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L30:
                r3 = r2[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r5
            L39:
                int r7 = r7 + r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.uh.c.b(byte, byte, int, java.lang.Object[]):void");
        }

        public static void c() {
            f61299x0 = new byte[]{70, -122, 54, 105};
        }

        public final void d(@NotNull ud udVar) throws Throwable {
            int i10 = f61297u0 + 81;
            f61296t0 = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullParameter(udVar, "");
                uh.setY((uh) this.receiver, udVar);
                throw null;
            }
            Intrinsics.checkNotNullParameter(udVar, "");
            uh.setY((uh) this.receiver, udVar);
            int i11 = f61296t0 + 39;
            f61297u0 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 9 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ud udVar) throws Throwable {
            int i10 = f61297u0 + 11;
            f61296t0 = i10 % 128;
            int i11 = i10 % 2;
            d(udVar);
            Unit unit = Unit.INSTANCE;
            if (i11 != 0) {
                int i12 = 16 / 0;
            }
            int i13 = f61297u0 + 63;
            f61296t0 = i13 % 128;
            int i14 = i13 % 2;
            return unit;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<ud, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final long f61300p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61301q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61302r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final int f61303s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final byte[] f61304t0 = null;

        static {
            b();
            f61303s0 = 1;
            f61301q0 = 0;
            f61302r0 = 1;
            f61300p0 = -5799722185236673779L;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Object obj) throws Throwable {
            Object[] objArr = new Object[1];
            a("靍霹\ud836澄ﾍ㉒⁍䕁ࡪὙ脜⒯ꦲ븡\ue1de萠䫰\uddee䊰杽\uea03粠ꌬ욡譗", ExpandableListView.getPackedPositionGroup(0L), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("ꕫꔟ\ue998䄦츣佅\u0eef㡖㩌\u2ef7꾾妸鮔辏콼路磖\uec40氒ᩪ\ud825䴎趎뮶륱궊ⵦ\udcf8Ẵ\u0a77䩝簎￪欢\uebd3鵅彛쯫ࢦ㻜㲗⢱ꡮ忐鶔襓줼ｷ紖ᘀ更ª퉧皅虖ꇶ뎱힏✃섵ჺ㐶䒝扗\uf03a铿\ue59f莄冞\uf5beԭⓧ㛊副ꈯ䐔阎댎쏑\ue5ac睆Ꮬ悮ۮ풹炾耛꘣뗦턙Ↄ읍", ExpandableListView.getPackedPositionChild(0L) + 1, objArr2);
            super(1, obj, uh.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0101 A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:6:0x0038, B:10:0x005f, B:11:0x0094, B:13:0x00a4, B:23:0x0124, B:16:0x00b8, B:20:0x00f9, B:22:0x0101, B:26:0x0130), top: B:35:0x0038 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0130 A[Catch: all -> 0x012e, TRY_LEAVE, TryCatch #0 {all -> 0x012e, blocks: (B:6:0x0038, B:10:0x005f, B:11:0x0094, B:13:0x00a4, B:23:0x0124, B:16:0x00b8, B:20:0x00f9, B:22:0x0101, B:26:0x0130), top: B:35:0x0038 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0138 -> B:28:0x0141). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(java.lang.String r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.uh.d.a(java.lang.String, int, java.lang.Object[]):void");
        }

        public static void b() {
            f61304t0 = new byte[]{74, -53, -69, 45};
        }

        public final void c(@NotNull ud udVar) throws Throwable {
            int i10 = f61301q0 + 47;
            f61302r0 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(udVar, "");
            uh.setY((uh) this.receiver, udVar);
            int i12 = f61302r0 + 37;
            f61301q0 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ud udVar) throws Throwable {
            int i10 = f61302r0 + 29;
            f61301q0 = i10 % 128;
            int i11 = i10 % 2;
            c(udVar);
            if (i11 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<ud, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final char[] f61305p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final long f61306q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61307r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61308s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61309t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f61310u0;
        public static final byte[] v0 = null;

        static {
            c();
            f61309t0 = 0;
            f61310u0 = 1;
            f61307r0 = 0;
            f61308s0 = 1;
            f61306q0 = 3374191004359415566L;
            f61305p0 = new char[]{28856, 57783, 21125, 50079, 13547, 42467, 5844, 34801, 63539, 26907, 55830, 19326, 48241, 11604, 40568, 61603, 24962, 53914, 17380, 46335, 9686, 50792, 22375, 58453, 30031, 33339, 4915, 40964, 12577, 20195, 57291, 27846, 64942, 2721, 39812, 10408, 18035, 55122, 25674, 62772, 559, 37638, 8270, 45532, 52961, 24515, 60595, 32231, 35479, 7069, 43366, 50793, 22364, 58412, 29999, 33308, 4933, 41184, 12789, 20180, 57289, 27875, 64919, 2694, 39022, 10593, 17988, 55118, 25651, 62736, 577, 37868, 8431, 45510, 52939, 24505, 60588, 32141, 35698, 6183, 43342, 50765, 22331, 58405, 29981, 33513, 5114, 41111, 12798, 20157, 57259, 27797, 64909, 2937, 38986, 10603, 17973, 55089, 25624, 62740, 759, 37838, 8442, 45473, 52922, 24465, 60637, 31289, 35668};
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public e(Object obj) throws Throwable {
            Object[] objArr = new Object[1];
            a((char) (46800 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.combineMeasuredStates(0, 0), 21 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((char) TextUtils.getOffsetAfter("", 0), Process.getGidForName("") + 22, ExpandableListView.getPackedPositionChild(0L) + 89, objArr2);
            super(1, obj, uh.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Code duplicated, block: B:60:0x0368  */
        /* JADX WARN: Code duplicated, block: B:61:0x0369  */
        public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
            int i12;
            Throwable cause;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
            long[] jArr = new long[i11];
            char c11 = 0;
            setcompounddrawabletintblendmode.setDividerPadding = 0;
            while (true) {
                int i13 = setcompounddrawabletintblendmode.setDividerPadding;
                if (i13 >= i11) {
                    break;
                }
                int i14 = f61310u0 + 59;
                f61309t0 = i14 % 128;
                int i15 = i14 % 2;
                long j10 = f61306q0;
                char[] cArr = f61305p0;
                if (i15 != 0) {
                    char c12 = cArr[i10 * i13];
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[c11] = Integer.valueOf(c12);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(1832327647);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) KeyEvent.keyCodeFromString(""), 44 - ExpandableListView.getPackedPositionGroup(0L), 727 - ExpandableListView.getPackedPositionChild(0L));
                            byte b10 = (byte) (-1);
                            byte b11 = (byte) (b10 + 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, b10, b11, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(1832327647, method);
                        }
                        Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(j10), Integer.valueOf(c10)};
                        Object method2 = map.get(2012362404);
                        if (method2 == null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 46116), 43 - (ViewConfiguration.getPressedStateDuration() >> 16), 1776 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            byte b12 = (byte) (-1);
                            byte b13 = (byte) (-b12);
                            Object[] objArr5 = new Object[1];
                            b((byte) (b13 - 1), b12, b13, objArr5);
                            String str = (String) objArr5[0];
                            Class<?> cls3 = Long.TYPE;
                            method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                            map.put(2012362404, method2);
                        }
                        jArr[i13] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                        Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                        Object method3 = map.get(1606688712);
                        if (method3 == null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 28, 2310 - ((byte) KeyEvent.getModifierMetaStateMask()));
                            byte b14 = (byte) (-1);
                            byte b15 = (byte) (b14 & 5);
                            Object[] objArr7 = new Object[1];
                            b((byte) (b15 - 5), b14, b15, objArr7);
                            method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                            map.put(1606688712, method3);
                        }
                        ((Method) method3).invoke(null, objArr6);
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr8 = {Integer.valueOf(cArr[i10 + i13])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method4 = map2.get(1832327647);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) (AndroidCharacter.getMirror('0') - '0'), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 728 - Gravity.getAbsoluteGravity(0, 0));
                        byte b16 = (byte) (-1);
                        byte b17 = (byte) (b16 + 1);
                        Object[] objArr9 = new Object[1];
                        b(b17, b16, b17, objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], Integer.TYPE);
                        map2.put(1832327647, method4);
                    }
                    Object[] objArr10 = {Long.valueOf(((Long) ((Method) method4).invoke(null, objArr8)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(j10), Integer.valueOf(c10)};
                    Object method5 = map2.get(2012362404);
                    if (method5 == null) {
                        Class cls6 = (Class) setTextScaleX.setX((char) (46116 - ExpandableListView.getPackedPositionType(0L)), ((Process.getThreadPriority(0) + 20) >> 6) + 43, 1777 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b18 = (byte) (-1);
                        byte b19 = (byte) (-b18);
                        Object[] objArr11 = new Object[1];
                        b((byte) (b19 - 1), b18, b19, objArr11);
                        String str2 = (String) objArr11[0];
                        Class<?> cls7 = Long.TYPE;
                        method5 = cls6.getMethod(str2, cls7, cls7, cls7, Integer.TYPE);
                        map2.put(2012362404, method5);
                    }
                    jArr[i13] = ((Long) ((Method) method5).invoke(null, objArr10)).longValue();
                    Object[] objArr12 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                    Object method6 = map2.get(1606688712);
                    if (method6 == null) {
                        Class cls8 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777243, 2312 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        byte b20 = (byte) (-1);
                        byte b21 = (byte) (b20 & 5);
                        Object[] objArr13 = new Object[1];
                        b((byte) (b21 - 5), b20, b21, objArr13);
                        method6 = cls8.getMethod((String) objArr13[0], Object.class, Object.class);
                        map2.put(1606688712, method6);
                    }
                    ((Method) method6).invoke(null, objArr12);
                }
                c11 = 0;
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            char[] cArr2 = new char[i11];
            setcompounddrawabletintblendmode.setDividerPadding = 0;
            int i16 = f61309t0 + 63;
            f61310u0 = i16 % 128;
            int i17 = 2;
            int i18 = i16 % 2;
            while (true) {
                int i19 = setcompounddrawabletintblendmode.setDividerPadding;
                if (i19 >= i11) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                cArr2[i19] = (char) jArr[i19];
                Object[] objArr14 = new Object[i17];
                objArr14[1] = setcompounddrawabletintblendmode;
                objArr14[0] = setcompounddrawabletintblendmode;
                Map map3 = setTextScaleX.setMaxEms;
                Object method7 = map3.get(1606688712);
                if (method7 != null) {
                    i12 = 2;
                } else {
                    Class cls9 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarSize() >> 8) + 27, (ViewConfiguration.getEdgeSlop() >> 16) + 2311);
                    byte b22 = (byte) (-1);
                    byte b23 = (byte) (b22 & 5);
                    Object[] objArr15 = new Object[1];
                    b((byte) (b23 - 5), b22, b23, objArr15);
                    i12 = 2;
                    method7 = cls9.getMethod((String) objArr15[0], Object.class, Object.class);
                    map3.put(1606688712, method7);
                }
                ((Method) method7).invoke(null, objArr14);
                i17 = i12;
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
        public static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                int r8 = r8 + 67
                int r6 = r6 * 2
                int r6 = 1 - r6
                byte[] r0 = new byte[r6]
                byte[] r1 = com.mypinpad.tsdk.i.uh.e.v0
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                goto L34
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r4 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L34:
                int r6 = r6 + r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.uh.e.b(int, short, short, java.lang.Object[]):void");
        }

        public static void c() {
            v0 = new byte[]{16, 49, -20, -72};
        }

        public final void d(@NotNull ud udVar) throws Throwable {
            int i10 = f61308s0 + 45;
            f61307r0 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(udVar, "");
            uh.setY((uh) this.receiver, udVar);
            int i12 = f61308s0 + 33;
            f61307r0 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ud udVar) throws Throwable {
            int i10 = f61308s0 + 39;
            f61307r0 = i10 % 128;
            int i11 = i10 % 2;
            d(udVar);
            Unit unit = Unit.INSTANCE;
            int i12 = f61307r0 + 59;
            f61308s0 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 57 / 0;
            }
            return unit;
        }
    }

    public /* synthetic */ class setX {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f61311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f61312b;
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[ug.values().length];
            try {
                iArr[ug.setCompoundDrawableTintBlendMode.ordinal()] = 1;
                int i10 = -(-0);
                int i11 = ((57 | i10) << 1) - (i10 ^ 57);
                f61312b = i11 % 128;
                int i12 = i11 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ug.setX.ordinal()] = 2;
                int i13 = f61311a;
                int i14 = ((i13 ^ 7) | (i13 & 7)) << 1;
                int i15 = -(((~i13) & 7) | (i13 & (-8)));
                int i16 = (i14 & i15) + (i15 | i14);
                f61312b = i16 % 128;
                int i17 = i16 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ug.setY.ordinal()] = 3;
                int i18 = f61311a + 125;
                f61312b = i18 % 128;
                int i19 = i18 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ug.setOnFocusChangeListener.ordinal()] = 4;
                int i20 = f61311a;
                int i21 = (i20 & 75) + (i20 | 75);
                f61312b = i21 % 128;
                int i22 = i21 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ug.setDividerPadding.ordinal()] = 5;
                int i23 = f61311a;
                int i24 = i23 | 83;
                int i25 = ((i24 << 1) - (~(-((~(i23 & 83)) & i24)))) - 1;
                f61312b = i25 % 128;
                int i26 = i25 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ug.setOnLongClickListener.ordinal()] = 6;
                int i27 = f61312b;
                int i28 = i27 & 55;
                int i29 = (((i27 ^ 55) | i28) << 1) - ((i27 | 55) & (~i28));
                f61311a = i29 % 128;
                int i30 = i29 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            setX = iArr;
            int[] iArr2 = new int[ud.values().length];
            try {
                iArr2[ud.setOnFocusChangeListener.ordinal()] = 1;
                int i31 = f61311a;
                int i32 = i31 | 5;
                int i33 = i32 << 1;
                int i34 = -((~(i31 & 5)) & i32);
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                f61312b = i35 % 128;
                int i36 = i35 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ud.setDividerPadding.ordinal()] = 2;
                int i37 = f61311a + 25;
                f61312b = i37 % 128;
                int i38 = i37 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ud.setX.ordinal()] = 3;
                int i39 = f61311a;
                int i40 = (i39 ^ 99) + ((i39 & 99) << 1);
                f61312b = i40 % 128;
                int i41 = i40 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ud.setY.ordinal()] = 4;
                int i42 = f61311a;
                int i43 = ((((i42 ^ 103) | (i42 & 103)) << 1) - (~(-(((~i42) & 103) | (i42 & (-104)))))) - 1;
                f61312b = i43 % 128;
                int i44 = i43 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ud.setCompoundDrawableTintBlendMode.ordinal()] = 5;
                int i45 = f61312b;
                int i46 = (i45 & (-92)) | ((~i45) & 91);
                int i47 = -(-((i45 & 91) << 1));
                int i48 = (i46 & i47) + (i47 | i46);
                f61311a = i48 % 128;
                int i49 = i48 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ud.setOnLongClickListener.ordinal()] = 6;
                int i50 = f61312b;
                int i51 = (i50 & 87) + (i50 | 87);
                f61311a = i51 % 128;
                int i52 = i51 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ud.getNavBarTitleString.ordinal()] = 7;
                int i53 = f61311a;
                int i54 = (i53 & 31) + (i53 | 31);
                f61312b = i54 % 128;
                int i55 = i54 % 2;
            } catch (NoSuchFieldError unused13) {
            }
            setDividerPadding = iArr2;
            int i56 = f61312b;
            int i57 = (i56 & 35) + (i56 | 35);
            f61311a = i57 % 128;
            if (i57 % 2 != 0) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/uh$setY;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class setY {
        public setY() {
        }

        public /* synthetic */ setY(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b();
        m = 0;
        f61269n = 1;
        i();
        setCompoundDrawableTintBlendMode = new setY(null);
        int i10 = m + 31;
        f61269n = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 19 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uh(@NotNull tw twVar, @NotNull Function1<? super ro, Unit> function1, @NotNull tv tvVar, @NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(twVar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(tvVar, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        this.f61272a = function1;
        this.f61273b = uuid;
        this.f61275d = tvVar.setX(((Integer) tw.setOnFocusChangeListener(new Object[]{twVar}, -1722216703, 1722216705, System.identityHashCode(twVar))).intValue(), ud.setOnFocusChangeListener, new d(this));
        this.f61276e = tvVar.setX(((Integer) tw.setOnFocusChangeListener(new Object[]{twVar}, -126271106, 126271106, System.identityHashCode(twVar))).intValue(), ud.setDividerPadding, new c(this));
        this.f61277f = tvVar.setX(90000, ud.setX, new e(this));
        this.f61278g = tvVar.setX(30000, ud.setY, new a(this));
        this.f61279h = tvVar.setX(((Integer) tw.setOnFocusChangeListener(new Object[]{twVar}, -1307839193, 1307839194, System.identityHashCode(twVar))).intValue(), ud.setCompoundDrawableTintBlendMode, new b(this));
        h(ug.setDividerPadding);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 4
            int r7 = r7 * 2
            int r7 = 122 - r7
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.uh.f61270o
            if (r2 != 0) goto L1a
            r7 = r8
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            goto L36
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2a:
            r4 = r2[r9]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r6
        L36:
            int r8 = r8 + r9
            int r9 = r10 + 1
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.uh.a(int, short, short, java.lang.Object[]):void");
    }

    public static void b() {
        f61270o = new byte[]{76, 17, -23, -60};
        f61271p = 10;
    }

    public static void i() {
        f61267k = true;
        f61268l = true;
        f61266j = 1794962190;
        f61265i = new char[]{62099, 62097, 62108, 62101, 62106, 62098};
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        uh uhVar = (uh) objArr[0];
        int i13 = m + 125;
        f61269n = i13 % 128;
        if (i13 % 2 == 0) {
            uhVar.f61275d.setY();
            uhVar.f61276e.setY();
            uhVar.f61277f.setY();
            uhVar.f61278g.setY();
            uhVar.f61279h.setY();
            throw null;
        }
        uhVar.f61275d.setY();
        uhVar.f61276e.setY();
        uhVar.f61277f.setY();
        uhVar.f61278g.setY();
        uhVar.f61279h.setY();
        int i14 = f61269n + 3;
        m = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 53 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void setY(uh uhVar, ud udVar) throws Throwable {
        int i10 = m + 101;
        f61269n = i10 % 128;
        int i11 = i10 % 2;
        uhVar.j(udVar);
        if (i11 == 0) {
            int i12 = 23 / 0;
        }
    }

    public final void c() throws TerminalException {
        int i10 = f61269n;
        int i11 = i10 + 113;
        m = i11 % 128;
        int i12 = i11 % 2;
        ug ugVar = this.f61274c;
        if (ugVar == null) {
            int i13 = i10 + 75;
            m = i13 % 128;
            int i14 = i13 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            ugVar = null;
        }
        int i15 = setX.setX[ugVar.ordinal()];
        tq tqVar = this.f61277f;
        tq tqVar2 = this.f61278g;
        if (i15 == 1) {
            tqVar.setCompoundDrawableTintBlendMode();
            tqVar2.setCompoundDrawableTintBlendMode();
            return;
        }
        if (i15 == 2) {
            tqVar2.setCompoundDrawableTintBlendMode();
            return;
        }
        if (i15 == 3) {
            this.f61279h.setX();
            this.f61275d.setCompoundDrawableTintBlendMode();
            tqVar.setCompoundDrawableTintBlendMode();
            tqVar2.setCompoundDrawableTintBlendMode();
            return;
        }
        ug ugVar2 = this.f61274c;
        if (ugVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            ugVar2 = null;
        }
        TerminalException terminalException = new TerminalException(10015, String.valueOf(ugVar2), null);
        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
        throw terminalException;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void d() throws TerminalException {
        ug ugVar;
        int i10 = m + 21;
        f61269n = i10 % 128;
        if (i10 % 2 == 0) {
            ugVar = this.f61274c;
            int i11 = 96 / 0;
            if (ugVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i12 = m + 9;
                f61269n = i12 % 128;
                int i13 = i12 % 2;
                ugVar = null;
            }
        } else {
            ugVar = this.f61274c;
            if (ugVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i14 = m + 9;
                f61269n = i14 % 128;
                int i15 = i14 % 2;
                ugVar = null;
            }
        }
        if (setX.setX[ugVar.ordinal()] == 4) {
            this.f61276e.setX();
            return;
        }
        ug ugVar2 = this.f61274c;
        if (ugVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i16 = f61269n + 27;
            m = i16 % 128;
            int i17 = i16 % 2;
            ugVar2 = null;
        }
        TerminalException terminalException = new TerminalException(10015, String.valueOf(ugVar2), null);
        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
        throw terminalException;
    }

    public final void e() {
        int i10 = m + 17;
        f61269n = i10 % 128;
        int i11 = i10 % 2;
        tq tqVar = this.f61279h;
        tq tqVar2 = this.f61278g;
        tq tqVar3 = this.f61277f;
        tq tqVar4 = this.f61276e;
        tq tqVar5 = this.f61275d;
        if (i11 == 0) {
            tqVar5.setOnFocusChangeListener();
            tqVar4.setOnFocusChangeListener();
            tqVar3.setOnFocusChangeListener();
            tqVar2.setOnFocusChangeListener();
            tqVar.setOnFocusChangeListener();
            throw null;
        }
        tqVar5.setOnFocusChangeListener();
        tqVar4.setOnFocusChangeListener();
        tqVar3.setOnFocusChangeListener();
        tqVar2.setOnFocusChangeListener();
        tqVar.setOnFocusChangeListener();
        int i12 = f61269n + 97;
        m = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void f() throws TerminalException {
        ug ugVar;
        int i10 = m + 55;
        f61269n = i10 % 128;
        if (i10 % 2 == 0) {
            ugVar = this.f61274c;
            int i11 = 28 / 0;
            if (ugVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                ugVar = null;
            }
        } else {
            ugVar = this.f61274c;
            if (ugVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                ugVar = null;
            }
        }
        int i12 = setX.setX[ugVar.ordinal()];
        tq tqVar = this.f61276e;
        if (i12 == 1) {
            tqVar.setCompoundDrawableTintBlendMode();
            return;
        }
        tq tqVar2 = this.f61275d;
        if (i12 == 3) {
            this.f61279h.setX();
            tqVar2.setCompoundDrawableTintBlendMode();
            tqVar.setCompoundDrawableTintBlendMode();
            return;
        }
        if (i12 == 5) {
            tqVar2.setCompoundDrawableTintBlendMode();
            tqVar.setCompoundDrawableTintBlendMode();
            return;
        }
        ug ugVar2 = this.f61274c;
        if (ugVar2 == null) {
            int i13 = m + 103;
            f61269n = i13 % 128;
            int i14 = i13 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i14 == 0) {
                throw null;
            }
            ugVar2 = null;
        }
        TerminalException terminalException = new TerminalException(10015, String.valueOf(ugVar2), null);
        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
        throw terminalException;
    }

    public final void g() throws TerminalException {
        int i10 = f61269n;
        int i11 = i10 + 91;
        m = i11 % 128;
        int i12 = i11 % 2;
        ug ugVar = this.f61274c;
        if (ugVar == null) {
            int i13 = i10 + 31;
            m = i13 % 128;
            if (i13 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i14 = 91 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ugVar = null;
        }
        int i15 = setX.setX[ugVar.ordinal()];
        tq tqVar = this.f61279h;
        tq tqVar2 = this.f61275d;
        if (i15 == 1) {
            tqVar2.setX();
            tqVar.setCompoundDrawableTintBlendMode();
            return;
        }
        if (i15 == 2) {
            tqVar2.setX();
            this.f61277f.setX();
            this.f61278g.setX();
            tqVar.setCompoundDrawableTintBlendMode();
            return;
        }
        ug ugVar2 = this.f61274c;
        if (ugVar2 == null) {
            int i16 = m + 117;
            f61269n = i16 % 128;
            if (i16 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            ugVar2 = null;
        }
        TerminalException terminalException = new TerminalException(10015, String.valueOf(ugVar2), null);
        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
        throw terminalException;
    }

    public final synchronized void h(@NotNull ug ugVar) {
        try {
            int i10 = m + 5;
            f61269n = i10 % 128;
            if (i10 % 2 == 0) {
                Intrinsics.checkNotNullParameter(ugVar, "");
                int i11 = setX.setX[ugVar.ordinal()];
                throw null;
            }
            Intrinsics.checkNotNullParameter(ugVar, "");
            switch (setX.setX[ugVar.ordinal()]) {
                case 1:
                    d();
                    int i12 = f61269n + 121;
                    m = i12 % 128;
                    int i13 = i12 % 2;
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    g();
                    break;
                case 4:
                    f();
                    break;
                case 5:
                    e();
                    break;
                case 6:
                    setX(new Object[]{this}, -82898951, 82898951, System.identityHashCode(this));
                    break;
            }
            this.f61274c = ugVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:16:0x0047, B:20:0x00a5, B:19:0x0063, B:27:0x00ca, B:31:0x0123, B:38:0x0151, B:42:0x01af, B:41:0x016c, B:30:0x00e3), top: B:72:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:16:0x0047, B:20:0x00a5, B:19:0x0063, B:27:0x00ca, B:31:0x0123, B:38:0x0151, B:42:0x01af, B:41:0x016c, B:30:0x00e3), top: B:72:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0136  */
    /* JADX WARN: Code duplicated, block: B:37:0x0144  */
    /* JADX WARN: Code duplicated, block: B:40:0x0168  */
    /* JADX WARN: Code duplicated, block: B:41:0x016c A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:16:0x0047, B:20:0x00a5, B:19:0x0063, B:27:0x00ca, B:31:0x0123, B:38:0x0151, B:42:0x01af, B:41:0x016c, B:30:0x00e3), top: B:72:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0206  */
    /* JADX WARN: Code duplicated, block: B:64:0x020a  */
    /* JADX WARN: Code duplicated, block: B:66:0x020c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b8 A[EDGE_INSN: B:75:0x01b8->B:44:0x01b8 BREAK  A[LOOP:1: B:35:0x013e->B:43:0x01b5], SYNTHETIC] */
    public final void j(ud udVar) throws Throwable {
        int maximumDrawingCacheSize;
        byte[] bytes;
        setZ setz;
        char[] cArr;
        String str;
        int i10;
        Map map;
        Object method;
        int iIntValue;
        char[] cArr2;
        int i11;
        int i12;
        Map map2;
        Object method2;
        int length;
        char[] cArr3;
        int i13;
        Map map3;
        Object method3;
        int i14 = 0;
        if (udVar != ud.setY) {
            int i15 = f61269n + 21;
            m = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 13 / 0;
                if (udVar == ud.setX) {
                    maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127;
                    bytes = "\u0086\u0084\u0085\u0085\u0084\u0081\u0083\u0082\u0081".getBytes("ISO-8859-1");
                    setz = new setZ();
                    cArr = f61265i;
                    str = "";
                    i10 = 1;
                    if (cArr != null) {
                        length = cArr.length;
                        cArr3 = new char[length];
                        i13 = 0;
                        while (i13 < length) {
                            try {
                                Object[] objArr = new Object[i10];
                                objArr[i14] = Integer.valueOf(cArr[i13]);
                                map3 = setTextScaleX.setMaxEms;
                                method3 = map3.get(1129500232);
                                if (method3 == null) {
                                    Class cls = (Class) setTextScaleX.setX((char) (Drawable.resolveOpacity(i14, i14) + 26288), 64 - TextUtils.getOffsetAfter(str, i14), Gravity.getAbsoluteGravity(i14, i14) + 1595);
                                    byte b10 = (byte) (f61271p >>> 2);
                                    byte b11 = (byte) (b10 - 2);
                                    Object[] objArr2 = new Object[1];
                                    a(b10, b11, b11, objArr2);
                                    method3 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                                    map3.put(1129500232, method3);
                                }
                                cArr3[i13] = ((Character) ((Method) method3).invoke(null, objArr)).charValue();
                                i13++;
                                cArr = cArr;
                                str = str;
                                i14 = 0;
                                i10 = 1;
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                        }
                        cArr = cArr3;
                    }
                    Object[] objArr3 = {Integer.valueOf(f61266j)};
                    map = setTextScaleX.setMaxEms;
                    method = map.get(1019674483);
                    if (method == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10743), 43 - View.getDefaultSize(0, 0), (-16776650) - Color.rgb(0, 0, 0));
                        byte b12 = (byte) 1;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, b13, objArr4);
                        method = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                        map.put(1019674483, method);
                    }
                    iIntValue = ((Integer) ((Method) method).invoke(null, objArr3)).intValue();
                    if (!f61268l) {
                        if (!f61267k) {
                            throw null;
                        }
                        throw null;
                    }
                    int length2 = bytes.length;
                    setz.setOnFocusChangeListener = length2;
                    cArr2 = new char[length2];
                    setz.setDividerPadding = 0;
                    while (true) {
                        i11 = setz.setDividerPadding;
                        i12 = setz.setOnFocusChangeListener;
                        if (i11 >= i12) {
                            break;
                        }
                        cArr2[i11] = (char) (cArr[bytes[(i12 - 1) - i11] + maximumDrawingCacheSize] - iIntValue);
                        Object[] objArr5 = {setz, setz};
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(-1539766653);
                        if (method2 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 52 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 2880);
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            Object[] objArr6 = new Object[1];
                            a(b14, b15, b15, objArr6);
                            method2 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                            map2.put(-1539766653, method2);
                        }
                        ((Method) method2).invoke(null, objArr5);
                        iIntValue = iIntValue;
                    }
                    pc.setY(new pe(this.f61273b, n1.f(cArr2)));
                }
            } else if (udVar == ud.setX) {
                maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127;
                bytes = "\u0086\u0084\u0085\u0085\u0084\u0081\u0083\u0082\u0081".getBytes("ISO-8859-1");
                setz = new setZ();
                cArr = f61265i;
                str = "";
                i10 = 1;
                if (cArr != null) {
                    length = cArr.length;
                    cArr3 = new char[length];
                    i13 = 0;
                    while (i13 < length) {
                        Object[] objArr7 = new Object[i10];
                        objArr7[i14] = Integer.valueOf(cArr[i13]);
                        map3 = setTextScaleX.setMaxEms;
                        method3 = map3.get(1129500232);
                        if (method3 == null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) (Drawable.resolveOpacity(i14, i14) + 26288), 64 - TextUtils.getOffsetAfter(str, i14), Gravity.getAbsoluteGravity(i14, i14) + 1595);
                            byte b16 = (byte) (f61271p >>> 2);
                            byte b17 = (byte) (b16 - 2);
                            Object[] objArr8 = new Object[1];
                            a(b16, b17, b17, objArr8);
                            method3 = cls4.getMethod((String) objArr8[0], Integer.TYPE);
                            map3.put(1129500232, method3);
                        }
                        cArr3[i13] = ((Character) ((Method) method3).invoke(null, objArr7)).charValue();
                        i13++;
                        cArr = cArr;
                        str = str;
                        i14 = 0;
                        i10 = 1;
                    }
                    cArr = cArr3;
                }
                Object[] objArr9 = {Integer.valueOf(f61266j)};
                map = setTextScaleX.setMaxEms;
                method = map.get(1019674483);
                if (method == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10743), 43 - View.getDefaultSize(0, 0), (-16776650) - Color.rgb(0, 0, 0));
                    byte b18 = (byte) 1;
                    byte b19 = (byte) (b18 - 1);
                    Object[] objArr10 = new Object[1];
                    a(b18, b19, b19, objArr10);
                    method = cls5.getMethod((String) objArr10[0], Integer.TYPE);
                    map.put(1019674483, method);
                }
                iIntValue = ((Integer) ((Method) method).invoke(null, objArr9)).intValue();
                if (!f61268l) {
                    if (!f61267k) {
                        throw null;
                    }
                    throw null;
                }
                int length3 = bytes.length;
                setz.setOnFocusChangeListener = length3;
                cArr2 = new char[length3];
                setz.setDividerPadding = 0;
                while (true) {
                    i11 = setz.setDividerPadding;
                    i12 = setz.setOnFocusChangeListener;
                    if (i11 >= i12) {
                        break;
                        break;
                    }
                    cArr2[i11] = (char) (cArr[bytes[(i12 - 1) - i11] + maximumDrawingCacheSize] - iIntValue);
                    Object[] objArr11 = {setz, setz};
                    map2 = setTextScaleX.setMaxEms;
                    method2 = map2.get(-1539766653);
                    if (method2 == null) {
                        Class cls6 = (Class) setTextScaleX.setX((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 52 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 2880);
                        byte b110 = (byte) 0;
                        byte b111 = b110;
                        Object[] objArr12 = new Object[1];
                        a(b110, b111, b111, objArr12);
                        method2 = cls6.getMethod((String) objArr12[0], Object.class, Object.class);
                        map2.put(-1539766653, method2);
                    }
                    ((Method) method2).invoke(null, objArr11);
                    iIntValue = iIntValue;
                }
                pc.setY(new pe(this.f61273b, n1.f(cArr2)));
            }
        } else {
            maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127;
            bytes = "\u0086\u0084\u0085\u0085\u0084\u0081\u0083\u0082\u0081".getBytes("ISO-8859-1");
            setz = new setZ();
            cArr = f61265i;
            str = "";
            i10 = 1;
            if (cArr != null) {
                length = cArr.length;
                cArr3 = new char[length];
                i13 = 0;
                while (i13 < length) {
                    Object[] objArr13 = new Object[i10];
                    objArr13[i14] = Integer.valueOf(cArr[i13]);
                    map3 = setTextScaleX.setMaxEms;
                    method3 = map3.get(1129500232);
                    if (method3 == null) {
                        Class cls7 = (Class) setTextScaleX.setX((char) (Drawable.resolveOpacity(i14, i14) + 26288), 64 - TextUtils.getOffsetAfter(str, i14), Gravity.getAbsoluteGravity(i14, i14) + 1595);
                        byte b112 = (byte) (f61271p >>> 2);
                        byte b113 = (byte) (b112 - 2);
                        Object[] objArr14 = new Object[1];
                        a(b112, b113, b113, objArr14);
                        method3 = cls7.getMethod((String) objArr14[0], Integer.TYPE);
                        map3.put(1129500232, method3);
                    }
                    cArr3[i13] = ((Character) ((Method) method3).invoke(null, objArr13)).charValue();
                    i13++;
                    cArr = cArr;
                    str = str;
                    i14 = 0;
                    i10 = 1;
                }
                cArr = cArr3;
            }
            Object[] objArr15 = {Integer.valueOf(f61266j)};
            map = setTextScaleX.setMaxEms;
            method = map.get(1019674483);
            if (method == null) {
                Class cls8 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10743), 43 - View.getDefaultSize(0, 0), (-16776650) - Color.rgb(0, 0, 0));
                byte b114 = (byte) 1;
                byte b115 = (byte) (b114 - 1);
                Object[] objArr16 = new Object[1];
                a(b114, b115, b115, objArr16);
                method = cls8.getMethod((String) objArr16[0], Integer.TYPE);
                map.put(1019674483, method);
            }
            iIntValue = ((Integer) ((Method) method).invoke(null, objArr15)).intValue();
            if (!f61268l) {
                if (!f61267k) {
                    throw null;
                }
                throw null;
            }
            int length4 = bytes.length;
            setz.setOnFocusChangeListener = length4;
            cArr2 = new char[length4];
            setz.setDividerPadding = 0;
            while (true) {
                i11 = setz.setDividerPadding;
                i12 = setz.setOnFocusChangeListener;
                if (i11 >= i12) {
                    break;
                    break;
                }
                cArr2[i11] = (char) (cArr[bytes[(i12 - 1) - i11] + maximumDrawingCacheSize] - iIntValue);
                Object[] objArr17 = {setz, setz};
                map2 = setTextScaleX.setMaxEms;
                method2 = map2.get(-1539766653);
                if (method2 == null) {
                    Class cls9 = (Class) setTextScaleX.setX((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 52 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 2880);
                    byte b116 = (byte) 0;
                    byte b117 = b116;
                    Object[] objArr18 = new Object[1];
                    a(b116, b117, b117, objArr18);
                    method2 = cls9.getMethod((String) objArr18[0], Object.class, Object.class);
                    map2.put(-1539766653, method2);
                }
                ((Method) method2).invoke(null, objArr17);
                iIntValue = iIntValue;
            }
            pc.setY(new pe(this.f61273b, n1.f(cArr2)));
        }
        int i17 = setX.setDividerPadding[udVar.ordinal()];
        Function1<ro, Unit> function1 = this.f61272a;
        switch (i17) {
            case 1:
                function1.invoke(ro.setDividerPadding);
                return;
            case 2:
                function1.invoke(ro.setLayoutAnimation);
                return;
            case 3:
                function1.invoke(ro.getNavBarTitleString);
                return;
            case 4:
                function1.invoke(ro.setOnLongClickListener);
                return;
            case 5:
                function1.invoke(ro.setOnDragListener);
                return;
            case 6:
                function1.invoke(ro.setDividerPadding);
                return;
            case 7:
                function1.invoke(ro.setDividerPadding);
                int i18 = m + 41;
                f61269n = i18 % 128;
                int i19 = i18 % 2;
                return;
            default:
                return;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ue
    public final /* synthetic */ void setOnFocusChangeListener(ug ugVar) {
        int i10 = m + 99;
        f61269n = i10 % 128;
        int i11 = i10 % 2;
        h(ugVar);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f61269n + 69;
        m = i12 % 128;
        int i13 = i12 % 2;
    }
}
