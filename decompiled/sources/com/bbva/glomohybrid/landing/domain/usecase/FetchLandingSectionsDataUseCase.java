package com.bbva.glomohybrid.landing.domain.usecase;

import com.bbva.component.dm.settings.domain.fetcher.LandingConfigurationFetcher;
import com.bbva.component.dm.settings.domain.model.LandingConfiguration;
import com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.data.repository.LandingSectionsDeletedRepository;
import com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FetchLandingSectionsDataUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/FetchLandingSectionsDataUseCase;", "", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "params", "Lkotlinx/coroutines/Deferred;", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSection;", "executeAsync", "(Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/landing/data/repository/LandingSectionsDeletedRepository;", "sectionsDeletedRepository", "Lcom/bbva/component/dm/settings/domain/fetcher/LandingConfigurationFetcher;", "landingConfigFetcher", "Lcom/bbva/glomohybrid/landing/domain/sections/LandingSectionsFetcher;", "sectionsFetcher", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomohybrid/landing/data/repository/LandingSectionsDeletedRepository;Lcom/bbva/component/dm/settings/domain/fetcher/LandingConfigurationFetcher;Lcom/bbva/glomohybrid/landing/domain/sections/LandingSectionsFetcher;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class FetchLandingSectionsDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingSectionsDeletedRepository f32861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingConfigurationFetcher f32862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LandingSectionsFetcher f32863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32864d;

    /* JADX INFO: compiled from: FetchLandingSectionsDataUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.FetchLandingSectionsDataUseCase$executeAsync$2", f = "FetchLandingSectionsDataUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Deferred<? extends List<? extends LandingSection>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f32865p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f32867r0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.landing.domain.usecase.FetchLandingSectionsDataUseCase$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FetchLandingSectionsDataUseCase.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.FetchLandingSectionsDataUseCase$executeAsync$2$1", f = "FetchLandingSectionsDataUseCase.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nFetchLandingSectionsDataUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchLandingSectionsDataUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/FetchLandingSectionsDataUseCase$executeAsync$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
        public static final class C0141a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LandingSection>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f32868p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f32869q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ FetchLandingSectionsDataUseCase f32870r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ UserProfileConfiguration f32871s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0141a(FetchLandingSectionsDataUseCase fetchLandingSectionsDataUseCase, UserProfileConfiguration userProfileConfiguration, Continuation<? super C0141a> continuation) {
                super(2, continuation);
                this.f32870r0 = fetchLandingSectionsDataUseCase;
                this.f32871s0 = userProfileConfiguration;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0141a c0141a = new C0141a(this.f32870r0, this.f32871s0, continuation);
                c0141a.f32869q0 = obj;
                return c0141a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LandingSection>> continuation) {
                return ((C0141a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                List<LandingSectionConfiguration> sections;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f32868p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FetchLandingSectionsDataUseCase fetchLandingSectionsDataUseCase = this.f32870r0;
                    LandingConfigurationFetcher landingConfigurationFetcher = fetchLandingSectionsDataUseCase.f32862b;
                    UserProfileConfiguration userProfileConfiguration = this.f32871s0;
                    LandingConfiguration landingConfigurationFetchConfiguration = landingConfigurationFetcher.fetchConfiguration(userProfileConfiguration);
                    if (landingConfigurationFetchConfiguration == null || (sections = landingConfigurationFetchConfiguration.getSections()) == null) {
                        return null;
                    }
                    fetchLandingSectionsDataUseCase.f32861a.removeExpiredSectionsFingerprint(sections);
                    LandingSectionsFetcher landingSectionsFetcher = fetchLandingSectionsDataUseCase.f32863c;
                    this.f32868p0 = 1;
                    obj = landingSectionsFetcher.fetch(userProfileConfiguration, sections, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserProfileConfiguration userProfileConfiguration, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32867r0 = userProfileConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = FetchLandingSectionsDataUseCase.this.new a(this.f32867r0, continuation);
            aVar.f32865p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Deferred<? extends List<? extends LandingSection>>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f32865p0;
            FetchLandingSectionsDataUseCase fetchLandingSectionsDataUseCase = FetchLandingSectionsDataUseCase.this;
            return BuildersKt__Builders_commonKt.async$default(coroutineScope, fetchLandingSectionsDataUseCase.f32864d.io(), null, new C0141a(fetchLandingSectionsDataUseCase, this.f32867r0, null), 2, null);
        }
    }

    public FetchLandingSectionsDataUseCase(@NotNull LandingSectionsDeletedRepository sectionsDeletedRepository, @NotNull LandingConfigurationFetcher landingConfigFetcher, @NotNull LandingSectionsFetcher sectionsFetcher, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(sectionsDeletedRepository, "sectionsDeletedRepository");
        Intrinsics.checkNotNullParameter(landingConfigFetcher, "landingConfigFetcher");
        Intrinsics.checkNotNullParameter(sectionsFetcher, "sectionsFetcher");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f32861a = sectionsDeletedRepository;
        this.f32862b = landingConfigFetcher;
        this.f32863c = sectionsFetcher;
        this.f32864d = dispatchers;
    }

    @Nullable
    public final Object executeAsync(@NotNull UserProfileConfiguration userProfileConfiguration, @NotNull Continuation<? super Deferred<? extends List<? extends LandingSection>>> continuation) {
        return CoroutineScopeKt.coroutineScope(new a(userProfileConfiguration, null), continuation);
    }

    public /* synthetic */ FetchLandingSectionsDataUseCase(LandingSectionsDeletedRepository landingSectionsDeletedRepository, LandingConfigurationFetcher landingConfigurationFetcher, LandingSectionsFetcher landingSectionsFetcher, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(landingSectionsDeletedRepository, landingConfigurationFetcher, landingSectionsFetcher, (i10 & 8) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
