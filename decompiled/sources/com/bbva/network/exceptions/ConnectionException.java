package com.bbva.network.exceptions;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.response.NetworkResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: exceptions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/network/exceptions/ConnectionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/bbva/network/model/response/NetworkResponse;", "p0", "Lcom/bbva/network/model/response/NetworkResponse;", "getResponse", "()Lcom/bbva/network/model/response/NetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "q0", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "exception", "", "message", "<init>", "(Ljava/lang/String;Lcom/bbva/network/model/response/NetworkResponse;Ljava/lang/Exception;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public class ConnectionException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final NetworkResponse response;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Exception exception;

    public ConnectionException() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Exception getException() {
        return this.exception;
    }

    @Nullable
    public final NetworkResponse getResponse() {
        return this.response;
    }

    public /* synthetic */ ConnectionException(String str, NetworkResponse networkResponse, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : networkResponse, (i10 & 4) != 0 ? null : exc);
    }

    public ConnectionException(@Nullable String str, @Nullable NetworkResponse networkResponse, @Nullable Exception exc) {
        super(str, exc);
        this.response = networkResponse;
        this.exception = exc;
    }
}
