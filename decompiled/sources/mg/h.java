package mg;

import com.google.firebase.sessions.SessionFirelogPublisherImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes10.dex */
@DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {0}, l = {95}, m = "shouldLogSession", n = {"this"}, s = {"L$0"})
public final class h extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SessionFirelogPublisherImpl f83468p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f83469q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SessionFirelogPublisherImpl f83470r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f83471s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, Continuation<? super h> continuation) {
        super(continuation);
        this.f83470r0 = sessionFirelogPublisherImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f83469q0 = obj;
        this.f83471s0 |= Integer.MIN_VALUE;
        return SessionFirelogPublisherImpl.access$shouldLogSession(this.f83470r0, this);
    }
}
