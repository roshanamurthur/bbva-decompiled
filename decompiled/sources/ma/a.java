package ma;

import com.bbva.glomohybrid.welcome.presentation.WelcomeAccessesHandler;
import com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel;
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

/* JADX INFO: compiled from: WelcomeGlobalViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel$configureCollectors$1", f = "WelcomeGlobalViewModel.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ WelcomeGlobalViewModel f83378q0;

    /* JADX INFO: renamed from: ma.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WelcomeGlobalViewModel.kt */
    public static final class C0465a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WelcomeGlobalViewModel f83379p0;

        public C0465a(WelcomeGlobalViewModel welcomeGlobalViewModel) {
            this.f83379p0 = welcomeGlobalViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Object objAccess$handleWebAccessState = WelcomeGlobalViewModel.access$handleWebAccessState(this.f83379p0, (WelcomeAccessesHandler.WebPageState) obj, continuation);
            return objAccess$handleWebAccessState == ek.a.getCOROUTINE_SUSPENDED() ? objAccess$handleWebAccessState : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WelcomeGlobalViewModel welcomeGlobalViewModel, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f83378q0 = welcomeGlobalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f83378q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83377p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            WelcomeGlobalViewModel welcomeGlobalViewModel = this.f83378q0;
            Flow<WelcomeAccessesHandler.WebPageState> webPageState = welcomeGlobalViewModel.f34820r0.getWebPageState();
            C0465a c0465a = new C0465a(welcomeGlobalViewModel);
            this.f83377p0 = 1;
            if (webPageState.collect(c0465a, this) == coroutine_suspended) {
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
