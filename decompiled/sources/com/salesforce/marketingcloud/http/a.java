package com.salesforce.marketingcloud.http;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.l;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'k' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f64254h = new a("ET_ANALYTICS", 0, "POST", 1, "/device/v1/event/analytic", "application/json", "application/json", "analytics_next_retry_time");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f64255i = new a("PI_ANALYTICS", 1, "POST", 2, "{0}", "application/json", "application/json", "piwama_next_retry_time");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f64256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f64257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f64258l;
    public static final a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f64259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f64260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f64261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f64262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f64263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64264s = "X-Subscriber-Token";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f64265t = "Bearer %s";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f64266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f64267v = 86400000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ a[] f64268w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f64273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f64274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f64275g;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.http.a$a, reason: collision with other inner class name */
    public static class C0251a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f64276a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f64277b = 2;

        private C0251a() {
        }
    }

    static {
        a aVar = new a("INBOX_MESSAGE", 2, "GET", 1, "/device/v1/{0}/message/?deviceid={1}&messagetype=8&contenttype=2", "application/json", "application/json", "inbox_next_retry_time");
        f64256j = aVar;
        f64257k = new a("USER_INITIATED_INBOX_MESSAGE", 3, aVar.f64274f, aVar.f64269a, aVar.f64270b, aVar.f64272d, aVar.f64273e, aVar.f64271c, 60000L);
        f64258l = new a("INBOX_STATUS", 4, "PATCH", 1, "/device/v1/{0}/message", "application/json", "application/json", "inbox_status_next_retry_time");
        m = new a("GEOFENCE_MESSAGE", 5, "GET", 1, "/device/v1/location/{0}/fence/?latitude={1,number,#.########}&longitude={2,number,#.########}&deviceid={3}", "application/json", "application/json", "geofence_next_retry_time");
        f64259n = new a("PROXIMITY_MESSAGES", 6, "GET", 1, "/device/v1/location/{0}/proximity/?latitude={1,number,#.########}&longitude={2,number,#.########}&deviceid={3}", "application/json", "application/json", "proximity_next_retry_time");
        f64260o = new a("REGISTRATION", 7, "POST", 1, "/device/v1/registration", "application/json", "application/json", "registration_next_retry_time", 60000L);
        f64261p = new a("SYNC", 8, "POST", 1, "/device/v1/{0}/sync/{1}", "application/json", "application/json", "sync_next_retry_time");
        f64262q = new a("DEVICE_STATS", 9, "POST", 1, "/devicestatistics/v1/analytic", "application/json", "application/json", "et_device_stats_retry_after");
        f64263r = new a("EVENTS", 10, "POST", 1, "/devicestatistics/v1/event", "application/json", "application/json", "et_events_retry_after");
        f64268w = a();
        f64266u = String.format(l.f65195a, "MarketingCloudSdk/%s (Android %s; %%s; %s/%s) %%s/%%s", MarketingCloudSdk.getSdkVersionName(), Build.VERSION.RELEASE, Build.MANUFACTURER, Build.MODEL);
    }

    private a(String str, int i10, String str2, int i11, String str3, String str4, String str5, String str6) {
        this(str, i10, str2, i11, str3, str4, str5, str6, 0L);
    }

    private String b(MarketingCloudConfig marketingCloudConfig) {
        return String.format(l.f65195a, f64266u, Locale.getDefault(), marketingCloudConfig.getAppPackageName(), marketingCloudConfig.getAppVersionName());
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f64268w.clone();
    }

    public long a(SharedPreferences sharedPreferences) {
        if (this.f64275g > 0) {
            return sharedPreferences.getLong(ad.d.f(new StringBuilder(), this.f64271c, "_device"), 0L);
        }
        return 0L;
    }

    public long c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getLong(this.f64271c, 0L);
    }

    private a(String str, int i10, String str2, int i11, String str3, String str4, String str5, String str6, long j10) {
        super(str, i10);
        this.f64274f = str2;
        this.f64269a = i11;
        this.f64270b = str3;
        this.f64272d = str4;
        this.f64273e = str5;
        this.f64271c = str6;
        this.f64275g = j10 < 0 ? 0L : j10;
    }

    public static Object[] c(String str, String str2) {
        return new Object[]{str, str2};
    }

    public void b(@NonNull SharedPreferences sharedPreferences) {
        if (this.f64275g > 0) {
            sharedPreferences.edit().putLong(ad.d.f(new StringBuilder(), this.f64271c, "_device"), System.currentTimeMillis() + this.f64275g).apply();
        }
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, String str) {
        return a(marketingCloudConfig, cVar, a(marketingCloudConfig), this.f64270b, str, null);
    }

    public static Object[] b(String str, String str2) {
        return new Object[]{str, str2};
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, String str, @Nullable String str2) {
        String strA = a(marketingCloudConfig);
        if (str2 == null) {
            str2 = this.f64270b;
        }
        return a(marketingCloudConfig, cVar, strA, str2, str, null);
    }

    private b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, @NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable Map<String, String> map) {
        try {
            String strA = a(str, str2);
            g.d("MCRequest", "Executing %s request ...", strA);
            b.a aVarD = b.b().b(this.f64274f).a(this).a(this.f64272d).d(strA);
            if (str3 != null) {
                aVarD.c(str3);
            }
            aVarD.a("User-Agent", b(marketingCloudConfig));
            aVarD.a("Authorization", String.format(l.f65195a, f64265t, marketingCloudConfig.accessToken()));
            aVarD.a("Accept", this.f64273e);
            aVarD.a("X-SDK-Version", MarketingCloudSdk.getSdkVersionName());
            String string = cVar.getString(com.salesforce.marketingcloud.storage.c.f64957j, null);
            if (string != null) {
                aVarD.a(f64264s, string);
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVarD.a(entry.getKey(), entry.getValue());
                }
            }
            return aVarD.a();
        } catch (Exception e5) {
            g.b("MCRequest", e5, "Failed to execute request.", new Object[0]);
            return null;
        }
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, @NonNull Object[] objArr) {
        return a(marketingCloudConfig, cVar, a(marketingCloudConfig), new MessageFormat(this.f64270b, l.f65195a).format(objArr), null, null);
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, Object[] objArr, String str) {
        return a(marketingCloudConfig, cVar, a(marketingCloudConfig), new MessageFormat(this.f64270b, l.f65195a).format(objArr), str, null);
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, Object[] objArr, String str, Map<String, String> map) {
        return a(marketingCloudConfig, cVar, a(marketingCloudConfig), new MessageFormat(this.f64270b, l.f65195a).format(objArr), str, map);
    }

    @NonNull
    private String a(@NonNull MarketingCloudConfig marketingCloudConfig) {
        return this.f64269a == 1 ? marketingCloudConfig.marketingCloudServerUrl() : marketingCloudConfig.predictiveIntelligenceServerUrl();
    }

    private String a(String str, String str2) throws MalformedURLException {
        if (str.endsWith("/")) {
            str = androidx.databinding.e.c(str, 1, 0);
        }
        return new URL(String.format(l.f65195a, "%s%s", str, str2)).toString();
    }

    public void a(@NonNull SharedPreferences sharedPreferences, @NonNull d dVar) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (dVar.g() && this.f64275g > 0) {
            editorEdit.putLong(ad.d.f(new StringBuilder(), this.f64271c, "_device"), dVar.getEndTimeMillis() + this.f64275g);
        }
        List<String> list = dVar.d().get("Retry-After");
        if (list != null && !list.isEmpty()) {
            try {
                long j10 = Long.parseLong(list.get(0)) * 1000;
                String str = this.f64271c;
                long jC = dVar.getEndTimeMillis();
                if (j10 > 86400000) {
                    j10 = 86400000;
                }
                editorEdit.putLong(str, jC + j10);
            } catch (Exception e5) {
                g.a("MCRequest", e5, "Unable to parse Retry-After value.", new Object[0]);
            }
        }
        editorEdit.apply();
    }

    public static void a(@Nullable Map<String, List<String>> map, @NonNull com.salesforce.marketingcloud.storage.c cVar) {
        List<String> list;
        String str;
        if (map == null || map.isEmpty() || (list = map.get(f64264s)) == null || list.isEmpty() || (str = list.get(0)) == null || str.isEmpty()) {
            return;
        }
        cVar.putString(com.salesforce.marketingcloud.storage.c.f64957j, str);
    }

    public static boolean a(@NonNull j jVar) {
        return jVar.c().getString(com.salesforce.marketingcloud.storage.c.f64957j, null) != null;
    }

    private static /* synthetic */ a[] a() {
        return new a[]{f64254h, f64255i, f64256j, f64257k, f64258l, m, f64259n, f64260o, f64261p, f64262q, f64263r};
    }

    public static Object[] a(String str) {
        return new Object[]{str};
    }

    public static Object[] a(String str, String str2, LatLon latLon) {
        return new Object[]{str, Double.valueOf(latLon.latitude()), Double.valueOf(latLon.longitude()), str2};
    }
}
