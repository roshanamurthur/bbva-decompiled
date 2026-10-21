package com.salesforce.marketingcloud.analytics;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b {
    public static final int A = 17;
    public static final int B = 88888;
    public static final int C = 888;
    public static final int D = 8888;
    public static final List<Integer> E = Collections.unmodifiableList(Arrays.asList(3, 14));
    public static final int F = 0;
    public static final int G = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f63840l = "~!AnalyticItem";
    public static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f63841n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f63842o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f63843p = 5;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f63844q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f63845r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f63846s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f63847t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f63848u = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f63849v = 12;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f63850w = 13;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f63851x = 14;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f63852y = 15;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f63853z = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f63854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f63856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f63857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f63861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f63862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f63863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f63864k;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.analytics.b$b, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @SuppressLint({"UniqueConstants"})
    public @interface InterfaceC0240b {
    }

    private b(Date date, int i10, int i11, List<String> list, String str, boolean z10, String str2) {
        ArrayList arrayList = new ArrayList();
        this.f63857d = arrayList;
        this.f63854a = (Date) com.salesforce.marketingcloud.util.j.a(date, "The Date is null.");
        com.salesforce.marketingcloud.util.j.a(i10 == 0 || i10 == 1, "The Product Type must be one of AnalyticProductType");
        this.f63855b = i10;
        com.salesforce.marketingcloud.util.j.a(i11 > 0, "AnalyticType must be a valid int > 0.");
        this.f63856c = i11;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        this.f63864k = str;
        this.f63863j = a(str2);
        this.f63861h = z10;
    }

    public int a() {
        return this.f63856c;
    }

    public Date b() {
        return this.f63854a;
    }

    public String c() {
        return this.f63863j;
    }

    public int d() {
        return this.f63859f;
    }

    public String e() {
        return this.f63862i;
    }

    @Nullable
    public String f() {
        return this.f63858e;
    }

    public int g() {
        return this.f63860g;
    }

    public boolean h() {
        return this.f63861h;
    }

    public List<String> i() {
        List<String> list;
        synchronized (this.f63857d) {
            list = this.f63857d;
        }
        return list;
    }

    public int j() {
        return this.f63855b;
    }

    public String k() {
        return this.f63864k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static b a(@NonNull Date date, int i10, int i11) {
        return a(date, i10, i11, Collections.emptyList(), null, false);
    }

    public void b(int i10) {
        this.f63860g = i10;
    }

    public void c(String str) {
        this.f63862i = str;
    }

    public void d(@Nullable @Size(min = 1) String str) {
        this.f63858e = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static b a(@NonNull Date date, int i10, int i11, @NonNull NotificationMessage notificationMessage, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(notificationMessage.id());
        Region region = notificationMessage.region();
        if (region != null) {
            arrayList.add(region.id());
        }
        return new b(date, i10, i11, arrayList, notificationMessage.requestId(), z10, notificationMessage.propertyBag());
    }

    public void b(String str) {
        this.f63863j = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static b a(@NonNull Date date, int i10, int i11, List<String> list, String str, boolean z10) {
        return new b(date, i10, i11, list, str, z10, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static b a(@NonNull Date date, int i10, int i11, List<String> list, boolean z10) {
        return a(date, i10, i11, list, null, z10);
    }

    private String a(@Nullable String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = this.f63864k;
            if (str2 != null) {
                jSONObject.put("requestId", str2);
            }
            if (TextUtils.isEmpty(str)) {
                return jSONObject.toString();
            }
            jSONObject.put("propertyBag", new JSONObject(str));
            return jSONObject.toString();
        } catch (JSONException e5) {
            com.salesforce.marketingcloud.g.e(f63840l, e5, "unable to build et json payload", new Object[0]);
        }
    }

    public void a(int i10) {
        this.f63859f = i10;
    }

    public void a(boolean z10) {
        this.f63861h = z10;
    }
}
