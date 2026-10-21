package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ForegroundInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f24294c;

    public ForegroundInfo(int i10, @NonNull Notification notification) {
        this(i10, notification, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.f24292a == foregroundInfo.f24292a && this.f24293b == foregroundInfo.f24293b) {
            return this.f24294c.equals(foregroundInfo.f24294c);
        }
        return false;
    }

    public int getForegroundServiceType() {
        return this.f24293b;
    }

    @NonNull
    public Notification getNotification() {
        return this.f24294c;
    }

    public int getNotificationId() {
        return this.f24292a;
    }

    public int hashCode() {
        return this.f24294c.hashCode() + (((this.f24292a * 31) + this.f24293b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f24292a + ", mForegroundServiceType=" + this.f24293b + ", mNotification=" + this.f24294c + AbstractJsonLexerKt.END_OBJ;
    }

    public ForegroundInfo(int i10, @NonNull Notification notification, int i11) {
        this.f24292a = i10;
        this.f24294c = notification;
        this.f24293b = i11;
    }
}
