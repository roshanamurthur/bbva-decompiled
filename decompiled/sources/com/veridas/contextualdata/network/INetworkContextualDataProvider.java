package com.veridas.contextualdata.network;

import com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: INetworkContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/veridas/contextualdata/network/INetworkContextualDataProvider;", "Lcom/veridas/contextualdata/network/wifi/IWifiContextualDataProvider;", "getIpAddress", "", "getNetworkConnectionType", "Lcom/veridas/contextualdata/network/NetworkType;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface INetworkContextualDataProvider extends IWifiContextualDataProvider {
    @Nullable
    String getIpAddress();

    @Nullable
    NetworkType getNetworkConnectionType();
}
