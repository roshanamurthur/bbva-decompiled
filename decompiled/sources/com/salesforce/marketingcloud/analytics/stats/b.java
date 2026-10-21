package com.salesforce.marketingcloud.analytics.stats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.g;
import java.util.Date;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f63974f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f63975g = 101;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f63976h = 102;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f63977i = 103;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f63978j = 104;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f63979k = 105;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f63980l = 106;
    public static final int m = 107;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    d f63981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f63982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Date f63984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f63985e;

    private b(Integer num, int i10, Date date, d dVar, boolean z10) {
        this.f63982b = num;
        this.f63983c = i10;
        this.f63984d = date;
        this.f63981a = dVar;
        this.f63985e = z10;
    }

    @NonNull
    public static b a(int i10, int i11, @NonNull Date date, @NonNull d dVar, boolean z10) {
        return new b(Integer.valueOf(i10), i11, date, dVar, z10);
    }

    @Nullable
    public Integer b() {
        return this.f63982b;
    }

    @NonNull
    public d c() {
        return this.f63981a;
    }

    public int d() {
        return this.f63983c;
    }

    public boolean e() {
        return this.f63985e;
    }

    @NonNull
    public static b a(int i10, @NonNull Date date, @NonNull d dVar, boolean z10) {
        return new b(null, i10, date, dVar, z10);
    }

    @NonNull
    public Date a() {
        return this.f63984d;
    }

    public void a(@NonNull Date date) {
        int time = (int) ((date.getTime() - this.f63984d.getTime()) / 1000.0d);
        if (time <= 0) {
            time = 1;
        }
        try {
            this.f63981a.b(time);
            this.f63985e = true;
        } catch (JSONException e5) {
            g.b(c.f63986k, e5, "Unable to finalize event [%d]", Integer.valueOf(this.f63983c));
        }
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void a(boolean z10) {
        this.f63985e = z10;
    }
}
