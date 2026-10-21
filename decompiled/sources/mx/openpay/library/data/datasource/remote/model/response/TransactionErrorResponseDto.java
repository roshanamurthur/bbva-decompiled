package mx.openpay.library.data.datasource.remote.model.response;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.GatewayResponseDto;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionErrorResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/TransactionErrorResponseDto;", "", "gatewayResponseDto", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/GatewayResponseDto;", "gatewayCode", "", "(Lmx/openpay/library/data/datasource/remote/model/response/eglobal/GatewayResponseDto;Ljava/lang/String;)V", "getGatewayCode", "()Ljava/lang/String;", "getGatewayResponseDto", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/GatewayResponseDto;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TransactionErrorResponseDto {

    @SerializedName("gateway_code")
    @Nullable
    private final String gatewayCode;

    @SerializedName("gateway_response")
    @NotNull
    private final GatewayResponseDto gatewayResponseDto;

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionErrorResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TransactionErrorResponseDto copy$default(TransactionErrorResponseDto transactionErrorResponseDto, GatewayResponseDto gatewayResponseDto, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gatewayResponseDto = transactionErrorResponseDto.gatewayResponseDto;
        }
        if ((i10 & 2) != 0) {
            str = transactionErrorResponseDto.gatewayCode;
        }
        return transactionErrorResponseDto.copy(gatewayResponseDto, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GatewayResponseDto getGatewayResponseDto() {
        return this.gatewayResponseDto;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGatewayCode() {
        return this.gatewayCode;
    }

    @NotNull
    public final TransactionErrorResponseDto copy(@NotNull GatewayResponseDto gatewayResponseDto, @Nullable String gatewayCode) {
        Intrinsics.checkNotNullParameter(gatewayResponseDto, "gatewayResponseDto");
        return new TransactionErrorResponseDto(gatewayResponseDto, gatewayCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionErrorResponseDto)) {
            return false;
        }
        TransactionErrorResponseDto transactionErrorResponseDto = (TransactionErrorResponseDto) other;
        return Intrinsics.areEqual(this.gatewayResponseDto, transactionErrorResponseDto.gatewayResponseDto) && Intrinsics.areEqual(this.gatewayCode, transactionErrorResponseDto.gatewayCode);
    }

    @Nullable
    public final String getGatewayCode() {
        return this.gatewayCode;
    }

    @NotNull
    public final GatewayResponseDto getGatewayResponseDto() {
        return this.gatewayResponseDto;
    }

    public int hashCode() {
        int iHashCode = this.gatewayResponseDto.hashCode() * 31;
        String str = this.gatewayCode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "TransactionErrorResponseDto(gatewayResponseDto=" + this.gatewayResponseDto + ", gatewayCode=" + this.gatewayCode + ")";
    }

    public TransactionErrorResponseDto(@NotNull GatewayResponseDto gatewayResponseDto, @Nullable String str) {
        Intrinsics.checkNotNullParameter(gatewayResponseDto, "gatewayResponseDto");
        this.gatewayResponseDto = gatewayResponseDto;
        this.gatewayCode = str;
    }

    public /* synthetic */ TransactionErrorResponseDto(GatewayResponseDto gatewayResponseDto, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new GatewayResponseDto(null, null, 3, null) : gatewayResponseDto, (i10 & 2) != 0 ? null : str);
    }
}
