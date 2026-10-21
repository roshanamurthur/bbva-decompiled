package xa;

import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.notifications.activity.NotificationNoCommercialContract;
import com.bbva.notifications.viewmodel.NotificationDetailViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationDetailViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.notifications.viewmodel.NotificationDetailViewModel$handleNavigationState$1", f = "NotificationDetailViewModel.kt", i = {}, l = {334}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f94506p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ NotificationDetailViewModel f94507q0;

    /* JADX INFO: compiled from: NotificationDetailViewModel.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NotificationDetailViewModel f94508p0;

        public a(NotificationDetailViewModel notificationDetailViewModel) {
            this.f94508p0 = notificationDetailViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            WebNavigationState webNavigationState = (WebNavigationState) obj;
            boolean z10 = webNavigationState instanceof WebNavigationState.Loaded;
            NotificationDetailViewModel notificationDetailViewModel = this.f94508p0;
            if (z10) {
                notificationDetailViewModel.G0.setValue(new Event(new Route("cellsweb", Animation.None.INSTANCE, null, 4, null)));
            } else if (Intrinsics.areEqual(webNavigationState, WebNavigationState.Loading.INSTANCE)) {
                notificationDetailViewModel.J0.setValue(NotificationNoCommercialContract.State.Loading.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NotificationDetailViewModel notificationDetailViewModel, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f94507q0 = notificationDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f94507q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f94506p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            NotificationDetailViewModel notificationDetailViewModel = this.f94507q0;
            Flow flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(NotificationDetailViewModel.access$getWebNavigationDispatcher(notificationDetailViewModel), RouteConstants.CELLS_DEEPLINK_MANAGER, false, null, 6, null);
            a aVar = new a(notificationDetailViewModel);
            this.f94506p0 = 1;
            if (flowNavigate$default.collect(aVar, this) == coroutine_suspended) {
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
