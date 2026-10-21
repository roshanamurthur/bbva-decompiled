package com.salesforce.marketingcloud;

import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u0019\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/salesforce/marketingcloud/i;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/ModuleIdentity;", "", "", "", "customProperties", "Lorg/json/JSONObject;", "customPropertiesToJson", "Lcom/salesforce/marketingcloud/registration/RegistrationManager;", "a", "Lcom/salesforce/marketingcloud/registration/RegistrationManager;", "registrationManager", "applicationId", "<init>", "(Ljava/lang/String;Lcom/salesforce/marketingcloud/registration/RegistrationManager;)V", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class i extends ModuleIdentity {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static ModuleIdentity f64331c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final RegistrationManager registrationManager;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/salesforce/marketingcloud/i$a;", "", "", "applicationId", "Lcom/salesforce/marketingcloud/registration/RegistrationManager;", "registrationManager", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/ModuleIdentity;", "a", "instance", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/ModuleIdentity;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final ModuleIdentity a(@NotNull String applicationId, @NotNull RegistrationManager registrationManager) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(registrationManager, "registrationManager");
            if (i.f64331c == null) {
                i.f64331c = new i(applicationId, registrationManager, null);
            }
            return i.f64331c;
        }
    }

    private i(String str, RegistrationManager registrationManager) {
        super(ModuleIdentifier.PUSH, str);
        this.registrationManager = registrationManager;
        if (registrationManager != null) {
            setProfileId(registrationManager.getContactKey());
            setInstallationId(registrationManager.getDeviceId());
            HashMap map = new HashMap();
            map.put("deviceId", registrationManager.getDeviceId());
            map.put(com.salesforce.marketingcloud.storage.db.k.a.f65041h, registrationManager.getAttributes());
            map.put(com.salesforce.marketingcloud.storage.db.k.a.f65040g, registrationManager.getTags());
            setCustomProperties(map);
        }
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity
    @NotNull
    public JSONObject customPropertiesToJson(@NotNull Map<String, ? extends Object> customProperties) throws JSONException {
        Intrinsics.checkNotNullParameter(customProperties, "customProperties");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", customProperties.get("deviceId"));
            Object obj = customProperties.get(com.salesforce.marketingcloud.storage.db.k.a.f65041h);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any?, kotlin.Any?>");
            jSONObject.put(com.salesforce.marketingcloud.storage.db.k.a.f65041h, new JSONObject(TypeIntrinsics.asMutableMap(obj)));
            jSONObject.put(com.salesforce.marketingcloud.storage.db.k.a.f65040g, new JSONArray((Collection) this.registrationManager.getTags()));
            return jSONObject;
        } catch (Exception e5) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", e5.getMessage());
            return jSONObject2;
        }
    }

    public /* synthetic */ i(String str, RegistrationManager registrationManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, registrationManager);
    }

    @JvmStatic
    @Nullable
    public static final ModuleIdentity a(@NotNull String str, @NotNull RegistrationManager registrationManager) {
        return INSTANCE.a(str, registrationManager);
    }
}
