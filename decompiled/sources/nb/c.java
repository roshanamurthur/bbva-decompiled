package nb;

import androidx.core.app.NotificationCompat;
import com.bbva.push.PushManager;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.model.Push;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PushManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nPushManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushManager.kt\ncom/bbva/push/PushManager$registerToNewPushes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n223#2,2:272\n*S KotlinDebug\n*F\n+ 1 PushManager.kt\ncom/bbva/push/PushManager$registerToNewPushes$1\n*L\n145#1:272,2\n*E\n"})
public final class c extends Lambda implements Function1<Push, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PushManager f84492p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PushManager pushManager) {
        super(1);
        this.f84492p0 = pushManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Push push) {
        Push push2 = push;
        Intrinsics.checkNotNullParameter(push2, "push");
        PushManager pushManager = this.f84492p0;
        for (PushHandler pushHandler : pushManager.f36190s0) {
            if (pushHandler.canHandlePush(push2)) {
                push2.setOrigin(pushHandler.getF36222b());
                NotificationCompat.Builder builderCreateNotification = pushHandler.createNotification(pushManager.f36187p0, push2, pushManager.f36195y0, pushManager.E0);
                if (builderCreateNotification != null) {
                    pushManager.f36189r0.showNotification(pushManager.f36187p0, builderCreateNotification, push2);
                }
                PushManager.access$addPushToCache(pushManager, push2);
                pushManager.f36189r0.callObservers(pushManager.v0, push2);
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
