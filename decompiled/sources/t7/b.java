package t7;

import com.bbva.glomohybrid.App;
import com.bbva.glomohybrid.provider.AppDependenciesProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;

/* JADX INFO: compiled from: App.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends Lambda implements Function1<KoinApplication, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ App f93470p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(App app) {
        super(1);
        this.f93470p0 = app;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(KoinApplication koinApplication) {
        KoinApplication startKoin = koinApplication;
        Intrinsics.checkNotNullParameter(startKoin, "$this$startKoin");
        KoinExtKt.androidLogger(startKoin, Level.NONE);
        KoinExtKt.androidContext(startKoin, this.f93470p0);
        startKoin.modules(AppDependenciesProvider.INSTANCE.getAppModule());
        return Unit.INSTANCE;
    }
}
