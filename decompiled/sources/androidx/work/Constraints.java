package androidx.work;

import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class Constraints {
    public static final Constraints NONE = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ColumnInfo(name = "required_network_type")
    public NetworkType f24260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "requires_charging")
    public boolean f24261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "requires_device_idle")
    public boolean f24262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ColumnInfo(name = "requires_battery_not_low")
    public boolean f24263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "requires_storage_not_low")
    public boolean f24264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ColumnInfo(name = "trigger_content_update_delay")
    public long f24265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ColumnInfo(name = "trigger_max_content_delay")
    public long f24266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ColumnInfo(name = "content_uri_triggers")
    public ContentUriTriggers f24267h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public NetworkType f24270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f24273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f24274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ContentUriTriggers f24275h;

        public Builder() {
            this.f24268a = false;
            this.f24269b = false;
            this.f24270c = NetworkType.NOT_REQUIRED;
            this.f24271d = false;
            this.f24272e = false;
            this.f24273f = -1L;
            this.f24274g = -1L;
            this.f24275h = new ContentUriTriggers();
        }

        @NonNull
        @RequiresApi(24)
        public Builder addContentUriTrigger(@NonNull Uri uri, boolean z10) {
            this.f24275h.add(uri, z10);
            return this;
        }

        @NonNull
        public Constraints build() {
            Constraints constraints = new Constraints();
            constraints.f24260a = NetworkType.NOT_REQUIRED;
            constraints.f24265f = -1L;
            constraints.f24266g = -1L;
            constraints.f24267h = new ContentUriTriggers();
            constraints.f24261b = this.f24268a;
            int i10 = Build.VERSION.SDK_INT;
            constraints.f24262c = this.f24269b;
            constraints.f24260a = this.f24270c;
            constraints.f24263d = this.f24271d;
            constraints.f24264e = this.f24272e;
            if (i10 >= 24) {
                constraints.f24267h = this.f24275h;
                constraints.f24265f = this.f24273f;
                constraints.f24266g = this.f24274g;
            }
            return constraints;
        }

        @NonNull
        public Builder setRequiredNetworkType(@NonNull NetworkType networkType) {
            this.f24270c = networkType;
            return this;
        }

        @NonNull
        public Builder setRequiresBatteryNotLow(boolean z10) {
            this.f24271d = z10;
            return this;
        }

        @NonNull
        public Builder setRequiresCharging(boolean z10) {
            this.f24268a = z10;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public Builder setRequiresDeviceIdle(boolean z10) {
            this.f24269b = z10;
            return this;
        }

        @NonNull
        public Builder setRequiresStorageNotLow(boolean z10) {
            this.f24272e = z10;
            return this;
        }

        @NonNull
        @RequiresApi(24)
        public Builder setTriggerContentMaxDelay(long j10, @NonNull TimeUnit timeUnit) {
            this.f24274g = timeUnit.toMillis(j10);
            return this;
        }

        @NonNull
        @RequiresApi(24)
        public Builder setTriggerContentUpdateDelay(long j10, @NonNull TimeUnit timeUnit) {
            this.f24273f = timeUnit.toMillis(j10);
            return this;
        }

        @NonNull
        @RequiresApi(26)
        public Builder setTriggerContentMaxDelay(Duration duration) {
            this.f24274g = duration.toMillis();
            return this;
        }

        @NonNull
        @RequiresApi(26)
        public Builder setTriggerContentUpdateDelay(Duration duration) {
            this.f24273f = duration.toMillis();
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NonNull Constraints constraints) {
            this.f24268a = false;
            this.f24269b = false;
            this.f24270c = NetworkType.NOT_REQUIRED;
            this.f24271d = false;
            this.f24272e = false;
            this.f24273f = -1L;
            this.f24274g = -1L;
            this.f24275h = new ContentUriTriggers();
            this.f24268a = constraints.requiresCharging();
            int i10 = Build.VERSION.SDK_INT;
            this.f24269b = constraints.requiresDeviceIdle();
            this.f24270c = constraints.getRequiredNetworkType();
            this.f24271d = constraints.requiresBatteryNotLow();
            this.f24272e = constraints.requiresStorageNotLow();
            if (i10 >= 24) {
                this.f24273f = constraints.getTriggerContentUpdateDelay();
                this.f24274g = constraints.getTriggerMaxContentDelay();
                this.f24275h = constraints.getContentUriTriggers();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Constraints() {
        this.f24260a = NetworkType.NOT_REQUIRED;
        this.f24265f = -1L;
        this.f24266g = -1L;
        this.f24267h = new ContentUriTriggers();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Constraints.class != obj.getClass()) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.f24261b == constraints.f24261b && this.f24262c == constraints.f24262c && this.f24263d == constraints.f24263d && this.f24264e == constraints.f24264e && this.f24265f == constraints.f24265f && this.f24266g == constraints.f24266g && this.f24260a == constraints.f24260a) {
            return this.f24267h.equals(constraints.f24267h);
        }
        return false;
    }

    @NonNull
    @RequiresApi(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ContentUriTriggers getContentUriTriggers() {
        return this.f24267h;
    }

    @NonNull
    public NetworkType getRequiredNetworkType() {
        return this.f24260a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public long getTriggerContentUpdateDelay() {
        return this.f24265f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public long getTriggerMaxContentDelay() {
        return this.f24266g;
    }

    @RequiresApi(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean hasContentUriTriggers() {
        return this.f24267h.size() > 0;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f24260a.hashCode() * 31) + (this.f24261b ? 1 : 0)) * 31) + (this.f24262c ? 1 : 0)) * 31) + (this.f24263d ? 1 : 0)) * 31) + (this.f24264e ? 1 : 0)) * 31;
        long j10 = this.f24265f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f24266g;
        return this.f24267h.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public boolean requiresBatteryNotLow() {
        return this.f24263d;
    }

    public boolean requiresCharging() {
        return this.f24261b;
    }

    @RequiresApi(23)
    public boolean requiresDeviceIdle() {
        return this.f24262c;
    }

    public boolean requiresStorageNotLow() {
        return this.f24264e;
    }

    @RequiresApi(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setContentUriTriggers(@Nullable ContentUriTriggers contentUriTriggers) {
        this.f24267h = contentUriTriggers;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRequiredNetworkType(@NonNull NetworkType networkType) {
        this.f24260a = networkType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRequiresBatteryNotLow(boolean z10) {
        this.f24263d = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRequiresCharging(boolean z10) {
        this.f24261b = z10;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRequiresDeviceIdle(boolean z10) {
        this.f24262c = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRequiresStorageNotLow(boolean z10) {
        this.f24264e = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setTriggerContentUpdateDelay(long j10) {
        this.f24265f = j10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setTriggerMaxContentDelay(long j10) {
        this.f24266g = j10;
    }

    public Constraints(@NonNull Constraints constraints) {
        this.f24260a = NetworkType.NOT_REQUIRED;
        this.f24265f = -1L;
        this.f24266g = -1L;
        this.f24267h = new ContentUriTriggers();
        this.f24261b = constraints.f24261b;
        this.f24262c = constraints.f24262c;
        this.f24260a = constraints.f24260a;
        this.f24263d = constraints.f24263d;
        this.f24264e = constraints.f24264e;
        this.f24267h = constraints.f24267h;
    }
}
