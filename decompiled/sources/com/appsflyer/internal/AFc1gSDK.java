package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AFc1gSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    public final AFc1lSDK AFInAppEventParameterName;

    @NonNull
    private final Body AFInAppEventType;
    final int AFKeystoreWrapper;
    final boolean valueOf;

    @NonNull
    final Map<String, List<String>> values;

    public AFc1gSDK(@NonNull Body body, int i10, boolean z10, Map<String, List<String>> map, @NonNull AFc1lSDK aFc1lSDK) {
        this.AFInAppEventType = body;
        this.AFKeystoreWrapper = i10;
        this.valueOf = z10;
        this.values = new HashMap(map);
        this.AFInAppEventParameterName = aFc1lSDK;
    }

    @Nullable
    public final String AFInAppEventType(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb2 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFc1gSDK aFc1gSDK = (AFc1gSDK) obj;
        if (this.AFKeystoreWrapper == aFc1gSDK.AFKeystoreWrapper && this.valueOf == aFc1gSDK.valueOf && this.AFInAppEventType.equals(aFc1gSDK.AFInAppEventType) && this.values.equals(aFc1gSDK.values)) {
            return this.AFInAppEventParameterName.equals(aFc1gSDK.AFInAppEventParameterName);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @Nullable
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.values.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.values.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFKeystoreWrapper;
    }

    public int hashCode() {
        return this.AFInAppEventParameterName.hashCode() + ((this.values.hashCode() + (((((this.AFInAppEventType.hashCode() * 31) + this.AFKeystoreWrapper) * 31) + (this.valueOf ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.valueOf;
    }
}
