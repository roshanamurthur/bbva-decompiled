package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import m0.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "", "onRemembered", "onForgotten", "onAbandoned", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "task", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class LaunchedEffectImpl implements RememberObserver {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Function2<CoroutineScope, Continuation<? super Unit>, Object> f14587p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f14588q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Job f14589r0;

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchedEffectImpl(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f14587p0 = function2;
        this.f14588q0 = CoroutineScopeKt.CoroutineScope(coroutineContext);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Job job = this.f14589r0;
        if (job != null) {
            job.cancel((CancellationException) new m());
        }
        this.f14589r0 = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Job job = this.f14589r0;
        if (job != null) {
            job.cancel((CancellationException) new m());
        }
        this.f14589r0 = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        Job job = this.f14589r0;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        this.f14589r0 = BuildersKt__Builders_commonKt.launch$default(this.f14588q0, null, null, this.f14587p0, 3, null);
    }
}
