package com.bbva.component.ic.security.handler;

import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.ic.security.model.HandlerConfig;
import com.bbva.component.ic.security.model.OtpErrorsKt;
import com.bbva.component.ic.security.model.Response;
import com.bbva.component.ic.security.utils.ResponseExtensionsKt;
import com.bbva.component.ic.security.utils.SecurityType;
import com.bbva.component.ic.security.utils.SecurityVerification;
import com.bbva.component.ic.security.utils.StringExtensionsKt;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OTPSecurityHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J$\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J$\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/bbva/component/ic/security/handler/OTPSecurityHandler;", "Lcom/bbva/component/ic/security/handler/AdditionalSecurityHandler;", "", "code", "", "requireSecurity", "Lcom/bbva/component/ic/security/model/Response;", DigipassManagerConstants.KEY_RESPONSE, "needAdditionalSecurity", "hasInCorrectParams", "", Constants.authenticationType, "securityCode", "", "duplicateRequest", "Lkotlin/Function1;", "Lcom/bbva/component/ic/security/utils/SecurityVerification;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "handle", "", "Lcom/bbva/component/ic/security/utils/SecurityType;", "a", "Ljava/util/List;", "getSecurityTypes", "()Ljava/util/List;", "securityTypes", "Lcom/bbva/component/ic/security/model/HandlerConfig;", "handlerConfig", "<init>", "(Ljava/util/List;Lcom/bbva/component/ic/security/model/HandlerConfig;)V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
public final class OTPSecurityHandler implements AdditionalSecurityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<SecurityType> securityTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final HandlerConfig f28173b;

    /* JADX WARN: Multi-variable type inference failed */
    public OTPSecurityHandler(@NotNull List<? extends SecurityType> securityTypes, @Nullable HandlerConfig handlerConfig) {
        Intrinsics.checkNotNullParameter(securityTypes, "securityTypes");
        this.securityTypes = securityTypes;
        this.f28173b = handlerConfig;
    }

    public static List a(Map map) {
        List listSplit$default;
        String str = (String) map.get("authenticationtype");
        return (str == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{ReplenishLogic.ID_SEPARATOR}, false, 0, 6, (Object) null)) == null) ? CollectionsKt__CollectionsKt.emptyList() : listSplit$default;
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public void duplicateRequest(@NotNull Map<String, String> map, @NotNull Response response) {
        AdditionalSecurityHandler.DefaultImpls.duplicateRequest(this, map, response);
    }

    @NotNull
    public final List<SecurityType> getSecurityTypes() {
        return this.securityTypes;
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public void handle(@NotNull Response response, @NotNull Function1<? super SecurityVerification, Unit> listener) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.invoke(new SecurityVerification.HeaderSecurityTypes(StringExtensionsKt.mapToSecurityType(a(response.getHeaders())), response.getHeaders()));
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public boolean hasInCorrectParams(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Map<String, String> headers = response.getHeaders();
        List<SecurityType> listMapToSecurityType = StringExtensionsKt.mapToSecurityType(a(headers));
        String str = headers.get("authenticationdata");
        return listMapToSecurityType.isEmpty() || str == null || str.length() == 0;
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public boolean needAdditionalSecurity(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return OtpErrorsKt.isNotUnknown(ResponseExtensionsKt.toOtpError(response));
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public boolean requireSecurity(int code) {
        List<Integer> unauthorizedCode;
        HandlerConfig handlerConfig = this.f28173b;
        if (handlerConfig == null || (unauthorizedCode = handlerConfig.getUnauthorizedCode()) == null) {
            return false;
        }
        return unauthorizedCode.contains(Integer.valueOf(code));
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public void duplicateRequest(@Nullable String authenticationType, @Nullable String securityCode, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        SecurityType securityTypeByAuthenticationType = SecurityType.INSTANCE.getSecurityTypeByAuthenticationType(authenticationType);
        if (securityTypeByAuthenticationType == null || securityCode == null) {
            return;
        }
        duplicateRequest(q.mapOf(TuplesKt.to("authenticationtype", securityTypeByAuthenticationType.getAuthenticationType()), TuplesKt.to("authenticationdata", securityTypeByAuthenticationType.getAuthenticationData() + "=" + securityCode)), response);
    }
}
