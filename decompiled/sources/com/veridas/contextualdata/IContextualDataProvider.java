package com.veridas.contextualdata;

import com.veridas.contextualdata.location.ILocationContextualDataProvider;
import com.veridas.contextualdata.memory.IMemoryContextualDataProvider;
import com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider;
import com.veridas.contextualdata.network.INetworkContextualDataProvider;
import com.veridas.contextualdata.nfc.INfcContextualDataProvider;
import com.veridas.contextualdata.telephony.ITelephonyContextualDataProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: IContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/veridas/contextualdata/IContextualDataProvider;", "Lcom/veridas/contextualdata/miscellaneous/IMiscellaneousContextualDataProvider;", "Lcom/veridas/contextualdata/network/INetworkContextualDataProvider;", "Lcom/veridas/contextualdata/location/ILocationContextualDataProvider;", "Lcom/veridas/contextualdata/memory/IMemoryContextualDataProvider;", "Lcom/veridas/contextualdata/telephony/ITelephonyContextualDataProvider;", "Lcom/veridas/contextualdata/nfc/INfcContextualDataProvider;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IContextualDataProvider extends IMiscellaneousContextualDataProvider, INetworkContextualDataProvider, ILocationContextualDataProvider, IMemoryContextualDataProvider, ITelephonyContextualDataProvider, INfcContextualDataProvider {
}
