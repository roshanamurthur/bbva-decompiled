package com.bbva.androidtoolkit.plugin.command.callback;

import com.bbva.androidtoolkit.plugin.postmessage.PostMessageDTO;

/* JADX INFO: loaded from: classes2.dex */
public interface PluginTarget {
    void send(String str, PluginResult pluginResult);

    void sendPostMessage(PostMessageDTO postMessageDTO);
}
