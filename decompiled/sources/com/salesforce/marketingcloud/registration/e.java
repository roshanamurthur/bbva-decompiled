package com.salesforce.marketingcloud.registration;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationManagerCompat;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.google.pay.GoogleTapAndPay;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.db.k;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.h;
import com.veridas.contextualdata.ContextualDataConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class e implements RegistrationManager {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64886w = "Android";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @VisibleForTesting
    static final String f64887x = "previousRegistrationHash";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @VisibleForTesting
    static final String f64888y = "lastRegistrationSendTimestamp";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    final Set<String> f64889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f64890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final MarketingCloudConfig f64891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final j f64892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final com.salesforce.marketingcloud.alarms.b f64893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final com.salesforce.marketingcloud.http.c f64894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final l f64895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final SFMCSdkComponents f64896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set<RegistrationManager.RegistrationEventListener> f64897l;
    private final com.salesforce.marketingcloud.registration.f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f64898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ConcurrentSkipListSet<String> f64899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f64900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f64901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f64902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f64903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f64904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f64905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f64906v;

    public class a implements MarketingCloudSdk.WhenReadyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f64907a;

        /* JADX INFO: renamed from: com.salesforce.marketingcloud.registration.e$a$a, reason: collision with other inner class name */
        public class CountDownTimerC0267a extends AbstractCountDownTimerC0269e {

            /* JADX INFO: renamed from: com.salesforce.marketingcloud.registration.e$a$a$a, reason: collision with other inner class name */
            public class C0268a extends com.salesforce.marketingcloud.internal.g {
                public C0268a(String str, Object... objArr) {
                    super(str, objArr);
                }

                @Override // com.salesforce.marketingcloud.internal.g
                public void a() {
                    try {
                        SFMCSdkComponents sFMCSdkComponents = e.this.f64896k;
                        String registrationId = sFMCSdkComponents != null ? sFMCSdkComponents.getRegistrationId() : null;
                        Registration registrationE = e.this.f64892g.u().e(e.this.f64892g.b());
                        e eVar = e.this;
                        if (e.a(registrationE, eVar.f64892g, eVar.f64891f.delayRegistrationUntilContactKeyIsSet())) {
                            e.this.f64893h.d(com.salesforce.marketingcloud.alarms.a.b.f63802b);
                            e eVar2 = e.this;
                            eVar2.f64894i.a(com.salesforce.marketingcloud.http.a.f64260o.a(eVar2.f64891f, eVar2.f64892g.c(), com.salesforce.marketingcloud.registration.d.a(registrationE, registrationId)));
                        }
                    } catch (Exception e5) {
                        com.salesforce.marketingcloud.g.b(RegistrationManager.f64864a, e5, "Failed to get our Registration from local storage.", new Object[0]);
                    }
                }
            }

            public CountDownTimerC0267a(int i10) {
                super(i10);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                e.this.f64895j.b().execute(new C0268a("registration_request", new Object[0]));
            }
        }

        public a(boolean z10) {
            this.f64907a = z10;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            new CountDownTimerC0267a(this.f64907a ? 1000 : 0).start();
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        public b(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            e.this.f64892g.u().g();
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            e eVar = e.this;
            if (e.a(eVar.f64892g, eVar.f64891f.delayRegistrationUntilContactKeyIsSet())) {
                e.this.f64893h.b(com.salesforce.marketingcloud.alarms.a.b.f63802b);
            }
        }
    }

    public static class d implements RegistrationManager.Editor, com.salesforce.marketingcloud.registration.c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final List<String> f64913j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f64914a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @GuardedBy("lock")
        private final Map<String, String> f64915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @GuardedBy("lock")
        private final Set<String> f64916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @GuardedBy("lock")
        private String f64917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @GuardedBy("lock")
        private final f f64918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @GuardedBy("lock")
        private String f64919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @GuardedBy("lock")
        private final Map<String, String> f64920g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @GuardedBy("lock")
        private boolean f64921h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @GuardedBy("lock")
        private boolean f64922i;

        static {
            String[] strArr = {"addressId", GoogleTapAndPay.KEY_ALIAS, "apId", "backgroundRefreshEnabled", "badge", "channel", "contactId", "contactKey", "createdBy", "createdDate", "customObjectKey", Constants.device, "deviceId", Constants.deviceType, "gcmSenderId", "hardwareId", "isHonorDst", "lastAppOpen", "lastMessageOpen", "lastSend", "locationEnabled", "messageOpenCount", "modifiedBy", "modifiedDate", "optInDate", "optInMethodId", "optInStatusId", "optOutDate", "optOutMethodId", "optOutStatusId", k.a.f65035b, "platformVersion", "providerToken", "proximityEnabled", "pushAddressExtensionId", "pushApplicationId", ContextualDataConstants.CD_SDK_VERSION, "sendCount", "source", "sourceObjectId", "status", "systemToken", k.a.f65038e, "utcOffset", "signedString", "quietPushEnabled"};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 46; i10++) {
                arrayList.add(strArr[i10].toLowerCase(Locale.ENGLISH));
            }
            f64913j = Collections.unmodifiableList(arrayList);
        }

        public d(f fVar, String str, String str2, ConcurrentHashMap<String, String> concurrentHashMap, ConcurrentSkipListSet<String> concurrentSkipListSet, Set<String> set) {
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            this.f64915b = new TreeMap(comparator);
            this.f64916c = new TreeSet(comparator);
            this.f64918e = fVar;
            this.f64917d = str;
            this.f64919f = str2;
            this.f64920g = new com.salesforce.marketingcloud.registration.b(concurrentHashMap);
            for (String str3 : concurrentSkipListSet) {
                this.f64915b.put(str3, str3);
            }
            this.f64916c.addAll(set);
        }

        @Nullable
        private boolean b(String str) {
            if (str != null) {
                return true;
            }
            com.salesforce.marketingcloud.g.b(RegistrationManager.f64864a, "Attribute value was null and will not be saved.", new Object[0]);
            return false;
        }

        private boolean c(@Nullable String str) {
            return str == null || TextUtils.getTrimmedLength(str) > 0;
        }

        @Nullable
        private String d(String str) {
            if (!TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) != 0) {
                return str.trim();
            }
            com.salesforce.marketingcloud.g.e(RegistrationManager.f64864a, "An empty or NULL ContactKey will not be transmitted to the Marketing Cloud and was NOT updated with the provided value.", new Object[0]);
            return null;
        }

        @Nullable
        private String e(String str) {
            return str != null ? str.trim() : str;
        }

        @Override // com.salesforce.marketingcloud.registration.c
        @NonNull
        public RegistrationManager.Editor a(@NonNull String str, @NonNull String str2, boolean z10) {
            synchronized (this.f64914a) {
                try {
                    if (a(str) && b(str2)) {
                        this.f64920g.put(str, str2);
                        this.f64921h = true;
                        this.f64922i = z10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTag(String str) {
            String strE = e(str);
            synchronized (this.f64914a) {
                try {
                    if (!TextUtils.isEmpty(strE) && !strE.equals(this.f64915b.put(strE, strE))) {
                        this.f64921h = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTags(Iterable<String> iterable) {
            if (iterable == null) {
                return this;
            }
            Iterator<String> it = iterable.iterator();
            while (it.hasNext()) {
                addTag(it.next());
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttribute(String str) {
            return !a(str) ? this : setAttribute(str, "");
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttributes(Iterable<String> iterable) {
            Iterator<String> it = iterable.iterator();
            while (it.hasNext()) {
                clearAttribute(it.next());
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearTags() {
            synchronized (this.f64914a) {
                try {
                    if (this.f64915b.keySet().retainAll(this.f64916c)) {
                        this.f64921h = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        public boolean commit() {
            f fVar;
            synchronized (this.f64914a) {
                try {
                    if (!this.f64921h || (fVar = this.f64918e) == null) {
                        return false;
                    }
                    fVar.a(this.f64917d, this.f64919f, this.f64920g, this.f64915b.values(), this.f64922i);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTag(String str) {
            if (str == null) {
                return this;
            }
            synchronized (this.f64914a) {
                try {
                    if (!this.f64916c.contains(str) && this.f64915b.remove(str) != null) {
                        this.f64921h = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTags(Iterable<String> iterable) {
            if (iterable == null) {
                return this;
            }
            Iterator<String> it = iterable.iterator();
            while (it.hasNext()) {
                removeTag(it.next());
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        @Deprecated
        public RegistrationManager.Editor setAttribute(@NonNull String str, @NonNull String str2) {
            return a(str, str2, true);
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        @Deprecated
        public RegistrationManager.Editor setContactKey(@NonNull String str) {
            return a(str, true);
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor setSignedString(@Nullable @Size(min = 1) String str) {
            synchronized (this.f64914a) {
                try {
                    if (c(str)) {
                        this.f64917d = str;
                        this.f64921h = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.c
        @NonNull
        public RegistrationManager.Editor a(@NonNull String str, @NonNull Map<String, String> map, boolean z10) {
            a(str, z10);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue(), z10);
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor addTags(String... strArr) {
            if (strArr != null && strArr.length != 0) {
                for (String str : strArr) {
                    addTag(str);
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor clearAttributes(String... strArr) {
            if (strArr != null && strArr.length != 0) {
                for (String str : strArr) {
                    clearAttribute(str);
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.RegistrationManager.Editor
        @NonNull
        public RegistrationManager.Editor removeTags(String... strArr) {
            if (strArr != null && strArr.length != 0) {
                for (String str : strArr) {
                    removeTag(str);
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.c
        @NonNull
        public RegistrationManager.Editor a(@NonNull String str, boolean z10) {
            String strD = d(str);
            if (strD != null) {
                synchronized (this.f64914a) {
                    this.f64921h = true;
                    this.f64922i = z10;
                    this.f64919f = strD;
                }
            }
            return this;
        }

        @Override // com.salesforce.marketingcloud.registration.c
        @NonNull
        public RegistrationManager.Editor a(@NonNull Map<String, String> map, boolean z10) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue(), z10);
            }
            return this;
        }

        @Nullable
        private boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                com.salesforce.marketingcloud.g.e(RegistrationManager.f64864a, "The attribute you provided was null or empty.", new Object[0]);
                return false;
            }
            String strTrim = str.trim();
            if (TextUtils.isEmpty(strTrim)) {
                com.salesforce.marketingcloud.g.e(RegistrationManager.f64864a, "The attribute you provided was blank.", new Object[0]);
                return false;
            }
            if (f64913j.contains(strTrim.toLowerCase(Locale.ENGLISH))) {
                com.salesforce.marketingcloud.g.e(RegistrationManager.f64864a, "Attribute key '%s' is invalid and can not be added.  Please see documentation regarding Attributes and Reserved Words.", strTrim);
                return false;
            }
            if (strTrim.length() <= 128) {
                return true;
            }
            com.salesforce.marketingcloud.g.e(RegistrationManager.f64864a, "Your attribute key was %s characters long.  Attribute keys are restricted to %s characters.  Your attribute key will be truncated.", Integer.valueOf(strTrim.length()), 128);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.registration.e$e, reason: collision with other inner class name */
    public static abstract class AbstractCountDownTimerC0269e extends CountDownTimer {
        public AbstractCountDownTimerC0269e(int i10) {
            this(i10, 1000L);
        }

        private AbstractCountDownTimerC0269e(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    public interface f {
        void a(String str, String str2, Map<String, String> map, Collection<String> collection);

        void a(String str, String str2, Map<String, String> map, Collection<String> collection, boolean z10);
    }

    public e(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.registration.f fVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull PushMessageManager pushMessageManager, @NonNull l lVar) {
        this(context, marketingCloudConfig, jVar, fVar, bVar, cVar, pushMessageManager, lVar, null);
    }

    private Registration a(int i10) {
        return new Registration(i10, this.f64906v, this.m.f(), this.f64905u, this.m.getSdkVersion(), this.m.e(), TimeZone.getDefault().inDaylightTime(new Date()), this.f64900p, this.f64901q, this.m.getPlatformVersion(), f(), com.salesforce.marketingcloud.util.l.b(), this.f64904t, this.m.getPlatform(), this.m.getHwid(), this.f64891f.applicationId(), Locale.getDefault().toString(), this.f64899o, this.f64898n);
    }

    public com.salesforce.marketingcloud.registration.c b(f fVar) {
        return new d(fVar, this.f64906v, this.f64904t, this.f64898n, this.f64899o, this.f64889d);
    }

    public void c() {
        this.f64893h.d(com.salesforce.marketingcloud.alarms.a.b.f63802b);
        g();
    }

    public JSONObject d() {
        String string;
        Registration registrationA = a(0);
        if (registrationA == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("current_registration", com.salesforce.marketingcloud.internal.k.b(registrationA));
            if (a(registrationA, this.f64892g, this.f64891f.delayRegistrationUntilContactKeyIsSet()) && (string = this.f64892g.c().getString(com.salesforce.marketingcloud.storage.c.f64955h, null)) != null) {
                jSONObject.put("last_registration_sent", new JSONObject(string));
            }
            long j10 = this.f64892g.f().getLong(f64888y, 0L);
            if (j10 > 0) {
                jSONObject.put("last_sent_timestamp", com.salesforce.marketingcloud.util.l.a(new Date(j10)));
            }
        } catch (JSONException e5) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f64864a, e5, "Failed to build our component state JSONObject.", new Object[0]);
        }
        return jSONObject;
    }

    public void e() {
        a(true);
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public RegistrationManager.Editor edit() {
        com.salesforce.marketingcloud.g.a(RegistrationManager.f64864a, "Changes with this editor will not be saved.", new Object[0]);
        return new d(null, this.f64906v, this.f64904t, this.f64898n, this.f64899o, this.f64889d);
    }

    public boolean f() {
        return this.f64903s && NotificationManagerCompat.from(this.f64890e).areNotificationsEnabled();
    }

    public void g() {
        c(false);
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public Map<String, String> getAttributes() {
        return new HashMap(this.f64898n);
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getContactKey() {
        return this.f64904t;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public String getDeviceId() {
        return this.m.f();
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getSignedString() {
        return this.f64906v;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @Nullable
    public String getSystemToken() {
        return this.f64905u;
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    @NonNull
    public Set<String> getTags() {
        return new TreeSet((SortedSet) this.f64899o);
    }

    public void h() {
        g();
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    public void registerForRegistrationEvents(@NonNull RegistrationManager.RegistrationEventListener registrationEventListener) {
        if (registrationEventListener == null) {
            return;
        }
        synchronized (this.f64897l) {
            this.f64897l.add(registrationEventListener);
        }
    }

    @Override // com.salesforce.marketingcloud.registration.RegistrationManager
    public void unregisterForRegistrationEvents(@NonNull RegistrationManager.RegistrationEventListener registrationEventListener) {
        synchronized (this.f64897l) {
            this.f64897l.remove(registrationEventListener);
        }
    }

    public e(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.registration.f fVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull PushMessageManager pushMessageManager, @NonNull l lVar, SFMCSdkComponents sFMCSdkComponents) {
        Registration registrationA;
        this.f64897l = new ArraySet();
        this.f64890e = context;
        this.f64891f = marketingCloudConfig;
        this.f64892g = jVar;
        this.m = fVar;
        this.f64893h = bVar;
        this.f64894i = cVar;
        this.f64895j = lVar;
        this.f64896k = sFMCSdkComponents;
        TreeSet treeSet = new TreeSet();
        treeSet.add("ALL");
        treeSet.add("Android");
        if (com.salesforce.marketingcloud.util.l.a(context)) {
            treeSet.add("DEBUG");
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        this.f64889d = setUnmodifiableSet;
        this.f64903s = pushMessageManager.isPushEnabled();
        boolean zB = h.b(context);
        this.f64900p = zB;
        boolean z10 = true;
        boolean z11 = false;
        this.f64901q = zB && h.c(context);
        this.f64902r = NotificationManagerCompat.from(context).areNotificationsEnabled();
        this.f64905u = pushMessageManager.getPushToken();
        com.salesforce.marketingcloud.storage.c cVarC = jVar.c();
        try {
            Registration registrationE = jVar.u().e(jVar.b());
            if (registrationE == null) {
                this.f64906v = null;
                this.f64904t = cVarC.getString(com.salesforce.marketingcloud.storage.c.f64951d, null);
                this.f64898n = new ConcurrentHashMap<>(com.salesforce.marketingcloud.util.l.c(cVarC.getString(com.salesforce.marketingcloud.storage.c.f64949b, "")));
                ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet(com.salesforce.marketingcloud.util.l.d(cVarC.getString(com.salesforce.marketingcloud.storage.c.f64950c, "")));
                this.f64899o = concurrentSkipListSet.isEmpty() ? new ConcurrentSkipListSet<>(setUnmodifiableSet) : a((ConcurrentSkipListSet<String>) concurrentSkipListSet, setUnmodifiableSet);
                registrationA = a(0);
                z10 = false;
            } else {
                this.f64906v = registrationE.signedString();
                this.f64904t = registrationE.contactKey();
                this.f64898n = new ConcurrentHashMap<>(registrationE.attributes());
                this.f64899o = a((ConcurrentSkipListSet<String>) new ConcurrentSkipListSet(registrationE.tags()), setUnmodifiableSet);
                registrationA = a(com.salesforce.marketingcloud.internal.k.a(registrationE));
            }
            a(jVar, this.f64904t);
            z11 = z10;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f64864a, e5, "Error trying to get, update or add a registration to local storage.", new Object[0]);
            this.f64899o = new ConcurrentSkipListSet<>(this.f64889d);
            this.f64898n = new ConcurrentHashMap<>();
            this.f64904t = null;
            this.f64906v = null;
            registrationA = a(0);
        }
        lVar.b().execute(new com.salesforce.marketingcloud.registration.a(jVar.u(), jVar.b(), registrationA, z11));
        if (a(registrationA, jVar, marketingCloudConfig.delayRegistrationUntilContactKeyIsSet())) {
            e();
        }
    }

    public RegistrationManager.Editor a(f fVar) {
        return new d(fVar, this.f64906v, this.f64904t, this.f64898n, this.f64899o, this.f64889d);
    }

    public void b() {
        boolean zB = h.b(this.f64890e);
        boolean z10 = zB && h.c(this.f64890e);
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(this.f64890e).areNotificationsEnabled();
        if (zB == this.f64900p && z10 == this.f64901q && zAreNotificationsEnabled == this.f64902r) {
            return;
        }
        this.f64900p = zB;
        this.f64901q = z10;
        this.f64902r = zAreNotificationsEnabled;
        g();
    }

    public void c(boolean z10) {
        try {
            Registration registrationA = a(0);
            this.f64895j.b().execute(new com.salesforce.marketingcloud.registration.a(this.f64892g.u(), this.f64892g.b(), registrationA, false));
            a(this.f64892g, registrationA.contactKey());
            if (a(registrationA, this.f64892g, this.f64891f.delayRegistrationUntilContactKeyIsSet())) {
                SFMCSdkComponents sFMCSdkComponents = this.f64896k;
                if (sFMCSdkComponents != null && z10) {
                    if (this.f64904t != null) {
                        sFMCSdkComponents.getIdentity().setProfile(this.f64904t, this.f64898n, ModuleIdentifier.PUSH, new ModuleIdentifier[0]);
                    } else {
                        sFMCSdkComponents.getIdentity().setProfileAttributes(this.f64898n, ModuleIdentifier.PUSH);
                    }
                }
                e();
            }
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f64864a, e5, "An error occurred trying to save our Registration.", new Object[0]);
        }
    }

    private static ConcurrentSkipListSet<String> a(ConcurrentSkipListSet<String> concurrentSkipListSet, Set<String> set) {
        if (!concurrentSkipListSet.containsAll(set)) {
            concurrentSkipListSet.addAll(set);
        }
        return concurrentSkipListSet;
    }

    public void b(boolean z10) {
        this.f64903s = z10;
        g();
    }

    public void a() {
        this.f64892g.f().edit().remove(com.salesforce.marketingcloud.http.a.f64260o.f64271c + "_device").apply();
        a(false);
    }

    public void a(int i10, String str) {
        com.salesforce.marketingcloud.g.a(RegistrationManager.f64864a, "%s: %s", Integer.valueOf(i10), str);
        this.f64895j.b().execute(new c("schedule_registration_retry", new Object[0]));
    }

    public void a(@NonNull Registration registration, Map<String, List<String>> map) {
        com.salesforce.marketingcloud.http.a.a(map, this.f64892g.c());
        this.f64893h.c(com.salesforce.marketingcloud.alarms.a.b.f63802b);
        synchronized (this.f64897l) {
            for (RegistrationManager.RegistrationEventListener registrationEventListener : this.f64897l) {
                if (registrationEventListener != null) {
                    try {
                        registrationEventListener.onRegistrationReceived(registration);
                    } catch (Exception e5) {
                        com.salesforce.marketingcloud.g.b(RegistrationManager.f64864a, e5, "%s threw an exception while processing the registration response", registrationEventListener.getClass().getName());
                    }
                }
            }
        }
        String string = com.salesforce.marketingcloud.internal.k.b(registration).toString();
        this.f64892g.c().putString(com.salesforce.marketingcloud.storage.c.f64955h, string);
        this.f64892g.f().edit().putLong(f64888y, System.currentTimeMillis()).putString(f64887x, com.salesforce.marketingcloud.util.l.b(string)).apply();
        this.f64895j.b().execute(new b("delete_old_registrations", new Object[0]));
    }

    public static void a(j jVar, com.salesforce.marketingcloud.alarms.b bVar, boolean z10) {
        if (z10) {
            jVar.u().e();
            jVar.c().remove(com.salesforce.marketingcloud.storage.c.f64951d);
        }
        bVar.d(com.salesforce.marketingcloud.alarms.a.b.f63802b);
    }

    private void a(@NonNull j jVar, @Nullable String str) {
        jVar.c().putString(com.salesforce.marketingcloud.storage.c.f64951d, str);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.f64905u)) {
            return;
        }
        this.f64905u = str;
        g();
    }

    public void a(String str, String str2, Map<String, String> map, Collection<String> collection) throws Exception {
        a(str, str2, map, collection, false);
    }

    public void a(String str, String str2, Map<String, String> map, Collection<String> collection, boolean z10) throws Exception {
        this.f64906v = str;
        this.f64904t = str2;
        this.f64898n.clear();
        this.f64898n.putAll(map);
        this.f64899o.clear();
        this.f64899o.addAll(collection);
        this.f64893h.c(com.salesforce.marketingcloud.alarms.a.b.f63802b);
        c(z10);
    }

    public void a(boolean z10) {
        MarketingCloudSdk.requestSdk(new a(z10));
    }

    public static boolean a(Registration registration, @NonNull j jVar, boolean z10) {
        if (registration == null) {
            return false;
        }
        if (registration.contactKey() == null && z10) {
            com.salesforce.marketingcloud.g.e(RegistrationManager.f64864a, "You have delayRegistrationUntilContactKeyIsSet set to `true.`  The SDK will not send a registration to the Marketing Cloud until a contact key has been set.", new Object[0]);
            return false;
        }
        String string = jVar.f().getString(f64887x, null);
        return string == null || !com.salesforce.marketingcloud.util.l.b(com.salesforce.marketingcloud.internal.k.b(registration).toString()).equals(string);
    }

    @VisibleForTesting
    @WorkerThread
    public static boolean a(@NonNull j jVar, boolean z10) {
        try {
            return a(jVar.u().e(jVar.b()), jVar, z10);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f64864a, e5, "Failed to get Registration from local storage or we can not determine if this Registration contains any changes.", new Object[0]);
            return false;
        }
    }
}
