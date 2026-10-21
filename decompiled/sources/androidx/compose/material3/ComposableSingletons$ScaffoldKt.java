package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
    public static Function2<Composer, Integer, Unit> f36lambda1 = ComposableLambdaKt.composableLambdaInstance(1519764251, false, a.f9845p0);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f37lambda2 = ComposableLambdaKt.composableLambdaInstance(836907051, false, b.f9846p0);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f38lambda3 = ComposableLambdaKt.composableLambdaInstance(-297736342, false, c.f9847p0);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f39lambda4 = ComposableLambdaKt.composableLambdaInstance(1545895435, false, d.f9848p0);

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f9845p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1519764251, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$ScaffoldKt.lambda-1.<anonymous> (Scaffold.kt:75)");
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
        public static final b f9846p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(836907051, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$ScaffoldKt.lambda-2.<anonymous> (Scaffold.kt:76)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f9847p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-297736342, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$ScaffoldKt.lambda-3.<anonymous> (Scaffold.kt:77)");
                }
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
        public static final d f9848p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1545895435, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$ScaffoldKt.lambda-4.<anonymous> (Scaffold.kt:78)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1040getLambda1$material3_release() {
        return f36lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1041getLambda2$material3_release() {
        return f37lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1042getLambda3$material3_release() {
        return f38lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1043getLambda4$material3_release() {
        return f39lambda4;
    }
}
