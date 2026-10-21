package com.bbva.glomohybrid.landing.domain.sections.filters;

import com.bbva.glomohybrid.landing.data.model.LandingSectionDeletedDataModel;
import com.bbva.glomohybrid.landing.data.model.LandingSectionItemDeletedDataModel;
import com.bbva.glomohybrid.landing.data.repository.LandingSectionsDeletedRepository;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingMessageCardModelExtensionsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingSectionsItemsNoDeletedFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsItemsNoDeletedFilter;", "", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", FirebaseAnalytics.Param.ITEMS, "filterNoDeleted", "Lcom/bbva/glomohybrid/landing/data/repository/LandingSectionsDeletedRepository;", "repository", "<init>", "(Lcom/bbva/glomohybrid/landing/data/repository/LandingSectionsDeletedRepository;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingSectionsItemsNoDeletedFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSectionsItemsNoDeletedFilter.kt\ncom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsItemsNoDeletedFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,19:1\n1549#2:20\n1620#2,3:21\n766#2:24\n857#2,2:25\n*S KotlinDebug\n*F\n+ 1 LandingSectionsItemsNoDeletedFilter.kt\ncom/bbva/glomohybrid/landing/domain/sections/filters/LandingSectionsItemsNoDeletedFilter\n*L\n14#1:20\n14#1:21,3\n16#1:24\n16#1:25,2\n*E\n"})
public final class LandingSectionsItemsNoDeletedFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LandingSectionsDeletedRepository f32745a;

    public LandingSectionsItemsNoDeletedFilter(@NotNull LandingSectionsDeletedRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f32745a = repository;
    }

    @NotNull
    public final List<LandingMessageCardModel> filterNoDeleted(@NotNull List<LandingMessageCardModel> items) {
        String id;
        LandingSectionDeletedDataModel deletedSectionData;
        List<LandingSectionItemDeletedDataModel> items2;
        Intrinsics.checkNotNullParameter(items, "items");
        LandingMessageCardModel landingMessageCardModel = (LandingMessageCardModel) CollectionsKt___CollectionsKt.firstOrNull((List) items);
        if (landingMessageCardModel == null || (id = landingMessageCardModel.getId()) == null || (deletedSectionData = this.f32745a.getDeletedSectionData(id)) == null || (items2 = deletedSectionData.getItems()) == null) {
            return items;
        }
        List<LandingSectionItemDeletedDataModel> list = items2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LandingSectionItemDeletedDataModel) it.next()).getHash());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : items) {
            if (!arrayList.contains(LandingMessageCardModelExtensionsKt.hash((LandingMessageCardModel) obj))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
