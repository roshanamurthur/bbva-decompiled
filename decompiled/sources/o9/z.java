package o9;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.domain.model.LandingUserSegment;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler;
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
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleShortcutItemTap$2", f = "LandingViewModel.kt", i = {}, l = {502}, m = "invokeSuspend", n = {}, s = {})
public final class z extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85383p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85384q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingShortcutItemModel f85385r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(LandingViewModel landingViewModel, LandingShortcutItemModel landingShortcutItemModel, Continuation<? super z> continuation) {
        super(2, continuation);
        this.f85384q0 = landingViewModel;
        this.f85385r0 = landingShortcutItemModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new z(this.f85384q0, this.f85385r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85383p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingViewModel landingViewModel = this.f85384q0;
            LandingAnalyticsHandler landingAnalyticsHandler = landingViewModel.f33130t0;
            UserProfileConfiguration userProfileConfigurationC = landingViewModel.c();
            LandingUserSegment segment = landingViewModel.P0.getSegment();
            this.f85383p0 = 1;
            if (landingAnalyticsHandler.trackShortcutLink(this.f85385r0, userProfileConfigurationC, segment, this) == coroutine_suspended) {
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
