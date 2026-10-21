package com.bbva.networkplugin.command.response;

import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: HttpErrorResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\f"}, d2 = {"Lcom/bbva/networkplugin/command/response/HttpErrorResponse;", "", "()V", "httpError", "Lorg/json/JSONObject;", "statusCode", "", "message", "", "headers", "body", "url", "network-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHttpErrorResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpErrorResponse.kt\ncom/bbva/networkplugin/command/response/HttpErrorResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class HttpErrorResponse {

    @NotNull
    public static final HttpErrorResponse INSTANCE = new HttpErrorResponse();

    public static /* synthetic */ JSONObject httpError$default(HttpErrorResponse httpErrorResponse, int i10, String str, String str2, String str3, String str4, int i11, Object obj) {
        return httpErrorResponse.httpError(i10, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
    }

    @JvmOverloads
    @NotNull
    public final JSONObject httpError(int i10, @Nullable String str) {
        return httpError$default(this, i10, str, null, null, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final JSONObject httpError(int i10, @Nullable String str, @Nullable String str2) {
        return httpError$default(this, i10, str, str2, null, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public final JSONObject httpError(int i10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return httpError$default(this, i10, str, str2, str3, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final JSONObject httpError(int statusCode, @Nullable String message, @Nullable String headers, @Nullable String body, @Nullable String url) throws JSONException {
        JSONObject jSONObjectError = SimpleResponse.error(901, message);
        jSONObjectError.put("status", statusCode);
        jSONObjectError.put("responseURL", url);
        if (headers != null) {
            jSONObjectError.put("headers", headers);
        }
        if (body != null) {
            jSONObjectError.put(DigipassManagerConstants.KEY_RESPONSE, body);
        }
        Intrinsics.checkNotNullExpressionValue(jSONObjectError, "error(901, message).appl…ponse\", body) }\n        }");
        return jSONObjectError;
    }
}
