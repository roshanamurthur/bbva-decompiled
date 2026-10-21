package com.bbva.push.salesforce.extension;

import com.bbva.push.salesforce.model.Configuration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Map.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¨\u0006\u0005"}, d2 = {"toConfiguration", "Lcom/bbva/push/salesforce/model/Configuration;", "", "", "", "salesforce-push_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MapKt {
    @NotNull
    public static final Configuration toConfiguration(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get("setContactKey");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("enablePush");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Object obj3 = map.get("enableGeolocation");
        Boolean bool2 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        return new Configuration(str, zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
    }
}
