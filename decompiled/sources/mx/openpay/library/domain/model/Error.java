package mx.openpay.library.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Error.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u001c\f\r\u000e\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u001b'()*+,-./0123456789:;<=>?@A¨\u0006B"}, d2 = {"Lmx/openpay/library/domain/model/Error;", "", "", "a", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "status", "b", "getErrorBody", "errorBody", "Companion", "BadGateway", "CardExpired", "CardRetired", "DeviceNotFound", "DifferentCard", "InternalServer", "InvalidAmount", "InvalidDigitalSign", "InvalidIssuerAuth", "NFCDisabled", "Network", "NotFound", "NotImplemented", "OnTerminal", "PermissionNonGranted", "PinLock", "Server", "ServerErrors", "ServiceUnavailable", "TerminalNotConnected", "TimeOut", "TimeOutTerminal", "Unauthorized", "UninitializedKey", "UninitializedTapOnPhoneSDK", "Unknown", "UnsupportedCard", "Lmx/openpay/library/domain/model/Error$BadGateway;", "Lmx/openpay/library/domain/model/Error$CardExpired;", "Lmx/openpay/library/domain/model/Error$CardRetired;", "Lmx/openpay/library/domain/model/Error$DeviceNotFound;", "Lmx/openpay/library/domain/model/Error$DifferentCard;", "Lmx/openpay/library/domain/model/Error$InternalServer;", "Lmx/openpay/library/domain/model/Error$InvalidAmount;", "Lmx/openpay/library/domain/model/Error$InvalidDigitalSign;", "Lmx/openpay/library/domain/model/Error$InvalidIssuerAuth;", "Lmx/openpay/library/domain/model/Error$NFCDisabled;", "Lmx/openpay/library/domain/model/Error$Network;", "Lmx/openpay/library/domain/model/Error$NotFound;", "Lmx/openpay/library/domain/model/Error$NotImplemented;", "Lmx/openpay/library/domain/model/Error$OnTerminal;", "Lmx/openpay/library/domain/model/Error$PermissionNonGranted;", "Lmx/openpay/library/domain/model/Error$PinLock;", "Lmx/openpay/library/domain/model/Error$Server;", "Lmx/openpay/library/domain/model/Error$ServerErrors;", "Lmx/openpay/library/domain/model/Error$ServiceUnavailable;", "Lmx/openpay/library/domain/model/Error$TerminalNotConnected;", "Lmx/openpay/library/domain/model/Error$TimeOut;", "Lmx/openpay/library/domain/model/Error$TimeOutTerminal;", "Lmx/openpay/library/domain/model/Error$Unauthorized;", "Lmx/openpay/library/domain/model/Error$UninitializedKey;", "Lmx/openpay/library/domain/model/Error$UninitializedTapOnPhoneSDK;", "Lmx/openpay/library/domain/model/Error$Unknown;", "Lmx/openpay/library/domain/model/Error$UnsupportedCard;", "domain_release"}, k = 1, mv = {1, 8, 0})
public abstract class Error {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String errorBody;

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/domain/model/Error$BadGateway;", "Lmx/openpay/library/domain/model/Error;", "()V", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BadGateway extends Error {

        @NotNull
        public static final BadGateway INSTANCE = new BadGateway();

