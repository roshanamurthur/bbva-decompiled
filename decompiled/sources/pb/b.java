package pb;

import bk.q;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ManualFirebasePushHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends Lambda implements Function1<FirebaseMessaging, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Continuation<Map<String, ? extends Object>> f92601p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SafeContinuation safeContinuation) {
        super(1);
        this.f92601p0 = safeContinuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FirebaseMessaging firebaseMessaging) {
        FirebaseMessaging it = firebaseMessaging;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f92601p0.resumeWith(Result.m5535constructorimpl(q.mapOf(TuplesKt.to("isAutoInitEnabled", Boolean.valueOf(it.isAutoInitEnabled())), TuplesKt.to("isNotificationDelegationEnabled", Boolean.valueOf(it.isNotificationDelegationEnabled())))));
        return Unit.INSTANCE;
    }
}
