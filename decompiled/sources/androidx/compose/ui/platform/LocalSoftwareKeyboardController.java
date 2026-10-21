package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalSoftwareKeyboardController.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/LocalSoftwareKeyboardController;", "", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/runtime/ProvidedValue;", "provides", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getCurrent$annotations", "()V", "current", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nLocalSoftwareKeyboardController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,76:1\n76#2:77\n76#2:78\n36#3:79\n1097#4,6:80\n*S KotlinDebug\n*F\n+ 1 LocalSoftwareKeyboardController.kt\nandroidx/compose/ui/platform/LocalSoftwareKeyboardController\n*L\n42#1:77\n47#1:78\n48#1:79\n48#1:80,6\n*E\n"})
public final class LocalSoftwareKeyboardController {
    public static final int $stable = 0;

    @NotNull
    public static final LocalSoftwareKeyboardController INSTANCE = new LocalSoftwareKeyboardController();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<SoftwareKeyboardController> f17251a = CompositionLocalKt.compositionLocalOf$default(null, a.f17252p0, 1, null);

    /* JADX INFO: compiled from: LocalSoftwareKeyboardController.kt */
    public static final class a extends Lambda implements Function0<SoftwareKeyboardController> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17252p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ SoftwareKeyboardController invoke() {
            return null;
        }
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final SoftwareKeyboardController getCurrent(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1059476185);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1059476185, i10, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.<get-current> (LocalSoftwareKeyboardController.kt:40)");
        }
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer.consume(f17251a);
        if (softwareKeyboardController == null) {
            int i11 = i10 & 14;
            composer.startReplaceableGroup(1835581880);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1835581880, i11, -1, "androidx.compose.ui.platform.LocalSoftwareKeyboardController.delegatingController (LocalSoftwareKeyboardController.kt:45)");
            }
            TextInputService textInputService = (TextInputService) composer.consume(CompositionLocalsKt.getLocalTextInputService());
            if (textInputService == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                softwareKeyboardController = null;
            } else {
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(textInputService);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new n0(textInputService);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                n0 n0Var = (n0) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                softwareKeyboardController = n0Var;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return softwareKeyboardController;
    }

    @NotNull
    public final ProvidedValue<SoftwareKeyboardController> provides(@NotNull SoftwareKeyboardController softwareKeyboardController) {
        Intrinsics.checkNotNullParameter(softwareKeyboardController, "softwareKeyboardController");
        return f17251a.provides(softwareKeyboardController);
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCurrent$annotations() {
    }
}
