package com.noknok.android.client.appsdk;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.noknok.android.client.extension.IExtensionList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ExtensionList implements IExtensionList {
    public static final String EXTENSION_DATA_KEY = "data";
    public static final String EXTENSION_FAIL_IF_UNKNOWN_KEY = "fail_if_unknown";
    public static final String EXTENSION_ID_KEY = "id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Extension> f62867a;

    public ExtensionList() {
        this.f62867a = new ArrayList();
    }

    @Override // com.noknok.android.client.extension.IExtensionList
    public void addExtension(String str, String str2, boolean z10) {
        removeExtension(str);
        Extension extension = new Extension();
        extension.id = str;
        extension.data = str2;
        extension.fail_if_unknown = Boolean.valueOf(z10);
        this.f62867a.add(extension);
    }

    @Override // com.noknok.android.client.extension.IExtensionList
    public List<Extension> getExtensions() {
        return this.f62867a;
    }

    @Override // com.noknok.android.client.extension.IExtensionList
    public void removeExtension(String str) {
        List<Extension> list = this.f62867a;
        if (list != null) {
            for (Extension extension : list) {
                if (extension.getId().equals(str)) {
                    this.f62867a.remove(extension);
                    return;
                }
            }
        }
    }

    @Override // com.noknok.android.client.extension.IExtensionList
    public Extension getExtension(String str) {
        List<Extension> list = this.f62867a;
        if (list == null) {
            return null;
        }
        for (Extension extension : list) {
            if (extension.getId().equals(str)) {
                return extension;
            }
        }
        return null;
    }

    public ExtensionList(List<Extension> list) {
        this.f62867a = list;
    }

    public ExtensionList(JsonArray jsonArray) {
        this.f62867a = new ArrayList();
        for (JsonElement jsonElement : jsonArray) {
            addExtension(jsonElement.getAsJsonObject().get("id").getAsString(), jsonElement.getAsJsonObject().get("data").getAsString(), jsonElement.getAsJsonObject().get(EXTENSION_FAIL_IF_UNKNOWN_KEY).getAsBoolean());
        }
    }
}
