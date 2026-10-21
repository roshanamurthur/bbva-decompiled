package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MerchantResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/MerchantResponseDto;", "", "merchantName", "", "slotKey", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/SlotKeyDto;", "updateBines", "", "updateVersion", "firmwareVersion", "(Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/SlotKeyDto;ZZLjava/lang/String;)V", "getFirmwareVersion", "()Ljava/lang/String;", "getMerchantName", "getSlotKey", "()Lmx/openpay/library/data/datasource/remote/model/response/eglobal/SlotKeyDto;", "getUpdateBines", "()Z", "getUpdateVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MerchantResponseDto {

    @SerializedName("firmware_version")
    @Nullable
    private final String firmwareVersion;

    @SerializedName("merchant_name")
    @NotNull
    private final String merchantName;

    @SerializedName("slot_key")
    @NotNull
    private final SlotKeyDto slotKey;

    @SerializedName("update_bines")
    private final boolean updateBines;

    @SerializedName("update_version")
    private final boolean updateVersion;

    public MerchantResponseDto(@NotNull String merchantName, @NotNull SlotKeyDto slotKey, boolean z10, boolean z11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        this.merchantName = merchantName;
        this.slotKey = slotKey;
        this.updateBines = z10;
        this.updateVersion = z11;
        this.firmwareVersion = str;
    }

    public static /* synthetic */ MerchantResponseDto copy$default(MerchantResponseDto merchantResponseDto, String str, SlotKeyDto slotKeyDto, boolean z10, boolean z11, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = merchantResponseDto.merchantName;
        }
        if ((i10 & 2) != 0) {
            slotKeyDto = merchantResponseDto.slotKey;
        }
        SlotKeyDto slotKeyDto2 = slotKeyDto;
        if ((i10 & 4) != 0) {
            z10 = merchantResponseDto.updateBines;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = merchantResponseDto.updateVersion;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            str2 = merchantResponseDto.firmwareVersion;
        }
        return merchantResponseDto.copy(str, slotKeyDto2, z12, z13, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SlotKeyDto getSlotKey() {
        return this.slotKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getUpdateBines() {
        return this.updateBines;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getUpdateVersion() {
        return this.updateVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final MerchantResponseDto copy(@NotNull String merchantName, @NotNull SlotKeyDto slotKey, boolean updateBines, boolean updateVersion, @Nullable String firmwareVersion) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        return new MerchantResponseDto(merchantName, slotKey, updateBines, updateVersion, firmwareVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantResponseDto)) {
            return false;
        }
        MerchantResponseDto merchantResponseDto = (MerchantResponseDto) other;
        return Intrinsics.areEqual(this.merchantName, merchantResponseDto.merchantName) && Intrinsics.areEqual(this.slotKey, merchantResponseDto.slotKey) && this.updateBines == merchantResponseDto.updateBines && this.updateVersion == merchantResponseDto.updateVersion && Intrinsics.areEqual(this.firmwareVersion, merchantResponseDto.firmwareVersion);
    }

    @Nullable
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public final SlotKeyDto getSlotKey() {
        return this.slotKey;
    }

    public final boolean getUpdateBines() {
        return this.updateBines;
    }

    public final boolean getUpdateVersion() {
        return this.updateVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = (this.slotKey.hashCode() + (this.merchantName.hashCode() * 31)) * 31;
        boolean z10 = this.updateBines;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = (iHashCode + r1) * 31;
        boolean z11 = this.updateVersion;
        int i11 = (i10 + (z11 ? 1 : z11)) * 31;
        String str = this.firmwareVersion;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.merchantName;
        SlotKeyDto slotKeyDto = this.slotKey;
        boolean z10 = this.updateBines;
        boolean z11 = this.updateVersion;
        String str2 = this.firmwareVersion;
        StringBuilder sb2 = new StringBuilder("MerchantResponseDto(merchantName=");
        sb2.append(str);
        sb2.append(", slotKey=");
        sb2.append(slotKeyDto);
        sb2.append(", updateBines=");
        sb2.append(z10);
        sb2.append(", updateVersion=");
        sb2.append(z11);
        sb2.append(", firmwareVersion=");
        return d.f(sb2, str2, ")");
    }
}
