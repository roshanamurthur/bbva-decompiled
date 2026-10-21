package com.bbva.plugin.naturalauthentication.command.decorator;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: FidoCallbackDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0004J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0004J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0004R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoCallbackDecorator;", "", "", "", "result", "", "onSuccess", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "error", "onFail", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "fidoException", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "a", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "getCallback", "()Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public abstract class FidoCallbackDecorator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CommandCallback callback;

    public FidoCallbackDecorator(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @NotNull
    public final CommandCallback getCallback() {
        return this.callback;
    }

    public final void onFail(@NotNull ErrorMessage error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.callback.sendError(error);
    }

    public final void onSuccess(@NotNull Map<String, ? extends Object> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.callback.sendEvent(new JSONObject(result));
    }

    public final void onFail(@Nullable FidoException fidoException) {
        CommandCallback commandCallback = this.callback;
        if (fidoException == null) {
            commandCallback.sendError(Errors.ErrorDefault);
            return;
        }
        String sdkClientCode = fidoException.getSdkClientCode();
        if (sdkClientCode == null) {
            sdkClientCode = fidoException.getFidoError().getCode();
        }
        String errorInfo = fidoException.getErrorInfo();
        if (!(!(errorInfo == null || errorInfo.length() == 0))) {
            errorInfo = null;
        }
        if (errorInfo == null) {
            errorInfo = fidoException.getFidoError().getGenericMessage();
        }
        Intrinsics.checkNotNull(sdkClientCode);
        Intrinsics.checkNotNull(errorInfo);
        commandCallback.sendError(new JSONObject(q.mapOf(TuplesKt.to("code", sdkClientCode), TuplesKt.to("message", errorInfo))));
    }
}
