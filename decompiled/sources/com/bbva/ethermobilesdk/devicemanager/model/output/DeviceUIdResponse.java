package com.bbva.ethermobilesdk.devicemanager.model.output;

import androidx.annotation.Keep;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceUIdResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceUIdResponse;", "", "uid", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;)V", "getUid", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceUIdResponse {

    @NotNull
    private final Result<String> uid;

    public DeviceUIdResponse(@NotNull Result<String> uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.uid = uid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceUIdResponse copy$default(DeviceUIdResponse deviceUIdResponse, Result result, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            result = deviceUIdResponse.uid;
        }
        return deviceUIdResponse.copy(result);
    }

    @NotNull
    public final Result<String> component1() {
        return this.uid;
    }

    @NotNull
    public final DeviceUIdResponse copy(@NotNull Result<String> uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return new DeviceUIdResponse(uid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceUIdResponse) && Intrinsics.areEqual(this.uid, ((DeviceUIdResponse) other).uid);
    }

    @NotNull
    public final Result<String> getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.uid.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceUIdResponse(uid=" + this.uid + ")";
    }
}
