package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RouteDatabase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "Lokhttp3/Route;", "failedRoute", "", "failed", "route", "connected", "", "shouldPostpone", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class RouteDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f85852a = new LinkedHashSet();

    public final synchronized void connected(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f85852a.remove(route);
    }

    public final synchronized void failed(@NotNull Route failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f85852a.add(failedRoute);
    }

    public final synchronized boolean shouldPostpone(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f85852a.contains(route);
    }
}
