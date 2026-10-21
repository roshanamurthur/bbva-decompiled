package com.bbva.component.dm.biometriclogin;

import android.app.Activity;
import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoFeatureFlagDataSource;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.biometriclogin.domain.provider.BiometricAvailability;
import com.bbva.component.dm.biometriclogin.domain.provider.BiometricsAdapter;
import com.bbva.component.dm.biometriclogin.proxy.NaturalAuthenticationClientProxy;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.settings.domain.usecase.FetchQuickLoginConfigUseCase;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.viewmodel.PerformedAction;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 A2\u00020\u0001:\u0001AB;\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u0006\u0010<\u001a\u00020;\u0012\b\b\u0002\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\u0006J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0006J\b\u0010\u001a\u001a\u00020\u0006H\u0014J\b\u0010\u001b\u001a\u00020\u0006H\u0016R$\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R$\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(R$\u0010,\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R$\u00102\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/base/viewmodel/PerformedAction;", "", "func", "onActionPerformed", "initialize", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "completeCheck", "checkIsAuthenticationAvailable", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "checkAuthenticationIsPossible", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "deleteAuthenticators", "setActivity", Constants.backendRequestUserId, "setUp", "Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricAvailability;", "isDeviceBiometricsEnabled", "resetState", "onPropertiesBound", "dispose", "value", "isBiometricsAccessEnabled", "()Z", "setBiometricsAccessEnabled", "(Z)V", "isFidoEnrolled", "setFidoEnrolled", "isBiometricAvailable", "()Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "setBiometricAvailable", "(Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;)V", "getDeviceBiometryType", "()Ljava/lang/String;", "deviceBiometryType", "getShouldShowAuthenticator", "setShouldShowAuthenticator", "shouldShowAuthenticator", "", "getSkippedTimes", "()I", "setSkippedTimes", "(I)V", "skippedTimes", "Lcom/bbva/component/dm/biometriclogin/proxy/NaturalAuthenticationClientProxy;", "naturalAuthenticationClientProxy", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;", "biometricsDatasource", "Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricsAdapter;", "biometricsAdapter", "Lcom/bbva/component/dm/settings/domain/usecase/FetchQuickLoginConfigUseCase;", "quickLoginConfigUseCase", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoFeatureFlagDataSource;", "fidoFeatureFlagDataSource", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/component/dm/biometriclogin/proxy/NaturalAuthenticationClientProxy;Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricsAdapter;Lcom/bbva/component/dm/settings/domain/usecase/FetchQuickLoginConfigUseCase;Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoFeatureFlagDataSource;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Companion", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBiometricAuthenticationDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n1#2:410\n*E\n"})
public final class BiometricAuthenticationDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-biometriclogin";
    public boolean E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NaturalAuthenticationClientProxy f27435p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final BiometricDatasource f27436q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final BiometricsAdapter f27437r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final FetchQuickLoginConfigUseCase f27438s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final FidoFeatureFlagDataSource f27439t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f27440u0;

    @NotNull
    public final CoroutineScope v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public String f27441w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public Activity f27442x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public Function1<? super PerformedAction, Unit> f27443y0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ActionSpec<Result<Boolean>> ACTION_BIOMETRICS_SETUP = new ActionSpec<>("on-biometrics-setup");

    @JvmField
    @NotNull
    public static final ActionSpec<Result<Boolean>> ACTION_BIOMETRICS_AUTH_INITIALIZED = new ActionSpec<>("on-biometrics-authentication-initialized");

    @JvmField
    @NotNull
    public static final ActionSpec<BiometryAuthState> ACTION_AUTHENTICATION_POSSIBLE = new ActionSpec<>("on-biometric-authentication-possible");

    @JvmField
    @NotNull
    public static final ActionSpec<BiometryAuthResult> ACTION_BIOMETRICS_AUTHENTICATE = new ActionSpec<>("on-biometric-authenticated");

    @JvmField
    @NotNull
    public static final ActionSpec<Result<Boolean>> ACTION_BIOMETRICS_DELETE_AUTHENTICATORS = new ActionSpec<>("on-biometrics-authenticators-removed");

    @NotNull
    public static final UnsupportedOperationException F0 = new UnsupportedOperationException("Not initialized properly, make sure to set the userId");

    /* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u0015\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$Companion;", "", "()V", "ACTION_AUTHENTICATION_POSSIBLE", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "ACTION_BIOMETRICS_AUTHENTICATE", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult;", "ACTION_BIOMETRICS_AUTH_INITIALIZED", "Lkotlin/Result;", "", "ACTION_BIOMETRICS_DELETE_AUTHENTICATORS", "ACTION_BIOMETRICS_SETUP", "ID", "", "INITIALIZATION_ERROR", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "getINITIALIZATION_ERROR", "()Ljava/lang/UnsupportedOperationException;", "POLICY_BIOMETRICS", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UnsupportedOperationException getINITIALIZATION_ERROR() {
            return BiometricAuthenticationDataManager.F0;
        }
    }

    /* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
    public static final class a extends Lambda implements Function1<Either<? extends FidoException, ? extends Unit>, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Either<? extends FidoException, ? extends Unit> either) {
            Either<? extends FidoException, ? extends Unit> result = either;
            Intrinsics.checkNotNullParameter(result, "result");
            BiometricAuthenticationDataManager biometricAuthenticationDataManager = BiometricAuthenticationDataManager.this;
            BuildersKt__Builders_commonKt.launch$default(biometricAuthenticationDataManager.v0, null, null, new com.bbva.component.dm.biometriclogin.a(result, biometricAuthenticationDataManager, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
    @DebugMetadata(c = "com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager", f = "BiometricAuthenticationDataManager.kt", i = {0, 0, 1, 1}, l = {253, 256}, m = "checkAuthenticationIsPossible", n = {"this", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "this", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public BiometricAuthenticationDataManager f27445p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Activity f27446q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f27447r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f27449t0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27447r0 = obj;
            this.f27449t0 |= Integer.MIN_VALUE;
            return BiometricAuthenticationDataManager.this.checkAuthenticationIsPossible(null, this);
        }
    }

    /* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
    public static final class c extends Lambda implements Function1<Either<? extends FidoException, ? extends Boolean>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<BiometryAuthState> f27450p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BiometricAuthenticationDataManager f27451q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BiometricAuthenticationDataManager biometricAuthenticationDataManager, SafeContinuation safeContinuation) {
            super(1);
            this.f27450p0 = safeContinuation;
            this.f27451q0 = biometricAuthenticationDataManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Either<? extends FidoException, ? extends Boolean> either) {
            Either<? extends FidoException, ? extends Boolean> result = either;
            Intrinsics.checkNotNullParameter(result, "result");
            boolean z10 = result instanceof Either.Right;
            Continuation<BiometryAuthState> continuation = this.f27450p0;
            if (z10) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m5535constructorimpl(BiometricAuthenticationDataManager.access$toBiometryAuthState(this.f27451q0, ((Boolean) ((Either.Right) result).getValue()).booleanValue())));
            } else if (result instanceof Either.Left) {
                Result.Companion companion2 = Result.INSTANCE;
                continuation.resumeWith(Result.m5535constructorimpl(new BiometryAuthState.NotAvailable((Exception) ((Either.Left) result).getError())));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
    @SourceDebugExtension({"SMAP\nBiometricAuthenticationDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$deleteAuthenticators$1\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n*L\n1#1,409:1\n25#2,3:410\n32#2,3:413\n*S KotlinDebug\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$deleteAuthenticators$1\n*L\n313#1:410,3\n316#1:413,3\n*E\n"})
    public static final class d extends Lambda implements Function1<Either<? extends FidoException, ? extends Unit>, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Either<? extends FidoException, ? extends Unit> either) {
            Either<? extends FidoException, ? extends Unit> result = either;
            Intrinsics.checkNotNullParameter(result, "result");
            boolean z10 = result instanceof Either.Right;
            BiometricAuthenticationDataManager biometricAuthenticationDataManager = BiometricAuthenticationDataManager.this;
            if (z10) {
                ActionSpec<Result<Boolean>> actionSpec = BiometricAuthenticationDataManager.ACTION_BIOMETRICS_DELETE_AUTHENTICATORS;
                Result.Companion companion = Result.INSTANCE;
                biometricAuthenticationDataManager.fire(actionSpec, Result.m5534boximpl(Result.m5535constructorimpl(Boolean.TRUE)));
                result = EitherKt.right(Unit.INSTANCE);
            } else if (!(result instanceof Either.Left)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(result instanceof Either.Right)) {
                if (!(result instanceof Either.Left)) {
                    throw new NoWhenBranchMatchedException();
                }
                FidoException fidoException = (FidoException) ((Either.Left) result).getError();
                ActionSpec<Result<Boolean>> actionSpec2 = BiometricAuthenticationDataManager.ACTION_BIOMETRICS_DELETE_AUTHENTICATORS;
                Result.Companion companion2 = Result.INSTANCE;
                biometricAuthenticationDataManager.fire(actionSpec2, Result.m5534boximpl(Result.m5535constructorimpl(ResultKt.createFailure(fidoException))));
                EitherKt.left(Unit.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
    @SourceDebugExtension({"SMAP\nBiometricAuthenticationDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$initialize$1\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n25#2,3:410\n32#2,3:413\n1#3:416\n*S KotlinDebug\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$initialize$1\n*L\n95#1:410,3\n96#1:413,3\n*E\n"})
    public static final class e extends Lambda implements Function1<Either<? extends FidoException, ? extends Unit>, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Either<? extends FidoException, ? extends Unit> either) {
            Unit unit;
            Either<? extends FidoException, ? extends Unit> result = either;
            Intrinsics.checkNotNullParameter(result, "result");
            boolean z10 = result instanceof Either.Right;
            BiometricAuthenticationDataManager biometricAuthenticationDataManager = BiometricAuthenticationDataManager.this;
            if (z10) {
                BiometricAuthenticationDataManager.access$completeInitialization(biometricAuthenticationDataManager);
                result = EitherKt.right(Unit.INSTANCE);
            } else if (!(result instanceof Either.Left)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(result instanceof Either.Right)) {
                if (!(result instanceof Either.Left)) {
                    throw new NoWhenBranchMatchedException();
                }
                Activity activity = biometricAuthenticationDataManager.f27442x0;
                if (activity != null) {
                    biometricAuthenticationDataManager.checkIsAuthenticationAvailable(activity, true);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                EitherKt.left(unit);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BiometricAuthenticationDataManager(NaturalAuthenticationClientProxy naturalAuthenticationClientProxy, BiometricDatasource biometricDatasource, BiometricsAdapter biometricsAdapter, FetchQuickLoginConfigUseCase fetchQuickLoginConfigUseCase, FidoFeatureFlagDataSource fidoFeatureFlagDataSource, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(naturalAuthenticationClientProxy, biometricDatasource, biometricsAdapter, fetchQuickLoginConfigUseCase, fidoFeatureFlagDataSource, (i10 & 32) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }

    public static final void access$completeInitialization(BiometricAuthenticationDataManager biometricAuthenticationDataManager) {
        BuildersKt__Builders_commonKt.launch$default(biometricAuthenticationDataManager.v0, null, null, new v4.b(biometricAuthenticationDataManager, null), 3, null);
    }

    public static final FidoSession access$fidoSession(BiometricAuthenticationDataManager biometricAuthenticationDataManager) {
        return new FidoSession(biometricAuthenticationDataManager.f27441w0, "Biometrics");
    }

    public static final BiometryAuthState access$toBiometryAuthState(BiometricAuthenticationDataManager biometricAuthenticationDataManager, boolean z10) {
        biometricAuthenticationDataManager.getClass();
        return z10 ? BiometryAuthState.Available.INSTANCE : new BiometryAuthState.NotAvailable(null, 1, null);
    }

    public static /* synthetic */ void checkIsAuthenticationAvailable$default(BiometricAuthenticationDataManager biometricAuthenticationDataManager, Activity activity, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        biometricAuthenticationDataManager.checkIsAuthenticationAvailable(activity, z10);
    }

    public static /* synthetic */ void setUp$default(BiometricAuthenticationDataManager biometricAuthenticationDataManager, String str, Activity activity, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            activity = null;
        }
        biometricAuthenticationDataManager.setUp(str, activity);
    }

    public final void authenticate(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.E0) {
            return;
        }
        this.E0 = true;
        FetchQuickLoginConfigUseCase fetchQuickLoginConfigUseCase = this.f27438s0;
        boolean zBooleanValue = fetchQuickLoginConfigUseCase != null ? fetchQuickLoginConfigUseCase.execute(Unit.INSTANCE).booleanValue() : false;
        NaturalAuthenticationClientProxy naturalAuthenticationClientProxy = this.f27435p0;
        naturalAuthenticationClientProxy.setQuickLoginEnable(zBooleanValue);
        naturalAuthenticationClientProxy.authenticate(activity, new FidoSession(this.f27441w0, "Biometrics"), new a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object checkAuthenticationIsPossible(@NotNull Activity activity, @NotNull Continuation<? super BiometryAuthState> continuation) {
        b bVar;
        BiometricAuthenticationDataManager biometricAuthenticationDataManager;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f27449t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f27449t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objIsQuickDataEnabled = bVar.f27447r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f27449t0;
        if (i11 != 0) {
            if (i11 == 1) {
                activity = bVar.f27446q0;
                biometricAuthenticationDataManager = bVar.f27445p0;
                ResultKt.throwOnFailure(objIsQuickDataEnabled);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objIsQuickDataEnabled);
            }
        }
        ResultKt.throwOnFailure(objIsQuickDataEnabled);
        FidoSession fidoSession = new FidoSession(this.f27441w0, "Biometrics");
        bVar.f27445p0 = this;
        bVar.f27446q0 = activity;
        bVar.f27449t0 = 1;
        objIsQuickDataEnabled = this.f27435p0.isQuickDataEnabled(fidoSession, bVar);
        if (objIsQuickDataEnabled == coroutine_suspended) {
            return coroutine_suspended;
        }
        biometricAuthenticationDataManager = this;
        if (((Boolean) objIsQuickDataEnabled).booleanValue()) {
            return BiometryAuthState.Available.INSTANCE;
        }
        bVar.f27445p0 = biometricAuthenticationDataManager;
        bVar.f27446q0 = activity;
        bVar.f27449t0 = 2;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(bVar));
        biometricAuthenticationDataManager.f27435p0.checkAuthIsPossible(activity, new FidoSession(biometricAuthenticationDataManager.f27441w0, "Biometrics"), new c(biometricAuthenticationDataManager, safeContinuation));
        objIsQuickDataEnabled = safeContinuation.getOrThrow();
        if (objIsQuickDataEnabled == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(bVar);
        }
        return objIsQuickDataEnabled == coroutine_suspended ? coroutine_suspended : objIsQuickDataEnabled;
    }

    public final void checkIsAuthenticationAvailable(@NotNull Activity activity, boolean completeCheck) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = this.f27441w0;
        BiometricDatasource biometricDatasource = this.f27436q0;
        boolean z10 = true;
        if ((str == null || str.length() == 0) && !biometricDatasource.isFidoEnrolled()) {
            deleteAuthenticators(activity);
            Function1<? super PerformedAction, Unit> function1 = this.f27443y0;
            if (function1 != null) {
                function1.invoke(new PerformedAction(ACTION_AUTHENTICATION_POSSIBLE.getId(), new BiometryAuthState.NotAvailable(null, 1, null)));
            }
            fire(ACTION_AUTHENTICATION_POSSIBLE, new BiometryAuthState.NotAvailable(null, 1, null));
        } else {
            String str2 = this.f27441w0;
            if (str2 == null || str2.length() == 0) {
                Function1<? super PerformedAction, Unit> function2 = this.f27443y0;
                UnsupportedOperationException unsupportedOperationException = F0;
                if (function2 != null) {
                    function2.invoke(new PerformedAction(ACTION_AUTHENTICATION_POSSIBLE.getId(), new BiometryAuthState.NotAvailable(unsupportedOperationException)));
                }
                fire(ACTION_AUTHENTICATION_POSSIBLE, new BiometryAuthState.NotAvailable(unsupportedOperationException));
            } else if (!isBiometricsAccessEnabled()) {
                Function1<? super PerformedAction, Unit> function3 = this.f27443y0;
                if (function3 != null) {
                    function3.invoke(new PerformedAction(ACTION_AUTHENTICATION_POSSIBLE.getId(), new BiometryAuthState.NotAvailable(null, 1, null)));
                }
                fire(ACTION_AUTHENTICATION_POSSIBLE, new BiometryAuthState.NotAvailable(null, 1, null));
            } else if (isBiometricsAccessEnabled() && !biometricDatasource.getIsDeviceBiometricsEnabled()) {
                Function1<? super PerformedAction, Unit> function4 = this.f27443y0;
                if (function4 != null) {
                    function4.invoke(new PerformedAction(ACTION_AUTHENTICATION_POSSIBLE.getId(), BiometryAuthState.Fraud.INSTANCE));
                }
                fire(ACTION_AUTHENTICATION_POSSIBLE, BiometryAuthState.Fraud.INSTANCE);
            } else if (completeCheck) {
                BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new v4.a(this, activity, null), 3, null);
            } else {
                BiometryAuthState biometryAuthStateIsBiometricAvailable = isBiometricAvailable();
                BiometryAuthState.Retry retry = BiometryAuthState.Retry.INSTANCE;
                if (Intrinsics.areEqual(biometryAuthStateIsBiometricAvailable, retry)) {
                    Function1<? super PerformedAction, Unit> function5 = this.f27443y0;
                    if (function5 != null) {
                        function5.invoke(new PerformedAction(ACTION_AUTHENTICATION_POSSIBLE.getId(), retry));
                    }
                    fire(ACTION_AUTHENTICATION_POSSIBLE, retry);
                } else {
                    Function1<? super PerformedAction, Unit> function6 = this.f27443y0;
                    if (function6 != null) {
                        function6.invoke(new PerformedAction(ACTION_AUTHENTICATION_POSSIBLE.getId(), BiometryAuthState.Available.INSTANCE));
                    }
                    fire(ACTION_AUTHENTICATION_POSSIBLE, BiometryAuthState.Available.INSTANCE);
                }
            }
        }
        String str3 = this.f27441w0;
        if (str3 != null && str3.length() != 0) {
            z10 = false;
        }
        LoggerKt.logDebug$default("TAG[BiometricAuthenticationDataManager] checkIsAuthenticationAvailable - UID-NullOrEmpty[" + z10 + "] - ifd[" + biometricDatasource.isFidoEnrolled() + "] - isBioAccessEnabled[" + isBiometricsAccessEnabled() + "] - isDevBioEnabled[" + biometricDatasource.getIsDeviceBiometricsEnabled() + "] - completeCheck[" + completeCheck + "] - Retry?[" + Intrinsics.areEqual(isBiometricAvailable(), BiometryAuthState.Retry.INSTANCE) + Constant.BRACKET_CLOSE, null, 2, null);
    }

    public final void deleteAuthenticators(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27435p0.deleteAuthenticatorsLocally(activity, new FidoSession(this.f27441w0, "Biometrics"), new d());
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        super.dispose();
        CoroutineScopeKt.cancel$default(this.v0, null, 1, null);
    }

    @NotNull
    public final String getDeviceBiometryType() {
        return this.f27437r0.deviceBiometricType();
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getE0() {
        return ID;
    }

    public final boolean getShouldShowAuthenticator() {
        return this.f27436q0.getShouldShowAuthenticator();
    }

    public final int getSkippedTimes() {
        return this.f27436q0.getSkippedTimes();
    }

    public final void initialize() {
        this.f27435p0.initialize(new e());
    }

    @NotNull
    public final BiometryAuthState isBiometricAvailable() {
        return this.f27436q0.getIsBiometricAvailable();
    }

    public final boolean isBiometricsAccessEnabled() {
        return this.f27436q0.isBiometricAccessEnabled() && this.f27439t0.isFidoFlagEnabled();
    }

    @NotNull
    public final BiometricAvailability isDeviceBiometricsEnabled() {
        return this.f27437r0.isBiometricsAvailable();
    }

    public final boolean isFidoEnrolled() {
        return this.f27436q0.isFidoEnrolled();
    }

    public final void onActionPerformed(@Nullable Function1<? super PerformedAction, Unit> func) {
        this.f27443y0 = func;
    }

    public final void resetState() {
        if (isBiometricAvailable().isAvailable()) {
            setBiometricAvailable(BiometryAuthState.Available.INSTANCE);
            setShouldShowAuthenticator(true);
        }
    }

    public final void setActivity(@Nullable Activity activity) {
        this.f27442x0 = activity;
    }

    public final void setBiometricAvailable(@NotNull BiometryAuthState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f27436q0.setBiometricAvailable(value);
    }

    public final void setBiometricsAccessEnabled(boolean z10) {
        this.f27436q0.setBiometricAccessEnabled(z10);
    }

    public final void setFidoEnrolled(boolean z10) {
        this.f27436q0.setFidoEnrolled(z10);
    }

    public final void setShouldShowAuthenticator(boolean z10) {
        this.f27436q0.setShouldShowAuthenticator(z10);
    }

    public final void setSkippedTimes(int i10) {
        this.f27436q0.setSkippedTimes(i10);
    }

    public final void setUp(@NotNull String userId, @Nullable Activity activity) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(userId, "userId");
        setActivity(activity);
        this.f27441w0 = userId;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(this.f27437r0.isBiometricsAvailable());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = BiometricAvailability.Unavailable.INSTANCE;
        }
        this.f27436q0.setDeviceBiometricsEnabled(((BiometricAvailability) objM5535constructorimpl) instanceof BiometricAvailability.Success);
        initialize();
    }

    public BiometricAuthenticationDataManager(@NotNull NaturalAuthenticationClientProxy naturalAuthenticationClientProxy, @NotNull BiometricDatasource biometricsDatasource, @NotNull BiometricsAdapter biometricsAdapter, @Nullable FetchQuickLoginConfigUseCase fetchQuickLoginConfigUseCase, @NotNull FidoFeatureFlagDataSource fidoFeatureFlagDataSource, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(naturalAuthenticationClientProxy, "naturalAuthenticationClientProxy");
        Intrinsics.checkNotNullParameter(biometricsDatasource, "biometricsDatasource");
        Intrinsics.checkNotNullParameter(biometricsAdapter, "biometricsAdapter");
        Intrinsics.checkNotNullParameter(fidoFeatureFlagDataSource, "fidoFeatureFlagDataSource");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f27435p0 = naturalAuthenticationClientProxy;
        this.f27436q0 = biometricsDatasource;
        this.f27437r0 = biometricsAdapter;
        this.f27438s0 = fetchQuickLoginConfigUseCase;
        this.f27439t0 = fidoFeatureFlagDataSource;
        this.f27440u0 = dispatchers;
        this.v0 = CoroutineScopeKt.MainScope();
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
    }
}
