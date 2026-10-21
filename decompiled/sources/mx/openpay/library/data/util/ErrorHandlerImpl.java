package mx.openpay.library.data.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.util.ErrorHandler;
import mx.openpay.library.domain.util.ErrorLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;

/* JADX INFO: compiled from: ErrorHandlerImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lmx/openpay/library/data/util/ErrorHandlerImpl;", "Lmx/openpay/library/domain/util/ErrorHandler;", "errorLogger", "Lmx/openpay/library/domain/util/ErrorLogger;", "(Lmx/openpay/library/domain/util/ErrorLogger;)V", "getError", "Lmx/openpay/library/domain/model/Error;", "throwable", "", "getServerErrorByErrorBody", "Lmx/openpay/library/domain/model/Error$Server;", "errorBodyResponse", "", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ErrorHandlerImpl implements ErrorHandler {

    @Nullable
    private final ErrorLogger errorLogger;

    public ErrorHandlerImpl(@Nullable ErrorLogger errorLogger) {
        this.errorLogger = errorLogger;
    }

    @Override // mx.openpay.library.domain.util.ErrorHandler
    @NotNull
    public Error getError(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ErrorLogger errorLogger = this.errorLogger;
        if (errorLogger != null) {
            String message = throwable.getMessage();
            if (message == null) {
                message = throwable.toString();
            }
            errorLogger.log(message);
        }
        if (throwable instanceof IOException) {
            return throwable instanceof UnknownHostException ? Error.TimeOut.INSTANCE : Error.Network.INSTANCE;
        }
        if (throwable instanceof TimeoutException) {
            return Error.TimeOut.INSTANCE;
        }
        if (!(throwable instanceof HttpException)) {
            return Error.Unknown.INSTANCE;
        }
        int iCode = ((HttpException) throwable).code();
        if (iCode == 401) {
            return Error.Unauthorized.INSTANCE;
        }
        if (iCode == 404) {
            return Error.NotFound.INSTANCE;
        }
        if (iCode == 408) {
            return Error.TimeOut.INSTANCE;
        }
        if (iCode == 500) {
            return Error.InternalServer.INSTANCE;
        }
        if (iCode != 502) {
            return iCode != 503 ? Error.Unknown.INSTANCE : Error.ServiceUnavailable.INSTANCE;
        }
        return Error.BadGateway.INSTANCE;
    }

    @Override // mx.openpay.library.domain.util.ErrorHandler
    @NotNull
    public Error.Server getServerErrorByErrorBody(@NotNull String errorBodyResponse) {
        Intrinsics.checkNotNullParameter(errorBodyResponse, "errorBodyResponse");
        String str = "";
        int asInt = 700;
        int i10 = 401;
        try {
            JsonObject jsonObject = (JsonObject) new Gson().fromJson(errorBodyResponse, JsonObject.class);
            if (jsonObject != null) {
                asInt = jsonObject.has("error_code") ? jsonObject.get("error_code").getAsInt() : 700;
                int asInt2 = jsonObject.has(EglobalUtils.HTTP_CODE_ENTRY) ? jsonObject.get(EglobalUtils.HTTP_CODE_ENTRY).getAsInt() : 401;
                try {
                    if (jsonObject.has("description")) {
                        String asString = jsonObject.get("description").getAsString();
                        Intrinsics.checkNotNullExpressionValue(asString, "json[EglobalUtils.DESCRIPTION_ENTRY].asString");
                        str = asString;
                    } else if (jsonObject.has("message")) {
                        String asString2 = jsonObject.get("message").getAsString();
                        Intrinsics.checkNotNullExpressionValue(asString2, "json[EglobalUtils.MESSAGE_ENTRY].asString");
                        try {
                            if (jsonObject.has("status")) {
                                int asInt3 = jsonObject.get("status").getAsInt();
                                if (asInt3 == 401) {
                                    str = asString2;
                                    asInt = 401;
                                    i10 = asInt3;
                                } else {
                                    i10 = asInt3;
                                    str = asString2;
                                }
                            } else {
                                str = asString2;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str = asString2;
                            i10 = asInt2;
                            e.printStackTrace();
                        }
                    }
                    i10 = asInt2;
                } catch (Exception e7) {
                    e = e7;
                }
            }
        } catch (Exception e10) {
            e = e10;
        }
        return new Error.Server(i10 + "#" + asInt + "#" + ((Object) str));
    }
}
