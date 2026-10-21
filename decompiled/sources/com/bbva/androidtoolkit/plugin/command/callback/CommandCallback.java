package com.bbva.androidtoolkit.plugin.command.callback;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.bbva.androidtoolkit.plugin.filesystem.WebFile;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.androidtoolkit.utils.StringUtils;
import org.jetbrains.annotations.NonNls;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CommandCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PluginTarget f26516b;

    public CommandCallback(String str, PluginTarget pluginTarget) {
        this.f26515a = str;
        this.f26516b = pluginTarget;
    }

    public final void a(int i10, Object obj) {
        this.f26516b.send(this.f26515a, new PluginResult(i10, obj));
    }

    public void sendError(@NonNull JSONObject jSONObject) {
        a(1, jSONObject);
    }

    public void sendEvent(@NonNull JSONObject jSONObject) {
        a(0, jSONObject);
    }

    public void sendExtras(@NonNull Bundle bundle) {
        JSONObject jSONObjectConvertMapToJsonObject = PluginUtils.convertMapToJsonObject(PluginUtils.convertBundleToMap(bundle));
        if (jSONObjectConvertMapToJsonObject != null) {
            sendEvent(jSONObjectConvertMapToJsonObject);
        }
    }

    public void sendError(ErrorMessage errorMessage) {
        sendError(SimpleResponse.error(errorMessage));
    }

    public void sendEvent(int i10) {
        a(0, Integer.valueOf(i10));
    }

    public void sendError(@NonNull @NonNls String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return;
        }
        a(1, str);
    }

    public void sendEvent(boolean z10) {
        a(0, Boolean.valueOf(z10));
    }

    public void sendEvent(@NonNull @NonNls String str) {
        a(0, str);
    }

    public void sendEvent() {
        a(0, null);
    }

    public void sendEvent(JSONArray jSONArray) {
        a(0, jSONArray);
    }

    public void sendEvent(WebFile webFile) {
        a(0, webFile.getUrl().toString());
    }
}
