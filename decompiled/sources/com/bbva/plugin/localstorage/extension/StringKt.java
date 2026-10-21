package com.bbva.plugin.localstorage.extension;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.biometrics.authenticator.data.AuthenticationType;
import com.bbva.plugin.localstorage.exception.IllegalAuthenticationType;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000¨\u0006\t"}, d2 = {"isAuthenticationTypeMalformed", "", "", "serialize", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "toAuthenticationType", "Lcom/bbva/biometrics/authenticator/data/AuthenticationType;", "local-storage-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringKt {
    public static final boolean isAuthenticationTypeMalformed(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return ((!Intrinsics.areEqual(str, AuthenticationType.STRONG.name()) && !Intrinsics.areEqual(str, AuthenticationType.CREDENTIALS.name())) ? Intrinsics.areEqual(str, AuthenticationType.STRONG_CREDENTIALS.name()) : true) ^ true;
    }

    public static final void serialize(@NotNull String str, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objNextValue = new JSONTokener(str).nextValue();
            if (objNextValue instanceof JSONObject) {
                callback.sendEvent(new JSONObject(str));
            } else if (objNextValue instanceof JSONArray) {
                callback.sendEvent(new JSONArray(str));
            } else {
                callback.sendEvent(str);
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null) {
            return;
        }
        callback.sendEvent(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final AuthenticationType toAuthenticationType(@NotNull String str) throws IllegalAuthenticationType {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -2031994731:
                if (str.equals("WEAK_CREDENTIALS")) {
                    return AuthenticationType.WEAK_CREDENTIALS;
                }
                break;
            case -1853049124:
                if (str.equals("CREDENTIALS")) {
                    return AuthenticationType.CREDENTIALS;
                }
                break;
            case -1838650729:
                if (str.equals("STRONG")) {
                    return AuthenticationType.STRONG;
                }
                break;
            case -1831119564:
                if (str.equals("STRONG_CREDENTIALS")) {
                    return AuthenticationType.STRONG_CREDENTIALS;
                }
                break;
            case 64897:
                if (str.equals("ALL")) {
                    return AuthenticationType.ALL;
                }
                break;
            case 2660216:
                if (str.equals("WEAK")) {
                    return AuthenticationType.WEAK;
                }
                break;
        }
        throw IllegalAuthenticationType.INSTANCE;
    }
}
