package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.ApplicationStatus;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class b implements d, k.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f64014i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f64015j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f64016k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f64017l = 4;
    public static final int m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f64018n = 16;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f64019o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f64020p = 64;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f64021q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f64022r = 256;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f64023s = 512;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f64024t = 1024;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f64025u = 2048;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f64026v = 4096;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f64027w = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.salesforce.marketingcloud.storage.f f64028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f64029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0244b f64030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f64031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f64032h;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.b$b, reason: collision with other inner class name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public interface InterfaceC0244b {
        void a(int i10);
    }

    @VisibleForTesting
    public enum c {
        RTBF(8191),
        ROP(8190),
        DNT(1888),
        NONE(0),
        NO_BEACON(64),
        NO_GEOFENCE(32),
        NO_LOCATION(96);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64041a;

        c(int i10) {
            this.f64041a = i10;
        }

        public static c a(String str) {
            try {
                return valueOf(str);
            } catch (Exception unused) {
                return NONE;
            }
        }
    }

    public b(k kVar, com.salesforce.marketingcloud.storage.f fVar) {
        this.f64029e = kVar;
        this.f64028d = fVar;
        c cVarB = b(fVar);
        this.f64032h = cVarB;
        if (cVarB != c.RTBF) {
            kVar.a(k.d.blocked, this);
        }
    }

    private static c b(@NonNull com.salesforce.marketingcloud.storage.f fVar) {
        String strA = fVar.a((String) null);
        return strA != null ? c.a(strA) : c.NONE;
    }

    public static boolean c(int i10, int i11) {
        if (b(i10, i11)) {
            return false;
        }
        switch (i11) {
            case 2:
            case 256:
            case 512:
            case 2048:
                if (c.ROP.f64041a == i10) {
                    return false;
                }
                break;
            case 4:
            case 8:
            case 16:
            case 32:
            case 64:
            case 128:
            case 4096:
                break;
            default:
                return false;
        }
        return true;
    }

    public int a() {
        return this.f64032h.f64041a;
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "ControlChannel";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        try {
            return new JSONObject().put("flag", this.f64032h.name());
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.salesforce.marketingcloud.k.e
    @WorkerThread
    public void onSyncReceived(@NonNull k.d dVar, @NonNull JSONObject jSONObject) {
        if (dVar == k.d.blocked && jSONObject.optInt("version", -1) == 1) {
            try {
                a(jSONObject.getJSONObject(FirebaseAnalytics.Param.ITEMS).getInt(ApplicationStatus.STATUS_BLOCKED));
            } catch (JSONException e5) {
                g.b(MarketingCloudSdk.f63756u, e5, "Failed to parse [blocked] sync data.", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        this.f64029e.a(k.d.blocked, (k.e) null);
        this.f64030f = null;
    }

    public static int a(@NonNull com.salesforce.marketingcloud.storage.f fVar) {
        return b(fVar).f64041a;
    }

    public static boolean b(int i10, int i11) {
        return !a(i10, i11);
    }

    private synchronized void a(int i10) {
        try {
            c cVar = c.RTBF;
            if (!a(i10, cVar.f64041a)) {
                cVar = c.ROP;
                if (!a(i10, cVar.f64041a)) {
                    cVar = c.DNT;
                    if (!a(i10, cVar.f64041a)) {
                        cVar = c.NONE;
                    }
                }
            }
            g.d(MarketingCloudSdk.f63756u, "Control Channel blocked value %d received", Integer.valueOf(i10));
            this.f64028d.b(cVar.name());
            if (cVar != this.f64032h) {
                InterfaceC0244b interfaceC0244b = this.f64030f;
                if (interfaceC0244b != null) {
                    this.f64032h = cVar;
                    interfaceC0244b.a(cVar.f64041a);
                } else {
                    this.f64031g = cVar;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(InterfaceC0244b interfaceC0244b) {
        c cVar;
        this.f64030f = interfaceC0244b;
        if (interfaceC0244b != null && (cVar = this.f64031g) != null) {
            this.f64032h = cVar;
            this.f64031g = null;
            interfaceC0244b.a(cVar.f64041a);
        }
    }

    public static boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
