package com.salesforce.marketingcloud.analytics;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÂ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÂ\u0003J\u0006\u0010\u000b\u001a\u00020\nJ5\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/e;", "", "Lcom/salesforce/marketingcloud/registration/f;", "a", "Lcom/salesforce/marketingcloud/messages/push/PushMessageManager;", "b", "", "c", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "d", "Lorg/json/JSONObject;", "e", "registrationMeta", "pushMessageManager", "locationEnabled", "identity", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "Lcom/salesforce/marketingcloud/registration/f;", "Lcom/salesforce/marketingcloud/messages/push/PushMessageManager;", "Z", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "<init>", "(Lcom/salesforce/marketingcloud/registration/f;Lcom/salesforce/marketingcloud/messages/push/PushMessageManager;ZLcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final com.salesforce.marketingcloud.registration.f registrationMeta;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final PushMessageManager pushMessageManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean locationEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final Identity identity;

    public e(@NotNull com.salesforce.marketingcloud.registration.f registrationMeta, @Nullable PushMessageManager pushMessageManager, boolean z10, @Nullable Identity identity) {
        Intrinsics.checkNotNullParameter(registrationMeta, "registrationMeta");
        this.registrationMeta = registrationMeta;
        this.pushMessageManager = pushMessageManager;
        this.locationEnabled = z10;
        this.identity = identity;
    }

    public static /* synthetic */ e a(e eVar, com.salesforce.marketingcloud.registration.f fVar, PushMessageManager pushMessageManager, boolean z10, Identity identity, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = eVar.registrationMeta;
        }
        if ((i10 & 2) != 0) {
            pushMessageManager = eVar.pushMessageManager;
        }
        if ((i10 & 4) != 0) {
            z10 = eVar.locationEnabled;
        }
        if ((i10 & 8) != 0) {
            identity = eVar.identity;
        }
        return eVar.a(fVar, pushMessageManager, z10, identity);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final PushMessageManager getPushMessageManager() {
        return this.pushMessageManager;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    private final boolean getLocationEnabled() {
        return this.locationEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    private final Identity getIdentity() {
        return this.identity;
    }

    @NotNull
    public final JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceID", this.registrationMeta.f());
        jSONObject.put("etAppId", this.registrationMeta.d());
        jSONObject.put(com.salesforce.marketingcloud.storage.db.k.a.m, this.registrationMeta.getHwid());
        jSONObject.put(com.salesforce.marketingcloud.storage.db.k.a.f65035b, this.registrationMeta.getPlatform());
        jSONObject.put("platform_Version", this.registrationMeta.getPlatformVersion());
        jSONObject.put("sdk_Version", this.registrationMeta.getSdkVersion());
        jSONObject.put("app_Version", this.registrationMeta.e());
        jSONObject.put("locale", Locale.getDefault().toString());
        jSONObject.put("timeZone", com.salesforce.marketingcloud.util.l.b());
        jSONObject.put("location_Enabled", this.locationEnabled);
        PushMessageManager pushMessageManager = this.pushMessageManager;
        if (pushMessageManager != null) {
            jSONObject.put("backgroundRefreshEnabled", pushMessageManager.isPushEnabled());
            jSONObject.put("push_Enabled", pushMessageManager.isPushEnabled());
        }
        Identity identity = this.identity;
        if (identity != null) {
            jSONObject.put("identity", identity.toJson());
        }
        return jSONObject;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return Intrinsics.areEqual(this.registrationMeta, eVar.registrationMeta) && Intrinsics.areEqual(this.pushMessageManager, eVar.pushMessageManager) && this.locationEnabled == eVar.locationEnabled && Intrinsics.areEqual(this.identity, eVar.identity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = this.registrationMeta.hashCode() * 31;
        PushMessageManager pushMessageManager = this.pushMessageManager;
        int iHashCode2 = (iHashCode + (pushMessageManager == null ? 0 : pushMessageManager.hashCode())) * 31;
        boolean z10 = this.locationEnabled;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = (iHashCode2 + r1) * 31;
        Identity identity = this.identity;
        return i10 + (identity != null ? identity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EventMetaData(registrationMeta=" + this.registrationMeta + ", pushMessageManager=" + this.pushMessageManager + ", locationEnabled=" + this.locationEnabled + ", identity=" + this.identity + RootService.CLOSE_BRACKET;
    }

    @NotNull
    public final e a(@NotNull com.salesforce.marketingcloud.registration.f registrationMeta, @Nullable PushMessageManager pushMessageManager, boolean locationEnabled, @Nullable Identity identity) {
        Intrinsics.checkNotNullParameter(registrationMeta, "registrationMeta");
        return new e(registrationMeta, pushMessageManager, locationEnabled, identity);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final com.salesforce.marketingcloud.registration.f getRegistrationMeta() {
        return this.registrationMeta;
    }
}
