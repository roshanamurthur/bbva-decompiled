package qb;

import com.bbva.push.salesforce.SalesforcePushHandler;
import com.bbva.push.salesforce.extension.SFMSDKKt;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SalesforcePushHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends Lambda implements Function1<PushModuleInterface, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SalesforcePushHandler f92805p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SalesforcePushHandler salesforcePushHandler) {
        super(1);
        this.f92805p0 = salesforcePushHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PushModuleInterface pushModuleInterface) {
        final PushModuleInterface it = pushModuleInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        Task<String> token = FirebaseMessaging.getInstance().getToken();
        final SalesforcePushHandler salesforcePushHandler = this.f92805p0;
        token.addOnCompleteListener(new OnCompleteListener() { // from class: qb.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                SalesforcePushHandler this$0 = salesforcePushHandler;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PushModuleInterface it2 = it;
                Intrinsics.checkNotNullParameter(it2, "$it");
                Intrinsics.checkNotNullParameter(task, "task");
                if (!task.isSuccessful()) {
                    Objects.toString(task.getException());
                    this$0.f36264d.invoke(null);
                    return;
                }
                String str = (String) task.getResult();
                if (str != null) {
                    SFMSDKKt.setPushToken(it2, str);
                    this$0.f36264d.invoke(this$0);
                }
            }
        });
        return Unit.INSTANCE;
    }
}
