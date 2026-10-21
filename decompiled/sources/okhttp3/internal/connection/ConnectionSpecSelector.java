package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConnectionSpecSelector.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "Lokhttp3/ConnectionSpec;", "configureSecureSocket", "Ljava/io/IOException;", "e", "", "connectionFailed", "", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class ConnectionSpecSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<ConnectionSpec> f85784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85787d;

    public ConnectionSpecSelector(@NotNull List<ConnectionSpec> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f85784a = connectionSpecs;
    }

    @NotNull
    public final ConnectionSpec configureSecureSocket(@NotNull SSLSocket sslSocket) throws IOException {
        boolean z10;
        ConnectionSpec connectionSpec;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f85785b;
        List<ConnectionSpec> list = this.f85784a;
        int size = list.size();
        while (true) {
            z10 = true;
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = list.get(i10);
            if (connectionSpec.isCompatible(sslSocket)) {
                this.f85785b = i10 + 1;
                break;
            }
            i10++;
        }
        if (connectionSpec == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f85787d);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int size2 = list.size();
        for (int i11 = this.f85785b; i11 < size2; i11++) {
            if (list.get(i11).isCompatible(sslSocket)) {
                this.f85786c = z10;
                connectionSpec.apply$okhttp(sslSocket, this.f85787d);
                return connectionSpec;
            }
        }
        z10 = false;
        this.f85786c = z10;
        connectionSpec.apply$okhttp(sslSocket, this.f85787d);
        return connectionSpec;
    }

    public final boolean connectionFailed(@NotNull IOException e5) {
        Intrinsics.checkNotNullParameter(e5, "e");
        this.f85787d = true;
        return (!this.f85786c || (e5 instanceof ProtocolException) || (e5 instanceof InterruptedIOException) || ((e5 instanceof SSLHandshakeException) && (e5.getCause() instanceof CertificateException)) || (e5 instanceof SSLPeerUnverifiedException) || !(e5 instanceof SSLException)) ? false : true;
    }
}
