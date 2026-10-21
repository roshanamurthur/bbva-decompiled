package o9;

import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import com.bbva.glomohybrid.base.snackbar.SnackbarState;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$handleSnackBarReceived$1", f = "LandingViewModel.kt", i = {}, l = {396}, m = "invokeSuspend", n = {}, s = {})
public final class a0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85301p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85302q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SnackbarSpec f85303r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(LandingViewModel landingViewModel, SnackbarSpec snackbarSpec, Continuation<? super a0> continuation) {
        super(2, continuation);
        this.f85302q0 = landingViewModel;
        this.f85303r0 = snackbarSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a0(this.f85302q0, this.f85303r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85301p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel channel = this.f85302q0.U0;
            LandingContract.Event.SnackBar snackBar = new LandingContract.Event.SnackBar(new SnackbarState.Show(this.f85303r0));
            this.f85301p0 = 1;
            if (channel.send(snackBar, this) == coroutine_suspended) {
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
