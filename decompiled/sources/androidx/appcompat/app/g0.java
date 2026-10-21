package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: TwilightManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g0 f731d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f734c = new a();

    /* JADX INFO: compiled from: TwilightManager.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f736b;
    }

    @VisibleForTesting
    public g0(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f732a = context;
        this.f733b = locationManager;
    }
}
