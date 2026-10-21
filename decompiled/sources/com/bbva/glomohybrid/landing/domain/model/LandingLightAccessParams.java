package com.bbva.glomohybrid.landing.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingLightAccessParams.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingLightAccessParams;", "", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "component1", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "component2", "userProfile", "header", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "getUserProfile", "()Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "b", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "getHeader", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "<init>", "(Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingLightAccessParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UserProfileConfiguration userProfile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LandingHeaderState header;

    public LandingLightAccessParams(@NotNull UserProfileConfiguration userProfile, @NotNull LandingHeaderState header) {
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        Intrinsics.checkNotNullParameter(header, "header");
        this.userProfile = userProfile;
        this.header = header;
    }

    public static /* synthetic */ LandingLightAccessParams copy$default(LandingLightAccessParams landingLightAccessParams, UserProfileConfiguration userProfileConfiguration, LandingHeaderState landingHeaderState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userProfileConfiguration = landingLightAccessParams.userProfile;
        }
        if ((i10 & 2) != 0) {
            landingHeaderState = landingLightAccessParams.header;
        }
        return landingLightAccessParams.copy(userProfileConfiguration, landingHeaderState);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserProfileConfiguration getUserProfile() {
        return this.userProfile;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LandingHeaderState getHeader() {
        return this.header;
    }

    @NotNull
    public final LandingLightAccessParams copy(@NotNull UserProfileConfiguration userProfile, @NotNull LandingHeaderState header) {
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        Intrinsics.checkNotNullParameter(header, "header");
        return new LandingLightAccessParams(userProfile, header);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingLightAccessParams)) {
            return false;
        }
        LandingLightAccessParams landingLightAccessParams = (LandingLightAccessParams) other;
        return Intrinsics.areEqual(this.userProfile, landingLightAccessParams.userProfile) && Intrinsics.areEqual(this.header, landingLightAccessParams.header);
    }

    @NotNull
    public final LandingHeaderState getHeader() {
        return this.header;
    }

    @NotNull
    public final UserProfileConfiguration getUserProfile() {
        return this.userProfile;
    }

    public int hashCode() {
        return this.header.hashCode() + (this.userProfile.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LandingLightAccessParams(userProfile=" + this.userProfile + ", header=" + this.header + ")";
    }
}
