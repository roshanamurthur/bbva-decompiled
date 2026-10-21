package p9;

import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.model.LandingNavigationPayload;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAccessesHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAccessesHandler$attemptNavigation$1", f = "LandingAccessesHandler.kt", i = {}, l = {532}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92584p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingContract.Event.Navigation f92585q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingAccessesHandler f92586r0;

    /* JADX INFO: renamed from: p9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LandingAccessesHandler.kt */
    public static final class C0478a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LandingAccessesHandler f92587p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingContract.Event.Navigation f92588q0;

        public C0478a(LandingAccessesHandler landingAccessesHandler, LandingContract.Event.Navigation navigation) {
            this.f92587p0 = landingAccessesHandler;
            this.f92588q0 = navigation;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            LandingAccessesHandler.access$handleNavigationState(this.f92587p0, (WebNavigationState) obj, this.f92588q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LandingContract.Event.Navigation navigation, LandingAccessesHandler landingAccessesHandler, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f92585q0 = navigation;
        this.f92586r0 = landingAccessesHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f92585q0, this.f92586r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92584p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LandingContract.Event.Navigation navigation = this.f92585q0;
            String route = navigation.getRoute().getRoute();
            LandingNavigationPayload payload = navigation.getPayload();
            Object data = payload != null ? payload.getData() : null;
            LandingAccessesHandler landingAccessesHandler = this.f92586r0;
            Flow flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(LandingAccessesHandler.access$getWebNavigationHandler(landingAccessesHandler), route, false, data, 2, null);
            C0478a c0478a = new C0478a(landingAccessesHandler, navigation);
            this.f92584p0 = 1;
            if (flowNavigate$default.collect(c0478a, this) == coroutine_suspended) {
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
