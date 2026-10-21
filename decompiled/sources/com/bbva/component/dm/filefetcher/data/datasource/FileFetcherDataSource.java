package com.bbva.component.dm.filefetcher.data.datasource;

import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileFetcherDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0005¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/datasource/FileFetcherDataSource;", "", "", "requestUrl", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "requestHeaders", "Lcom/bbva/network/model/response/NetworkResponse;", FetchCommand.ID, "Lcom/bbva/network/NetworkWorker;", "worker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public final class FileFetcherDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkWorker f27612a;

    /* JADX INFO: compiled from: FileFetcherDataSource.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f27613p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ HashMap f27614q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, HashMap map) {
            super(1);
            this.f27613p0 = str;
            this.f27614q0 = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest mutableNetworkRequest2 = mutableNetworkRequest;
            mutableNetworkRequest2.setUrl(this.f27613p0);
            mutableNetworkRequest2.setHeaders(this.f27614q0);
            mutableNetworkRequest2.setMethod(Method.GET);
            mutableNetworkRequest2.body(new byte[0], "application/json");
            return Unit.INSTANCE;
        }
    }

    public FileFetcherDataSource(@NotNull NetworkWorker networkWorker) {
        this.f27612a = networkWorker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkResponse fetch$default(FileFetcherDataSource fileFetcherDataSource, String str, HashMap map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = new HashMap();
        }
        return fileFetcherDataSource.fetch(str, map);
    }

    @Nullable
    public final NetworkResponse fetch(@NotNull String requestUrl, @NotNull HashMap<String, String> requestHeaders) {
        return this.f27612a.execute(MutableNetworkRequestKt.request(new a(requestUrl, requestHeaders)));
    }
}
