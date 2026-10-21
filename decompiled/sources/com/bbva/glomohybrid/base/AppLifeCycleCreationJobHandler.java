package com.bbva.glomohybrid.base;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppLifeCycleCreationJobHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0007\u001a\u00020\u00052\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\n\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/base/AppLifeCycleCreationJobHandler;", "", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "launchJob", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "invokeOnCompletion", "Lkotlinx/coroutines/Job;", "a", "Lkotlinx/coroutines/Job;", "getJob$Base_release", "()Lkotlinx/coroutines/Job;", "setJob$Base_release", "(Lkotlinx/coroutines/Job;)V", "job", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class AppLifeCycleCreationJobHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Job job;

    /* JADX INFO: compiled from: AppLifeCycleCreationJobHandler.kt */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f31017p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(1);
            this.f31017p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f31017p0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppLifeCycleCreationJobHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler$launchJob$1$1", f = "AppLifeCycleCreationJobHandler.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31018p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f31019q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f31020r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f31020r0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f31020r0, continuation);
            bVar.f31019q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31018p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f31019q0;
                this.f31018p0 = 1;
                if (this.f31020r0.invoke(coroutineScope, this) == coroutine_suspended) {
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

    @Nullable
    /* JADX INFO: renamed from: getJob$Base_release, reason: from getter */
    public final Job getJob() {
        return this.job;
    }

    public final void invokeOnCompletion(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Job job = this.job;
        if (job == null || job.invokeOnCompletion(new a(block)) == null) {
            block.invoke();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void launchJob(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.job = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new b(block, null), 3, null);
    }

    public final void setJob$Base_release(@Nullable Job job) {
        this.job = job;
    }
}
