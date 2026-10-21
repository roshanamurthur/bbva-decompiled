package mx.openpay.library.data.datasource.remote.model.request.eglobal;

import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FirmwareUpdateStatusRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/eglobal/FirmwareUpdateStatusRequestDto;", "", "firmwareVersion", "", "(Ljava/lang/String;)V", "getFirmwareVersion", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FirmwareUpdateStatusRequestDto {

    @SerializedName("firmware_version")
    @NotNull
    private final String firmwareVersion;

    public FirmwareUpdateStatusRequestDto(@NotNull String firmwareVersion) {
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        this.firmwareVersion = firmwareVersion;
    }

    public static /* synthetic */ FirmwareUpdateStatusRequestDto copy$default(FirmwareUpdateStatusRequestDto firmwareUpdateStatusRequestDto, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = firmwareUpdateStatusRequestDto.firmwareVersion;
        }
        return firmwareUpdateStatusRequestDto.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final FirmwareUpdateStatusRequestDto copy(@NotNull String firmwareVersion) {
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        return new FirmwareUpdateStatusRequestDto(firmwareVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FirmwareUpdateStatusRequestDto) && Intrinsics.areEqual(this.firmwareVersion, ((FirmwareUpdateStatusRequestDto) other).firmwareVersion);
    }

    @NotNull
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public int hashCode() {
        return this.firmwareVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("FirmwareUpdateStatusRequestDto(firmwareVersion=", this.firmwareVersion, ")");
    }
}
