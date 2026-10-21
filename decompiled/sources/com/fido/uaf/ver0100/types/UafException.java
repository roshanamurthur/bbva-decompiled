package com.fido.uaf.ver0100.types;

import androidx.camera.camera2.internal.h0;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.utils.Outcome;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class UafException extends RuntimeException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Outcome f43547p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public JsonObject f43548q0;

    public UafException(Outcome outcome) {
        super(outcome.name());
        this.f43548q0 = null;
        this.f43547p0 = outcome;
    }

    public Outcome error() {
        return this.f43547p0;
    }

    public JsonObject getAdditionalData() {
        return this.f43548q0;
    }

    public void setAcceptedAuthenticators(JsonArray jsonArray) {
        if (jsonArray != null) {
            if (this.f43548q0 == null) {
                this.f43548q0 = new JsonObject();
            }
            this.f43548q0.add(Constants.authenticators, jsonArray);
        }
    }

    public UafException(Outcome outcome, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(outcome.name());
        sb2.append(str != null ? h0.b(" (", str, ")") : "");
        super(sb2.toString());
        this.f43548q0 = null;
        this.f43547p0 = outcome;
    }

    public UafException(Outcome outcome, List<Extension> list) {
        super(outcome.name());
        this.f43548q0 = null;
        this.f43547p0 = outcome;
        JsonObject jsonObject = new JsonObject();
        this.f43548q0 = jsonObject;
        if (list != null) {
            jsonObject.add("exts", new Gson().toJsonTree(list).getAsJsonArray());
        }
    }
}
