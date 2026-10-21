package com.bbva.discreetmode.plugin.commands;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.discreetmode.DiscreetMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StopMonitoringCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/discreetmode/plugin/commands/StopMonitoringCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/discreetmode/DiscreetMode;", "discreetMode", "<init>", "(Lcom/bbva/discreetmode/DiscreetMode;)V", "Companion", "discreetmode-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class StopMonitoringCommand extends AbstractCommand<Object> {

    @NotNull
    public static final String ID = "stopmonitoring";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final DiscreetMode f29089p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopMonitoringCommand(@NotNull DiscreetMode discreetMode) {
        super(Object.class);
        Intrinsics.checkNotNullParameter(discreetMode, "discreetMode");
        this.f29089p0 = discreetMode;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Object params, @Nullable CommandCallback callback) {
        this.f29089p0.stopMonitoring();
        if (callback == null) {
            return;
        }
        callback.sendEvent();
    }
}
