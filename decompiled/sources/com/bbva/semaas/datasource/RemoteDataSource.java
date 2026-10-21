package com.bbva.semaas.datasource;

import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.semaas.ServiceConfig;
import com.bbva.semaas.model.AccessToken;
import com.bbva.semaas.token.AccessTokenProvider;
import com.bbva.semaas.token.model.AccessTokenResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bbva/semaas/datasource/RemoteDataSource;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/semaas/datasource/DataSource;", "config", "Lcom/bbva/semaas/ServiceConfig;", "networkWorker", "Lcom/bbva/network/NetworkWorker;", "accessTokenProvider", "Lcom/bbva/semaas/token/AccessTokenProvider;", "itemSerializer", "Lkotlinx/serialization/KSerializer;", "(Lcom/bbva/semaas/ServiceConfig;Lcom/bbva/network/NetworkWorker;Lcom/bbva/semaas/token/AccessTokenProvider;Lkotlinx/serialization/KSerializer;)V", "execute", "Lcom/bbva/semaas/datasource/RequestResult;", FirebaseAnalytics.Param.ITEMS, "", "makeRequest", "token", "Lcom/bbva/semaas/model/AccessToken;", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class RemoteDataSource<T> implements DataSource<T> {

    @NotNull
    private final AccessTokenProvider accessTokenProvider;

    @NotNull
    private final ServiceConfig config;

    @NotNull
    private final KSerializer<T> itemSerializer;

    @NotNull
    private final NetworkWorker networkWorker;

    public RemoteDataSource(@NotNull ServiceConfig config, @NotNull NetworkWorker networkWorker, @NotNull AccessTokenProvider accessTokenProvider, @NotNull KSerializer<T> itemSerializer) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(accessTokenProvider, "accessTokenProvider");
        Intrinsics.checkNotNullParameter(itemSerializer, "itemSerializer");
        this.config = config;
        this.networkWorker = networkWorker;
        this.accessTokenProvider = accessTokenProvider;
        this.itemSerializer = itemSerializer;
    }

    private final RequestResult makeRequest(final List<? extends T> items, final AccessToken token) {
        if (token.getAccessToken() == null) {
            return RequestResult.Error.INSTANCE;
        }
        try {
            int code = this.networkWorker.execute(MutableNetworkRequestKt.request(new Function1<MutableNetworkRequest, Unit>(this) { // from class: com.bbva.semaas.datasource.RemoteDataSource$makeRequest$request$1
                final /* synthetic */ RemoteDataSource<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
                    invoke2(mutableNetworkRequest);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MutableNetworkRequest request) {
                    Intrinsics.checkNotNullParameter(request, "$this$request");
                    String string = new URI(((RemoteDataSource) this.this$0).config.getHost()).resolve(((RemoteDataSource) this.this$0).config.getPath()).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "URI(config.host).resolve(config.path).toString()");
                    request.setUrl(string);
                    request.setMethod(Method.POST);
                    request.setHeaders(q.hashMapOf(TuplesKt.to("Authorization", "Bearer " + token.getAccessToken())));
                    byte[] bytes = Json.INSTANCE.encodeToString(BuiltinSerializersKt.ListSerializer(((RemoteDataSource) this.this$0).itemSerializer), items).getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    request.setBody(new NetworkRequestBody.RequestBody(bytes, null, 2, null));
                }
            })).getCode();
            return (200 > code || code >= 300) ? RequestResult.Error.INSTANCE : RequestResult.Success.INSTANCE;
        } catch (Exception e5) {
            e5.printStackTrace();
            return RequestResult.Error.INSTANCE;
        }
    }

    @Override // com.bbva.semaas.datasource.DataSource
    @NotNull
    public RequestResult execute(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        AccessTokenResult accessTokenResultProvide = this.accessTokenProvider.provide();
        if (accessTokenResultProvide instanceof AccessTokenResult.Success) {
            return makeRequest(items, ((AccessTokenResult.Success) accessTokenResultProvide).getValue());
        }
        if (accessTokenResultProvide instanceof AccessTokenResult.Error) {
            return RequestResult.Error.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
