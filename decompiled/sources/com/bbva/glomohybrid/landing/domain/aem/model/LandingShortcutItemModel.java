package com.bbva.glomohybrid.landing.domain.aem.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingShortcutItemModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b9\u0010:J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J}\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u001a\u0010\u0014\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\"¨\u0006;"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "", "component7", "", "component8", "component9", "route", "navigationType", "text", AuthConstants.IMAGE, "targetProfile", "priority", "conditions", LandingAEMContentMapper.ANALYTICS, LandingAEMContentMapper.EPI_CAMPAIGN_NAME, "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "i", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "j", "getNavigationType", "k", "getText", "l", "getImage", "m", "getTargetProfile", "n", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPriority", "()I", "o", "Ljava/util/List;", "getConditions", "()Ljava/util/List;", "p", "Ljava/util/Map;", "getAnalytics", "()Ljava/util/Map;", "q", "getEpiCampaignName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingShortcutItemModel extends LandingAEMModel {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String route;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String navigationType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String image;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final String targetProfile;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final int priority;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<String> conditions;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Map<String, String> analytics;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String epiCampaignName;

    public /* synthetic */ LandingShortcutItemModel(String str, String str2, String str3, String str4, String str5, int i10, List list, Map map, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, i10, (i11 & 64) != 0 ? null : list, (i11 & 128) != 0 ? null : map, (i11 & 256) != 0 ? null : str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNavigationType() {
        return this.navigationType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTargetProfile() {
        return this.targetProfile;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final List<String> component7() {
        return this.conditions;
    }

    @Nullable
    public final Map<String, String> component8() {
        return this.analytics;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEpiCampaignName() {
        return this.epiCampaignName;
    }

    @NotNull
    public final LandingShortcutItemModel copy(@NotNull String route, @NotNull String navigationType, @NotNull String text, @NotNull String image, @Nullable String targetProfile, int priority, @Nullable List<String> conditions, @Nullable Map<String, String> analytics, @Nullable String epiCampaignName) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        return new LandingShortcutItemModel(route, navigationType, text, image, targetProfile, priority, conditions, analytics, epiCampaignName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingShortcutItemModel)) {
            return false;
        }
        LandingShortcutItemModel landingShortcutItemModel = (LandingShortcutItemModel) other;
        return Intrinsics.areEqual(this.route, landingShortcutItemModel.route) && Intrinsics.areEqual(this.navigationType, landingShortcutItemModel.navigationType) && Intrinsics.areEqual(this.text, landingShortcutItemModel.text) && Intrinsics.areEqual(this.image, landingShortcutItemModel.image) && Intrinsics.areEqual(this.targetProfile, landingShortcutItemModel.targetProfile) && this.priority == landingShortcutItemModel.priority && Intrinsics.areEqual(this.conditions, landingShortcutItemModel.conditions) && Intrinsics.areEqual(this.analytics, landingShortcutItemModel.analytics) && Intrinsics.areEqual(this.epiCampaignName, landingShortcutItemModel.epiCampaignName);
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel
    @Nullable
    public Map<String, String> getAnalytics() {
        return this.analytics;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel
    @Nullable
    public List<String> getConditions() {
        return this.conditions;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel
    @Nullable
    /* JADX INFO: renamed from: getEpiCampaignName */
    public String getCom.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper.EPI_CAMPAIGN_NAME java.lang.String() {
        return this.epiCampaignName;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getNavigationType() {
        return this.navigationType;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel
    public int getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    @Nullable
    public final String getTargetProfile() {
        return this.targetProfile;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iC = n1.c(this.image, n1.c(this.text, n1.c(this.navigationType, this.route.hashCode() * 31, 31), 31), 31);
        String str = this.targetProfile;
        int iHashCode = (((iC + (str == null ? 0 : str.hashCode())) * 31) + this.priority) * 31;
        List<String> list = this.conditions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.analytics;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.epiCampaignName;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingShortcutItemModel(route=");
        sb2.append(this.route);
        sb2.append(", navigationType=");
        sb2.append(this.navigationType);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", targetProfile=");
        sb2.append(this.targetProfile);
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
    public LandingShortcutItemModel(@NotNull String route, @NotNull String navigationType, @NotNull String text, @NotNull String image, @Nullable String str, int i10, @Nullable List<String> list, @Nullable Map<String, String> map, @Nullable String str2) {
        super(0, null, null, null, 15, null);
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        this.route = route;
        this.navigationType = navigationType;
        this.text = text;
        this.image = image;
        this.targetProfile = str;
        this.priority = i10;
        this.conditions = list;
        this.analytics = map;
        this.epiCampaignName = str2;
    }
}
