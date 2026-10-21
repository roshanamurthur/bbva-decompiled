package z1;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,466:1\n81#2:467\n107#2,2:468\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n216#1:467\n216#1:468,2\n*E\n"})
public final class c extends AbstractComposeView implements DialogWindowProvider {
    public boolean E0;
    public boolean F0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Window f94934x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final MutableState f94935y0;

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f94937q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f94937q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f94937q0 | 1);
            c.this.Content(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @NotNull Window window) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(window, "window");
        this.f94934x0 = window;
        this.f94935y0 = SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m4628getLambda1$ui_release(), null, 2, null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public final void Content(@Nullable Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1735448596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735448596, i10, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:268)");
        }
        ((Function2) this.f94935y0.getValue()).invoke(composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(i10));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.F0;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    @NotNull
    public final Window getWindow() {
        return this.f94934x0;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        if (this.E0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f94934x0.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnMeasure$ui_release(int i10, int i11) {
        if (this.E0) {
            super.internalOnMeasure$ui_release(i10, i11);
            return;
        }
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(mk.c.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(mk.c.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    public final void setContent(@NotNull CompositionContext parent, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        this.f94935y0.setValue(content);
        this.F0 = true;
        createComposition();
    }

    public final void setUsePlatformDefaultWidth(boolean z10) {
        this.E0 = z10;
    }
}
