package da;

import android.app.Activity;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.qrscanner.view.CustomQRToolbarView;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CustomQRToolbarView.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends Lambda implements Function1<Event<? extends QrContract.Event>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CustomQRToolbarView f68147p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CustomQRToolbarView customQRToolbarView) {
        super(1);
        this.f68147p0 = customQRToolbarView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Event<? extends QrContract.Event> event) {
        QrContract.Event contentIfNotHandled = event.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            boolean z10 = contentIfNotHandled instanceof QrContract.Event.Close;
            CustomQRToolbarView customQRToolbarView = this.f68147p0;
            if (z10) {
                Activity activity = customQRToolbarView.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            } else if (contentIfNotHandled instanceof QrContract.Event.Gallery) {
                customQRToolbarView.launchGalleryIntent();
            }
        }
        return Unit.INSTANCE;
    }
}
