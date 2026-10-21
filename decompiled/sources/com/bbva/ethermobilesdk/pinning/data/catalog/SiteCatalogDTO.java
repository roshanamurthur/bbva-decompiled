package com.bbva.ethermobilesdk.pinning.data.catalog;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: SiteCatalogDTO.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;", "", "revision", "", "version", "", "sites", "", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteDTO;", "signature", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SignatureDTO;", "(ILjava/lang/String;Ljava/util/List;Lcom/bbva/ethermobilesdk/pinning/data/catalog/SignatureDTO;)V", "getRevision", "()I", "setRevision", "(I)V", "getSignature", "()Lcom/bbva/ethermobilesdk/pinning/data/catalog/SignatureDTO;", "setSignature", "(Lcom/bbva/ethermobilesdk/pinning/data/catalog/SignatureDTO;)V", "getSites", "()Ljava/util/List;", "setSites", "(Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Root(name = "sitecatalog", strict = false)
public final /* data */ class SiteCatalogDTO {

    @Attribute(name = "revision")
    private int revision;

    @Element(name = "signature", required = false)
    @Nullable
    private SignatureDTO signature;

    @NotNull
    @ElementList(entry = "site", inline = true)
    private List<SiteDTO> sites;

    @Attribute(name = "version")
    @NotNull
    private String version;

    public SiteCatalogDTO(@Attribute(name = "revision") int i10, @Attribute(name = "version") @NotNull String version, @NotNull @ElementList(entry = "site", inline = true) List<SiteDTO> sites, @Element(name = "signature", required = false) @Nullable SignatureDTO signatureDTO) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(sites, "sites");
        this.revision = i10;
        this.version = version;
        this.sites = sites;
        this.signature = signatureDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SiteCatalogDTO copy$default(SiteCatalogDTO siteCatalogDTO, int i10, String str, List list, SignatureDTO signatureDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = siteCatalogDTO.revision;
        }
        if ((i11 & 2) != 0) {
            str = siteCatalogDTO.version;
        }
        if ((i11 & 4) != 0) {
            list = siteCatalogDTO.sites;
        }
        if ((i11 & 8) != 0) {
            signatureDTO = siteCatalogDTO.signature;
        }
        return siteCatalogDTO.copy(i10, str, list, signatureDTO);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRevision() {
        return this.revision;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final List<SiteDTO> component3() {
        return this.sites;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SignatureDTO getSignature() {
        return this.signature;
    }

    @NotNull
    public final SiteCatalogDTO copy(@Attribute(name = "revision") int revision, @Attribute(name = "version") @NotNull String version, @NotNull @ElementList(entry = "site", inline = true) List<SiteDTO> sites, @Element(name = "signature", required = false) @Nullable SignatureDTO signature) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(sites, "sites");
        return new SiteCatalogDTO(revision, version, sites, signature);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SiteCatalogDTO)) {
            return false;
        }
        SiteCatalogDTO siteCatalogDTO = (SiteCatalogDTO) other;
        return this.revision == siteCatalogDTO.revision && Intrinsics.areEqual(this.version, siteCatalogDTO.version) && Intrinsics.areEqual(this.sites, siteCatalogDTO.sites) && Intrinsics.areEqual(this.signature, siteCatalogDTO.signature);
    }

    public final int getRevision() {
        return this.revision;
    }

    @Nullable
    public final SignatureDTO getSignature() {
        return this.signature;
    }

    @NotNull
    public final List<SiteDTO> getSites() {
        return this.sites;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iA = a.a(this.sites, n1.c(this.version, this.revision * 31, 31), 31);
        SignatureDTO signatureDTO = this.signature;
        return iA + (signatureDTO == null ? 0 : signatureDTO.hashCode());
    }

    public final void setRevision(int i10) {
        this.revision = i10;
    }

    public final void setSignature(@Nullable SignatureDTO signatureDTO) {
        this.signature = signatureDTO;
    }

    public final void setSites(@NotNull List<SiteDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sites = list;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    @NotNull
    public String toString() {
        int i10 = this.revision;
        String str = this.version;
        List<SiteDTO> list = this.sites;
        SignatureDTO signatureDTO = this.signature;
        StringBuilder sbE = v.e("SiteCatalogDTO(revision=", i10, ", version=", str, ", sites=");
        sbE.append(list);
        sbE.append(", signature=");
        sbE.append(signatureDTO);
        sbE.append(")");
        return sbE.toString();
    }
}
