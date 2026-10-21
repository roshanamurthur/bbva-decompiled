package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GatewayResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/GatewayResponseDto;", "", "code", "", "emvTerminalDataResponse", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/EmvTerminalDataResponseDto;", "(Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/EmvTerminalDataResponseDto;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getEmvTerminalDataResponse", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/EmvTerminalDataResponseDto;", "setEmvTerminalDataResponse", "(Lmx/openpay/library/data/datasource/remote/model/response/eglobal/EmvTerminalDataResponseDto;)V", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GatewayResponseDto {

    @SerializedName("code")
    @NotNull
    private String code;

    @SerializedName("emv_terminal_data")
    @Nullable
    private EmvTerminalDataResponseDto emvTerminalDataResponse;

    /* JADX WARN: Multi-variable type inference failed */
    public GatewayResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GatewayResponseDto copy$default(GatewayResponseDto gatewayResponseDto, String str, EmvTerminalDataResponseDto emvTerminalDataResponseDto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gatewayResponseDto.code;
        }
        if ((i10 & 2) != 0) {
            emvTerminalDataResponseDto = gatewayResponseDto.emvTerminalDataResponse;
        }
        return gatewayResponseDto.copy(str, emvTerminalDataResponseDto);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EmvTerminalDataResponseDto getEmvTerminalDataResponse() {
        return this.emvTerminalDataResponse;
    }

    @NotNull
    public final GatewayResponseDto copy(@NotNull String code, @Nullable EmvTerminalDataResponseDto emvTerminalDataResponse) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new GatewayResponseDto(code, emvTerminalDataResponse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GatewayResponseDto)) {
            return false;
        }
        GatewayResponseDto gatewayResponseDto = (GatewayResponseDto) other;
        return Intrinsics.areEqual(this.code, gatewayResponseDto.code) && Intrinsics.areEqual(this.emvTerminalDataResponse, gatewayResponseDto.emvTerminalDataResponse);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final EmvTerminalDataResponseDto getEmvTerminalDataResponse() {
        return this.emvTerminalDataResponse;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        EmvTerminalDataResponseDto emvTerminalDataResponseDto = this.emvTerminalDataResponse;
        return iHashCode + (emvTerminalDataResponseDto == null ? 0 : emvTerminalDataResponseDto.hashCode());
    }

    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setEmvTerminalDataResponse(@Nullable EmvTerminalDataResponseDto emvTerminalDataResponseDto) {
        this.emvTerminalDataResponse = emvTerminalDataResponseDto;
    }

    @NotNull
    public String toString() {
        return "GatewayResponseDto(code=" + this.code + ", emvTerminalDataResponse=" + this.emvTerminalDataResponse + ")";
    }

    public GatewayResponseDto(@NotNull String code, @Nullable EmvTerminalDataResponseDto emvTerminalDataResponseDto) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.emvTerminalDataResponse = emvTerminalDataResponseDto;
    }

    public /* synthetic */ GatewayResponseDto(String str, EmvTerminalDataResponseDto emvTerminalDataResponseDto, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "05" : str, (i10 & 2) != 0 ? null : emvTerminalDataResponseDto);
    }
}
