package com.veridas.contextualdata.network.wifi;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IWifiContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/veridas/contextualdata/network/wifi/IWifiContextualDataProvider;", "", "getWifiBssid", "", "getWifiRssi", "", "()Ljava/lang/Integer;", "getWifiSignalLevel", "getWifiSsid", "isWifiEnabled", "", "()Ljava/lang/Boolean;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IWifiContextualDataProvider {
    @Nullable
    String getWifiBssid();

    @Nullable
    Integer getWifiRssi();

    @Nullable
    Integer getWifiSignalLevel();

    @Nullable
    String getWifiSsid();

    @Nullable
    Boolean isWifiEnabled();
}
