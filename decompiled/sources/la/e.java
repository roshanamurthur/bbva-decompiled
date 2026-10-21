package la;

import com.bbva.glomohybrid.welcome.model.domain.StartMode;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivityPager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: WelcomeActivityPager.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ WelcomeActivityPager f83153p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WelcomeActivityPager welcomeActivityPager) {
        super(1);
        this.f83153p0 = welcomeActivityPager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        if (bool2.booleanValue()) {
            boolean zBooleanValue = bool2.booleanValue();
            WelcomeActivityPager welcomeActivityPager = this.f83153p0;
            welcomeActivityPager.f34785w0 = zBooleanValue;
            WelcomeActivityPager.access$setConfigurationForLegacyAppUser(welcomeActivityPager);
            WelcomeActivityPager.access$loadWelcomeConfiguration(welcomeActivityPager, StartMode.FIRST_START);
        }
        return Unit.INSTANCE;
    }
}
