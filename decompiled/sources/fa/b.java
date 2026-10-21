package fa;

import com.bbva.component.root.checker.model.RootModalType;
import com.bbva.glomohybrid.splash.presentation.view.SplashActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SplashActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends Lambda implements Function1<RootModalType, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f68395p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SplashActivity splashActivity) {
        super(1);
        this.f68395p0 = splashActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RootModalType rootModalType) {
        RootModalType rootModalType2 = rootModalType;
        boolean zAreEqual = Intrinsics.areEqual(rootModalType2, RootModalType.Restrictive.INSTANCE);
        SplashActivity splashActivity = this.f68395p0;
        if (zAreEqual) {
            SplashActivity.access$showRootFragment(splashActivity, Boolean.TRUE);
        } else if (Intrinsics.areEqual(rootModalType2, RootModalType.NonRestrictive.INSTANCE)) {
            SplashActivity.access$showRootFragment(splashActivity, Boolean.FALSE);
        } else {
            Intrinsics.areEqual(rootModalType2, RootModalType.None.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
