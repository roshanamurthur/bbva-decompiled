package com.bbva.component.ic.security;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpConstants.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ic/security/HttpConstants;", "", "<init>", "()V", "Companion", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpConstants {

    @NotNull
    public static final String FORBIDDEN_CODE = "forbidden";

    @NotNull
    public static final String HEADER_AUTHENTICATION_DATA = "authenticationdata";

    @NotNull
    public static final String HEADER_AUTHENTICATION_TYPE = "authenticationtype";
    public static final int HTTP_FORBIDDEN_CODE = 403;

    @NotNull
    public static final String HTTP_SECOND_FACTOR_CODE = "428";
    public static final int HTTP_UNAUTHORIZED_CODE = 401;

    @NotNull
    public static final String OTP_CHALLENGE_ERROR_CODE = "stateChangeGoOn";

    @NotNull
    public static final String OTP_ERROR_CODE = "70";
}
