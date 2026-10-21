package com.bbva.network.glide;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkWorkerStreamFetcher.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/network/glide/NetworkWorkerStreamFetcher;", "Lcom/bumptech/glide/load/data/DataFetcher;", "Ljava/io/InputStream;", "Lcom/bumptech/glide/Priority;", "priority", "Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;", "callback", "", "loadData", "Ljava/lang/Class;", "getDataClass", "cleanup", "Lcom/bumptech/glide/load/DataSource;", "getDataSource", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "Lcom/bbva/network/NetworkWorker;", "client", "Lcom/bumptech/glide/load/model/GlideUrl;", "glideUrl", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bumptech/glide/load/model/GlideUrl;)V", "network-image_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNetworkWorkerStreamFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkWorkerStreamFetcher.kt\ncom/bbva/network/glide/NetworkWorkerStreamFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class NetworkWorkerStreamFetcher implements DataFetcher<InputStream> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f35086p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final GlideUrl f35087q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public InputStream f35088r0;

    /* JADX INFO: compiled from: NetworkWorkerStreamFetcher.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest execute = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            execute.setMethod(Method.GET);
            NetworkWorkerStreamFetcher networkWorkerStreamFetcher = NetworkWorkerStreamFetcher.this;
            String stringUrl = networkWorkerStreamFetcher.f35087q0.toStringUrl();
            Intrinsics.checkNotNullExpressionValue(stringUrl, "glideUrl.toStringUrl()");
            execute.setUrl(stringUrl);
            Map<String, String> headers = networkWorkerStreamFetcher.f35087q0.getHeaders();
            Intrinsics.checkNotNullExpressionValue(headers, "glideUrl.headers");
            execute.setHeaders(headers);
            return Unit.INSTANCE;
        }
    }

    public NetworkWorkerStreamFetcher(@NotNull NetworkWorker client, @NotNull GlideUrl glideUrl) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(glideUrl, "glideUrl");
        this.f35086p0 = client;
        this.f35087q0 = glideUrl;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        try {
            InputStream inputStream = this.f35088r0;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NotNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NotNull
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NotNull Priority priority, @NotNull DataFetcher.DataCallback<? super InputStream> callback) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            NetworkResponse networkResponseExecute = this.f35086p0.execute(new a());
            if (networkResponseExecute.isSuccessful()) {
                InputStream inputStream = networkResponseExecute.getBody().inputStream();
                if (inputStream != null) {
                    InputStream inputStreamObtain = ContentLengthInputStream.obtain(inputStream, networkResponseExecute.getBody().contentLength());
                    this.f35088r0 = inputStreamObtain;
                    callback.onDataReady(inputStreamObtain);
                }
            } else {
                callback.onLoadFailed(new HttpException(networkResponseExecute.getMessage(), networkResponseExecute.getCode()));
            }
        } catch (Exception e5) {
            callback.onLoadFailed(e5);
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }
}
