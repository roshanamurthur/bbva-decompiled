package com.bbva.plugin.decode.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.decode.QRDecode;
import com.bbva.decode.data.DecodeParams;
import com.bbva.plugin.decode.validators.DecodeParamsValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DecodeCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/decode/command/DecodeCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/decode/data/DecodeParams;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "DecodeCommandJson", "decode-plugin_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DecodeCommand extends AbstractCommand<DecodeParams> {

    /* JADX INFO: compiled from: DecodeCommand.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/decode/command/DecodeCommand$DecodeCommandJson;", "", "(Lcom/bbva/plugin/decode/command/DecodeCommand;)V", "getSuccessJson", "Lorg/json/JSONObject;", "data", "", "decode-plugin_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class DecodeCommandJson {
        public DecodeCommandJson(DecodeCommand decodeCommand) {
        }

        @NotNull
        public final JSONObject getSuccessJson(@NotNull String data) throws JSONException {
            Intrinsics.checkNotNullParameter(data, "data");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("challengeData", data);
            return jSONObject;
        }
    }

    public DecodeCommand() {
        super(DecodeParams.class, new DecodeParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull DecodeParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strDecode = new QRDecode().decode(params);
        if (strDecode.length() == 0) {
            callback.sendError(Errors.ErrorDefault);
        } else {
            callback.sendEvent(new DecodeCommandJson(this).getSuccessJson(strDecode));
        }
    }
}
