package com.bbva.glomohybrid.landing.domain.usecase;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.cells.component.kit.featureflag.FlagState;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.component.dm.actionlauncher.model.Action;
import com.bbva.component.dm.settings.domain.AppSettingsConstants;
import com.bbva.component.dm.settings.domain.fetcher.LandingConfigurationFetcher;
import com.bbva.component.dm.settings.domain.model.Contact;
import com.bbva.component.dm.settings.domain.model.LandingBackgrounds;
import com.bbva.component.dm.settings.domain.model.LandingConfiguration;
import com.bbva.component.dm.settings.domain.model.LandingHeaderConfiguration;
import com.bbva.component.dm.settings.domain.model.LandingHeaderTypesConfiguration;
import com.bbva.component.dm.settings.domain.model.VisualMessageConfiguration;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.fetcher.UserAvatarFetcher;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomohybrid.featureflags.domain.flags.LandingNativeFlags;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.domain.mapper.LandingHeaderMessageMapper;
import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomohybrid.landing.domain.model.LandingBackground;
import com.bbva.glomohybrid.landing.domain.model.LandingHeaderFeatureFlagsModel;
import com.bbva.glomohybrid.landing.domain.model.LandingHeaderMessageModel;
import com.bbva.glomohybrid.landing.domain.model.LandingHeaderModel;
import com.bbva.glomohybrid.landing.domain.model.LandingRequestHeaderParams;
import com.bbva.glomohybrid.landing.domain.model.LandingUserSegment;
import com.bbva.glomohybrid.landing.domain.shortcuts.LandingShortcutsFetcher;
import com.bbva.glomohybrid.landing.presentation.behaviours.LandingBackgroundBehaviour;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FetchLandingHeaderDataUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/FetchLandingHeaderDataUseCase;", "", "Lcom/bbva/glomohybrid/landing/domain/model/LandingRequestHeaderParams;", "params", "Lkotlinx/coroutines/Deferred;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderModel;", "executeAsync", "(Lcom/bbva/glomohybrid/landing/domain/model/LandingRequestHeaderParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/settings/domain/fetcher/LandingConfigurationFetcher;", "landingConfigFetcher", "Lcom/bbva/glomohybrid/landing/domain/shortcuts/LandingShortcutsFetcher;", "shortcutsFetcher", "Lcom/bbva/glomohybrid/base/fetcher/UserAvatarFetcher;", "avatarBehavior", "Lcom/bbva/glomohybrid/landing/presentation/behaviours/LandingBackgroundBehaviour;", "backgroundBehaviour", "Lcom/bbva/glomohybrid/landing/domain/mapper/LandingHeaderMessageMapper;", "messageMapper", "Lcom/bbva/cellscore/featureflag/FeatureFlagManager;", "featureFlagsManager", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/component/dm/settings/domain/fetcher/LandingConfigurationFetcher;Lcom/bbva/glomohybrid/landing/domain/shortcuts/LandingShortcutsFetcher;Lcom/bbva/glomohybrid/base/fetcher/UserAvatarFetcher;Lcom/bbva/glomohybrid/landing/presentation/behaviours/LandingBackgroundBehaviour;Lcom/bbva/glomohybrid/landing/domain/mapper/LandingHeaderMessageMapper;Lcom/bbva/cellscore/featureflag/FeatureFlagManager;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFetchLandingHeaderDataUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchLandingHeaderDataUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/FetchLandingHeaderDataUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1549#2:145\n1620#2,2:146\n1622#2:149\n1#3:148\n*S KotlinDebug\n*F\n+ 1 FetchLandingHeaderDataUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/FetchLandingHeaderDataUseCase\n*L\n78#1:145\n78#1:146,2\n78#1:149\n*E\n"})
public final class FetchLandingHeaderDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingConfigurationFetcher f32830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingShortcutsFetcher f32831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UserAvatarFetcher f32832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LandingBackgroundBehaviour f32833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LandingHeaderMessageMapper f32834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final FeatureFlagManager f32835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f32837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f32838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f32839j;

    /* JADX INFO: compiled from: FetchLandingHeaderDataUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase$executeAsync$2", f = "FetchLandingHeaderDataUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Deferred<? extends LandingHeaderModel>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f32840p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LandingRequestHeaderParams f32842r0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FetchLandingHeaderDataUseCase.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase$executeAsync$2$1", f = "FetchLandingHeaderDataUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {61, 64, 65}, m = "invokeSuspend", n = {"avatar", "shortcuts", "segment", "background", "message", "features", "avatar", "background", "message", "features", "background", "message", "features"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
        public static final class C0139a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LandingHeaderModel>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Object f32843p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public Object f32844q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public Object f32845r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public Object f32846s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public LandingHeaderFeatureFlagsModel f32847t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f32848u0;
            public /* synthetic */ Object v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public final /* synthetic */ FetchLandingHeaderDataUseCase f32849w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public final /* synthetic */ LandingRequestHeaderParams f32850x0;

            /* JADX INFO: renamed from: com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FetchLandingHeaderDataUseCase.kt */
            @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase$executeAsync$2$1$avatar$1", f = "FetchLandingHeaderDataUseCase.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0140a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserAvatarModel>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f32851p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ FetchLandingHeaderDataUseCase f32852q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ LandingRequestHeaderParams f32853r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ LandingConfiguration f32854s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0140a(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase, LandingRequestHeaderParams landingRequestHeaderParams, LandingConfiguration landingConfiguration, Continuation<? super C0140a> continuation) {
                    super(2, continuation);
                    this.f32852q0 = fetchLandingHeaderDataUseCase;
                    this.f32853r0 = landingRequestHeaderParams;
                    this.f32854s0 = landingConfiguration;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0140a(this.f32852q0, this.f32853r0, this.f32854s0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserAvatarModel> continuation) {
                    return ((C0140a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f32851p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserAvatarFetcher userAvatarFetcher = this.f32852q0.f32832c;
                        UserProfileConfiguration userConfiguration = this.f32853r0.getUserConfiguration();
                        this.f32851p0 = 1;
                        obj = userAvatarFetcher.get(userConfiguration, this.f32854s0, this);
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

            /* JADX INFO: renamed from: com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase$a$a$b */
            /* JADX INFO: compiled from: FetchLandingHeaderDataUseCase.kt */
            @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase$executeAsync$2$1$shortcuts$1", f = "FetchLandingHeaderDataUseCase.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LandingShortcutItemModel>>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public FetchLandingHeaderDataUseCase f32855p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public int f32856q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ FetchLandingHeaderDataUseCase f32857r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ LandingRequestHeaderParams f32858s0;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public final /* synthetic */ LandingConfiguration f32859t0;

                /* JADX INFO: renamed from: u0, reason: collision with root package name */
                public final /* synthetic */ Contact f32860u0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase, LandingRequestHeaderParams landingRequestHeaderParams, LandingConfiguration landingConfiguration, Contact contact, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f32857r0 = fetchLandingHeaderDataUseCase;
                    this.f32858s0 = landingRequestHeaderParams;
                    this.f32859t0 = landingConfiguration;
                    this.f32860u0 = contact;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.f32857r0, this.f32858s0, this.f32859t0, this.f32860u0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends LandingShortcutItemModel>> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase;
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f32856q0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase2 = this.f32857r0;
                        LandingShortcutsFetcher landingShortcutsFetcher = fetchLandingHeaderDataUseCase2.f32831b;
                        this.f32855p0 = fetchLandingHeaderDataUseCase2;
                        this.f32856q0 = 1;
                        Object objFetch = landingShortcutsFetcher.fetch(this.f32858s0, this.f32859t0, this);
                        if (objFetch == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        fetchLandingHeaderDataUseCase = fetchLandingHeaderDataUseCase2;
                        obj = objFetch;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fetchLandingHeaderDataUseCase = this.f32855p0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return FetchLandingHeaderDataUseCase.access$mapContact(fetchLandingHeaderDataUseCase, (List) obj, this.f32860u0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0139a(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase, LandingRequestHeaderParams landingRequestHeaderParams, Continuation<? super C0139a> continuation) {
                super(2, continuation);
                this.f32849w0 = fetchLandingHeaderDataUseCase;
                this.f32850x0 = landingRequestHeaderParams;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0139a c0139a = new C0139a(this.f32849w0, this.f32850x0, continuation);
                c0139a.v0 = obj;
                return c0139a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LandingHeaderModel> continuation) {
                return ((C0139a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0125 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:23:0x0126  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Deferred deferredAsync$default;
                LandingBackground landingBackgroundAccess$getBackground;
                LandingHeaderMessageModel landingHeaderMessageModel;
                LandingUserSegment landingUserSegment;
                Deferred deferred;
                LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel;
                Object objAwait;
                LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel2;
                LandingUserSegment landingUserSegment2;
                List list;
                Object objAwait2;
                List list2;
                LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel3;
                LandingBackground landingBackground;
                LandingHeaderMessageModel landingHeaderMessageModel2;
                LandingUserSegment landingUserSegment3;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f32848u0;
                if (i10 != 0) {
                    if (i10 == 1) {
                        landingHeaderFeatureFlagsModel = this.f32847t0;
                        landingHeaderMessageModel = (LandingHeaderMessageModel) this.f32846s0;
                        LandingBackground landingBackground2 = (LandingBackground) this.f32845r0;
                        landingUserSegment = (LandingUserSegment) this.f32844q0;
                        deferredAsync$default = (Deferred) this.f32843p0;
                        Deferred deferred2 = (Deferred) this.v0;
                        ResultKt.throwOnFailure(obj);
                        landingBackgroundAccess$getBackground = landingBackground2;
                        deferred = deferred2;
                    } else if (i10 == 2) {
                        landingUserSegment2 = (LandingUserSegment) this.f32846s0;
                        LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel4 = (LandingHeaderFeatureFlagsModel) this.f32845r0;
                        LandingHeaderMessageModel landingHeaderMessageModel3 = (LandingHeaderMessageModel) this.f32844q0;
                        LandingBackground landingBackground3 = (LandingBackground) this.f32843p0;
                        deferred = (Deferred) this.v0;
                        ResultKt.throwOnFailure(obj);
                        landingBackgroundAccess$getBackground = landingBackground3;
                        landingHeaderMessageModel = landingHeaderMessageModel3;
                        landingHeaderFeatureFlagsModel2 = landingHeaderFeatureFlagsModel4;
                        objAwait = obj;
                        list = (List) objAwait;
                        this.v0 = landingBackgroundAccess$getBackground;
                        this.f32843p0 = landingHeaderMessageModel;
                        this.f32844q0 = landingHeaderFeatureFlagsModel2;
                        this.f32845r0 = landingUserSegment2;
                        this.f32846s0 = list;
                        this.f32848u0 = 3;
                        objAwait2 = deferred.await(this);
                        if (objAwait2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list2 = list;
                        landingHeaderFeatureFlagsModel3 = landingHeaderFeatureFlagsModel2;
                        landingBackground = landingBackgroundAccess$getBackground;
                        landingHeaderMessageModel2 = landingHeaderMessageModel;
                        landingUserSegment3 = landingUserSegment2;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        List list3 = (List) this.f32846s0;
                        LandingUserSegment landingUserSegment4 = (LandingUserSegment) this.f32845r0;
                        LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel5 = (LandingHeaderFeatureFlagsModel) this.f32844q0;
                        LandingHeaderMessageModel landingHeaderMessageModel4 = (LandingHeaderMessageModel) this.f32843p0;
                        LandingBackground landingBackground4 = (LandingBackground) this.v0;
                        ResultKt.throwOnFailure(obj);
                        list2 = list3;
                        landingUserSegment3 = landingUserSegment4;
                        landingHeaderFeatureFlagsModel3 = landingHeaderFeatureFlagsModel5;
                        landingHeaderMessageModel2 = landingHeaderMessageModel4;
                        landingBackground = landingBackground4;
                        objAwait2 = obj;
                    }
                    return new LandingHeaderModel(landingUserSegment3, list2, (UserAvatarModel) objAwait2, landingBackground, landingHeaderMessageModel2, landingHeaderFeatureFlagsModel3);
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.v0;
                FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase = this.f32849w0;
                FetchLandingHeaderDataUseCase.access$initDelay(fetchLandingHeaderDataUseCase);
                LandingConfigurationFetcher landingConfigurationFetcher = fetchLandingHeaderDataUseCase.f32830a;
                LandingRequestHeaderParams landingRequestHeaderParams = this.f32850x0;
                LandingConfiguration landingConfigurationFetchConfiguration = landingConfigurationFetcher.fetchConfiguration(landingRequestHeaderParams.getUserConfiguration());
                Contact contactFetchContact = fetchLandingHeaderDataUseCase.f32830a.fetchContact();
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C0140a(fetchLandingHeaderDataUseCase, landingRequestHeaderParams, landingConfigurationFetchConfiguration, null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new b(this.f32849w0, this.f32850x0, landingConfigurationFetchConfiguration, contactFetchContact, null), 3, null);
                LandingUserSegment landingUserSegmentAccess$getSegment = FetchLandingHeaderDataUseCase.access$getSegment(fetchLandingHeaderDataUseCase, landingRequestHeaderParams.getUserConfiguration(), landingConfigurationFetchConfiguration);
                landingBackgroundAccess$getBackground = FetchLandingHeaderDataUseCase.access$getBackground(fetchLandingHeaderDataUseCase, landingConfigurationFetchConfiguration);
                LandingHeaderMessageModel landingHeaderMessageModelAccess$getBlockerMessage = FetchLandingHeaderDataUseCase.access$getBlockerMessage(fetchLandingHeaderDataUseCase, landingRequestHeaderParams, landingConfigurationFetchConfiguration);
                LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModelAccess$getFeatureFlags = FetchLandingHeaderDataUseCase.access$getFeatureFlags(fetchLandingHeaderDataUseCase);
                boolean fromProfileChange = landingRequestHeaderParams.getFromProfileChange();
                this.v0 = deferredAsync$default2;
                this.f32843p0 = deferredAsync$default;
                this.f32844q0 = landingUserSegmentAccess$getSegment;
                this.f32845r0 = landingBackgroundAccess$getBackground;
                this.f32846s0 = landingHeaderMessageModelAccess$getBlockerMessage;
                this.f32847t0 = landingHeaderFeatureFlagsModelAccess$getFeatureFlags;
                this.f32848u0 = 1;
                if (FetchLandingHeaderDataUseCase.access$waitForMinDelay(fetchLandingHeaderDataUseCase, fromProfileChange, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                landingHeaderMessageModel = landingHeaderMessageModelAccess$getBlockerMessage;
                landingUserSegment = landingUserSegmentAccess$getSegment;
                deferred = deferredAsync$default2;
                landingHeaderFeatureFlagsModel = landingHeaderFeatureFlagsModelAccess$getFeatureFlags;
                this.v0 = deferred;
                this.f32843p0 = landingBackgroundAccess$getBackground;
                this.f32844q0 = landingHeaderMessageModel;
                this.f32845r0 = landingHeaderFeatureFlagsModel;
                this.f32846s0 = landingUserSegment;
                this.f32847t0 = null;
                this.f32848u0 = 2;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                landingHeaderFeatureFlagsModel2 = landingHeaderFeatureFlagsModel;
                landingUserSegment2 = landingUserSegment;
                list = (List) objAwait;
                this.v0 = landingBackgroundAccess$getBackground;
                this.f32843p0 = landingHeaderMessageModel;
                this.f32844q0 = landingHeaderFeatureFlagsModel2;
                this.f32845r0 = landingUserSegment2;
                this.f32846s0 = list;
                this.f32848u0 = 3;
                objAwait2 = deferred.await(this);
                if (objAwait2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                landingHeaderFeatureFlagsModel3 = landingHeaderFeatureFlagsModel2;
                landingBackground = landingBackgroundAccess$getBackground;
                landingHeaderMessageModel2 = landingHeaderMessageModel;
                landingUserSegment3 = landingUserSegment2;
                return new LandingHeaderModel(landingUserSegment3, list2, (UserAvatarModel) objAwait2, landingBackground, landingHeaderMessageModel2, landingHeaderFeatureFlagsModel3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LandingRequestHeaderParams landingRequestHeaderParams, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32842r0 = landingRequestHeaderParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = FetchLandingHeaderDataUseCase.this.new a(this.f32842r0, continuation);
            aVar.f32840p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Deferred<? extends LandingHeaderModel>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f32840p0;
            FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase = FetchLandingHeaderDataUseCase.this;
            return BuildersKt__Builders_commonKt.async$default(coroutineScope, fetchLandingHeaderDataUseCase.f32836g.io(), null, new C0139a(fetchLandingHeaderDataUseCase, this.f32842r0, null), 2, null);
        }
    }

    public FetchLandingHeaderDataUseCase(@NotNull LandingConfigurationFetcher landingConfigFetcher, @NotNull LandingShortcutsFetcher shortcutsFetcher, @NotNull UserAvatarFetcher avatarBehavior, @NotNull LandingBackgroundBehaviour backgroundBehaviour, @NotNull LandingHeaderMessageMapper messageMapper, @NotNull FeatureFlagManager featureFlagsManager, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(landingConfigFetcher, "landingConfigFetcher");
        Intrinsics.checkNotNullParameter(shortcutsFetcher, "shortcutsFetcher");
        Intrinsics.checkNotNullParameter(avatarBehavior, "avatarBehavior");
        Intrinsics.checkNotNullParameter(backgroundBehaviour, "backgroundBehaviour");
        Intrinsics.checkNotNullParameter(messageMapper, "messageMapper");
        Intrinsics.checkNotNullParameter(featureFlagsManager, "featureFlagsManager");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f32830a = landingConfigFetcher;
        this.f32831b = shortcutsFetcher;
        this.f32832c = avatarBehavior;
        this.f32833d = backgroundBehaviour;
        this.f32834e = messageMapper;
        this.f32835f = featureFlagsManager;
        this.f32836g = dispatchers;
        this.f32837h = 1400L;
        this.f32838i = 1024L;
    }

    public static final LandingBackground access$getBackground(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase, LandingConfiguration landingConfiguration) {
        LandingBackgrounds background;
        String landing;
        fetchLandingHeaderDataUseCase.getClass();
        if (landingConfiguration == null || (background = landingConfiguration.getBackground()) == null || (landing = background.getLanding()) == null) {
            return null;
        }
        return fetchLandingHeaderDataUseCase.f32833d.personal(landing);
    }

    public static final LandingHeaderMessageModel access$getBlockerMessage(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase, LandingRequestHeaderParams landingRequestHeaderParams, LandingConfiguration landingConfiguration) {
        LandingHeaderTypesConfiguration header;
        LandingHeaderConfiguration blocked;
        LandingHeaderTypesConfiguration header2;
        LandingHeaderConfiguration forceUpdate;
        fetchLandingHeaderDataUseCase.getClass();
        LandingAppAccess appState = landingRequestHeaderParams.getAppState();
        VisualMessageConfiguration message = null;
        if (Intrinsics.areEqual(appState, LandingAppAccess.Available.INSTANCE)) {
            return null;
        }
        if (appState instanceof LandingAppAccess.NotAvailableForUpdate) {
            if (landingConfiguration != null && (header2 = landingConfiguration.getHeader()) != null && (forceUpdate = header2.getForceUpdate()) != null) {
                message = forceUpdate.getMessage();
            }
        } else {
            if (!(appState instanceof LandingAppAccess.NotAvailable)) {
                throw new NoWhenBranchMatchedException();
            }
            VisualMessageConfiguration message2 = ((LandingAppAccess.NotAvailable) landingRequestHeaderParams.getAppState()).getMessage();
            if (message2 != null) {
                message = message2;
            } else if (landingConfiguration != null && (header = landingConfiguration.getHeader()) != null && (blocked = header.getBlocked()) != null) {
                message = blocked.getMessage();
            }
        }
        return fetchLandingHeaderDataUseCase.f32834e.map(message);
    }

    public static final LandingHeaderFeatureFlagsModel access$getFeatureFlags(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase) {
        fetchLandingHeaderDataUseCase.getClass();
        FlagState flag = fetchLandingHeaderDataUseCase.f32835f.getFlag(LandingNativeFlags.HEADER_DIGITAL_ACTIVATION.getValue());
        if (flag == null) {
            flag = FlagState.Enable;
        }
        return new LandingHeaderFeatureFlagsModel(flag == FlagState.Enable);
    }

    public static final LandingUserSegment access$getSegment(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase, UserProfileConfiguration userProfileConfiguration, LandingConfiguration landingConfiguration) {
        String value;
        fetchLandingHeaderDataUseCase.getClass();
        if ((landingConfiguration == null || (value = landingConfiguration.getSegment()) == null) && (userProfileConfiguration.getRememberedUser() == null || (value = userProfileConfiguration.getType().getValue()) == null)) {
            value = AppSettingsConstants.LANDING_SEGMENT_NO_USER;
        }
        return new LandingUserSegment(value, landingConfiguration != null ? landingConfiguration.getSegmentDescription() : null);
    }

    public static final void access$initDelay(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase) {
        if (fetchLandingHeaderDataUseCase.f32839j == 0) {
            fetchLandingHeaderDataUseCase.f32839j = System.currentTimeMillis();
        }
    }

    public static final List access$mapContact(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase, List list, Contact contact) {
        fetchLandingHeaderDataUseCase.getClass();
        String phone = contact != null ? contact.getPhone() : null;
        if (phone == null) {
            phone = "";
        }
        List<LandingShortcutItemModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (LandingShortcutItemModel landingShortcutItemModel : list2) {
            LandingShortcutItemModel landingShortcutItemModelCopy = Intrinsics.areEqual(landingShortcutItemModel.getRoute(), Action.TYPE_DIALER) ^ true ? landingShortcutItemModel : null;
            if (landingShortcutItemModelCopy == null) {
                landingShortcutItemModelCopy = landingShortcutItemModel.copy((TypedValues.PositionType.TYPE_POSITION_TYPE & 1) != 0 ? landingShortcutItemModel.route : phone, (TypedValues.PositionType.TYPE_POSITION_TYPE & 2) != 0 ? landingShortcutItemModel.navigationType : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 4) != 0 ? landingShortcutItemModel.text : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 8) != 0 ? landingShortcutItemModel.com.bbva.zoomauth.facialauth.constant.AuthConstants.IMAGE java.lang.String : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 16) != 0 ? landingShortcutItemModel.targetProfile : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 32) != 0 ? landingShortcutItemModel.priority : 0, (TypedValues.PositionType.TYPE_POSITION_TYPE & 64) != 0 ? landingShortcutItemModel.conditions : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 128) != 0 ? landingShortcutItemModel.com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper.ANALYTICS java.lang.String : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 256) != 0 ? landingShortcutItemModel.com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper.EPI_CAMPAIGN_NAME java.lang.String : null);
            }
            arrayList.add(landingShortcutItemModelCopy);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$waitForMinDelay(FetchLandingHeaderDataUseCase fetchLandingHeaderDataUseCase, boolean z10, Continuation continuation) {
        j9.a aVar;
        fetchLandingHeaderDataUseCase.getClass();
        if (continuation instanceof j9.a) {
            aVar = (j9.a) continuation;
            int i10 = aVar.f78809s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f78809s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new j9.a(fetchLandingHeaderDataUseCase, continuation);
            }
        } else {
            aVar = new j9.a(fetchLandingHeaderDataUseCase, continuation);
        }
        Object obj = aVar.f78807q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f78809s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (fetchLandingHeaderDataUseCase.f32839j != 0) {
                long jCoerceAtLeast = z10 ? c.coerceAtLeast(fetchLandingHeaderDataUseCase.f32837h - (System.currentTimeMillis() - fetchLandingHeaderDataUseCase.f32839j), 0L) : fetchLandingHeaderDataUseCase.f32838i;
                aVar.f78806p0 = fetchLandingHeaderDataUseCase;
                aVar.f78809s0 = 1;
                if (DelayKt.delay(jCoerceAtLeast, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fetchLandingHeaderDataUseCase = aVar.f78806p0;
        ResultKt.throwOnFailure(obj);
        fetchLandingHeaderDataUseCase.f32839j = 0L;
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object executeAsync(@NotNull LandingRequestHeaderParams landingRequestHeaderParams, @NotNull Continuation<? super Deferred<LandingHeaderModel>> continuation) {
        return CoroutineScopeKt.coroutineScope(new a(landingRequestHeaderParams, null), continuation);
    }

    public /* synthetic */ FetchLandingHeaderDataUseCase(LandingConfigurationFetcher landingConfigurationFetcher, LandingShortcutsFetcher landingShortcutsFetcher, UserAvatarFetcher userAvatarFetcher, LandingBackgroundBehaviour landingBackgroundBehaviour, LandingHeaderMessageMapper landingHeaderMessageMapper, FeatureFlagManager featureFlagManager, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(landingConfigurationFetcher, landingShortcutsFetcher, userAvatarFetcher, landingBackgroundBehaviour, landingHeaderMessageMapper, featureFlagManager, (i10 & 64) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
