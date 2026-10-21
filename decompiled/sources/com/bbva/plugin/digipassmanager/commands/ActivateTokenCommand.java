package com.bbva.plugin.digipassmanager.commands;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.library.digipassmanager.callbacks.OnActivateTokenCrontoOperation;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.library.digipassmanager.helpers.RepositoryHelper;
import com.bbva.network.model.pinning.PinningCatalog;
import com.bbva.plugin.digipassmanager.commands.errors.CustomErrors;
import com.bbva.plugin.digipassmanager.commands.params.ActivateTokenParams;
import com.bbva.plugin.digipassmanager.commands.validators.ActivateTokenParamsValidator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: ActivateTokenCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/digipassmanager/commands/ActivateTokenCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/digipassmanager/commands/params/ActivateTokenParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/network/model/pinning/PinningCatalog;", "pinningCatalog", "<init>", "(Lcom/bbva/network/model/pinning/PinningCatalog;)V", "Companion", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class ActivateTokenCommand extends AbstractCommand<ActivateTokenParams> {

    @NotNull
    public static final String ID = "activate_token";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final PinningCatalog f35624p0;

    public ActivateTokenCommand(@Nullable PinningCatalog pinningCatalog) {
        super(ActivateTokenParams.class, new ActivateTokenParamsValidator());
        this.f35624p0 = pinningCatalog;
    }

    public static final void access$handleError(ActivateTokenCommand activateTokenCommand, JSONObject jSONObject, CommandCallback commandCallback) {
        activateTokenCommand.getClass();
        if (Intrinsics.areEqual(jSONObject.get(DigipassManagerConstants.KEY_INFO_ERROR), DigipassManagerConstants.LIMIT_REACHED_ERROR)) {
            commandCallback.sendError(CustomErrors.LimitReached);
        } else {
            commandCallback.sendError(CustomErrors.InternalError);
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable ActivateTokenParams params, @NotNull final CommandCallback callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (params != null) {
            RepositoryHelper repositoryHelper = new RepositoryHelper();
            String deviceId = params.getDeviceId();
            String serialNumber = params.getSerialNumber();
            Map<String, String> headers = params.getHeaders();
            Context applicationContext = this.mApplication.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "mApplication.applicationContext");
            repositoryHelper.initActivationTokenCronto(deviceId, serialNumber, headers, applicationContext, this.f35624p0, new OnActivateTokenCrontoOperation() { // from class: com.bbva.plugin.digipassmanager.commands.ActivateTokenCommand$execute$1$1
                @Override // com.bbva.library.digipassmanager.callbacks.OnActivateTokenCrontoOperation
                public void onActivationComplete(@NotNull JSONObject infoSuccess) {
                    Intrinsics.checkNotNullParameter(infoSuccess, "infoSuccess");
                    callback.sendEvent("ok");
                }

                @Override // com.bbva.library.digipassmanager.callbacks.OnActivateTokenCrontoOperation
                public void onActivationFailure(@NotNull JSONObject infoError) {
                    Intrinsics.checkNotNullParameter(infoError, "infoError");
                    ActivateTokenCommand.access$handleError(this, infoError, callback);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            callback.sendError(Errors.ErrorMalformedParam);
        }
    }
}
