package ca;

import android.app.Activity;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.qrscanner.customenroll.model.QRReaderEvent;
import com.bbva.glomohybrid.qrscanner.customenroll.widget.QrEnrollmentView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: QrEnrollmentView.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<Event<? extends QRReaderEvent>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ QrEnrollmentView f25429p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(QrEnrollmentView qrEnrollmentView) {
        super(1);
        this.f25429p0 = qrEnrollmentView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Event<? extends QRReaderEvent> event) {
        QRReaderEvent contentIfNotHandled;
        Activity activity;
        Event<? extends QRReaderEvent> event2 = event;
        if (event2 != null && (contentIfNotHandled = event2.getContentIfNotHandled()) != null && (contentIfNotHandled instanceof QRReaderEvent.Close) && (activity = this.f25429p0.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }
}
