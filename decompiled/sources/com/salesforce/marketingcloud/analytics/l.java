package com.salesforce.marketingcloud.analytics;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public interface l {

    public enum a {
        SYNC_API("deviceSyncCallTimeMs"),
        TRIGGER_PROCESS("inAppMsgProcessingTimeMs");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f63918a;

        a(String str) {
            this.f63918a = str;
        }

        @NonNull
        public String b() {
            return this.f63918a;
        }
    }

    void a(@NonNull a aVar, @NonNull JSONObject jSONObject);
}
