package z7;

import com.bbva.glomohybrid.base.deeplink.usecase.DynamicLinkUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DynamicLinkUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.base.deeplink.usecase.DynamicLinkUseCase", f = "DynamicLinkUseCase.kt", i = {}, l = {51}, m = "readDynamicLink", n = {}, s = {})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f95007p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DynamicLinkUseCase f95008q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f95009r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DynamicLinkUseCase dynamicLinkUseCase, Continuation<? super a> continuation) {
        super(continuation);
        this.f95008q0 = dynamicLinkUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f95007p0 = obj;
        this.f95009r0 |= Integer.MIN_VALUE;
        return DynamicLinkUseCase.access$readDynamicLink(this.f95008q0, null, this);
    }
}
