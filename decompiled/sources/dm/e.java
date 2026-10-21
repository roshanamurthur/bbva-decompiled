package dm;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends AsyncTimeout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Socket f68207l;

    public e(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f68207l = socket;
    }

    @Override // okio.AsyncTimeout
    @NotNull
    public final IOException newTimeoutException(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public final void timedOut() {
        Socket socket = this.f68207l;
        try {
            socket.close();
        } catch (AssertionError e5) {
            if (!Okio.isAndroidGetsocknameError(e5)) {
                throw e5;
            }
            c.f68204a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
        } catch (Exception e7) {
            c.f68204a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
        }
    }
}
