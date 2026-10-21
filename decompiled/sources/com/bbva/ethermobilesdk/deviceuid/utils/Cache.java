package com.bbva.ethermobilesdk.deviceuid.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.PeriodicWorkRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceuid/utils/Cache;", ExifInterface.GPS_DIRECTION_TRUE, "", "refreshedValue", "", "refresh", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "<init>", "()V", "Companion", "deviceuid_release"}, k = 1, mv = {1, 8, 0})
public final class Cache<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public T f29772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29773c = System.currentTimeMillis();

    @Nullable
    public final T getValue() {
        this.f29771a++;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f29773c;
        if (this.f29771a >= 20 || jCurrentTimeMillis >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            return null;
        }
        return this.f29772b;
    }

    public final void refresh(@Nullable T refreshedValue) {
        this.f29772b = refreshedValue;
        this.f29771a = 0;
        this.f29773c = System.currentTimeMillis();
    }
}
