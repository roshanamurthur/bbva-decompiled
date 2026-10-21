package com.bbva.ethermobilesdk.tokencompat.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatRX.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatRegistrationResponse;", "", "data", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatRegistrationResponse$Data;", "(Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatRegistrationResponse$Data;)V", "getData", "()Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatRegistrationResponse$Data;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Data", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TokenCompatRegistrationResponse {

    @NotNull
    private final Data data;

    /* JADX INFO: compiled from: TokenCompatRX.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatRegistrationResponse$Data;", "", "deviceIdentifier", "", "id", "softwareTokenAuthCode", "status", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatRegistrationResponse$Data$Status;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatRegistrationResponse$Data$Status;)V", "getDeviceIdentifier", "()Ljava/lang/String;", "getId", "getSoftwareTokenAuthCode", "getStatus", "()Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatRegistrationResponse$Data$Status;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Status", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Data {

        @Nullable
        private final String deviceIdentifier;

        @NotNull
        private final String id;

        @NotNull
        private final String softwareTokenAuthCode;

        @Nullable
        private final Status status;

        /* JADX INFO: compiled from: TokenCompatRX.kt */
        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatRegistrationResponse$Data$Status;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Status {

            @NotNull
            private final String id;

            @NotNull
            private final String name;

            public Status(@NotNull String id, @NotNull String name) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(name, "name");
                this.id = id;
                this.name = name;
            }

            public static /* synthetic */ Status copy$default(Status status, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = status.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = status.name;
                }
                return status.copy(str, str2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final Status copy(@NotNull String id, @NotNull String name) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(name, "name");
                return new Status(id, name);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Status)) {
                    return false;
                }
                Status status = (Status) other;
                return Intrinsics.areEqual(this.id, status.id) && Intrinsics.areEqual(this.name, status.name);
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode() + (this.id.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return u.g("Status(id=", this.id, ", name=", this.name, ")");
            }
        }

        public Data(@Nullable String str, @NotNull String id, @NotNull String softwareTokenAuthCode, @Nullable Status status) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(softwareTokenAuthCode, "softwareTokenAuthCode");
            this.deviceIdentifier = str;
            this.id = id;
            this.softwareTokenAuthCode = softwareTokenAuthCode;
            this.status = status;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, Status status, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = data.deviceIdentifier;
            }
            if ((i10 & 2) != 0) {
                str2 = data.id;
            }
            if ((i10 & 4) != 0) {
                str3 = data.softwareTokenAuthCode;
            }
            if ((i10 & 8) != 0) {
                status = data.status;
            }
            return data.copy(str, str2, str3, status);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDeviceIdentifier() {
            return this.deviceIdentifier;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSoftwareTokenAuthCode() {
            return this.softwareTokenAuthCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        @NotNull
        public final Data copy(@Nullable String deviceIdentifier, @NotNull String id, @NotNull String softwareTokenAuthCode, @Nullable Status status) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(softwareTokenAuthCode, "softwareTokenAuthCode");
            return new Data(deviceIdentifier, id, softwareTokenAuthCode, status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.deviceIdentifier, data.deviceIdentifier) && Intrinsics.areEqual(this.id, data.id) && Intrinsics.areEqual(this.softwareTokenAuthCode, data.softwareTokenAuthCode) && Intrinsics.areEqual(this.status, data.status);
        }

        @Nullable
        public final String getDeviceIdentifier() {
            return this.deviceIdentifier;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getSoftwareTokenAuthCode() {
            return this.softwareTokenAuthCode;
        }

        @Nullable
        public final Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            String str = this.deviceIdentifier;
            int iC = n1.c(this.softwareTokenAuthCode, n1.c(this.id, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
            Status status = this.status;
            return iC + (status != null ? status.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.deviceIdentifier;
            String str2 = this.id;
            String str3 = this.softwareTokenAuthCode;
            Status status = this.status;
            StringBuilder sbC = a.c("Data(deviceIdentifier=", str, ", id=", str2, ", softwareTokenAuthCode=");
            sbC.append(str3);
            sbC.append(", status=");
            sbC.append(status);
            sbC.append(")");
            return sbC.toString();
        }
    }

    public TokenCompatRegistrationResponse(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ TokenCompatRegistrationResponse copy$default(TokenCompatRegistrationResponse tokenCompatRegistrationResponse, Data data, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            data = tokenCompatRegistrationResponse.data;
        }
        return tokenCompatRegistrationResponse.copy(data);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final TokenCompatRegistrationResponse copy(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new TokenCompatRegistrationResponse(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TokenCompatRegistrationResponse) && Intrinsics.areEqual(this.data, ((TokenCompatRegistrationResponse) other).data);
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "TokenCompatRegistrationResponse(data=" + this.data + ")";
    }
}
