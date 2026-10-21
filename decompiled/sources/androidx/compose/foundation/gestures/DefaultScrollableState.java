package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.o;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultScrollableState implements ScrollableState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Float> f3557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DefaultScrollableState$scrollScope$1 f3558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f3559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f3560d;

    /* JADX INFO: compiled from: ScrollableState.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3561p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f3563r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<ScrollScope, Continuation<? super Unit>, Object> f3564s0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScrollableState.kt */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0015a extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f3565p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f3566q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ DefaultScrollableState f3567r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Function2<ScrollScope, Continuation<? super Unit>, Object> f3568s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0015a(DefaultScrollableState defaultScrollableState, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0015a> continuation) {
                super(2, continuation);
                this.f3567r0 = defaultScrollableState;
                this.f3568s0 = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0015a c0015a = new C0015a(this.f3567r0, this.f3568s0, continuation);
                c0015a.f3566q0 = obj;
                return c0015a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
                return ((C0015a) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f3565p0;
                DefaultScrollableState defaultScrollableState = this.f3567r0;
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        ScrollScope scrollScope = (ScrollScope) this.f3566q0;
                        defaultScrollableState.f3560d.setValue(Boxing.boxBoolean(true));
                        Function2<ScrollScope, Continuation<? super Unit>, Object> function2 = this.f3568s0;
                        this.f3565p0 = 1;
                        if (function2.invoke(scrollScope, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    defaultScrollableState.f3560d.setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    defaultScrollableState.f3560d.setValue(Boxing.boxBoolean(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3563r0 = mutatePriority;
            this.f3564s0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DefaultScrollableState.this.new a(this.f3563r0, this.f3564s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3561p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DefaultScrollableState defaultScrollableState = DefaultScrollableState.this;
                MutatorMutex mutatorMutex = defaultScrollableState.f3559c;
                C0015a c0015a = new C0015a(defaultScrollableState, this.f3564s0, null);
                this.f3561p0 = 1;
                if (mutatorMutex.mutateWith(defaultScrollableState.f3558b, this.f3563r0, c0015a, this) == coroutine_suspended) {
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
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1] */
    public DefaultScrollableState(@NotNull Function1<? super Float, Float> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f3557a = onDelta;
        this.f3558b = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
            @Override // androidx.compose.foundation.gestures.ScrollScope
            public float scrollBy(float pixels) {
                if (Float.isNaN(pixels)) {
                    return 0.0f;
                }
                return this.f3569a.f3557a.invoke(Float.valueOf(pixels)).floatValue();
            }
        };
        this.f3559c = new MutatorMutex();
        this.f3560d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float f6) {
        return this.f3557a.invoke(Float.valueOf(f6)).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final /* synthetic */ boolean getCanScrollBackward() {
        return o.a(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final /* synthetic */ boolean getCanScrollForward() {
        return o.b(this);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.f3560d.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public final Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(mutatePriority, function2, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
