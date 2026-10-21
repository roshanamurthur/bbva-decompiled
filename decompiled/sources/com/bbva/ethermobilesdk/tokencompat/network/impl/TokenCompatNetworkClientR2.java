package com.bbva.ethermobilesdk.tokencompat.network.impl;

import android.webkit.URLUtil;
import androidx.camera.camera2.internal.h0;
import bk.q;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.extension.LoggerKt;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationRequest;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationResponse;
import com.bbva.ethermobilesdk.tokencompat.network.NetworkClient;
import com.bbva.ethermobilesdk.tokencompat.network.NetworkWorker;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.constant.Method;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import com.google.gson.Gson;
import java.net.MalformedURLException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatNetworkClientR2.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/network/impl/TokenCompatNetworkClientR2;", "Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkClient;", "", "", "headers", "using", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "interceptor", "", "addInterceptor", ActivateTokenCommand.TOKEN_ID, "authCodeHash", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationRequest;", "token", "enc256", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse;", "activate", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "getConfig", "()Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "config", "", "c", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkWorker;", "worker", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkWorker;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTokenCompatNetworkClientR2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenCompatNetworkClientR2.kt\ncom/bbva/ethermobilesdk/tokencompat/network/impl/TokenCompatNetworkClientR2\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n526#2:117\n511#2,6:118\n1#3:124\n*S KotlinDebug\n*F\n+ 1 TokenCompatNetworkClientR2.kt\ncom/bbva/ethermobilesdk/tokencompat/network/impl/TokenCompatNetworkClientR2\n*L\n71#1:117\n71#1:118,6\n*E\n"})
public final class TokenCompatNetworkClientR2 implements NetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TokenCompatConfig config;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f30593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: compiled from: TokenCompatNetworkClientR2.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TokenCompatConfig.EndpointConfig.HttpMethod.values().length];
            try {
                iArr[TokenCompatConfig.EndpointConfig.HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenCompatConfig.EndpointConfig.HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: TokenCompatNetworkClientR2.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f30595p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Method f30596q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f30597r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ byte[] f30598s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Method method, Map<String, String> map, byte[] bArr) {
            super(1);
            this.f30595p0 = str;
            this.f30596q0 = method;
            this.f30597r0 = map;
            this.f30598s0 = bArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest execute = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            execute.setUrl(this.f30595p0);
            execute.setMethod(this.f30596q0);
            execute.setHeaders(this.f30597r0);
            MutableNetworkRequest.body$default(execute, this.f30598s0, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public TokenCompatNetworkClientR2(@NotNull TokenCompatConfig config, @NotNull NetworkWorker worker) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.config = config;
        this.f30593b = worker;
        this.headers = q.mutableMapOf(TuplesKt.to("Accept", "application/json"), TuplesKt.to(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json; charset=UTF-8"));
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.network.NetworkClient
    @NotNull
    public Result<TokenCompatActivationResponse> activate(@NotNull String tokenId, @NotNull String authCodeHash, @NotNull TokenCompatActivationRequest token, @Nullable String enc256) {
        Method method;
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(authCodeHash, "authCodeHash");
        Intrinsics.checkNotNullParameter(token, "token");
        String strCreateR2EndpointUrl = TokenCompatNetworkClientR2Kt.createR2EndpointUrl(getConfig().getEndpoint().getUrl(), tokenId, TokenCompatNetworkClientR2Kt.encodeActivationDataHash(authCodeHash, getConfig().getEndpoint()));
        if (!URLUtil.isValidUrl(strCreateR2EndpointUrl)) {
            return new Result.Error(new MalformedURLException(h0.b("The supplied URL [", strCreateR2EndpointUrl, "] is invalid")));
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[getConfig().getEndpoint().getHttpMethod().ordinal()];
        if (i10 == 1) {
            method = Method.POST;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            method = Method.PUT;
        }
        Map<String, String> headers = getHeaders();
        byte[] bArrSerializeToken = TokenCompatNetworkClientR2Kt.serializeToken(token, getConfig().getEndpoint());
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            NetworkResponse networkResponseExecute = this.f30593b.execute(new a(strCreateR2EndpointUrl, method, headers, bArrSerializeToken));
            Map<String, String> headers2 = networkResponseExecute.getHeaders();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : headers2.entrySet()) {
                if (TokenCompatNetworkClientR2Kt.isHeaderOfInterest(entry)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                String str2 = (String) entry2.getValue();
                if (str2 != null) {
                    getHeaders().put(str, str2);
                }
            }
            TokenCompatActivationResponse tokenCompatActivationResponse = (TokenCompatActivationResponse) new Gson().fromJson(networkResponseExecute.getBody().string(), TokenCompatActivationResponse.class);
            if (!TokenCompatNetworkClientR2Kt.isValid(tokenCompatActivationResponse)) {
                throw new IllegalArgumentException("Could not parse all fields of token compat activation response " + Reflection.getOrCreateKotlinClass(TokenCompatActivationResponse.class).getSimpleName());
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(tokenCompatActivationResponse));
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                LoggerKt.logError("Failed activation for " + tokenId, thM5538exceptionOrNullimpl);
                objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
            }
            return (Result) objM5535constructorimpl;
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.network.NetworkClient
    public void addInterceptor(@NotNull NetworkInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.f30593b.addInterceptor(interceptor);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.network.NetworkClient
    @NotNull
    public TokenCompatConfig getConfig() {
        return this.config;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.network.NetworkClient
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.network.NetworkClient
    @NotNull
    public NetworkClient using(@NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            getHeaders().put(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public /* synthetic */ TokenCompatNetworkClientR2(TokenCompatConfig tokenCompatConfig, NetworkWorker networkWorker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenCompatConfig, (i10 & 2) != 0 ? new NetworkWorkerImpl(tokenCompatConfig) : networkWorker);
    }
}
