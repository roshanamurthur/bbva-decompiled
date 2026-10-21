package com.bbva.ethermobilesdk.deviceinfo.data;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/data/WebViewVersion;", "", "packageName", "", "version", "chromeVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChromeVersion", "()Ljava/lang/String;", "getPackageName", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "deviceinfo_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WebViewVersion {

    @Nullable
    private final String chromeVersion;

    @NotNull
    private final String packageName;

    @NotNull
    private final String version;

    public WebViewVersion(@NotNull String packageName, @NotNull String version, @Nullable String str) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        this.packageName = packageName;
        this.version = version;
        this.chromeVersion = str;
    }

    public static /* synthetic */ WebViewVersion copy$default(WebViewVersion webViewVersion, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webViewVersion.packageName;
        }
        if ((i10 & 2) != 0) {
            str2 = webViewVersion.version;
        }
        if ((i10 & 4) != 0) {
            str3 = webViewVersion.chromeVersion;
        }
        return webViewVersion.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChromeVersion() {
        return this.chromeVersion;
    }

    @NotNull
    public final WebViewVersion copy(@NotNull String packageName, @NotNull String version, @Nullable String chromeVersion) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        return new WebViewVersion(packageName, version, chromeVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewVersion)) {
            return false;
        }
        WebViewVersion webViewVersion = (WebViewVersion) other;
        return Intrinsics.areEqual(this.packageName, webViewVersion.packageName) && Intrinsics.areEqual(this.version, webViewVersion.version) && Intrinsics.areEqual(this.chromeVersion, webViewVersion.chromeVersion);
    }

    @Nullable
    public final String getChromeVersion() {
        return this.chromeVersion;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iC = n1.c(this.version, this.packageName.hashCode() * 31, 31);
        String str = this.chromeVersion;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.packageName;
        String str2 = this.version;
        return d.f(a.c("WebViewVersion(packageName=", str, ", version=", str2, ", chromeVersion="), this.chromeVersion, ")");
    }
}
