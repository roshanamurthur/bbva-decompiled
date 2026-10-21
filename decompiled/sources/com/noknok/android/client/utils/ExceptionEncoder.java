package com.noknok.android.client.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.extension.ExtensionManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class ExceptionEncoder {

    public static class ExceptionCause {
        public ExceptionCause(String str) {
        }
    }

    public static class ExceptionDescriptor {
        public ExceptionDescriptor(String str, String str2) {
        }
    }

    public static JsonObject addExceptionExtension(JsonObject jsonObject, Throwable th2) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        JsonArray asJsonArray = jsonObject.getAsJsonArray("exts");
        if (asJsonArray == null) {
            asJsonArray = new JsonArray();
        } else {
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                if (((Extension) new Gson().fromJson(it.next(), Extension.class)).id.equals(ExtensionManager.EXCEPTION_EXT_ID)) {
                    return jsonObject;
                }
            }
            jsonObject.remove("exts");
        }
        asJsonArray.add(new Gson().toJsonTree(createExceptionExtension(th2), Extension.class));
        jsonObject.add("exts", asJsonArray);
        return jsonObject;
    }

    public static Extension createExceptionExtension(Throwable th2) {
        ExceptionDescriptor exceptionDescriptor = new ExceptionDescriptor(th2.getClass().getName(), th2.getMessage());
        new ExceptionCause(th2.getMessage());
        Throwable cause = th2.getCause();
        for (int i10 = 0; i10 < 10 && cause != null; i10++) {
            new ExceptionCause(cause.getMessage());
            cause = cause.getCause();
        }
        if (cause != null) {
            new ExceptionCause("....");
        }
        return new Extension(ExtensionManager.EXCEPTION_EXT_ID, new Gson().toJson(exceptionDescriptor, ExceptionDescriptor.class), false);
    }
}
