package da;

import android.app.Activity;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.qrscanner.view.CustomQrNavigationView;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CustomQrNavigationView.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends Lambda implements Function1<Event<? extends QrContract.Event>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CustomQrNavigationView f68150p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CustomQrNavigationView customQrNavigationView) {
        super(1);
        this.f68150p0 = customQrNavigationView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Event<? extends QrContract.Event> event) {
        QrContract.Event contentIfNotHandled = event.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            boolean zAreEqual = Intrinsics.areEqual(contentIfNotHandled, QrContract.Event.Close.INSTANCE);
            CustomQrNavigationView customQrNavigationView = this.f68150p0;
            if (zAreEqual) {
                Activity activity = customQrNavigationView.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            } else if (Intrinsics.areEqual(contentIfNotHandled, QrContract.Event.Gallery.INSTANCE)) {
                customQrNavigationView.launchGalleryIntent();
            }
        }
        return Unit.INSTANCE;
    }
}
