package fb;

import com.bbva.plugin.geolocation.manager.HmsLocator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HmsLocator.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.geolocation.manager.HmsLocator", f = "HmsLocator.kt", i = {0}, l = {51}, m = "retrieveNewLocation", n = {"error"}, s = {"L$0"})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Function1 f68396p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68397q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ HmsLocator f68398r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f68399s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HmsLocator hmsLocator, Continuation<? super a> continuation) {
        super(continuation);
        this.f68398r0 = hmsLocator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f68397q0 = obj;
        this.f68399s0 |= Integer.MIN_VALUE;
        return this.f68398r0.a(null, null, this);
    }
}
