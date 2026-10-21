package v4;

import android.app.Activity;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager$completeInitialization$1", f = "BiometricAuthenticationDataManager.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBiometricAuthenticationDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricAuthenticationDataManager.kt\ncom/bbva/component/dm/biometriclogin/BiometricAuthenticationDataManager$completeInitialization$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n1#2:410\n*E\n"})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93974p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BiometricAuthenticationDataManager f93975q0;

    /* JADX INFO: compiled from: BiometricAuthenticationDataManager.kt */
    @DebugMetadata(c = "com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager$completeInitialization$1$1", f = "BiometricAuthenticationDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BiometricAuthenticationDataManager f93976p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BiometricAuthenticationDataManager biometricAuthenticationDataManager, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f93976p0 = biometricAuthenticationDataManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f93976p0, continuation);
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
            this.f93976p0.f27435p0.finishInitialization();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BiometricAuthenticationDataManager biometricAuthenticationDataManager, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f93975q0 = biometricAuthenticationDataManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f93975q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93974p0;
        BiometricAuthenticationDataManager biometricAuthenticationDataManager = this.f93975q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher coroutineDispatcherIo = biometricAuthenticationDataManager.f27440u0.io();
            a aVar = new a(biometricAuthenticationDataManager, null);
            this.f93974p0 = 1;
            if (BuildersKt.withContext(coroutineDispatcherIo, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Activity activity = biometricAuthenticationDataManager.f27442x0;
        if (activity != null) {
            biometricAuthenticationDataManager.checkIsAuthenticationAvailable(activity, true);
        }
        return Unit.INSTANCE;
    }
}
