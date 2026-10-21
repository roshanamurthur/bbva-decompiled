package com.bbva.network;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import kotlin.Metadata;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebSocketWorker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/bbva/network/WebSocketWorker;", "", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "", HearingDisabilitiesConstants.CLOSE_MODAL, "", "code", "", "reason", "", "queueSize", "", "send", "text", "bytes", "Lokio/ByteString;", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebSocketWorker {
    void cancel();

    boolean close(int code, @Nullable String reason);

    long queueSize();

    boolean send(@NotNull String text);

    boolean send(@NotNull ByteString bytes);
}
