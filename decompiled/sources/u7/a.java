package u7;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal;
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

/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.base.activity.BaseActivity$collectUpdateModalIntents$1", f = "BaseActivity.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93731p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f93732q0;

    /* JADX INFO: renamed from: u7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseActivity.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.activity.BaseActivity$collectUpdateModalIntents$1$1", f = "BaseActivity.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0496a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f93733p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BaseActivity f93734q0;

        /* JADX INFO: renamed from: u7.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BaseActivity.kt */
        public static final class C0497a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ BaseActivity f93735p0;

            public C0497a(BaseActivity baseActivity) {
                this.f93735p0 = baseActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                BaseActivity.access$handleUpdateModalIntent(this.f93735p0, (InAppUpdateModal.Intent) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0496a(BaseActivity baseActivity, Continuation<? super C0496a> continuation) {
            super(2, continuation);
            this.f93734q0 = baseActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0496a(this.f93734q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0496a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f93733p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                BaseActivity baseActivity = this.f93734q0;
                Flow<InAppUpdateModal.Intent> intents = BaseActivity.access$getInAppUpdateModal(baseActivity).getIntents();
                C0497a c0497a = new C0497a(baseActivity);
                this.f93733p0 = 1;
                if (intents.collect(c0497a, this) == coroutine_suspended) {
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
    public a(BaseActivity baseActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f93732q0 = baseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f93732q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93731p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Lifecycle.State state = Lifecycle.State.STARTED;
            BaseActivity baseActivity = this.f93732q0;
            C0496a c0496a = new C0496a(baseActivity, null);
            this.f93731p0 = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(baseActivity, state, c0496a, this) == coroutine_suspended) {
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
