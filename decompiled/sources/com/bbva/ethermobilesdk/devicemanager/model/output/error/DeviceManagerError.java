package com.bbva.ethermobilesdk.devicemanager.model.output.error;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004\f\r\u000e\u000fB\u001d\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "DeviceIdError", "DeviceUIdError", "DeviceInfoError", "GeolocationError", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DeviceManagerError extends Exception implements Serializable {

    @Nullable
    private final Throwable cause;

    /* JADX INFO: compiled from: DeviceManagerError.kt */
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceIdError;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "DeviceIdInvalid", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceIdError$DeviceIdInvalid;", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DeviceIdError extends DeviceManagerError {

        @Nullable
        private final Throwable cause;

        /* JADX INFO: compiled from: DeviceManagerError.kt */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceIdError$DeviceIdInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceIdError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getType", "()Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DeviceIdInvalid extends DeviceIdError {

            @Nullable
            private final Throwable cause;

            @NotNull
            private final DeviceManagerErrorType type;

            /* JADX WARN: Multi-variable type inference failed */
            public DeviceIdInvalid() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ DeviceIdInvalid copy$default(DeviceIdInvalid deviceIdInvalid, DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    deviceManagerErrorType = deviceIdInvalid.type;
                }
                if ((i10 & 2) != 0) {
                    th2 = deviceIdInvalid.cause;
                }
                return deviceIdInvalid.copy(deviceManagerErrorType, th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final DeviceIdInvalid copy(@NotNull DeviceManagerErrorType type, @Nullable Throwable cause) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new DeviceIdInvalid(type, cause);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeviceIdInvalid)) {
                    return false;
                }
                DeviceIdInvalid deviceIdInvalid = (DeviceIdInvalid) other;
                return Intrinsics.areEqual(this.type, deviceIdInvalid.type) && Intrinsics.areEqual(this.cause, deviceIdInvalid.cause);
            }

            @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError.DeviceIdError, com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
            @Nullable
            public Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Throwable th2 = this.cause;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return "DeviceIdInvalid(type=" + this.type + ", cause=" + this.cause + ")";
            }

            public /* synthetic */ DeviceIdInvalid(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? DeviceManagerErrorType.DeviceIdInvalid.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeviceIdInvalid(@NotNull DeviceManagerErrorType type, @Nullable Throwable th2) {
                super(type, th2, null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.cause = th2;
            }
        }

        public /* synthetic */ DeviceIdError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceManagerErrorType, th2);
        }

        @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        public /* synthetic */ DeviceIdError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? DeviceManagerErrorType.Unknown.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2, null);
        }

        private DeviceIdError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2) {
            super(deviceManagerErrorType, th2);
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: DeviceManagerError.kt */
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceInfoError;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "DeviceInfoInvalid", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceInfoError$DeviceInfoInvalid;", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DeviceInfoError extends DeviceManagerError {

        @Nullable
        private final Throwable cause;

        /* JADX INFO: compiled from: DeviceManagerError.kt */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceInfoError$DeviceInfoInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceInfoError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getType", "()Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DeviceInfoInvalid extends DeviceInfoError {

            @Nullable
            private final Throwable cause;

            @NotNull
            private final DeviceManagerErrorType type;

            /* JADX WARN: Multi-variable type inference failed */
            public DeviceInfoInvalid() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ DeviceInfoInvalid copy$default(DeviceInfoInvalid deviceInfoInvalid, DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    deviceManagerErrorType = deviceInfoInvalid.type;
                }
                if ((i10 & 2) != 0) {
                    th2 = deviceInfoInvalid.cause;
                }
                return deviceInfoInvalid.copy(deviceManagerErrorType, th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final DeviceInfoInvalid copy(@NotNull DeviceManagerErrorType type, @Nullable Throwable cause) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new DeviceInfoInvalid(type, cause);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeviceInfoInvalid)) {
                    return false;
                }
                DeviceInfoInvalid deviceInfoInvalid = (DeviceInfoInvalid) other;
                return Intrinsics.areEqual(this.type, deviceInfoInvalid.type) && Intrinsics.areEqual(this.cause, deviceInfoInvalid.cause);
            }

            @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError.DeviceInfoError, com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
            @Nullable
            public Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Throwable th2 = this.cause;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return "DeviceInfoInvalid(type=" + this.type + ", cause=" + this.cause + ")";
            }

            public /* synthetic */ DeviceInfoInvalid(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? DeviceManagerErrorType.DeviceInfoInvalid.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeviceInfoInvalid(@NotNull DeviceManagerErrorType type, @Nullable Throwable th2) {
                super(type, th2, null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.cause = th2;
            }
        }

        public /* synthetic */ DeviceInfoError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceManagerErrorType, th2);
        }

        @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        public /* synthetic */ DeviceInfoError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? DeviceManagerErrorType.Unknown.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2, null);
        }

        private DeviceInfoError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2) {
            super(deviceManagerErrorType, th2);
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: DeviceManagerError.kt */
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceUIdError;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "DeviceUIdInvalid", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceUIdError$DeviceUIdInvalid;", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DeviceUIdError extends DeviceManagerError {

        @Nullable
        private final Throwable cause;

        /* JADX INFO: compiled from: DeviceManagerError.kt */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceUIdError$DeviceUIdInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$DeviceUIdError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getType", "()Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DeviceUIdInvalid extends DeviceUIdError {

            @Nullable
            private final Throwable cause;

            @NotNull
            private final DeviceManagerErrorType type;

            /* JADX WARN: Multi-variable type inference failed */
            public DeviceUIdInvalid() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ DeviceUIdInvalid copy$default(DeviceUIdInvalid deviceUIdInvalid, DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    deviceManagerErrorType = deviceUIdInvalid.type;
                }
                if ((i10 & 2) != 0) {
                    th2 = deviceUIdInvalid.cause;
                }
                return deviceUIdInvalid.copy(deviceManagerErrorType, th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final DeviceUIdInvalid copy(@NotNull DeviceManagerErrorType type, @Nullable Throwable cause) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new DeviceUIdInvalid(type, cause);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeviceUIdInvalid)) {
                    return false;
                }
                DeviceUIdInvalid deviceUIdInvalid = (DeviceUIdInvalid) other;
                return Intrinsics.areEqual(this.type, deviceUIdInvalid.type) && Intrinsics.areEqual(this.cause, deviceUIdInvalid.cause);
            }

            @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError.DeviceUIdError, com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
            @Nullable
            public Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Throwable th2 = this.cause;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return "DeviceUIdInvalid(type=" + this.type + ", cause=" + this.cause + ")";
            }

            public /* synthetic */ DeviceUIdInvalid(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? DeviceManagerErrorType.DeviceUIdInvalid.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeviceUIdInvalid(@NotNull DeviceManagerErrorType type, @Nullable Throwable th2) {
                super(type, th2, null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.cause = th2;
            }
        }

        public /* synthetic */ DeviceUIdError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceManagerErrorType, th2);
        }

        @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        public /* synthetic */ DeviceUIdError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? DeviceManagerErrorType.Unknown.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2, null);
        }

        private DeviceUIdError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2) {
            super(deviceManagerErrorType, th2);
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: DeviceManagerError.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000b\f\rB\u001f\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "AccessFineLocationNotGranted", "AccessCoarseLocationNotGranted", "GeolocationInvalid", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError$AccessCoarseLocationNotGranted;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError$AccessFineLocationNotGranted;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError$GeolocationInvalid;", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class GeolocationError extends DeviceManagerError {

        @Nullable
        private final Throwable cause;

        /* JADX INFO: compiled from: DeviceManagerError.kt */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError$AccessCoarseLocationNotGranted;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getType", "()Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AccessCoarseLocationNotGranted extends GeolocationError {

            @Nullable
            private final Throwable cause;

            @NotNull
            private final DeviceManagerErrorType type;

            /* JADX WARN: Multi-variable type inference failed */
            public AccessCoarseLocationNotGranted() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ AccessCoarseLocationNotGranted copy$default(AccessCoarseLocationNotGranted accessCoarseLocationNotGranted, DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    deviceManagerErrorType = accessCoarseLocationNotGranted.type;
                }
                if ((i10 & 2) != 0) {
                    th2 = accessCoarseLocationNotGranted.cause;
                }
                return accessCoarseLocationNotGranted.copy(deviceManagerErrorType, th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final AccessCoarseLocationNotGranted copy(@NotNull DeviceManagerErrorType type, @Nullable Throwable cause) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new AccessCoarseLocationNotGranted(type, cause);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccessCoarseLocationNotGranted)) {
                    return false;
                }
                AccessCoarseLocationNotGranted accessCoarseLocationNotGranted = (AccessCoarseLocationNotGranted) other;
                return Intrinsics.areEqual(this.type, accessCoarseLocationNotGranted.type) && Intrinsics.areEqual(this.cause, accessCoarseLocationNotGranted.cause);
            }

            @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError.GeolocationError, com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
            @Nullable
            public Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Throwable th2 = this.cause;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return "AccessCoarseLocationNotGranted(type=" + this.type + ", cause=" + this.cause + ")";
            }

            public /* synthetic */ AccessCoarseLocationNotGranted(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? DeviceManagerErrorType.PermissionNotGranted.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccessCoarseLocationNotGranted(@NotNull DeviceManagerErrorType type, @Nullable Throwable th2) {
                super(type, th2, null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.cause = th2;
            }
        }

        /* JADX INFO: compiled from: DeviceManagerError.kt */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError$AccessFineLocationNotGranted;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getType", "()Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AccessFineLocationNotGranted extends GeolocationError {

            @Nullable
            private final Throwable cause;

            @NotNull
            private final DeviceManagerErrorType type;

            /* JADX WARN: Multi-variable type inference failed */
            public AccessFineLocationNotGranted() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ AccessFineLocationNotGranted copy$default(AccessFineLocationNotGranted accessFineLocationNotGranted, DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    deviceManagerErrorType = accessFineLocationNotGranted.type;
                }
                if ((i10 & 2) != 0) {
                    th2 = accessFineLocationNotGranted.cause;
                }
                return accessFineLocationNotGranted.copy(deviceManagerErrorType, th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final AccessFineLocationNotGranted copy(@NotNull DeviceManagerErrorType type, @Nullable Throwable cause) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new AccessFineLocationNotGranted(type, cause);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccessFineLocationNotGranted)) {
                    return false;
                }
                AccessFineLocationNotGranted accessFineLocationNotGranted = (AccessFineLocationNotGranted) other;
                return Intrinsics.areEqual(this.type, accessFineLocationNotGranted.type) && Intrinsics.areEqual(this.cause, accessFineLocationNotGranted.cause);
            }

            @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError.GeolocationError, com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
            @Nullable
            public Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Throwable th2 = this.cause;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return "AccessFineLocationNotGranted(type=" + this.type + ", cause=" + this.cause + ")";
            }

            public /* synthetic */ AccessFineLocationNotGranted(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? DeviceManagerErrorType.PermissionNotGranted.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccessFineLocationNotGranted(@NotNull DeviceManagerErrorType type, @Nullable Throwable th2) {
                super(type, th2, null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.cause = th2;
            }
        }

        /* JADX INFO: compiled from: DeviceManagerError.kt */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError$GeolocationInvalid;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerError$GeolocationError;", "Ljava/io/Serializable;", "type", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "cause", "", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;Ljava/lang/Throwable;)V", "getType", "()Lcom/bbva/ethermobilesdk/devicemanager/model/output/error/DeviceManagerErrorType;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class GeolocationInvalid extends GeolocationError {

            @Nullable
            private final Throwable cause;

            @NotNull
            private final DeviceManagerErrorType type;

            /* JADX WARN: Multi-variable type inference failed */
            public GeolocationInvalid() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ GeolocationInvalid copy$default(GeolocationInvalid geolocationInvalid, DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    deviceManagerErrorType = geolocationInvalid.type;
                }
                if ((i10 & 2) != 0) {
                    th2 = geolocationInvalid.cause;
                }
                return geolocationInvalid.copy(deviceManagerErrorType, th2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final GeolocationInvalid copy(@NotNull DeviceManagerErrorType type, @Nullable Throwable cause) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new GeolocationInvalid(type, cause);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GeolocationInvalid)) {
                    return false;
                }
                GeolocationInvalid geolocationInvalid = (GeolocationInvalid) other;
                return Intrinsics.areEqual(this.type, geolocationInvalid.type) && Intrinsics.areEqual(this.cause, geolocationInvalid.cause);
            }

            @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError.GeolocationError, com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
            @Nullable
            public Throwable getCause() {
                return this.cause;
            }

            @NotNull
            public final DeviceManagerErrorType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Throwable th2 = this.cause;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Override // java.lang.Throwable
            @NotNull
            public String toString() {
                return "GeolocationInvalid(type=" + this.type + ", cause=" + this.cause + ")";
            }

            public /* synthetic */ GeolocationInvalid(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? DeviceManagerErrorType.GeolocationInvalid.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GeolocationInvalid(@NotNull DeviceManagerErrorType type, @Nullable Throwable th2) {
                super(type, th2, null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.cause = th2;
            }
        }

        public /* synthetic */ GeolocationError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceManagerErrorType, th2);
        }

        @Override // com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError, java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }

        public /* synthetic */ GeolocationError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? DeviceManagerErrorType.Unknown.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2, null);
        }

        private GeolocationError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2) {
            super(deviceManagerErrorType, th2);
            this.cause = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceManagerError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    public /* synthetic */ DeviceManagerError(DeviceManagerErrorType deviceManagerErrorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DeviceManagerErrorType.Unknown.INSTANCE : deviceManagerErrorType, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceManagerError(@NotNull DeviceManagerErrorType type, @Nullable Throwable th2) {
        super(type.getError());
        Intrinsics.checkNotNullParameter(type, "type");
        this.cause = th2;
    }
}
