package com.bbva.network.impl;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.NetworkWebSocketListener;
import com.bbva.network.WebSocketWorker;
import com.bbva.network.extension.OkHttpKt;
import com.bbva.network.model.NetworkRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OkHttpWebSockerWorker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/bbva/network/impl/OkHttpWebSocketListener;", "Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", DigipassManagerConstants.KEY_RESPONSE, "", "onOpen", "", "text", "onMessage", "Lokio/ByteString;", "bytes", "", "code", "reason", "onClosing", "onClosed", "", "t", "onFailure", "Lcom/bbva/network/WebSocketWorker;", "socket", "Lcom/bbva/network/WebSocketWorker;", "getSocket$network_release", "()Lcom/bbva/network/WebSocketWorker;", "setSocket$network_release", "(Lcom/bbva/network/WebSocketWorker;)V", "Lcom/bbva/network/model/NetworkRequest;", "request", "Lcom/bbva/network/NetworkWebSocketListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/bbva/network/model/NetworkRequest;Lcom/bbva/network/NetworkWebSocketListener;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final class OkHttpWebSocketListener extends WebSocketListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkRequest f35104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NetworkWebSocketListener f35105b;
    public WebSocketWorker socket;

    public OkHttpWebSocketListener(@NotNull NetworkRequest request, @NotNull NetworkWebSocketListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35104a = request;
        this.f35105b = listener;
    }

    @NotNull
    public final WebSocketWorker getSocket$network_release() {
        WebSocketWorker webSocketWorker = this.socket;
        if (webSocketWorker != null) {
            return webSocketWorker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("socket");
        return null;
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f35105b.onClosed(getSocket$network_release(), code, reason);
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f35105b.onClosing(getSocket$network_release(), code, reason);
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t10, @Nullable Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t10, "t");
        this.f35105b.onFailure(getSocket$network_release(), t10, response != null ? OkHttpKt.toNetworkResponse(response, this.f35104a) : null);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f35105b.onMessage(getSocket$network_release(), text);
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f35105b.onOpen(getSocket$network_release(), OkHttpKt.toNetworkResponse(response, this.f35104a));
    }

    public final void setSocket$network_release(@NotNull WebSocketWorker webSocketWorker) {
        Intrinsics.checkNotNullParameter(webSocketWorker, "<set-?>");
        this.socket = webSocketWorker;
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f35105b.onMessage(getSocket$network_release(), bytes);
    }
}
