package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayError;
import mx.openpay.library.domain.model.Error;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToLibraryModel", "Lmx/openpay/library/core/model/OpenPayError;", "Lmx/openpay/library/domain/model/Error;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OpenPayErrorMapperKt {
    @NotNull
    public static final OpenPayError mapToLibraryModel(@NotNull Error error) {
        OpenPayError serverErrors;
        Intrinsics.checkNotNullParameter(error, "<this>");
        if (Intrinsics.areEqual(error, Error.Unknown.INSTANCE)) {
            return OpenPayError.Unknown.INSTANCE;
        }
        if (Intrinsics.areEqual(error, Error.Network.INSTANCE)) {
            return OpenPayError.Network.INSTANCE;
        }
        if (error instanceof Error.Server) {
            serverErrors = new OpenPayError.Server(error.getErrorBody());
        } else {
            if (Intrinsics.areEqual(error, Error.NotFound.INSTANCE)) {
                return OpenPayError.NotFound.INSTANCE;
            }
            if (Intrinsics.areEqual(error, Error.Unauthorized.INSTANCE)) {
                return OpenPayError.Unauthorized.INSTANCE;
            }
            if (error instanceof Error.OnTerminal) {
                serverErrors = new OpenPayError.OnTerminal(error.getErrorBody());
            } else if (error instanceof Error.TerminalNotConnected) {
                serverErrors = new OpenPayError.TerminalNotConnected(error.getErrorBody());
            } else {
                if (Intrinsics.areEqual(error, Error.NotImplemented.INSTANCE)) {
                    return OpenPayError.NotImplemented.INSTANCE;
                }
                if (error instanceof Error.InvalidAmount) {
                    serverErrors = new OpenPayError.InvalidAmount(error.getErrorBody());
                } else if (error instanceof Error.InvalidDigitalSign) {
                    serverErrors = new OpenPayError.InvalidDigitalSign(error.getErrorBody());
                } else if (error instanceof Error.PermissionNonGranted) {
                    serverErrors = new OpenPayError.PermissionNonGranted(error.getErrorBody());
                } else if (error instanceof Error.CardExpired) {
                    serverErrors = new OpenPayError.CardExpired(error.getErrorBody());
                } else {
                    if (Intrinsics.areEqual(error, Error.TimeOut.INSTANCE)) {
                        return OpenPayError.TimeOut.INSTANCE;
                    }
                    if (error instanceof Error.UninitializedKey) {
                        serverErrors = new OpenPayError.UninitializedKey(error.getErrorBody());
                    } else if (error instanceof Error.InvalidIssuerAuth) {
                        serverErrors = new OpenPayError.InvalidIssuerAuth(error.getErrorBody());
                    } else if (error instanceof Error.CardRetired) {
                        serverErrors = new OpenPayError.CardRetired(error.getErrorBody());
                    } else if (error instanceof Error.DifferentCard) {
                        serverErrors = new OpenPayError.DifferentCard(error.getErrorBody());
                    } else {
                        if (Intrinsics.areEqual(error, Error.BadGateway.INSTANCE)) {
                            return OpenPayError.BadGateway.INSTANCE;
                        }
                        if (Intrinsics.areEqual(error, Error.InternalServer.INSTANCE)) {
                            return OpenPayError.InternalServer.INSTANCE;
                        }
                        if (Intrinsics.areEqual(error, Error.ServiceUnavailable.INSTANCE)) {
                            return OpenPayError.ServiceUnavailable.INSTANCE;
                        }
                        if (error instanceof Error.TimeOutTerminal) {
                            serverErrors = new OpenPayError.TimeOutTerminal(error.getErrorBody());
                        } else if (error instanceof Error.PinLock) {
                            serverErrors = new OpenPayError.PinLock(error.getErrorBody());
                        } else if (error instanceof Error.DeviceNotFound) {
                            serverErrors = new OpenPayError.DeviceNotFound(error.getErrorBody());
                        } else if (error instanceof Error.UninitializedTapOnPhoneSDK) {
                            serverErrors = new OpenPayError.UninitializedTapOnPhoneSDK(error.getErrorBody());
                        } else if (error instanceof Error.NFCDisabled) {
                            serverErrors = new OpenPayError.NFCDisabled(error.getErrorBody());
                        } else if (error instanceof Error.UnsupportedCard) {
                            serverErrors = new OpenPayError.UnsupportedCard(error.getErrorBody());
                        } else {
                            if (!(error instanceof Error.ServerErrors)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            serverErrors = new OpenPayError.ServerErrors(error.getErrorBody());
                        }
                    }
                }
            }
        }
        return serverErrors;
    }
}
