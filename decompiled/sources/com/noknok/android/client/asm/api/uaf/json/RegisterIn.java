package com.noknok.android.client.asm.api.uaf.json;

import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes11.dex */
public class RegisterIn {

    @Expose
    public String appID;

    @Expose
    public Short attestationType = null;

    @Expose
    public String finalChallenge;

    @Expose
    public String username;

    public boolean isValid() {
        String str;
        String str2;
        String str3 = this.appID;
        return (str3 == null || str3.isEmpty() || this.appID.length() > 512 || (str = this.username) == null || str.isEmpty() || (str2 = this.finalChallenge) == null || str2.isEmpty() || this.attestationType == null) ? false : true;
    }
}
