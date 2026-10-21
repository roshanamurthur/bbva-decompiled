package com.bbva.glomohybrid.landing.domain.sections;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.google.android.gms.common.Scopes;
import dk.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSectionsPicker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/LandingSectionsPicker;", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardsModel;", "eCommerceCards", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "messages", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSection;", "pick", "(Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardsModel;Ljava/util/List;Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/landing/domain/sections/LandingECommerceCardsPicker;", "eCommerceCardsPicker", "Lcom/bbva/glomohybrid/landing/domain/sections/LandingAvailableMessagesPicker;", "messagesPicker", "<init>", "(Lcom/bbva/glomohybrid/landing/domain/sections/LandingECommerceCardsPicker;Lcom/bbva/glomohybrid/landing/domain/sections/LandingAvailableMessagesPicker;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingSectionsPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSectionsPicker.kt\ncom/bbva/glomohybrid/landing/domain/sections/LandingSectionsPicker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1#2:35\n1045#3:36\n*S KotlinDebug\n*F\n+ 1 LandingSectionsPicker.kt\ncom/bbva/glomohybrid/landing/domain/sections/LandingSectionsPicker\n*L\n30#1:36\n*E\n"})
public final class LandingSectionsPicker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingECommerceCardsPicker f32733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingAvailableMessagesPicker f32734b;

    /* JADX INFO: compiled from: LandingSectionsPicker.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingSectionsPicker", f = "LandingSectionsPicker.kt", i = {0, 0, 0}, l = {27}, m = "pick", n = {"this", "eCommerceCards", "sections"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingSectionsPicker f32735p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingECommerceCardsModel f32736q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public ArrayList f32737r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f32738s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f32740u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32738s0 = obj;
            this.f32740u0 |= Integer.MIN_VALUE;
            return LandingSectionsPicker.this.pick(null, null, null, this);
        }
    }

    public LandingSectionsPicker(@NotNull LandingECommerceCardsPicker eCommerceCardsPicker, @NotNull LandingAvailableMessagesPicker messagesPicker) {
        Intrinsics.checkNotNullParameter(eCommerceCardsPicker, "eCommerceCardsPicker");
        Intrinsics.checkNotNullParameter(messagesPicker, "messagesPicker");
        this.f32733a = eCommerceCardsPicker;
        this.f32734b = messagesPicker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object pick(@Nullable LandingECommerceCardsModel landingECommerceCardsModel, @NotNull List<? extends List<LandingMessageCardModel>> list, @NotNull UserProfileConfiguration userProfileConfiguration, @NotNull Continuation<? super List<? extends LandingSection>> continuation) {
        a aVar;
        LandingSectionsPicker landingSectionsPicker;
        LandingECommerceCardsModel landingECommerceCardsModel2;
        ArrayList arrayList;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f32740u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32740u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f32738s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f32740u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList2 = new ArrayList();
            aVar.f32735p0 = this;
            aVar.f32736q0 = landingECommerceCardsModel;
            aVar.f32737r0 = arrayList2;
            aVar.f32740u0 = 1;
            Object objPickAvailableOnes = this.f32734b.pickAvailableOnes(list, userProfileConfiguration, aVar);
            if (objPickAvailableOnes == coroutine_suspended) {
                return coroutine_suspended;
            }
            landingSectionsPicker = this;
            landingECommerceCardsModel2 = landingECommerceCardsModel;
            arrayList = arrayList2;
            obj = objPickAvailableOnes;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = aVar.f32737r0;
            landingECommerceCardsModel2 = aVar.f32736q0;
            landingSectionsPicker = aVar.f32735p0;
            ResultKt.throwOnFailure(obj);
        }
        List list2 = (List) obj;
        if (list2 != null) {
            Boxing.boxBoolean(arrayList.addAll(list2));
        }
        LandingECommerceCardsModel landingECommerceCardsModelPickIfIsAvailable = landingSectionsPicker.f32733a.pickIfIsAvailable(landingECommerceCardsModel2);
        if (landingECommerceCardsModelPickIfIsAvailable != null) {
            Boxing.boxBoolean(arrayList.add(landingECommerceCardsModelPickIfIsAvailable));
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.bbva.glomohybrid.landing.domain.sections.LandingSectionsPicker$pick$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(Integer.valueOf(((LandingSection) t10).getSectionPriority()), Integer.valueOf(((LandingSection) t11).getSectionPriority()));
            }
        });
        if (!listSortedWith.isEmpty()) {
            return listSortedWith;
        }
        return null;
    }
}
