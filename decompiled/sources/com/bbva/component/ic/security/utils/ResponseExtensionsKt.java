package com.bbva.component.ic.security.utils;

import com.bbva.component.ic.security.HttpConstants;
import com.bbva.component.ic.security.model.ForbiddenBody;
import com.bbva.component.ic.security.model.NetworkError;
import com.bbva.component.ic.security.model.OtpChallengeError;
import com.bbva.component.ic.security.model.OtpErrors;
import com.bbva.component.ic.security.model.Response;
import com.google.gson.Gson;
import f5.a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ResponseExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ic/security/model/Response;", "Lcom/bbva/component/ic/security/model/OtpErrors;", "toOtpError", "component-ic-security_release"}, k = 2, mv = {2, 0, 0})
public final class ResponseExtensionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f28190a = LazyKt__LazyJVMKt.lazy(new a());

    @NotNull
    public static final OtpErrors toOtpError(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        int code = response.getCode();
        Lazy lazy = f28190a;
        if (code == 401) {
            NetworkError networkError = (NetworkError) ((Gson) lazy.getValue()).fromJson(response.getBody(), NetworkError.class);
            if (!Intrinsics.areEqual(networkError != null ? networkError.getErrorCode() : null, "70")) {
                OtpChallengeError otpChallengeError = (OtpChallengeError) ((Gson) lazy.getValue()).fromJson(response.getBody(), OtpChallengeError.class);
                if (!Intrinsics.areEqual(otpChallengeError != null ? otpChallengeError.errorCode() : null, HttpConstants.OTP_CHALLENGE_ERROR_CODE)) {
                    return OtpErrors.Unknown.INSTANCE;
                }
            }
            return OtpErrors.Unauthorized.INSTANCE;
        }
        if (code != 403) {
            return OtpErrors.Unknown.INSTANCE;
        }
        if (response.getBody().length() != 0) {
            ForbiddenBody forbiddenBody = (ForbiddenBody) ((Gson) lazy.getValue()).fromJson(response.getBody(), ForbiddenBody.class);
            if (forbiddenBody == null || !forbiddenBody.hasForbiddenCode()) {
                return OtpErrors.Unknown.INSTANCE;
            }
        }
        return OtpErrors.Forbidden.INSTANCE;
    }
}
