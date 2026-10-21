package com.bbva.gp2.android.product.trustdevice.plugin.request;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreRegisterRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/request/PreRegisterRequest;", "", "pkcs7", "", "deviceRequest", "Lcom/bbva/gp2/android/product/trustdevice/plugin/request/DeviceRequest;", "(Ljava/lang/String;Lcom/bbva/gp2/android/product/trustdevice/plugin/request/DeviceRequest;)V", "getDeviceRequest", "()Lcom/bbva/gp2/android/product/trustdevice/plugin/request/DeviceRequest;", "getPkcs7", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final /* data */ class PreRegisterRequest {

    @NotNull
    private final DeviceRequest deviceRequest;

    @NotNull
    private final String pkcs7;

    public PreRegisterRequest(@NotNull String str, @NotNull DeviceRequest deviceRequest) {
        this.pkcs7 = str;
        this.deviceRequest = deviceRequest;
    }

    public static /* synthetic */ PreRegisterRequest copy$default(PreRegisterRequest preRegisterRequest, String str, DeviceRequest deviceRequest, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = preRegisterRequest.pkcs7;
        }
        if ((i10 & 2) != 0) {
            deviceRequest = preRegisterRequest.deviceRequest;
        }
        return preRegisterRequest.copy(str, deviceRequest);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPkcs7() {
        return this.pkcs7;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceRequest getDeviceRequest() {
        return this.deviceRequest;
    }

    @NotNull
    public final PreRegisterRequest copy(@NotNull String pkcs7, @NotNull DeviceRequest deviceRequest) {
        return new PreRegisterRequest(pkcs7, deviceRequest);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreRegisterRequest)) {
            return false;
        }
        PreRegisterRequest preRegisterRequest = (PreRegisterRequest) other;
        return Intrinsics.areEqual(this.pkcs7, preRegisterRequest.pkcs7) && Intrinsics.areEqual(this.deviceRequest, preRegisterRequest.deviceRequest);
    }

    @NotNull
    public final DeviceRequest getDeviceRequest() {
        return this.deviceRequest;
    }

    @NotNull
    public final String getPkcs7() {
        return this.pkcs7;
    }

    public int hashCode() {
        String str = this.pkcs7;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        DeviceRequest deviceRequest = this.deviceRequest;
        return iHashCode + (deviceRequest != null ? deviceRequest.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PreRegisterRequest(pkcs7=" + this.pkcs7 + ", deviceRequest=" + this.deviceRequest + ")";
    }
}
