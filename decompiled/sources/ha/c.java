package ha;

import android.view.View;
import com.bbva.glomo.user.domain.model.TrackAction;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.DefaultUserTypeActivityDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DefaultUserTypeActivityDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DefaultUserTypeActivityDelegate f69358p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DefaultUserTypeActivityDelegate defaultUserTypeActivityDelegate) {
        super(1);
        this.f69358p0 = defaultUserTypeActivityDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        DefaultUserTypeActivityDelegate defaultUserTypeActivityDelegate = this.f69358p0;
        defaultUserTypeActivityDelegate.f34674q0.onProfilesChanged();
        defaultUserTypeActivityDelegate.f34674q0.trackAction(TrackAction.ChangeUser.INSTANCE);
        return Unit.INSTANCE;
    }
}
