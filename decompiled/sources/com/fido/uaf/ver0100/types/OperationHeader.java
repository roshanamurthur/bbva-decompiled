package com.fido.uaf.ver0100.types;

import com.google.gson.annotations.Expose;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.utils.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class OperationHeader {

    @Expose
    public String appID = "";
    public List<Extension> exts;

    @Expose
    public OperationType op;
    public String serverData;

    @Expose
    public Version upv;

    public enum OperationType {
        Reg,
        Auth,
        Dereg
    }

    public String getAppID() {
        return this.appID;
    }

    public OperationType getOp() {
        return this.op;
    }

    public String getSessionID() {
        return this.serverData;
    }

    public boolean isValid() {
        Version version;
        List<Extension> list = this.exts;
        if (list != null) {
            for (Extension extension : list) {
                if (extension == null || !extension.isValid()) {
                    return false;
                }
            }
        }
        if (this.op == null || (version = this.upv) == null || !version.isValid()) {
            return false;
        }
        String str = this.appID;
        if (str != null && !str.isEmpty() && str.length() > 512) {
            Logger.e("OperationHeader", "AppID length is not in range [0...512].");
            return false;
        }
        String str2 = this.serverData;
        if (str2 == null || (str2.length() >= 1 && str2.length() <= 1536)) {
            return true;
        }
        Logger.e("OperationHeader", "ServerData length is not in range [1...1536].");
        return false;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setOp(OperationType operationType) {
        this.op = operationType;
    }

    public void setSessionID(String str) {
        this.serverData = str;
    }
}
