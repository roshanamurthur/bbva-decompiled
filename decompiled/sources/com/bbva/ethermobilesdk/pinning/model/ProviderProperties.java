package com.bbva.ethermobilesdk.pinning.model;

import ad.d;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProviderProperties.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/ProviderProperties;", "", "revision", "", "lastModified", "", "updateUrls", "(ILjava/lang/String;Ljava/lang/String;)V", "getLastModified", "()Ljava/lang/String;", "getRevision", "()I", "getUpdateUrls", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ProviderProperties {

    @Nullable
    private final String lastModified;
    private final int revision;

    @Nullable
    private final String updateUrls;

    public ProviderProperties(int i10, @Nullable String str, @Nullable String str2) {
        this.revision = i10;
        this.lastModified = str;
        this.updateUrls = str2;
    }

    public static /* synthetic */ ProviderProperties copy$default(ProviderProperties providerProperties, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = providerProperties.revision;
        }
        if ((i11 & 2) != 0) {
            str = providerProperties.lastModified;
        }
        if ((i11 & 4) != 0) {
            str2 = providerProperties.updateUrls;
        }
        return providerProperties.copy(i10, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRevision() {
        return this.revision;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastModified() {
        return this.lastModified;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdateUrls() {
        return this.updateUrls;
    }

    @NotNull
    public final ProviderProperties copy(int revision, @Nullable String lastModified, @Nullable String updateUrls) {
        return new ProviderProperties(revision, lastModified, updateUrls);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderProperties)) {
            return false;
        }
        ProviderProperties providerProperties = (ProviderProperties) other;
        return this.revision == providerProperties.revision && Intrinsics.areEqual(this.lastModified, providerProperties.lastModified) && Intrinsics.areEqual(this.updateUrls, providerProperties.updateUrls);
    }

    @Nullable
    public final String getLastModified() {
        return this.lastModified;
    }

    public final int getRevision() {
        return this.revision;
    }

    @Nullable
    public final String getUpdateUrls() {
        return this.updateUrls;
    }

    public int hashCode() {
        int i10 = this.revision * 31;
        String str = this.lastModified;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updateUrls;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i10 = this.revision;
        String str = this.lastModified;
        return d.f(v.e("ProviderProperties(revision=", i10, ", lastModified=", str, ", updateUrls="), this.updateUrls, ")");
    }
}
