package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$BottomSheetScaffoldKt {

    @NotNull
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<SnackbarHostState, Composer, Integer, Unit> f7lambda1 = ComposableLambdaKt.composableLambdaInstance(895288908, false, a.f7019p0);

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class a extends Lambda implements Function3<SnackbarHostState, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7019p0 = new a(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
            SnackbarHostState it = snackbarHostState;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(it) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(895288908, iIntValue, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:419)");
                }
                SnackbarHostKt.SnackbarHost(it, null, null, composer2, iIntValue & 14, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m738getLambda1$material_release() {
        return f7lambda1;
    }
}
