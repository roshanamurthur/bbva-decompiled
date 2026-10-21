package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.R;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Composition, LifecycleEventObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final AndroidComposeView f17440p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Composition f17441q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f17442r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Lifecycle f17443s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public Function2<? super Composer, ? super Integer, Unit> f17444t0;

    /* JADX INFO: compiled from: Wrapper.android.kt */
    public static final class a extends Lambda implements Function1<AndroidComposeView.ViewTreeOwners, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f17446q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Composer, ? super Integer, Unit> function2) {
            super(1);
            this.f17446q0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
            AndroidComposeView.ViewTreeOwners it = viewTreeOwners;
            Intrinsics.checkNotNullParameter(it, "it");
            r1 r1Var = r1.this;
            if (!r1Var.f17442r0) {
                Lifecycle lifecycle = it.getLifecycleOwner().getLifecycle();
                Function2<Composer, Integer, Unit> function2 = this.f17446q0;
                r1Var.f17444t0 = function2;
                if (r1Var.f17443s0 == null) {
                    r1Var.f17443s0 = lifecycle;
                    lifecycle.addObserver(r1Var);
                } else if (lifecycle.getF21906d().isAtLeast(Lifecycle.State.CREATED)) {
                    r1Var.f17441q0.setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new q1(r1Var, function2)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public r1(@NotNull AndroidComposeView owner, @NotNull Composition original) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(original, "original");
        this.f17440p0 = owner;
        this.f17441q0 = original;
        this.f17444t0 = ComposableSingletons$Wrapper_androidKt.INSTANCE.m3786getLambda1$ui_release();
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        if (!this.f17442r0) {
            this.f17442r0 = true;
            this.f17440p0.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f17443s0;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.f17441q0.dispose();
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean getHasInvalidations() {
        return this.f17441q0.getHasInvalidations();
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: isDisposed */
    public final boolean getP0() {
        return this.f17441q0.getP0();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.f17442r0) {
                return;
            }
            setContent(this.f17444t0);
        }
    }

    @Override // androidx.compose.runtime.Composition
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f17440p0.setOnViewTreeOwnersAvailable(new a(content));
    }
}
