package com.bbva.glomohybrid.landing.data.mapper;

import ad.d;
import com.bbva.component.dm.aem.data.model.AEMContent;
import com.bbva.component.dm.aem.data.model.AEMItem;
import com.bbva.component.dm.aem.mapper.AEMContentMapper;
import com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardButtonModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardIllustrationModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingMessageCardAEMMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/mapper/LandingMessageCardAEMMapper;", "Lcom/bbva/glomohybrid/landing/data/mapper/LandingAEMContentMapper;", "Lcom/bbva/component/dm/aem/mapper/AEMContentMapper;", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "Lcom/bbva/component/dm/aem/data/model/AEMContent;", "content", "map", "", "host", "Lcom/bbva/component/dm/settings/domain/model/LandingSectionConfiguration;", "configuration", "<init>", "(Ljava/lang/String;Lcom/bbva/component/dm/settings/domain/model/LandingSectionConfiguration;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingMessageCardAEMMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingMessageCardAEMMapper.kt\ncom/bbva/glomohybrid/landing/data/mapper/LandingMessageCardAEMMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1603#2,9:139\n1855#2:148\n1856#2:150\n1612#2:151\n1#3:149\n1#3:152\n*S KotlinDebug\n*F\n+ 1 LandingMessageCardAEMMapper.kt\ncom/bbva/glomohybrid/landing/data/mapper/LandingMessageCardAEMMapper\n*L\n48#1:139,9\n48#1:148\n48#1:150\n48#1:151\n48#1:149\n*E\n"})
public final class LandingMessageCardAEMMapper extends LandingAEMContentMapper implements AEMContentMapper<List<? extends LandingMessageCardModel>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f32535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LandingSectionConfiguration f32536b;

    public LandingMessageCardAEMMapper(@NotNull String host, @NotNull LandingSectionConfiguration configuration) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f32535a = host;
        this.f32536b = configuration;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    @Override // com.bbva.component.dm.aem.mapper.AEMContentMapper
    @Nullable
    public List<? extends LandingMessageCardModel> map(@Nullable AEMContent content) {
        List<AEMItem> items;
        String strString;
        String strString2;
        String strString3;
        String strString4;
        String strString5;
        String strString6;
        String strString7;
        String strString8;
        String strString9;
        String strString10;
        String strString11;
        LandingMessageCardModel landingMessageCardModel;
        if (content == null || (items = content.getItems()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AEMItem aEMItem : items) {
            LandingSectionConfiguration landingSectionConfiguration = this.f32536b;
            String url = landingSectionConfiguration.getUrl();
            if (url == null || (strString = string(aEMItem.getElements(), "moduleType")) == null) {
                landingMessageCardModel = null;
            } else {
                Map<String, JsonElement> elements = aEMItem.getElements();
                String strString12 = string(elements, "imageType");
                LandingMessageCardIllustrationModel landingMessageCardIllustrationModel = (strString12 == null || (strString2 = string(elements, AuthConstants.IMAGE)) == null) ? null : new LandingMessageCardIllustrationModel(d.f(new StringBuilder(), this.f32535a, strString2), strString12);
                if (landingMessageCardIllustrationModel == null || (strString3 = string(aEMItem.getElements(), "secondaryText")) == null) {
                    landingMessageCardModel = null;
                } else {
                    String strString13 = string(aEMItem.getElements(), "title");
                    String strString14 = string(aEMItem.getElements(), "primaryText");
                    Map<String, JsonElement> elements2 = aEMItem.getElements();
                    String strString15 = string(elements2, "detailButtonText");
                    LandingMessageCardButtonModel landingMessageCardButtonModel = (strString15 == null || (strString4 = string(elements2, "detailButtonAction")) == null || (strString5 = string(elements2, "detailButtonNavigationType")) == null) ? null : new LandingMessageCardButtonModel(strString15, "LINK", strString4, strString5, string(elements2, "detailButtonDeeplinkParams"), string(elements2, "detailButtonTargetProfile"));
                    LandingMessageCardButtonModel[] landingMessageCardButtonModelArr = new LandingMessageCardButtonModel[2];
                    Map<String, JsonElement> elements3 = aEMItem.getElements();
                    String strString16 = string(elements3, "button1Text");
                    landingMessageCardButtonModelArr[0] = (strString16 == null || (strString6 = string(elements3, "button1Style")) == null || (strString7 = string(elements3, "button1Action")) == null || (strString8 = string(elements3, "button1NavigationType")) == null) ? null : new LandingMessageCardButtonModel(strString16, strString6, strString7, strString8, string(elements3, "button1DeeplinkParams"), string(elements3, "button1TargetProfile"));
                    Map<String, JsonElement> elements4 = aEMItem.getElements();
                    String strString17 = string(elements4, "button2Text");
                    landingMessageCardButtonModelArr[1] = (strString17 == null || (strString9 = string(elements4, "button2Style")) == null || (strString10 = string(elements4, "button2Action")) == null || (strString11 = string(elements4, "button2NavigationType")) == null) ? null : new LandingMessageCardButtonModel(strString17, strString9, strString10, strString11, string(elements4, "button2DeeplinkParams"), string(elements4, "button2TargetProfile"));
                    List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) landingMessageCardButtonModelArr);
                    landingMessageCardModel = new LandingMessageCardModel(url, landingSectionConfiguration.getPriority(), strString, strString13, landingMessageCardIllustrationModel, strString14, strString3, landingMessageCardButtonModel, listListOfNotNull.isEmpty() ^ true ? listListOfNotNull : null, parsePriority(aEMItem.getElements()), parseConditions(aEMItem.getElements()), parseAnalytics(aEMItem.getElements()), string(aEMItem.getElements(), LandingAEMContentMapper.EPI_CAMPAIGN_NAME));
                }
            }
            if (landingMessageCardModel != null) {
                arrayList.add(landingMessageCardModel);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }
}
