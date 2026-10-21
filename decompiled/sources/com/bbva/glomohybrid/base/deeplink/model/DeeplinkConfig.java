package com.bbva.glomohybrid.base.deeplink.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeeplinkConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019¨\u0006("}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/DeeplinkConfig;", "", "", "component1", "Lcom/bbva/glomohybrid/base/deeplink/model/QRConfig;", "component2", "Lcom/bbva/glomohybrid/base/deeplink/model/GoogleAssistantConfig;", "component3", "component4", "component5", "scheme", "qrConfig", "googleAssistantConfig", "modoHost", "notificationDeepLink", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getScheme", "()Ljava/lang/String;", "b", "Lcom/bbva/glomohybrid/base/deeplink/model/QRConfig;", "getQrConfig", "()Lcom/bbva/glomohybrid/base/deeplink/model/QRConfig;", "c", "Lcom/bbva/glomohybrid/base/deeplink/model/GoogleAssistantConfig;", "getGoogleAssistantConfig", "()Lcom/bbva/glomohybrid/base/deeplink/model/GoogleAssistantConfig;", "d", "getModoHost", "e", "getNotificationDeepLink", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/base/deeplink/model/QRConfig;Lcom/bbva/glomohybrid/base/deeplink/model/GoogleAssistantConfig;Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class DeeplinkConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String scheme;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final QRConfig qrConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GoogleAssistantConfig googleAssistantConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String modoHost;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String notificationDeepLink;

    public DeeplinkConfig(@NotNull String scheme, @NotNull QRConfig qrConfig, @NotNull GoogleAssistantConfig googleAssistantConfig, @NotNull String modoHost, @NotNull String notificationDeepLink) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(qrConfig, "qrConfig");
        Intrinsics.checkNotNullParameter(googleAssistantConfig, "googleAssistantConfig");
        Intrinsics.checkNotNullParameter(modoHost, "modoHost");
        Intrinsics.checkNotNullParameter(notificationDeepLink, "notificationDeepLink");
        this.scheme = scheme;
        this.qrConfig = qrConfig;
        this.googleAssistantConfig = googleAssistantConfig;
        this.modoHost = modoHost;
        this.notificationDeepLink = notificationDeepLink;
    }

    public static /* synthetic */ DeeplinkConfig copy$default(DeeplinkConfig deeplinkConfig, String str, QRConfig qRConfig, GoogleAssistantConfig googleAssistantConfig, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deeplinkConfig.scheme;
        }
        if ((i10 & 2) != 0) {
            qRConfig = deeplinkConfig.qrConfig;
        }
        QRConfig qRConfig2 = qRConfig;
        if ((i10 & 4) != 0) {
            googleAssistantConfig = deeplinkConfig.googleAssistantConfig;
        }
        GoogleAssistantConfig googleAssistantConfig2 = googleAssistantConfig;
        if ((i10 & 8) != 0) {
            str2 = deeplinkConfig.modoHost;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            str3 = deeplinkConfig.notificationDeepLink;
        }
        return deeplinkConfig.copy(str, qRConfig2, googleAssistantConfig2, str4, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final QRConfig getQrConfig() {
        return this.qrConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GoogleAssistantConfig getGoogleAssistantConfig() {
        return this.googleAssistantConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModoHost() {
        return this.modoHost;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNotificationDeepLink() {
        return this.notificationDeepLink;
    }

    @NotNull
    public final DeeplinkConfig copy(@NotNull String scheme, @NotNull QRConfig qrConfig, @NotNull GoogleAssistantConfig googleAssistantConfig, @NotNull String modoHost, @NotNull String notificationDeepLink) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(qrConfig, "qrConfig");
        Intrinsics.checkNotNullParameter(googleAssistantConfig, "googleAssistantConfig");
        Intrinsics.checkNotNullParameter(modoHost, "modoHost");
        Intrinsics.checkNotNullParameter(notificationDeepLink, "notificationDeepLink");
        return new DeeplinkConfig(scheme, qrConfig, googleAssistantConfig, modoHost, notificationDeepLink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeeplinkConfig)) {
            return false;
        }
        DeeplinkConfig deeplinkConfig = (DeeplinkConfig) other;
        return Intrinsics.areEqual(this.scheme, deeplinkConfig.scheme) && Intrinsics.areEqual(this.qrConfig, deeplinkConfig.qrConfig) && Intrinsics.areEqual(this.googleAssistantConfig, deeplinkConfig.googleAssistantConfig) && Intrinsics.areEqual(this.modoHost, deeplinkConfig.modoHost) && Intrinsics.areEqual(this.notificationDeepLink, deeplinkConfig.notificationDeepLink);
    }

    @NotNull
    public final GoogleAssistantConfig getGoogleAssistantConfig() {
        return this.googleAssistantConfig;
    }

    @NotNull
    public final String getModoHost() {
        return this.modoHost;
    }

    @NotNull
    public final String getNotificationDeepLink() {
        return this.notificationDeepLink;
    }

    @NotNull
    public final QRConfig getQrConfig() {
        return this.qrConfig;
    }

    @NotNull
    public final String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        return this.notificationDeepLink.hashCode() + n1.c(this.modoHost, (this.googleAssistantConfig.hashCode() + ((this.qrConfig.hashCode() + (this.scheme.hashCode() * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeeplinkConfig(scheme=");
        sb2.append(this.scheme);
        sb2.append(", qrConfig=");
        sb2.append(this.qrConfig);
        sb2.append(", googleAssistantConfig=");
        sb2.append(this.googleAssistantConfig);
        sb2.append(", modoHost=");
        sb2.append(this.modoHost);
        sb2.append(", notificationDeepLink=");
        return d.f(sb2, this.notificationDeepLink, ")");
    }
}