        /* JADX WARN: Multi-variable type inference failed */
        public BadGateway() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$CardExpired;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class CardExpired extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public CardExpired() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ CardExpired(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#29#Card expired" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CardExpired(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$CardRetired;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class CardRetired extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public CardRetired() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ CardRetired(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#23#Card removed" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CardRetired(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$DeviceNotFound;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class DeviceNotFound extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public DeviceNotFound() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ DeviceNotFound(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#801#Device not found" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DeviceNotFound(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$DifferentCard;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class DifferentCard extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public DifferentCard() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ DifferentCard(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#88#Card different" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DifferentCard(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/domain/model/Error$InternalServer;", "Lmx/openpay/library/domain/model/Error;", "()V", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InternalServer extends Error {

        @NotNull
        public static final InternalServer INSTANCE = new InternalServer();

        /* JADX WARN: Multi-variable type inference failed */
        public InternalServer() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$InvalidAmount;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class InvalidAmount extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public InvalidAmount() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ InvalidAmount(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#5005#Invalid amount, only 1 or 2 decimals allowed" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidAmount(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$InvalidDigitalSign;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class InvalidDigitalSign extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public InvalidDigitalSign() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ InvalidDigitalSign(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#5003#The signature cannot be empty" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidDigitalSign(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$InvalidIssuerAuth;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class InvalidIssuerAuth extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public InvalidIssuerAuth() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ InvalidIssuerAuth(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#5001#Issuer authentication invalid" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidIssuerAuth(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$NFCDisabled;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class NFCDisabled extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public NFCDisabled() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ NFCDisabled(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#97#NFC Disabled" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NFCDisabled(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/domain/model/Error$Network;", "Lmx/openpay/library/domain/model/Error;", "()V", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Network extends Error {

        @NotNull
        public static final Network INSTANCE = new Network();

        /* JADX WARN: Multi-variable type inference failed */
        public Network() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/domain/model/Error$NotFound;", "Lmx/openpay/library/domain/model/Error;", "()V", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotFound extends Error {

        @NotNull
        public static final NotFound INSTANCE = new NotFound();

        /* JADX WARN: Multi-variable type inference failed */
        public NotFound() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/domain/model/Error$NotImplemented;", "Lmx/openpay/library/domain/model/Error;", "()V", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotImplemented extends Error {

        @NotNull
        public static final NotImplemented INSTANCE = new NotImplemented();

        /* JADX WARN: Multi-variable type inference failed */
        public NotImplemented() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$OnTerminal;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class OnTerminal extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public OnTerminal() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ OnTerminal(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#901#Error in terminal" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnTerminal(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$PermissionNonGranted;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class PermissionNonGranted extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public PermissionNonGranted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ PermissionNonGranted(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PermissionNonGranted(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$PinLock;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class PinLock extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public PinLock() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PinLock(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        public /* synthetic */ PinLock(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#977#Pin Locked" : str);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$Server;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class Server extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public Server() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Server(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }

        public /* synthetic */ Server(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$ServerErrors;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class ServerErrors extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public ServerErrors() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ ServerErrors(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#771#Server errors" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ServerErrors(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/domain/model/Error$ServiceUnavailable;", "Lmx/openpay/library/domain/model/Error;", "()V", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ServiceUnavailable extends Error {

        @NotNull
        public static final ServiceUnavailable INSTANCE = new ServiceUnavailable();

        /* JADX WARN: Multi-variable type inference failed */
        public ServiceUnavailable() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$TerminalNotConnected;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class TerminalNotConnected extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public TerminalNotConnected() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ TerminalNotConnected(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#5200#Does not have a terminal connected" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TerminalNotConnected(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/domain/model/Error$TimeOut;", "Lmx/openpay/library/domain/model/Error;", "()V", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TimeOut extends Error {

        @NotNull
        public static final TimeOut INSTANCE = new TimeOut();

        /* JADX WARN: Multi-variable type inference failed */
        public TimeOut() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$TimeOutTerminal;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class TimeOutTerminal extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public TimeOutTerminal() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ TimeOutTerminal(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#6#Timeout" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TimeOutTerminal(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/domain/model/Error$Unauthorized;", "Lmx/openpay/library/domain/model/Error;", "()V", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unauthorized extends Error {

        @NotNull
        public static final Unauthorized INSTANCE = new Unauthorized();

        /* JADX WARN: Multi-variable type inference failed */
        public Unauthorized() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$UninitializedKey;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class UninitializedKey extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public UninitializedKey() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ UninitializedKey(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#5007#Key must be initialized" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UninitializedKey(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$UninitializedTapOnPhoneSDK;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class UninitializedTapOnPhoneSDK extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public UninitializedTapOnPhoneSDK() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ UninitializedTapOnPhoneSDK(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#872#SDK Tap On Phone is not initialized" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UninitializedTapOnPhoneSDK(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/domain/model/Error$Unknown;", "Lmx/openpay/library/domain/model/Error;", "()V", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends Error {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/domain/model/Error$UnsupportedCard;", "Lmx/openpay/library/domain/model/Error;", "", "c", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "errorBody", "<init>", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class UnsupportedCard extends Error {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String errorBody;

        /* JADX WARN: Multi-variable type inference failed */
        public UnsupportedCard() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // mx.openpay.library.domain.model.Error
        @NotNull
        public String getErrorBody() {
            return this.errorBody;
        }

        public /* synthetic */ UnsupportedCard(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "401#25#Card not supported" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UnsupportedCard(@NotNull String errorBody) {
            super(null, errorBody, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(errorBody, "errorBody");
            this.errorBody = errorBody;
        }
    }

    public /* synthetic */ Error(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "-1" : str, (i10 & 2) != 0 ? "" : str2, null);
    }

    @NotNull
    public String getErrorBody() {
        return this.errorBody;
    }

    @NotNull
    public String getStatus() {
        return this.status;
    }

    public Error(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.status = str;
        this.errorBody = str2;
    }
}
