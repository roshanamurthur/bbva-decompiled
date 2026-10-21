package com.bbva.push.firebase.model;

import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.firebase.FirebaseOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¨\u0006\u0007"}, d2 = {"toConfiguration", "Lcom/bbva/push/firebase/model/Configuration;", "", "", "", "toFirebaseOptions", "Lcom/google/firebase/FirebaseOptions;", "firebase-push_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConfigurationKt {
    @NotNull
    public static final Configuration toConfiguration(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get("autoInitEnabled");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Object obj2 = map.get("isNotificationDelegationEnabled");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        return new Configuration(zBooleanValue, ((Boolean) obj2).booleanValue());
    }

    @NotNull
    public static final FirebaseOptions toFirebaseOptions(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get(BanxicoConstants.KEY_PROJECT_OPTIONS);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map2 = (Map) obj;
        FirebaseOptions.Builder projectId = new FirebaseOptions.Builder().setProjectId((String) map2.get("projectId"));
        Object obj2 = map2.get("applicationId");
        Intrinsics.checkNotNull(obj2);
        FirebaseOptions.Builder applicationId = projectId.setApplicationId((String) obj2);
        Object obj3 = map2.get("apiKey");
        Intrinsics.checkNotNull(obj3);
        FirebaseOptions firebaseOptionsBuild = applicationId.setApiKey((String) obj3).build();
        Intrinsics.checkNotNullExpressionValue(firebaseOptionsBuild, "Builder()\n        .setPr…Key\"]!!)\n        .build()");
        return firebaseOptionsBuild;
    }
}
