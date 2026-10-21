package com.bbva.sdkcatalog.openpay.plugin.data.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceDTOModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/model/DeviceDTOModel;", "", "name", "", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAddress", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceDTOModel {

    @NotNull
    private final String address;

    @NotNull
    private final String name;

    public DeviceDTOModel(@NotNull String name, @NotNull String address) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.name = name;
        this.address = address;
    }

    public static /* synthetic */ DeviceDTOModel copy$default(DeviceDTOModel deviceDTOModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceDTOModel.name;
        }
        if ((i10 & 2) != 0) {
            str2 = deviceDTOModel.address;
        }
        return deviceDTOModel.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final DeviceDTOModel copy(@NotNull String name, @NotNull String address) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        return new DeviceDTOModel(name, address);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDTOModel)) {
            return false;
        }
        DeviceDTOModel deviceDTOModel = (DeviceDTOModel) other;
        return Intrinsics.areEqual(this.name, deviceDTOModel.name) && Intrinsics.areEqual(this.address, deviceDTOModel.address);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.address.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("DeviceDTOModel(name=", this.name, ", address=", this.address, ")");
    }
}
