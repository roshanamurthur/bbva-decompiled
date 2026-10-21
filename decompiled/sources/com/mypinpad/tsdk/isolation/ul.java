package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u0014\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u0017\u0012\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020&¢\u0006\u0002\u0010'J\b\u0010<\u001a\u00020\u0013H\u0002J\b\u0010=\u001a\u00020\u0013H\u0014J\u0010\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020\u0013H\u0002J\u0010\u0010B\u001a\u00020\u00132\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020EH\u0002J\u001c\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0010\u0010K\u001a\u00020\u00132\u0006\u0010L\u001a\u00020@H\u0002J\u0010\u0010M\u001a\u00020\u00132\u0006\u0010L\u001a\u00020@H\u0002J\b\u0010N\u001a\u00020\u0013H\u0002J\u0010\u0010O\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u0019H\u0002J\u0010\u0010Q\u001a\u00020\u00132\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010R\u001a\u00020\u00132\u0006\u0010G\u001a\u00020JH\u0016J\u0010\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020UH\u0014J\b\u0010V\u001a\u00020\u0016H\u0014J\u001c\u0010W\u001a\u00020\u00132\u0006\u0010G\u001a\u00020H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0010\u0010X\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020\"H\u0002J\f\u0010Z\u001a\u00020\u0016*\u00020JH\u0002J\f\u0010[\u001a\u00020\u0016*\u00020JH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020.X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002080)X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/mypinpad/tsdk/internal/terminal/transaction/TransactionProcessing;", "Lcom/mypinpad/tsdk/internal/emvlib/Processing;", "applicationContext", "Landroid/content/Context;", "emvTerminal", "Lcom/mypinpad/softpos/emv/integration/contract/EmvTerminal;", "hostDateProvider", "Lcom/mypinpad/tsdk/internal/host/HostDateProvider;", "hostPinPadLauncher", "Lcom/mypinpad/tsdk/internal/host/HostPinPadLauncher;", "hostNetworkStateProvider", "Lcom/mypinpad/tsdk/internal/host/HostNetworkStateProvider;", "sensorDetector", "Lcom/mypinpad/attestation/integration/SensorDetector;", "transactionParameters", "Lcom/mypinpad/tsdk/internal/sdk/models/SdkTransactionParameters;", "onSdkUiMessage", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkUiMessage;", "", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/OnSdkUiMessage;", "onNfcTagListeningRequest", "", "Lcom/mypinpad/tsdk/internal/emvlib/OnNfcTagListeningRequest;", "onSdkTransactionResult", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionResult;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/OnSdkTransactionResult;", "timeoutHandlerFactory", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutHandlerFactory;", "transactionService", "Lcom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService;", "sdkInstanceId", "", "transactionId", "Ljava/util/UUID;", "authorisationHandler", "Lcom/mypinpad/tsdk/internal/terminal/authorisation/AuthorisationHandler;", "threadPool", "Lcom/mypinpad/common/threading/ThreadPool;", "(Landroid/content/Context;Lcom/mypinpad/softpos/emv/integration/contract/EmvTerminal;Lcom/mypinpad/tsdk/internal/host/HostDateProvider;Lcom/mypinpad/tsdk/internal/host/HostPinPadLauncher;Lcom/mypinpad/tsdk/internal/host/HostNetworkStateProvider;Lcom/mypinpad/attestation/integration/SensorDetector;Lcom/mypinpad/tsdk/internal/sdk/models/SdkTransactionParameters;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutHandlerFactory;Lcom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService;Ljava/lang/String;Ljava/util/UUID;Lcom/mypinpad/tsdk/internal/terminal/authorisation/AuthorisationHandler;Lcom/mypinpad/common/threading/ThreadPool;)V", "backgroundTimeoutHandler", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutHandler;", "Lcom/mypinpad/tsdk/internal/terminal/BackgroundTimeoutState;", "getBackgroundTimeoutHandler", "()Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutHandler;", "outcomeListener", "Lcom/mypinpad/tsdk/internal/terminal/transaction/TransactionOutcomeListener;", "getOutcomeListener", "()Lcom/mypinpad/tsdk/internal/terminal/transaction/TransactionOutcomeListener;", "pinCaptureResult", "Lcom/mypinpad/tsdk/internal/pinpad/PinCaptureResult;", "pinEntrySession", "Lcom/mypinpad/security/integration/pin/PinEntrySession;", "pinId", "Lcom/mypinpad/security/integration/pin/PinId;", "processingTimeoutHandler", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TransactionTimeoutState;", "getProcessingTimeoutHandler", "transactionCompletedBuilder", "Lcom/mypinpad/tsdk/internal/terminal/transaction/TransactionCompletedBuilder;", "capturePin", "cleanUp", "getArcFromIssuerData", "issuerData", "", "handleBackgroundTimeout", "handleContinueTransactionProcessingWithPinEntry", "handleContinueWithOnlineResponse", DigipassManagerConstants.KEY_RESPONSE, "Lcom/mypinpad/tsdk/internal/terminal/authorisation/TransactionAuthorisationResponse;", "handleFailedAuthorisationRequest", "error", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkTransactionErrorCause;", "exception", "", "handleOnlineRequest", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "handleOnlineRequestWithPin", "handlePinRequest", "handleTransactionResult", "sdkTransactionResult", "handleTransactionTimeout", "onError", "onSensorUsageDetected", "sensorType", "Lcom/mypinpad/attestation/integration/SensorDetector$SensorType;", "prepare", "sendErrorResult", "updateStateRecord", "serviceTransactionId", "isHostAppError", "isNfcError", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionProcessing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionProcessing.kt\ncom/mypinpad/tsdk/internal/terminal/transaction/TransactionProcessing\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Processing.kt\ncom/mypinpad/tsdk/internal/emvlib/Processing\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,716:1\n7#2,8:717\n7#2,8:726\n1#3:725\n225#4,6:734\n1549#5:740\n1620#5,3:741\n288#5,2:744\n*S KotlinDebug\n*F\n+ 1 TransactionProcessing.kt\ncom/mypinpad/tsdk/internal/terminal/transaction/TransactionProcessing\n*L\n386#1:717,8\n444#1:726,8\n508#1:734,6\n533#1:740\n533#1:741,3\n534#1:744,2\n*E\n"})
public final class ul extends ni {
    public static final int[] G;
    public static final long H;
    public static final int I;
    public static final char J;
    public static int K;
    public static int L;
    public static int M;
    public static int N;
    public static final byte[] O = null;

    @Nullable
    public final ue<sz> A;

    @NotNull
    public final uj B;

    @NotNull
    public final uk C;

    @Nullable
    public getEnableLocalAttestationForDebugBuilds D;

    @Nullable
    public setMeasureWithLargestChildEnabled E;

