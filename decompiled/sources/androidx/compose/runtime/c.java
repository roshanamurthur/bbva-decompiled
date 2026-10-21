package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import m0.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements MonotonicFrameClock {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final c f14821p0 = new c();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: ActualAndroid.android.kt */
    @DebugMetadata(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f14822p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, R> f14823q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Long, ? extends R> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14823q0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f14823q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            return ((a) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f14822p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f14822p0 = 1;
                if (DelayKt.delay(16L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return this.f14823q0.invoke(Boxing.boxLong(System.nanoTime()));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r3, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r3, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public final /* synthetic */ CoroutineContext.Key getKey() {
        return o.a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public final <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new a(function1, null), continuation);
    }
}
