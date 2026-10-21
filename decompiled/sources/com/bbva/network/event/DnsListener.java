package com.bbva.network.event;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.network.model.NetworkRequest;
import java.net.InetAddress;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DnsListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/bbva/network/event/DnsListener;", "Lcom/bbva/network/event/NetworkEventListener;", "end", "", "request", "Lcom/bbva/network/model/NetworkRequest;", "domainName", "", "inetAddressList", "", "Ljava/net/InetAddress;", EventDataKeys.Lifecycle.LIFECYCLE_START, "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DnsListener extends NetworkEventListener {
    void end(@NotNull NetworkRequest request, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList);

    void start(@NotNull NetworkRequest request, @NotNull String domainName);
}
