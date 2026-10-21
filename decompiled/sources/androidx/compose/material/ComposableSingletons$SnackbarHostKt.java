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

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SnackbarHostKt {

    @NotNull
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<SnackbarData, Composer, Integer, Unit> f12lambda1 = ComposableLambdaKt.composableLambdaInstance(996639038, false, a.f7024p0);

    /* JADX INFO: compiled from: SnackbarHost.kt */
    public static final class a extends Lambda implements Function3<SnackbarData, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7024p0 = new a(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            SnackbarData it = snackbarData;
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
                    ComposerKt.traceEventStart(996639038, iIntValue, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:153)");
                }
                SnackbarKt.m818SnackbarsPrSdHI(it, null, false, null, 0L, 0L, 0L, 0.0f, composer2, iIntValue & 14, 254);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3<SnackbarData, Composer, Integer, Unit> m743getLambda1$material_release() {
        return f12lambda1;
    }
}
