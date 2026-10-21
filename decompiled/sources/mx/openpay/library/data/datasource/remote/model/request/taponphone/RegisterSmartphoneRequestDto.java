package mx.openpay.library.data.datasource.remote.model.request.taponphone;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RegisterSmartphoneRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/taponphone/RegisterSmartphoneRequestDto;", "", "ptid", "", "modelName", "(Ljava/lang/String;Ljava/lang/String;)V", "getModelName", "()Ljava/lang/String;", "getPtid", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RegisterSmartphoneRequestDto {

    @SerializedName("model_name")
    @NotNull
    private final String modelName;

    @SerializedName("ptid")
    @NotNull
    private final String ptid;

    public RegisterSmartphoneRequestDto(@NotNull String ptid, @NotNull String modelName) {
        Intrinsics.checkNotNullParameter(ptid, "ptid");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        this.ptid = ptid;
        this.modelName = modelName;
    }

    public static /* synthetic */ RegisterSmartphoneRequestDto copy$default(RegisterSmartphoneRequestDto registerSmartphoneRequestDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = registerSmartphoneRequestDto.ptid;
        }
        if ((i10 & 2) != 0) {
            str2 = registerSmartphoneRequestDto.modelName;
        }
        return registerSmartphoneRequestDto.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPtid() {
        return this.ptid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModelName() {
        return this.modelName;
    }

    @NotNull
    public final RegisterSmartphoneRequestDto copy(@NotNull String ptid, @NotNull String modelName) {
        Intrinsics.checkNotNullParameter(ptid, "ptid");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        return new RegisterSmartphoneRequestDto(ptid, modelName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterSmartphoneRequestDto)) {
            return false;
        }
        RegisterSmartphoneRequestDto registerSmartphoneRequestDto = (RegisterSmartphoneRequestDto) other;
        return Intrinsics.areEqual(this.ptid, registerSmartphoneRequestDto.ptid) && Intrinsics.areEqual(this.modelName, registerSmartphoneRequestDto.modelName);
    }

    @NotNull
    public final String getModelName() {
        return this.modelName;
    }

    @NotNull
    public final String getPtid() {
        return this.ptid;
    }

    public int hashCode() {
        return this.modelName.hashCode() + (this.ptid.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("RegisterSmartphoneRequestDto(ptid=", this.ptid, ", modelName=", this.modelName, ")");
    }
}
