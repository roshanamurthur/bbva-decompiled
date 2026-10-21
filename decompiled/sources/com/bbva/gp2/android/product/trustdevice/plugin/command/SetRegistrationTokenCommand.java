package com.bbva.gp2.android.product.trustdevice.plugin.command;

import android.app.Application;
import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import com.bbva.gp2.android.product.trustdevice.library.TrustResult;
import com.bbva.gp2.android.product.trustdevice.plugin.TrustDeviceLibInjector;
import com.bbva.gp2.android.product.trustdevice.plugin.command.validator.SetRegistrationTokenValidator;
import com.bbva.gp2.android.product.trustdevice.plugin.request.SetRegistrationTokenRequest;
import com.bbva.gp2.android.product.trustdevice.plugin.utils.Response;
import com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetRegistrationTokenCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/command/SetRegistrationTokenCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/gp2/android/product/trustdevice/plugin/request/SetRegistrationTokenRequest;", "()V", "execute", "", "params", "commandCallback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final class SetRegistrationTokenCommand extends AbstractCommand<SetRegistrationTokenRequest> {

    @NotNull
    public static final String ID = "setregistrationtoken";

    public SetRegistrationTokenCommand() {
        super(SetRegistrationTokenRequest.class, SetRegistrationTokenValidator.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException */
    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull SetRegistrationTokenRequest params, @NotNull CommandCallback commandCallback) throws InitNeededException {
        TrustDeviceLib.Companion companion = TrustDeviceLib.INSTANCE;
        Application mApplication = this.mApplication;
        Intrinsics.checkExpressionValueIsNotNull(mApplication, "mApplication");
        Context applicationContext = mApplication.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "mApplication.applicationContext");
        companion.init(applicationContext);
        TrustResult<String> registrationToken = TrustDeviceLibInjector.INSTANCE.getTrustDevice().setRegistrationToken(params.getDid());
        if (registrationToken instanceof TrustResult.Result) {
            commandCallback.sendEvent(this.mGson.toJson(Response.Companion.ok$default(Response.INSTANCE, null, 1, null)));
        } else if (registrationToken instanceof TrustResult.Error) {
            commandCallback.sendError(this.mGson.toJson(Response.INSTANCE.error(((TrustResult.Error) registrationToken).getError().name())));
        }
    }
}
