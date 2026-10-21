package com.bbva.androidtoolkit.plugin.command.callback;

import com.bbva.notifications.model.constants.BanxicoConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PluginResult {
    public static final int ERROR = 1;
    public static final int OK = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26518b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    public PluginResult(int i10, Object obj) {
        this.f26517a = i10;
        this.f26518b = obj;
    }

    public int getCode() {
        return this.f26517a;
    }

    public Object getPayload() {
        return this.f26518b;
    }

    public String toString() {
        try {
            return new JSONObject().put("status", this.f26517a).put(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, this.f26518b).toString();
        } catch (JSONException e5) {
            e5.getMessage();
            return "";
        }
    }
}
