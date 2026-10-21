package com.bbva.plugin.biometrics.command.response;

import bk.p;
import bk.q;
import com.bbva.biometrics.authenticator.data.AuthenticateResult;
import com.bbva.biometrics.authenticator.data.BiometricType;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: BiometricsResult.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/biometrics/command/response/BiometricsResult;", "", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "authResult", "Lorg/json/JSONObject;", "getJsonObjectResult", "", "code", "", "message", "<init>", "()V", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class BiometricsResult {

    @NotNull
    public static final BiometricsResult INSTANCE = new BiometricsResult();

    public static JSONObject a(int i10, String str) {
        return new JSONObject(q.mapOf(TuplesKt.to("code", Integer.valueOf(i10)), TuplesKt.to("message", str)));
    }

    public static JSONObject b(String str) {
        return new JSONObject(q.mapOf(TuplesKt.to("status", 0), TuplesKt.to(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, p.mapOf(TuplesKt.to("type", str)))));
    }

    @NotNull
    public final JSONObject getJsonObjectResult(int code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (code == 0) {
            return b(BiometricType.NONE.getValue());
        }
        if (code == 1) {
            return a(3, message);
        }
        if (code == 3) {
            return a(974, message);
        }
        if (code == 5) {
            return a(972, message);
        }
        switch (code) {
            case 7:
                return a(970, message);
            case 8:
                return a(971, message);
            case 9:
                return a(975, message);
            case 10:
            case 13:
                return a(0, message);
            case 11:
                return a(967, message);
            case 12:
                return a(4, message);
            default:
                return a(-1, message);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    @NotNull
    public final JSONObject getJsonObjectResult(@NotNull AuthenticateResult authResult) {
        AuthenticateResult unknown;
        Intrinsics.checkNotNullParameter(authResult, "authResult");
        if (authResult instanceof AuthenticateResult.Success) {
            unknown = new AuthenticateResult.Success(0, null, authResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), 2, null);
        } else if (authResult instanceof AuthenticateResult.HwUnavailable) {
            unknown = new AuthenticateResult.HwUnavailable(3, null, authResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), 2, null);
        } else if (authResult instanceof AuthenticateResult.NoneEnrolled) {
            unknown = new AuthenticateResult.NoneEnrolled(967, null, authResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), 2, null);
        } else {
            if (authResult instanceof AuthenticateResult.NoHardware) {
                authResult = new AuthenticateResult.NoHardware(4, null, 2, null);
            } else if (authResult instanceof AuthenticateResult.Unknown) {
                unknown = new AuthenticateResult.Unknown(-1, null, authResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), 2, null);
            } else if (!(authResult instanceof AuthenticateResult.CipherNotSupported)) {
                throw new NoWhenBranchMatchedException();
            }
            return authResult instanceof AuthenticateResult.Success ? b(authResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String()) : new JSONObject(q.toMap(q.mapOf(TuplesKt.to("code", Integer.valueOf(authResult.getState())), TuplesKt.to("message", authResult.getDescription()), TuplesKt.to("type", authResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String()))));
        }
        authResult = unknown;
        if (authResult instanceof AuthenticateResult.Success) {
        }
    }
}
