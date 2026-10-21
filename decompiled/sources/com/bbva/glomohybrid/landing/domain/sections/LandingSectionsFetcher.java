package com.bbva.glomohybrid.landing.domain.sections;

import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.component.dm.aem.AEMDataManager;
import com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.data.MessageCardDataManagerProvider;
import com.bbva.glomohybrid.landing.data.repository.LandingECommerceCardsRepository;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSectionsFetcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/LandingSectionsFetcher;", "", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "", "Lcom/bbva/component/dm/settings/domain/model/LandingSectionConfiguration;", "configuration", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSection;", FetchCommand.ID, "(Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/landing/data/repository/LandingECommerceCardsRepository;", "eCommerceRepository", "Lcom/bbva/glomohybrid/landing/data/MessageCardDataManagerProvider;", "messagesCardProvider", "Lcom/bbva/glomohybrid/landing/domain/sections/LandingSectionsPicker;", "picker", "<init>", "(Lcom/bbva/glomohybrid/landing/data/repository/LandingECommerceCardsRepository;Lcom/bbva/glomohybrid/landing/data/MessageCardDataManagerProvider;Lcom/bbva/glomohybrid/landing/domain/sections/LandingSectionsPicker;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingSectionsFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSectionsFetcher.kt\ncom/bbva/glomohybrid/landing/domain/sections/LandingSectionsFetcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n766#2:70\n857#2,2:71\n1603#2,9:73\n1855#2:82\n1856#2:84\n1612#2:85\n800#2,11:86\n1603#2,9:97\n1855#2:106\n1856#2:108\n1612#2:109\n1#3:83\n1#3:107\n*S KotlinDebug\n*F\n+ 1 LandingSectionsFetcher.kt\ncom/bbva/glomohybrid/landing/domain/sections/LandingSectionsFetcher\n*L\n40#1:70\n40#1:71,2\n41#1:73,9\n41#1:82\n41#1:84\n41#1:85\n64#1:86,11\n65#1:97,9\n65#1:106\n65#1:108\n65#1:109\n41#1:83\n65#1:107\n*E\n"})
public final class LandingSectionsFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingECommerceCardsRepository f32710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MessageCardDataManagerProvider f32711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LandingSectionsPicker f32712c;

    /* JADX INFO: compiled from: LandingSectionsFetcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher", f = "LandingSectionsFetcher.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 3}, l = {27, 28, 30, 31, 29}, m = FetchCommand.ID, n = {"this", Scopes.PROFILE, "configuration", "this", Scopes.PROFILE, "digitalCardsData", Scopes.PROFILE, "messageCardDataResult", Scopes.PROFILE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f32713p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f32714q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f32715r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f32716s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f32718u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32716s0 = obj;
            this.f32718u0 |= Integer.MIN_VALUE;
            return LandingSectionsFetcher.this.fetch(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LandingSectionsFetcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher", f = "LandingSectionsFetcher.kt", i = {0, 0}, l = {43}, m = "getAllMessageCardDataAsync", n = {"this", "destination$iv$iv"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingSectionsFetcher f32719p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Collection f32720q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Iterator f32721r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f32722s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f32724u0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32722s0 = obj;
            this.f32724u0 |= Integer.MIN_VALUE;
            return LandingSectionsFetcher.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: LandingSectionsFetcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher$getAllMessageCardDataAsync$3$1", f = "LandingSectionsFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Deferred<? extends FetchResult<List<? extends LandingMessageCardModel>>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f32725p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LandingSectionConfiguration f32727r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f32728s0;

        /* JADX INFO: compiled from: LandingSectionsFetcher.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher$getAllMessageCardDataAsync$3$1$1", f = "LandingSectionsFetcher.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FetchResult<List<? extends LandingMessageCardModel>>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f32729p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ LandingSectionsFetcher f32730q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ LandingSectionConfiguration f32731r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ String f32732s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LandingSectionsFetcher landingSectionsFetcher, LandingSectionConfiguration landingSectionConfiguration, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f32730q0 = landingSectionsFetcher;
                this.f32731r0 = landingSectionConfiguration;
                this.f32732s0 = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f32730q0, this.f32731r0, this.f32732s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FetchResult<List<? extends LandingMessageCardModel>>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f32729p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AEMDataManager<List<LandingMessageCardModel>> aEMDataManagerProvide = this.f32730q0.f32711b.provide(this.f32731r0);
                    this.f32729p0 = 1;
                    obj = aEMDataManagerProvide.get(this.f32732s0, this);
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
        public c(LandingSectionConfiguration landingSectionConfiguration, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f32727r0 = landingSectionConfiguration;
            this.f32728s0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = LandingSectionsFetcher.this.new c(this.f32727r0, this.f32728s0, continuation);
            cVar.f32725p0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Deferred<? extends FetchResult<List<? extends LandingMessageCardModel>>>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f32725p0, null, null, new a(LandingSectionsFetcher.this, this.f32727r0, this.f32728s0, null), 3, null);
        }
    }

    public LandingSectionsFetcher(@NotNull LandingECommerceCardsRepository eCommerceRepository, @NotNull MessageCardDataManagerProvider messagesCardProvider, @NotNull LandingSectionsPicker picker) {
        Intrinsics.checkNotNullParameter(eCommerceRepository, "eCommerceRepository");
        Intrinsics.checkNotNullParameter(messagesCardProvider, "messagesCardProvider");
        Intrinsics.checkNotNullParameter(picker, "picker");
        this.f32710a = eCommerceRepository;
        this.f32711b = messagesCardProvider;
        this.f32712c = picker;
    }

    public static final Object access$getECommerceCardsDataAsync(LandingSectionsFetcher landingSectionsFetcher, List list, Continuation continuation) {
        landingSectionsFetcher.getClass();
        return CoroutineScopeKt.coroutineScope(new i9.a(landingSectionsFetcher, list, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[DONT_INVERT, PHI: r2 r4 r6 r9
      0x009e: PHI (r2v6 java.util.Collection) = (r2v4 java.util.Collection), (r2v7 java.util.Collection) binds: [B:24:0x0081, B:29:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r4v6 com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher) = 
      (r4v5 com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher)
      (r4v7 com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher)
     binds: [B:24:0x0081, B:29:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r6v1 kotlinx.coroutines.Deferred) = (r6v0 kotlinx.coroutines.Deferred), (r6v3 kotlinx.coroutines.Deferred) binds: [B:24:0x0081, B:29:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r9v6 java.util.Iterator) = (r9v5 java.util.Iterator), (r9v7 java.util.Iterator) binds: [B:24:0x0081, B:29:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0081 -> B:30:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0098 -> B:29:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List<com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration> r9, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends com.bbva.cells.componentkit.model.FetchResult<java.util.List<com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel>>>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher.b
            if (r0 == 0) goto L13
            r0 = r10
            com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher$b r0 = (com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher.b) r0
            int r1 = r0.f32724u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32724u0 = r1
            goto L18
        L13:
            com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher$b r0 = new com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f32722s0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32724u0
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.util.Iterator r9 = r0.f32721r0
            java.util.Collection r2 = r0.f32720q0
            java.util.Collection r2 = (java.util.Collection) r2
            com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher r4 = r0.f32719p0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L9b
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L47:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r9.next()
            r4 = r2
            com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration r4 = (com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration) r4
            java.lang.String r4 = r4.getType()
            java.lang.String r5 = "message-card"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L47
            r10.add(r2)
            goto L47
        L64:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
            r4 = r8
            r2 = r9
            r9 = r10
        L70:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La4
            java.lang.Object r10 = r9.next()
            com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration r10 = (com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration) r10
            java.lang.String r5 = r10.getUrl()
            r6 = 0
            if (r5 != 0) goto L84
            goto L9e
        L84:
            com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher$c r7 = new com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher$c
            r7.<init>(r10, r5, r6)
            r0.f32719p0 = r4
            r10 = r2
            java.util.Collection r10 = (java.util.Collection) r10
            r0.f32720q0 = r10
            r0.f32721r0 = r9
            r0.f32724u0 = r3
            java.lang.Object r10 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r7, r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            r6 = r10
            kotlinx.coroutines.Deferred r6 = (kotlinx.coroutines.Deferred) r6
        L9e:
            if (r6 == 0) goto L70
            r2.add(r6)
            goto L70
        La4:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(LandingECommerceCardsModel landingECommerceCardsModel, List<? extends FetchResult<List<LandingMessageCardModel>>> list, UserProfileConfiguration userProfileConfiguration, Continuation<? super List<? extends LandingSection>> continuation) {
        ArrayList<FetchResult.Success> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj == null || (obj instanceof FetchResult.Success)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (FetchResult.Success success : arrayList) {
            List list2 = success != null ? (List) success.getValue() : null;
            if (list2 != null) {
                arrayList2.add(list2);
            }
        }
        return this.f32712c.pick(landingECommerceCardsModel, arrayList2, userProfileConfiguration, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object fetch(@NotNull UserProfileConfiguration userProfileConfiguration, @Nullable List<LandingSectionConfiguration> list, @NotNull Continuation<? super List<? extends LandingSection>> continuation) {
        a aVar;
        LandingSectionsFetcher landingSectionsFetcher;
        UserProfileConfiguration userProfileConfiguration2;
        Deferred deferred;
        List list2;
        Object objAwait;
        UserProfileConfiguration userProfileConfiguration3;
        LandingSectionsFetcher landingSectionsFetcher2;
        LandingECommerceCardsModel landingECommerceCardsModel;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f32718u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32718u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objCoroutineScope = aVar.f32716s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f32718u0;
        if (i11 != 0) {
            if (i11 == 1) {
                list = (List) aVar.f32715r0;
                userProfileConfiguration = (UserProfileConfiguration) aVar.f32714q0;
                landingSectionsFetcher = (LandingSectionsFetcher) aVar.f32713p0;
                ResultKt.throwOnFailure(objCoroutineScope);
            } else if (i11 == 2) {
                deferred = (Deferred) aVar.f32715r0;
                userProfileConfiguration2 = (UserProfileConfiguration) aVar.f32714q0;
                landingSectionsFetcher = (LandingSectionsFetcher) aVar.f32713p0;
                ResultKt.throwOnFailure(objCoroutineScope);
                list2 = (List) objCoroutineScope;
                aVar.f32713p0 = userProfileConfiguration2;
                aVar.f32714q0 = list2;
                aVar.f32715r0 = landingSectionsFetcher;
                aVar.f32718u0 = 3;
                objAwait = deferred.await(aVar);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                LandingSectionsFetcher landingSectionsFetcher3 = landingSectionsFetcher;
                userProfileConfiguration3 = userProfileConfiguration2;
                landingSectionsFetcher2 = landingSectionsFetcher3;
                landingECommerceCardsModel = (LandingECommerceCardsModel) objAwait;
                aVar.f32713p0 = userProfileConfiguration3;
                aVar.f32714q0 = landingSectionsFetcher2;
                aVar.f32715r0 = landingECommerceCardsModel;
                aVar.f32718u0 = 4;
                objCoroutineScope = AwaitKt.awaitAll(list2, aVar);
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar.f32713p0 = null;
                aVar.f32714q0 = null;
                aVar.f32715r0 = null;
                aVar.f32718u0 = 5;
                objCoroutineScope = landingSectionsFetcher2.b(landingECommerceCardsModel, (List) objCoroutineScope, userProfileConfiguration3, aVar);
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i11 == 3) {
                LandingSectionsFetcher landingSectionsFetcher4 = (LandingSectionsFetcher) aVar.f32715r0;
                List list3 = (List) aVar.f32714q0;
                userProfileConfiguration3 = (UserProfileConfiguration) aVar.f32713p0;
                ResultKt.throwOnFailure(objCoroutineScope);
                landingSectionsFetcher2 = landingSectionsFetcher4;
                objAwait = objCoroutineScope;
                list2 = list3;
                landingECommerceCardsModel = (LandingECommerceCardsModel) objAwait;
                aVar.f32713p0 = userProfileConfiguration3;
                aVar.f32714q0 = landingSectionsFetcher2;
                aVar.f32715r0 = landingECommerceCardsModel;
                aVar.f32718u0 = 4;
                objCoroutineScope = AwaitKt.awaitAll(list2, aVar);
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar.f32713p0 = null;
                aVar.f32714q0 = null;
                aVar.f32715r0 = null;
                aVar.f32718u0 = 5;
                objCoroutineScope = landingSectionsFetcher2.b(landingECommerceCardsModel, (List) objCoroutineScope, userProfileConfiguration3, aVar);
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i11 == 4) {
                landingECommerceCardsModel = (LandingECommerceCardsModel) aVar.f32715r0;
                landingSectionsFetcher2 = (LandingSectionsFetcher) aVar.f32714q0;
                userProfileConfiguration3 = (UserProfileConfiguration) aVar.f32713p0;
                ResultKt.throwOnFailure(objCoroutineScope);
                aVar.f32713p0 = null;
                aVar.f32714q0 = null;
                aVar.f32715r0 = null;
                aVar.f32718u0 = 5;
                objCoroutineScope = landingSectionsFetcher2.b(landingECommerceCardsModel, (List) objCoroutineScope, userProfileConfiguration3, aVar);
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCoroutineScope);
            }
            return objCoroutineScope;
        }
        ResultKt.throwOnFailure(objCoroutineScope);
        if (list == null) {
            return null;
        }
        aVar.f32713p0 = this;
        aVar.f32714q0 = userProfileConfiguration;
        aVar.f32715r0 = list;
        aVar.f32718u0 = 1;
        objCoroutineScope = CoroutineScopeKt.coroutineScope(new i9.a(this, list, null), aVar);
        if (objCoroutineScope == coroutine_suspended) {
            return coroutine_suspended;
        }
        landingSectionsFetcher = this;
        Deferred deferred2 = (Deferred) objCoroutineScope;
        aVar.f32713p0 = landingSectionsFetcher;
        aVar.f32714q0 = userProfileConfiguration;
        aVar.f32715r0 = deferred2;
        aVar.f32718u0 = 2;
        Object objA = landingSectionsFetcher.a(list, aVar);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        userProfileConfiguration2 = userProfileConfiguration;
        deferred = deferred2;
        objCoroutineScope = objA;
        list2 = (List) objCoroutineScope;
        aVar.f32713p0 = userProfileConfiguration2;
        aVar.f32714q0 = list2;
        aVar.f32715r0 = landingSectionsFetcher;
        aVar.f32718u0 = 3;
        objAwait = deferred.await(aVar);
        if (objAwait == coroutine_suspended) {
            return coroutine_suspended;
        }
        LandingSectionsFetcher landingSectionsFetcher5 = landingSectionsFetcher;
        userProfileConfiguration3 = userProfileConfiguration2;
        landingSectionsFetcher2 = landingSectionsFetcher5;
        landingECommerceCardsModel = (LandingECommerceCardsModel) objAwait;
        aVar.f32713p0 = userProfileConfiguration3;
        aVar.f32714q0 = landingSectionsFetcher2;
        aVar.f32715r0 = landingECommerceCardsModel;
        aVar.f32718u0 = 4;
        objCoroutineScope = AwaitKt.awaitAll(list2, aVar);
        if (objCoroutineScope == coroutine_suspended) {
            return coroutine_suspended;
        }
        aVar.f32713p0 = null;
        aVar.f32714q0 = null;
        aVar.f32715r0 = null;
        aVar.f32718u0 = 5;
        objCoroutineScope = landingSectionsFetcher2.b(landingECommerceCardsModel, (List) objCoroutineScope, userProfileConfiguration3, aVar);
        if (objCoroutineScope == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objCoroutineScope;
    }
}
