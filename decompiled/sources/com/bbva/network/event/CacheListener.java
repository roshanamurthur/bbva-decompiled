package com.bbva.network.event;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CacheListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/bbva/network/event/CacheListener;", "Lcom/bbva/network/event/NetworkEventListener;", "conditionalHit", "", "request", "Lcom/bbva/network/model/NetworkRequest;", "cachedResponse", "Lcom/bbva/network/model/response/NetworkResponse;", "hit", DigipassManagerConstants.KEY_RESPONSE, "miss", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CacheListener extends NetworkEventListener {
    void conditionalHit(@NotNull NetworkRequest request, @NotNull NetworkResponse cachedResponse);

    void hit(@NotNull NetworkRequest request, @Nullable NetworkResponse response);

    void miss(@NotNull NetworkRequest request);
}
