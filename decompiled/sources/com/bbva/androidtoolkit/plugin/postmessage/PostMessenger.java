package com.bbva.androidtoolkit.plugin.postmessage;

import androidx.annotation.NonNull;
import com.bbva.androidtoolkit.plugin.command.callback.PluginTarget;

/* JADX INFO: loaded from: classes2.dex */
public class PostMessenger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PluginTarget f26545c;

    public PostMessenger(@NonNull PluginTarget pluginTarget, @NonNull String str, @NonNull String str2) {
        this.f26544b = str;
        this.f26543a = str2;
        this.f26545c = pluginTarget;
    }

    public void postMessage(@NonNull String str, @NonNull PayloadDTO payloadDTO) {
        this.f26545c.sendPostMessage(new PostMessageDTO(this.f26544b, this.f26543a, str, payloadDTO));
    }
}