    @Nullable
    public px F;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Context f61337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final nt f61338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final nr f61339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final sq f61340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Function1<rs, Unit> f61341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final String f61342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final UUID f61343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final tj f61344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final TerminalCallbackKt f61345y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final ue<ug> f61346z;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setDividerPadding", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61347r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61348s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CompletableFuture<rb> f61349p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ul f61350q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CompletableFuture<rb> completableFuture, ul ulVar) {
            super(0);
            this.f61349p0 = completableFuture;
            this.f61350q0 = ulVar;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~((~i10) | i11);
            int i14 = ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
            int i15 = ~i11;
            int i16 = ~(i15 | i10);
            int i17 = ~i12;
            if ((((~(i11 | i17)) | (~(i12 | i15)) | i13) * 988) + (((~(i10 | i17)) | i16) * (-1976)) + i14 == 1) {
                a aVar = (a) objArr[0];
                int i18 = f61348s0;
                int i19 = (i18 & (-90)) | ((~i18) & 89);
                int i20 = (i18 & 89) << 1;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f61347r0 = i21 % 128;
                int i22 = i21 % 2;
                a(new Object[]{aVar}, -1770800755, 1770800755, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                int i23 = f61348s0;
                int i24 = i23 & 117;
                int i25 = (i23 | 117) & (~i24);
                int i26 = i24 << 1;
                int i27 = (i25 & i26) + (i25 | i26);
                f61347r0 = i27 % 128;
                int i28 = i27 % 2;
                return unit;
            }
            a aVar2 = (a) objArr[0];
            int i29 = f61347r0;
            int i30 = (i29 | 97) << 1;
            int i31 = -(((~i29) & 97) | (i29 & (-98)));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f61348s0 = i32 % 128;
            int i33 = i32 % 2;
            rb rbVar = (rb) aVar2.f61349p0.get(2000L, TimeUnit.MILLISECONDS);
            boolean z10 = rbVar instanceof qz;
            ul ulVar = aVar2.f61350q0;
            if (z10) {
                mu.setCompoundDrawableTintBlendMode(new Object[]{131002, null, null, 6}, -1968587119, 1968587120, 131002);
                ul.setOnFocusChangeListener(ulVar).invoke(new rn(rq.setDividerPadding));
                int i34 = f61347r0;
                int i35 = ((i34 | 27) << 1) - (i34 ^ 27);
                f61348s0 = i35 % 128;
                if (i35 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            if (!(!(rbVar instanceof rg))) {
                int i36 = f61348s0 + 67;
                f61347r0 = i36 % 128;
                int i37 = i36 % 2;
                mu.setCompoundDrawableTintBlendMode(new Object[]{131001, null, null, 6}, -1968587119, 1968587120, 131001);
                ul.setY(ulVar);
                int i38 = f61348s0 + 35;
                f61347r0 = i38 % 128;
                int i39 = i38 % 2;
            }
            int i40 = f61347r0 + 71;
            f61348s0 = i40 % 128;
            if (i40 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 2517638, -2517637, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i11;
            int i14 = ((i10 | i13) * 983) + (i11 * 984) + (i10 * (-1965));
            int i15 = ~i10;
            int i16 = ~i12;
            if ((((~(i15 | i11)) | (~(i16 | i15))) * 983) + (((~(i13 | i16)) | i15) * (-983)) + i14 != 1) {
                b bVar = (b) objArr[0];
                a(new Object[]{bVar}, 238141923, -238141922, System.identityHashCode(bVar));
                return Unit.INSTANCE;
            }
            b bVar2 = (b) objArr[0];
            mu.setCompoundDrawableTintBlendMode(new Object[]{130022, null, null, 6}, -1968587119, 1968587120, 130022);
            pc.setY(new pl(ul.setDividerPadding(ul.this)));
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -610022718, 610022718, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function2<ro, Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final char[] f61352p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final long f61353q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61354r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61355s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final byte[] f61356t0 = null;

        static {
            c();
            f61354r0 = 0;
            f61355s0 = 1;
            f61353q0 = -3490072341836854841L;
            f61352p0 = new char[]{18196, 35014, 55460, 10377, 30844, 18526, 38936, 59872, 14797, 2467, 22935, 43377, 63865, 51478, 6898, 27329, 47779, 35461, 55923, 10830, 31233, 19455, 39879, 60350, 15258, 2893, 23335, 43796, 64765, 52438, 7333, 27789, 50804, 2470, 22980, 43497, 63772, 51518, 6520, 26752, 47277, 35011, 55543, 10257, 30745, 18550, 39826, 60321, 15299, 3045, 23315, 43822, 64353, 51871, 6823, 27358, 47866, 35373, 55879, 10868, 32157, 19894, 40389, 60909, 15700, 3435, 23913, 44162, 64701, 52372, 7411, 27704, 48212, 35942, 57244, 12197, 32729, 20231, 40809, 61277, 16255, 3731, 24241, 44690, 65033, 52773, 7770, 28276, 45446, 33201, 53731, 8457, 29031, 16704, 37234, 57490, 12531, 228, 20491, 40993, 61532, 49273, 5023, 25538, 46063, 33564, 54141, 9062, 29564, 17064, 37618, 58107, 12813, 569, 21065, 41596, 62883, 50655, 5607, 25886, 46394, 34170, 54416, 9399, 29895, 17633, 37941, 58424, 13385, 1940, 22447, 42902, 63452, 50961, 5951, 26487, 46725, 34528, 55006, 9972, 30230, 17988, 38441, 55741, 10660, 31173, 18933, 39178, 59713, 14697, 2178, 22708, 43151, 63670, 51220};
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ul ulVar) throws Throwable {
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33119), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 32, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 31 - MotionEvent.axisFromString(""), (ViewConfiguration.getScrollBarSize() >> 8) + 123, objArr2);
            super(2, ulVar, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x01da  */
        /* JADX WARN: Code duplicated, block: B:39:0x01db  */
        public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
            Throwable cause;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
            long[] jArr = new long[i11];
            int i12 = 0;
            setcompounddrawabletintblendmode.setDividerPadding = 0;
            while (true) {
                int i13 = setcompounddrawabletintblendmode.setDividerPadding;
                if (i13 >= i11) {
                    break;
                }
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i12] = Integer.valueOf(f61352p0[i10 + i13]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1832327647);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 727 - TextUtils.indexOf((CharSequence) "", '0', i12));
                        byte b10 = (byte) i12;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b11, b10, (byte) (b11 + 5), objArr3);
                        String str = (String) objArr3[i12];
                        Class<?>[] clsArr = new Class[1];
                        clsArr[i12] = Integer.TYPE;
                        method = cls.getMethod(str, clsArr);
                        map.put(1832327647, method);
                    }
                    Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f61353q0), Integer.valueOf(c10)};
                    Object method2 = map.get(2012362404);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionType(0L) + 46116), TextUtils.indexOf("", "", 0, 0) + 43, 1776 - View.MeasureSpec.getMode(0));
                        byte b12 = (byte) 0;
                        Object[] objArr5 = new Object[1];
                        b(b12, b12, (byte) f61356t0.length, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls3 = Long.TYPE;
                        method2 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                        map.put(2012362404, method2);
                    }
                    jArr[i13] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                    Object method3 = map.get(1606688712);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (Process.getGidForName("") + 1), 27 - TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0') + 2312);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr7 = new Object[1];
                        b(b14, b13, b14, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map.put(1606688712, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                    i12 = 0;
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
            char[] cArr = new char[i11];
            setcompounddrawabletintblendmode.setDividerPadding = 0;
            while (true) {
                int i14 = setcompounddrawabletintblendmode.setDividerPadding;
                if (i14 >= i11) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i14] = (char) jArr[i14];
                Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Map map2 = setTextScaleX.setMaxEms;
                Object method4 = map2.get(1606688712);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 27, TextUtils.getOffsetBefore("", 0) + 2311);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    b(b16, b15, b16, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                    map2.put(1606688712, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = 72 - r9
                int r8 = r8 * 4
                int r8 = 1 - r8
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r0 = new byte[r8]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.ul.c.f61356t0
                if (r2 != 0) goto L15
                r3 = r9
                r4 = r1
                r9 = r8
                goto L2a
            L15:
                r3 = r1
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r0[r3] = r5
                if (r4 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r1)
                r10[r1] = r7
                return
            L25:
                r3 = r2[r7]
                r6 = r9
                r9 = r8
                r8 = r6
            L2a:
                int r3 = -r3
                int r8 = r8 + r3
                int r7 = r7 + 1
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.ul.c.b(int, byte, int, java.lang.Object[]):void");
        }

        public static void c() {
            f61356t0 = new byte[]{118, -7, -43, Constants.STATE_ERROR};
        }

        public final void d(@NotNull ro roVar, @Nullable Throwable th2) throws Throwable {
            int i10 = f61355s0 + 1;
            f61354r0 = i10 % 128;
            if (i10 % 2 == 0) {
                Intrinsics.checkNotNullParameter(roVar, "");
                ul.setY((ul) this.receiver, roVar, th2);
            } else {
                Intrinsics.checkNotNullParameter(roVar, "");
                ul.setY((ul) this.receiver, roVar, th2);
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(ro roVar, Throwable th2) throws Throwable {
            int i10 = f61354r0 + 89;
            f61355s0 = i10 % 128;
            int i11 = i10 % 2;
            d(roVar, th2);
            if (i11 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<tg, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final long f61357p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61358q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61359r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61360s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61361t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final byte[] f61362u0 = null;

        static {
            b();
            f61360s0 = 0;
            f61361t0 = 1;
            f61358q0 = 0;
            f61359r0 = 1;
            f61357p0 = -7988027045085514817L;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(ul ulVar) throws Throwable {
            Object[] objArr = new Object[1];
            a("㸗嬷찓瑀㹿萶犽\uea04䏻\u07b2\uf010澏앹脣疺\ued0e䛢ಲﬄ抉졣踿碜\ue00e䷻া︽斅콅謲掠\ufb10僸ᚹ\ue120碅", KeyEvent.normalizeMetaState(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("䦋뵐熴줫䧣扑켚坯㑧\ue1d5䶷틤닥杄젝健ㅾ\uead5䚣\udfe2뿿桘씻嵥㩧\uefd9䎚\ud8ee룙浕\ude07䙻❤\uf0de岇엮ꖣ發\udb17䍤\u2066\uf59f妙컲껻筙퐚䱻\u2d6aﻔ勛쯿꯸籔턟䤤ᙢ菞澀㓮铹Ş\uea15뉧ጤ蓄梑ㇹ釦ਖ਼\ue71a뽪ᱧ覟斕㫾髿མ\ue01b롹ᥢ鋃纕⟿蟢ၟﴚꔤɟ韂箕⃥胸ᕑ\uf617깿ར食璚ⷊ跾Ṅ\uf31cꭤࡹ鷙熇ᛪ\uf6ff⍙ఛ鑥留ꛕ誇ᏻ\uf3e4\u245eइ酮縰ꮙ螢", KeyEvent.getMaxKeyCode() >> 16, objArr2);
            super(1, ulVar, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0103 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:6:0x003a, B:10:0x0061, B:11:0x0098, B:13:0x00a7, B:23:0x0125, B:16:0x00bb, B:20:0x00fb, B:22:0x0103, B:28:0x013f), top: B:37:0x003a }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0139  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0141 -> B:30:0x014a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.ul.d.a(java.lang.String, int, java.lang.Object[]):void");
        }

        public static void b() {
            f61362u0 = new byte[]{113, 16, 76, 90};
        }

        public final void c(@NotNull tg tgVar) throws Throwable {
            int i10 = f61358q0 + 81;
            f61359r0 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(tgVar, "");
            ul.setDividerPadding(new Object[]{(ul) this.receiver, tgVar}, -1749351008, 1749351012, (int) System.currentTimeMillis());
            int i12 = f61359r0 + 29;
            f61358q0 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(tg tgVar) throws Throwable {
            int i10 = f61359r0 + 55;
            f61358q0 = i10 % 128;
            int i11 = i10 % 2;
            c(tgVar);
            Unit unit = Unit.INSTANCE;
            int i12 = f61359r0 + 3;
            f61358q0 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 37 / 0;
            }
            return unit;
        }
    }

    public static final class setNavigationOnClickListener extends setVisibility {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61363b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f61364c = 1;

        public setNavigationOnClickListener() {
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            ro roVar;
            setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) objArr[0];
            Throwable th2 = (Throwable) objArr[1];
            int i13 = f61363b;
            int i14 = ((i13 & 47) - (~(-(-(i13 | 47))))) - 1;
            f61364c = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th2, "");
                boolean z10 = th2 instanceof TimeoutException;
                throw null;
            }
            Intrinsics.checkNotNullParameter(th2, "");
            if (!(!(th2 instanceof TimeoutException))) {
                mu.setCompoundDrawableTintBlendMode(new Object[]{131003, null, null, 6}, -1968587119, 1968587120, 131003);
                roVar = ro.UiMessageCallbackKtWhenMappings;
                int i15 = f61364c;
                int i16 = i15 & 31;
                int i17 = -(-((i15 ^ 31) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                f61363b = i18 % 128;
                int i19 = i18 % 2;
            } else {
                mu.setCompoundDrawableTintBlendMode(new Object[]{131004, null, th2, 2}, -1968587119, 1968587120, 131004);
                roVar = ro.setNavigationOnClickListener;
                int i20 = f61364c;
                int i21 = i20 & 21;
                int i22 = (i21 - (~((i20 ^ 21) | i21))) - 1;
                f61363b = i22 % 128;
                int i23 = i22 % 2;
            }
            ul.setOnFocusChangeListener(ul.this).invoke(new rw(new byte[0], roVar, rx.setOnFocusChangeListener(th2)));
            int i24 = f61363b;
            int i25 = i24 & 65;
            int i26 = (((i24 ^ 65) | i25) << 1) - ((i24 | 65) & (~i25));
            f61364c = i26 % 128;
            int i27 = i26 % 2;
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) {
            setOnFocusChangeListener(new Object[]{this, th2}, 2123502852, -2123502852, System.identityHashCode(this));
        }
    }

    public static final class setOnDragListener extends setVisibility {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long f61366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f61367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final char f61368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f61369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f61370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f61371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f61372g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final byte[] f61373h = null;

        static {
            c();
            f61371f = 0;
            f61372g = 1;
            f61369d = 0;
            f61370e = 1;
            f61368c = (char) 30296;
            f61366a = -2443367703579691432L;
            f61367b = 109062900;
        }

        public static void a(char c10, int i10, Object[] objArr) throws Throwable {
            int i11 = f61372g + 117;
            f61371f = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            char[] charArray = "ꁯ䬛Ý斍덁濠ꯤў矸痫ꂯ絛殍颐죻ს엗몱砱減젪ﮬﻹ魯材Ⱇ\ue487ᜦ亱宷學၈\uef0a".toCharArray();
            char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
            int i14 = f61371f + 25;
            f61372g = i14 % 128;
            if (i14 % 2 == 0) {
                "ᤴ\u1adcၿ鋠".toCharArray();
                throw null;
            }
            char[] charArray3 = "ᤴ\u1adcၿ鋠".toCharArray();
            UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
            int length = charArray3.length;
            char[] cArr = new char[length];
            int length2 = charArray2.length;
            char[] cArr2 = new char[length2];
            int i15 = 0;
            System.arraycopy(charArray3, 0, cArr, 0, length);
            System.arraycopy(charArray2, 0, cArr2, 0, length2);
            cArr[0] = (char) (cArr[0] ^ c10);
            cArr2[2] = (char) (cArr2[2] + ((char) i10));
            int length3 = charArray.length;
            char[] cArr3 = new char[length3];
            uiMessageCallbackKtWhenMappings.setX = 0;
            int i16 = f61371f + 73;
            f61372g = i16 % 128;
            int i17 = i16 % 2;
            while (uiMessageCallbackKtWhenMappings.setX < length3) {
                int i18 = f61371f + 7;
                f61372g = i18 % 128;
                int i19 = i18 % i12;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i15] = uiMessageCallbackKtWhenMappings;
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(20564334);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (View.MeasureSpec.makeMeasureSpec(i15, i15) + 50678), 'W' - AndroidCharacter.getMirror('0'), KeyEvent.getDeadChar(i15, i15) + 1737);
                        byte b10 = (byte) i15;
                        Object[] objArr3 = new Object[1];
                        b((byte) 6, b10, b10, objArr3);
                        String str = (String) objArr3[i15];
                        Class<?>[] clsArr = new Class[1];
                        clsArr[i15] = Object.class;
                        method = cls.getMethod(str, clsArr);
                        map.put(20564334, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    Object[] objArr4 = new Object[1];
                    objArr4[i15] = uiMessageCallbackKtWhenMappings;
                    Object method2 = map.get(-68974155);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (8125 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 646 - Color.red(i15));
                        byte b11 = (byte) 3;
                        byte b12 = (byte) (b11 - 3);
                        Object[] objArr5 = new Object[1];
                        b(b11, b12, b12, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class);
                        map.put(-68974155, method2);
                    }
                    int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                    Object method3 = map.get(-1108711559);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - MotionEvent.axisFromString("")), 50 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 434);
                        byte b13 = (byte) 5;
                        byte b14 = (byte) (b13 - 5);
                        Object[] objArr7 = new Object[1];
                        b(b13, b14, b14, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, cls4, cls4);
                        map.put(-1108711559, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                    Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                    Object method4 = map.get(533021397);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) (Drawable.resolveOpacity(0, 0) + 4449), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + PointerIconCompat.TYPE_GRAB);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr9 = new Object[1];
                        b(b15, b16, b16, objArr9);
                        String str3 = (String) objArr9[0];
                        Class<?> cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str3, cls6, cls6);
                        map.put(533021397, method4);
                    }
                    cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                    char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                    cArr[iIntValue2] = c11;
                    int i20 = uiMessageCallbackKtWhenMappings.setX;
                    cArr3[i20] = (char) (((((long) (c11 ^ charArray[i20])) ^ (f61366a ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f61367b) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f61368c) ^ (-2443367703579691432L)))));
                    uiMessageCallbackKtWhenMappings.setX = i20 + 1;
                    int i21 = f61372g + 59;
                    f61371f = i21 % 128;
                    int i22 = i21 % 2;
                    length3 = length3;
                    i12 = 2;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            String str4 = new String(cArr3);
            int i23 = f61371f + 111;
            f61372g = i23 % 128;
            if (i23 % 2 == 0) {
                throw null;
            }
            objArr[0] = str4;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = 119 - r7
                int r8 = r8 * 2
                int r8 = 3 - r8
                int r9 = r9 * 3
                int r9 = 1 - r9
                byte[] r0 = new byte[r9]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.ul.setOnDragListener.f61373h
                if (r2 != 0) goto L18
                r5 = r1
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L33
            L18:
                r3 = r1
            L19:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r0[r3] = r4
                if (r5 != r9) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r1)
                r10[r1] = r7
                return
            L2a:
                r3 = r2[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r6
            L33:
                int r8 = -r8
                int r7 = r7 + r8
                r8 = r9
                r9 = r10
                r10 = r0
                r0 = r2
                r2 = r3
                r3 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.ul.setOnDragListener.b(byte, byte, int, java.lang.Object[]):void");
        }

        public static void c() {
            f61373h = new byte[]{27, 42, Constants.FCI_TEMPLATE, 101};
        }

        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) throws Throwable {
            int i10 = f61370e + 39;
            f61369d = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullParameter(th2, "");
                mr mrVar = mr.setOnFocusChangeListener;
                Object[] objArr = new Object[1];
                a((char) KeyEvent.keyCodeFromString(""), 2132466713 / KeyEvent.getDeadChar(1, 1), objArr);
                mt.setX(new Object[]{((String) objArr[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                mu.setCompoundDrawableTintBlendMode(new Object[]{130023, null, th2}, -1087921663, 1087921663, 130023);
            } else {
                Intrinsics.checkNotNullParameter(th2, "");
                mr mrVar2 = mr.setOnFocusChangeListener;
                Object[] objArr2 = new Object[1];
                a((char) KeyEvent.keyCodeFromString(""), 2132466713 - KeyEvent.getDeadChar(0, 0), objArr2);
                mt.setX(new Object[]{((String) objArr2[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                mu.setCompoundDrawableTintBlendMode(new Object[]{130023, null, th2}, -1087921663, 1087921663, 130023);
            }
            int i11 = f61369d + 33;
            f61370e = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public final class setOnLongClickListener extends setVisibility {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61374b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f61375c = 1;

        public setOnLongClickListener() {
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setOnLongClickListener setonlongclicklistener = (setOnLongClickListener) objArr[0];
            Throwable th2 = (Throwable) objArr[1];
            int i13 = f61374b;
            int i14 = i13 & 9;
            int i15 = -(-((i13 ^ 9) | i14));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f61375c = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.checkNotNullParameter(th2, "");
            ul.this.setCompoundDrawableTintBlendMode(th2);
            int i18 = f61375c;
            int i19 = i18 & 79;
            int i20 = (((i18 | 79) & (~i19)) - (~(i19 << 1))) - 1;
            f61374b = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) {
            setDividerPadding(new Object[]{this, th2}, 643104635, -643104635, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f61377a;
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[setAccessibilityDelegate.setX.values().length];
            try {
                iArr[setAccessibilityDelegate.setX.setCompoundDrawableTintBlendMode.ordinal()] = 1;
                f61377a = 115;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setAccessibilityDelegate.setX.setOnFocusChangeListener.ordinal()] = 2;
                int i10 = f61377a;
                int i11 = (((i10 | 120) << 1) - (i10 ^ 120)) - 1;
                int i12 = i11 % 128;
                int i13 = i11 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setAccessibilityDelegate.setX.setY.ordinal()] = 3;
                int i14 = f61377a;
                int i15 = i14 & 19;
                int i16 = (i14 | 19) & (~i15);
                int i17 = i15 << 1;
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                int i19 = i18 % 128;
                int i20 = i18 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            setDividerPadding = iArr;
            int[] iArr2 = new int[pq.values().length];
            try {
                iArr2[pq.setDividerPadding.ordinal()] = 1;
                int i21 = f61377a + 49;
                int i22 = i21 % 128;
                int i23 = i21 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[pq.setOnFocusChangeListener.ordinal()] = 2;
                int i24 = f61377a;
                int i25 = (i24 ^ 31) + ((i24 & 31) << 1);
                int i26 = i25 % 128;
                int i27 = i25 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[pq.setY.ordinal()] = 3;
                int i28 = f61377a;
                int i29 = ((i28 | 100) << 1) - (i28 ^ 100);
                int i30 = (i29 ^ (-1)) + (i29 << 1);
                int i31 = i30 % 128;
                int i32 = i30 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[pq.setCompoundDrawableTintBlendMode.ordinal()] = 4;
                int i33 = f61377a;
                int i34 = i33 & 91;
                int i35 = i33 | 91;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                int i37 = i36 % 128;
                int i38 = i36 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            setOnFocusChangeListener = iArr2;
            int i39 = f61377a;
            int i40 = (((i39 | 118) << 1) - (i39 ^ 118)) - 1;
            int i41 = i40 % 128;
            if (i40 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        d();
        M = 0;
        N = 1;
        K = 0;
        L = 1;
        G = new int[]{-433518030, 552287194, 1402230227, 267164225, 910344396, 889920071, 1915270809, 155591600, -70452869, -164985863, 1279537727, 1656153284, -2082997636, 151823479, -1551334495, 135672125, -2077297149, -1086988317};
        J = (char) 30296;
        H = -2443367703579691432L;
        I = -1553063234;
    }

    public ul() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(Context context, component24 component24Var, np npVar, nt ntVar, nr nrVar, setAccessibilityDelegate setaccessibilitydelegate, sq sqVar, Function1 function1, Function1 function2, Function1 function3, ub ubVar, ti tiVar, String str, UUID uuid, tj tjVar, TerminalCallbackKt terminalCallbackKt, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        TerminalCallbackKt terminalCallbackKt2;
        super(component24Var, setaccessibilitydelegate, nc.setX(sqVar, npVar), uuid, function1, function2);
        if ((i10 & 32768) != 0) {
            vi viVar = vi.setDividerPadding;
            terminalCallbackKt2 = (TerminalCallbackKt) vi.setOnFocusChangeListener(new Object[0], 711180205, -711180201, (int) System.currentTimeMillis());
        } else {
            terminalCallbackKt2 = terminalCallbackKt;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(component24Var, "");
        Intrinsics.checkNotNullParameter(npVar, "");
        Intrinsics.checkNotNullParameter(ntVar, "");
        Intrinsics.checkNotNullParameter(nrVar, "");
        Intrinsics.checkNotNullParameter(setaccessibilitydelegate, "");
        Intrinsics.checkNotNullParameter(sqVar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function3, "");
        Intrinsics.checkNotNullParameter(ubVar, "");
        Intrinsics.checkNotNullParameter(tiVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(tjVar, "");
        Intrinsics.checkNotNullParameter(terminalCallbackKt2, "");
        this.f61337q = context;
        this.f61338r = ntVar;
        this.f61339s = nrVar;
        this.f61340t = sqVar;
        this.f61341u = function3;
        this.f61342v = str;
        this.f61343w = uuid;
        this.f61344x = tjVar;
        this.f61345y = terminalCallbackKt2;
        this.f61346z = (ue) ub.setY(new Object[]{ubVar, new ar(this)}, 1640575172, -1640575170, System.identityHashCode(ubVar));
        Boolean bool = mg.setCompoundDrawableTintBlendMode;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        this.A = bool.booleanValue() ? (ue) ub.setY(new Object[]{ubVar, new vm(this)}, -1170467262, 1170467263, System.identityHashCode(ubVar)) : null;
        uj ujVar = new uj();
        this.B = ujVar;
        this.C = new uk(new setOnLongClickListener(), function1, uuid, new my(this), new y9(this), new z9(this), new w9(this), ujVar);
    }

    public static void d() {
        O = new byte[]{10, -11, -56, -115};
    }

    public static void g(int[] iArr, int i10, Object[] objArr) throws Throwable {
        int[] iArr2;
        Object method;
        int length;
        int[] iArr3;
        String str = "";
        com.mypinpad.tsdk.isolation.setOnLongClickListener setonlongclicklistener = new com.mypinpad.tsdk.isolation.setOnLongClickListener();
        char[] cArr = new char[4];
        int i11 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = G;
        int i12 = 1;
        int i13 = 1833429914;
        int i14 = 0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            iArr2 = new int[length2];
            int i15 = 0;
            while (i15 < length2) {
                int i16 = N + 3;
                M = i16 % 128;
                int i17 = i16 % i11;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i14] = Integer.valueOf(iArr4[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method2 = map.get(Integer.valueOf(i13));
                    if (method2 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), TextUtils.indexOf(str, str) + 44, TextUtils.getOffsetAfter(str, i14) + 728);
                        byte b10 = (byte) i14;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        i(b10, b11, b11, objArr3);
                        method2 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1833429914, method2);
                    }
                    iArr2[i15] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i15++;
                    int i18 = M + 73;
                    N = i18 % 128;
                    int i19 = i18 % 2;
                    str = str;
                    i11 = 2;
                    i13 = 1833429914;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        } else {
            iArr2 = iArr4;
        }
        int length3 = iArr2.length;
        int[] iArr5 = new int[length3];
        if (iArr4 != null) {
            int i20 = M + 17;
            N = i20 % 128;
            if (i20 % 2 == 0) {
                length = iArr4.length;
                iArr3 = new int[length];
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
            }
            int i21 = 0;
            while (i21 < length) {
                Object[] objArr4 = new Object[i12];
                objArr4[0] = Integer.valueOf(iArr4[i21]);
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1833429914);
                if (method3 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, 728 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    i(b12, b13, b13, objArr5);
                    method3 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(1833429914, method3);
                }
                iArr3[i21] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                i21++;
                int i22 = N + 61;
                M = i22 % 128;
                int i23 = i22 % 2;
                iArr4 = iArr4;
                length = length;
                i12 = 1;
            }
            iArr4 = iArr3;
        }
        System.arraycopy(iArr4, 0, iArr5, 0, length3);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i24 = setonlongclicklistener.setDividerPadding;
            if (i24 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
            int i25 = N + 63;
            M = i25 % 128;
            int i26 = i25 % 2;
            int i27 = iArr[i24];
            char c10 = (char) (i27 >> 16);
            cArr[0] = c10;
            char c11 = (char) i27;
            cArr[1] = c11;
            int i28 = iArr[i24 + 1];
            char c12 = (char) (i28 >> 16);
            cArr[2] = c12;
            char c13 = (char) i28;
            cArr[3] = c13;
            setonlongclicklistener.setY = (c10 << 16) + c11;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
            com.mypinpad.tsdk.isolation.setOnLongClickListener.setX(iArr5);
            int i29 = 0;
            for (int i30 = 16; i29 < i30; i30 = 16) {
                int i31 = setonlongclicklistener.setY ^ iArr5[i29];
                setonlongclicklistener.setY = i31;
                Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(com.mypinpad.tsdk.isolation.setOnLongClickListener.setCompoundDrawableTintBlendMode(i31)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object method4 = map3.get(-350984188);
                if (method4 == null) {
                    method4 = ((Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 41 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 180 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i29++;
            }
            int i32 = setonlongclicklistener.setY;
            int i33 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i34 = i32 ^ iArr5[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i34;
            int i35 = i33 ^ iArr5[17];
            setonlongclicklistener.setY = i35;
            cArr[0] = (char) (i35 >>> 16);
            cArr[1] = (char) i35;
            cArr[2] = (char) (i34 >>> 16);
            cArr[3] = (char) i34;
            com.mypinpad.tsdk.isolation.setOnLongClickListener.setX(iArr5);
            int i36 = setonlongclicklistener.setDividerPadding * 2;
            cArr2[i36] = cArr[0];
            cArr2[i36 + 1] = cArr[1];
            cArr2[i36 + 2] = cArr[2];
            cArr2[i36 + 3] = cArr[3];
            Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object obj = map4.get(-147294223);
            if (obj != null) {
                method = obj;
            } else {
                Class cls3 = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 41 - View.resolveSizeAndState(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 483);
                byte b14 = (byte) 0;
                Object[] objArr8 = new Object[1];
                i(b14, b14, (byte) O.length, objArr8);
                method = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-147294223, method);
            }
            ((Method) method).invoke(null, objArr7);
        }
    }

    public static void h(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char[] charArray = str2.toCharArray();
        int i11 = N + 7;
        M = i11 % 128;
        int i12 = i11 % 2;
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        int i13 = N + 31;
        M = i13 % 128;
        int i14 = i13 % 2;
        char[] charArray3 = str.toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        int i15 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i15] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (50678 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.argb(i15, i15, i15, i15) + 39, 1737 - (ViewConfiguration.getTouchSlop() >> 8));
                    byte b10 = (byte) i15;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    i(b10, b11, (byte) (b11 | 9), objArr3);
                    String str3 = (String) objArr3[i15];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i15] = Object.class;
                    method = cls.getMethod(str3, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i15] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', i15, i15) + 8126), Color.rgb(i15, i15, i15) + 16777253, ((byte) KeyEvent.getModifierMetaStateMask()) + 647);
                    byte b12 = (byte) i15;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    i(b12, b13, (byte) (b13 | 12), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), 49 - Color.green(0), 434 - KeyEvent.getDeadChar(0, 0));
                    byte b14 = (byte) 0;
                    Object[] objArr7 = new Object[1];
                    i(b14, b14, O[0], objArr7);
                    String str4 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str4, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (4449 - (ViewConfiguration.getEdgeSlop() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + PointerIconCompat.TYPE_GRAB);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    i(b15, b16, (byte) (b16 | 15), objArr9);
                    String str5 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i16 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i16] = (char) (((((long) (c11 ^ charArray[i16])) ^ (H ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) I) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) J) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i16 + 1;
                int i17 = M + 103;
                N = i17 % 128;
                int i18 = i17 % 2;
                length3 = length3;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void i(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r8 = r8 + 104
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.ul.O
            if (r2 != 0) goto L18
            r4 = r8
            r3 = r1
            r8 = r7
            r7 = r6
            goto L30
        L18:
            r3 = r1
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ul.i(int, int, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ void l(ul ulVar, ro roVar) {
        int i10 = K + 111;
        L = i10 % 128;
        int i11 = i10 % 2;
        ulVar.n(roVar, null);
        if (i11 == 0) {
            throw null;
        }
        int i12 = L + 3;
        K = i12 % 128;
        int i13 = i12 % 2;
    }

    public static String p(byte[] bArr) throws Throwable {
        Object obj;
        try {
            uv.Companion companion = uv.INSTANCE;
            List<uv> compoundDrawableTintBlendMode = uv.Companion.setCompoundDrawableTintBlendMode(bArr);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(compoundDrawableTintBlendMode, 10));
            for (uv uvVar : compoundDrawableTintBlendMode) {
                String upperCase = ((String) ux.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) uv.setDividerPadding(new Object[]{uvVar}, 450567484, -450567484, System.identityHashCode(uvVar))}, -907784665, 907784665, (int) System.currentTimeMillis())).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                arrayList.add(upperCase);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                int i10 = K + 87;
                L = i10 % 128;
                int i11 = i10 % 2;
                Object next = it.next();
                Object[] objArr = new Object[1];
                h((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 5382), "㙇ᎈթ鰕", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "穨펻턝啒", objArr);
                if (l.startsWith$default((String) next, ((String) objArr[0]).intern(), false, 2, null)) {
                    int i12 = L + 101;
                    K = i12 % 128;
                    int i13 = i12 % 2;
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean s(Throwable th2) {
        int i10 = K + 11;
        L = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        Integer num = (Integer) nk.setY(new Object[]{th2}, -768558198, 768558198, (int) System.currentTimeMillis());
        if (num == null || num.intValue() != 16) {
            int i11 = K + 9;
            L = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        int i13 = L;
        int i14 = i13 + 13;
        K = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i13 + 119;
        K = i16 % 128;
        int i17 = i16 % 2;
        return true;
    }

    public static final /* synthetic */ void setCompoundDrawableTintBlendMode(ul ulVar, byte[] bArr) throws Throwable {
        int i10 = K + 103;
        L = i10 % 128;
        int i11 = i10 % 2;
        ulVar.o(bArr);
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        ro roVar;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~(i13 | i10);
        switch ((((~(i10 | i12)) | i16) * 464) + ((i13 | (~i10) | i12) * (-464)) + (((~(i14 | i10)) | i15 | i16) * 464) + (i11 * (-463)) + (i10 * 465)) {
            case 1:
                Throwable th2 = (Throwable) objArr[0];
                int i17 = K + 99;
                L = i17 % 128;
                int i18 = i17 % 2;
                boolean zContains = CollectionsKt___CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{7, 8, 9, 10}), (Integer) nk.setY(new Object[]{th2}, -768558198, 768558198, (int) System.currentTimeMillis()));
                int i19 = K + 87;
                L = i19 % 128;
                int i20 = i19 % 2;
                return Boolean.valueOf(zContains);
            case 2:
                ul ulVar = (ul) objArr[0];
                setAccessibilityDelegate.setX setx = (setAccessibilityDelegate.setX) objArr[1];
                int i21 = L + 87;
                K = i21 % 128;
                if (i21 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setx, "");
                    int i22 = setY.setDividerPadding[setx.ordinal()];
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setx, "");
                int i23 = setY.setDividerPadding[setx.ordinal()];
                if (i23 == 1) {
                    roVar = ro.setY;
                    int i24 = K + 69;
                    L = i24 % 128;
                    int i25 = i24 % 2;
                } else if (i23 == 2) {
                    roVar = ro.setX;
                } else {
                    if (i23 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    roVar = ro.setOnFocusChangeListener;
                }
                l(ulVar, roVar);
                int i26 = L + 15;
                K = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
                return null;
            case 3:
                ul ulVar2 = (ul) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i27 = K + 91;
                L = i27 % 128;
                int i28 = i27 % 2;
                AtomicReference<ng> compoundDrawableTintBlendMode = ulVar2.setCompoundDrawableTintBlendMode();
                sq sqVar = ulVar2.f61340t;
                ng ngVar = compoundDrawableTintBlendMode.get();
                ng ngVar2 = ng.setOnFocusChangeListener;
                Function1<rs, Unit> function1 = ulVar2.f61341u;
                if (ngVar == ngVar2) {
                    function1.invoke(new rn(rq.setOnFocusChangeListener));
                    int i29 = K + 125;
                    L = i29 % 128;
                    if (i29 % 2 == 0) {
                        throw null;
                    }
                } else if (ulVar2.setCompoundDrawableTintBlendMode().get() != ng.setCompoundDrawableTintBlendMode) {
                    mr mrVar = mr.setCompoundDrawableTintBlendMode;
                    Object[] objArr2 = new Object[1];
                    h((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15517), "鈪渽鶗똼", TextUtils.indexOf((CharSequence) "", '0') - 1754382957, "ꆊ\ude89ૻX츂\uec63褏馶담Ⱞ散\u0ba5奱鼧膣뇌ៈ餪엮ナ﮸䓠걚맷墸ᆘ\uf5dd쨱종致☶矅彛䃩䋙뮔䨫\ue7fe᫉", objArr2);
                    mt.setX(new Object[]{mrVar, ((String) objArr2[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    ((ue) setDividerPadding(new Object[]{ulVar2}, 132914157, -132914157, System.identityHashCode(ulVar2))).setOnFocusChangeListener(ug.setY);
                    ue<sz> dividerPadding = ulVar2.setDividerPadding();
                    if (dividerPadding != null) {
                        int i30 = K + 113;
                        L = i30 % 128;
                        if (i30 % 2 == 0) {
                            dividerPadding.setOnFocusChangeListener(sz.setY);
                            throw null;
                        }
                        dividerPadding.setOnFocusChangeListener(sz.setY);
                    }
                    try {
                        hashCode compoundDrawableTintBlendMode2 = mk.setOnFocusChangeListener.setCompoundDrawableTintBlendMode();
                        if (!(compoundDrawableTintBlendMode2 instanceof hashCode.setX)) {
                            setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled = ulVar2.E;
                            getEnableLocalAttestationForDebugBuilds getenablelocalattestationfordebugbuilds = ulVar2.D;
                            px pxVar = ulVar2.F;
                            if (pxVar instanceof pk) {
                                mu.setCompoundDrawableTintBlendMode(new Object[]{131015, null, null, 6}, -1968587119, 1968587120, 131015);
                                TerminalException terminalException = new TerminalException(10073, null, null);
                                mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                                throw terminalException;
                            }
                            if (setmeasurewithlargestchildenabled != null && getenablelocalattestationfordebugbuilds != null) {
                                ulVar2.f61344x.setDividerPadding(setmeasurewithlargestchildenabled, getenablelocalattestationfordebugbuilds, new th(bArr, sqVar.setLayoutAnimation(), sqVar.getNavBarTitleString(), sqVar.setOnLongClickListener(), sqVar.setNavigationOnClickListener()), new mm(ulVar2), new x9(ulVar2));
                            }
                            if (pxVar instanceof pp) {
                                pp ppVar = (pp) pxVar;
                                int i31 = setY.setOnFocusChangeListener[((pq) pp.setX(new Object[]{ppVar}, 1001409743, -1001409743, System.identityHashCode(ppVar))).ordinal()];
                                if (i31 == 1) {
                                    function1.invoke(new rn(rq.setDividerPadding));
                                } else if (i31 == 2) {
                                    function1.invoke(new rw(new byte[0], ro.setIncludeFontPadding, null));
                                } else if (i31 == 3) {
                                    function1.invoke(new rw(new byte[0], ro.setAlwaysDrawnWithCacheEnabled, null));
                                }
                            } else if (pxVar instanceof ps) {
                                ps psVar = (ps) pxVar;
                                if (((Throwable) ps.setY(new Object[]{psVar}, 971954812, -971954812, System.identityHashCode(psVar))) != null) {
                                    function1.invoke(new rw(new byte[0], rx.setDividerPadding(rx.setOnFocusChangeListener(((ps) pxVar).setDividerPadding())), rx.setOnFocusChangeListener(((ps) pxVar).setDividerPadding())));
                                }
                            }
                            TerminalException terminalException2 = new TerminalException(10048, pxVar != null ? Reflection.getOrCreateKotlinClass(pxVar.getClass()).getSimpleName() : null, null);
                            mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                            throw terminalException2;
                        }
                        function1.invoke(new rn(mi.setCompoundDrawableTintBlendMode((hashCode.setX) compoundDrawableTintBlendMode2)));
                    } catch (Exception e5) {
                        ulVar2.q(ro.setNavigationOnClickListener, e5);
                    }
                }
                return null;
            case 4:
                ul ulVar3 = (ul) objArr[0];
                tg tgVar = (tg) objArr[1];
                int i32 = L + 27;
                K = i32 % 128;
                int i33 = i32 % 2;
                ng ngVar3 = ulVar3.setCompoundDrawableTintBlendMode().get();
                ng ngVar4 = ng.setY;
                if (ngVar3 == ngVar4) {
                    hashCode compoundDrawableTintBlendMode3 = mk.setOnFocusChangeListener.setCompoundDrawableTintBlendMode();
                    if (compoundDrawableTintBlendMode3 instanceof hashCode.setX) {
                        ulVar3.f61341u.invoke(new rn(mi.setCompoundDrawableTintBlendMode((hashCode.setX) compoundDrawableTintBlendMode3)));
                    } else if (ni.setOnFocusChangeListener(ulVar3).get() == ngVar4 || ngVar4 == null) {
                        synchronized (ni.setOnFocusChangeListener(ulVar3)) {
                            byte[] bArr2 = (byte[]) tg.setDividerPadding(new Object[]{tgVar}, -1067077603, 1067077604, System.identityHashCode(tgVar));
                            mr mrVar2 = mr.setIncludeFontPadding;
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr3 = new Object[1];
                            g(new int[]{1469772706, -659851358, 417273048, -810709493, -701650293, -56054426, -845911669, 1235529734, 2018287991, -553522521, 395426466, 1184372740, 1366244727, -1814043842, -2062544144, -694878759, 795395611, -1362065993, 61212957, -999847935, 1366244727, -1814043842, 212870868, -1526067541}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47, objArr3);
                            sb2.append(((String) objArr3[0]).intern());
                            sb2.append(bArr2.length);
                            mt.setX(new Object[]{mrVar2, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                            mu.setCompoundDrawableTintBlendMode(new Object[]{130007, getDisplayExponent.setY(p(bArr2)), null, 4}, -1968587119, 1968587120, 130007);
                            try {
                                uj ujVar = ulVar3.B;
                                uj.setY(new Object[]{ujVar, (UUID) tg.setDividerPadding(new Object[]{tgVar}, -453668006, 453668008, System.identityHashCode(tgVar))}, -622270376, 622270376, System.identityHashCode(ujVar));
                                uj ujVar2 = ulVar3.B;
                                uj.setY(new Object[]{ujVar2, (byte[]) tg.setDividerPadding(new Object[]{tgVar}, 293781792, -293781792, System.identityHashCode(tgVar))}, 2027009510, -2027009509, System.identityHashCode(ujVar2));
                                ulVar3.setY().setDividerPadding(bArr2);
                            } catch (Exception e7) {
                                mr mrVar3 = mr.setOnFocusChangeListener;
                                Object[] objArr4 = new Object[1];
                                g(new int[]{1308617025, 2022120164, 1882660736, 829772825, -1265732104, -1157849692, -65720854, -658094307, 1391230155, 592410014}, MotionEvent.axisFromString("") + 21, objArr4);
                                mt.setX(new Object[]{((String) objArr4[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                                ulVar3.q(ro.setNavigationOnClickListener, e7);
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    break;
                }
                int i34 = K + 71;
                L = i34 % 128;
                int i35 = i34 % 2;
                return null;
            case 5:
                ul ulVar4 = (ul) objArr[0];
                if (ulVar4.setCompoundDrawableTintBlendMode().get() == ng.setOnFocusChangeListener) {
                    ulVar4.f61341u.invoke(new rn(rq.setOnFocusChangeListener));
                    int i36 = K + 47;
                    L = i36 % 128;
                    if (i36 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                if (ulVar4.setCompoundDrawableTintBlendMode().get() == ng.setCompoundDrawableTintBlendMode) {
                    return null;
                }
                Boolean bool = mg.setCompoundDrawableTintBlendMode;
                Intrinsics.checkNotNullExpressionValue(bool, "");
                if (bool.booleanValue() && (mk.setOnFocusChangeListener.setY(ulVar4.f61342v, 0, true) instanceof hashCode.setX)) {
                    ulVar4.m(new ps(null));
                    return null;
                }
                try {
                    getEnableLocalAttestationForDebugBuilds onFocusChangeListener = setDescendantFocusability.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(nf.setCompoundDrawableTintBlendMode());
                    ulVar4.D = onFocusChangeListener;
                    ulVar4.F = null;
                    ulVar4.E = null;
                    if (ulVar4.setCompoundDrawableTintBlendMode().get() != ng.setY) {
                        return null;
                    }
                    ulVar4.f61338r.setY(ulVar4.f61337q, new bv(ulVar4), (ue) setDividerPadding(new Object[]{ulVar4}, 132914157, -132914157, System.identityHashCode(ulVar4)), ulVar4.f61342v, ulVar4.f61343w, onFocusChangeListener);
                    int i37 = K + 107;
                    L = i37 % 128;
                    int i38 = i37 % 2;
                    return null;
                } catch (init e10) {
                    ulVar4.m(new ps(e10));
                    return null;
                }
            case 6:
                ul ulVar5 = (ul) objArr[0];
                int i39 = K + 49;
                L = i39 % 128;
                int i40 = i39 % 2;
                ulVar5.k();
                if (i40 == 0) {
                    int i41 = 78 / 0;
                }
                int i42 = K + 17;
                L = i42 % 128;
                if (i42 % 2 != 0) {
                    return null;
                }
                throw null;
            default:
                ul ulVar6 = (ul) objArr[0];
                int i43 = L + 85;
                int i44 = i43 % 128;
                K = i44;
                int i45 = i43 % 2;
                ue<ug> ueVar = ulVar6.f61346z;
                int i46 = i44 + 67;
                L = i46 % 128;
                if (i46 % 2 != 0) {
                    return ueVar;
                }
                int i47 = 14 / 0;
                return ueVar;
        }
    }

    public static final /* synthetic */ Function1 setOnFocusChangeListener(ul ulVar) {
        int i10 = K + 93;
        L = i10 % 128;
        int i11 = i10 % 2;
        Function1<rs, Unit> function1 = ulVar.f61341u;
        if (i11 != 0) {
            return function1;
        }
        throw null;
    }

    public static final /* synthetic */ void setY(ul ulVar) throws Throwable {
        int i10 = L + 79;
        K = i10 % 128;
        int i11 = i10 % 2;
        setDividerPadding(new Object[]{ulVar}, 57163524, -57163519, System.identityHashCode(ulVar));
        int i12 = K + 15;
        L = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 48 / 0;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ni
    public final void UiMessageCallbackKtWhenMappings() {
        int i10 = L + 5;
        K = i10 % 128;
        int i11 = i10 % 2;
        nt ntVar = this.f61338r;
        if (i11 != 0) {
            ntVar.setCompoundDrawableTintBlendMode();
            nt.setX(new Object[]{ntVar}, 1734202189, -1734202188, System.identityHashCode(ntVar));
            throw null;
        }
        ntVar.setCompoundDrawableTintBlendMode();
        nt.setX(new Object[]{ntVar}, 1734202189, -1734202188, System.identityHashCode(ntVar));
        getEnableLocalAttestationForDebugBuilds getenablelocalattestationfordebugbuilds = this.D;
        if (getenablelocalattestationfordebugbuilds != null) {
            getenablelocalattestationfordebugbuilds.setOnFocusChangeListener();
        }
        this.D = null;
        this.E = null;
        this.F = null;
        this.f61344x.setY();
        uj ujVar = this.B;
        byte[] bArr = (byte[]) uj.setY(new Object[]{ujVar}, -1124796910, 1124796913, System.identityHashCode(ujVar));
        if (bArr != null) {
        } else {
            int i12 = K + 13;
            L = i12 % 128;
            int i13 = i12 % 2;
        }
        uj.setY(new Object[]{ujVar, null}, 2027009510, -2027009509, System.identityHashCode(ujVar));
        uj.setY(new Object[]{ujVar, null}, -622270376, 622270376, System.identityHashCode(ujVar));
    }

    @NotNull
    public final uk j() {
        int i10 = K + 9;
        int i11 = i10 % 128;
        L = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 19;
        K = i13 % 128;
        int i14 = i13 % 2;
        uk ukVar = this.C;
        if (i14 != 0) {
            int i15 = 4 / 0;
        }
        return ukVar;
    }

    public final void k() throws Throwable {
        ro roVar = ro.getAmountFieldTextColor;
        mr mrVar = mr.setIncludeFontPadding;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        h((char) (47512 - TextUtils.indexOf((CharSequence) "", '0')), "周\uf41c駏﮹", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "⤿Ẅ涰繵껏敗㞓\uec73ꐯ鍩聲ﱭ\ue09a鰤\uee9f췶刹㒤\ue2f3\udb3b\uf3dd፭ㅽ횭觐전", objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(roVar.name());
        mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
        mu.setCompoundDrawableTintBlendMode(new Object[]{131016, getDisplayExponent.setCompoundDrawableTintBlendMode(roVar), null, 4}, -1968587119, 1968587120, 131016);
        l(this, roVar);
        int i10 = K + 13;
        L = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final void m(px pxVar) throws Throwable {
        String strIntern;
        setAddStatesFromChildren setaddstatesfromchildren;
        if (setCompoundDrawableTintBlendMode().get() == ng.setY) {
            if (this.F != null) {
                mr mrVar = mr.setCompoundDrawablePadding;
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr = new Object[1];
                h((char) (MotionEvent.axisFromString("") + 54398), "\uf16c洲綍쏔", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), "ƀစἭ楕ꮎ庞碖蚊\uf850ꌳ댲\ue26b壐創쨜\udf82圑૾䭇\uf536坟视ꃌћ偸ᖙ", objArr);
                sb2.append(((String) objArr[0]).intern());
                sb2.append(pxVar);
                mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                return;
            }
            this.F = pxVar;
            boolean z10 = pxVar instanceof pt;
            pt ptVar = z10 ? (pt) pxVar : null;
            this.E = ptVar != null ? (setMeasureWithLargestChildEnabled) pt.setY(new Object[]{ptVar}, 1337190740, -1337190740, System.identityHashCode(ptVar)) : null;
            if (z10) {
                Object[] objArr2 = new Object[1];
                g(new int[]{-45874896, 1061815436, -1454297650, -525537966}, TextUtils.getTrimmedLength("") + 8, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            } else if (pxVar instanceof ps) {
                Object[] objArr3 = new Object[1];
                h((char) (15109 - TextUtils.indexOf((CharSequence) "", '0', 0)), "郇얌۠\uf73b", (-523924336) - (ViewConfiguration.getDoubleTapTimeout() >> 16), "舞ᰢ嗺㞒ꂻ", objArr3);
                strIntern = ((String) objArr3[0]).intern();
            } else if (pxVar instanceof pp) {
                Object[] objArr4 = new Object[1];
                g(new int[]{1573018913, -365205639, -450317828, 1071467505, 833985731, -1912783556}, 9 - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
                strIntern = ((String) objArr4[0]).intern();
            } else if (Intrinsics.areEqual(pxVar, pk.INSTANCE)) {
                Object[] objArr5 = new Object[1];
                h((char) TextUtils.indexOf("", "", 0, 0), "\ue1bc䀭䕣ᖰ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "ൾ皌튖\ueea6彤ᝄ쟾❈", objArr5);
                strIntern = ((String) objArr5[0]).intern();
            } else {
                if (!Intrinsics.areEqual(pxVar, pr.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object[] objArr6 = new Object[1];
                h((char) (View.MeasureSpec.getSize(0) + 58619), "\ue93cⴣ\ufb19僤", Color.rgb(0, 0, 0) + 439165929, "굮몀귖៵⃟酚뫣ꩧੁ甊썋쫺훨艎㥺", objArr6);
                strIntern = ((String) objArr6[0]).intern();
            }
            pc.setY(new pe(this.f61343w, strIntern));
            if (z10) {
                setaddstatesfromchildren = setAddStatesFromChildren.setOnFocusChangeListener;
            } else if (pxVar instanceof ps) {
                setaddstatesfromchildren = setAddStatesFromChildren.setX;
            } else {
                if (!(pxVar instanceof pk)) {
                    if (!(pxVar instanceof pp)) {
                        if (!(pxVar instanceof pr)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r(new rn(rq.setX));
                        return;
                    }
                    pp ppVar = (pp) pxVar;
                    int i10 = setY.setOnFocusChangeListener[((pq) pp.setX(new Object[]{ppVar}, 1001409743, -1001409743, System.identityHashCode(ppVar))).ordinal()];
                    if (i10 == 1) {
                        r(new rn(rq.setDividerPadding));
                        return;
                    } else if (i10 == 2) {
                        l(this, ro.setIncludeFontPadding);
                        return;
                    } else {
                        if (i10 != 3) {
                            return;
                        }
                        l(this, ro.setAlwaysDrawnWithCacheEnabled);
                        return;
                    }
                }
                setaddstatesfromchildren = setAddStatesFromChildren.setCompoundDrawableTintBlendMode;
            }
            setY().setDividerPadding(setaddstatesfromchildren);
        }
    }

    public final void n(ro roVar, Throwable th2) {
        if (setCompoundDrawableTintBlendMode().get() == ng.setY) {
            ((ue) setDividerPadding(new Object[]{this}, 132914157, -132914157, System.identityHashCode(this))).setOnFocusChangeListener(ug.setOnLongClickListener);
            ue<sz> dividerPadding = setDividerPadding();
            if (dividerPadding != null) {
                dividerPadding.setOnFocusChangeListener(sz.setOnFocusChangeListener);
            }
        }
        this.f61341u.invoke(new rw(new byte[0], roVar, th2 != null ? rx.setOnFocusChangeListener(th2) : null));
    }

    public final void o(byte[] bArr) throws Throwable {
        int i10 = K + 113;
        L = i10 % 128;
        int i11 = i10 % 2;
        ng ngVar = setCompoundDrawableTintBlendMode().get();
        ng ngVar2 = ng.setOnFocusChangeListener;
        Function1<rs, Unit> function1 = this.f61341u;
        if (ngVar == ngVar2) {
            function1.invoke(new rn(rq.setOnFocusChangeListener));
            return;
        }
        if (setCompoundDrawableTintBlendMode().get() == ng.setCompoundDrawableTintBlendMode) {
            int i12 = L + 73;
            K = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        mr mrVar = mr.setCompoundDrawableTintBlendMode;
        Object[] objArr = new Object[1];
        h((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10911), "䎇䯍鸺\u202a", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, "礑덈좰ǀ굱늄ꆕ곛𥳐䲇㬘ᄚݫ៹䲘⯃\uf697휙툚\uec74蒬黶嚒ꮏ\u175b坍䝡딘陽Ꮫ", objArr);
        mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
        ((ue) setDividerPadding(new Object[]{this}, 132914157, -132914157, System.identityHashCode(this))).setOnFocusChangeListener(ug.setY);
        ue<sz> dividerPadding = setDividerPadding();
        if (dividerPadding != null) {
            int i13 = K + 89;
            L = i13 % 128;
            int i14 = i13 % 2;
            dividerPadding.setOnFocusChangeListener(sz.setY);
        }
        hashCode compoundDrawableTintBlendMode = mk.setOnFocusChangeListener.setCompoundDrawableTintBlendMode();
        if (compoundDrawableTintBlendMode instanceof hashCode.setX) {
            function1.invoke(new rn(mi.setCompoundDrawableTintBlendMode((hashCode.setX) compoundDrawableTintBlendMode)));
        } else {
            sq sqVar = this.f61340t;
            this.f61344x.setDividerPadding(new th(bArr, sqVar.setLayoutAnimation(), sqVar.getNavBarTitleString(), sqVar.setOnLongClickListener(), sqVar.setNavigationOnClickListener()), new d(this), new c(this));
        }
    }

    public final void q(ro roVar, Throwable th2) throws Throwable {
        if (setCompoundDrawableTintBlendMode().get() == ng.setY) {
            mr mrVar = mr.setOnFocusChangeListener;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            g(new int[]{-499740729, -856231227, 1921039775, -472829768, -2071911329, 2136335688, -1681981592, 1407705499, 1391230155, 592410014, -897538417, -1521092507, 327076235, 1166391427, 1966558106, 1016938980}, (Process.myPid() >> 22) + 29, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(roVar.name());
            mt.setX(new Object[]{sb2.toString()}, 1189439426, -1189439420, (int) System.currentTimeMillis());
            mu.setCompoundDrawableTintBlendMode(new Object[]{130008, getDisplayExponent.setCompoundDrawableTintBlendMode(roVar), th2}, -1087921663, 1087921663, 130008);
            j().setY(new rw(new byte[0], roVar, th2 != null ? rx.setOnFocusChangeListener(th2) : null));
            setY().setOnFocusChangeListener();
        }
    }

    public final void r(rs rsVar) throws Throwable {
        Object obj;
        if (setCompoundDrawableTintBlendMode().get() == ng.setCompoundDrawableTintBlendMode) {
            return;
        }
        mr mrVar = mr.setIncludeFontPadding;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        g(new int[]{-1154548122, -1177381406, 1003091315, -2135180611, 1492169383, -1459370610, 1492210140, 551508471, 1391230155, 592410014, 395426466, 1184372740, 870220257, 2104934399, 1966558106, 1016938980}, 29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(rsVar);
        mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
        mu.setCompoundDrawableTintBlendMode(new Object[]{130009, mw.setDividerPadding(rsVar), null, 4}, -1968587119, 1968587120, 130009);
        boolean z10 = rsVar instanceof rr;
        UUID uuid = this.f61343w;
        if (z10) {
            if (((rr) rsVar).setOnFocusChangeListener() instanceof rp) {
                Object[] objArr2 = new Object[1];
                h((char) KeyEvent.getDeadChar(0, 0), "蒣秏蔼刧", ViewConfiguration.getTouchSlop() >> 8, "軦俳⮒홰⋾褷\ueafe菍", objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                g(new int[]{1025766141, -1601862437, 856915507, 1480712025, 728463942, -1366675179, 2051219658, 1917129887}, 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
                obj = objArr3[0];
            }
            pc.setY(new ov(uuid, ((String) obj).intern(), mw.setDividerPadding(rsVar)));
        } else if (rsVar instanceof rn) {
            pc.setY(new ot(uuid, String.valueOf(((rn) rsVar).setX().ordinal()), mw.setDividerPadding(rsVar)));
        } else if (rsVar instanceof rw) {
            pc.setY(new ou(this.f61343w, null, 10053, mw.setDividerPadding(rsVar), 2, null));
        }
        if (z10) {
            rr rrVar = (rr) rsVar;
            if (((UUID) rr.setX(new Object[]{rrVar}, -829404909, 829404909, System.identityHashCode(rrVar))) != null) {
                this.f61345y.setCompoundDrawableTintBlendMode(new setOnDragListener(), new b());
            }
        }
        this.f61341u.invoke(rsVar);
    }

    @Override // com.mypinpad.tsdk.isolation.ni
    public final boolean setLayoutAnimation() throws Throwable {
        int i10 = L + 49;
        K = i10 % 128;
        int i11 = i10 % 2;
        if (!this.f61339s.setOnFocusChangeListener()) {
            mr mrVar = mr.setIncludeFontPadding;
            Object[] objArr = new Object[1];
            g(new int[]{-586088957, 46411383, 68574355, 8158773, 1084918097, 1971644149, 1474679964, -822843068, -1083047941, 1533463566, 1485100736, -1696662062, -1412474158, -1942658667, 2051219658, 1917129887}, Color.rgb(0, 0, 0) + 16777246, objArr);
            mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -855939515, 855939522, (int) System.currentTimeMillis());
            mu.setCompoundDrawableTintBlendMode(new Object[]{130020, null, null, 6}, -1968587119, 1968587120, 130020);
            l(this, ro.setCompoundDrawableTintBlendMode);
            int i12 = K + 63;
            L = i12 % 128;
            if (i12 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i13 = K + 89;
        L = i13 % 128;
        if (i13 % 2 == 0) {
            mr mrVar2 = mr.setIncludeFontPadding;
            Object[] objArr2 = new Object[1];
            g(new int[]{83709536, -1602590787, -2108729108, 1952136439, -724616451, 1495592385, -1423169816, -1803982537, 2065126649, -799488363, -1868644874, 2011490132, 1620892208, -1275154956}, 54 % (ViewConfiguration.getKeyRepeatDelay() << 63), objArr2);
            mt.setX(new Object[]{mrVar2, ((String) objArr2[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
            return true;
        }
        mr mrVar3 = mr.setIncludeFontPadding;
        Object[] objArr3 = new Object[1];
        g(new int[]{83709536, -1602590787, -2108729108, 1952136439, -724616451, 1495592385, -1423169816, -1803982537, 2065126649, -799488363, -1868644874, 2011490132, 1620892208, -1275154956}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, objArr3);
        mt.setX(new Object[]{mrVar3, ((String) objArr3[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
        return true;
    }

    @Override // com.mypinpad.tsdk.isolation.ni
    public final /* synthetic */ nh setX() {
        int i10 = K + 43;
        L = i10 % 128;
        int i11 = i10 % 2;
        uk ukVarJ = j();
        int i12 = L + 55;
        K = i12 % 128;
        int i13 = i12 % 2;
        return ukVarJ;
    }

    public final void t() throws Throwable {
        if (setCompoundDrawableTintBlendMode().get() == ng.setOnFocusChangeListener) {
            this.f61341u.invoke(new rn(rq.setOnFocusChangeListener));
            int i10 = L + 123;
            K = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        if (setCompoundDrawableTintBlendMode().get() == ng.setCompoundDrawableTintBlendMode) {
            int i12 = K + 27;
            L = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        nt ntVar = this.f61338r;
        re reVar = (re) nt.setX(new Object[]{ntVar}, -1108058495, 1108058495, System.identityHashCode(ntVar));
        if (reVar != null) {
            CompletableFuture completableFutureB = com.esotericsoftware.kryo.serializers.d.b();
            mu.setCompoundDrawableTintBlendMode(new Object[]{131000, null, null, 6}, -1968587119, 1968587120, 131000);
            this.f61345y.setCompoundDrawableTintBlendMode(new setNavigationOnClickListener(), new a(completableFutureB, this));
            completableFutureB.complete(reVar.setDividerPadding());
            return;
        }
        setDividerPadding(new Object[]{this}, 57163524, -57163519, System.identityHashCode(this));
        int i14 = L + 17;
        K = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public static final void setOnFocusChangeListener(ul ulVar, ro roVar) throws Throwable {
        int i10 = K + 13;
        L = i10 % 128;
        int i11 = i10 % 2;
        ulVar.getClass();
        mr mrVar = mr.setIncludeFontPadding;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        h((char) ((Process.myPid() >> 22) + 48713), "☨\u0890䤾袾", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "嶳죾瘏铪녧μ乻칗嚝渣\ueadf\uf23bꇋ\ue79f\u07b6㪢\ue721뛧\ud967맵\ua9ff볇\uddb8銕䍁밙狺籤뾯䡤", objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(roVar.name());
        mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
        mu.setCompoundDrawableTintBlendMode(new Object[]{130011, getDisplayExponent.setCompoundDrawableTintBlendMode(roVar), null, 4}, -1968587119, 1968587120, 130011);
        l(ulVar, roVar);
        int i12 = K + 87;
        int i13 = i12 % 128;
        L = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        int i14 = i13 + 35;
        K = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 73 / 0;
        }
    }

    public static final /* synthetic */ void setX(ul ulVar) throws Throwable {
        int i10 = L + 107;
        K = i10 % 128;
        int i11 = i10 % 2;
        ulVar.t();
        if (i11 != 0) {
            int i12 = 46 / 0;
        }
    }

    public static final /* synthetic */ void setY(ul ulVar, ro roVar, Throwable th2) throws Throwable {
        int i10 = L + 53;
        K = i10 % 128;
        int i11 = i10 % 2;
        ulVar.q(roVar, th2);
        int i12 = L + 121;
        K = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 62 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // com.mypinpad.tsdk.isolation.ni
    public final void setCompoundDrawableTintBlendMode(@NotNull Throwable th2) {
        ro roVar;
        int i10;
        int i11 = L + 47;
        K = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th2, "");
            int i12 = 65 / 0;
            if (!(!s(th2))) {
                roVar = ro.setZ;
                i10 = L + 85;
                K = i10 % 128;
            } else if (((Boolean) setDividerPadding(new Object[]{th2}, -742586138, 742586139, (int) System.currentTimeMillis())).booleanValue()) {
                roVar = ro.setTextAlignment;
            } else {
                roVar = ro.setNavigationOnClickListener;
                i10 = K + 19;
                L = i10 % 128;
            }
            int i13 = i10 % 2;
        } else {
            Intrinsics.checkNotNullParameter(th2, "");
            if (s(th2)) {
                roVar = ro.setZ;
                i10 = L + 85;
                K = i10 % 128;
            } else if (((Boolean) setDividerPadding(new Object[]{th2}, -742586138, 742586139, (int) System.currentTimeMillis())).booleanValue()) {
                roVar = ro.setTextAlignment;
            } else {
                roVar = ro.setNavigationOnClickListener;
                i10 = K + 19;
                L = i10 % 128;
            }
            int i14 = i10 % 2;
        }
        n(roVar, th2);
    }

    public static final /* synthetic */ void setX(ul ulVar, rs rsVar) throws Throwable {
        int i10 = L + 55;
        K = i10 % 128;
        int i11 = i10 % 2;
        ulVar.r(rsVar);
        if (i11 != 0) {
            throw null;
        }
        int i12 = K + 89;
        L = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void setY(ul ulVar, byte[] bArr) throws Throwable {
        int i10 = L + 61;
        K = i10 % 128;
        int i11 = i10 % 2;
        setDividerPadding(new Object[]{ulVar, bArr}, 1907581888, -1907581885, System.identityHashCode(ulVar));
        int i12 = K + 73;
        L = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.ni
    @NotNull
    public final ue<ug> setOnFocusChangeListener() {
        return (ue) setDividerPadding(new Object[]{this}, 132914157, -132914157, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ni
    public final void setCompoundDrawableTintBlendMode(@NotNull setAccessibilityDelegate.setX setx) throws Throwable {
        setDividerPadding(new Object[]{this, setx}, 981947785, -981947783, System.identityHashCode(this));
    }

    public static final /* synthetic */ UUID setDividerPadding(ul ulVar) {
        int i10 = L + 43;
        int i11 = i10 % 128;
        K = i11;
        int i12 = i10 % 2;
        UUID uuid = ulVar.f61343w;
        int i13 = i11 + 33;
        L = i13 % 128;
        int i14 = i13 % 2;
        return uuid;
    }

    public static final /* synthetic */ void setDividerPadding(ul ulVar, px pxVar) throws Throwable {
        int i10 = K + 67;
        L = i10 % 128;
        int i11 = i10 % 2;
        ulVar.m(pxVar);
        if (i11 == 0) {
            throw null;
        }
        int i12 = K + 115;
        L = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ni
    @Nullable
    public final ue<sz> setDividerPadding() {
        int i10 = K + 123;
        int i11 = i10 % 128;
        L = i11;
        if (i10 % 2 == 0) {
            int i12 = 77 / 0;
        }
        int i13 = i11 + 9;
        K = i13 % 128;
        if (i13 % 2 == 0) {
            return this.A;
        }
        throw null;
    }
}
