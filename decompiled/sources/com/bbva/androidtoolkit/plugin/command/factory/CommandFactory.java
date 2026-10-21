package com.bbva.androidtoolkit.plugin.command.factory;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CommandFactory {
    private Map<String, CommandProvider> mCommandProviders = new HashMap();

    public void addCommandProvider(String str, CommandProvider commandProvider) {
        this.mCommandProviders.put(str, commandProvider);
    }

    public AbstractCommand get(String str) {
        String lowerCase = str.toLowerCase();
        if (this.mCommandProviders.containsKey(lowerCase)) {
            return this.mCommandProviders.get(lowerCase).create();
        }
        return null;
    }
}
