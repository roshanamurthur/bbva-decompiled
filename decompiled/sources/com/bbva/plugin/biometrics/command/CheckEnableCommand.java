package com.bbva.plugin.biometrics.command;

import android.app.Application;
import com.bbva.biometrics.authenticator.Biometrics;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.plugin.biometrics.BiometricsFactory;
import com.bbva.plugin.biometrics.command.base.BiometricsCommand;
import com.bbva.plugin.biometrics.command.response.BiometricsResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CheckEnableCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/biometrics/command/CheckEnableCommand;", "Lcom/bbva/plugin/biometrics/command/base/BiometricsCommand;", "", "biometricsFactory", "Lcom/bbva/plugin/biometrics/BiometricsFactory;", "(Lcom/bbva/plugin/biometrics/BiometricsFactory;)V", "execute", "", "params", "biometricsBuilder", "Lcom/bbva/biometrics/authenticator/Biometrics$Builder;", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CheckEnableCommand extends BiometricsCommand {
    /* JADX WARN: Multi-variable type inference failed */
    public CheckEnableCommand() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CheckEnableCommand(BiometricsFactory biometricsFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new BiometricsFactory() : biometricsFactory);
    }

    @Override // com.bbva.plugin.biometrics.command.base.BiometricsCommand
    public void execute(@Nullable Void params, @NotNull Biometrics.Builder biometricsBuilder) throws JSONException {
        Intrinsics.checkNotNullParameter(biometricsBuilder, "biometricsBuilder");
        Biometrics biometricsBuild = biometricsBuilder.build();
        Application mApplication = this.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        JSONObject jsonObjectResult = BiometricsResult.INSTANCE.getJsonObjectResult(biometricsBuild.canAuthenticate(mApplication));
        if (!jsonObjectResult.has("status")) {
            getCommandCallback().sendError(jsonObjectResult);
        } else {
            getCommandCallback().sendEvent(jsonObjectResult.getJSONObject(BanxicoConstants.KEY_HISTORICAL_PAYLOAD));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckEnableCommand(@NotNull BiometricsFactory biometricsFactory) {
        super(Void.class, biometricsFactory);
        Intrinsics.checkNotNullParameter(biometricsFactory, "biometricsFactory");
    }
}
