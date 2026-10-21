package com.bbva.network.event;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CallListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/bbva/network/event/CallListener;", "Lcom/bbva/network/event/NetworkEventListener;", "canceled", "", "request", "Lcom/bbva/network/model/NetworkRequest;", "end", "onFail", "ioe", "Ljava/io/IOException;", "satisfactionFailure", DigipassManagerConstants.KEY_RESPONSE, "Lcom/bbva/network/model/response/NetworkResponse;", EventDataKeys.Lifecycle.LIFECYCLE_START, "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CallListener extends NetworkEventListener {
    void canceled(@NotNull NetworkRequest request);

    void end(@NotNull NetworkRequest request);

    void onFail(@NotNull NetworkRequest request, @NotNull IOException ioe);

    void satisfactionFailure(@NotNull NetworkRequest request, @NotNull NetworkResponse response);

    void start(@NotNull NetworkRequest request);
}
