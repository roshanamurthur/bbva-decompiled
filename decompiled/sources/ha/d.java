package ha;

import com.bbva.glomo.user.domain.model.TrackAction;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.DefaultUserTypeActivityDelegate;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectedItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DefaultUserTypeActivityDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends Lambda implements Function1<ProfileSelectedItem, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DefaultUserTypeActivityDelegate f69359p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DefaultUserTypeActivityDelegate defaultUserTypeActivityDelegate) {
        super(1);
        this.f69359p0 = defaultUserTypeActivityDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ProfileSelectedItem profileSelectedItem) {
        ProfileSelectedItem it = profileSelectedItem;
        Intrinsics.checkNotNullParameter(it, "it");
        DefaultUserTypeActivityDelegate defaultUserTypeActivityDelegate = this.f69359p0;
        defaultUserTypeActivityDelegate.f34674q0.trackAction(new TrackAction.ChangeProfile(defaultUserTypeActivityDelegate.f34674q0.getProfileSelectorHelper().userTypeFrom(it.getTitle())));
        defaultUserTypeActivityDelegate.f34674q0.onUserTypeSelected(it.getTitle());
        return Unit.INSTANCE;
    }
}
