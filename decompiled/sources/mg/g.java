package mg;

import com.google.firebase.sessions.SessionFirelogPublisherImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes10.dex */
@DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {}, l = {113}, m = "getFirebaseInstallationId", n = {}, s = {})
public final class g extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f83465p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SessionFirelogPublisherImpl f83466q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f83467r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, Continuation<? super g> continuation) {
        super(continuation);
        this.f83466q0 = sessionFirelogPublisherImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f83465p0 = obj;
        this.f83467r0 |= Integer.MIN_VALUE;
        return SessionFirelogPublisherImpl.access$getFirebaseInstallationId(this.f83466q0, this);
    }
}
