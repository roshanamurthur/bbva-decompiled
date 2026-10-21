package com.bbva.semaas.token.datasource;

import bk.q;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.semaas.TokenConfig;
import com.bbva.semaas.model.AccessToken;
import com.bbva.semaas.token.RefreshTokenProvider;
import com.bbva.semaas.token.model.AccessTokenError;
import com.bbva.semaas.token.model.AccessTokenResult;
import java.io.InputStream;
import java.net.URI;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RemoteAccessTokenDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bbva/semaas/token/datasource/RemoteAccessTokenDataSource;", "Lcom/bbva/semaas/token/datasource/AccessTokenDataSource;", "config", "Lcom/bbva/semaas/TokenConfig;", "networkWorker", "Lcom/bbva/network/NetworkWorker;", "refreshTokenProvider", "Lcom/bbva/semaas/token/RefreshTokenProvider;", "(Lcom/bbva/semaas/TokenConfig;Lcom/bbva/network/NetworkWorker;Lcom/bbva/semaas/token/RefreshTokenProvider;)V", "createRequest", "Lcom/bbva/network/model/NetworkRequest;", "refreshToken", "", "get", "Lcom/bbva/semaas/token/model/AccessTokenResult;", "obtainAccessToken", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRemoteAccessTokenDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteAccessTokenDataSource.kt\ncom/bbva/semaas/token/datasource/RemoteAccessTokenDataSource\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,64:1\n96#2:65\n*S KotlinDebug\n*F\n+ 1 RemoteAccessTokenDataSource.kt\ncom/bbva/semaas/token/datasource/RemoteAccessTokenDataSource\n*L\n43#1:65\n*E\n"})
public final class RemoteAccessTokenDataSource implements AccessTokenDataSource {

    @NotNull
    private final TokenConfig config;

    @NotNull
    private final NetworkWorker networkWorker;

    @NotNull
    private final RefreshTokenProvider refreshTokenProvider;

    public RemoteAccessTokenDataSource(@NotNull TokenConfig config, @NotNull NetworkWorker networkWorker, @NotNull RefreshTokenProvider refreshTokenProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(refreshTokenProvider, "refreshTokenProvider");
        this.config = config;
        this.networkWorker = networkWorker;
        this.refreshTokenProvider = refreshTokenProvider;
    }

    private final NetworkRequest createRequest(final String refreshToken) {
        return MutableNetworkRequestKt.request(new Function1<MutableNetworkRequest, Unit>() { // from class: com.bbva.semaas.token.datasource.RemoteAccessTokenDataSource.createRequest.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
                invoke2(mutableNetworkRequest);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull MutableNetworkRequest request) {
                Intrinsics.checkNotNullParameter(request, "$this$request");
                request.setHeaders(q.hashMapOf(TuplesKt.to("x-consumer-id", RemoteAccessTokenDataSource.this.config.getConsumerId()), TuplesKt.to("x-validation-policy", RemoteAccessTokenDataSource.this.config.getValidationPolicy()), TuplesKt.to("x-tsec-token", refreshToken)));
                request.setMethod(Method.GET);
                String string = new URI(RemoteAccessTokenDataSource.this.config.getHost()).resolve("/v1/Token").toString();
                Intrinsics.checkNotNullExpressionValue(string, "URI(config.host).resolve(\"/v1/Token\").toString()");
                request.setUrl(string);
            }
        });
    }

    private final AccessTokenResult obtainAccessToken(String refreshToken) {
        InputStream inputStream;
        try {
            NetworkResponse networkResponseExecute = this.networkWorker.execute(createRequest(refreshToken));
            int code = networkResponseExecute.getCode();
            if (200 > code || code >= 300 || (inputStream = networkResponseExecute.getBody().inputStream()) == null) {
                return new AccessTokenResult.Error(AccessTokenError.CONNECTION_ERROR);
            }
            String str = new String(ByteStreamsKt.readBytes(inputStream), Charsets.UTF_8);
            Json.Companion companion = Json.INSTANCE;
            companion.getSerializersModule();
            return new AccessTokenResult.Success((AccessToken) companion.decodeFromString(AccessToken.INSTANCE.serializer(), str));
        } catch (Exception unused) {
            return new AccessTokenResult.Error(AccessTokenError.CONNECTION_ERROR);
        }
    }

    @Override // com.bbva.semaas.token.datasource.AccessTokenDataSource
    @NotNull
    public AccessTokenResult get() {
        String f30742a = this.refreshTokenProvider.getF30742a();
        return f30742a != null ? obtainAccessToken(f30742a) : new AccessTokenResult.Error(AccessTokenError.REFRESH_TOKEN_UNAVAILABLE);
    }

    @Override // com.bbva.semaas.token.datasource.AccessTokenDataSource
    public void save(@NotNull AccessToken accessToken) {
        AccessTokenDataSource.DefaultImpls.save(this, accessToken);
    }
}
