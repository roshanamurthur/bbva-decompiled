package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.bbva.push.model.MessageBulk;
import com.bbva.push.salesforce.extension.InboxMessageKt;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.messages.inbox.InboxMessageManager;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1 implements CallbackToFutureAdapter.Resolver, InboxMessageManager.InboxRefreshListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2172q0;

    public /* synthetic */ m1(Object obj, Object obj2) {
        this.f2171p0 = obj;
        this.f2172q0 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return SurfaceRequest.lambda$new$2((AtomicReference) this.f2171p0, (String) this.f2172q0, completer);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager.InboxRefreshListener
    public final void onRefreshComplete(boolean z10) {
        PushModuleInterface pushModuleInterface = (PushModuleInterface) this.f2171p0;
        Function1 callback = (Function1) this.f2172q0;
        Intrinsics.checkNotNullParameter(pushModuleInterface, "$pushModuleInterface");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        List<InboxMessage> messages = pushModuleInterface.getInboxMessageManager().getMessages();
        Intrinsics.checkNotNullExpressionValue(messages, "getMessages(...)");
        List<InboxMessage> list = messages;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (InboxMessage inboxMessage : list) {
            Intrinsics.checkNotNull(inboxMessage);
            arrayList.add(InboxMessageKt.toMessage(inboxMessage));
        }
        callback.invoke(new MessageBulk(CollectionsKt___CollectionsKt.toList(arrayList)));
    }
}
