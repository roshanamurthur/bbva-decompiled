package com.bbva.component.ic.security.handler;

import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.ic.security.model.Response;
import com.bbva.component.ic.security.utils.SecurityVerification;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AdditionalSecurityHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u000f\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/ic/security/handler/AdditionalSecurityHandler;", "", "requireSecurity", "", "code", "", "handle", "", DigipassManagerConstants.KEY_RESPONSE, "Lcom/bbva/component/ic/security/model/Response;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/bbva/component/ic/security/utils/SecurityVerification;", "needAdditionalSecurity", "hasInCorrectParams", "duplicateRequest", Constants.authenticationType, "", "securityCode", "headers", "", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AdditionalSecurityHandler {

    /* JADX INFO: compiled from: AdditionalSecurityHandler.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void duplicateRequest(@NotNull AdditionalSecurityHandler additionalSecurityHandler, @Nullable String str, @Nullable String str2, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
        }

        public static boolean hasInCorrectParams(@NotNull AdditionalSecurityHandler additionalSecurityHandler, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return false;
        }

        public static void duplicateRequest(@NotNull AdditionalSecurityHandler additionalSecurityHandler, @NotNull Map<String, String> headers, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(response, "response");
            NetworkRequest request = response.getRequest();
            Intrinsics.checkNotNull(request, "null cannot be cast to non-null type com.bbva.network.model.request.MutableNetworkRequest");
            MutableNetworkRequest mutableNetworkRequest = (MutableNetworkRequest) request;
            mutableNetworkRequest.setHeaders(q.plus(mutableNetworkRequest.getHeaders(), headers));
        }
    }

    void duplicateRequest(@Nullable String authenticationType, @Nullable String securityCode, @NotNull Response response);

    void duplicateRequest(@NotNull Map<String, String> headers, @NotNull Response response);

    void handle(@NotNull Response response, @NotNull Function1<? super SecurityVerification, Unit> listener);

    boolean hasInCorrectParams(@NotNull Response response);

    boolean needAdditionalSecurity(@NotNull Response response);

    boolean requireSecurity(int code);
}
