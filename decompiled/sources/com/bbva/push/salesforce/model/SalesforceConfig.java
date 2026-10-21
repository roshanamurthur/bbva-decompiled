package com.bbva.push.salesforce.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.salesforce.marketingcloud.notifications.NotificationCustomizationOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SalesforceConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006*"}, d2 = {"Lcom/bbva/push/salesforce/model/SalesforceConfig;", "", "appId", "", "accessToken", "serverUrl", EventDataKeys.Identity.VISITOR_ID_MID, "enableInbox", "", "delayRegisterUntilContact", "iconId", "", "notificationConfig", "Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;)V", "getAccessToken", "()Ljava/lang/String;", "getAppId", "getDelayRegisterUntilContact", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableInbox", "getIconId", "()I", "getMid", "getNotificationConfig", "()Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "getServerUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;)Lcom/bbva/push/salesforce/model/SalesforceConfig;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "salesforce-push_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SalesforceConfig {

    @NotNull
    private final String accessToken;

    @NotNull
    private final String appId;

    @Nullable
    private final Boolean delayRegisterUntilContact;

    @Nullable
    private final Boolean enableInbox;
    private final int iconId;

    @NotNull
    private final String mid;

    @Nullable
    private final NotificationCustomizationOptions notificationConfig;

    @NotNull
    private final String serverUrl;

    public SalesforceConfig(@NotNull String appId, @NotNull String accessToken, @NotNull String serverUrl, @NotNull String mid, @Nullable Boolean bool, @Nullable Boolean bool2, int i10, @Nullable NotificationCustomizationOptions notificationCustomizationOptions) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        this.appId = appId;
        this.accessToken = accessToken;
        this.serverUrl = serverUrl;
        this.mid = mid;
        this.enableInbox = bool;
        this.delayRegisterUntilContact = bool2;
        this.iconId = i10;
        this.notificationConfig = notificationCustomizationOptions;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMid() {
        return this.mid;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getEnableInbox() {
        return this.enableInbox;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getDelayRegisterUntilContact() {
        return this.delayRegisterUntilContact;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getIconId() {
        return this.iconId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NotificationCustomizationOptions getNotificationConfig() {
        return this.notificationConfig;
    }

    @NotNull
    public final SalesforceConfig copy(@NotNull String appId, @NotNull String accessToken, @NotNull String serverUrl, @NotNull String mid, @Nullable Boolean enableInbox, @Nullable Boolean delayRegisterUntilContact, int iconId, @Nullable NotificationCustomizationOptions notificationConfig) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        return new SalesforceConfig(appId, accessToken, serverUrl, mid, enableInbox, delayRegisterUntilContact, iconId, notificationConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SalesforceConfig)) {
            return false;
        }
        SalesforceConfig salesforceConfig = (SalesforceConfig) other;
        return Intrinsics.areEqual(this.appId, salesforceConfig.appId) && Intrinsics.areEqual(this.accessToken, salesforceConfig.accessToken) && Intrinsics.areEqual(this.serverUrl, salesforceConfig.serverUrl) && Intrinsics.areEqual(this.mid, salesforceConfig.mid) && Intrinsics.areEqual(this.enableInbox, salesforceConfig.enableInbox) && Intrinsics.areEqual(this.delayRegisterUntilContact, salesforceConfig.delayRegisterUntilContact) && this.iconId == salesforceConfig.iconId && Intrinsics.areEqual(this.notificationConfig, salesforceConfig.notificationConfig);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final Boolean getDelayRegisterUntilContact() {
        return this.delayRegisterUntilContact;
    }

    @Nullable
    public final Boolean getEnableInbox() {
        return this.enableInbox;
    }

    public final int getIconId() {
        return this.iconId;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    @Nullable
    public final NotificationCustomizationOptions getNotificationConfig() {
        return this.notificationConfig;
    }

    @NotNull
    public final String getServerUrl() {
        return this.serverUrl;
    }

    public int hashCode() {
        int iC = n1.c(this.mid, n1.c(this.serverUrl, n1.c(this.accessToken, this.appId.hashCode() * 31, 31), 31), 31);
        Boolean bool = this.enableInbox;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.delayRegisterUntilContact;
        int iHashCode2 = (((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.iconId) * 31;
        NotificationCustomizationOptions notificationCustomizationOptions = this.notificationConfig;
        return iHashCode2 + (notificationCustomizationOptions != null ? notificationCustomizationOptions.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.appId;
        String str2 = this.accessToken;
        String str3 = this.serverUrl;
        String str4 = this.mid;
        Boolean bool = this.enableInbox;
        Boolean bool2 = this.delayRegisterUntilContact;
        int i10 = this.iconId;
        NotificationCustomizationOptions notificationCustomizationOptions = this.notificationConfig;
        StringBuilder sbC = a.c("SalesforceConfig(appId=", str, ", accessToken=", str2, ", serverUrl=");
        k.e(sbC, str3, ", mid=", str4, ", enableInbox=");
        sbC.append(bool);
        sbC.append(", delayRegisterUntilContact=");
        sbC.append(bool2);
        sbC.append(", iconId=");
        sbC.append(i10);
        sbC.append(", notificationConfig=");
        sbC.append(notificationCustomizationOptions);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ SalesforceConfig(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i10, NotificationCustomizationOptions notificationCustomizationOptions, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? Boolean.TRUE : bool, (i11 & 32) != 0 ? Boolean.TRUE : bool2, i10, (i11 & 128) != 0 ? null : notificationCustomizationOptions);
    }
}
