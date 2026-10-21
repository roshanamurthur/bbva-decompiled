package com.bbva.ethermobilesdk.pinning.data.catalog;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: SiteDTO.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003JE\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006-"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteDTO;", "", "checkCertDate", "", "checkCertTrust", "checkHost", "id", "", "validHost", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/ValidHostDTO;", "validCertificate", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/ValidCertificateDTO;", "(ZZZLjava/lang/String;Lcom/bbva/ethermobilesdk/pinning/data/catalog/ValidHostDTO;Lcom/bbva/ethermobilesdk/pinning/data/catalog/ValidCertificateDTO;)V", "getCheckCertDate", "()Z", "setCheckCertDate", "(Z)V", "getCheckCertTrust", "setCheckCertTrust", "getCheckHost", "setCheckHost", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getValidCertificate", "()Lcom/bbva/ethermobilesdk/pinning/data/catalog/ValidCertificateDTO;", "setValidCertificate", "(Lcom/bbva/ethermobilesdk/pinning/data/catalog/ValidCertificateDTO;)V", "getValidHost", "()Lcom/bbva/ethermobilesdk/pinning/data/catalog/ValidHostDTO;", "setValidHost", "(Lcom/bbva/ethermobilesdk/pinning/data/catalog/ValidHostDTO;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Order(elements = {"validhosts", "validcerts"})
@Root(name = "site", strict = false)
public final /* data */ class SiteDTO {

    @Attribute(name = "checkCertDate")
    private boolean checkCertDate;

    @Attribute(name = "checkCertTrust")
    private boolean checkCertTrust;

    @Attribute(name = "checkHost")
    private boolean checkHost;

    @Attribute(name = "id")
    @NotNull
    private String id;

    @Element(name = "validcerts")
    @NotNull
    private ValidCertificateDTO validCertificate;

    @Element(name = "validhosts")
    @NotNull
    private ValidHostDTO validHost;

    public SiteDTO(@Attribute(name = "checkCertDate") boolean z10, @Attribute(name = "checkCertTrust") boolean z11, @Attribute(name = "checkHost") boolean z12, @Attribute(name = "id") @NotNull String id, @Element(name = "validhosts") @NotNull ValidHostDTO validHost, @Element(name = "validcerts") @NotNull ValidCertificateDTO validCertificate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(validHost, "validHost");
        Intrinsics.checkNotNullParameter(validCertificate, "validCertificate");
        this.checkCertDate = z10;
        this.checkCertTrust = z11;
        this.checkHost = z12;
        this.id = id;
        this.validHost = validHost;
        this.validCertificate = validCertificate;
    }

    public static /* synthetic */ SiteDTO copy$default(SiteDTO siteDTO, boolean z10, boolean z11, boolean z12, String str, ValidHostDTO validHostDTO, ValidCertificateDTO validCertificateDTO, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = siteDTO.checkCertDate;
        }
        if ((i10 & 2) != 0) {
            z11 = siteDTO.checkCertTrust;
        }
        boolean z13 = z11;
        if ((i10 & 4) != 0) {
            z12 = siteDTO.checkHost;
        }
        boolean z14 = z12;
        if ((i10 & 8) != 0) {
            str = siteDTO.id;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            validHostDTO = siteDTO.validHost;
        }
        ValidHostDTO validHostDTO2 = validHostDTO;
        if ((i10 & 32) != 0) {
            validCertificateDTO = siteDTO.validCertificate;
        }
        return siteDTO.copy(z10, z13, z14, str2, validHostDTO2, validCertificateDTO);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCheckCertDate() {
        return this.checkCertDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCheckCertTrust() {
        return this.checkCertTrust;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCheckHost() {
        return this.checkHost;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ValidHostDTO getValidHost() {
        return this.validHost;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ValidCertificateDTO getValidCertificate() {
        return this.validCertificate;
    }

    @NotNull
    public final SiteDTO copy(@Attribute(name = "checkCertDate") boolean checkCertDate, @Attribute(name = "checkCertTrust") boolean checkCertTrust, @Attribute(name = "checkHost") boolean checkHost, @Attribute(name = "id") @NotNull String id, @Element(name = "validhosts") @NotNull ValidHostDTO validHost, @Element(name = "validcerts") @NotNull ValidCertificateDTO validCertificate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(validHost, "validHost");
        Intrinsics.checkNotNullParameter(validCertificate, "validCertificate");
        return new SiteDTO(checkCertDate, checkCertTrust, checkHost, id, validHost, validCertificate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SiteDTO)) {
            return false;
        }
        SiteDTO siteDTO = (SiteDTO) other;
        return this.checkCertDate == siteDTO.checkCertDate && this.checkCertTrust == siteDTO.checkCertTrust && this.checkHost == siteDTO.checkHost && Intrinsics.areEqual(this.id, siteDTO.id) && Intrinsics.areEqual(this.validHost, siteDTO.validHost) && Intrinsics.areEqual(this.validCertificate, siteDTO.validCertificate);
    }

    public final boolean getCheckCertDate() {
        return this.checkCertDate;
    }

    public final boolean getCheckCertTrust() {
        return this.checkCertTrust;
    }

    public final boolean getCheckHost() {
        return this.checkHost;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ValidCertificateDTO getValidCertificate() {
        return this.validCertificate;
    }

    @NotNull
    public final ValidHostDTO getValidHost() {
        return this.validHost;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        boolean z10 = this.checkCertDate;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.checkCertTrust;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int i11 = (i10 + r3) * 31;
        boolean z12 = this.checkHost;
        return this.validCertificate.hashCode() + ((this.validHost.hashCode() + n1.c(this.id, (i11 + (z12 ? 1 : z12)) * 31, 31)) * 31);
    }

    public final void setCheckCertDate(boolean z10) {
        this.checkCertDate = z10;
    }

    public final void setCheckCertTrust(boolean z10) {
        this.checkCertTrust = z10;
    }

    public final void setCheckHost(boolean z10) {
        this.checkHost = z10;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setValidCertificate(@NotNull ValidCertificateDTO validCertificateDTO) {
        Intrinsics.checkNotNullParameter(validCertificateDTO, "<set-?>");
        this.validCertificate = validCertificateDTO;
    }

    public final void setValidHost(@NotNull ValidHostDTO validHostDTO) {
        Intrinsics.checkNotNullParameter(validHostDTO, "<set-?>");
        this.validHost = validHostDTO;
    }

    @NotNull
    public String toString() {
        return "SiteDTO(checkCertDate=" + this.checkCertDate + ", checkCertTrust=" + this.checkCertTrust + ", checkHost=" + this.checkHost + ", id=" + this.id + ", validHost=" + this.validHost + ", validCertificate=" + this.validCertificate + ")";
    }
}
