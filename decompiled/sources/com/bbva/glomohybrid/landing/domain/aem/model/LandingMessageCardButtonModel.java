package com.bbva.glomohybrid.landing.domain.aem.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingMessageCardButtonModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003JI\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006&"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "text", "style", "action", "navigationType", "navigationParams", "targetProfile", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "getStyle", "c", "getAction", "d", "getNavigationType", "e", "getNavigationParams", "f", "getTargetProfile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingMessageCardButtonModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String action;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String navigationType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String navigationParams;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String targetProfile;

    public LandingMessageCardButtonModel(@NotNull String text, @NotNull String style, @NotNull String action, @NotNull String navigationType, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        this.text = text;
        this.style = style;
        this.action = action;
        this.navigationType = navigationType;
        this.navigationParams = str;
        this.targetProfile = str2;
    }

    public static /* synthetic */ LandingMessageCardButtonModel copy$default(LandingMessageCardButtonModel landingMessageCardButtonModel, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = landingMessageCardButtonModel.text;
        }
        if ((i10 & 2) != 0) {
            str2 = landingMessageCardButtonModel.style;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = landingMessageCardButtonModel.action;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = landingMessageCardButtonModel.navigationType;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = landingMessageCardButtonModel.navigationParams;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = landingMessageCardButtonModel.targetProfile;
        }
        return landingMessageCardButtonModel.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNavigationType() {
        return this.navigationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNavigationParams() {
        return this.navigationParams;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTargetProfile() {
        return this.targetProfile;
    }

    @NotNull
    public final LandingMessageCardButtonModel copy(@NotNull String text, @NotNull String style, @NotNull String action, @NotNull String navigationType, @Nullable String navigationParams, @Nullable String targetProfile) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        return new LandingMessageCardButtonModel(text, style, action, navigationType, navigationParams, targetProfile);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingMessageCardButtonModel)) {
            return false;
        }
        LandingMessageCardButtonModel landingMessageCardButtonModel = (LandingMessageCardButtonModel) other;
        return Intrinsics.areEqual(this.text, landingMessageCardButtonModel.text) && Intrinsics.areEqual(this.style, landingMessageCardButtonModel.style) && Intrinsics.areEqual(this.action, landingMessageCardButtonModel.action) && Intrinsics.areEqual(this.navigationType, landingMessageCardButtonModel.navigationType) && Intrinsics.areEqual(this.navigationParams, landingMessageCardButtonModel.navigationParams) && Intrinsics.areEqual(this.targetProfile, landingMessageCardButtonModel.targetProfile);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getNavigationParams() {
        return this.navigationParams;
    }

    @NotNull
    public final String getNavigationType() {
        return this.navigationType;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
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
        int iC = n1.c(this.navigationType, n1.c(this.action, n1.c(this.style, this.text.hashCode() * 31, 31), 31), 31);
        String str = this.navigationParams;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetProfile;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingMessageCardButtonModel(text=");
        sb2.append(this.text);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", navigationType=");
        sb2.append(this.navigationType);
        sb2.append(", navigationParams=");
        sb2.append(this.navigationParams);
        sb2.append(", targetProfile=");
        return d.f(sb2, this.targetProfile, ")");
    }

    public /* synthetic */ LandingMessageCardButtonModel(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6);
    }
}
