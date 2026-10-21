package com.bbva.ethermobilesdk.pinning.data.catalog;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: PinningConfigDTO.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/data/catalog/PinningConfigDTO;", "", "version", "", LogKeysKt.PROPERTIES, "Lcom/bbva/ethermobilesdk/pinning/data/catalog/PropertiesDTO;", "siteCatalog", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/pinning/data/catalog/PropertiesDTO;Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;)V", "getProperties", "()Lcom/bbva/ethermobilesdk/pinning/data/catalog/PropertiesDTO;", "setProperties", "(Lcom/bbva/ethermobilesdk/pinning/data/catalog/PropertiesDTO;)V", "getSiteCatalog", "()Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;", "setSiteCatalog", "(Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;)V", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Root(name = "sslpinningconfig", strict = false)
public final /* data */ class PinningConfigDTO {

    @Element(name = LogKeysKt.PROPERTIES)
    @NotNull
    private PropertiesDTO properties;

    @Element(name = "sitecatalog")
    @NotNull
    private SiteCatalogDTO siteCatalog;

    @Attribute(name = "version")
    @NotNull
    private String version;

    public PinningConfigDTO(@Attribute(name = "version") @NotNull String version, @Element(name = LogKeysKt.PROPERTIES) @NotNull PropertiesDTO properties, @Element(name = "sitecatalog") @NotNull SiteCatalogDTO siteCatalog) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(siteCatalog, "siteCatalog");
        this.version = version;
        this.properties = properties;
        this.siteCatalog = siteCatalog;
    }

    public static /* synthetic */ PinningConfigDTO copy$default(PinningConfigDTO pinningConfigDTO, String str, PropertiesDTO propertiesDTO, SiteCatalogDTO siteCatalogDTO, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pinningConfigDTO.version;
        }
        if ((i10 & 2) != 0) {
            propertiesDTO = pinningConfigDTO.properties;
        }
        if ((i10 & 4) != 0) {
            siteCatalogDTO = pinningConfigDTO.siteCatalog;
        }
        return pinningConfigDTO.copy(str, propertiesDTO, siteCatalogDTO);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PropertiesDTO getProperties() {
        return this.properties;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SiteCatalogDTO getSiteCatalog() {
        return this.siteCatalog;
    }

    @NotNull
    public final PinningConfigDTO copy(@Attribute(name = "version") @NotNull String version, @Element(name = LogKeysKt.PROPERTIES) @NotNull PropertiesDTO properties, @Element(name = "sitecatalog") @NotNull SiteCatalogDTO siteCatalog) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(siteCatalog, "siteCatalog");
        return new PinningConfigDTO(version, properties, siteCatalog);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinningConfigDTO)) {
            return false;
        }
        PinningConfigDTO pinningConfigDTO = (PinningConfigDTO) other;
        return Intrinsics.areEqual(this.version, pinningConfigDTO.version) && Intrinsics.areEqual(this.properties, pinningConfigDTO.properties) && Intrinsics.areEqual(this.siteCatalog, pinningConfigDTO.siteCatalog);
    }

    @NotNull
    public final PropertiesDTO getProperties() {
        return this.properties;
    }

    @NotNull
    public final SiteCatalogDTO getSiteCatalog() {
        return this.siteCatalog;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.siteCatalog.hashCode() + ((this.properties.hashCode() + (this.version.hashCode() * 31)) * 31);
    }

    public final void setProperties(@NotNull PropertiesDTO propertiesDTO) {
        Intrinsics.checkNotNullParameter(propertiesDTO, "<set-?>");
        this.properties = propertiesDTO;
    }

    public final void setSiteCatalog(@NotNull SiteCatalogDTO siteCatalogDTO) {
        Intrinsics.checkNotNullParameter(siteCatalogDTO, "<set-?>");
        this.siteCatalog = siteCatalogDTO;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "PinningConfigDTO(version=" + this.version + ", properties=" + this.properties + ", siteCatalog=" + this.siteCatalog + ")";
    }
}
