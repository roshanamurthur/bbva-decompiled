package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
    public static Function2<Composer, Integer, Unit> f28lambda1 = ComposableLambdaKt.composableLambdaInstance(481988104, false, a.f9837p0);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function3<SnackbarHostState, Composer, Integer, Unit> f29lambda2 = ComposableLambdaKt.composableLambdaInstance(-928941170, false, b.f9838p0);

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f9837p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(481988104, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:106)");
                }
                BottomSheetDefaults.INSTANCE.m922DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    public static final class b extends Lambda implements Function3<SnackbarHostState, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f9838p0 = new b(3);

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
                    ComposerKt.traceEventStart(-928941170, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda-2.<anonymous> (BottomSheetScaffold.kt:109)");
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
    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1032getLambda1$material3_release() {
        return f28lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m1033getLambda2$material3_release() {
        return f29lambda2;
    }
}
