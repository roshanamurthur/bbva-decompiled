package com.bbva.glomohybrid.base.deeplink.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GoogleAssistantConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/GoogleAssistantConfig;", "", "", "component1", "component2", "scheme", "url", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getScheme", "()Ljava/lang/String;", "b", "getUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class GoogleAssistantConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String scheme;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    public GoogleAssistantConfig(@NotNull String scheme, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.url = url;
    }

    public static /* synthetic */ GoogleAssistantConfig copy$default(GoogleAssistantConfig googleAssistantConfig, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = googleAssistantConfig.scheme;
        }
        if ((i10 & 2) != 0) {
            str2 = googleAssistantConfig.url;
        }
        return googleAssistantConfig.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final GoogleAssistantConfig copy(@NotNull String scheme, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(url, "url");
        return new GoogleAssistantConfig(scheme, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleAssistantConfig)) {
            return false;
        }
        GoogleAssistantConfig googleAssistantConfig = (GoogleAssistantConfig) other;
        return Intrinsics.areEqual(this.scheme, googleAssistantConfig.scheme) && Intrinsics.areEqual(this.url, googleAssistantConfig.url);
    }

    @NotNull
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.scheme.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GoogleAssistantConfig(scheme=");
        sb2.append(this.scheme);
        sb2.append(", url=");
        return d.f(sb2, this.url, ")");
    }
}
