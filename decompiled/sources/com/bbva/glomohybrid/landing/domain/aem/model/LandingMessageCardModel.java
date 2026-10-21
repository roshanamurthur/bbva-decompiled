package com.bbva.glomohybrid.landing.domain.aem.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingMessageCardModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0086\b\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB\u009b\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bP\u0010QJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00132\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0018\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-R\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010-R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u001f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\bG\u00101R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010ER(\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010+\u001a\u0004\bO\u0010-¨\u0006S"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSection;", "", "component1", "", "component2", "component3", "component4", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardIllustrationModel;", "component5", "component6", "component7", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;", "component8", "", "component9", "component10", "component11", "", "component12", "component13", "id", "sectionPriority", "type", "header", "illustration", "title", "description", DynamicLink.Builder.KEY_LINK, "buttons", "priority", "conditions", LandingAEMContentMapper.ANALYTICS, LandingAEMContentMapper.EPI_CAMPAIGN_NAME, "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "i", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "j", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSectionPriority", "()I", "k", "getType", "l", "getHeader", "m", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardIllustrationModel;", "getIllustration", "()Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardIllustrationModel;", "n", "getTitle", "o", "getDescription", "p", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;", "getLink", "()Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;", "q", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "r", "getPriority", "s", "getConditions", "t", "Ljava/util/Map;", "getAnalytics", "()Ljava/util/Map;", "u", "getEpiCampaignName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardIllustrationModel;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;Ljava/util/List;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingMessageCardModel extends LandingAEMModel implements LandingSection {

    @NotNull
    public static final String SECTION_TYPE = "message-card";

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int sectionPriority;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String header;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final LandingMessageCardIllustrationModel illustration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String title;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingMessageCardButtonModel link;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<LandingMessageCardButtonModel> buttons;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final int priority;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<String> conditions;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Map<String, String> analytics;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String epiCampaignName;

    public /* synthetic */ LandingMessageCardModel(String str, int i10, String str2, String str3, LandingMessageCardIllustrationModel landingMessageCardIllustrationModel, String str4, String str5, LandingMessageCardButtonModel landingMessageCardButtonModel, List list, int i11, List list2, Map map, String str6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, str3, landingMessageCardIllustrationModel, str4, str5, landingMessageCardButtonModel, list, i11, (i12 & 1024) != 0 ? null : list2, (i12 & 2048) != 0 ? null : map, (i12 & 4096) != 0 ? null : str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final List<String> component11() {
        return this.conditions;
    }

    @Nullable
    public final Map<String, String> component12() {
        return this.analytics;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getEpiCampaignName() {
        return this.epiCampaignName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSectionPriority() {
        return this.sectionPriority;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LandingMessageCardIllustrationModel getIllustration() {
        return this.illustration;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LandingMessageCardButtonModel getLink() {
        return this.link;
    }

    @Nullable
    public final List<LandingMessageCardButtonModel> component9() {
        return this.buttons;
    }

    @NotNull
    public final LandingMessageCardModel copy(@NotNull String id, int sectionPriority, @NotNull String type, @Nullable String header, @NotNull LandingMessageCardIllustrationModel illustration, @Nullable String title, @NotNull String description, @Nullable LandingMessageCardButtonModel link, @Nullable List<LandingMessageCardButtonModel> buttons, int priority, @Nullable List<String> conditions, @Nullable Map<String, String> analytics, @Nullable String epiCampaignName) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(illustration, "illustration");
        Intrinsics.checkNotNullParameter(description, "description");
        return new LandingMessageCardModel(id, sectionPriority, type, header, illustration, title, description, link, buttons, priority, conditions, analytics, epiCampaignName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingMessageCardModel)) {
            return false;
        }
        LandingMessageCardModel landingMessageCardModel = (LandingMessageCardModel) other;
        return Intrinsics.areEqual(this.id, landingMessageCardModel.id) && this.sectionPriority == landingMessageCardModel.sectionPriority && Intrinsics.areEqual(this.type, landingMessageCardModel.type) && Intrinsics.areEqual(this.header, landingMessageCardModel.header) && Intrinsics.areEqual(this.illustration, landingMessageCardModel.illustration) && Intrinsics.areEqual(this.title, landingMessageCardModel.title) && Intrinsics.areEqual(this.description, landingMessageCardModel.description) && Intrinsics.areEqual(this.link, landingMessageCardModel.link) && Intrinsics.areEqual(this.buttons, landingMessageCardModel.buttons) && this.priority == landingMessageCardModel.priority && Intrinsics.areEqual(this.conditions, landingMessageCardModel.conditions) && Intrinsics.areEqual(this.analytics, landingMessageCardModel.analytics) && Intrinsics.areEqual(this.epiCampaignName, landingMessageCardModel.epiCampaignName);
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel
    @Nullable
    public Map<String, String> getAnalytics() {
        return this.analytics;
    }

    @Nullable
    public final List<LandingMessageCardButtonModel> getButtons() {
        return this.buttons;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel
    @Nullable
    public List<String> getConditions() {
        return this.conditions;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel
    @Nullable
    /* JADX INFO: renamed from: getEpiCampaignName */
    public String getCom.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper.EPI_CAMPAIGN_NAME java.lang.String() {
        return this.epiCampaignName;
    }

    @Nullable
    public final String getHeader() {
        return this.header;
    }

    @Override // com.bbva.glomohybrid.landing.domain.sections.model.LandingSection
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final LandingMessageCardIllustrationModel getIllustration() {
        return this.illustration;
    }

    @Nullable
    public final LandingMessageCardButtonModel getLink() {
        return this.link;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel
    public int getPriority() {
        return this.priority;
    }

    @Override // com.bbva.glomohybrid.landing.domain.sections.model.LandingSection
    public int getSectionPriority() {
        return this.sectionPriority;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = n1.c(this.type, ((this.id.hashCode() * 31) + this.sectionPriority) * 31, 31);
        String str = this.header;
        int iHashCode = (this.illustration.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.title;
        int iC2 = n1.c(this.description, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        LandingMessageCardButtonModel landingMessageCardButtonModel = this.link;
        int iHashCode2 = (iC2 + (landingMessageCardButtonModel == null ? 0 : landingMessageCardButtonModel.hashCode())) * 31;
        List<LandingMessageCardButtonModel> list = this.buttons;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.priority) * 31;
        List<String> list2 = this.conditions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, String> map = this.analytics;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.epiCampaignName;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingMessageCardModel(id=");
        sb2.append(this.id);
        sb2.append(", sectionPriority=");
        sb2.append(this.sectionPriority);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", illustration=");
        sb2.append(this.illustration);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", priority=");
        sb2.append(this.priority);
        sb2.append(", conditions=");
        sb2.append(this.conditions);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", epiCampaignName=");
        return d.f(sb2, this.epiCampaignName, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandingMessageCardModel(@NotNull String id, int i10, @NotNull String type, @Nullable String str, @NotNull LandingMessageCardIllustrationModel illustration, @Nullable String str2, @NotNull String description, @Nullable LandingMessageCardButtonModel landingMessageCardButtonModel, @Nullable List<LandingMessageCardButtonModel> list, int i11, @Nullable List<String> list2, @Nullable Map<String, String> map, @Nullable String str3) {
        super(0, null, null, null, 15, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(illustration, "illustration");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = id;
        this.sectionPriority = i10;
        this.type = type;
        this.header = str;
        this.illustration = illustration;
        this.title = str2;
        this.description = description;
        this.link = landingMessageCardButtonModel;
        this.buttons = list;
        this.priority = i11;
        this.conditions = list2;
        this.analytics = map;
        this.epiCampaignName = str3;
    }
}
