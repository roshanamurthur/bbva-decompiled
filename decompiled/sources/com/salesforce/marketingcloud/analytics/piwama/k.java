package com.salesforce.marketingcloud.analytics.piwama;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.adobe.marketing.mobile.UserProfileKeyConstants;
import com.bbva.glomohybrid.login.model.constants.ExpiredPasswordConstants;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class k extends j {
    public k(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar) {
        super(marketingCloudConfig, jVar);
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.j
    @NonNull
    public JSONObject a(@NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", this.f63970b.getAppPackageName());
            jSONObject3.put("app_id", this.f63970b.applicationId());
            String string = this.f63969a.c().getString(com.salesforce.marketingcloud.storage.c.f64954g, null);
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put(UserProfileKeyConstants.USER_ID, string);
            }
            jSONObject3.put(ExpiredPasswordConstants.USER_INFO, jSONObject);
            jSONObject2.put(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, jSONObject3);
            return jSONObject2;
        } catch (JSONException e5) {
            com.salesforce.marketingcloud.g.b(i.m, e5, "Failed to construct PiWama payload JSON Object.", new Object[0]);
            return new JSONObject();
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.j
    @NonNull
    public Object[] b() {
        return new Object[]{"?session_id=" + this.f63969a.c().getString(com.salesforce.marketingcloud.storage.c.f64953f, "")};
    }
}
