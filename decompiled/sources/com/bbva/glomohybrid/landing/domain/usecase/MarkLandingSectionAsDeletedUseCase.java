package com.bbva.glomohybrid.landing.domain.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.data.repository.LandingSectionsDeletedRepository;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingMessageCardModelExtensionsKt;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: MarkLandingSectionAsDeletedUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/MarkLandingSectionAsDeletedUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "", "params", "execute", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/landing/data/repository/LandingSectionsDeletedRepository;", "b", "Lkotlin/Lazy;", "getRepository", "()Lcom/bbva/glomohybrid/landing/data/repository/LandingSectionsDeletedRepository;", "repository", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMarkLandingSectionAsDeletedUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkLandingSectionAsDeletedUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/MarkLandingSectionAsDeletedUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,27:1\n56#2,6:28\n*S KotlinDebug\n*F\n+ 1 MarkLandingSectionAsDeletedUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/MarkLandingSectionAsDeletedUseCase\n*L\n18#1:28,6\n*E\n"})
public final class MarkLandingSectionAsDeletedUseCase implements SuspendUseCaseWithParams<LandingMessageCardModel, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy repository;

    /* JADX INFO: compiled from: MarkLandingSectionAsDeletedUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.MarkLandingSectionAsDeletedUseCase", f = "MarkLandingSectionAsDeletedUseCase.kt", i = {}, l = {22}, m = "execute", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f32882p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f32884r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32882p0 = obj;
            this.f32884r0 |= Integer.MIN_VALUE;
            return MarkLandingSectionAsDeletedUseCase.this.execute((LandingMessageCardModel) null, (Continuation<? super Unit>) this);
        }
    }

    /* JADX INFO: compiled from: MarkLandingSectionAsDeletedUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.MarkLandingSectionAsDeletedUseCase$execute$2", f = "MarkLandingSectionAsDeletedUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingMessageCardModel f32886q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LandingMessageCardModel landingMessageCardModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f32886q0 = landingMessageCardModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarkLandingSectionAsDeletedUseCase.this.new b(this.f32886q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LandingSectionsDeletedRepository repository = MarkLandingSectionAsDeletedUseCase.this.getRepository();
            LandingMessageCardModel landingMessageCardModel = this.f32886q0;
            repository.addItemRemoved(landingMessageCardModel.getId(), LandingMessageCardModelExtensionsKt.hash(landingMessageCardModel));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarkLandingSectionAsDeletedUseCase(@NotNull final ViewModelComponentsProviders provider, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f32880a = dispatchers;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.repository = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<LandingSectionsDeletedRepository>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.MarkLandingSectionAsDeletedUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.landing.data.repository.LandingSectionsDeletedRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LandingSectionsDeletedRepository invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(LandingSectionsDeletedRepository.class), qualifier, objArr);
            }
        });
    }

    @NotNull
    public final LandingSectionsDeletedRepository getRepository() {
        return (LandingSectionsDeletedRepository) this.repository.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@Nullable LandingMessageCardModel landingMessageCardModel, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f32884r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32884r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f32882p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f32884r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (landingMessageCardModel == null) {
                return Unit.INSTANCE;
            }
            CoroutineDispatcher coroutineDispatcherIo = this.f32880a.io();
            b bVar = new b(landingMessageCardModel, null);
            aVar.f32884r0 = 1;
            if (BuildersKt.withContext(coroutineDispatcherIo, bVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MarkLandingSectionAsDeletedUseCase(ViewModelComponentsProviders viewModelComponentsProviders, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
