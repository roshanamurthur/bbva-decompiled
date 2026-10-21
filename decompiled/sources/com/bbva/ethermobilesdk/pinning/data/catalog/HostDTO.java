package com.bbva.ethermobilesdk.pinning.data.catalog;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX INFO: compiled from: HostDTO.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/data/catalog/HostDTO;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Root(name = "host", strict = false)
public final /* data */ class HostDTO {

    @Text
    @NotNull
    private String value;

    public HostDTO(@Text @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public static /* synthetic */ HostDTO copy$default(HostDTO hostDTO, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hostDTO.value;
        }
        return hostDTO.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final HostDTO copy(@Text @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new HostDTO(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HostDTO) && Intrinsics.areEqual(this.value, ((HostDTO) other).value);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @NotNull
    public String toString() {
        return h0.b("HostDTO(value=", this.value, ")");
    }
}
