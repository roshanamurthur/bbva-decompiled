package com.bbva.selfiecapture.plugin.command;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.selfiecapture.plugin.command.GetConfigurationKeysCommand;
import com.bbva.selfiecapture.plugin.command.SelfieCapturable;
import com.bbva.selfiecapture.plugin.di.InjectorKt;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: compiled from: GetConfigurationKeysCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/GetConfigurationKeysCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "<init>", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetConfigurationKeysCommand extends AbstractCommand {
    public GetConfigurationKeysCommand() {
        super(Void.class);
    }

    public static Unit a(GetConfigurationKeysCommand getConfigurationKeysCommand, CommandCallback commandCallback, SelfieCapturable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Application mApplication = getConfigurationKeysCommand.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        commandCallback.sendEvent(new JSONArray((Collection) it.getConfigurationKeys(mApplication)));
        return Unit.INSTANCE;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InjectorKt.withSelfieCapture(callback, new Function1() { // from class: vb.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GetConfigurationKeysCommand.a(this.f94007p0, callback, (SelfieCapturable) obj);
            }
        });
    }
}
