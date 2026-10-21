package com.bbva.ethermobilesdk.tokencompat.network.impl;

import android.content.Context;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.network.NetworkWorker;
import com.bbva.network.impl.OkHttpNetworkWorker;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkWorkerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\u000b\u001a\u00020\n2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\bH\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/network/impl/NetworkWorkerImpl;", "Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkWorker;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "interceptor", "", "addInterceptor", "Lkotlin/Function1;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "Lkotlin/ExtensionFunctionType;", "requestBlock", "Lcom/bbva/network/model/response/NetworkResponse;", "execute", "Lcom/bbva/network/impl/OkHttpNetworkWorker;", "a", "Lcom/bbva/network/impl/OkHttpNetworkWorker;", "getWorker$ethertoken_compat_release", "()Lcom/bbva/network/impl/OkHttpNetworkWorker;", "worker", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "config", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class NetworkWorkerImpl implements NetworkWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OkHttpNetworkWorker worker;

    public NetworkWorkerImpl(@NotNull TokenCompatConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = config.getContext();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long timeout = config.getEndpoint().getTimeout();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.worker = new OkHttpNetworkWorker(context, builder.connectTimeout(timeout, timeUnit).writeTimeout(config.getEndpoint().getTimeout(), timeUnit).readTimeout(config.getEndpoint().getTimeout(), timeUnit).build(), config.getPinningCatalog(), null, null, null, 56, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.network.NetworkWorker
    public void addInterceptor(@NotNull NetworkInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.worker.addInterceptor(interceptor);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.network.NetworkWorker
    @NotNull
    public NetworkResponse execute(@NotNull Function1<? super MutableNetworkRequest, Unit> requestBlock) {
        Intrinsics.checkNotNullParameter(requestBlock, "requestBlock");
        return this.worker.execute(requestBlock);
    }

    @NotNull
    /* JADX INFO: renamed from: getWorker$ethertoken_compat_release, reason: from getter */
    public final OkHttpNetworkWorker getWorker() {
        return this.worker;
    }
}
