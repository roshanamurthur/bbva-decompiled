package com.adobe.marketing.mobile;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class AndroidJsonArray implements JsonUtilityService.JSONArray {
    private JSONArray jsonArray;

    public AndroidJsonArray(JSONArray jSONArray) {
        this.jsonArray = jSONArray;
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public Object get(int i10) throws JsonException {
        try {
            Object obj = this.jsonArray.get(i10);
            if (this.jsonArray.isNull(i10)) {
                return null;
            }
            if (obj instanceof JSONObject) {
                return new AndroidJsonObject((JSONObject) obj);
            }
            return obj instanceof JSONArray ? new AndroidJsonArray((JSONArray) obj) : this.jsonArray.get(i10);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public boolean getBoolean(int i10) throws JsonException {
        try {
            return this.jsonArray.getBoolean(i10);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public double getDouble(int i10) throws JsonException {
        try {
            return this.jsonArray.getDouble(i10);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public int getInt(int i10) throws JsonException {
        try {
            return this.jsonArray.getInt(i10);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray getJSONArray(int i10) throws JsonException {
        try {
            return new AndroidJsonArray(this.jsonArray.getJSONArray(i10));
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONObject getJSONObject(int i10) throws JsonException {
        try {
            return new AndroidJsonObject(this.jsonArray.getJSONObject(i10));
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public long getLong(int i10) throws JsonException {
        try {
            return this.jsonArray.getLong(i10);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public String getString(int i10) throws JsonException {
        try {
            return this.jsonArray.getString(i10);
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public int length() {
        return this.jsonArray.length();
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public Object opt(int i10) {
        return this.jsonArray.opt(i10);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public boolean optBoolean(int i10, boolean z10) {
        return this.jsonArray.optBoolean(i10, z10);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public double optDouble(int i10, double d2) {
        return this.jsonArray.optDouble(i10, d2);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public int optInt(int i10, int i11) {
        return this.jsonArray.optInt(i10, i11);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray optJSONArray(int i10) {
        JSONArray jSONArrayOptJSONArray = this.jsonArray.optJSONArray(i10);
        if (jSONArrayOptJSONArray != null) {
            return new AndroidJsonArray(jSONArrayOptJSONArray);
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONObject optJSONObject(int i10) {
        JSONObject jSONObjectOptJSONObject = this.jsonArray.optJSONObject(i10);
        if (jSONObjectOptJSONObject != null) {
            return new AndroidJsonObject(jSONObjectOptJSONObject);
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public long optLong(int i10, long j10) {
        return this.jsonArray.optLong(i10, j10);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public String optString(int i10, String str) {
        return this.jsonArray.optString(i10, str);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(Object obj) throws JsonException {
        this.jsonArray.put(obj);
        return this;
    }

    public String toString() {
        return this.jsonArray.toString();
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(int i10, Object obj) throws JsonException {
        try {
            if (obj instanceof JsonUtilityService.JSONObject) {
                this.jsonArray.put(i10, new JSONObject(obj.toString()));
            } else if (obj instanceof JsonUtilityService.JSONArray) {
                this.jsonArray.put(i10, new JSONArray(obj.toString()));
            } else {
                this.jsonArray.put(i10, obj);
            }
            return this;
        } catch (Exception e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(JsonUtilityService.JSONObject jSONObject) throws JsonException {
        return put(this.jsonArray.length(), jSONObject);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(int i10, JsonUtilityService.JSONObject jSONObject) throws JsonException {
        if (jSONObject == null) {
            return put(i10, (Object) null);
        }
        try {
            return put(i10, new JSONObject(jSONObject.toString()));
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(JsonUtilityService.JSONArray jSONArray) throws JsonException {
        return put(this.jsonArray.length(), jSONArray);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(int i10, JsonUtilityService.JSONArray jSONArray) throws JsonException {
        if (jSONArray == null) {
            return put(i10, (Object) null);
        }
        try {
            return put(i10, new JSONArray(jSONArray.toString()));
        } catch (JSONException e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(int i10) throws JsonException {
        return put(this.jsonArray.length(), i10);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(int i10, int i11) throws JsonException {
        try {
            this.jsonArray.put(i10, i11);
            return this;
        } catch (Exception e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(long j10) throws JsonException {
        return put(this.jsonArray.length(), j10);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(int i10, long j10) throws JsonException {
        try {
            this.jsonArray.put(i10, j10);
            return this;
        } catch (Exception e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(double d2) throws JsonException {
        return put(this.jsonArray.length(), d2);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(int i10, double d2) throws JsonException {
        try {
            this.jsonArray.put(i10, d2);
            return this;
        } catch (Exception e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(String str) throws JsonException {
        return put(this.jsonArray.length(), str);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(int i10, String str) throws JsonException {
        try {
            this.jsonArray.put(i10, str);
            return this;
        } catch (Exception e5) {
            throw new JsonException(e5);
        }
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(boolean z10) throws JsonException {
        return put(this.jsonArray.length(), z10);
    }

    @Override // com.adobe.marketing.mobile.JsonUtilityService.JSONArray
    public JsonUtilityService.JSONArray put(int i10, boolean z10) throws JsonException {
        try {
            this.jsonArray.put(i10, z10);
            return this;
        } catch (Exception e5) {
            throw new JsonException(e5);
        }
    }
}
