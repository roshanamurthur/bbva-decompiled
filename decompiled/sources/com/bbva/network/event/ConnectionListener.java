package com.bbva.network.event;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.network.constant.NetworkProtocol;
import com.bbva.network.model.NetworkConnection;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.response.NetworkHandshake;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConnectionListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J*\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J2\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u0018"}, d2 = {"Lcom/bbva/network/event/ConnectionListener;", "Lcom/bbva/network/event/NetworkEventListener;", "acquired", "", "request", "Lcom/bbva/network/model/NetworkRequest;", "connection", "Lcom/bbva/network/model/NetworkConnection;", "end", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "Ljava/net/Proxy;", "protocol", "Lcom/bbva/network/constant/NetworkProtocol;", "failed", "ioe", "Ljava/io/IOException;", "released", "secureConnectEnd", "handshake", "Lcom/bbva/network/model/response/NetworkHandshake;", "secureConnectStart", EventDataKeys.Lifecycle.LIFECYCLE_START, "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ConnectionListener extends NetworkEventListener {
    void acquired(@NotNull NetworkRequest request, @NotNull NetworkConnection connection);

    void end(@NotNull NetworkRequest request, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable NetworkProtocol protocol);

    void failed(@NotNull NetworkRequest request, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable NetworkProtocol protocol, @NotNull IOException ioe);

    void released(@NotNull NetworkRequest request, @NotNull NetworkConnection connection);

    void secureConnectEnd(@NotNull NetworkRequest request, @Nullable NetworkHandshake handshake);

    void secureConnectStart(@NotNull NetworkRequest request);

    void start(@NotNull NetworkRequest request, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy);
}
