package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aH\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\u00020\u00142)\b\b\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086Jø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", EventDataKeys.Lifecycle.LIFECYCLE_START, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/Job;", "launch", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/Deferred;", "async", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "withContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "invoke", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/BuildersKt")
@SourceDebugExtension({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,273:1\n95#2,5:274\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n166#1:274,5\n*E\n"})
public final /* synthetic */ class BuildersKt__Builders_commonKt {
    @NotNull
    public static final <T> Deferred<T> async(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        CoroutineContext coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        DeferredCoroutine lazyDeferredCoroutine = coroutineStart.isLazy() ? new LazyDeferredCoroutine(coroutineContextNewCoroutineContext, function2) : new DeferredCoroutine(coroutineContextNewCoroutineContext, true);
        ((AbstractCoroutine) lazyDeferredCoroutine).start(coroutineStart, lazyDeferredCoroutine, function2);
        return (Deferred<T>) lazyDeferredCoroutine;
    }

    public static /* synthetic */ Deferred async$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.async(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    @Nullable
    public static final <T> Object invoke(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, function2, continuation);
    }

    @NotNull
    public static final Job launch(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart.isLazy() ? new LazyStandaloneCoroutine(coroutineContextNewCoroutineContext, function2) : new StandaloneCoroutine(coroutineContextNewCoroutineContext, true);
        lazyStandaloneCoroutine.start(coroutineStart, lazyStandaloneCoroutine, function2);
        return lazyStandaloneCoroutine;
    }

    public static /* synthetic */ Job launch$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    @Nullable
    public static final <T> Object withContext(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        Object result$kotlinx_coroutines_core;
        CoroutineContext context = continuation.getF79378p0();
        CoroutineContext coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(context, coroutineContext);
        JobKt.ensureActive(coroutineContextNewCoroutineContext);
        if (coroutineContextNewCoroutineContext == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(coroutineContextNewCoroutineContext, continuation);
            result$kotlinx_coroutines_core = UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, function2);
        } else {
            ContinuationInterceptor.Companion key = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(coroutineContextNewCoroutineContext.get(key), context.get(key))) {
                UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(coroutineContextNewCoroutineContext, continuation);
                CoroutineContext context2 = undispatchedCoroutine.getF79378p0();
                Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context2, null);
                try {
                    Object objStartUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(undispatchedCoroutine, undispatchedCoroutine, function2);
                    ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                    result$kotlinx_coroutines_core = objStartUndispatchedOrReturn;
                } catch (Throwable th2) {
                    ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
                    throw th2;
                }
            } else {
                DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(coroutineContextNewCoroutineContext, continuation);
                CancellableKt.startCoroutineCancellable$default(function2, dispatchedCoroutine, dispatchedCoroutine, null, 4, null);
                result$kotlinx_coroutines_core = dispatchedCoroutine.getResult$kotlinx_coroutines_core();
            }
        }
        if (result$kotlinx_coroutines_core == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result$kotlinx_coroutines_core;
    }
}
