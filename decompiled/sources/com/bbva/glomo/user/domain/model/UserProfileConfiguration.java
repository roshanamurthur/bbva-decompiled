package com.bbva.glomo.user.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingEnterpriseProfileConditionFilter;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserProfileConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b'\u0010(J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016¨\u0006)"}, d2 = {"Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "component1", "rememberedUser", "Lcom/bbva/glomo/user/domain/model/UserType;", "userType", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "getRememberedUser", "()Lcom/bbva/glomo/user/domain/model/RememberedUser;", "c", "Z", "isDigitalTokenEnabled", "()Z", "setDigitalTokenEnabled", "(Z)V", "d", "isMobilePaymentEnabled", "setMobilePaymentEnabled", "getName", "()Ljava/lang/String;", "name", "getSecondName", "secondName", "getFullName", IAppSDKPlus.EXTRA_KEY_SIGN_UP_FULL_NAME, "getType", "()Lcom/bbva/glomo/user/domain/model/UserType;", "type", LandingEnterpriseProfileConditionFilter.ID, "<init>", "(Lcom/bbva/glomo/user/domain/model/RememberedUser;Lcom/bbva/glomo/user/domain/model/UserType;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class UserProfileConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final RememberedUser rememberedUser;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final UserType f30799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isDigitalTokenEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isMobilePaymentEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserProfileConfiguration copy$default(UserProfileConfiguration userProfileConfiguration, RememberedUser rememberedUser, UserType userType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rememberedUser = userProfileConfiguration.rememberedUser;
        }
        if ((i10 & 2) != 0) {
            userType = userProfileConfiguration.f30799b;
        }
        return userProfileConfiguration.copy(rememberedUser, userType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RememberedUser getRememberedUser() {
        return this.rememberedUser;
    }

    @NotNull
    public final UserProfileConfiguration copy(@Nullable RememberedUser rememberedUser, @Nullable UserType userType) {
        return new UserProfileConfiguration(rememberedUser, userType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfileConfiguration)) {
            return false;
        }
        UserProfileConfiguration userProfileConfiguration = (UserProfileConfiguration) other;
        return Intrinsics.areEqual(this.rememberedUser, userProfileConfiguration.rememberedUser) && this.f30799b == userProfileConfiguration.f30799b;
    }

    @Nullable
    public final String getFullName() {
        RememberedUser rememberedUser = this.rememberedUser;
        if (rememberedUser != null) {
            return rememberedUser.getFullName();
        }
        return null;
    }

    @Nullable
    public final String getName() {
        RememberedUser rememberedUser = this.rememberedUser;
        if (rememberedUser != null) {
            return rememberedUser.getUsername();
        }
        return null;
    }

    @Nullable
    public final RememberedUser getRememberedUser() {
        return this.rememberedUser;
    }

    @Nullable
    public final String getSecondName() {
        RememberedUser rememberedUser = this.rememberedUser;
        if (rememberedUser != null) {
            return rememberedUser.getLastName();
        }
        return null;
    }

    @NotNull
    public final UserType getType() {
        UserType userType = this.f30799b;
        return userType == null ? UserType.PERSONAL : userType;
    }

    public int hashCode() {
        RememberedUser rememberedUser = this.rememberedUser;
        int iHashCode = (rememberedUser == null ? 0 : rememberedUser.hashCode()) * 31;
        UserType userType = this.f30799b;
        return iHashCode + (userType != null ? userType.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isDigitalTokenEnabled, reason: from getter */
    public final boolean getIsDigitalTokenEnabled() {
        return this.isDigitalTokenEnabled;
    }

    public final boolean isEnterpriseProfileAvailable() {
        RememberedUser rememberedUser = this.rememberedUser;
        return (rememberedUser == null || !rememberedUser.isBusinessUser() || this.f30799b == null) ? false : true;
    }

    /* JADX INFO: renamed from: isMobilePaymentEnabled, reason: from getter */
    public final boolean getIsMobilePaymentEnabled() {
        return this.isMobilePaymentEnabled;
    }

    public final void setDigitalTokenEnabled(boolean z10) {
        this.isDigitalTokenEnabled = z10;
    }

    public final void setMobilePaymentEnabled(boolean z10) {
        this.isMobilePaymentEnabled = z10;
    }

    @NotNull
    public String toString() {
        return "UserProfileConfiguration(rememberedUser=" + this.rememberedUser + ", userType=" + this.f30799b + ")";
    }

    public UserProfileConfiguration(@Nullable RememberedUser rememberedUser, @Nullable UserType userType) {
        this.rememberedUser = rememberedUser;
        this.f30799b = userType;
    }

    public /* synthetic */ UserProfileConfiguration(RememberedUser rememberedUser, UserType userType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : rememberedUser, (i10 & 2) != 0 ? null : userType);
    }
}
