package com.bbva.component.dm.settings.domain.model;

import androidx.appcompat.app.i;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.common.Scopes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\bF\u0010GJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u008f\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u0012HÆ\u0001J\t\u0010 \u001a\u00020\u0002HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0013\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u001e\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/LandingConfiguration;", "", "", "component1", "component2", "component3", "component4", "", "component5", "component6", "component7", "Lcom/bbva/component/dm/settings/domain/model/LandingHeaderTypesConfiguration;", "component8", "Lcom/bbva/component/dm/settings/domain/model/LandingBackgrounds;", "component9", "", "Lcom/bbva/component/dm/settings/domain/model/LandingSectionConfiguration;", "component10", "", "component11", Scopes.PROFILE, "segment", AnalyticsConstants.Key.SEGMENT_DESCRIPTION, LandingAEMContentMapper.CONDITION, "priority", "avatar", "shortcuts", "header", "background", "sections", "lightAccess", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getProfile", "()Ljava/lang/String;", "b", "getSegment", "c", "getSegmentDescription", "d", "getCondition", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPriority", "()I", "f", "getAvatar", "g", "getShortcuts", "h", "Lcom/bbva/component/dm/settings/domain/model/LandingHeaderTypesConfiguration;", "getHeader", "()Lcom/bbva/component/dm/settings/domain/model/LandingHeaderTypesConfiguration;", "i", "Lcom/bbva/component/dm/settings/domain/model/LandingBackgrounds;", "getBackground", "()Lcom/bbva/component/dm/settings/domain/model/LandingBackgrounds;", "j", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "k", "Z", "getLightAccess", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/settings/domain/model/LandingHeaderTypesConfiguration;Lcom/bbva/component/dm/settings/domain/model/LandingBackgrounds;Ljava/util/List;Z)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String profile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String segment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String segmentDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String condition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int priority;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String avatar;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String shortcuts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingHeaderTypesConfiguration header;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingBackgrounds background;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<LandingSectionConfiguration> sections;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean lightAccess;

    public LandingConfiguration(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i10, @Nullable String str5, @Nullable String str6, @Nullable LandingHeaderTypesConfiguration landingHeaderTypesConfiguration, @Nullable LandingBackgrounds landingBackgrounds, @Nullable List<LandingSectionConfiguration> list, boolean z10) {
        this.profile = str;
        this.segment = str2;
        this.segmentDescription = str3;
        this.condition = str4;
        this.priority = i10;
        this.avatar = str5;
        this.shortcuts = str6;
        this.header = landingHeaderTypesConfiguration;
        this.background = landingBackgrounds;
        this.sections = list;
        this.lightAccess = z10;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProfile() {
        return this.profile;
    }

    @Nullable
    public final List<LandingSectionConfiguration> component10() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getLightAccess() {
        return this.lightAccess;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSegment() {
        return this.segment;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSegmentDescription() {
        return this.segmentDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCondition() {
        return this.condition;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getShortcuts() {
        return this.shortcuts;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LandingHeaderTypesConfiguration getHeader() {
        return this.header;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final LandingBackgrounds getBackground() {
        return this.background;
    }

    @NotNull
    public final LandingConfiguration copy(@Nullable String profile, @Nullable String segment, @Nullable String segmentDescription, @Nullable String condition, int priority, @Nullable String avatar, @Nullable String shortcuts, @Nullable LandingHeaderTypesConfiguration header, @Nullable LandingBackgrounds background, @Nullable List<LandingSectionConfiguration> sections, boolean lightAccess) {
        return new LandingConfiguration(profile, segment, segmentDescription, condition, priority, avatar, shortcuts, header, background, sections, lightAccess);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingConfiguration)) {
            return false;
        }
        LandingConfiguration landingConfiguration = (LandingConfiguration) other;
        return Intrinsics.areEqual(this.profile, landingConfiguration.profile) && Intrinsics.areEqual(this.segment, landingConfiguration.segment) && Intrinsics.areEqual(this.segmentDescription, landingConfiguration.segmentDescription) && Intrinsics.areEqual(this.condition, landingConfiguration.condition) && this.priority == landingConfiguration.priority && Intrinsics.areEqual(this.avatar, landingConfiguration.avatar) && Intrinsics.areEqual(this.shortcuts, landingConfiguration.shortcuts) && Intrinsics.areEqual(this.header, landingConfiguration.header) && Intrinsics.areEqual(this.background, landingConfiguration.background) && Intrinsics.areEqual(this.sections, landingConfiguration.sections) && this.lightAccess == landingConfiguration.lightAccess;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final LandingBackgrounds getBackground() {
        return this.background;
    }

    @Nullable
    public final String getCondition() {
        return this.condition;
    }

    @Nullable
    public final LandingHeaderTypesConfiguration getHeader() {
        return this.header;
    }

    public final boolean getLightAccess() {
        return this.lightAccess;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getProfile() {
        return this.profile;
    }

    @Nullable
    public final List<LandingSectionConfiguration> getSections() {
        return this.sections;
    }

    @Nullable
    public final String getSegment() {
        return this.segment;
    }

    @Nullable
    public final String getSegmentDescription() {
        return this.segmentDescription;
    }

    @Nullable
    public final String getShortcuts() {
        return this.shortcuts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    public int hashCode() {
        String str = this.profile;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.segment;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.segmentDescription;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.condition;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.priority) * 31;
        String str5 = this.avatar;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.shortcuts;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LandingHeaderTypesConfiguration landingHeaderTypesConfiguration = this.header;
        int iHashCode7 = (iHashCode6 + (landingHeaderTypesConfiguration == null ? 0 : landingHeaderTypesConfiguration.hashCode())) * 31;
        LandingBackgrounds landingBackgrounds = this.background;
        int iHashCode8 = (iHashCode7 + (landingBackgrounds == null ? 0 : landingBackgrounds.hashCode())) * 31;
        List<LandingSectionConfiguration> list = this.sections;
        int iHashCode9 = (iHashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z10 = this.lightAccess;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode9 + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingConfiguration(profile=");
        sb2.append(this.profile);
        sb2.append(", segment=");
        sb2.append(this.segment);
        sb2.append(", segmentDescription=");
        sb2.append(this.segmentDescription);
        sb2.append(", condition=");
        sb2.append(this.condition);
        sb2.append(", priority=");
        sb2.append(this.priority);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", shortcuts=");
        sb2.append(this.shortcuts);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", sections=");
        sb2.append(this.sections);
        sb2.append(", lightAccess=");
        return i.c(sb2, this.lightAccess, ")");
    }

    public /* synthetic */ LandingConfiguration(String str, String str2, String str3, String str4, int i10, String str5, String str6, LandingHeaderTypesConfiguration landingHeaderTypesConfiguration, LandingBackgrounds landingBackgrounds, List list, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i10, str5, str6, landingHeaderTypesConfiguration, landingBackgrounds, (i11 & 512) != 0 ? null : list, z10);
    }
}
