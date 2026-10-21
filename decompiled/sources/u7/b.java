package u7;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.base.activity.BaseActivity$collectUpdateState$1", f = "BaseActivity.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93736p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f93737q0;

    /* JADX INFO: compiled from: BaseActivity.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.activity.BaseActivity$collectUpdateState$1$1", f = "BaseActivity.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f93738p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BaseActivity f93739q0;

        /* JADX INFO: renamed from: u7.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BaseActivity.kt */
        public static final class C0498a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ BaseActivity f93740p0;

            /* JADX INFO: renamed from: u7.b$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BaseActivity.kt */
            @DebugMetadata(c = "com.bbva.glomohybrid.base.activity.BaseActivity$collectUpdateState$1$1$1", f = "BaseActivity.kt", i = {0, 0}, l = {49}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
            public static final class C0499a extends ContinuationImpl {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public C0498a f93741p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public InAppUpdatesHandler.InstallState f93742q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public /* synthetic */ Object f93743r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ C0498a<T> f93744s0;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public int f93745t0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0499a(C0498a<? super T> c0498a, Continuation<? super C0499a> continuation) {
                    super(continuation);
                    this.f93744s0 = c0498a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f93743r0 = obj;
                    this.f93745t0 |= Integer.MIN_VALUE;
                    return this.f93744s0.emit(null, this);
                }
            }

            public C0498a(BaseActivity baseActivity) {
                this.f93740p0 = baseActivity;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull InAppUpdatesHandler.InstallState installState, @NotNull Continuation<? super Unit> continuation) {
                C0499a c0499a;
                C0498a<T> c0498a;
                if (continuation instanceof C0499a) {
                    c0499a = (C0499a) continuation;
                    int i10 = c0499a.f93745t0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0499a.f93745t0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c0499a = new C0499a(this, continuation);
                    }
                } else {
                    c0499a = new C0499a(this, continuation);
                }
                Object obj = c0499a.f93743r0;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i11 = c0499a.f93745t0;
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    c0499a.f93741p0 = this;
                    c0499a.f93742q0 = installState;
                    c0499a.f93745t0 = 1;
                    if (DelayKt.delay(1200L, c0499a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c0498a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    installState = c0499a.f93742q0;
                    c0498a = c0499a.f93741p0;
                    ResultKt.throwOnFailure(obj);
                }
                BaseActivity.access$handleUpdateState(c0498a.f93740p0, installState);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BaseActivity baseActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f93739q0 = baseActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f93739q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            StateFlow<InAppUpdatesHandler.InstallState> state;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f93738p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                BaseActivity baseActivity = this.f93739q0;
                InAppUpdatesHandler inAppUpdatesHandler = baseActivity.getInAppUpdatesHandler();
                if (inAppUpdatesHandler == null || (state = inAppUpdatesHandler.getState()) == null) {
                    return Unit.INSTANCE;
                }
                C0498a c0498a = new C0498a(baseActivity);
                this.f93738p0 = 1;
                if (state.collect(c0498a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BaseActivity baseActivity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f93737q0 = baseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f93737q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93736p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Lifecycle.State state = Lifecycle.State.RESUMED;
            BaseActivity baseActivity = this.f93737q0;
            a aVar = new a(baseActivity, null);
            this.f93736p0 = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(baseActivity, state, aVar, this) == coroutine_suspended) {
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
