package com.google.firebase.sessions;

import android.os.Message;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import dk.e;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionLifecycleClient.kt */
/* JADX INFO: loaded from: classes10.dex */
@DebugMetadata(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
public final class SessionLifecycleClient$sendLifecycleEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f48887p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SessionLifecycleClient f48888q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ List<Message> f48889r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionLifecycleClient$sendLifecycleEvents$1(SessionLifecycleClient sessionLifecycleClient, List<Message> list, Continuation<? super SessionLifecycleClient$sendLifecycleEvents$1> continuation) {
        super(2, continuation);
        this.f48888q0 = sessionLifecycleClient;
        this.f48889r0 = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SessionLifecycleClient$sendLifecycleEvents$1(this.f48888q0, this.f48889r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SessionLifecycleClient$sendLifecycleEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f48887p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            this.f48887p0 = 1;
            obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Collection collectionValues = map.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                        SessionLifecycleClient sessionLifecycleClient = this.f48888q0;
                        List<Message> list = this.f48889r0;
                        Iterator it2 = CollectionsKt___CollectionsKt.sortedWith(CollectionsKt___CollectionsKt.filterNotNull(CollectionsKt__CollectionsKt.mutableListOf(SessionLifecycleClient.access$getLatestByCode(sessionLifecycleClient, list, 2), SessionLifecycleClient.access$getLatestByCode(sessionLifecycleClient, list, 1))), new Comparator() { // from class: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t10, T t11) {
                                return e.compareValues(Long.valueOf(((Message) t10).getWhen()), Long.valueOf(((Message) t11).getWhen()));
                            }
                        }).iterator();
                        while (it2.hasNext()) {
                            SessionLifecycleClient.access$sendMessageToServer(sessionLifecycleClient, (Message) it2.next());
                        }
                        break;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
