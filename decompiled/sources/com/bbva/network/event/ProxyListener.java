package com.bbva.network.event;

import com.bbva.network.model.NetworkRequest;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ProxyListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/bbva/network/event/ProxyListener;", "Lcom/bbva/network/event/NetworkEventListener;", "selectEnd", "", "request", "Lcom/bbva/network/model/NetworkRequest;", "url", "Ljava/net/URL;", "proxies", "", "Ljava/net/Proxy;", "selectStart", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ProxyListener extends NetworkEventListener {
    void selectEnd(@NotNull NetworkRequest request, @NotNull URL url, @NotNull List<? extends Proxy> proxies);

    void selectStart(@NotNull NetworkRequest request, @NotNull URL url);
}
