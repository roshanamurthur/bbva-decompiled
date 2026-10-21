package com.bbva.plugin.digipassmanager.commands;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.library.digipassmanager.helpers.DigipassManagerHelper;
import com.bbva.plugin.digipassmanager.commands.errors.CustomErrors;
import com.bbva.plugin.digipassmanager.commands.params.GenerateOtpParams;
import com.bbva.plugin.digipassmanager.commands.validators.GenerateOtpParamsValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GenerateOtpCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/digipassmanager/commands/GenerateOtpCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/digipassmanager/commands/params/GenerateOtpParams;", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "GenerateOtpCommandJson", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GenerateOtpCommand extends AbstractCommand<GenerateOtpParams> {

    @NotNull
    public static final String ID = "generate_otp";

    /* JADX INFO: compiled from: GenerateOtpCommand.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/digipassmanager/commands/GenerateOtpCommand$GenerateOtpCommandJson;", "", "(Lcom/bbva/plugin/digipassmanager/commands/GenerateOtpCommand;)V", "getSuccessJson", "Lorg/json/JSONObject;", "data", "", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class GenerateOtpCommandJson {
        public GenerateOtpCommandJson(GenerateOtpCommand generateOtpCommand) {
        }

        @NotNull
        public final JSONObject getSuccessJson(@NotNull String data) throws JSONException {
            Intrinsics.checkNotNullParameter(data, "data");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("otp", data);
            return jSONObject;
        }
    }

    public GenerateOtpCommand() {
        super(GenerateOtpParams.class, new GenerateOtpParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable GenerateOtpParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (params == null) {
            callback.sendError(Errors.ErrorMalformedParam);
            return;
        }
        String challenge = params.getChallenge();
        String challenge2 = (challenge == null || challenge.length() <= 0) ? "" : params.getChallenge();
        DigipassManagerHelper companion = DigipassManagerHelper.INSTANCE.getInstance();
        Context applicationContext = this.mApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "mApplication.applicationContext");
        String strGenerateOtp = companion.generateOtp(applicationContext, params.getDeviceId(), challenge2);
        if (strGenerateOtp.length() > 0) {
            callback.sendEvent(new GenerateOtpCommandJson(this).getSuccessJson(strGenerateOtp));
        } else {
            callback.sendError(CustomErrors.InternalError);
        }
    }
}
