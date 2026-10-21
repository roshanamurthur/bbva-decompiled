package com.adobe.marketing.mobile;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
interface JsonUtilityService {

    public interface JSONArray {
        Object get(int i10) throws JsonException;

        boolean getBoolean(int i10) throws JsonException;

        double getDouble(int i10) throws JsonException;

        int getInt(int i10) throws JsonException;

        JSONArray getJSONArray(int i10) throws JsonException;

        JSONObject getJSONObject(int i10) throws JsonException;

        long getLong(int i10) throws JsonException;

        String getString(int i10) throws JsonException;

        int length();

        Object opt(int i10);

        boolean optBoolean(int i10, boolean z10);

        double optDouble(int i10, double d2);

        int optInt(int i10, int i11);

        JSONArray optJSONArray(int i10);

        JSONObject optJSONObject(int i10);

        long optLong(int i10, long j10);

        String optString(int i10, String str);

        JSONArray put(double d2) throws JsonException;

        JSONArray put(int i10) throws JsonException;

        JSONArray put(int i10, double d2) throws JsonException;

        JSONArray put(int i10, int i11) throws JsonException;

        JSONArray put(int i10, long j10) throws JsonException;

        JSONArray put(int i10, JSONArray jSONArray) throws JsonException;

        JSONArray put(int i10, JSONObject jSONObject) throws JsonException;

        JSONArray put(int i10, Object obj) throws JsonException;

        JSONArray put(int i10, String str) throws JsonException;

        JSONArray put(int i10, boolean z10) throws JsonException;

        JSONArray put(long j10) throws JsonException;

        JSONArray put(JSONArray jSONArray) throws JsonException;

        JSONArray put(JSONObject jSONObject) throws JsonException;

        JSONArray put(Object obj) throws JsonException;

        JSONArray put(String str) throws JsonException;

        JSONArray put(boolean z10) throws JsonException;
    }

    public interface JSONObject {
        Object get(String str) throws JsonException;

        boolean getBoolean(String str) throws JsonException;

        double getDouble(String str) throws JsonException;

        int getInt(String str) throws JsonException;

        JSONArray getJSONArray(String str) throws JsonException;

        JSONObject getJSONObject(String str) throws JsonException;

        long getLong(String str) throws JsonException;

        String getString(String str) throws JsonException;

        Iterator<String> keys();

        int length();

        Object opt(String str);

        boolean optBoolean(String str, boolean z10);

        double optDouble(String str, double d2);

        int optInt(String str, int i10);

        JSONArray optJSONArray(String str);

        JSONObject optJSONObject(String str);

        long optLong(String str, long j10);

        String optString(String str, String str2);

        JSONObject put(String str, double d2) throws JsonException;

        JSONObject put(String str, int i10) throws JsonException;

        JSONObject put(String str, long j10) throws JsonException;

        JSONObject put(String str, JSONArray jSONArray) throws JsonException;

        JSONObject put(String str, JSONObject jSONObject) throws JsonException;

        JSONObject put(String str, Object obj) throws JsonException;

        JSONObject put(String str, String str2) throws JsonException;

        JSONObject put(String str, boolean z10) throws JsonException;

        void remove(String str);
    }

    JSONArray createJSONArray(String str);

    JSONObject createJSONObject(String str);

    JSONObject createJSONObject(Map map);

    Map<String, String> mapFromJsonObject(JSONObject jSONObject);
}
