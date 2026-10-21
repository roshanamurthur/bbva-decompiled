package com.bbva.network.model;

import com.bbva.network.constant.NetworkProtocol;
import com.bbva.network.model.response.NetworkHandshake;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkConnection.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/bbva/network/model/NetworkConnection;", "", "Ljava/net/Socket;", "a", "Ljava/net/Socket;", "getSocket", "()Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "b", "Ljava/net/InetSocketAddress;", "getSocketAddress", "()Ljava/net/InetSocketAddress;", "socketAddress", "Ljava/net/URL;", "c", "Ljava/net/URL;", "getUrl", "()Ljava/net/URL;", "url", "Lcom/bbva/network/model/response/NetworkHandshake;", "d", "Lcom/bbva/network/model/response/NetworkHandshake;", "getHandshake", "()Lcom/bbva/network/model/response/NetworkHandshake;", "handshake", "Lcom/bbva/network/constant/NetworkProtocol;", "e", "Lcom/bbva/network/constant/NetworkProtocol;", "getProtocol", "()Lcom/bbva/network/constant/NetworkProtocol;", "protocol", "<init>", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;Ljava/net/URL;Lcom/bbva/network/model/response/NetworkHandshake;Lcom/bbva/network/constant/NetworkProtocol;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final class NetworkConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Socket socket;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InetSocketAddress socketAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final URL url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final NetworkHandshake handshake;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkProtocol protocol;

    public NetworkConnection(@NotNull Socket socket, @NotNull InetSocketAddress socketAddress, @NotNull URL url, @Nullable NetworkHandshake networkHandshake, @NotNull NetworkProtocol protocol) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.socket = socket;
        this.socketAddress = socketAddress;
        this.url = url;
        this.handshake = networkHandshake;
        this.protocol = protocol;
    }

    @Nullable
    public final NetworkHandshake getHandshake() {
        return this.handshake;
    }

    @NotNull
    public final NetworkProtocol getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final Socket getSocket() {
        return this.socket;
    }

    @NotNull
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    @NotNull
    public final URL getUrl() {
        return this.url;
    }
}
