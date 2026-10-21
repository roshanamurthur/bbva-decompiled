package x9;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import com.bbva.glomohybrid.profiling.handler.ProfilingFeatureFlagsHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfilingFeatureFlagsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.profiling.handler.ProfilingFeatureFlagsHandler", f = "ProfilingFeatureFlagsHandler.kt", i = {0, 0, 0}, l = {29}, m = "evaluateProfilingModel", n = {"this", "featureFlag", LocalStorageConstantsKt.KEY_PROFILING}, s = {"L$0", "L$1", "L$2"})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ProfilingFeatureFlagsHandler f94493p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public FeatureFlags f94494q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Profiling f94495r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public /* synthetic */ Object f94496s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ ProfilingFeatureFlagsHandler f94497t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f94498u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ProfilingFeatureFlagsHandler profilingFeatureFlagsHandler, Continuation<? super a> continuation) {
        super(continuation);
        this.f94497t0 = profilingFeatureFlagsHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f94496s0 = obj;
        this.f94498u0 |= Integer.MIN_VALUE;
        return ProfilingFeatureFlagsHandler.access$evaluateProfilingModel(this.f94497t0, null, null, this);
    }
}
