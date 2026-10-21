package o9;

import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.model.LandingInAppUpdate;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleAppUpdate$1", f = "LandingViewModel.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
public final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85358p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingContract.Intent.UpdateApp f85359q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85360r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(LandingContract.Intent.UpdateApp updateApp, LandingViewModel landingViewModel, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f85359q0 = updateApp;
        this.f85360r0 = landingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new p(this.f85359q0, this.f85360r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85358p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingInAppUpdate landingInAppUpdate = new LandingInAppUpdate(this.f85359q0.getPackageId(), null, 2, null);
            LandingViewModel landingViewModel = this.f85360r0;
            LandingAppAccess landingAppAccess = landingViewModel.L0;
            LandingAppAccess.NotAvailableForUpdate notAvailableForUpdate = landingAppAccess instanceof LandingAppAccess.NotAvailableForUpdate ? (LandingAppAccess.NotAvailableForUpdate) landingAppAccess : null;
            boolean zIsImmediateUpdateAvailable = notAvailableForUpdate != null ? notAvailableForUpdate.isImmediateUpdateAvailable() : true;
            LandingAccessesHandler landingAccessesHandler = landingViewModel.f33128r0;
            this.f85358p0 = 1;
            if (landingAccessesHandler.openAppUpdates(landingInAppUpdate, zIsImmediateUpdateAvailable, this) == coroutine_suspended) {
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
