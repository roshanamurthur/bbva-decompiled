package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J/\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "factory", "getAndSetFactory", "expected", "", "compareAndSetFactory", "", "setFactory", "R", "Lkotlin/Function0;", "block", "withFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer$ui_release", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@InternalComposeUiApi
public final class WindowRecomposerPolicy {

    @NotNull
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<WindowRecomposerFactory> f17350a = new AtomicReference<>(WindowRecomposerFactory.INSTANCE.getLifecycleAware());
    public static final int $stable = 8;

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f17351p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Recomposer f17352q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ View f17353r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Recomposer recomposer, View view, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17352q0 = recomposer;
            this.f17353r0 = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f17352q0, this.f17353r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f17351p0;
            Recomposer recomposer = this.f17352q0;
            View view = this.f17353r0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f17351p0 = 1;
                    if (recomposer.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (WindowRecomposer_androidKt.getCompositionContext(view) == recomposer) {
                    WindowRecomposer_androidKt.setCompositionContext(view, null);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                if (WindowRecomposer_androidKt.getCompositionContext(view) == recomposer) {
                    WindowRecomposer_androidKt.setCompositionContext(view, null);
                }
                throw th2;
            }
        }
    }

    @PublishedApi
    public final boolean compareAndSetFactory(@NotNull WindowRecomposerFactory expected, @NotNull WindowRecomposerFactory factory) {
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(factory, "factory");
        AtomicReference<WindowRecomposerFactory> atomicReference = f17350a;
        while (!atomicReference.compareAndSet(expected, factory)) {
            if (atomicReference.get() != expected) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Recomposer createAndInstallWindowRecomposer$ui_release(@NotNull View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Recomposer recomposerCreateRecomposer = f17350a.get().createRecomposer(rootView);
        WindowRecomposer_androidKt.setCompositionContext(rootView, recomposerCreateRecomposer);
        GlobalScope globalScope = GlobalScope.INSTANCE;
        Handler handler = rootView.getHandler();
        Intrinsics.checkNotNullExpressionValue(handler, "rootView.handler");
        final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(globalScope, HandlerDispatcherKt.from(handler, "windowRecomposer cleanup").getImmediate(), null, new a(recomposerCreateRecomposer, rootView, null), 2, null);
        rootView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View v3) {
                Intrinsics.checkNotNullParameter(v3, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View v3) {
                Intrinsics.checkNotNullParameter(v3, "v");
                v3.removeOnAttachStateChangeListener(this);
                Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            }
        });
        return recomposerCreateRecomposer;
    }

    @PublishedApi
    @NotNull
    public final WindowRecomposerFactory getAndSetFactory(@NotNull WindowRecomposerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        WindowRecomposerFactory andSet = f17350a.getAndSet(factory);
        Intrinsics.checkNotNullExpressionValue(andSet, "factory.getAndSet(factory)");
        return andSet;
    }

    public final void setFactory(@NotNull WindowRecomposerFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        f17350a.set(factory);
    }

    public final <R> R withFactory(@NotNull WindowRecomposerFactory factory, @NotNull Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(block, "block");
        WindowRecomposerFactory andSetFactory = getAndSetFactory(factory);
        try {
            R rInvoke = block.invoke();
            InlineMarker.finallyStart(1);
            if (!compareAndSetFactory(factory, andSetFactory)) {
                throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            }
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                InlineMarker.finallyStart(1);
                if (compareAndSetFactory(factory, andSetFactory)) {
                    InlineMarker.finallyEnd(1);
                    throw th3;
                }
                ak.b.addSuppressed(th2, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th2;
            }
        }
    }
}
