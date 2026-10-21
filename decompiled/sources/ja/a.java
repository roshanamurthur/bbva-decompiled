package ja;

import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import com.bbva.glomohybrid.welcome.presentation.WelcomeAccessesHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeAccessesHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.WelcomeAccessesHandler$handleOpenWeb$1", f = "WelcomeAccessesHandler.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f78830p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ WelcomeContract.Event.Navigation f78831q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ WelcomeAccessesHandler f78832r0;

    /* JADX INFO: renamed from: ja.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WelcomeAccessesHandler.kt */
    public static final class C0431a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WelcomeAccessesHandler f78833p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WelcomeContract.Event.Navigation f78834q0;

        public C0431a(WelcomeAccessesHandler welcomeAccessesHandler, WelcomeContract.Event.Navigation navigation) {
            this.f78833p0 = welcomeAccessesHandler;
            this.f78834q0 = navigation;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Object objAccess$handleNavigationState = WelcomeAccessesHandler.access$handleNavigationState(this.f78833p0, (WebNavigationState) obj, this.f78834q0, continuation);
            return objAccess$handleNavigationState == ek.a.getCOROUTINE_SUSPENDED() ? objAccess$handleNavigationState : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WelcomeContract.Event.Navigation navigation, WelcomeAccessesHandler welcomeAccessesHandler, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f78831q0 = navigation;
        this.f78832r0 = welcomeAccessesHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f78831q0, this.f78832r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String route;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f78830p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            WelcomeContract.Event.Navigation navigation = this.f78831q0;
            Route route2 = navigation.getRoute();
            if (route2 != null && (route = route2.getRoute()) != null) {
                if (route.length() == 0 || l.isBlank(route)) {
                    return Unit.INSTANCE;
                }
                WelcomeAccessesHandler welcomeAccessesHandler = this.f78832r0;
                Flow flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(WelcomeAccessesHandler.access$getWebNavigationHandler(welcomeAccessesHandler), route, false, null, 6, null);
                C0431a c0431a = new C0431a(welcomeAccessesHandler, navigation);
                this.f78830p0 = 1;
                if (flowNavigate$default.collect(c0431a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
