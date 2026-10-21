package com.bbva.ethermobilesdk.sslpinning.manager;

import com.bbva.ethermobilesdk.sslpinning.exception.RepositoryInitializationException;
import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import com.bbva.sl.ar.android.sslpinning.exception.RepositoryException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InitializationErrorManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/sslpinning/manager/InitializationErrorManager;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lcom/bbva/sl/ar/android/sslpinning/exception/InitializationException;", "handlerException", "<init>", "()V", "Companion", "sslpinning_release"}, k = 1, mv = {1, 4, 0})
public final class InitializationErrorManager {
    public static final int INITIALIZATION_EXCEPTION_ERROR_CODE = 401;

    @NotNull
    public static final String INITIALIZATION_EXCEPTION_ERROR_MESSAGE = "Error initializing repository.";

    @NotNull
    public final InitializationException handlerException(@NotNull Exception exception) {
        InitializationException initializationException;
        boolean z10 = exception instanceof InitializationException;
        String str = INITIALIZATION_EXCEPTION_ERROR_MESSAGE;
        if (z10) {
            InitializationException initializationException2 = (InitializationException) exception;
            if (!(initializationException2.getCause() instanceof RepositoryException)) {
                return initializationException2;
            }
            int errCode = initializationException2.getErrCode();
            String message = initializationException2.getMessage();
            if (message != null) {
                str = message;
            }
            initializationException = new RepositoryInitializationException(errCode, str, initializationException2);
        } else {
            String message2 = exception.getMessage();
            if (message2 != null) {
                str = message2;
            }
            initializationException = new InitializationException(401, str, exception);
        }
        return initializationException;
    }
}
