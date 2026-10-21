package com.bbva.glomohybrid.landing.data.mapper;

import ad.d;
import com.bbva.component.dm.aem.data.model.AEMContent;
import com.bbva.component.dm.aem.data.model.AEMItem;
import com.bbva.component.dm.aem.mapper.AEMContentMapper;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingShortcutsAEMMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/mapper/LandingShortcutsAEMMapper;", "Lcom/bbva/glomohybrid/landing/data/mapper/LandingAEMContentMapper;", "Lcom/bbva/component/dm/aem/mapper/AEMContentMapper;", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", "Lcom/bbva/component/dm/aem/data/model/AEMContent;", "content", "map", "", "host", "<init>", "(Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingShortcutsAEMMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingShortcutsAEMMapper.kt\ncom/bbva/glomohybrid/landing/data/mapper/LandingShortcutsAEMMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1603#2,9:59\n1855#2:68\n1856#2:70\n1612#2:71\n1#3:69\n1#3:72\n*S KotlinDebug\n*F\n+ 1 LandingShortcutsAEMMapper.kt\ncom/bbva/glomohybrid/landing/data/mapper/LandingShortcutsAEMMapper\n*L\n26#1:59,9\n26#1:68\n26#1:70\n26#1:71\n26#1:69\n*E\n"})
public final class LandingShortcutsAEMMapper extends LandingAEMContentMapper implements AEMContentMapper<List<? extends LandingShortcutItemModel>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f32537a;

    public LandingShortcutsAEMMapper(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f32537a = host;
    }

    @Override // com.bbva.component.dm.aem.mapper.AEMContentMapper
    @Nullable
    public List<? extends LandingShortcutItemModel> map(@Nullable AEMContent content) {
        List<AEMItem> items;
        String strString;
        String strString2;
        String strString3;
        if (content == null || (items = content.getItems()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AEMItem aEMItem : items) {
            String strString4 = string(aEMItem.getElements(), "asset");
            String strF = strString4 == null ? null : d.f(new StringBuilder(), this.f32537a, strString4);
            LandingShortcutItemModel landingShortcutItemModel = (strF == null || (strString = string(aEMItem.getElements(), "linkAction")) == null || (strString2 = string(aEMItem.getElements(), "navigationType")) == null || (strString3 = string(aEMItem.getElements(), "linkText")) == null) ? null : new LandingShortcutItemModel(strString, strString2, strString3, strF, string(aEMItem.getElements(), "linkTargetProfile"), parsePriority(aEMItem.getElements()), parseConditions(aEMItem.getElements()), parseAnalytics(aEMItem.getElements()), string(aEMItem.getElements(), LandingAEMContentMapper.EPI_CAMPAIGN_NAME));
            if (landingShortcutItemModel != null) {
                arrayList.add(landingShortcutItemModel);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }
}
