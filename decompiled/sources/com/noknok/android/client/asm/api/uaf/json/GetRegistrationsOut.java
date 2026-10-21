package com.noknok.android.client.asm.api.uaf.json;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GetRegistrationsOut {

    @Expose
    public List<AppRegistration> appRegs = new ArrayList();

    public static class AppRegistration {

        @Expose
        public String appID;

        @Expose
        public final List<String> keyIDs;

        public AppRegistration() {
            this.keyIDs = new ArrayList();
        }

        public AppRegistration(String str, String str2) {
            ArrayList arrayList = new ArrayList();
            this.keyIDs = arrayList;
            this.appID = str;
            arrayList.add(str2);
        }
    }
}
