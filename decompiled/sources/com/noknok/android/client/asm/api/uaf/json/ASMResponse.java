package com.noknok.android.client.asm.api.uaf.json;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.utils.Outcome;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ASMResponse {

    @Expose
    public List<Extension> exts = new ArrayList();

    @Expose
    public JsonObject responseData;

    @Expose
    public short statusCode;

    public Outcome getOutcome() {
        return Outcome.fromAsmStatusCode(this.statusCode);
    }

    public void setOutcome(Outcome outcome) {
        this.statusCode = outcome.getUafAsmStatusCode();
    }
}
