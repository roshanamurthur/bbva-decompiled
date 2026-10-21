package com.bbva.glomohybrid.profiling.domain.usecase;

import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import com.bbva.glomohybrid.profiling.domain.model.ProfilingStorePolicy;
import com.bbva.glomohybrid.profiling.repository.ProfilingRepository;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SyncProfilingUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/profiling/domain/usecase/SyncProfilingUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomohybrid/profiling/domain/model/ProfilingStorePolicy;", "Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", "params", "execute", "(Lcom/bbva/glomohybrid/profiling/domain/model/ProfilingStorePolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/profiling/repository/ProfilingRepository;", "profilingRepository", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomohybrid/profiling/repository/ProfilingRepository;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
public final class SyncProfilingUseCase implements SuspendUseCaseWithParams<ProfilingStorePolicy, Profiling> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ProfilingRepository f33825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f33826b;

    /* JADX INFO: compiled from: SyncProfilingUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.profiling.domain.usecase.SyncProfilingUseCase$execute$2", f = "SyncProfilingUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSyncProfilingUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncProfilingUseCase.kt\ncom/bbva/glomohybrid/profiling/domain/usecase/SyncProfilingUseCase$execute$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Profiling>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ProfilingStorePolicy f33828q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProfilingStorePolicy profilingStorePolicy, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f33828q0 = profilingStorePolicy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SyncProfilingUseCase.this.new a(this.f33828q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Profiling> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ProfilingRepository profilingRepository = SyncProfilingUseCase.this.f33825a;
            ProfilingStorePolicy profilingStorePolicy = this.f33828q0;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(profilingRepository.getProfiling(profilingStorePolicy));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                return null;
            }
            return objM5535constructorimpl;
        }
    }

    public SyncProfilingUseCase(@NotNull ProfilingRepository profilingRepository, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(profilingRepository, "profilingRepository");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f33825a = profilingRepository;
        this.f33826b = dispatchers;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull ProfilingStorePolicy profilingStorePolicy, @NotNull Continuation<? super Profiling> continuation) {
        return BuildersKt.withContext(this.f33826b.io(), new a(profilingStorePolicy, null), continuation);
    }

    public /* synthetic */ SyncProfilingUseCase(ProfilingRepository profilingRepository, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(profilingRepository, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
