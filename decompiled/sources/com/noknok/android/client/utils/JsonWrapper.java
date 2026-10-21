package com.noknok.android.client.utils;

import androidx.annotation.NonNull;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class JsonWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JsonElement f63453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JsonWrapper f63454b;

    public enum Key {
        level,
        styles,
        strings,
        images,
        views
    }

    public JsonWrapper(@NonNull JsonElement jsonElement) {
        this(jsonElement, null);
    }

    private JsonElement a(String str, String str2) {
        JsonElement jsonElement;
        if (this.f63453a.isJsonObject() && (jsonElement = this.f63453a.getAsJsonObject().get(str)) != null && jsonElement.isJsonObject()) {
            return jsonElement.getAsJsonObject().get(str2);
        }
        return null;
    }

    public JsonWrapper getLevel(String str) {
        JsonElement jsonElement;
        if (str != null && this.f63453a.isJsonObject() && (jsonElement = this.f63453a.getAsJsonObject().get(Key.views.name())) != null && jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            for (String str2 : asJsonObject.keySet()) {
                JsonElement jsonElement2 = asJsonObject.get(str2);
                if (jsonElement2.isJsonObject()) {
                    JsonWrapper jsonWrapper = new JsonWrapper(jsonElement2, this);
                    if (str2.equals(str)) {
                        return jsonWrapper;
                    }
                    JsonWrapper level = jsonWrapper.getLevel(str);
                    if (level != null) {
                        return level;
                    }
                }
            }
        }
        return null;
    }

    public void mergeJsonObjectsRecursively(JsonWrapper jsonWrapper) {
        JsonWrapper jsonWrapperA;
        if (jsonWrapper.f63453a.isJsonObject()) {
            for (String str : jsonWrapper.f63453a.getAsJsonObject().keySet()) {
                JsonWrapper jsonWrapperA2 = jsonWrapper.a(str);
                if (jsonWrapperA2.f63453a.isJsonObject() && (jsonWrapperA = a(str)) != null) {
                    jsonWrapperA.mergeJsonObjectsRecursively(jsonWrapperA2);
                    if (this.f63453a.isJsonObject()) {
                        this.f63453a.getAsJsonObject().add(str, jsonWrapperA.f63453a);
                    }
                } else if (this.f63453a.isJsonObject()) {
                    this.f63453a.getAsJsonObject().add(str, jsonWrapperA2.f63453a);
                }
            }
        }
    }

    public JsonElement searchDown(List<String> list, String str, String str2) {
        if (list == null) {
            return null;
        }
        JsonElement jsonElementA = a(str, str2);
        if (list.isEmpty()) {
            return jsonElementA;
        }
        JsonWrapper level = getLevel(list.get(0));
        if (level == null) {
            return null;
        }
        JsonElement jsonElementSearchDown = level.searchDown(list.subList(1, list.size()), str, str2);
        return jsonElementSearchDown != null ? jsonElementSearchDown : jsonElementA;
    }

    public JsonElement searchUp(String str, String str2) {
        JsonWrapper jsonWrapper;
        if (str2 == null) {
            return null;
        }
        JsonElement jsonElementA = a(str, str2);
        return (jsonElementA != null || (jsonWrapper = this.f63454b) == null) ? jsonElementA : jsonWrapper.searchUp(str, str2);
    }

    private JsonWrapper(@NonNull JsonElement jsonElement, JsonWrapper jsonWrapper) {
        this.f63453a = jsonElement;
        this.f63454b = jsonWrapper;
    }

    private JsonWrapper a(String str) {
        JsonElement jsonElement;
        if (this.f63453a.isJsonObject() && (jsonElement = this.f63453a.getAsJsonObject().get(str)) != null) {
            return new JsonWrapper(jsonElement);
        }
        return null;
    }
}
