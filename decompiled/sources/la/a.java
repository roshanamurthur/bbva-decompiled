package la;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity;
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

/* JADX INFO: compiled from: WelcomeActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity$collectEvents$1", f = "WelcomeActivity.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83143p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ WelcomeActivity f83144q0;

    /* JADX INFO: renamed from: la.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WelcomeActivity.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity$collectEvents$1$1", f = "WelcomeActivity.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0460a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f83145p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WelcomeActivity f83146q0;

        /* JADX INFO: renamed from: la.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WelcomeActivity.kt */
        public static final class C0461a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ WelcomeActivity f83147p0;

            public C0461a(WelcomeActivity welcomeActivity) {
                this.f83147p0 = welcomeActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                WelcomeActivity.access$handleEvents(this.f83147p0, (WelcomeContract.Event) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0460a(WelcomeActivity welcomeActivity, Continuation<? super C0460a> continuation) {
            super(2, continuation);
            this.f83146q0 = welcomeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0460a(this.f83146q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0460a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f83145p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                WelcomeActivity welcomeActivity = this.f83146q0;
                Flow<WelcomeContract.Event> events = WelcomeActivity.access$getViewModel(welcomeActivity).getEvents();
                C0461a c0461a = new C0461a(welcomeActivity);
                this.f83145p0 = 1;
                if (events.collect(c0461a, this) == coroutine_suspended) {
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
    public a(WelcomeActivity welcomeActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f83144q0 = welcomeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f83144q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83143p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Lifecycle.State state = Lifecycle.State.STARTED;
            WelcomeActivity welcomeActivity = this.f83144q0;
            C0460a c0460a = new C0460a(welcomeActivity, null);
            this.f83143p0 = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(welcomeActivity, state, c0460a, this) == coroutine_suspended) {
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
