package com.bbva.androidtoolkit.plugin;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.google.gson.JsonElement;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Plugin {
    private CommandFactory mCommandFactory;
    private PluginComponentContainer mComponents;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final JsonElement f26486p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AbstractCommand f26487q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CommandCallback f26488r0;

        public a(AbstractCommand abstractCommand, JsonElement jsonElement, CommandCallback commandCallback) {
            this.f26487q0 = abstractCommand;
            this.f26486p0 = jsonElement;
            this.f26488r0 = commandCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26487q0.executeAction(this.f26486p0, this.f26488r0);
        }
    }

    private void executeCommand(AbstractCommand abstractCommand, JsonElement jsonElement, CommandCallback commandCallback) {
        int threadExecution = abstractCommand.getThreadExecution();
        if (threadExecution == 0) {
            abstractCommand.executeAction(jsonElement, commandCallback);
        } else if (threadExecution == 1) {
            this.mComponents.getUIHandler().post(new a(abstractCommand, jsonElement, commandCallback));
        } else {
            if (threadExecution != 2) {
                return;
            }
            this.mComponents.getThreadPool().execute(new a(abstractCommand, jsonElement, commandCallback));
        }
    }

    public abstract CommandFactory createCommandFactory();

    public void execute(String str, JsonElement jsonElement, CommandCallback commandCallback) {
        AbstractCommand abstractCommand = this.mCommandFactory.get(str);
        if (abstractCommand != null) {
            abstractCommand.addComponents(this.mComponents);
            executeCommand(abstractCommand, jsonElement, commandCallback);
            return;
        }
        commandCallback.sendError(SimpleResponse.error(-404, "Plugin [" + getId() + "] doesn't have the command [" + str + Constant.BRACKET_CLOSE));
    }

    public abstract String getId();

    public void initialize(PluginComponentContainer pluginComponentContainer) {
        this.mComponents = pluginComponentContainer;
        this.mCommandFactory = createCommandFactory();
    }

    public boolean isInitialized() {
        return this.mComponents != null;
    }
}
