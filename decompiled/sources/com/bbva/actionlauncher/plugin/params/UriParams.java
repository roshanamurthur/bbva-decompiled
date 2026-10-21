package com.bbva.actionlauncher.plugin.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\rJ\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bbva/actionlauncher/plugin/params/UriParams;", "", "scheme", "", "packageId", "(Ljava/lang/String;Ljava/lang/String;)V", "getPackageId", "()Ljava/lang/String;", "getScheme", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "isPackage", "toString", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UriParams {

    @Nullable
    private final String packageId;

    @Nullable
    private final String scheme;

    public UriParams(@Nullable String str, @Nullable String str2) {
        this.scheme = str;
        this.packageId = str2;
    }

    public static /* synthetic */ UriParams copy$default(UriParams uriParams, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uriParams.scheme;
        }
        if ((i10 & 2) != 0) {
            str2 = uriParams.packageId;
        }
        return uriParams.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackageId() {
        return this.packageId;
    }

    @NotNull
    public final UriParams copy(@Nullable String scheme, @Nullable String packageId) {
        return new UriParams(scheme, packageId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UriParams)) {
            return false;
        }
        UriParams uriParams = (UriParams) other;
        return Intrinsics.areEqual(this.scheme, uriParams.scheme) && Intrinsics.areEqual(this.packageId, uriParams.packageId);
    }

    @Nullable
    public final String getPackageId() {
        return this.packageId;
    }

    @Nullable
    public final String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        String str = this.scheme;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packageId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isPackage() {
        return this.packageId != null;
    }

    @NotNull
    public String toString() {
        return u.g("UriParams(scheme=", this.scheme, ", packageId=", this.packageId, ")");
    }
}
