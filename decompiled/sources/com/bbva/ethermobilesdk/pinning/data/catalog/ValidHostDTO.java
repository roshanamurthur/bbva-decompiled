package com.bbva.ethermobilesdk.pinning.data.catalog;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: ValidHostDTO.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/data/catalog/ValidHostDTO;", "", "hostItems", "", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/HostDTO;", "(Ljava/util/List;)V", "getHostItems", "()Ljava/util/List;", "setHostItems", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Root(name = "validhosts", strict = false)
public final /* data */ class ValidHostDTO {

    @NotNull
    @ElementList(entry = "host", inline = true)
    private List<HostDTO> hostItems;

    public ValidHostDTO(@NotNull @ElementList(entry = "host", inline = true) List<HostDTO> hostItems) {
        Intrinsics.checkNotNullParameter(hostItems, "hostItems");
        this.hostItems = hostItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValidHostDTO copy$default(ValidHostDTO validHostDTO, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = validHostDTO.hostItems;
        }
        return validHostDTO.copy(list);
    }

    @NotNull
    public final List<HostDTO> component1() {
        return this.hostItems;
    }

    @NotNull
    public final ValidHostDTO copy(@NotNull @ElementList(entry = "host", inline = true) List<HostDTO> hostItems) {
        Intrinsics.checkNotNullParameter(hostItems, "hostItems");
        return new ValidHostDTO(hostItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ValidHostDTO) && Intrinsics.areEqual(this.hostItems, ((ValidHostDTO) other).hostItems);
    }

    @NotNull
    public final List<HostDTO> getHostItems() {
        return this.hostItems;
    }

    public int hashCode() {
        return this.hostItems.hashCode();
    }

    public final void setHostItems(@NotNull List<HostDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.hostItems = list;
    }

    @NotNull
    public String toString() {
        return "ValidHostDTO(hostItems=" + this.hostItems + ")";
    }
}
