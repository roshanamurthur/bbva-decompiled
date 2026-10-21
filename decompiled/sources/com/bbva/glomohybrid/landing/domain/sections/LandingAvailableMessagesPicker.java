package com.bbva.glomohybrid.landing.domain.sections;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomohybrid.landing.domain.sections.filters.LandingSectionsFeatureFlagsFilter;
import com.bbva.glomohybrid.landing.domain.sections.filters.LandingSectionsItemsNoDeletedFilter;
import com.bbva.glomohybrid.landing.domain.sections.filters.LandingSectionsTargetProfileFilter;
import com.google.android.gms.common.Scopes;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAvailableMessagesPicker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/LandingAvailableMessagesPicker;", "", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "messages", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "pickAvailableOnes", "(Ljava/util/List;Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingAEMConditionFilter;", "conditionsFilter", "Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsFeatureFlagsFilter;", "featureFlagsFilter", "Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsTargetProfileFilter;", "targetProfileFilter", "Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsItemsNoDeletedFilter;", "noDeletedItemsFilter", "<init>", "(Ljava/util/List;Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsFeatureFlagsFilter;Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsTargetProfileFilter;Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsItemsNoDeletedFilter;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingAvailableMessagesPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAvailableMessagesPicker.kt\ncom/bbva/glomohybrid/landing/domain/sections/LandingAvailableMessagesPicker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1603#2,9:55\n1855#2:64\n1856#2:66\n1612#2:67\n1045#2:69\n1726#2,3:70\n1#3:65\n1#3:68\n*S KotlinDebug\n*F\n+ 1 LandingAvailableMessagesPicker.kt\ncom/bbva/glomohybrid/landing/domain/sections/LandingAvailableMessagesPicker\n*L\n31#1:55,9\n31#1:64\n31#1:66\n31#1:67\n40#1:69\n51#1:70,3\n31#1:65\n*E\n"})
public final class LandingAvailableMessagesPicker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<LandingAEMConditionFilter> f32685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingSectionsFeatureFlagsFilter f32686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LandingSectionsTargetProfileFilter f32687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LandingSectionsItemsNoDeletedFilter f32688d;

    /* JADX INFO: compiled from: LandingAvailableMessagesPicker.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker", f = "LandingAvailableMessagesPicker.kt", i = {0, 0}, l = {51}, m = "meetAllConditionsFor", n = {"$this$meetAllConditionsFor", "user"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAEMModel f32689p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public RememberedUser f32690q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Iterator f32691r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f32692s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f32694u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32692s0 = obj;
            this.f32694u0 |= Integer.MIN_VALUE;
            return LandingAvailableMessagesPicker.this.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAvailableMessagesPicker.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker", f = "LandingAvailableMessagesPicker.kt", i = {0, 0, 0}, l = {31}, m = "pickAvailableOnes", n = {"this", Scopes.PROFILE, "destination$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAvailableMessagesPicker f32695p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public UserProfileConfiguration f32696q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Collection f32697r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Iterator f32698s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f32699t0;
        public int v0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32699t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return LandingAvailableMessagesPicker.this.pickAvailableOnes(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAvailableMessagesPicker.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker", f = "LandingAvailableMessagesPicker.kt", i = {0, 0}, l = {44}, m = "pickSectionItem", n = {"this", Scopes.PROFILE}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAvailableMessagesPicker f32701p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public UserProfileConfiguration f32702q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Iterator f32703r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Object f32704s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f32705t0;
        public int v0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32705t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return LandingAvailableMessagesPicker.this.b(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingAvailableMessagesPicker(@NotNull List<? extends LandingAEMConditionFilter> conditionsFilter, @NotNull LandingSectionsFeatureFlagsFilter featureFlagsFilter, @NotNull LandingSectionsTargetProfileFilter targetProfileFilter, @NotNull LandingSectionsItemsNoDeletedFilter noDeletedItemsFilter) {
        Intrinsics.checkNotNullParameter(conditionsFilter, "conditionsFilter");
        Intrinsics.checkNotNullParameter(featureFlagsFilter, "featureFlagsFilter");
        Intrinsics.checkNotNullParameter(targetProfileFilter, "targetProfileFilter");
        Intrinsics.checkNotNullParameter(noDeletedItemsFilter, "noDeletedItemsFilter");
        this.f32685a = conditionsFilter;
        this.f32686b = featureFlagsFilter;
        this.f32687c = targetProfileFilter;
        this.f32688d = noDeletedItemsFilter;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0074 -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel r6, com.bbva.glomo.user.domain.model.RememberedUser r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker.a
            if (r0 == 0) goto L13
            r0 = r8
            com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$a r0 = (com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker.a) r0
            int r1 = r0.f32694u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32694u0 = r1
            goto L18
        L13:
            com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$a r0 = new com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32692s0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f32694u0
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.util.Iterator r6 = r0.f32691r0
            com.bbva.glomo.user.domain.model.RememberedUser r7 = r0.f32690q0
            com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel r2 = r0.f32689p0
            kotlin.ResultKt.throwOnFailure(r8)
            r4 = r0
            r0 = r7
            r7 = r2
        L31:
            r2 = r1
            r1 = r4
            goto L78
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.List<com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter> r8 = r5.f32685a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L51
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L51
            goto L86
        L51:
            java.util.Iterator r8 = r8.iterator()
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
        L59:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r6.next()
            com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter r2 = (com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter) r2
            r0.f32689p0 = r7
            r0.f32690q0 = r8
            r0.f32691r0 = r6
            r0.f32694u0 = r3
            java.lang.Object r2 = r2.meetCondition(r7, r8, r0)
            if (r2 != r1) goto L74
            return r1
        L74:
            r4 = r0
            r0 = r8
            r8 = r2
            goto L31
        L78:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L82
            r3 = 0
            goto L86
        L82:
            r8 = r0
            r0 = r1
            r1 = r2
            goto L59
        L86:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker.a(com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel, com.bbva.glomo.user.domain.model.RememberedUser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:25:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:30:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List<com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel> r8, com.bbva.glomo.user.domain.model.UserProfileConfiguration r9, kotlin.coroutines.Continuation<? super com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker.c
            if (r0 == 0) goto L13
            r0 = r10
            com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$c r0 = (com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker.c) r0
            int r1 = r0.v0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v0 = r1
            goto L18
        L13:
            com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$c r0 = new com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f32705t0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.v0
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f32704s0
            java.util.Iterator r9 = r0.f32703r0
            com.bbva.glomo.user.domain.model.UserProfileConfiguration r2 = r0.f32702q0
            com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker r4 = r0.f32701p0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8d
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r10)
            com.bbva.glomohybrid.landing.domain.sections.filters.LandingSectionsItemsNoDeletedFilter r10 = r7.f32688d
            java.util.List r8 = r10.filterNoDeleted(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$pickSectionItem$$inlined$sortedBy$1 r10 = new com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$pickSectionItem$$inlined$sortedBy$1
            r10.<init>()
            java.util.List r8 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r8, r10)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r4 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L57:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L9f
            java.lang.Object r10 = r9.next()
            r2 = r10
            com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel r2 = (com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel) r2
            com.bbva.glomohybrid.landing.domain.sections.filters.LandingSectionsFeatureFlagsFilter r5 = r4.f32686b
            boolean r5 = r5.areFeaturesEnabled(r2)
            if (r5 == 0) goto L9b
            com.bbva.glomohybrid.landing.domain.sections.filters.LandingSectionsTargetProfileFilter r5 = r4.f32687c
            boolean r5 = r5.isTargetProfileAvailable(r2, r8)
            if (r5 == 0) goto L9b
            com.bbva.glomo.user.domain.model.RememberedUser r5 = r8.getRememberedUser()
            r0.f32701p0 = r4
            r0.f32702q0 = r8
            r0.f32703r0 = r9
            r0.f32704s0 = r10
            r0.v0 = r3
            java.lang.Object r2 = r4.a(r2, r5, r0)
            if (r2 != r1) goto L89
            return r1
        L89:
            r6 = r2
            r2 = r8
            r8 = r10
            r10 = r6
        L8d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L99
            r10 = r8
            r8 = r2
            r2 = r3
            goto L9c
        L99:
            r10 = r8
            r8 = r2
        L9b:
            r2 = 0
        L9c:
            if (r2 == 0) goto L57
            goto La0
        L9f:
            r10 = 0
        La0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker.b(java.util.List, com.bbva.glomo.user.domain.model.UserProfileConfiguration, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:21:0x0070). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object pickAvailableOnes(@org.jetbrains.annotations.NotNull java.util.List<? extends java.util.List<com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel>> r8, @org.jetbrains.annotations.NotNull com.bbva.glomo.user.domain.model.UserProfileConfiguration r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker.b
            if (r0 == 0) goto L13
            r0 = r10
            com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$b r0 = (com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker.b) r0
            int r1 = r0.v0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v0 = r1
            goto L18
        L13:
            com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$b r0 = new com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f32699t0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.v0
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.util.Iterator r8 = r0.f32698s0
            java.util.Collection r9 = r0.f32697r0
            java.util.Collection r9 = (java.util.Collection) r9
            com.bbva.glomo.user.domain.model.UserProfileConfiguration r2 = r0.f32696q0
            com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker r4 = r0.f32695p0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L70
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
            r4 = r7
            r6 = r10
            r10 = r9
            r9 = r6
        L4d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r8.next()
            java.util.List r2 = (java.util.List) r2
            r0.f32695p0 = r4
            r0.f32696q0 = r10
            r5 = r9
            java.util.Collection r5 = (java.util.Collection) r5
            r0.f32697r0 = r5
            r0.f32698s0 = r8
            r0.v0 = r3
            java.lang.Object r2 = r4.b(r2, r10, r0)
            if (r2 != r1) goto L6d
            return r1
        L6d:
            r6 = r2
            r2 = r10
            r10 = r6
        L70:
            com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel r10 = (com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel) r10
            if (r10 == 0) goto L77
            r9.add(r10)
        L77:
            r10 = r2
            goto L4d
        L79:
            java.util.List r9 = (java.util.List) r9
            r8 = r9
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r3
            if (r8 == 0) goto L86
            goto L87
        L86:
            r9 = 0
        L87:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.glomohybrid.landing.domain.sections.LandingAvailableMessagesPicker.pickAvailableOnes(java.util.List, com.bbva.glomo.user.domain.model.UserProfileConfiguration, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
