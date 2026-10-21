package com.adobe.marketing.mobile;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class AndroidJsonObject implements JsonUtilityService.JSONObject {
    private JSONObject jsonObject;

    public AndroidJsonObject(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public Object get(String str) throws JsonException {
        try {
            Object obj = this.jsonObject.get(str);
            if (this.jsonObject.isNull(str)) {
                return null;
            }
            if (obj instanceof JSONObject) {
                return new AndroidJsonObject((JSONObject) obj);
            }
            return obj instanceof JSONArray ? new AndroidJsonArray((JSONArray) obj) : this.jsonObject.get(str);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public boolean getBoolean(String str) throws JsonException {
        try {
            return this.jsonObject.getBoolean(str);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public double getDouble(String str) throws JsonException {
        try {
            return this.jsonObject.getDouble(str);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public int getInt(String str) throws JsonException {
        try {
            return this.jsonObject.getInt(str);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONArray getJSONArray(String str) throws JsonException {
        try {
            return new AndroidJsonArray(this.jsonObject.getJSONArray(str));
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject getJSONObject(String str) throws JsonException {
        try {
            return new AndroidJsonObject(this.jsonObject.getJSONObject(str));
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public long getLong(String str) throws JsonException {
        try {
            return this.jsonObject.getLong(str);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public String getString(String str) throws JsonException {
        try {
            return this.jsonObject.getString(str);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public Iterator<String> keys() {
        return this.jsonObject.keys();
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public int length() {
        return this.jsonObject.length();
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public Object opt(String str) {
        return this.jsonObject.opt(str);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public boolean optBoolean(String str, boolean z10) {
        return this.jsonObject.optBoolean(str, z10);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public double optDouble(String str, double d2) {
        return this.jsonObject.optDouble(str, d2);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public int optInt(String str, int i10) {
        return this.jsonObject.optInt(str, i10);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONArray optJSONArray(String str) {
        JSONArray jSONArrayOptJSONArray = this.jsonObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            return new AndroidJsonArray(jSONArrayOptJSONArray);
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject optJSONObject(String str) {
        JSONObject jSONObjectOptJSONObject = this.jsonObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return new AndroidJsonObject(jSONObjectOptJSONObject);
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public long optLong(String str, long j10) {
        return this.jsonObject.optLong(str, j10);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public String optString(String str, String str2) {
        return this.jsonObject.optString(str, str2);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject put(String str, Object obj) throws JsonException {
        try {
            if (obj instanceof JsonUtilityService.JSONObject) {
                this.jsonObject.put(str, new JSONObject(obj.toString()));
            } else if (obj instanceof JsonUtilityService.JSONArray) {
                this.jsonObject.put(str, new JSONArray(obj.toString()));
            } else {
                this.jsonObject.put(str, obj);
            }
            return this;
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public void remove(String str) {
        this.jsonObject.remove(str);
    }

    public String toString() {
        return this.jsonObject.toString();
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject put(String str, JsonUtilityService.JSONObject jSONObject) throws JsonException {
        if (jSONObject == null) {
            return put(str, (Object) null);
        }
        try {
            return put(str, new JSONObject(jSONObject.toString()));
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject put(String str, JsonUtilityService.JSONArray jSONArray) throws JsonException {
        if (jSONArray == null) {
            return put(str, (Object) null);
        }
        try {
            return put(str, new JSONArray(jSONArray.toString()));
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject put(String str, int i10) throws JsonException {
        try {
            this.jsonObject.put(str, i10);
            return this;
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject put(String str, long j10) throws JsonException {
        try {
            this.jsonObject.put(str, j10);
            return this;
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject put(String str, double d2) throws JsonException {
        try {
            this.jsonObject.put(str, d2);
            return this;
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject put(String str, String str2) throws JsonException {
        try {
            this.jsonObject.put(str, str2);
            return this;
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONObject
    public JsonUtilityService.JSONObject put(String str, boolean z10) throws JsonException {
        try {
            this.jsonObject.put(str, z10);
            return this;
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }
}
