package com.bbva.gp2.android.product.trustdevice.plugin.command;

import android.app.Application;
import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import com.bbva.gp2.android.product.trustdevice.library.TrustResult;
import com.bbva.gp2.android.product.trustdevice.plugin.TrustDeviceLibInjector;
import com.bbva.gp2.android.product.trustdevice.plugin.utils.Response;
import com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AreKeysReadyCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/command/AreKeysReadyCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Ljava/lang/Void;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "execute", "", "params", "commandCallback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final class AreKeysReadyCommand extends AbstractCommand<Void> {

    @NotNull
    public static final String ID = "arekeysready";

    public AreKeysReadyCommand(@NotNull Class<Void> cls) {
        super(cls);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException */
    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback commandCallback) throws InitNeededException {
        TrustDeviceLib.Companion companion = TrustDeviceLib.INSTANCE;
        Application mApplication = this.mApplication;
        Intrinsics.checkExpressionValueIsNotNull(mApplication, "mApplication");
        Context applicationContext = mApplication.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "mApplication.applicationContext");
        companion.init(applicationContext);
        TrustResult<String> trustResultAreKeysReady = TrustDeviceLibInjector.INSTANCE.getTrustDevice().areKeysReady();
        if (trustResultAreKeysReady instanceof TrustResult.Result) {
            commandCallback.sendEvent(this.mGson.toJson(Response.Companion.ok$default(Response.INSTANCE, null, 1, null)));
        } else if (trustResultAreKeysReady instanceof TrustResult.Error) {
            commandCallback.sendError(this.mGson.toJson(Response.INSTANCE.error(((TrustResult.Error) trustResultAreKeysReady).getError().name())));
        }
    }
}
