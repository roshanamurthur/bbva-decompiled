package com.bbva.plugin.google.pay.request;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.google.pay.GoogleTapAndPay;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PushProvisioningRequest.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/bbva/plugin/google/pay/request/PushProvisioningRequest;", "", GoogleTapAndPay.KEY_PAN, "", GoogleTapAndPay.KEY_ALIAS, "brand", "activationData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivationData", "()Ljava/lang/String;", "getAlias", "getBrand", "getPan", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PushProvisioningRequest {

    @NotNull
    private final String activationData;

    @NotNull
    private final String alias;

    @NotNull
    private final String brand;

    @NotNull
    private final String pan;

    public PushProvisioningRequest(@NotNull String pan, @NotNull String alias, @NotNull String brand, @NotNull String activationData) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(activationData, "activationData");
        this.pan = pan;
        this.alias = alias;
        this.brand = brand;
        this.activationData = activationData;
    }

    public static /* synthetic */ PushProvisioningRequest copy$default(PushProvisioningRequest pushProvisioningRequest, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pushProvisioningRequest.pan;
        }
        if ((i10 & 2) != 0) {
            str2 = pushProvisioningRequest.alias;
        }
        if ((i10 & 4) != 0) {
            str3 = pushProvisioningRequest.brand;
        }
        if ((i10 & 8) != 0) {
            str4 = pushProvisioningRequest.activationData;
        }
        return pushProvisioningRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActivationData() {
        return this.activationData;
    }

    @NotNull
    public final PushProvisioningRequest copy(@NotNull String pan, @NotNull String alias, @NotNull String brand, @NotNull String activationData) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(activationData, "activationData");
        return new PushProvisioningRequest(pan, alias, brand, activationData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushProvisioningRequest)) {
            return false;
        }
        PushProvisioningRequest pushProvisioningRequest = (PushProvisioningRequest) other;
        return Intrinsics.areEqual(this.pan, pushProvisioningRequest.pan) && Intrinsics.areEqual(this.alias, pushProvisioningRequest.alias) && Intrinsics.areEqual(this.brand, pushProvisioningRequest.brand) && Intrinsics.areEqual(this.activationData, pushProvisioningRequest.activationData);
    }

    @NotNull
    public final String getActivationData() {
        return this.activationData;
    }

    @NotNull
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final String getPan() {
        return this.pan;
    }

    public int hashCode() {
        return this.activationData.hashCode() + n1.c(this.brand, n1.c(this.alias, this.pan.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PushProvisioningRequest(pan=");
        sb2.append(this.pan);
        sb2.append(", alias=");
        sb2.append(this.alias);
        sb2.append(", brand=");
        sb2.append(this.brand);
        sb2.append(", activationData=");
        return y2.b(sb2, this.activationData, RootService.CLOSE_BRACKET);
    }
}
