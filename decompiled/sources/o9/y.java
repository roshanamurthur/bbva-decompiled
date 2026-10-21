package o9;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
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
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleShortcutItemTap$1", f = "LandingViewModel.kt", i = {}, l = {500}, m = "invokeSuspend", n = {}, s = {})
public final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85380p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85381q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingShortcutItemModel f85382r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LandingViewModel landingViewModel, LandingShortcutItemModel landingShortcutItemModel, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f85381q0 = landingViewModel;
        this.f85382r0 = landingShortcutItemModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new y(this.f85381q0, this.f85382r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85380p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingViewModel landingViewModel = this.f85381q0;
            LandingAccessesHandler landingAccessesHandler = landingViewModel.f33128r0;
            UserProfileConfiguration userProfileConfigurationC = landingViewModel.c();
            this.f85380p0 = 1;
            if (landingAccessesHandler.onTap(this.f85382r0, userProfileConfigurationC, this) == coroutine_suspended) {
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
