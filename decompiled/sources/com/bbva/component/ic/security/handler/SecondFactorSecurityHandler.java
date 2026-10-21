package com.bbva.component.ic.security.handler;

import com.bbva.component.ic.security.model.HandlerConfig;
import com.bbva.component.ic.security.model.Response;
import com.bbva.component.ic.security.model.SecondFactorResponseBody;
import com.bbva.component.ic.security.utils.SecurityVerification;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import d5.a;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecondFactorSecurityHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J$\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/ic/security/handler/SecondFactorSecurityHandler;", "Lcom/bbva/component/ic/security/handler/AdditionalSecurityHandler;", "", "code", "", "requireSecurity", "Lcom/bbva/component/ic/security/model/Response;", DigipassManagerConstants.KEY_RESPONSE, "needAdditionalSecurity", "Lkotlin/Function1;", "Lcom/bbva/component/ic/security/utils/SecurityVerification;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "handle", "Lcom/bbva/component/ic/security/model/HandlerConfig;", "handlerConfig", "<init>", "(Lcom/bbva/component/ic/security/model/HandlerConfig;)V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSecondFactorSecurityHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecondFactorSecurityHandler.kt\ncom/bbva/component/ic/security/handler/SecondFactorSecurityHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class SecondFactorSecurityHandler implements AdditionalSecurityHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final HandlerConfig f28174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f28175b = LazyKt__LazyJVMKt.lazy(new a(0));

    public SecondFactorSecurityHandler(@Nullable HandlerConfig handlerConfig) {
        this.f28174a = handlerConfig;
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public void duplicateRequest(@Nullable String str, @Nullable String str2, @NotNull Response response) {
        AdditionalSecurityHandler.DefaultImpls.duplicateRequest(this, str, str2, response);
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public void handle(@NotNull Response response, @NotNull Function1<? super SecurityVerification, Unit> listener) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(((SecondFactorResponseBody) ((Gson) this.f28175b.getValue()).fromJson(response.getBody(), SecondFactorResponseBody.class)).getData().getToken());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        String str = (String) objM5535constructorimpl;
        if (str != null) {
            listener.invoke(new SecurityVerification.SecondFactor(str));
        }
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public boolean hasInCorrectParams(@NotNull Response response) {
        return AdditionalSecurityHandler.DefaultImpls.hasInCorrectParams(this, response);
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public boolean needAdditionalSecurity(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return response.getBody().length() > 0;
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public boolean requireSecurity(int code) {
        List<Integer> unauthorizedCode;
        HandlerConfig handlerConfig = this.f28174a;
        if (handlerConfig == null || (unauthorizedCode = handlerConfig.getUnauthorizedCode()) == null) {
            return false;
        }
        return unauthorizedCode.contains(Integer.valueOf(code));
    }

    @Override // com.bbva.component.ic.security.handler.AdditionalSecurityHandler
    public void duplicateRequest(@NotNull Map<String, String> map, @NotNull Response response) {
        AdditionalSecurityHandler.DefaultImpls.duplicateRequest(this, map, response);
    }
}
