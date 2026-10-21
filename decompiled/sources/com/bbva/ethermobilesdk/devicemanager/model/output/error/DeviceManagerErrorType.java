package com.bbva.ethermobilesdk.devicemanager.model.output.error;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerErrorType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "Unknown", "DeviceIdInvalid", "DeviceUIdInvalid", "DeviceInfoInvalid", "GeolocationInvalid", "PermissionNotGranted", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$DeviceIdInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$DeviceInfoInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$DeviceUIdInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$GeolocationInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$PermissionNotGranted;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$Unknown;", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceManagerErrorType {

    @Nullable
    private final String error;

    /* JADX INFO: compiled from: DeviceManagerErrorType.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$DeviceIdInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceIdInvalid extends DeviceManagerErrorType {

        @NotNull
        public static final DeviceIdInvalid INSTANCE = new DeviceIdInvalid();

        private DeviceIdInvalid() {
            super("Invalid device id and alternative device id", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceIdInvalid)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 290562964;
        }

        @NotNull
        public String toString() {
            return "DeviceIdInvalid";
        }
    }

    /* JADX INFO: compiled from: DeviceManagerErrorType.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$DeviceInfoInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceInfoInvalid extends DeviceManagerErrorType {

        @NotNull
        public static final DeviceInfoInvalid INSTANCE = new DeviceInfoInvalid();

        private DeviceInfoInvalid() {
            super("Invalid device info value", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceInfoInvalid)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1942535519;
        }

        @NotNull
        public String toString() {
            return "DeviceInfoInvalid";
        }
    }

    /* JADX INFO: compiled from: DeviceManagerErrorType.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$DeviceUIdInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceUIdInvalid extends DeviceManagerErrorType {

        @NotNull
        public static final DeviceUIdInvalid INSTANCE = new DeviceUIdInvalid();

        private DeviceUIdInvalid() {
            super("Invalid device uid", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceUIdInvalid)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 739362607;
        }

        @NotNull
        public String toString() {
            return "DeviceUIdInvalid";
        }
    }

    /* JADX INFO: compiled from: DeviceManagerErrorType.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$GeolocationInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GeolocationInvalid extends DeviceManagerErrorType {

        @NotNull
        public static final GeolocationInvalid INSTANCE = new GeolocationInvalid();

        private GeolocationInvalid() {
            super("Invalid geolocation value", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GeolocationInvalid)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1224503651;
        }

        @NotNull
        public String toString() {
            return "GeolocationInvalid";
        }
    }

    /* JADX INFO: compiled from: DeviceManagerErrorType.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$PermissionNotGranted;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionNotGranted extends DeviceManagerErrorType {

        @NotNull
        public static final PermissionNotGranted INSTANCE = new PermissionNotGranted();

        private PermissionNotGranted() {
            super("Permission not granted", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PermissionNotGranted)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1666996375;
        }

        @NotNull
        public String toString() {
            return "PermissionNotGranted";
        }
    }

    /* JADX INFO: compiled from: DeviceManagerErrorType.kt */
    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType$Unknown;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "<init>", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends DeviceManagerErrorType {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("Unknown error", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unknown)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1405731640;
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }
    }

    public /* synthetic */ DeviceManagerErrorType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    private DeviceManagerErrorType(String str) {
        this.error = str;
    }

    public /* synthetic */ DeviceManagerErrorType(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, null);
    }
}
