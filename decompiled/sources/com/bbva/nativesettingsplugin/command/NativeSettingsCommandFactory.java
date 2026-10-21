package com.bbva.nativesettingsplugin.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NativeSettingsCommandFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/nativesettingsplugin/command/NativeSettingsCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "Companion", "nativesettings-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class NativeSettingsCommandFactory extends CommandFactory {

    @NotNull
    public static final String ACTION_LAUNCH_SETTING = "opensetting";

    /* JADX INFO: compiled from: NativeSettingsCommandFactory.kt */
    public static final class a implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35054a = new a();

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand<Object> create() {
            return new OpenSettingsCommand();
        }
    }

    public NativeSettingsCommandFactory() {
        addCommandProvider(ACTION_LAUNCH_SETTING, a.f35054a);
    }
}
