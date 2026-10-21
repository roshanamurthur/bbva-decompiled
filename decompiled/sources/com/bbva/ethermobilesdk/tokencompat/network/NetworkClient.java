package com.bbva.ethermobilesdk.tokencompat.network;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationRequest;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationResponse;
import com.bbva.network.interceptor.NetworkInterceptor;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\u001c\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkClient;", "", "config", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "getConfig", "()Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "headers", "", "", "getHeaders", "()Ljava/util/Map;", "activate", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse;", ActivateTokenCommand.TOKEN_ID, "authCodeHash", "token", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationRequest;", "enc256", "addInterceptor", "", "interceptor", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "using", "", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NetworkClient {

    /* JADX INFO: compiled from: NetworkClient.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Result activate$default(NetworkClient networkClient, String str, String str2, TokenCompatActivationRequest tokenCompatActivationRequest, String str3, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activate");
            }
            if ((i10 & 8) != 0) {
                str3 = null;
            }
            return networkClient.activate(str, str2, tokenCompatActivationRequest, str3);
        }
    }

    @NotNull
    Result<TokenCompatActivationResponse> activate(@NotNull String tokenId, @NotNull String authCodeHash, @NotNull TokenCompatActivationRequest token, @Nullable String enc256);

    void addInterceptor(@NotNull NetworkInterceptor interceptor);

    @NotNull
    TokenCompatConfig getConfig();

    @NotNull
    Map<String, String> getHeaders();

    @NotNull
    NetworkClient using(@NotNull Map<String, String> headers);
}
