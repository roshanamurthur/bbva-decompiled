package ha;

import com.bbva.glomohybrid.ui.options.profileselector.delegate.DefaultUserTypeActivityDelegate;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectedItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DefaultUserTypeActivityDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends Lambda implements Function1<ProfileSelectedItem, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DefaultUserTypeActivityDelegate f69357p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DefaultUserTypeActivityDelegate defaultUserTypeActivityDelegate) {
        super(1);
        this.f69357p0 = defaultUserTypeActivityDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ProfileSelectedItem profileSelectedItem) {
        ProfileSelectedItem it = profileSelectedItem;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f69357p0.f34674q0.onUserTypeSelected(it.getTitle());
        return Unit.INSTANCE;
    }
}
