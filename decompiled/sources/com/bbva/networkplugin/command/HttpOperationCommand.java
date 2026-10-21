package com.bbva.networkplugin.command;

import android.net.Uri;
import androidx.camera.core.processing.f;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.androidtoolkit.utils.Tracer;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.exceptions.NotConnectionAvailable;
import com.bbva.network.exceptions.SslConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.networkplugin.command.params.RequestParams;
import com.bbva.networkplugin.command.response.HttpErrorResponse;
import com.bbva.networkplugin.exception.HttpConnectionException;
import com.bbva.networkplugin.utils.JsonUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: HttpOperationCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H$J\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0004¨\u0006\u0011"}, d2 = {"Lcom/bbva/networkplugin/command/HttpOperationCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/networkplugin/command/params/RequestParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "req", "Lorg/json/JSONObject;", "executeHttpCommand", "", "url", "Lcom/google/gson/JsonElement;", "compoundUrl", "<init>", "()V", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttpOperationCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpOperationCommand.kt\ncom/bbva/networkplugin/command/HttpOperationCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1179#2,2:107\n1253#2,4:109\n*S KotlinDebug\n*F\n+ 1 HttpOperationCommand.kt\ncom/bbva/networkplugin/command/HttpOperationCommand\n*L\n92#1:107,2\n92#1:109,4\n*E\n"})
public abstract class HttpOperationCommand extends AbstractCommand<RequestParams> {
    public HttpOperationCommand() {
        super(RequestParams.class, 2);
    }

    @NotNull
    public final String compoundUrl(@NotNull String url, @Nullable JsonElement params) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (params == null || !params.isJsonObject()) {
            return url;
        }
        Set<Map.Entry<String, JsonElement>> setEntrySet = ((JsonObject) params).entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "params as JsonObject).entrySet()");
        Set<Map.Entry<String, JsonElement>> set = setEntrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(set, 10, 16));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = TuplesKt.to(entry.getKey(), ((JsonElement) entry.getValue()).toString());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        if (linkedHashMap.isEmpty()) {
            return url;
        }
        Uri.Builder builderBuildUpon = Uri.parse(url).buildUpon();
        for (String str : linkedHashMap.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) linkedHashMap.get(str));
        }
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "parse(url).buildUpon().a…     }.build().toString()");
        return string;
    }

    @NotNull
    public abstract JSONObject executeHttpCommand(@NotNull RequestParams req) throws JSONException, NotConnectionAvailable, IOException, ConnectionException, HttpConnectionException;

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull RequestParams params, @NotNull CommandCallback callback) {
        String string;
        String strString;
        String str;
        String str2;
        String str3;
        int i10;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.sendEvent(executeHttpCommand(params));
        } catch (NotConnectionAvailable e5) {
            Tracer.e(e5, "Cannot connect to server");
            callback.sendError(HttpErrorResponse.httpError$default(HttpErrorResponse.INSTANCE, 0, e5.getMessage(), null, null, null, 28, null));
        } catch (SslConnectionException e7) {
            Tracer.e(e7, "Ssl connection exception \n\nUrl: " + e7.getMessage());
            callback.sendError(HttpErrorResponse.httpError$default(HttpErrorResponse.INSTANCE, 0, "Ssl connection exception", null, null, null, 28, null));
        } catch (ConnectionException e10) {
            Tracer.e(e10, "Cannot connect to server");
            String url = null;
            int code = 0;
            try {
                NetworkResponse networkResponse = e10.getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
                if (networkResponse != null) {
                    code = networkResponse.getCode();
                    string = JsonUtils.toJson(networkResponse.getHeaders()).toString();
                    try {
                        strString = networkResponse.getBody().string();
                        if (strString == null) {
                            strString = "";
                        }
                        try {
                            url = networkResponse.getUrl();
                        } catch (Exception e11) {
                            e = e11;
                            Tracer.e(e, "Error forwarding network response");
                            str = url;
                            i10 = code;
                            str3 = string;
                            str2 = strString;
                            callback.sendError(HttpErrorResponse.INSTANCE.httpError(i10, e10.getMessage(), str3, str2, str));
                        }
                    } catch (Exception e12) {
                        e = e12;
                        strString = null;
                    }
                    str = url;
                    i10 = code;
                    str3 = string;
                    str2 = strString;
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                    i10 = 0;
                }
            } catch (Exception e13) {
                e = e13;
                string = null;
                strString = null;
            }
            callback.sendError(HttpErrorResponse.INSTANCE.httpError(i10, e10.getMessage(), str3, str2, str));
        } catch (HttpConnectionException e14) {
            Tracer.e(e14, "Error when we were trying to connect");
            callback.sendError(HttpErrorResponse.httpError$default(HttpErrorResponse.INSTANCE, e14.getCode(), e14.getMessage(), null, null, null, 28, null));
        } catch (ClassCastException e15) {
            Tracer.e(e15, e15.getMessage());
            callback.sendError(Errors.ErrorMalformedParam);
        } catch (UnknownHostException e16) {
            callback.sendError(HttpErrorResponse.httpError$default(HttpErrorResponse.INSTANCE, 0, e16.getMessage(), null, null, null, 28, null));
        } catch (SSLException e17) {
            Tracer.e(e17, "Ssl connection exception \n\nUrl: " + e17.getMessage());
            callback.sendError(HttpErrorResponse.httpError$default(HttpErrorResponse.INSTANCE, 0, "Ssl connection exception", null, null, null, 28, null));
        } catch (IOException e18) {
            Tracer.e(e18, "Error when we were trying to connect");
            callback.sendError(Errors.ErrorDefault);
        } catch (JSONException e19) {
            Tracer.e(e19, "Error while trying to create params");
            callback.sendError("Json exception");
        } catch (Exception e20) {
            Tracer.e(e20, e20.getMessage());
            callback.sendError(Errors.ErrorDefault);
        }
    }
}
