package la;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity;
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

/* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity$collectEvents$1", f = "WelcomeDistributionActivity.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
public final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83155p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ WelcomeDistributionActivity f83156q0;

    /* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity$collectEvents$1$1", f = "WelcomeDistributionActivity.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f83157p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WelcomeDistributionActivity f83158q0;

        /* JADX INFO: renamed from: la.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
        public static final class C0462a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ WelcomeDistributionActivity f83159p0;

            public C0462a(WelcomeDistributionActivity welcomeDistributionActivity) {
                this.f83159p0 = welcomeDistributionActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                WelcomeDistributionActivity.access$handleEvents(this.f83159p0, (WelcomeContract.Event) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WelcomeDistributionActivity welcomeDistributionActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f83158q0 = welcomeDistributionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f83158q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f83157p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                WelcomeDistributionActivity welcomeDistributionActivity = this.f83158q0;
                Flow<WelcomeContract.Event> events = welcomeDistributionActivity.j().getEvents();
                C0462a c0462a = new C0462a(welcomeDistributionActivity);
                this.f83157p0 = 1;
                if (events.collect(c0462a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WelcomeDistributionActivity welcomeDistributionActivity, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f83156q0 = welcomeDistributionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new h(this.f83156q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83155p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Lifecycle.State state = Lifecycle.State.STARTED;
            WelcomeDistributionActivity welcomeDistributionActivity = this.f83156q0;
            a aVar = new a(welcomeDistributionActivity, null);
            this.f83155p0 = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(welcomeDistributionActivity, state, aVar, this) == coroutine_suspended) {
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
