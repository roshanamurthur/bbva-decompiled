package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ContextData {
    protected Object value = null;
    protected Map<String, Object> data = new HashMap();

    public boolean containsKey(String str) {
        return this.data.containsKey(str);
    }

    public ContextData get(String str) {
        return (ContextData) this.data.get(str);
    }

    public void put(String str, ContextData contextData) {
        this.data.put(str, contextData);
    }

    public int size() {
        return this.data.size();
    }

    public synchronized String toString() {
        Object obj;
        try {
            obj = this.value;
        } catch (Throwable th2) {
            throw th2;
        }
        return super.toString() + (obj != null ? obj.toString() : "");
    }
}
