package nb;

import com.bbva.push.PushManager;
import com.bbva.push.handler.PushHandler;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PushManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nPushManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushManager.kt\ncom/bbva/push/PushManager$registerToTokenUpdates$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n1851#2,2:272\n1851#2,2:274\n*S KotlinDebug\n*F\n+ 1 PushManager.kt\ncom/bbva/push/PushManager$registerToTokenUpdates$1\n*L\n108#1:272,2\n109#1:274,2\n*E\n"})
public final class d extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PushManager f84493p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PushManager pushManager) {
        super(1);
        this.f84493p0 = pushManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String token = str;
        Intrinsics.checkNotNullParameter(token, "token");
        PushManager pushManager = this.f84493p0;
        Iterator it = pushManager.f36190s0.iterator();
        while (it.hasNext()) {
            ((PushHandler) it.next()).onNewToken(token);
        }
        Iterator it2 = pushManager.f36192u0.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(token);
        }
        return Unit.INSTANCE;
    }
}
