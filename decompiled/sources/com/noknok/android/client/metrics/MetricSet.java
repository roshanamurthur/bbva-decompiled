package com.noknok.android.client.metrics;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class MetricSet {
    public static final long DAY_IN_MILIS = 86400000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Metric> f63346a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63348c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f63347b = Calendar.getInstance().getTimeInMillis();

    /* JADX INFO: renamed from: com.noknok.android.client.metrics.MetricSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63349a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f63349a = iArr;
            try {
                iArr[TimeUnit.MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63349a[TimeUnit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63349a[TimeUnit.DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum TimeUnit {
        DAY("daily"),
        WEEK("weekly"),
        MONTH("monthly");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f63351a;

        TimeUnit(String str) {
            this.f63351a = str;
        }
    }

    public MetricSet() {
        ArrayList<Metric> arrayList = new ArrayList<>();
        this.f63346a = arrayList;
        arrayList.add(new Metric());
    }

    public final long[] a() {
        int size = this.f63346a.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f63348c) {
                jArr[i10] = this.f63346a.get(i10).f63344a != 0 ? this.f63346a.get(i10).f63345b / ((long) this.f63346a.get(i10).f63344a) : 0L;
            } else {
                jArr[i10] = this.f63346a.get(i10).f63344a;
            }
        }
        return jArr;
    }

    public final void b() {
        this.f63346a.get(0).f63344a++;
    }

    public JsonElement toJson() {
        return new Gson().toJsonTree(this);
    }

    @NonNull
    public String toString() {
        return new Gson().toJson(this);
    }

    public final void a(long j10) {
        this.f63346a.get(0).f63344a++;
        this.f63346a.get(0).f63345b += j10;
        this.f63348c = true;
    }

    public final boolean a(TimeUnit timeUnit) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = a(jCurrentTimeMillis, timeUnit) - a(this.f63347b, timeUnit);
        if (iA == 0) {
            return false;
        }
        if (iA >= 1) {
            this.f63346a.clear();
            this.f63346a.add(new Metric());
        } else {
            for (int i10 = 0; i10 < iA; i10++) {
                this.f63346a.add(0, new Metric());
                if (this.f63346a.size() > 1) {
                    ArrayList<Metric> arrayList = this.f63346a;
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        this.f63347b = jCurrentTimeMillis;
        return true;
    }

    private int a(long j10, TimeUnit timeUnit) {
        int i10 = AnonymousClass1.f63349a[timeUnit.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return (int) ((j10 + 259200000) / 604800000);
            }
            if (i10 != 3) {
                return 0;
            }
            return (int) (j10 / 86400000);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        return ((calendar.get(1) - 1970) * 12) + calendar.get(2);
    }
}
