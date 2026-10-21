package mx.openpay.library.data.datasource.remote.model.request.eglobal;

import ad.d;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetMerchantRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/eglobal/GetMerchantRequestDto;", "", "countBines", "", "version", "", DigipassManagerConstants.KEY_SERIAL_NUMBER, "(ILjava/lang/String;Ljava/lang/String;)V", "getCountBines", "()I", "getSerialNumber", "()Ljava/lang/String;", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GetMerchantRequestDto {

    @SerializedName("count_bines")
    private final int countBines;

    @SerializedName("serial_number")
    @NotNull
    private final String serialNumber;

    @SerializedName("version")
    @Nullable
    private final String version;

    public GetMerchantRequestDto(int i10, @Nullable String str, @NotNull String serialNumber) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.countBines = i10;
        this.version = str;
        this.serialNumber = serialNumber;
    }

    public static /* synthetic */ GetMerchantRequestDto copy$default(GetMerchantRequestDto getMerchantRequestDto, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = getMerchantRequestDto.countBines;
        }
        if ((i11 & 2) != 0) {
            str = getMerchantRequestDto.version;
        }
        if ((i11 & 4) != 0) {
            str2 = getMerchantRequestDto.serialNumber;
        }
        return getMerchantRequestDto.copy(i10, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCountBines() {
        return this.countBines;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    public final GetMerchantRequestDto copy(int countBines, @Nullable String version, @NotNull String serialNumber) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return new GetMerchantRequestDto(countBines, version, serialNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetMerchantRequestDto)) {
            return false;
        }
        GetMerchantRequestDto getMerchantRequestDto = (GetMerchantRequestDto) other;
        return this.countBines == getMerchantRequestDto.countBines && Intrinsics.areEqual(this.version, getMerchantRequestDto.version) && Intrinsics.areEqual(this.serialNumber, getMerchantRequestDto.serialNumber);
    }

    public final int getCountBines() {
        return this.countBines;
    }

    @NotNull
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i10 = this.countBines * 31;
        String str = this.version;
        return this.serialNumber.hashCode() + ((i10 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.countBines;
        String str = this.version;
        return d.f(v.e("GetMerchantRequestDto(countBines=", i10, ", version=", str, ", serialNumber="), this.serialNumber, ")");
    }
}
