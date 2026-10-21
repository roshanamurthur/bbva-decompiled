package com.noknok.android.client.metrics;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.core.impl.utils.c;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
public class Tabulator {
    public static final String KEY_UNIT = "unit";
    public static final String PREF_NAME = "MetricData";
    public static final String TAG = "Tabulator";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Tabulator f63352f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f63355c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Config f63357e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f63353a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Semaphore f63354b = new Semaphore(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, MetricSet> f63356d = new HashMap<>();

    public static class Config {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MetricSet.TimeUnit f63358a;

        public /* synthetic */ Config(int i10) {
            this();
        }

        private Config() {
            this.f63358a = MetricSet.TimeUnit.DAY;
        }
    }

    private Tabulator() {
    }

    private void a(Context context) {
        if (this.f63357e != null) {
            return;
        }
        int i10 = 0;
        this.f63355c = context.getSharedPreferences(PREF_NAME, 0);
        Config config = (Config) new Gson().fromJson(AppSDKConfig.getInstance(context).get(AppSDKConfig.Key.metricConfig), Config.class);
        this.f63357e = config;
        if (config == null) {
            this.f63357e = new Config(i10);
        }
    }

    public static synchronized Tabulator getInstance() {
        try {
            if (f63352f == null) {
                f63352f = new Tabulator();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63352f;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.TreeMap] */
    public long endTimer(String str) {
        StringBuilder sbD = c.d(str);
        sbD.append(Thread.currentThread().getId());
        String string = sbD.toString();
        try {
            this.f63354b.acquire();
            try {
                long jCurrentTimeMillis = this.f63353a.containsKey(string) ? System.currentTimeMillis() - ((Long) this.f63353a.remove(string)).longValue() : -1L;
                this.f63354b.release();
                if (jCurrentTimeMillis != -1) {
                    Logger.i(TAG, String.format(Locale.getDefault(), "%s: %dms", str, Long.valueOf(jCurrentTimeMillis)));
                }
                return jCurrentTimeMillis;
            } catch (Throwable th2) {
                this.f63354b.release();
                throw th2;
            }
        } catch (InterruptedException unused) {
            Logger.w(TAG, "Failed to acquire the semaphore");
            return -1L;
        }
    }

    public JsonObject getReport(Context context) {
        a(context);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(KEY_UNIT, this.f63357e.f63358a.f63351a);
        for (Map.Entry<String, ?> entry : this.f63355c.getAll().entrySet()) {
            MetricSet metricSet = (MetricSet) new Gson().fromJson((String) entry.getValue(), MetricSet.class);
            if (metricSet != null) {
                Objects.requireNonNull(this.f63357e);
                if (metricSet.a(this.f63357e.f63358a)) {
                    a(entry.getKey(), metricSet);
                }
                jsonObject.addProperty(entry.getKey(), Arrays.toString(metricSet.a()));
            }
        }
        return jsonObject;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.TreeMap] */
    public void startTimer(String str) {
        StringBuilder sbD = c.d(str);
        sbD.append(Thread.currentThread().getId());
        String string = sbD.toString();
        try {
            this.f63354b.acquire();
            try {
                boolean zContainsKey = this.f63353a.containsKey(string);
                if (!zContainsKey) {
                    this.f63353a.put(string, Long.valueOf(System.currentTimeMillis()));
                }
                this.f63354b.release();
                String str2 = TAG;
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = zContainsKey ? "skipped (recursion?)" : "...";
                Logger.i(str2, String.format(locale, "%s: %s", objArr));
            } catch (Throwable th2) {
                this.f63354b.release();
                throw th2;
            }
        } catch (InterruptedException unused) {
            Logger.w(TAG, "Failed to acquire the semaphore");
        }
    }

    public void updateMetric(Context context, String str, long j10) {
        a(context);
        MetricSet metricSetA = a(str);
        metricSetA.a(j10);
        a(str, metricSetA);
    }

    public void updateMetricTime(Context context, String str) {
        long jEndTimer = endTimer(str);
        if (jEndTimer != -1) {
            updateMetric(context, str, jEndTimer);
        }
    }

    public void updateMetric(Context context, String str) {
        a(context);
        MetricSet metricSetA = a(str);
        metricSetA.b();
        a(str, metricSetA);
    }

    private MetricSet a(String str) {
        MetricSet metricSet;
        if (this.f63356d.containsKey(str)) {
            metricSet = this.f63356d.get(str);
        } else {
            metricSet = (MetricSet) new Gson().fromJson(this.f63355c.getString(str, ""), MetricSet.class);
            if (metricSet == null) {
                metricSet = new MetricSet();
            }
            this.f63356d.put(str, metricSet);
        }
        Objects.requireNonNull(this.f63357e);
        if (metricSet.a(this.f63357e.f63358a)) {
            a(str, metricSet);
        }
        return metricSet;
    }

    private void a(String str, MetricSet metricSet) {
        this.f63355c.edit().putString(str, metricSet.toString()).apply();
    }
}
