package com.bbva.network;

import com.bbva.image.transform.MonochromeImageTransformer;
import com.bbva.network.event.NetworkEventListener;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.exceptions.NotConnectionAvailable;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.ConnectionStatusEvent;
import com.bbva.network.model.ConnectionThreshold;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.SpeedEvent;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkWorker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H&J!\u0010\u0015\u001a\u00020\u00162\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0002\b\u001aH&J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u001dH&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&¨\u0006#"}, d2 = {"Lcom/bbva/network/NetworkWorker;", "", "addEventListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/bbva/network/event/NetworkEventListener;", "addInterceptor", "interceptor", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "cleanAllCookies", "", "connectionStatus", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/network/model/ConnectionStatusEvent;", "delay", "", "enqueue", "networkRequest", "Lcom/bbva/network/model/NetworkRequest;", "callback", "Lcom/bbva/network/RequestCallback;", "execute", "Lcom/bbva/network/model/response/NetworkResponse;", "requestBlock", "Lkotlin/Function1;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "Lkotlin/ExtensionFunctionType;", "newWebSocket", "Lcom/bbva/network/WebSocketWorker;", "Lcom/bbva/network/NetworkWebSocketListener;", "speedEvents", "Lcom/bbva/network/model/SpeedEvent;", "updateConnectionThreshold", MonochromeImageTransformer.THRESHOLD, "Lcom/bbva/network/model/ConnectionThreshold;", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NetworkWorker {

    /* JADX INFO: compiled from: NetworkWorker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow connectionStatus$default(NetworkWorker networkWorker, long j10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connectionStatus");
            }
            if ((i10 & 1) != 0) {
                j10 = 100;
            }
            return networkWorker.connectionStatus(j10);
        }
    }

    void addEventListener(@NotNull NetworkEventListener listener);

    void addInterceptor(@NotNull NetworkInterceptor interceptor);

    boolean cleanAllCookies();

    @NotNull
    Flow<ConnectionStatusEvent> connectionStatus(long delay);

    void enqueue(@NotNull NetworkRequest networkRequest, @NotNull RequestCallback callback);

    @NotNull
    NetworkResponse execute(@NotNull NetworkRequest networkRequest) throws NotConnectionAvailable, ConnectionException;

    @NotNull
    NetworkResponse execute(@NotNull Function1<? super MutableNetworkRequest, Unit> requestBlock) throws NotConnectionAvailable, ConnectionException;

    @NotNull
    WebSocketWorker newWebSocket(@NotNull NetworkRequest networkRequest, @NotNull NetworkWebSocketListener listener);

    @NotNull
    Flow<SpeedEvent> speedEvents();

    void updateConnectionThreshold(@NotNull ConnectionThreshold threshold);
}
