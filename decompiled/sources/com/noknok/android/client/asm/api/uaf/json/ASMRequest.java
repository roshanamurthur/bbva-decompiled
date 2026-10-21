package com.noknok.android.client.asm.api.uaf.json;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ASMRequest {

    @Expose
    public JsonObject args;

    @Expose
    public Version asmVersion;

    @Expose
    public Short authenticatorIndex;

    @Expose
    public List<Extension> exts = new ArrayList();

    @Expose
    public RequestType requestType;

    public enum RequestType {
        GetInfo,
        Register,
        Authenticate,
        Deregister,
        GetRegistrations,
        CommitRegistration,
        OpenSettings
    }
}
