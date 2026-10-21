package com.bbva.glomohybrid.landing.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingHeaderModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003JQ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\rHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderModel;", "", "Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;", "component1", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", "component2", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "component3", "Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;", "component4", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderMessageModel;", "component5", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderFeatureFlagsModel;", "component6", "segment", "shortcuts", "avatar", "background", "message", "features", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;", "getSegment", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;", "b", "Ljava/util/List;", "getShortcuts", "()Ljava/util/List;", "c", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "getAvatar", "()Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "d", "Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;", "getBackground", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;", "e", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderMessageModel;", "getMessage", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderMessageModel;", "f", "Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderFeatureFlagsModel;", "getFeatures", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderFeatureFlagsModel;", "<init>", "(Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;Ljava/util/List;Lcom/bbva/glomohybrid/base/models/UserAvatarModel;Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderMessageModel;Lcom/bbva/glomohybrid/landing/domain/model/LandingHeaderFeatureFlagsModel;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingHeaderModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LandingUserSegment segment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<LandingShortcutItemModel> shortcuts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final UserAvatarModel avatar;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingBackground background;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LandingHeaderMessageModel message;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LandingHeaderFeatureFlagsModel features;

    public LandingHeaderModel(@NotNull LandingUserSegment segment, @NotNull List<LandingShortcutItemModel> shortcuts, @Nullable UserAvatarModel userAvatarModel, @Nullable LandingBackground landingBackground, @Nullable LandingHeaderMessageModel landingHeaderMessageModel, @NotNull LandingHeaderFeatureFlagsModel features) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(shortcuts, "shortcuts");
        Intrinsics.checkNotNullParameter(features, "features");
        this.segment = segment;
        this.shortcuts = shortcuts;
        this.avatar = userAvatarModel;
        this.background = landingBackground;
        this.message = landingHeaderMessageModel;
        this.features = features;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LandingHeaderModel copy$default(LandingHeaderModel landingHeaderModel, LandingUserSegment landingUserSegment, List list, UserAvatarModel userAvatarModel, LandingBackground landingBackground, LandingHeaderMessageModel landingHeaderMessageModel, LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            landingUserSegment = landingHeaderModel.segment;
        }
        if ((i10 & 2) != 0) {
            list = landingHeaderModel.shortcuts;
        }
        List list2 = list;
        if ((i10 & 4) != 0) {
            userAvatarModel = landingHeaderModel.avatar;
        }
        UserAvatarModel userAvatarModel2 = userAvatarModel;
        if ((i10 & 8) != 0) {
            landingBackground = landingHeaderModel.background;
        }
        LandingBackground landingBackground2 = landingBackground;
        if ((i10 & 16) != 0) {
            landingHeaderMessageModel = landingHeaderModel.message;
        }
        LandingHeaderMessageModel landingHeaderMessageModel2 = landingHeaderMessageModel;
        if ((i10 & 32) != 0) {
            landingHeaderFeatureFlagsModel = landingHeaderModel.features;
        }
        return landingHeaderModel.copy(landingUserSegment, list2, userAvatarModel2, landingBackground2, landingHeaderMessageModel2, landingHeaderFeatureFlagsModel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LandingUserSegment getSegment() {
        return this.segment;
    }

    @NotNull
    public final List<LandingShortcutItemModel> component2() {
        return this.shortcuts;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserAvatarModel getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LandingBackground getBackground() {
        return this.background;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LandingHeaderMessageModel getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LandingHeaderFeatureFlagsModel getFeatures() {
        return this.features;
    }

    @NotNull
    public final LandingHeaderModel copy(@NotNull LandingUserSegment segment, @NotNull List<LandingShortcutItemModel> shortcuts, @Nullable UserAvatarModel avatar, @Nullable LandingBackground background, @Nullable LandingHeaderMessageModel message, @NotNull LandingHeaderFeatureFlagsModel features) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(shortcuts, "shortcuts");
        Intrinsics.checkNotNullParameter(features, "features");
        return new LandingHeaderModel(segment, shortcuts, avatar, background, message, features);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingHeaderModel)) {
            return false;
        }
        LandingHeaderModel landingHeaderModel = (LandingHeaderModel) other;
        return Intrinsics.areEqual(this.segment, landingHeaderModel.segment) && Intrinsics.areEqual(this.shortcuts, landingHeaderModel.shortcuts) && Intrinsics.areEqual(this.avatar, landingHeaderModel.avatar) && Intrinsics.areEqual(this.background, landingHeaderModel.background) && Intrinsics.areEqual(this.message, landingHeaderModel.message) && Intrinsics.areEqual(this.features, landingHeaderModel.features);
    }

    @Nullable
    public final UserAvatarModel getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final LandingBackground getBackground() {
        return this.background;
    }

    @NotNull
    public final LandingHeaderFeatureFlagsModel getFeatures() {
        return this.features;
    }

    @Nullable
    public final LandingHeaderMessageModel getMessage() {
        return this.message;
    }

    @NotNull
    public final LandingUserSegment getSegment() {
        return this.segment;
    }

    @NotNull
    public final List<LandingShortcutItemModel> getShortcuts() {
        return this.shortcuts;
    }

    public int hashCode() {
        int iA = a.a(this.shortcuts, this.segment.hashCode() * 31, 31);
        UserAvatarModel userAvatarModel = this.avatar;
        int iHashCode = (iA + (userAvatarModel == null ? 0 : userAvatarModel.hashCode())) * 31;
        LandingBackground landingBackground = this.background;
        int iHashCode2 = (iHashCode + (landingBackground == null ? 0 : landingBackground.hashCode())) * 31;
        LandingHeaderMessageModel landingHeaderMessageModel = this.message;
        return this.features.hashCode() + ((iHashCode2 + (landingHeaderMessageModel != null ? landingHeaderMessageModel.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "LandingHeaderModel(segment=" + this.segment + ", shortcuts=" + this.shortcuts + ", avatar=" + this.avatar + ", background=" + this.background + ", message=" + this.message + ", features=" + this.features + ")";
    }

    public /* synthetic */ LandingHeaderModel(LandingUserSegment landingUserSegment, List list, UserAvatarModel userAvatarModel, LandingBackground landingBackground, LandingHeaderMessageModel landingHeaderMessageModel, LandingHeaderFeatureFlagsModel landingHeaderFeatureFlagsModel, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(landingUserSegment, list, (i10 & 4) != 0 ? null : userAvatarModel, (i10 & 8) != 0 ? null : landingBackground, (i10 & 16) != 0 ? null : landingHeaderMessageModel, (i10 & 32) != 0 ? new LandingHeaderFeatureFlagsModel() : landingHeaderFeatureFlagsModel);
    }
}
