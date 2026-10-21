package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultTransformableState implements TransformableState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function3<Float, Offset, Float, Unit> f3570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DefaultTransformableState$transformScope$1 f3571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f3572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f3573d;

    /* JADX INFO: compiled from: TransformableState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3574p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f3576r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<TransformScope, Continuation<? super Unit>, Object> f3577s0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TransformableState.kt */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0016a extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f3578p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f3579q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ DefaultTransformableState f3580r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Function2<TransformScope, Continuation<? super Unit>, Object> f3581s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0016a(DefaultTransformableState defaultTransformableState, Function2<? super TransformScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0016a> continuation) {
                super(2, continuation);
                this.f3580r0 = defaultTransformableState;
                this.f3581s0 = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0016a c0016a = new C0016a(this.f3580r0, this.f3581s0, continuation);
                c0016a.f3579q0 = obj;
                return c0016a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
                return ((C0016a) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f3578p0;
                DefaultTransformableState defaultTransformableState = this.f3580r0;
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        TransformScope transformScope = (TransformScope) this.f3579q0;
                        defaultTransformableState.f3573d.setValue(Boxing.boxBoolean(true));
                        Function2<TransformScope, Continuation<? super Unit>, Object> function2 = this.f3581s0;
                        this.f3578p0 = 1;
                        if (function2.invoke(transformScope, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    defaultTransformableState.f3573d.setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    defaultTransformableState.f3573d.setValue(Boxing.boxBoolean(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Function2<? super TransformScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3576r0 = mutatePriority;
            this.f3577s0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DefaultTransformableState.this.new a(this.f3576r0, this.f3577s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3574p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DefaultTransformableState defaultTransformableState = DefaultTransformableState.this;
                MutatorMutex mutatorMutex = defaultTransformableState.f3572c;
                C0016a c0016a = new C0016a(defaultTransformableState, this.f3577s0, null);
                this.f3574p0 = 1;
                if (mutatorMutex.mutateWith(defaultTransformableState.f3571b, this.f3576r0, c0016a, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1] */
    public DefaultTransformableState(@NotNull Function3<? super Float, ? super Offset, ? super Float, Unit> onTransformation) {
        Intrinsics.checkNotNullParameter(onTransformation, "onTransformation");
        this.f3570a = onTransformation;
        this.f3571b = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
            @Override // androidx.compose.foundation.gestures.TransformScope
            /* JADX INFO: renamed from: transformBy-d-4ec7I, reason: not valid java name */
            public void mo177transformByd4ec7I(float zoomChange, long panChange, float rotationChange) {
                this.f3582a.f3570a.invoke(Float.valueOf(zoomChange), Offset.m2264boximpl(panChange), Float.valueOf(rotationChange));
            }
        };
        this.f3572c = new MutatorMutex();
        this.f3573d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public final boolean isTransformInProgress() {
        return this.f3573d.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    @Nullable
    public final Object transform(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super TransformScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(mutatePriority, function2, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
