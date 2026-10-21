package androidx.lifecycle;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Lifecycle.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J6\u0010\u0007\u001a\u00020\b2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000fJ6\u0010\u0010\u001a\u00020\b2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000fJ6\u0010\u0011\u001a\u00020\b2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000fR\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", "launchWhenCreated", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchWhenResumed", "launchWhenStarted", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LifecycleCoroutineScope implements CoroutineScope {

    /* JADX INFO: compiled from: Lifecycle.jvm.kt */
    @DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.jvm.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21885p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f21887r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21887r0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new a(this.f21887r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21885p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.f21887r0;
                this.f21885p0 = 1;
                if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, function2, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Lifecycle.jvm.kt */
    @DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.jvm.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21888p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f21890r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21890r0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new b(this.f21890r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21888p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.f21890r0;
                this.f21888p0 = 1;
                if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, function2, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Lifecycle.jvm.kt */
    @DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21891p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f21893r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f21893r0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new c(this.f21893r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21891p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.f21893r0;
                this.f21891p0 = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, function2, this) == coroutine_suspended) {
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

    @NotNull
    public abstract Lifecycle getLifecycle$lifecycle_common();

    @Deprecated(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    @NotNull
    public final Job launchWhenCreated(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(block, null), 3, null);
    }

    @Deprecated(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    @NotNull
    public final Job launchWhenResumed(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(block, null), 3, null);
    }

    @Deprecated(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    @NotNull
    public final Job launchWhenStarted(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(block, null), 3, null);
    }
}
