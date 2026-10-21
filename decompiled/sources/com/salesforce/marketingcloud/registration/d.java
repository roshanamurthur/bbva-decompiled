package com.salesforce.marketingcloud.registration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import com.bbva.component.dm.naturalauth.Constants;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.db.k;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.h;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d implements com.salesforce.marketingcloud.e, RegistrationManager, com.salesforce.marketingcloud.behaviors.b, com.salesforce.marketingcloud.alarms.b.InterfaceC0239b, com.salesforce.marketingcloud.http.c.InterfaceC0253c, e.f, EventSubscriber {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final EnumSet<com.salesforce.marketingcloud.behaviors.a> f64873o = EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_TIME_ZONE_CHANGED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_TOKEN_REFRESHED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f64874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MarketingCloudConfig f64875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f64876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.salesforce.marketingcloud.behaviors.c f64877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.salesforce.marketingcloud.alarms.b f64878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.salesforce.marketingcloud.http.c f64879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PushMessageManager f64880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l f64881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final SFMCSdkComponents f64882l;
    private final f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f64883n;

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f64885b;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.alarms.a.b.values().length];
            f64885b = iArr;
            try {
                iArr[com.salesforce.marketingcloud.alarms.a.b.f63802b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f64884a = iArr2;
            try {
                iArr2[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64884a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_TIME_ZONE_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64884a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64884a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64884a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64884a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64884a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f64884a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_TOKEN_REFRESHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class c implements RegistrationManager.Editor {
        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTags(Iterable<String> iterable) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttributes(Iterable<String> iterable) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        public boolean commit() {
            return false;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTags(Iterable<String> iterable) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTags(String... strArr) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttributes(String... strArr) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTags(String... strArr) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearTags() {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTag(String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttribute(String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTag(String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor setContactKey(@NonNull String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor setSignedString(@NonNull String str) {
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor setAttribute(@NonNull String str, @NonNull String str2) {
            return this;
        }
    }

    public d(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull f fVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, @NonNull PushMessageManager pushMessageManager, @NonNull l lVar) {
        this(context, marketingCloudConfig, jVar, fVar, cVar, bVar, cVar2, pushMessageManager, lVar, (SFMCSdkComponents) null);
    }

    public static com.salesforce.marketingcloud.http.d a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull Context context, @NonNull @Size(min = 1) String str, @Nullable String str2) {
        return com.salesforce.marketingcloud.http.a.f64260o.a(marketingCloudConfig, new a(), a(new Registration(0, null, str, null, MarketingCloudSdk.getSdkVersionName(), h.a(context), TimeZone.getDefault().inDaylightTime(new Date()), false, false, Build.VERSION.RELEASE, false, com.salesforce.marketingcloud.util.l.b(), null, "Android", String.format(Locale.ENGLISH, "%s %s", Build.MANUFACTURER, Build.MODEL), marketingCloudConfig.applicationId(), Locale.getDefault().toString(), Collections.emptySet(), Collections.emptyMap()), str2)).j();
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "RegistrationManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() {
        e eVar = this.f64883n;
        return eVar != null ? eVar.d() : new JSONObject();
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i10) {
        if (!com.salesforce.marketingcloud.b.a(i10, 2)) {
            if (this.f64883n == null) {
                a((InitializationStatus.a) null);
                this.f64883n.g();
                return;
            }
            return;
        }
        this.f64883n = null;
        e.a(this.f64876f, this.f64878h, com.salesforce.marketingcloud.b.c(i10, 2));
        this.f64877g.a(this);
        a();
        this.f64878h.e(com.salesforce.marketingcloud.alarms.a.b.f63802b);
        this.f64879i.a(com.salesforce.marketingcloud.http.a.f64260o);
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public RegistrationManager.Editor edit() {
        e eVar = this.f64883n;
        return eVar != null ? eVar.a(this) : new c();
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public Map<String, String> getAttributes() {
        e eVar = this.f64883n;
        return eVar != null ? eVar.getAttributes() : Collections.emptyMap();
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getContactKey() {
        e eVar = this.f64883n;
        if (eVar != null) {
            return eVar.getContactKey();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public String getDeviceId() {
        e eVar = this.f64883n;
        return eVar != null ? eVar.getDeviceId() : "";
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getSignedString() {
        e eVar = this.f64883n;
        if (eVar != null) {
            return eVar.getSignedString();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getSystemToken() {
        e eVar = this.f64883n;
        if (eVar != null) {
            return eVar.getSystemToken();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public Set<String> getTags() {
        e eVar = this.f64883n;
        return eVar != null ? eVar.getTags() : Collections.emptySet();
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i10) {
        if (com.salesforce.marketingcloud.b.b(i10, 2)) {
            a(aVar);
        }
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public final void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        if (this.f64883n != null) {
            switch (b.f64884a[aVar.ordinal()]) {
                case 1:
                    this.f64883n.c();
                    break;
                case 2:
                    this.f64883n.h();
                    break;
                case 3:
                    this.f64883n.b(bundle.getBoolean(PushMessageManager.f64782h));
                    break;
                case 4:
                case 5:
                case 6:
                    this.f64883n.b();
                    break;
                case 7:
                    this.f64883n.a();
                    break;
                case 8:
                    this.f64883n.a(bundle.getString(PushMessageManager.f64783i, ""));
                    break;
                default:
                    com.salesforce.marketingcloud.g.a(RegistrationManager.f64864a, "Unhandled behavior: %s", aVar);
                    break;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber
    public void onEventPublished(@NonNull Event... eventArr) {
        for (com.salesforce.marketingcloud.events.Event event : com.salesforce.marketingcloud.events.d.a(eventArr, (EnumSet<Event.Producer>) EnumSet.of(Event.Producer.SFMC_SDK), (EnumSet<Event.Category>) EnumSet.of(Event.Category.IDENTITY))) {
            try {
                Object obj = event.attributes().get("moduleIdentities");
                Objects.requireNonNull(obj);
                JSONObject jSONObject = (JSONObject) ((JSONObject) obj).get(ModuleIdentifier.PUSH.name().toLowerCase());
                JSONObject jSONObject2 = jSONObject.getJSONObject("customProperties").getJSONObject(k.a.f65041h);
                Iterator<String> itKeys = jSONObject2.keys();
                HashMap map = new HashMap();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, (String) jSONObject2.get(next));
                }
                String strOptString = jSONObject.optString("profileId", null);
                (strOptString != null ? this.f64883n.b(this).a(strOptString, (Map<String, String>) map, false) : this.f64883n.b(this).a((Map<String, String>) map, false)).commit();
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.e(RegistrationManager.f64864a, e5, "Failed to parse event for identity update.", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    public void registerForRegistrationEvents(@NonNull RegistrationManager.RegistrationEventListener registrationEventListener) {
        e eVar = this.f64883n;
        if (eVar != null) {
            eVar.registerForRegistrationEvents(registrationEventListener);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        com.salesforce.marketingcloud.alarms.b bVar = this.f64878h;
        com.salesforce.marketingcloud.alarms.a.b bVar2 = com.salesforce.marketingcloud.alarms.a.b.f63802b;
        bVar.d(bVar2);
        this.f64878h.e(bVar2);
        this.f64877g.a(this);
        a();
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    public void unregisterForRegistrationEvents(@NonNull RegistrationManager.RegistrationEventListener registrationEventListener) {
        e eVar = this.f64883n;
        if (eVar != null) {
            eVar.unregisterForRegistrationEvents(registrationEventListener);
        }
    }

    public d(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull f fVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, @NonNull PushMessageManager pushMessageManager, @NonNull l lVar, @Nullable SFMCSdkComponents sFMCSdkComponents) {
        this.f64874d = context;
        this.f64875e = marketingCloudConfig;
        this.f64876f = jVar;
        this.m = fVar;
        this.f64877g = cVar;
        this.f64878h = bVar;
        this.f64879i = cVar2;
        this.f64880j = pushMessageManager;
        this.f64881k = lVar;
        this.f64882l = sFMCSdkComponents;
    }

    public static String a(Registration registration, @Nullable String str) {
        try {
            return com.salesforce.marketingcloud.internal.k.b(registration).put("registrationDateUtc", com.salesforce.marketingcloud.util.l.a(new Date())).put("quietPushEnabled", false).putOpt(Constants.registrationId, str).toString();
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f64864a, e5, "Unable to create registration request payload", new Object[0]);
            return null;
        }
    }

    @VisibleForTesting(otherwise = 5)
    public d(e eVar, Context context, MarketingCloudConfig marketingCloudConfig, j jVar, f fVar, com.salesforce.marketingcloud.behaviors.c cVar, com.salesforce.marketingcloud.alarms.b bVar, com.salesforce.marketingcloud.http.c cVar2, PushMessageManager pushMessageManager, l lVar) {
        this.f64883n = eVar;
        this.f64874d = context;
        this.f64875e = marketingCloudConfig;
        this.f64876f = jVar;
        this.m = fVar;
        this.f64877g = cVar;
        this.f64878h = bVar;
        this.f64879i = cVar2;
        this.f64880j = pushMessageManager;
        this.f64881k = lVar;
        this.f64882l = null;
    }

    @Nullable
    public static String a(@NonNull j jVar) {
        return jVar.c().getString(com.salesforce.marketingcloud.storage.c.f64951d, null);
    }

    private void a() {
        SFMCSdkComponents sFMCSdkComponents = this.f64882l;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().unsubscribe(this);
        }
    }

    private void a(InitializationStatus.a aVar) {
        this.f64877g.a(this, f64873o);
        this.f64878h.a(this, com.salesforce.marketingcloud.alarms.a.b.f63802b);
        this.f64879i.a(com.salesforce.marketingcloud.http.a.f64260o, this);
        SFMCSdkComponents sFMCSdkComponents = this.f64882l;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().subscribe(this);
        }
        try {
            this.f64883n = new e(this.f64874d, this.f64875e, this.f64876f, this.m, this.f64878h, this.f64879i, this.f64880j, this.f64881k, this.f64882l);
        } catch (Exception e5) {
            if (aVar != null) {
                aVar.a(e5);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0239b
    public final void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        e eVar;
        if (b.f64885b[bVar.ordinal()] == 1 && (eVar = this.f64883n) != null) {
            eVar.e();
        }
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0253c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (this.f64883n != null) {
            if (!dVar.g()) {
                this.f64883n.a(dVar.getCode(), dVar.getMessage());
                return;
            }
            try {
                this.f64883n.a(com.salesforce.marketingcloud.internal.k.a(new JSONObject(bVar.o())), dVar.d());
            } catch (Exception unused) {
                this.f64883n.a(-1, "Failed to convert our Response Body into a Registration.");
            }
        }
    }

    @Override // com.salesforce.marketingcloud.registration.e.f
    public final /* synthetic */ void a(String str, String str2, Map map, Collection collection) {
        g.a(this, str, str2, map, collection);
    }

    @Override // com.salesforce.marketingcloud.registration.e.f
    public void a(String str, String str2, Map<String, String> map, Collection<String> collection, boolean z10) {
        e eVar = this.f64883n;
        if (eVar != null) {
            try {
                eVar.a(str, str2, map, collection, z10);
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(RegistrationManager.f64864a, e5, "Error encountered while saving registration", new Object[0]);
            }
        }
    }

    public class a implements com.salesforce.marketingcloud.storage.c {
        @Override // com.salesforce.marketingcloud.storage.c
        public void a() {
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public void remove(String str) {
        }

        @Override // com.salesforce.marketingcloud.storage.c
        @Nullable
        public String getString(String str, String str2) {
            return str2;
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public void putString(String str, @NonNull String str2) {
        }
    }
}
