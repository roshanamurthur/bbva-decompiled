package c9;

import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.infoscreen.optionlist.OptionListActivity;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
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

/* JADX INFO: compiled from: OptionListActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.optionlist.OptionListActivity$navigateToRoute$1", f = "OptionListActivity.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f25425p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ OptionData f25426q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ OptionListActivity f25427r0;

    /* JADX INFO: compiled from: OptionListActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ OptionListActivity f25428p0;

        public a(OptionListActivity optionListActivity) {
            this.f25428p0 = optionListActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            WebNavigationState webNavigationState = (WebNavigationState) obj;
            if (!(webNavigationState instanceof WebNavigationState.Loading) && (webNavigationState instanceof WebNavigationState.Loaded)) {
                OptionListActivity optionListActivity = this.f25428p0;
                Router.navigate$default(OptionListActivity.access$getRouter(optionListActivity), this.f25428p0, "cellsweb", null, null, null, false, 60, null);
                optionListActivity.finish();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OptionData optionData, OptionListActivity optionListActivity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f25426q0 = optionData;
        this.f25427r0 = optionListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f25426q0, this.f25427r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f25425p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            String route = this.f25426q0.getRoute();
            if (route != null) {
                OptionListActivity optionListActivity = this.f25427r0;
                Flow flowNavigate$default = NavigateDispatcher.DefaultImpls.navigate$default(OptionListActivity.access$getNavigateDispatcher(optionListActivity), route, false, null, 6, null);
                a aVar = new a(optionListActivity);
                this.f25425p0 = 1;
                if (flowNavigate$default.collect(aVar, this) == coroutine_suspended) {
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
