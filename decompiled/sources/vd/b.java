package vd;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import javax.inject.Inject;

/* JADX INFO: compiled from: CreationContextFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f94032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f94033c;

    @Inject
    public b(Context context, @WallTime Clock clock, @Monotonic Clock clock2) {
        this.f94031a = context;
        this.f94032b = clock;
        this.f94033c = clock2;
    }
}
