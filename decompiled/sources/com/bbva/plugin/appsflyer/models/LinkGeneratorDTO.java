package com.bbva.plugin.appsflyer.models;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/appsflyer/models/LinkGeneratorDTO;", "", "dataLinkGenerator", "", "", "(Ljava/util/Map;)V", "getDataLinkGenerator", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "appsflyer-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LinkGeneratorDTO {

    @NotNull
    private final Map<String, Object> dataLinkGenerator;

    public LinkGeneratorDTO(@NotNull Map<String, ? extends Object> dataLinkGenerator) {
        Intrinsics.checkNotNullParameter(dataLinkGenerator, "dataLinkGenerator");
        this.dataLinkGenerator = dataLinkGenerator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkGeneratorDTO copy$default(LinkGeneratorDTO linkGeneratorDTO, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = linkGeneratorDTO.dataLinkGenerator;
        }
        return linkGeneratorDTO.copy(map);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.dataLinkGenerator;
    }

    @NotNull
    public final LinkGeneratorDTO copy(@NotNull Map<String, ? extends Object> dataLinkGenerator) {
        Intrinsics.checkNotNullParameter(dataLinkGenerator, "dataLinkGenerator");
        return new LinkGeneratorDTO(dataLinkGenerator);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LinkGeneratorDTO) && Intrinsics.areEqual(this.dataLinkGenerator, ((LinkGeneratorDTO) other).dataLinkGenerator);
    }

    @NotNull
    public final Map<String, Object> getDataLinkGenerator() {
        return this.dataLinkGenerator;
    }

    public int hashCode() {
        return this.dataLinkGenerator.hashCode();
    }

    @NotNull
    public String toString() {
        return "LinkGeneratorDTO(dataLinkGenerator=" + this.dataLinkGenerator + ")";
    }
}
