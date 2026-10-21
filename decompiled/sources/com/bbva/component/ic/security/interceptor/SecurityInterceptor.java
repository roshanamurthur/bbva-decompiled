package com.bbva.component.ic.security.interceptor;

import bk.q;
import com.bbva.component.ic.security.extensions.NetworkResponseExtensionsKt;
import com.bbva.component.ic.security.handler.AdditionalSecurityHandler;
import com.bbva.component.ic.security.model.Response;
import com.bbva.component.ic.security.model.SecurityRequestCancelException;
import com.bbva.component.ic.security.utils.SecurityVerification;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecurityInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001B3\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0019\u0012\b\u0010&\u001a\u0004\u0018\u00010!\u0012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040'¢\u0006\u0004\bI\u0010JJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u001a\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0004J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0019\u0010&\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040'8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\b\u0014\u0010\u0013R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/bbva/component/ic/security/interceptor/SecurityInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "", "securityType", "securityCode", "setSecurity", "", "headers", "setHeadersSecurity", "", "cancelOperation", "setCancelOperation$component_ic_security_release", "(Z)V", "setCancelOperation", "unlock", "shouldBeIntercepted$component_ic_security_release", "(Lcom/bbva/network/model/response/MutableNetworkResponse;)Z", "shouldBeIntercepted", "", "a", "Ljava/util/List;", "getWhiteList", "()Ljava/util/List;", "setWhiteList", "(Ljava/util/List;)V", "whiteList", "Lcom/bbva/component/ic/security/handler/AdditionalSecurityHandler;", "b", "Lcom/bbva/component/ic/security/handler/AdditionalSecurityHandler;", "getHandler", "()Lcom/bbva/component/ic/security/handler/AdditionalSecurityHandler;", "handler", "Lkotlin/Function1;", "Lcom/bbva/component/ic/security/utils/SecurityVerification;", "c", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/concurrent/Semaphore;", "d", "Ljava/util/concurrent/Semaphore;", "getAvailable", "()Ljava/util/concurrent/Semaphore;", "setAvailable", "(Ljava/util/concurrent/Semaphore;)V", "available", "e", "Ljava/lang/String;", "getSecurityType", "()Ljava/lang/String;", "setSecurityType", "(Ljava/lang/String;)V", "f", "getSecurityCode", "setSecurityCode", "g", "Z", "getCancelOperation", "()Z", "h", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "<init>", "(Ljava/util/List;Lcom/bbva/component/ic/security/handler/AdditionalSecurityHandler;Lkotlin/jvm/functions/Function1;)V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSecurityInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityInterceptor.kt\ncom/bbva/component/ic/security/interceptor/SecurityInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1755#2,3:105\n*S KotlinDebug\n*F\n+ 1 SecurityInterceptor.kt\ncom/bbva/component/ic/security/interceptor/SecurityInterceptor\n*L\n100#1:105,3\n*E\n"})
public final class SecurityInterceptor implements NetworkInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<String> whiteList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AdditionalSecurityHandler handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<SecurityVerification, Unit> listener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Semaphore available;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String securityType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String securityCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean cancelOperation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, String> headers;

    /* JADX WARN: Multi-variable type inference failed */
    public SecurityInterceptor(@NotNull List<String> whiteList, @Nullable AdditionalSecurityHandler additionalSecurityHandler, @NotNull Function1<? super SecurityVerification, Unit> listener) {
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.whiteList = whiteList;
        this.handler = additionalSecurityHandler;
        this.listener = listener;
        this.available = new Semaphore(0);
        this.headers = q.emptyMap();
    }

    @NotNull
    public final Semaphore getAvailable() {
        return this.available;
    }

    public final boolean getCancelOperation() {
        return this.cancelOperation;
    }

    @Nullable
    public final AdditionalSecurityHandler getHandler() {
        return this.handler;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Function1<SecurityVerification, Unit> getListener() {
        return this.listener;
    }

    @Nullable
    public final String getSecurityCode() {
        return this.securityCode;
    }

    @Nullable
    public final String getSecurityType() {
        return this.securityType;
    }

    @NotNull
    public final List<String> getWhiteList() {
        return this.whiteList;
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) throws SecurityRequestCancelException, InterruptedException, IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (shouldBeIntercepted$component_ic_security_release(response)) {
            Response responseCreateResponse = NetworkResponseExtensionsKt.createResponse(response);
            AdditionalSecurityHandler additionalSecurityHandler = this.handler;
            boolean z10 = additionalSecurityHandler != null && additionalSecurityHandler.needAdditionalSecurity(responseCreateResponse);
            boolean z11 = additionalSecurityHandler != null && additionalSecurityHandler.hasInCorrectParams(responseCreateResponse);
            if (z10) {
                Function1<SecurityVerification, Unit> function1 = this.listener;
                if (z11) {
                    function1.invoke(SecurityVerification.WrongSecurityHeaders.INSTANCE);
                    return;
                }
                if (z11) {
                    throw new NoWhenBranchMatchedException();
                }
                if (additionalSecurityHandler != null) {
                    additionalSecurityHandler.handle(responseCreateResponse, function1);
                }
                this.available.acquire();
                if (this.cancelOperation) {
                    this.cancelOperation = false;
                    throw new SecurityRequestCancelException();
                }
                if (!this.headers.isEmpty()) {
                    if (additionalSecurityHandler != null) {
                        additionalSecurityHandler.duplicateRequest(this.headers, responseCreateResponse);
                    }
                } else if (additionalSecurityHandler != null) {
                    additionalSecurityHandler.duplicateRequest(this.securityType, this.securityCode, responseCreateResponse);
                }
                response.setHeaders(responseCreateResponse.getHeaders());
                response.discardAndReplay(responseCreateResponse.getRequest());
                this.securityType = null;
                this.securityCode = null;
            }
        }
    }

    public final void setAvailable(@NotNull Semaphore semaphore) {
        Intrinsics.checkNotNullParameter(semaphore, "<set-?>");
        this.available = semaphore;
    }

    public final void setCancelOperation(boolean z10) {
        this.cancelOperation = z10;
    }

    public final void setCancelOperation$component_ic_security_release(boolean cancelOperation) {
        this.cancelOperation = cancelOperation;
    }

    public final void setHeaders(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.headers = map;
    }

    public final void setHeadersSecurity(@NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.headers = headers;
    }

    public final void setSecurity(@NotNull String securityType, @NotNull String securityCode) {
        Intrinsics.checkNotNullParameter(securityType, "securityType");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        this.securityType = securityType;
        this.securityCode = securityCode;
    }

    public final void setSecurityCode(@Nullable String str) {
        this.securityCode = str;
    }

    public final void setSecurityType(@Nullable String str) {
        this.securityType = str;
    }

    public final void setWhiteList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.whiteList = list;
    }

    public final boolean shouldBeIntercepted$component_ic_security_release(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        String url = response.getRequest().getUrl();
        AdditionalSecurityHandler additionalSecurityHandler = this.handler;
        boolean z10 = additionalSecurityHandler != null && additionalSecurityHandler.requireSecurity(response.getCode());
        if (!this.whiteList.isEmpty()) {
            List<String> list = this.whiteList;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (new Regex((String) it.next()).containsMatchIn(url)) {
                }
            }
            return false;
        }
        return z10;
    }

    public final void unlock() {
        this.available.release();
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
