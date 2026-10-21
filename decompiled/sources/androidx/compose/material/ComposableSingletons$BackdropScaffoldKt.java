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

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$BackdropScaffoldKt {

    @NotNull
    public static final ComposableSingletons$BackdropScaffoldKt INSTANCE = new ComposableSingletons$BackdropScaffoldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<SnackbarHostState, Composer, Integer, Unit> f6lambda1 = ComposableLambdaKt.composableLambdaInstance(229445492, false, a.f7018p0);

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    public static final class a extends Lambda implements Function3<SnackbarHostState, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7018p0 = new a(3);

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
                    ComposerKt.traceEventStart(229445492, iIntValue, -1, "androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.lambda-1.<anonymous> (BackdropScaffold.kt:273)");
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
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m737getLambda1$material_release() {
        return f6lambda1;
    }
}
