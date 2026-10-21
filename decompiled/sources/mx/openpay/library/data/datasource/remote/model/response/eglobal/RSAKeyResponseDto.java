package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweRSAKeyPairCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RSAKeyResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RSAKeyResponseDto;", "", "keyName", "", JweRSAKeyPairCommand.RSA, "slotKey", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getKeyName", "()Ljava/lang/String;", "getRsa", "getSlotKey", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RSAKeyResponseDto;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RSAKeyResponseDto {

    @SerializedName("key_name")
    @NotNull
    private final String keyName;

    @SerializedName(JweRSAKeyPairCommand.RSA)
    @Nullable
    private final String rsa;

    @SerializedName("slot_key")
    @Nullable
    private final Integer slotKey;

    public RSAKeyResponseDto(@NotNull String keyName, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        this.keyName = keyName;
        this.rsa = str;
        this.slotKey = num;
    }

    public static /* synthetic */ RSAKeyResponseDto copy$default(RSAKeyResponseDto rSAKeyResponseDto, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rSAKeyResponseDto.keyName;
        }
        if ((i10 & 2) != 0) {
            str2 = rSAKeyResponseDto.rsa;
        }
        if ((i10 & 4) != 0) {
            num = rSAKeyResponseDto.slotKey;
        }
        return rSAKeyResponseDto.copy(str, str2, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyName() {
        return this.keyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRsa() {
        return this.rsa;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSlotKey() {
        return this.slotKey;
    }

    @NotNull
    public final RSAKeyResponseDto copy(@NotNull String keyName, @Nullable String rsa, @Nullable Integer slotKey) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        return new RSAKeyResponseDto(keyName, rsa, slotKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RSAKeyResponseDto)) {
            return false;
        }
        RSAKeyResponseDto rSAKeyResponseDto = (RSAKeyResponseDto) other;
        return Intrinsics.areEqual(this.keyName, rSAKeyResponseDto.keyName) && Intrinsics.areEqual(this.rsa, rSAKeyResponseDto.rsa) && Intrinsics.areEqual(this.slotKey, rSAKeyResponseDto.slotKey);
    }

    @NotNull
    public final String getKeyName() {
        return this.keyName;
    }

    @Nullable
    public final String getRsa() {
        return this.rsa;
    }

    @Nullable
    public final Integer getSlotKey() {
        return this.slotKey;
    }

    public int hashCode() {
        int iHashCode = this.keyName.hashCode() * 31;
        String str = this.rsa;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.slotKey;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.keyName;
        String str2 = this.rsa;
        Integer num = this.slotKey;
        StringBuilder sbC = a.c("RSAKeyResponseDto(keyName=", str, ", rsa=", str2, ", slotKey=");
        sbC.append(num);
        sbC.append(")");
        return sbC.toString();
    }
}
