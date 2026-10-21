package com.bbva.ui.compose;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StatusNotification.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"StatusNotification", "", "type", "Lcom/bbva/ui/compose/StatusNotificationType;", "textResId", "", "isVisible", "", "(Lcom/bbva/ui/compose/StatusNotificationType;IZLandroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StatusNotificationKt {

    /* JADX INFO: compiled from: StatusNotification.kt */
    public static final class a extends Lambda implements Function1<IntSize, IntSize> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f37174p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(IntSize intSize) {
            return IntSize.m4541boximpl(IntSizeKt.IntSize(IntSize.m4549getWidthimpl(intSize.getF18319a()), 0));
        }
    }

    /* JADX INFO: compiled from: StatusNotification.kt */
    @SourceDebugExtension({"SMAP\nStatusNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusNotification.kt\ncom/bbva/ui/compose/StatusNotificationKt$StatusNotification$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,105:1\n76#2:106\n*S KotlinDebug\n*F\n+ 1 StatusNotification.kt\ncom/bbva/ui/compose/StatusNotificationKt$StatusNotification$2\n*L\n58#1:106\n*E\n"})
    public static final class b extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StatusNotificationType f37175p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37176q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StatusNotificationType statusNotificationType, int i10) {
            super(3);
            this.f37175p0 = statusNotificationType;
            this.f37176q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1919559080, iIntValue, -1, "com.bbva.ui.compose.StatusNotification.<anonymous> (StatusNotification.kt:56)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AndroidCompositionLocals_androidKt.getLocalContext().provides(new ContextThemeWrapper((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()), R.style.Theme_BBVA_Primary))}, ComposableLambdaKt.composableLambda(composer2, -860328168, true, new e(this.f37175p0, this.f37176q0)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: StatusNotification.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StatusNotificationType f37177p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37178q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f37179r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f37180s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StatusNotificationType statusNotificationType, int i10, boolean z10, int i11) {
            super(2);
            this.f37177p0 = statusNotificationType;
            this.f37178q0 = i10;
            this.f37179r0 = z10;
            this.f37180s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f37180s0 | 1);
            int i10 = this.f37178q0;
            boolean z10 = this.f37179r0;
            StatusNotificationKt.StatusNotification(this.f37177p0, i10, z10, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void StatusNotification(@NotNull StatusNotificationType type, int i10, boolean z10, @Nullable Composer composer, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(type, "type");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1169947264);
        if ((i11 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(type) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169947264, i12, -1, "com.bbva.ui.compose.StatusNotification (StatusNotification.kt:45)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            AnimatedVisibilityKt.AnimatedVisibility(z10, (Modifier) null, EnterExitTransitionKt.expandIn$default(null, companion.getBottomCenter(), false, a.f37174p0, 5, null), EnterExitTransitionKt.shrinkVertically$default(null, companion.getBottom(), false, null, 13, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1919559080, true, new b(type, i10)), composerStartRestartGroup, ((i12 >> 6) & 14) | 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c(type, i10, z10, i11));
        }
    }
}
