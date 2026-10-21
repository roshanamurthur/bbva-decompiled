package com.bbva.ethermobilesdk.pinning.data.catalog;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX INFO: compiled from: SignatureDTO.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/data/catalog/SignatureDTO;", "", "timestamp", "", "value", "", "(JLjava/lang/String;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Root(name = "signature", strict = false)
public final /* data */ class SignatureDTO {

    @Attribute(name = "timestamp")
    private long timestamp;

    @Text
    @NotNull
    private String value;

    public SignatureDTO(@Attribute(name = "timestamp") long j10, @Text @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.timestamp = j10;
        this.value = value;
    }

    public static /* synthetic */ SignatureDTO copy$default(SignatureDTO signatureDTO, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = signatureDTO.timestamp;
        }
        if ((i10 & 2) != 0) {
            str = signatureDTO.value;
        }
        return signatureDTO.copy(j10, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final SignatureDTO copy(@Attribute(name = "timestamp") long timestamp, @Text @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new SignatureDTO(timestamp, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignatureDTO)) {
            return false;
        }
        SignatureDTO signatureDTO = (SignatureDTO) other;
        return this.timestamp == signatureDTO.timestamp && Intrinsics.areEqual(this.value, signatureDTO.value);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        long j10 = this.timestamp;
        return this.value.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "SignatureDTO(timestamp=" + this.timestamp + ", value=" + this.value + ")";
    }
}
