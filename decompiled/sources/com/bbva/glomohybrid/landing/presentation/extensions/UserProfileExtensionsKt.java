package com.bbva.glomohybrid.landing.presentation.extensions;

import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.base.models.LoginConfigurationData;
import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomohybrid.landing.presentation.model.LandingAnalyticLinkType;
import com.bbva.slidemenuview.data.MenuType;
import com.bbva.slidemenuview.domain.model.UserMenu;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserProfileExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0018\u0010\t\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0002¨\u0006\u000f"}, d2 = {"getLandingCampaignEvent", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "getLandingCloseCampaignEvent", "getLandingExternalLinkAnalytic", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingAnalyticLinkType;", "getLandingInteractionLinkAnalytic", "getLandingInternalLinkAnalytic", "getLandingStartCampaignEvent", "getMenuConfiguration", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "accessState", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "toLoginConfiguration", "Lcom/bbva/glomohybrid/base/models/LoginConfigurationData;", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserProfileExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserProfileExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/UserProfileExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
public final class UserProfileExtensionsKt {
    @NotNull
    public static final AnalyticsEvent getLandingCampaignEvent(@NotNull UserProfileConfiguration userProfileConfiguration) {
        Intrinsics.checkNotNullParameter(userProfileConfiguration, "<this>");
        AnalyticsEvent analyticsEvent = AnalyticsEvent.LANDING_CAMPAIGN;
        if (userProfileConfiguration.getRememberedUser() == null) {
            analyticsEvent = null;
        }
        return analyticsEvent == null ? AnalyticsEvent.LANDING_PUBLIC_CAMPAIGN : analyticsEvent;
    }

    @NotNull
    public static final AnalyticsEvent getLandingCloseCampaignEvent(@NotNull UserProfileConfiguration userProfileConfiguration) {
        Intrinsics.checkNotNullParameter(userProfileConfiguration, "<this>");
        AnalyticsEvent analyticsEvent = AnalyticsEvent.LANDING_CAMPAIGN_CLOSE;
        if (userProfileConfiguration.getRememberedUser() == null) {
            analyticsEvent = null;
        }
        return analyticsEvent == null ? AnalyticsEvent.LANDING_PUBLIC_CAMPAIGN_CLOSE : analyticsEvent;
    }

    @NotNull
    public static final LandingAnalyticLinkType getLandingExternalLinkAnalytic(@NotNull UserProfileConfiguration userProfileConfiguration) {
        Intrinsics.checkNotNullParameter(userProfileConfiguration, "<this>");
        LandingAnalyticLinkType landingAnalyticLinkType = LandingAnalyticLinkType.EXTERNAL;
        if (userProfileConfiguration.getRememberedUser() == null) {
            landingAnalyticLinkType = null;
        }
        return landingAnalyticLinkType == null ? LandingAnalyticLinkType.PUBLIC_EXTERNAL : landingAnalyticLinkType;
    }

    @NotNull
    public static final LandingAnalyticLinkType getLandingInteractionLinkAnalytic(@NotNull UserProfileConfiguration userProfileConfiguration) {
        Intrinsics.checkNotNullParameter(userProfileConfiguration, "<this>");
        LandingAnalyticLinkType landingAnalyticLinkType = LandingAnalyticLinkType.INTERACTION;
        if (userProfileConfiguration.getRememberedUser() == null) {
            landingAnalyticLinkType = null;
        }
        return landingAnalyticLinkType == null ? LandingAnalyticLinkType.PUBLIC_INTERACTION : landingAnalyticLinkType;
    }

    @NotNull
    public static final LandingAnalyticLinkType getLandingInternalLinkAnalytic(@NotNull UserProfileConfiguration userProfileConfiguration) {
        Intrinsics.checkNotNullParameter(userProfileConfiguration, "<this>");
        LandingAnalyticLinkType landingAnalyticLinkType = LandingAnalyticLinkType.INTERNAL;
        if (userProfileConfiguration.getRememberedUser() == null) {
            landingAnalyticLinkType = null;
        }
        return landingAnalyticLinkType == null ? LandingAnalyticLinkType.PUBLIC_INTERNAL : landingAnalyticLinkType;
    }

    @NotNull
    public static final AnalyticsEvent getLandingStartCampaignEvent(@NotNull UserProfileConfiguration userProfileConfiguration) {
        Intrinsics.checkNotNullParameter(userProfileConfiguration, "<this>");
        AnalyticsEvent analyticsEvent = AnalyticsEvent.LANDING_CAMPAIGN_START;
        if (userProfileConfiguration.getRememberedUser() == null) {
            analyticsEvent = null;
        }
        return analyticsEvent == null ? AnalyticsEvent.LANDING_PUBLIC_CAMPAIGN_START : analyticsEvent;
    }

    @Nullable
    public static final UserMenu getMenuConfiguration(@Nullable UserProfileConfiguration userProfileConfiguration, @NotNull LandingAppAccess accessState) {
        UserType type;
        Intrinsics.checkNotNullParameter(accessState, "accessState");
        String name = userProfileConfiguration != null ? userProfileConfiguration.getName() : null;
        MenuType menuType = MenuType.CACHED;
        if ((userProfileConfiguration != null ? userProfileConfiguration.getRememberedUser() : null) == null) {
            menuType = null;
        }
        if (menuType == null) {
            menuType = MenuType.PUBLIC;
        }
        MenuType menuType2 = menuType;
        if (userProfileConfiguration == null || (type = userProfileConfiguration.getType()) == null) {
            type = UserType.PERSONAL;
        }
        UserMenu userMenu = new UserMenu(name, menuType2, false, type.getValue(), userProfileConfiguration != null ? userProfileConfiguration.getIsDigitalTokenEnabled() : false, 0, 32, null);
        if (Intrinsics.areEqual(accessState, LandingAppAccess.Available.INSTANCE)) {
            return userMenu;
        }
        return null;
    }

    @NotNull
    public static final LoginConfigurationData toLoginConfiguration(@NotNull UserProfileConfiguration userProfileConfiguration) {
        Intrinsics.checkNotNullParameter(userProfileConfiguration, "<this>");
        RememberedUser rememberedUser = userProfileConfiguration.getRememberedUser();
        String username = rememberedUser != null ? rememberedUser.getUsername() : null;
        RememberedUser rememberedUser2 = userProfileConfiguration.getRememberedUser();
        String document = rememberedUser2 != null ? rememberedUser2.getDocument() : null;
        RememberedUser rememberedUser3 = userProfileConfiguration.getRememberedUser();
        String lastName = rememberedUser3 != null ? rememberedUser3.getLastName() : null;
        RememberedUser rememberedUser4 = userProfileConfiguration.getRememberedUser();
        boolean zIsBusinessUser = rememberedUser4 != null ? rememberedUser4.isBusinessUser() : false;
        RememberedUser rememberedUser5 = userProfileConfiguration.getRememberedUser();
        return new LoginConfigurationData(username, document, lastName, zIsBusinessUser, rememberedUser5 != null ? rememberedUser5.getCustomerId() : null, userProfileConfiguration.getType(), userProfileConfiguration.isEnterpriseProfileAvailable(), true);
    }
}
