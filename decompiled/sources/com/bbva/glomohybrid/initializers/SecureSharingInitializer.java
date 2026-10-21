package com.bbva.glomohybrid.initializers;

import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecureSharingInitializer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/initializers/SecureSharingInitializer;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "invoke", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "secureSharing", "Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", CrashlyticsHandler.ID, "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "Lkotlin/Function0;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "useCaseProvider", "<init>", "(Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;Lkotlin/jvm/functions/Function0;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class SecureSharingInitializer implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SecureSharing f32506p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Crashlytics f32507q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32508r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Function0<SuspendUseCase<Unit>> f32509s0;

    /* JADX INFO: compiled from: SecureSharingInitializer.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.initializers.SecureSharingInitializer$invoke$1$1$1", f = "SecureSharingInitializer.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f32510p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SecureSharingInitializer.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f32510p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SuspendUseCase suspendUseCase = (SuspendUseCase) SecureSharingInitializer.this.f32509s0.invoke();
                this.f32510p0 = 1;
                if (suspendUseCase.execute(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecureSharingInitializer(@NotNull SecureSharing secureSharing, @NotNull Crashlytics crashlytics, @NotNull ThreadDispatchers dispatchers, @NotNull Function0<? extends SuspendUseCase<Unit>> useCaseProvider) {
        Intrinsics.checkNotNullParameter(secureSharing, "secureSharing");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(useCaseProvider, "useCaseProvider");
        this.f32506p0 = secureSharing;
        this.f32507q0 = crashlytics;
        this.f32508r0 = dispatchers;
        this.f32509s0 = useCaseProvider;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(this.f32508r0.io());
    }

    @NotNull
    public final SecureSharing invoke() {
        SecureSharing secureSharing = this.f32506p0;
        Throwable recoveredFromException = secureSharing.getRecoveredFromException();
        if (recoveredFromException != null) {
            this.f32507q0.recordException(recoveredFromException);
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
        }
        return secureSharing;
    }

    public /* synthetic */ SecureSharingInitializer(SecureSharing secureSharing, Crashlytics crashlytics, ThreadDispatchers threadDispatchers, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(secureSharing, crashlytics, (i10 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers, function0);
    }
}
