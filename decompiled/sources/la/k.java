package la;

import com.bbva.glomohybrid.base.cells.channels.CellsDeepLinkChannels;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity$configureObservers$2", f = "WelcomeDistributionActivity.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83164p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ WelcomeDistributionActivity f83165q0;

    /* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WelcomeDistributionActivity f83166p0;

        public a(WelcomeDistributionActivity welcomeDistributionActivity) {
            this.f83166p0 = welcomeDistributionActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            this.f83166p0.j().sendIsPageReadyStatus(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WelcomeDistributionActivity welcomeDistributionActivity, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f83165q0 = welcomeDistributionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new k(this.f83165q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83164p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<Boolean> webReadyToExecuteDeeplinkFlow = CellsDeepLinkChannels.INSTANCE.getWebReadyToExecuteDeeplinkFlow();
            a aVar = new a(this.f83165q0);
            this.f83164p0 = 1;
            if (webReadyToExecuteDeeplinkFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
