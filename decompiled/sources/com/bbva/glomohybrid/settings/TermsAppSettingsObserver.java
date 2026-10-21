package com.bbva.glomohybrid.settings;

import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.TermsAndConditionsDataModel;
import com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver;
import com.bbva.glomohybrid.documents.common.model.TermsDataModel;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TermsAppSettingsObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/settings/TermsAppSettingsObserver;", "Lcom/bbva/component/dm/settings/domain/usecase/AppSettingsObserver;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "appSettingsResult", "", "onReceive", "Lcom/bbva/glomohybrid/documents/component/TermsDataManager;", "termsDataManager", "<init>", "(Lcom/bbva/glomohybrid/documents/component/TermsDataManager;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTermsAppSettingsObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TermsAppSettingsObserver.kt\ncom/bbva/glomohybrid/settings/TermsAppSettingsObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n*S KotlinDebug\n*F\n+ 1 TermsAppSettingsObserver.kt\ncom/bbva/glomohybrid/settings/TermsAppSettingsObserver\n*L\n16#1:21\n16#1:22,3\n*E\n"})
public final class TermsAppSettingsObserver implements AppSettingsObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final TermsDataManager f34468p0;

    public TermsAppSettingsObserver(@NotNull TermsDataManager termsDataManager) {
        Intrinsics.checkNotNullParameter(termsDataManager, "termsDataManager");
        this.f34468p0 = termsDataManager;
    }

    @Override // com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver
    public void onReceive(@NotNull AppSettingsResult appSettingsResult) {
        Intrinsics.checkNotNullParameter(appSettingsResult, "appSettingsResult");
        List<TermsAndConditionsDataModel> terms = appSettingsResult.getData().getTerms();
        if (terms == null) {
            terms = CollectionsKt__CollectionsKt.emptyList();
        }
        List<TermsAndConditionsDataModel> list = terms;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TermsAndConditionsDataModel termsAndConditionsDataModel : list) {
            arrayList.add(new TermsDataModel(termsAndConditionsDataModel.getId(), termsAndConditionsDataModel.getName()));
        }
        this.f34468p0.saveTerms(arrayList);
    }
}
