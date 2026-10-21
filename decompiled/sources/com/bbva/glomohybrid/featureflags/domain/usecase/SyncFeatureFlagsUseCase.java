package com.bbva.glomohybrid.featureflags.domain.usecase;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.model.StorePolicy;
import com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsObserver;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import com.bbva.glomohybrid.profiling.domain.model.ProfilingStorePolicy;
import com.bbva.glomohybrid.profiling.handler.ProfilingFeatureFlagsHandler;
import com.bbva.glomohybrid.profiling.repository.ProfilingRepository;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SyncFeatureFlagsUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B;\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/domain/usecase/SyncFeatureFlagsUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomohybrid/featureflags/domain/model/StorePolicy;", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "params", "execute", "(Lcom/bbva/glomohybrid/featureflags/domain/model/StorePolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "", "Lcom/bbva/glomohybrid/featureflags/domain/observer/FeatureFlagsObserver;", "observers", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "Lcom/bbva/glomohybrid/profiling/handler/ProfilingFeatureFlagsHandler;", "profilingFeatureFlagHandler", "Lcom/bbva/glomohybrid/profiling/repository/ProfilingRepository;", "profilingRepository", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;Ljava/util/List;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;Lcom/bbva/glomohybrid/profiling/handler/ProfilingFeatureFlagsHandler;Lcom/bbva/glomohybrid/profiling/repository/ProfilingRepository;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
public final class SyncFeatureFlagsUseCase implements SuspendUseCaseWithParams<StorePolicy, FeatureFlags> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsRepository f32137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<FeatureFlagsObserver> f32138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ProfilingFeatureFlagsHandler f32140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ProfilingRepository f32141e;

    /* JADX INFO: compiled from: SyncFeatureFlagsUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.featureflags.domain.usecase.SyncFeatureFlagsUseCase$execute$2", f = "SyncFeatureFlagsUseCase.kt", i = {0, 1}, l = {31, 39}, m = "invokeSuspend", n = {"featureFlag", "featureFlag"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nSyncFeatureFlagsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncFeatureFlagsUseCase.kt\ncom/bbva/glomohybrid/featureflags/domain/usecase/SyncFeatureFlagsUseCase$execute$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1855#2,2:51\n*S KotlinDebug\n*F\n+ 1 SyncFeatureFlagsUseCase.kt\ncom/bbva/glomohybrid/featureflags/domain/usecase/SyncFeatureFlagsUseCase$execute$2\n*L\n39#1:51,2\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FeatureFlags>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.ObjectRef f32142p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator f32143q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f32144r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ StorePolicy f32146t0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.featureflags.domain.usecase.SyncFeatureFlagsUseCase$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SyncFeatureFlagsUseCase.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.featureflags.domain.usecase.SyncFeatureFlagsUseCase$execute$2$1$1$1", f = "SyncFeatureFlagsUseCase.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0134a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Ref.ObjectRef f32147p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f32148q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<FeatureFlags> f32149r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ SyncFeatureFlagsUseCase f32150s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ FeatureFlags f32151t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ Profiling f32152u0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0134a(Ref.ObjectRef<FeatureFlags> objectRef, SyncFeatureFlagsUseCase syncFeatureFlagsUseCase, FeatureFlags featureFlags, Profiling profiling, Continuation<? super C0134a> continuation) {
                super(2, continuation);
                this.f32149r0 = objectRef;
                this.f32150s0 = syncFeatureFlagsUseCase;
                this.f32151t0 = featureFlags;
                this.f32152u0 = profiling;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0134a(this.f32149r0, this.f32150s0, this.f32151t0, this.f32152u0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0134a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Ref.ObjectRef<FeatureFlags> objectRef;
                T t10;
                Ref.ObjectRef<FeatureFlags> objectRef2;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f32148q0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ProfilingFeatureFlagsHandler profilingFeatureFlagsHandler = this.f32150s0.f32140d;
                    objectRef = this.f32149r0;
                    if (profilingFeatureFlagsHandler != null) {
                        this.f32147p0 = objectRef;
                        this.f32148q0 = 1;
                        obj = profilingFeatureFlagsHandler.matchFeatureFlagsCollection(this.f32151t0, this.f32152u0, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2 = objectRef;
                    } else {
                        t10 = 0;
                    }
                    objectRef.element = t10;
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = this.f32147p0;
                ResultKt.throwOnFailure(obj);
                objectRef = objectRef2;
                t10 = (FeatureFlags) obj;
                objectRef.element = t10;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StorePolicy storePolicy, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32146t0 = storePolicy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SyncFeatureFlagsUseCase.this.new a(this.f32146t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FeatureFlags> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008f  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:27:0x0089->B:38:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.ObjectRef objectRef;
            Object objM5535constructorimpl;
            SyncFeatureFlagsUseCase syncFeatureFlagsUseCase;
            Profiling profilingAccess$getProfiling;
            Ref.ObjectRef objectRef2;
            Iterator it;
            FeatureFlagsObserver featureFlagsObserver;
            FeatureFlags featureFlags;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f32144r0;
            SyncFeatureFlagsUseCase syncFeatureFlagsUseCase2 = SyncFeatureFlagsUseCase.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    objectRef = this.f32142p0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f32143q0;
                    objectRef2 = this.f32142p0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    featureFlagsObserver = (FeatureFlagsObserver) it.next();
                    featureFlags = (FeatureFlags) objectRef2.element;
                    this.f32142p0 = objectRef2;
                    this.f32143q0 = it;
                    this.f32144r0 = 2;
                    if (featureFlagsObserver.onReceive(featureFlags, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return objectRef2.element;
            }
            ResultKt.throwOnFailure(obj);
            objectRef = new Ref.ObjectRef();
            FeatureFlagsRepository featureFlagsRepository = syncFeatureFlagsUseCase2.f32137a;
            StorePolicy storePolicy = this.f32146t0;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(featureFlagsRepository.get(storePolicy));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            boolean zM5540isFailureimpl = Result.m5540isFailureimpl(objM5535constructorimpl);
            T t10 = objM5535constructorimpl;
            if (zM5540isFailureimpl) {
                t10 = 0;
            }
            objectRef.element = t10;
            FeatureFlags featureFlags2 = (FeatureFlags) t10;
            if (featureFlags2 != null && (profilingAccess$getProfiling = SyncFeatureFlagsUseCase.access$getProfiling((syncFeatureFlagsUseCase = SyncFeatureFlagsUseCase.this))) != null) {
                CoroutineDispatcher coroutineDispatcherMo4923default = syncFeatureFlagsUseCase.f32139c.mo4923default();
                C0134a c0134a = new C0134a(objectRef, syncFeatureFlagsUseCase, featureFlags2, profilingAccess$getProfiling, null);
                this.f32142p0 = objectRef;
                this.f32144r0 = 1;
                if (BuildersKt.withContext(coroutineDispatcherMo4923default, c0134a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Iterator it2 = syncFeatureFlagsUseCase2.f32138b.iterator();
            objectRef2 = objectRef;
            it = it2;
            while (it.hasNext()) {
                featureFlagsObserver = (FeatureFlagsObserver) it.next();
                featureFlags = (FeatureFlags) objectRef2.element;
                this.f32142p0 = objectRef2;
                this.f32143q0 = it;
                this.f32144r0 = 2;
                if (featureFlagsObserver.onReceive(featureFlags, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return objectRef2.element;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SyncFeatureFlagsUseCase(@NotNull FeatureFlagsRepository featureFlagsRepository, @NotNull List<? extends FeatureFlagsObserver> observers, @NotNull ThreadDispatchers dispatchers, @Nullable ProfilingFeatureFlagsHandler profilingFeatureFlagsHandler, @Nullable ProfilingRepository profilingRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        Intrinsics.checkNotNullParameter(observers, "observers");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f32137a = featureFlagsRepository;
        this.f32138b = observers;
        this.f32139c = dispatchers;
        this.f32140d = profilingFeatureFlagsHandler;
        this.f32141e = profilingRepository;
    }

    public static final Profiling access$getProfiling(SyncFeatureFlagsUseCase syncFeatureFlagsUseCase) {
        syncFeatureFlagsUseCase.getClass();
        return (Profiling) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.sequenceOf(ProfilingStorePolicy.REMOTE, ProfilingStorePolicy.LOCAL), new s8.a(syncFeatureFlagsUseCase)));
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull StorePolicy storePolicy, @NotNull Continuation<? super FeatureFlags> continuation) {
        return BuildersKt.withContext(this.f32139c.io(), new a(storePolicy, null), continuation);
    }

    public /* synthetic */ SyncFeatureFlagsUseCase(FeatureFlagsRepository featureFlagsRepository, List list, ThreadDispatchers threadDispatchers, ProfilingFeatureFlagsHandler profilingFeatureFlagsHandler, ProfilingRepository profilingRepository, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagsRepository, list, (i10 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers, profilingFeatureFlagsHandler, profilingRepository);
    }
}
