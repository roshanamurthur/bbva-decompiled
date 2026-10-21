package com.bbva.actionlauncher.plugin.extensions;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CommandsExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¨\u0006\u0007"}, d2 = {"notifyResult", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "func", "Lkotlin/Function0;", "", "actionlauncher-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CommandsExtensionsKt {
    public static final void notifyResult(@NotNull CommandCallback callback, @NotNull Function0<Boolean> func) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(func, "func");
        if (func.invoke().booleanValue()) {
            callback.sendEvent();
        } else {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}
