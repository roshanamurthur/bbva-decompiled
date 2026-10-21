package com.bbva.gp2.android.trustdevice.sdk.export.request;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreRegisterRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005HÂ\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/request/PreRegisterRequest;", "", Constants.device, "Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Device;", "country", "Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Country;", "(Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Device;Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Country;)V", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Builder", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PreRegisterRequest {

    @Nullable
    private final Country country;

    @Nullable
    private final Device device;

    /* JADX INFO: compiled from: PreRegisterRequest.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/request/PreRegisterRequest$Builder;", "", "()V", "country", "Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Country;", Constants.device, "Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Device;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/bbva/gp2/android/trustdevice/sdk/export/request/PreRegisterRequest;", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private Country country;

        @Nullable
        private Device device;

        @NotNull
        public final PreRegisterRequest build() {
            return new PreRegisterRequest(this.device, this.country);
        }

        @NotNull
        public final Builder country(@NotNull Country country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.country = country;
            return this;
        }

        @NotNull
        public final Builder device(@NotNull Device device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.device = device;
            return this;
        }
    }

    public PreRegisterRequest(@Nullable Device device, @Nullable Country country) {
        this.device = device;
        this.country = country;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final Device getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final Country getCountry() {
        return this.country;
    }

    public static /* synthetic */ PreRegisterRequest copy$default(PreRegisterRequest preRegisterRequest, Device device, Country country, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            device = preRegisterRequest.device;
        }
        if ((i10 & 2) != 0) {
            country = preRegisterRequest.country;
        }
        return preRegisterRequest.copy(device, country);
    }

    @NotNull
    public final PreRegisterRequest copy(@Nullable Device device, @Nullable Country country) {
        return new PreRegisterRequest(device, country);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreRegisterRequest)) {
            return false;
        }
        PreRegisterRequest preRegisterRequest = (PreRegisterRequest) other;
        return Intrinsics.areEqual(this.device, preRegisterRequest.device) && Intrinsics.areEqual(this.country, preRegisterRequest.country);
    }

    public int hashCode() {
        Device device = this.device;
        int iHashCode = (device == null ? 0 : device.hashCode()) * 31;
        Country country = this.country;
        return iHashCode + (country != null ? country.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PreRegisterRequest(device=" + this.device + ", country=" + this.country + RootService.CLOSE_BRACKET;
    }
}
