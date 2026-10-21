package la;

import com.bbva.glomohybrid.welcome.model.domain.StartMode;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivityPager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: WelcomeActivityPager.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends Lambda implements Function1<StartMode, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ WelcomeActivityPager f83152p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WelcomeActivityPager welcomeActivityPager) {
        super(1);
        this.f83152p0 = welcomeActivityPager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(StartMode startMode) {
        StartMode startMode2 = startMode;
        if (startMode2 != null) {
            WelcomeActivityPager.access$loadWelcomeConfiguration(this.f83152p0, startMode2);
        }
        return Unit.INSTANCE;
    }
}
