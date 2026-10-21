package com.bbva.discreetmode;

import androidx.lifecycle.LifecycleOwner;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiscreetModeController.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0004R\"\u0010\u0016\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/bbva/discreetmode/BaseDiscreetModeController;", "Lcom/bbva/discreetmode/DiscreetModeController;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/bbva/discreetmode/DiscreetMode$State;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "state", "", "delayed", "notifyState", "q0", "Lcom/bbva/discreetmode/DiscreetMode$State;", "getCurrentState", "()Lcom/bbva/discreetmode/DiscreetMode$State;", "setCurrentState", "(Lcom/bbva/discreetmode/DiscreetMode$State;)V", "currentState", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseDiscreetModeController implements DiscreetModeController, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29027p0 = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public DiscreetMode.State currentState = new DiscreetMode.State.Inactive(null, 1, null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Job f29029r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Function1<? super DiscreetMode.State, Unit> f29030s0;

    /* JADX INFO: compiled from: DiscreetModeController.kt */
    @DebugMetadata(c = "com.bbva.discreetmode.BaseDiscreetModeController$notifyState$1$1", f = "DiscreetModeController.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29031p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f29032q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BaseDiscreetModeController f29033r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ DiscreetMode.State f29034s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<DiscreetMode.State, Unit> f29035t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, BaseDiscreetModeController baseDiscreetModeController, DiscreetMode.State state, Function1<? super DiscreetMode.State, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29032q0 = j10;
            this.f29033r0 = baseDiscreetModeController;
            this.f29034s0 = state;
            this.f29035t0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f29032q0, this.f29033r0, this.f29034s0, this.f29035t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29031p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f29031p0 = 1;
                if (DelayKt.delay(this.f29032q0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BaseDiscreetModeController baseDiscreetModeController = this.f29033r0;
            DiscreetMode.State state = this.f29034s0;
            baseDiscreetModeController.setCurrentState(state);
            this.f29035t0.invoke(state);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void notifyState$default(BaseDiscreetModeController baseDiscreetModeController, DiscreetMode.State state, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyState");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        baseDiscreetModeController.notifyState(state, j10);
    }

    @Override // com.bbva.discreetmode.DiscreetModeController
    public void cancel() {
        JobKt__JobKt.cancelChildren$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f29027p0.getCoroutineContext();
    }

    @Override // com.bbva.discreetmode.DiscreetModeController
    @NotNull
    public DiscreetMode.State getCurrentState() {
        return this.currentState;
    }

    public final void notifyState(@NotNull DiscreetMode.State state, long delayed) {
        Job job;
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<? super DiscreetMode.State, Unit> function1 = this.f29030s0;
        if (function1 == null) {
            return;
        }
        Job job2 = this.f29029r0;
        if (job2 != null && job2.isActive() && (job = this.f29029r0) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f29029r0 = BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(delayed, this, state, function1, null), 3, null);
    }

    @Override // com.bbva.discreetmode.DiscreetModeController
    public void setCurrentState(@NotNull DiscreetMode.State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.currentState = state;
    }

    @Override // com.bbva.discreetmode.DiscreetModeController
    public void start(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super DiscreetMode.State, Unit> listener) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f29030s0 = listener;
    }

    @Override // com.bbva.discreetmode.DiscreetModeController
    public void stop() {
        this.f29030s0 = null;
    }
}
