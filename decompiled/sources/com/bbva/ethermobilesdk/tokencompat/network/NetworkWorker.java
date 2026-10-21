package com.bbva.ethermobilesdk.tokencompat.network;

import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkWorker.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J!\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\b\u000bH&¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkWorker;", "", "addInterceptor", "", "interceptor", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "execute", "Lcom/bbva/network/model/response/NetworkResponse;", "requestBlock", "Lkotlin/Function1;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "Lkotlin/ExtensionFunctionType;", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NetworkWorker {
    void addInterceptor(@NotNull NetworkInterceptor interceptor);

    @NotNull
    NetworkResponse execute(@NotNull Function1<? super MutableNetworkRequest, Unit> requestBlock);
}
