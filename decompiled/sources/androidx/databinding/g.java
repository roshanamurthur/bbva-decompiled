package androidx.databinding;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
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

/* JADX INFO: compiled from: ViewDataBindingKtx.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f20618p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20619q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f20620r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ViewDataBindingKtx.StateFlowListener f20621s0;

    /* JADX INFO: compiled from: ViewDataBindingKtx.kt */
    @DebugMetadata(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", f = "ViewDataBindingKtx.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f20622p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Flow<Object> f20623q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ViewDataBindingKtx.StateFlowListener f20624r0;

        /* JADX INFO: renamed from: androidx.databinding.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ViewDataBindingKtx.kt */
        public static final class C0077a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ViewDataBindingKtx.StateFlowListener f20625p0;

            public C0077a(ViewDataBindingKtx.StateFlowListener stateFlowListener) {
                this.f20625p0 = stateFlowListener;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
                ViewDataBindingKtx.StateFlowListener stateFlowListener = this.f20625p0;
                ViewDataBinding viewDataBindingA = stateFlowListener.f20564c.a();
                if (viewDataBindingA != null) {
                    viewDataBindingA.handleFieldChange(stateFlowListener.f20564c.f20627b, stateFlowListener.f20564c.f20628c, 0);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow<? extends Object> flow, ViewDataBindingKtx.StateFlowListener stateFlowListener, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f20623q0 = flow;
            this.f20624r0 = stateFlowListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f20623q0, this.f20624r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f20622p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C0077a c0077a = new C0077a(this.f20624r0);
                this.f20622p0 = 1;
                if (this.f20623q0.collect(c0077a, this) == coroutine_suspended) {
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
    public g(LifecycleOwner lifecycleOwner, Flow<? extends Object> flow, ViewDataBindingKtx.StateFlowListener stateFlowListener, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f20619q0 = lifecycleOwner;
        this.f20620r0 = flow;
        this.f20621s0 = stateFlowListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new g(this.f20619q0, this.f20620r0, this.f20621s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f20618p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Lifecycle lifecycle = this.f20619q0.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            a aVar = new a(this.f20620r0, this.f20621s0, null);
            this.f20618p0 = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, aVar, this) == coroutine_suspended) {
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
