package o9;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.logs.LoggerKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleChangeUserModalEvent$1", f = "LandingViewModel.kt", i = {}, l = {442, 443}, m = "invokeSuspend", n = {}, s = {})
public final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85363p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f85364q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85365r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(LandingViewModel landingViewModel, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f85365r0 = landingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        r rVar = new r(this.f85365r0, continuation);
        rVar.f85364q0 = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85363p0;
        LandingViewModel landingViewModel = this.f85365r0;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        String simpleName = ((CoroutineScope) this.f85364q0).getClass().getSimpleName();
        RememberedUser rememberedUser = landingViewModel.c().getRememberedUser();
        LoggerKt.logDebug$default(androidx.camera.camera2.internal.compat.u.g("TAG[", simpleName, "] handleChangeUserModalEvent[", rememberedUser != null ? rememberedUser.getDocument() : null, Constant.BRACKET_CLOSE), null, 2, null);
        ChangeUserBehavior changeUserBehaviorAccess$getChangeUserModalBehavior = LandingViewModel.access$getChangeUserModalBehavior(landingViewModel);
        UserProfileConfiguration userProfileConfigurationC = landingViewModel.c();
        this.f85363p0 = 1;
        obj = changeUserBehaviorAccess$getChangeUserModalBehavior.compute(userProfileConfigurationC, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        Channel channel = landingViewModel.U0;
        LandingContract.Event.Modal modal = new LandingContract.Event.Modal((ModalType) obj);
        this.f85363p0 = 2;
        if (channel.send(modal, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
