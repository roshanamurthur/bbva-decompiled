package com.noknok.android.client.appsdk_plus;

import androidx.annotation.NonNull;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class SessionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, String> f62963a = new HashMap<>();

    public String get(String str) {
        return this.f62963a.get(str);
    }

    public String getCookieValue(String str) {
        String str2 = get(str);
        int iIndexOf = str2.indexOf(ReplenishLogic.ID_SEPARATOR);
        if (iIndexOf == -1) {
            iIndexOf = str2.length();
        }
        return str2.substring(0, iIndexOf);
    }

    @NonNull
    public String getCookies() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f62963a.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(entry.getKey());
            sb2.append("=");
            String value = entry.getValue();
            int iIndexOf = value.indexOf(ReplenishLogic.ID_SEPARATOR);
            if (iIndexOf == -1) {
                iIndexOf = value.length();
            }
            sb2.append(value.substring(0, iIndexOf));
        }
        return sb2.toString();
    }

    @NonNull
    public HashMap<String, String> getMap() {
        return new HashMap<>(this.f62963a);
    }

    public void put(String str, String str2) {
        this.f62963a.put(str, str2);
    }

    public void putAll(Map<String, String> map) {
        this.f62963a.putAll(map);
    }

    public void putCookies(List<String> list, List<String> list2) {
        for (String str : list) {
            int iIndexOf = str.indexOf(ReplenishLogic.ID_SEPARATOR);
            if (iIndexOf <= 0) {
                iIndexOf = str.length();
            }
            String strSubstring = str.substring(0, iIndexOf);
            int iIndexOf2 = strSubstring.indexOf("=");
            if (iIndexOf2 != -1 && iIndexOf2 != strSubstring.length() - 1) {
                String strSubstring2 = strSubstring.substring(0, iIndexOf2);
                if (list2.contains(strSubstring2)) {
                    put(strSubstring2, strSubstring.substring(strSubstring.indexOf("=") + 1));
                }
            }
        }
    }

    public void putJsonObject(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            put(next, jSONObject.getString(next));
        }
    }

    public int size() {
        return this.f62963a.size();
    }
}
