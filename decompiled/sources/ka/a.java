package ka;

import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.router.Router;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: WelcomePagerReaction.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends Lambda implements Function2<Router, Route, String> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f79275p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(Router router, Route route) {
        Router openScreen = router;
        Route it = route;
        Intrinsics.checkNotNullParameter(openScreen, "$this$openScreen");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getRoute();
    }
}
