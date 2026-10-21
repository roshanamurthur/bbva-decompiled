package com.bbva.network.event;

import com.bbva.network.model.NetworkRequest;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/bbva/network/event/RequestListener;", "Lcom/bbva/network/event/NetworkEventListener;", "bodyEnd", "", "request", "Lcom/bbva/network/model/NetworkRequest;", "byteCount", "", "bodyStart", "headersEnd", "headersStart", "onFail", "ioe", "Ljava/io/IOException;", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RequestListener extends NetworkEventListener {
    void bodyEnd(@NotNull NetworkRequest request, long byteCount);

    void bodyStart(@NotNull NetworkRequest request);

    void headersEnd(@NotNull NetworkRequest request);

    void headersStart(@NotNull NetworkRequest request);

    void onFail(@NotNull NetworkRequest request, @NotNull IOException ioe);
}
