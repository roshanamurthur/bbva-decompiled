package com.bbva.glomohybrid.landing.domain.model;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingRequestHeaderParams.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingRequestHeaderParams;", "", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "component1", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "component2", "", "component3", "appState", "userConfiguration", "fromProfileChange", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "getAppState", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "b", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "getUserConfiguration", "()Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "c", "Z", "getFromProfileChange", "()Z", "<init>", "(Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Z)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingRequestHeaderParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LandingAppAccess appState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UserProfileConfiguration userConfiguration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean fromProfileChange;

    public LandingRequestHeaderParams(@NotNull LandingAppAccess appState, @NotNull UserProfileConfiguration userConfiguration, boolean z10) {
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(userConfiguration, "userConfiguration");
        this.appState = appState;
        this.userConfiguration = userConfiguration;
        this.fromProfileChange = z10;
    }

    public static /* synthetic */ LandingRequestHeaderParams copy$default(LandingRequestHeaderParams landingRequestHeaderParams, LandingAppAccess landingAppAccess, UserProfileConfiguration userProfileConfiguration, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            landingAppAccess = landingRequestHeaderParams.appState;
        }
        if ((i10 & 2) != 0) {
            userProfileConfiguration = landingRequestHeaderParams.userConfiguration;
        }
        if ((i10 & 4) != 0) {
            z10 = landingRequestHeaderParams.fromProfileChange;
        }
        return landingRequestHeaderParams.copy(landingAppAccess, userProfileConfiguration, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LandingAppAccess getAppState() {
        return this.appState;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserProfileConfiguration getUserConfiguration() {
        return this.userConfiguration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFromProfileChange() {
        return this.fromProfileChange;
    }

    @NotNull
    public final LandingRequestHeaderParams copy(@NotNull LandingAppAccess appState, @NotNull UserProfileConfiguration userConfiguration, boolean fromProfileChange) {
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(userConfiguration, "userConfiguration");
        return new LandingRequestHeaderParams(appState, userConfiguration, fromProfileChange);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingRequestHeaderParams)) {
            return false;
        }
        LandingRequestHeaderParams landingRequestHeaderParams = (LandingRequestHeaderParams) other;
        return Intrinsics.areEqual(this.appState, landingRequestHeaderParams.appState) && Intrinsics.areEqual(this.userConfiguration, landingRequestHeaderParams.userConfiguration) && this.fromProfileChange == landingRequestHeaderParams.fromProfileChange;
    }

    @NotNull
    public final LandingAppAccess getAppState() {
        return this.appState;
    }

    public final boolean getFromProfileChange() {
        return this.fromProfileChange;
    }

    @NotNull
    public final UserProfileConfiguration getUserConfiguration() {
        return this.userConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public int hashCode() {
        int iHashCode = (this.userConfiguration.hashCode() + (this.appState.hashCode() * 31)) * 31;
        boolean z10 = this.fromProfileChange;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingRequestHeaderParams(appState=");
        sb2.append(this.appState);
        sb2.append(", userConfiguration=");
        sb2.append(this.userConfiguration);
        sb2.append(", fromProfileChange=");
        return i.c(sb2, this.fromProfileChange, ")");
    }
}
