package gb;

import com.adobe.marketing.mobile.AdobeCallback;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.component.dm.analytics.AdobeCallbacksManager;
import com.bbva.plugin.google.pay.command.PushProvisioningCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Consumer, AdobeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f68597a;

    @Override // com.bbva.androidtoolkit.optional.function.Consumer
    public void accept(Object obj) {
        PushProvisioningCommand.Companion companion = PushProvisioningCommand.Companion;
        Function1 tmp0 = this.f68597a;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.adobe.marketing.mobile.AdobeCallback
    public void call(Object obj) {
        String str = (String) obj;
        AdobeCallbacksManager adobeCallbacksManager = AdobeCallbacksManager.INSTANCE;
        Function1 callback = this.f68597a;
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNull(str);
        callback.invoke(str);
    }
}
