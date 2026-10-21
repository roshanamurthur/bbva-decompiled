package v4;

import android.app.Activity;
import androidx.camera.camera2.internal.h0;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.biometriclogin.proxy.NaturalAuthenticationClientProxy;
import com.bbva.glomohybrid.base.viewmodel.PerformedAction;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager$checkAuthInternal$1", f = "BiometricAuthenticationDataManager.kt", i = {0}, l = {207}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93968p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f93969q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ BiometricAuthenticationDataManager f93970r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Activity f93971s0;

    /* JADX INFO: renamed from: v4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
    @SourceDebugExtension({"SMAP\nBiometricAuthenticationDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$checkAuthInternal$1$1\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n*L\n1#1,409:1\n46#2,3:410\n53#2,3:413\n25#2,3:416\n32#2,3:419\n*S KotlinDebug\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$checkAuthInternal$1$1\n*L\n215#1:410,3\n216#1:413,3\n217#1:416,3\n227#1:419,3\n*E\n"})
    public static final class C0501a extends Lambda implements Function1<Either<? extends FidoException, ? extends Boolean>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BiometricAuthenticationDataManager f93972p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f93973q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0501a(BiometricAuthenticationDataManager biometricAuthenticationDataManager, CoroutineScope coroutineScope) {
            super(1);
            this.f93972p0 = biometricAuthenticationDataManager;
            this.f93973q0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Either<? extends FidoException, ? extends Boolean> either) {
            Either<? extends FidoException, ? extends Boolean> result = either;
            Intrinsics.checkNotNullParameter(result, "result");
            boolean z10 = result instanceof Either.Right;
            BiometricAuthenticationDataManager biometricAuthenticationDataManager = this.f93972p0;
            if (z10) {
                result = EitherKt.right(BiometricAuthenticationDataManager.access$toBiometryAuthState(biometricAuthenticationDataManager, ((Boolean) ((Either.Right) result).getValue()).booleanValue()));
            } else if (!(result instanceof Either.Left)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(result instanceof Either.Right)) {
                if (!(result instanceof Either.Left)) {
                    throw new NoWhenBranchMatchedException();
                }
                result = EitherKt.left(new BiometryAuthState.NotAvailable((FidoException) ((Either.Left) result).getError()));
            }
            boolean z11 = result instanceof Either.Right;
            CoroutineScope coroutineScope = this.f93973q0;
            if (z11) {
                BiometryAuthState biometryAuthState = (BiometryAuthState) ((Either.Right) result).getValue();
                LoggerKt.logDebug$default("TAG[" + coroutineScope.getClass().getSimpleName() + "] checkAuthInternal[" + biometryAuthState + Constant.BRACKET_CLOSE, null, 2, null);
                Function1 function1 = biometricAuthenticationDataManager.f27443y0;
                if (function1 != null) {
                    function1.invoke(new PerformedAction(BiometricAuthenticationDataManager.ACTION_AUTHENTICATION_POSSIBLE.getId(), biometryAuthState));
                }
                biometricAuthenticationDataManager.fire(BiometricAuthenticationDataManager.ACTION_AUTHENTICATION_POSSIBLE, biometryAuthState);
                result = EitherKt.right(Unit.INSTANCE);
            } else if (!(result instanceof Either.Left)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(result instanceof Either.Right)) {
                if (!(result instanceof Either.Left)) {
                    throw new NoWhenBranchMatchedException();
                }
                BiometryAuthState.NotAvailable notAvailable = (BiometryAuthState.NotAvailable) ((Either.Left) result).getError();
                LoggerKt.logDebug$default(h0.b("TAG[", coroutineScope.getClass().getSimpleName(), "] checkAuthInternal[NOT]"), null, 2, null);
                Function1 function2 = biometricAuthenticationDataManager.f27443y0;
                if (function2 != null) {
                    function2.invoke(new PerformedAction(BiometricAuthenticationDataManager.ACTION_AUTHENTICATION_POSSIBLE.getId(), notAvailable));
                }
                biometricAuthenticationDataManager.fire(BiometricAuthenticationDataManager.ACTION_AUTHENTICATION_POSSIBLE, notAvailable);
                EitherKt.left(Unit.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BiometricAuthenticationDataManager biometricAuthenticationDataManager, Activity activity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f93970r0 = biometricAuthenticationDataManager;
        this.f93971s0 = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        a aVar = new a(this.f93970r0, this.f93971s0, continuation);
        aVar.f93969q0 = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93968p0;
        BiometricAuthenticationDataManager biometricAuthenticationDataManager = this.f93970r0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f93969q0;
            NaturalAuthenticationClientProxy naturalAuthenticationClientProxy = biometricAuthenticationDataManager.f27435p0;
            FidoSession fidoSessionAccess$fidoSession = BiometricAuthenticationDataManager.access$fidoSession(biometricAuthenticationDataManager);
            this.f93969q0 = coroutineScope2;
            this.f93968p0 = 1;
            Object objIsQuickDataEnabled = naturalAuthenticationClientProxy.isQuickDataEnabled(fidoSessionAccess$fidoSession, this);
            if (objIsQuickDataEnabled == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = objIsQuickDataEnabled;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f93969q0;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Function1 function1 = biometricAuthenticationDataManager.f27443y0;
            if (function1 != null) {
                function1.invoke(new PerformedAction(BiometricAuthenticationDataManager.ACTION_AUTHENTICATION_POSSIBLE.getId(), BiometryAuthState.Available.INSTANCE));
            }
            biometricAuthenticationDataManager.fire(BiometricAuthenticationDataManager.ACTION_AUTHENTICATION_POSSIBLE, BiometryAuthState.Available.INSTANCE);
        } else {
            biometricAuthenticationDataManager.f27435p0.checkAuthIsPossible(this.f93971s0, BiometricAuthenticationDataManager.access$fidoSession(biometricAuthenticationDataManager), new C0501a(biometricAuthenticationDataManager, coroutineScope));
        }
        return Unit.INSTANCE;
    }
}
