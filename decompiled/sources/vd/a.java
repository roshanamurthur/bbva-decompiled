package vd;

import ad.d;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: compiled from: AutoValue_CreationContext.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends CreationContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f94028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f94029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f94030d;

    public a(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f94027a = context;
        if (clock == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f94028b = clock;
        if (clock2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f94029c = clock2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f94030d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.f94027a.equals(creationContext.getApplicationContext()) && this.f94028b.equals(creationContext.getWallClock()) && this.f94029c.equals(creationContext.getMonotonicClock()) && this.f94030d.equals(creationContext.getBackendName());
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Context getApplicationContext() {
        return this.f94027a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    @NonNull
    public final String getBackendName() {
        return this.f94030d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock getMonotonicClock() {
        return this.f94029c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock getWallClock() {
        return this.f94028b;
    }

    public final int hashCode() {
        return ((((((this.f94027a.hashCode() ^ 1000003) * 1000003) ^ this.f94028b.hashCode()) * 1000003) ^ this.f94029c.hashCode()) * 1000003) ^ this.f94030d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f94027a);
        sb2.append(", wallClock=");
        sb2.append(this.f94028b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f94029c);
        sb2.append(", backendName=");
        return d.f(sb2, this.f94030d, "}");
    }
}
