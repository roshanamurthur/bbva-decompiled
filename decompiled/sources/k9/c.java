package k9;

import com.bbva.glomohybrid.landing.presentation.LandingActivity;
import com.bbva.glomohybrid.landing.presentation.view.handler.SlideMenuIntentHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.LandingActivity$collectMenuIntents$1", f = "LandingActivity.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f79261p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingActivity f79262q0;

    /* JADX INFO: compiled from: LandingActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LandingActivity f79263p0;

        public a(LandingActivity landingActivity) {
            this.f79263p0 = landingActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            LandingActivity.access$handleMenuIntents(this.f79263p0, (SlideMenuIntentHandler.Intent) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LandingActivity landingActivity, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f79262q0 = landingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f79262q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f79261p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingActivity landingActivity = this.f79262q0;
            Flow flowDebounce = FlowKt.debounce(LandingActivity.access$getMenuIntentHandler(landingActivity).getIntent(), landingActivity.f32935s0);
            a aVar = new a(landingActivity);
            this.f79261p0 = 1;
            if (flowDebounce.collect(aVar, this) == coroutine_suspended) {
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
