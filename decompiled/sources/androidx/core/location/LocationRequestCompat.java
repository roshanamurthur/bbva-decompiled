package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.c;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import androidx.core.view.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationRequestCompat {
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f19976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19977g;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Quality {
    }

    @RequiresApi(19)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Class<?> f19985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f19986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f19987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Method f19988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Method f19989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static Method f19990f;
    }

    @RequiresApi(31)
    public static class b {
        @DoNotInline
        public static LocationRequest a(LocationRequestCompat locationRequestCompat) {
            return new LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    public LocationRequestCompat(long j10, int i10, long j11, int i11, long j12, float f6, long j13) {
        this.f19972b = j10;
        this.f19971a = i10;
        this.f19973c = j12;
        this.f19974d = j11;
        this.f19975e = i11;
        this.f19976f = f6;
        this.f19977g = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        return this.f19971a == locationRequestCompat.f19971a && this.f19972b == locationRequestCompat.f19972b && this.f19973c == locationRequestCompat.f19973c && this.f19974d == locationRequestCompat.f19974d && this.f19975e == locationRequestCompat.f19975e && Float.compare(locationRequestCompat.f19976f, this.f19976f) == 0 && this.f19977g == locationRequestCompat.f19977g;
    }

    @IntRange(from = 1)
    public long getDurationMillis() {
        return this.f19974d;
    }

    @IntRange(from = 0)
    public long getIntervalMillis() {
        return this.f19972b;
    }

    @IntRange(from = 0)
    public long getMaxUpdateDelayMillis() {
        return this.f19977g;
    }

    @IntRange(from = 1, to = 2147483647L)
    public int getMaxUpdates() {
        return this.f19975e;
    }

    @FloatRange(from = 0.0d, to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.f19976f;
    }

    @IntRange(from = 0)
    public long getMinUpdateIntervalMillis() {
        long j10 = this.f19973c;
        return j10 == -1 ? this.f19972b : j10;
    }

    public int getQuality() {
        return this.f19971a;
    }

    public int hashCode() {
        int i10 = this.f19971a * 31;
        long j10 = this.f19972b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f19973c;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    @NonNull
    @RequiresApi(31)
    public LocationRequest toLocationRequest() {
        return b.a(this);
    }

    @NonNull
    public String toString() {
        StringBuilder sbD = c.d("Request[");
        long j10 = this.f19972b;
        if (j10 != Long.MAX_VALUE) {
            sbD.append("@");
            TimeUtils.formatDuration(j10, sbD);
            int i10 = this.f19971a;
            if (i10 == 100) {
                sbD.append(" HIGH_ACCURACY");
            } else if (i10 == 102) {
                sbD.append(" BALANCED");
            } else if (i10 == 104) {
                sbD.append(" LOW_POWER");
            }
        } else {
            sbD.append("PASSIVE");
        }
        long j11 = this.f19974d;
        if (j11 != Long.MAX_VALUE) {
            sbD.append(", duration=");
            TimeUtils.formatDuration(j11, sbD);
        }
        int i11 = this.f19975e;
        if (i11 != Integer.MAX_VALUE) {
            sbD.append(", maxUpdates=");
            sbD.append(i11);
        }
        long j12 = this.f19973c;
        if (j12 != -1 && j12 < j10) {
            sbD.append(", minUpdateInterval=");
            TimeUtils.formatDuration(j12, sbD);
        }
        float f6 = this.f19976f;
        if (f6 > 0.0d) {
            sbD.append(", minUpdateDistance=");
            sbD.append(f6);
        }
        long j13 = this.f19977g;
        if (j13 / 2 > j10) {
            sbD.append(", maxUpdateDelay=");
            TimeUtils.formatDuration(j13, sbD);
        }
        sbD.append(AbstractJsonLexerKt.END_LIST);
        return sbD.toString();
    }

    @Nullable
    @RequiresApi(19)
    @SuppressLint({"NewApi"})
    public LocationRequest toLocationRequest(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return toLocationRequest();
        }
        Object obj = null;
        try {
            if (a.f19985a == null) {
                a.f19985a = Class.forName("android.location.LocationRequest");
            }
            if (a.f19986b == null) {
                Method declaredMethod = a.f19985a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                a.f19986b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = a.f19986b.invoke(null, str, Long.valueOf(getIntervalMillis()), Float.valueOf(getMinUpdateDistanceMeters()), Boolean.FALSE);
            if (objInvoke != null) {
                if (a.f19987c == null) {
                    Method declaredMethod2 = a.f19985a.getDeclaredMethod("setQuality", Integer.TYPE);
                    a.f19987c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                a.f19987c.invoke(objInvoke, Integer.valueOf(getQuality()));
                if (a.f19988d == null) {
                    Method declaredMethod3 = a.f19985a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    a.f19988d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                a.f19988d.invoke(objInvoke, Long.valueOf(getMinUpdateIntervalMillis()));
                if (getMaxUpdates() < Integer.MAX_VALUE) {
                    if (a.f19989e == null) {
                        Method declaredMethod4 = a.f19985a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        a.f19989e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    a.f19989e.invoke(objInvoke, Integer.valueOf(getMaxUpdates()));
                }
                if (getDurationMillis() < Long.MAX_VALUE) {
                    if (a.f19990f == null) {
                        Method declaredMethod5 = a.f19985a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        a.f19990f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    a.f19990f.invoke(objInvoke, Long.valueOf(getDurationMillis()));
                }
                obj = objInvoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return o.b(obj);
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f19978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f19980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f19982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f19983f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f19984g;

        public Builder(long j10) {
            setIntervalMillis(j10);
            this.f19979b = 102;
            this.f19980c = Long.MAX_VALUE;
            this.f19981d = Integer.MAX_VALUE;
            this.f19982e = -1L;
            this.f19983f = 0.0f;
            this.f19984g = 0L;
        }

        @NonNull
        public LocationRequestCompat build() {
            Preconditions.checkState((this.f19978a == Long.MAX_VALUE && this.f19982e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j10 = this.f19978a;
            return new LocationRequestCompat(j10, this.f19979b, this.f19980c, this.f19981d, Math.min(this.f19982e, j10), this.f19983f, this.f19984g);
        }

        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.f19982e = -1L;
            return this;
        }

        @NonNull
        public Builder setDurationMillis(@IntRange(from = 1) long j10) {
            this.f19980c = Preconditions.checkArgumentInRange(j10, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(@IntRange(from = 0) long j10) {
            this.f19978a = Preconditions.checkArgumentInRange(j10, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(@IntRange(from = 0) long j10) {
            this.f19984g = j10;
            this.f19984g = Preconditions.checkArgumentInRange(j10, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(@IntRange(from = 1, to = 2147483647L) int i10) {
            this.f19981d = Preconditions.checkArgumentInRange(i10, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(@FloatRange(from = 0.0d, to = 3.4028234663852886E38d) float f6) {
            this.f19983f = f6;
            this.f19983f = Preconditions.checkArgumentInRange(f6, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(@IntRange(from = 0) long j10) {
            this.f19982e = Preconditions.checkArgumentInRange(j10, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @NonNull
        public Builder setQuality(int i10) {
            Preconditions.checkArgument(i10 == 104 || i10 == 102 || i10 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i10));
            this.f19979b = i10;
            return this;
        }

        public Builder(@NonNull LocationRequestCompat locationRequestCompat) {
            this.f19978a = locationRequestCompat.f19972b;
            this.f19979b = locationRequestCompat.f19971a;
            this.f19980c = locationRequestCompat.f19974d;
            this.f19981d = locationRequestCompat.f19975e;
            this.f19982e = locationRequestCompat.f19973c;
            this.f19983f = locationRequestCompat.f19976f;
            this.f19984g = locationRequestCompat.f19977g;
        }
    }
}
