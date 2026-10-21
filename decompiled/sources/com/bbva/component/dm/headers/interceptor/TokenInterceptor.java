package com.bbva.component.dm.headers.interceptor;

import android.os.Handler;
import android.os.Looper;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.dynamiclinks.DynamicLink;
import h2.i;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B1\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/headers/interceptor/TokenInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "", "token", DynamicLink.Builder.KEY_DOMAIN, "", "setToken", "getToken", "()Ljava/lang/String;", "id", "tokenType", "Lkotlin/Function1;", "Lcom/bbva/component/dm/headers/interceptor/AccessToken;", "Lcom/bbva/component/dm/headers/interceptor/AccessTokenChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "component-ic-token_release"}, k = 1, mv = {1, 8, 0})
public abstract class TokenInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f27664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f27665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<AccessToken, Unit> f27666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f27667d;

    /* JADX WARN: Multi-variable type inference failed */
    public TokenInterceptor(@Nullable String str, @NotNull String tokenType, @NotNull Function1<? super AccessToken, Unit> listener) {
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f27664a = str;
        this.f27665b = tokenType;
        this.f27666c = listener;
    }

    public static /* synthetic */ void setToken$default(TokenInterceptor tokenInterceptor, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setToken");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        tokenInterceptor.setToken(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: getToken, reason: from getter */
    public final String getF27667d() {
        return this.f27667d;
    }

    public final void setToken(@NotNull String token, @Nullable String domain) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f27667d = token;
        new Handler(Looper.getMainLooper()).post(new i(this, new AccessToken(token, this.f27665b, domain, this.f27664a), 2));
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
