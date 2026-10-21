package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsetsPadding.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,255:1\n36#2:256\n1097#3,6:257\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:256\n251#1:257,6\n*E\n"})
public final class WindowInsetsPadding_androidKt$windowInsetsPadding$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<WindowInsetsHolder, WindowInsets> f4451p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInsetsPadding_androidKt$windowInsetsPadding$1(Function1<? super WindowInsetsHolder, ? extends WindowInsets> function1) {
        super(3);
        this.f4451p0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(359872873);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
        }
        WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(windowInsetsHolderCurrent);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InsetsPaddingModifier(this.f4451p0.invoke(windowInsetsHolderCurrent), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return insetsPaddingModifier;
    }
}
