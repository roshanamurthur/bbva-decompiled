package com.salesforce.marketingcloud.analytics.stats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.salesforce.marketingcloud.storage.db.k;
import com.salesforce.marketingcloud.util.l;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final JSONObject f64013a;

    private d(String str) throws JSONException {
        this.f64013a = new JSONObject(str);
    }

    @NonNull
    public static d a(@NonNull String str) throws JSONException {
        return new d(str);
    }

    public static d b(String str, String str2, Date date, String str3, String str4) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        return dVar;
    }

    private void c(String str) throws JSONException {
        this.f64013a.put("buttonId", str);
    }

    private void d(@Nullable String str) throws JSONException {
        if (str == null) {
            return;
        }
        this.f64013a.put(com.salesforce.marketingcloud.config.a.f64105p, str);
    }

    private void e(String str) throws JSONException {
        this.f64013a.put("id", str);
    }

    private void f(String str) throws JSONException {
        this.f64013a.put("messageId", str);
    }

    private void g(String str) throws JSONException {
        this.f64013a.put("name", str);
    }

    private void h(String str) throws JSONException {
        this.f64013a.put("outcomeType", str);
    }

    private void i(String str) throws JSONException {
        this.f64013a.put("triggerId", str);
    }

    private d(String str, String str2, Date date) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f64013a = jSONObject;
        jSONObject.put("applicationId", str);
        jSONObject.put("deviceId", str2);
        jSONObject.put("eventDateUtc", l.a(date));
    }

    public static d a(String str, String str2, Date date, String str3, String str4) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        return dVar;
    }

    private void b() throws JSONException {
        this.f64013a.put(k.a.f65035b, "Android");
    }

    private void c(JSONObject jSONObject) throws JSONException {
        this.f64013a.put("metaData", jSONObject);
    }

    public static d a(String str, String str2, Date date, String str3, String str4, long j10, int i10, String str5) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        dVar.a(j10);
        dVar.a(i10);
        dVar.c(str5);
        return dVar;
    }

    public void b(int i10) throws JSONException {
        this.f64013a.put("timeInApp", i10);
    }

    public static d a(String str, String str2, Date date, String str3, String str4, String str5, String str6) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        dVar.i(str5);
        dVar.h(str6);
        return dVar;
    }

    private void b(@Nullable String str) throws JSONException {
        if (str != null) {
            this.f64013a.put("activityInstanceId", str);
        }
    }

    public static d a(String str, String str2, Date date, String str3, String str4, List<String> list) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.f(str3);
        dVar.b(str4);
        dVar.a(list);
        dVar.b();
        return dVar;
    }

    private void b(JSONObject jSONObject) throws JSONException {
        this.f64013a.put("information", jSONObject);
    }

    public static d a(String str, String str2, Date date, @Nullable String str3, @Nullable String str4, JSONObject jSONObject) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.b(jSONObject);
        dVar.b();
        if (str3 != null) {
            dVar.f(str3);
        }
        if (str4 != null) {
            dVar.b(str4);
        }
        return dVar;
    }

    public static d a(String str, String str2, Date date, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, @Nullable String str5) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.e(str4);
        dVar.g(str3);
        dVar.a(jSONObject);
        dVar.c(jSONObject2);
        dVar.d(str5);
        return dVar;
    }

    public static d a(String str, String str2, Date date, JSONObject jSONObject) throws JSONException {
        d dVar = new d(str, str2, date);
        dVar.b(jSONObject);
        dVar.b();
        return dVar;
    }

    @NonNull
    public String a() {
        return this.f64013a.toString();
    }

    private void a(int i10) throws JSONException {
        this.f64013a.put("dismissReason", i10);
    }

    public void a(long j10) throws JSONException {
        this.f64013a.put(TypedValues.TransitionType.S_DURATION, j10);
    }

    private void a(List<String> list) throws JSONException {
        this.f64013a.put("reasons", new JSONArray((Collection) list));
    }

    private void a(JSONObject jSONObject) throws JSONException {
        this.f64013a.put(k.a.f65041h, jSONObject);
    }
}
