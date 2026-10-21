package com.bbva.ethermobilesdk.pinning.data.catalog;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: PropertiesDTO.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012$\b\u0001\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ%\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002$\b\u0003\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R:\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/data/catalog/PropertiesDTO;", "", "propertiesItems", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "signature", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SignatureDTO;", "(Ljava/util/LinkedHashMap;Lcom/bbva/ethermobilesdk/pinning/data/catalog/SignatureDTO;)V", "getPropertiesItems", "()Ljava/util/LinkedHashMap;", "setPropertiesItems", "(Ljava/util/LinkedHashMap;)V", "getSignature", "()Lcom/bbva/ethermobilesdk/pinning/data/catalog/SignatureDTO;", "setSignature", "(Lcom/bbva/ethermobilesdk/pinning/data/catalog/SignatureDTO;)V", "updatePubKey", "getUpdatePubKey", "()Ljava/lang/String;", "updateThreshold", "getUpdateThreshold", "updateUrl", "getUpdateUrl", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Root(name = LogKeysKt.PROPERTIES, strict = false)
public final /* data */ class PropertiesDTO {

    @NotNull
    @ElementMap(attribute = true, entry = "prp", inline = true, key = "id")
    private LinkedHashMap<String, String> propertiesItems;

    @Element(name = "signature", required = false)
    @Nullable
    private SignatureDTO signature;

    @Nullable
    private final String updatePubKey;

    @Nullable
    private final String updateThreshold;

    @Nullable
    private final String updateUrl;

    public PropertiesDTO(@NotNull @ElementMap(attribute = true, entry = "prp", inline = true, key = "id") LinkedHashMap<String, String> propertiesItems, @Element(name = "signature", required = false) @Nullable SignatureDTO signatureDTO) {
        Intrinsics.checkNotNullParameter(propertiesItems, "propertiesItems");
        this.propertiesItems = propertiesItems;
        this.signature = signatureDTO;
        this.updateUrl = propertiesItems.get("com.bbva.sl.ar.sslpinning.update.url");
        this.updateThreshold = this.propertiesItems.get("com.bbva.sl.ar.sslpinning.update.threshold");
        this.updatePubKey = this.propertiesItems.get("com.bbva.sl.ar.sslpinning.pubkey");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PropertiesDTO copy$default(PropertiesDTO propertiesDTO, LinkedHashMap linkedHashMap, SignatureDTO signatureDTO, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            linkedHashMap = propertiesDTO.propertiesItems;
        }
        if ((i10 & 2) != 0) {
            signatureDTO = propertiesDTO.signature;
        }
        return propertiesDTO.copy(linkedHashMap, signatureDTO);
    }

    @NotNull
    public final LinkedHashMap<String, String> component1() {
        return this.propertiesItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SignatureDTO getSignature() {
        return this.signature;
    }

    @NotNull
    public final PropertiesDTO copy(@NotNull @ElementMap(attribute = true, entry = "prp", inline = true, key = "id") LinkedHashMap<String, String> propertiesItems, @Element(name = "signature", required = false) @Nullable SignatureDTO signature) {
        Intrinsics.checkNotNullParameter(propertiesItems, "propertiesItems");
        return new PropertiesDTO(propertiesItems, signature);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PropertiesDTO)) {
            return false;
        }
        PropertiesDTO propertiesDTO = (PropertiesDTO) other;
        return Intrinsics.areEqual(this.propertiesItems, propertiesDTO.propertiesItems) && Intrinsics.areEqual(this.signature, propertiesDTO.signature);
    }

    @NotNull
    public final LinkedHashMap<String, String> getPropertiesItems() {
        return this.propertiesItems;
    }

    @Nullable
    public final SignatureDTO getSignature() {
        return this.signature;
    }

    @Nullable
    public final String getUpdatePubKey() {
        return this.updatePubKey;
    }

    @Nullable
    public final String getUpdateThreshold() {
        return this.updateThreshold;
    }

    @Nullable
    public final String getUpdateUrl() {
        return this.updateUrl;
    }

    public int hashCode() {
        int iHashCode = this.propertiesItems.hashCode() * 31;
        SignatureDTO signatureDTO = this.signature;
        return iHashCode + (signatureDTO == null ? 0 : signatureDTO.hashCode());
    }

    public final void setPropertiesItems(@NotNull LinkedHashMap<String, String> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
        this.propertiesItems = linkedHashMap;
    }

    public final void setSignature(@Nullable SignatureDTO signatureDTO) {
        this.signature = signatureDTO;
    }

    @NotNull
    public String toString() {
        return "PropertiesDTO(propertiesItems=" + this.propertiesItems + ", signature=" + this.signature + ")";
    }
}
