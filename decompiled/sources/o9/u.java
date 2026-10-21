package o9;

import com.bbva.glomohybrid.landing.domain.model.LandingUserSegment;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler;
import com.bbva.ui.component.menu.model.MenuItem;
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
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleMenuItemTap$2", f = "LandingViewModel.kt", i = {}, l = {494}, m = "invokeSuspend", n = {}, s = {})
public final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85370p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85371q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingContract.Intent.MenuItemTap f85372r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(LandingViewModel landingViewModel, LandingContract.Intent.MenuItemTap menuItemTap, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f85371q0 = landingViewModel;
        this.f85372r0 = menuItemTap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new u(this.f85371q0, this.f85372r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85370p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingViewModel landingViewModel = this.f85371q0;
            LandingAnalyticsHandler landingAnalyticsHandler = landingViewModel.f33130t0;
            MenuItem item = this.f85372r0.getItem();
            LandingUserSegment segment = landingViewModel.P0.getSegment();
            this.f85370p0 = 1;
            if (landingAnalyticsHandler.trackMenuItemTap(item, segment, this) == coroutine_suspended) {
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
