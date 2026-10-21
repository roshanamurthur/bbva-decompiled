package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TooltipPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"TooltipPopup", "", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "onDismissRequest", "Lkotlin/Function0;", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TooltipPopup_androidKt {

    /* JADX INFO: compiled from: TooltipPopup.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PopupPositionProvider f12602p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12603q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12604r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12605s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(PopupPositionProvider popupPositionProvider, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f12602p0 = popupPositionProvider;
            this.f12603q0 = function0;
            this.f12604r0 = function2;
            this.f12605s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f12605s0 | 1);
            Function0<Unit> function0 = this.f12603q0;
            Function2<Composer, Integer, Unit> function2 = this.f12604r0;
            TooltipPopup_androidKt.TooltipPopup(this.f12602p0, function0, function2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TooltipPopup(@NotNull PopupPositionProvider popupPositionProvider, @NotNull Function0<Unit> onDismissRequest, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1507102480);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1507102480, i11, -1, "androidx.compose.material3.TooltipPopup (TooltipPopup.android.kt:25)");
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider, onDismissRequest, new PopupProperties(true, false, false, null, false, false, 62, null), content, composerStartRestartGroup, (i11 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE | (i11 & 112) | ((i11 << 3) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(popupPositionProvider, onDismissRequest, content, i10));
    }
}
