package com.bbva.plugin.geolocation.command;

import android.app.Activity;
import android.content.Intent;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PromptForLocationServiceCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/geolocation/command/PromptForLocationServiceCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Ljava/lang/Void;", "<init>", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromptForLocationServiceCommand extends AbstractCommand<Void> {

    @NotNull
    public static final String ID = "promptforlocationservice";

    public PromptForLocationServiceCommand() {
        super(Void.class);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Optional<Activity> optional = this.mActivityContainer.get();
        if (!optional.isPresent()) {
            callback.sendError(Errors.ErrorDefault);
        } else {
            optional.get().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            callback.sendEvent();
        }
    }
}
