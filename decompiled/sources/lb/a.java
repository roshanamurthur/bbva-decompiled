package lb;

import android.app.Activity;
import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.plugin.smsregex.request.command.Request;
import com.bbva.smsregex.extractor.SmsListener;
import com.bbva.smsregex.extractor.model.ConsentRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a<T> implements FlowCollector {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Request f83168p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<String> f83169q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SmsListener f83170r0;

    public a(Request request, List<String> list, SmsListener smsListener) {
        this.f83168p0 = request;
        this.f83169q0 = list;
        this.f83170r0 = smsListener;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ConsentRequest consentRequest = (ConsentRequest) obj;
        Request request = this.f83168p0;
        Activity activity = ((AbstractCommand) request).mActivityContainer.get().get();
        if (activity != null) {
            Request.access$requestConsent(request, consentRequest, this.f83169q0, activity);
            Application application = ((AbstractCommand) request).mApplication;
            Intrinsics.checkNotNullExpressionValue(application, "access$getMApplication$p$s-1534621073(...)");
            this.f83170r0.stop(application);
        }
        return Unit.INSTANCE;
    }
}
