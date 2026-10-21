package com.bbva.gp2.android.trustdevice.sdk.export.request;

import com.bbva.component.dm.naturalauth.Constants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreRegisterRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0014BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Device;", "", "id", "", Constants.deviceType, "model", "os", ContextualDataConstants.CD_OS_VERSION, "hasNFC", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDeviceType", "()Ljava/lang/String;", "getHasNFC", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "getModel", "getOs", "getOsVersion", "Builder", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Device {

    @Nullable
    private final String deviceType;

    @Nullable
    private final Boolean hasNFC;

    @Nullable
    private final String id;

    @Nullable
    private final String model;

    @Nullable
    private final String os;

    @Nullable
    private final String osVersion;

    /* JADX INFO: compiled from: PreRegisterRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Device$Builder;", "", "()V", Constants.deviceType, "", "hasNFC", "", "Ljava/lang/Boolean;", "id", "model", "os", ContextualDataConstants.CD_OS_VERSION, JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Device;", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private String deviceType;

        @Nullable
        private Boolean hasNFC;

        @Nullable
        private String id;

        @Nullable
        private String model;

        @Nullable
        private String os;

        @Nullable
        private String osVersion;

        @NotNull
        public final Device build() {
            return new Device(this.id, this.deviceType, this.model, this.os, this.osVersion, this.hasNFC);
        }

        @NotNull
        public final Builder deviceType(@NotNull String deviceType) {
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            this.deviceType = deviceType;
            return this;
        }

        @NotNull
        public final Builder hasNFC(boolean hasNFC) {
            this.hasNFC = Boolean.valueOf(hasNFC);
            return this;
        }

        @NotNull
        public final Builder id(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            return this;
        }

        @NotNull
        public final Builder model(@NotNull String model) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
            return this;
        }

        @NotNull
        public final Builder os(@NotNull String os) {
            Intrinsics.checkNotNullParameter(os, "os");
            this.os = os;
            return this;
        }

        @NotNull
        public final Builder osVersion(@NotNull String osVersion) {
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            this.osVersion = osVersion;
            return this;
        }
    }

    public Device(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool) {
        this.id = str;
        this.deviceType = str2;
        this.model = str3;
        this.os = str4;
        this.osVersion = str5;
        this.hasNFC = bool;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final Boolean getHasNFC() {
        return this.hasNFC;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getOs() {
        return this.os;
    }

    @Nullable
    public final String getOsVersion() {
        return this.osVersion;
    }
}
