package com.bbva.ethermobilesdk.tokencompat.network.impl;

import android.webkit.URLUtil;
import androidx.camera.camera2.internal.h0;
import androidx.webkit.internal.AssetHelper;
import bk.q;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.extension.LoggerKt;
import com.bbva.ethermobilesdk.tokencompat.extension.R1ResponseKt;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationRequest;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationResponse;
import com.bbva.ethermobilesdk.tokencompat.network.NetworkClient;
import com.bbva.ethermobilesdk.tokencompat.network.NetworkWorker;
import com.bbva.ethermobilesdk.tokencompat.util.R1ParserHandler;
import com.bbva.ethermobilesdk.tokencompat.util.R1ParserHandlerKt;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.constant.Method;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import java.net.MalformedURLException;
import java.security.InvalidParameterException;
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
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatNetworkClientR1.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001c\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/network/impl/TokenCompatNetworkClientR1;", "Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkClient;", "", "", "headers", "using", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "interceptor", "", "addInterceptor", ActivateTokenCommand.TOKEN_ID, "authCodeHash", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationRequest;", "token", "enc256", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse;", "activate", "activation", "", "isValid$ethertoken_compat_release", "(Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse;)Z", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "getConfig", "()Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "config", "", "c", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkWorker;", "worker", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkWorker;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTokenCompatNetworkClientR1.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenCompatNetworkClientR1.kt\ncom/bbva/ethermobilesdk/tokencompat/network/impl/TokenCompatNetworkClientR1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n526#2:105\n511#2,6:106\n1#3:112\n*S KotlinDebug\n*F\n+ 1 TokenCompatNetworkClientR1.kt\ncom/bbva/ethermobilesdk/tokencompat/network/impl/TokenCompatNetworkClientR1\n*L\n78#1:105\n78#1:106,6\n*E\n"})
public final class TokenCompatNetworkClientR1 implements NetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TokenCompatConfig config;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f30586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> headers;

    /* JADX INFO: compiled from: TokenCompatNetworkClientR1.kt */
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

    /* JADX INFO: compiled from: TokenCompatNetworkClientR1.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f30588p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Method f30589q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f30590r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f30591s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Method method, Map<String, String> map, String str2) {
            super(1);
            this.f30588p0 = str;
            this.f30589q0 = method;
            this.f30590r0 = map;
            this.f30591s0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest execute = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            execute.setUrl(this.f30588p0);
            execute.setMethod(this.f30589q0);
            execute.setHeaders(this.f30590r0);
            byte[] bytes = this.f30591s0.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            MutableNetworkRequest.body$default(execute, bytes, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public TokenCompatNetworkClientR1(@NotNull TokenCompatConfig config, @NotNull NetworkWorker worker) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.config = config;
        this.f30586b = worker;
        this.headers = q.mutableMapOf(TuplesKt.to("Accept", "*/*"), TuplesKt.to(DigipassManagerConstants.KEY_CONTENT_TYPE, AssetHelper.DEFAULT_MIME_TYPE), TuplesKt.to("SOAPAction", "enroll"));
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.network.NetworkClient
    @NotNull
    public Result<TokenCompatActivationResponse> activate(@NotNull String tokenId, @NotNull String authCodeHash, @NotNull TokenCompatActivationRequest token, @Nullable String enc256) {
        Method method;
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(authCodeHash, "authCodeHash");
        Intrinsics.checkNotNullParameter(token, "token");
        String url = getConfig().getEndpoint().getUrl();
        if (!URLUtil.isValidUrl(url)) {
            return new Result.Error(new MalformedURLException(h0.b("The supplied URL [", url, "] is invalid")));
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
        String originAppId = getConfig().getEndpoint().getOriginAppId();
        if (enc256 == null) {
            return new Result.Error(new InvalidParameterException("The supplied enc256 is null"));
        }
        NetworkResponse networkResponseExecute = this.f30586b.execute(new a(url, method, headers, R1ParserHandlerKt.createR1EnrollRequest(originAppId, authCodeHash, enc256, token.getSalt())));
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
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
            TokenCompatActivationResponse tokenCompatActivationResponseExtractActivationResponse = R1ResponseKt.extractActivationResponse(new R1ParserHandler().parse(networkResponseExecute.getBody().inputStream()));
            if (!isValid$ethertoken_compat_release(tokenCompatActivationResponseExtractActivationResponse)) {
                throw new IllegalArgumentException("Could not parse all fields of " + Reflection.getOrCreateKotlinClass(TokenCompatActivationResponse.class).getSimpleName());
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(tokenCompatActivationResponseExtractActivationResponse));
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
        this.f30586b.addInterceptor(interceptor);
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

    public final boolean isValid$ethertoken_compat_release(@Nullable TokenCompatActivationResponse activation) {
        String activationData;
        String configuration;
        String seed;
        return ((activation != null ? activation.getData() : null) == null || (activationData = activation.getData().getActivationData()) == null || activationData.length() == 0 || (configuration = activation.getData().getConfiguration()) == null || configuration.length() == 0 || (seed = activation.getData().getSeed()) == null || seed.length() == 0) ? false : true;
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

    public /* synthetic */ TokenCompatNetworkClientR1(TokenCompatConfig tokenCompatConfig, NetworkWorker networkWorker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenCompatConfig, (i10 & 2) != 0 ? new NetworkWorkerImpl(tokenCompatConfig) : networkWorker);
    }
}
