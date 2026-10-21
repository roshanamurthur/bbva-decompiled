package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$ScaffoldKt {

    @NotNull
    public static final ComposableSingletons$ScaffoldKt INSTANCE = new ComposableSingletons$ScaffoldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f8lambda1 = ComposableLambdaKt.composableLambdaInstance(2069405901, false, a.f7020p0);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f9lambda2 = ComposableLambdaKt.composableLambdaInstance(-231850563, false, b.f7021p0);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function3<SnackbarHostState, Composer, Integer, Unit> f10lambda3 = ComposableLambdaKt.composableLambdaInstance(-147687984, false, c.f7022p0);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f11lambda4 = ComposableLambdaKt.composableLambdaInstance(-900670499, false, d.f7023p0);

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7020p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2069405901, iIntValue, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-1.<anonymous> (Scaffold.kt:161)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f7021p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-231850563, iIntValue, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-2.<anonymous> (Scaffold.kt:162)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class c extends Lambda implements Function3<SnackbarHostState, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f7022p0 = new c(3);

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
                    ComposerKt.traceEventStart(-147687984, iIntValue, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-3.<anonymous> (Scaffold.kt:163)");
                }
                SnackbarHostKt.SnackbarHost(it, null, null, composer2, iIntValue & 14, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f7023p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-900670499, iIntValue, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-4.<anonymous> (Scaffold.kt:164)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m739getLambda1$material_release() {
        return f8lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m740getLambda2$material_release() {
        return f9lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$material_release, reason: not valid java name */
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m741getLambda3$material_release() {
        return f10lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m742getLambda4$material_release() {
        return f11lambda4;
    }
}
