package okhttp3.internal.connection;

import ak.b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RouteException.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "", "addConnectException", "p0", "Ljava/io/IOException;", "getFirstConnectException", "()Ljava/io/IOException;", "firstConnectException", "<set-?>", "q0", "getLastConnectException", "lastConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class RouteException extends RuntimeException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IOException firstConnectException;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(@NotNull IOException e5) {
        Intrinsics.checkNotNullParameter(e5, "e");
        b.addSuppressed(this.firstConnectException, e5);
        this.lastConnectException = e5;
    }

    @NotNull
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @NotNull
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
