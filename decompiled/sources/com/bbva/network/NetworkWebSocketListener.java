package com.bbva.network;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.response.NetworkResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebSocketWorker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/network/NetworkWebSocketListener;", "", "onClosed", "", "webSocket", "Lcom/bbva/network/WebSocketWorker;", "code", "", "reason", "", "onClosing", "onFailure", "t", "", DigipassManagerConstants.KEY_RESPONSE, "Lcom/bbva/network/model/response/NetworkResponse;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NetworkWebSocketListener {

    /* JADX INFO: compiled from: WebSocketWorker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onClosed(@NotNull NetworkWebSocketListener networkWebSocketListener, @NotNull WebSocketWorker webSocket, int i10, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
        }

        public static void onClosing(@NotNull NetworkWebSocketListener networkWebSocketListener, @NotNull WebSocketWorker webSocket, int i10, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
        }

        public static void onFailure(@NotNull NetworkWebSocketListener networkWebSocketListener, @NotNull WebSocketWorker webSocket, @NotNull Throwable t10, @Nullable NetworkResponse networkResponse) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(t10, "t");
        }

        public static void onMessage(@NotNull NetworkWebSocketListener networkWebSocketListener, @NotNull WebSocketWorker webSocket, @NotNull String text) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public static void onOpen(@NotNull NetworkWebSocketListener networkWebSocketListener, @NotNull WebSocketWorker webSocket, @NotNull NetworkResponse response) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(response, "response");
        }

        public static void onMessage(@NotNull NetworkWebSocketListener networkWebSocketListener, @NotNull WebSocketWorker webSocket, @NotNull ByteString bytes) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
        }
    }

    void onClosed(@NotNull WebSocketWorker webSocket, int code, @NotNull String reason);

    void onClosing(@NotNull WebSocketWorker webSocket, int code, @NotNull String reason);

    void onFailure(@NotNull WebSocketWorker webSocket, @NotNull Throwable t10, @Nullable NetworkResponse response);

    void onMessage(@NotNull WebSocketWorker webSocket, @NotNull String text);

    void onMessage(@NotNull WebSocketWorker webSocket, @NotNull ByteString bytes);

    void onOpen(@NotNull WebSocketWorker webSocket, @NotNull NetworkResponse response);
}
