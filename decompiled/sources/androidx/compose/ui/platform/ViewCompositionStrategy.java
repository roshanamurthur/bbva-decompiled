package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00072\u00020\u0001:\u0005\u0007\b\t\n\u000bJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "installFor", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "Companion", "DisposeOnDetachedFromWindow", "DisposeOnDetachedFromWindowOrReleasedFromPool", "DisposeOnLifecycleDestroyed", "DisposeOnViewTreeLifecycleDestroyed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ViewCompositionStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f17309a;

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$Companion;", "", "()V", "Default", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "getDefault", "()Landroidx/compose/ui/platform/ViewCompositionStrategy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f17309a = new Companion();

        @NotNull
        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @NotNull
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AbstractComposeView f17310p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 f17311q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1) {
                super(0);
                this.f17310p0 = abstractComposeView;
                this.f17311q0 = viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f17310p0.removeOnAttachStateChangeListener(this.f17311q0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0<Unit> installFor(@NotNull final AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v3) {
                    Intrinsics.checkNotNullParameter(v3, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v3) {
                    Intrinsics.checkNotNullParameter(v3, "v");
                    view.disposeComposition();
                }
            };
            view.addOnAttachStateChangeListener(r1);
            return new a(view, r1);
        }
    }

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @NotNull
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AbstractComposeView f17313p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 f17314q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ PoolingContainerListener f17315r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, b bVar) {
                super(0);
                this.f17313p0 = abstractComposeView;
                this.f17314q0 = viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1;
                this.f17315r0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                AbstractComposeView abstractComposeView = this.f17313p0;
                abstractComposeView.removeOnAttachStateChangeListener(this.f17314q0);
                PoolingContainer.removePoolingContainerListener(abstractComposeView, this.f17315r0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        public static final class b implements PoolingContainerListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractComposeView f17316a;

            public b(AbstractComposeView abstractComposeView) {
                this.f17316a = abstractComposeView;
            }

            @Override // androidx.customview.poolingcontainer.PoolingContainerListener
            public final void onRelease() {
                this.f17316a.disposeComposition();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0<Unit> installFor(@NotNull final AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v3) {
                    Intrinsics.checkNotNullParameter(v3, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v3) {
                    Intrinsics.checkNotNullParameter(v3, "v");
                    AbstractComposeView abstractComposeView = view;
                    if (PoolingContainer.isWithinPoolingContainer(abstractComposeView)) {
                        return;
                    }
                    abstractComposeView.disposeComposition();
                }
            };
            view.addOnAttachStateChangeListener(r1);
            b bVar = new b(view);
            PoolingContainer.addPoolingContainerListener(view, bVar);
            return new a(view, r1, bVar);
        }
    }

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @NotNull
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AbstractComposeView f17319p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 f17320q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1) {
                super(0);
                this.f17319p0 = abstractComposeView;
                this.f17320q0 = viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f17319p0.removeOnAttachStateChangeListener(this.f17320q0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        public static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<Function0<Unit>> f17321p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ref.ObjectRef<Function0<Unit>> objectRef) {
                super(0);
                this.f17321p0 = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f17321p0.element.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$a] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0<Unit> installFor(@NotNull final AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!view.isAttachedToWindow()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                    /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.jvm.functions.Function0] */
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View v3) {
                        Intrinsics.checkNotNullParameter(v3, "v");
                        AbstractComposeView abstractComposeView = view;
                        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
                        if (lifecycleOwner != null) {
                            objectRef.element = ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView, lifecycleOwner.getLifecycle());
                            abstractComposeView.removeOnAttachStateChangeListener(this);
                        } else {
                            throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View v3) {
                        Intrinsics.checkNotNullParameter(v3, "v");
                    }
                };
                view.addOnAttachStateChangeListener(r1);
                objectRef.element = new a(view, r1);
                return new b(objectRef);
            }
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner != null) {
                return ViewCompositionStrategy_androidKt.access$installForLifecycle(view, lifecycleOwner.getLifecycle());
            }
            throw new IllegalStateException(("View tree for " + view + " has no ViewTreeLifecycleOwner").toString());
        }
    }

    @NotNull
    Function0<Unit> installFor(@NotNull AbstractComposeView view);

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Lifecycle f17318a;

        public DisposeOnLifecycleDestroyed(@NotNull Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f17318a = lifecycle;
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0<Unit> installFor(@NotNull AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return ViewCompositionStrategy_androidKt.access$installForLifecycle(view, this.f17318a);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DisposeOnLifecycleDestroyed(@NotNull LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycle());
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        }
    }
}
