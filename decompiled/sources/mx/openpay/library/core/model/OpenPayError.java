package mx.openpay.library.core.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001d\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u001d()*+,-./0123456789:;<=>?@ABCD¨\u0006E"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError;", "", "", "a", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "status", "b", "getErrorBody", "errorBody", "BadGateway", "CardExpired", "CardRetired", "DeviceNotFound", "DifferentCard", "InternalError", "InternalServer", "InvalidAmount", "InvalidDigitalSign", "InvalidIssuerAuth", "NFCDisabled", "Network", "NotFound", "NotImplemented", "OnTerminal", "PermissionNonGranted", "PinLock", "Server", "ServerErrors", "ServiceUnavailable", "TerminalNotConnected", "TimeOut", "TimeOutTerminal", "Unauthorized", "UninitializedKey", "UninitializedTapOnPhoneSDK", "Unknown", "UnsupportedCard", "UnsupportedVersion", "Lmx/openpay/library/core/model/OpenPayError$BadGateway;", "Lmx/openpay/library/core/model/OpenPayError$CardExpired;", "Lmx/openpay/library/core/model/OpenPayError$CardRetired;", "Lmx/openpay/library/core/model/OpenPayError$DeviceNotFound;", "Lmx/openpay/library/core/model/OpenPayError$DifferentCard;", "Lmx/openpay/library/core/model/OpenPayError$InternalError;", "Lmx/openpay/library/core/model/OpenPayError$InternalServer;", "Lmx/openpay/library/core/model/OpenPayError$InvalidAmount;", "Lmx/openpay/library/core/model/OpenPayError$InvalidDigitalSign;", "Lmx/openpay/library/core/model/OpenPayError$InvalidIssuerAuth;", "Lmx/openpay/library/core/model/OpenPayError$NFCDisabled;", "Lmx/openpay/library/core/model/OpenPayError$Network;", "Lmx/openpay/library/core/model/OpenPayError$NotFound;", "Lmx/openpay/library/core/model/OpenPayError$NotImplemented;", "Lmx/openpay/library/core/model/OpenPayError$OnTerminal;", "Lmx/openpay/library/core/model/OpenPayError$PermissionNonGranted;", "Lmx/openpay/library/core/model/OpenPayError$PinLock;", "Lmx/openpay/library/core/model/OpenPayError$Server;", "Lmx/openpay/library/core/model/OpenPayError$ServerErrors;", "Lmx/openpay/library/core/model/OpenPayError$ServiceUnavailable;", "Lmx/openpay/library/core/model/OpenPayError$TerminalNotConnected;", "Lmx/openpay/library/core/model/OpenPayError$TimeOut;", "Lmx/openpay/library/core/model/OpenPayError$TimeOutTerminal;", "Lmx/openpay/library/core/model/OpenPayError$Unauthorized;", "Lmx/openpay/library/core/model/OpenPayError$UninitializedKey;", "Lmx/openpay/library/core/model/OpenPayError$UninitializedTapOnPhoneSDK;", "Lmx/openpay/library/core/model/OpenPayError$Unknown;", "Lmx/openpay/library/core/model/OpenPayError$UnsupportedCard;", "Lmx/openpay/library/core/model/OpenPayError$UnsupportedVersion;", "library_release"}, k = 1, mv = {1, 8, 0})
public abstract class OpenPayError {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String errorBody;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$BadGateway;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BadGateway extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final BadGateway INSTANCE = new BadGateway();

        /* JADX WARN: Multi-variable type inference failed */
        public BadGateway() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$CardExpired;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class CardExpired extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CardExpired(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$CardRetired;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class CardRetired extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CardRetired(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$DeviceNotFound;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class DeviceNotFound extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DeviceNotFound(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$DifferentCard;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class DifferentCard extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DifferentCard(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$InternalError;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InternalError extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final InternalError INSTANCE = new InternalError();

        /* JADX WARN: Multi-variable type inference failed */
        public InternalError() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$InternalServer;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InternalServer extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final InternalServer INSTANCE = new InternalServer();

        /* JADX WARN: Multi-variable type inference failed */
        public InternalServer() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$InvalidAmount;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class InvalidAmount extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidAmount(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$InvalidDigitalSign;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class InvalidDigitalSign extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidDigitalSign(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$InvalidIssuerAuth;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class InvalidIssuerAuth extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidIssuerAuth(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$NFCDisabled;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class NFCDisabled extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NFCDisabled(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$Network;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Network extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final Network INSTANCE = new Network();

        /* JADX WARN: Multi-variable type inference failed */
        public Network() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$NotFound;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotFound extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final NotFound INSTANCE = new NotFound();

        /* JADX WARN: Multi-variable type inference failed */
        public NotFound() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$NotImplemented;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotImplemented extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final NotImplemented INSTANCE = new NotImplemented();

        /* JADX WARN: Multi-variable type inference failed */
        public NotImplemented() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$OnTerminal;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class OnTerminal extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnTerminal(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$PermissionNonGranted;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class PermissionNonGranted extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PermissionNonGranted(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$PinLock;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class PinLock extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PinLock(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$Server;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Server extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Server(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$ServerErrors;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class ServerErrors extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ServerErrors(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$ServiceUnavailable;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ServiceUnavailable extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final ServiceUnavailable INSTANCE = new ServiceUnavailable();

        /* JADX WARN: Multi-variable type inference failed */
        public ServiceUnavailable() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$TerminalNotConnected;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class TerminalNotConnected extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TerminalNotConnected(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$TimeOut;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TimeOut extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final TimeOut INSTANCE = new TimeOut();

        /* JADX WARN: Multi-variable type inference failed */
        public TimeOut() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$TimeOutTerminal;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class TimeOutTerminal extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TimeOutTerminal(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$Unauthorized;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unauthorized extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final Unauthorized INSTANCE = new Unauthorized();

        /* JADX WARN: Multi-variable type inference failed */
        public Unauthorized() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$UninitializedKey;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class UninitializedKey extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UninitializedKey(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$UninitializedTapOnPhoneSDK;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class UninitializedTapOnPhoneSDK extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UninitializedTapOnPhoneSDK(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$Unknown;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$UnsupportedCard;", "Lmx/openpay/library/core/model/OpenPayError;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class UnsupportedCard extends OpenPayError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UnsupportedCard(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        @Override // mx.openpay.library.core.model.OpenPayError
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayError$UnsupportedVersion;", "Lmx/openpay/library/core/model/OpenPayError;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnsupportedVersion extends OpenPayError {
        public static final int $stable = 0;

        @NotNull
        public static final UnsupportedVersion INSTANCE = new UnsupportedVersion();

        /* JADX WARN: Multi-variable type inference failed */
        public UnsupportedVersion() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public OpenPayError(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.status = str;
        this.errorBody = str2;
    }

    @NotNull
    public String getErrorBody() {
        return this.errorBody;
    }

    @NotNull
    public String getStatus() {
        return this.status;
    }

    public /* synthetic */ OpenPayError(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, null);
    }
}
