package com.bbva.network.impl;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.network.WebSocketWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.WebSocket;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OkHttpWebSockerWorker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\t\u0010\f\u001a\u00020\u000bH\u0096\u0001J\t\u0010\u000e\u001a\u00020\rH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0001¨\u0006\u0016"}, d2 = {"Lcom/bbva/network/impl/OkHttpWebSocketWorker;", "Lcom/bbva/network/WebSocketWorker;", "Lokhttp3/WebSocket;", "", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "", "code", "", "reason", "", HearingDisabilitiesConstants.CLOSE_MODAL, "", "queueSize", "Lokhttp3/Request;", "request", "text", "send", "Lokio/ByteString;", "bytes", "socket", "<init>", "(Lokhttp3/WebSocket;)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final class OkHttpWebSocketWorker implements WebSocketWorker, WebSocket {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WebSocket f35106a;

    public OkHttpWebSocketWorker(@NotNull WebSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f35106a = socket;
    }

    @Override // com.bbva.network.WebSocketWorker, okhttp3.WebSocket
    public void cancel() {
        this.f35106a.cancel();
    }

    @Override // com.bbva.network.WebSocketWorker, okhttp3.WebSocket
    public boolean close(int code, @Nullable String reason) {
        return this.f35106a.close(code, reason);
    }

    @Override // com.bbva.network.WebSocketWorker, okhttp3.WebSocket
    public long queueSize() {
        return this.f35106a.queueSize();
    }

    @Override // okhttp3.WebSocket
    @NotNull
    public Request request() {
        return this.f35106a.request();
    }

    @Override // com.bbva.network.WebSocketWorker, okhttp3.WebSocket
    public boolean send(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return this.f35106a.send(text);
    }

    @Override // com.bbva.network.WebSocketWorker, okhttp3.WebSocket
    public boolean send(@NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return this.f35106a.send(bytes);
    }
}
