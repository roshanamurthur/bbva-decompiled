package com.bbva.component.dm.biometriclogin;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager$authenticate$1$1", f = "BiometricAuthenticationDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBiometricAuthenticationDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$authenticate$1$1\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n*L\n1#1,409:1\n25#2,3:410\n32#2,3:413\n*S KotlinDebug\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$authenticate$1$1\n*L\n284#1:410,3\n293#1:413,3\n*E\n"})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f27455p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Either<FidoException, Unit> f27456q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ BiometricAuthenticationDataManager f27457r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Either<? extends FidoException, Unit> either, BiometricAuthenticationDataManager biometricAuthenticationDataManager, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f27456q0 = either;
        this.f27457r0 = biometricAuthenticationDataManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        a aVar = new a(this.f27456q0, this.f27457r0, continuation);
        aVar.f27455p0 = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f27455p0;
        Either<FidoException, Unit> eitherRight = this.f27456q0;
        boolean z10 = eitherRight instanceof Either.Right;
        BiometricAuthenticationDataManager biometricAuthenticationDataManager = this.f27457r0;
        if (z10) {
            LoggerKt.logDebug$default(h0.b("TAG[", coroutineScope.getClass().getSimpleName(), "] authenticate"), null, 2, null);
            ActionSpec<BiometryAuthResult> actionSpec = BiometricAuthenticationDataManager.ACTION_BIOMETRICS_AUTHENTICATE;
            String str = biometricAuthenticationDataManager.f27441w0;
            if (str == null) {
                str = "";
            }
            biometricAuthenticationDataManager.fire(actionSpec, new BiometryAuthResult.Success(str));
            biometricAuthenticationDataManager.E0 = false;
            eitherRight = EitherKt.right(Unit.INSTANCE);
        } else if (!(eitherRight instanceof Either.Left)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(eitherRight instanceof Either.Right)) {
            if (!(eitherRight instanceof Either.Left)) {
                throw new NoWhenBranchMatchedException();
            }
            FidoException fidoException = (FidoException) ((Either.Left) eitherRight).getError();
            LoggerKt.logError$default(u.g("TAG[", coroutineScope.getClass().getSimpleName(), "] checkIsAuthenticationAvailable[", fidoException.getMessage(), Constant.BRACKET_CLOSE), fidoException, null, 4, null);
            biometricAuthenticationDataManager.fire(BiometricAuthenticationDataManager.ACTION_BIOMETRICS_AUTHENTICATE, new BiometryAuthResult.AuthError(fidoException));
            biometricAuthenticationDataManager.E0 = false;
            EitherKt.left(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
