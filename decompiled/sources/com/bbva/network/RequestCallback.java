package com.bbva.network;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestCallback.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/bbva/network/RequestCallback;", "", "onComplete", "", DigipassManagerConstants.KEY_RESPONSE, "Lcom/bbva/network/model/response/NetworkResponse;", "onError", "exception", "Lcom/bbva/network/exceptions/ConnectionException;", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RequestCallback {
    void onComplete(@NotNull NetworkResponse response);

    void onError(@NotNull ConnectionException exception);
}
