package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
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

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$AppBarKt {

    @NotNull
    public static final ComposableSingletons$AppBarKt INSTANCE = new ComposableSingletons$AppBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f16lambda1 = ComposableLambdaKt.composableLambdaInstance(-1023749866, false, a.f9825p0);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f20lambda2 = ComposableLambdaKt.composableLambdaInstance(-1394022792, false, e.f9829p0);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f21lambda3 = ComposableLambdaKt.composableLambdaInstance(-448652169, false, f.f9830p0);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f22lambda4 = ComposableLambdaKt.composableLambdaInstance(2098467925, false, g.f9831p0);

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f23lambda5 = ComposableLambdaKt.composableLambdaInstance(1103559359, false, h.f9832p0);

    /* JADX INFO: renamed from: lambda-6, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f24lambda6 = ComposableLambdaKt.composableLambdaInstance(319435933, false, i.f9833p0);

    /* JADX INFO: renamed from: lambda-7, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f25lambda7 = ComposableLambdaKt.composableLambdaInstance(1648696171, false, j.f9834p0);

    /* JADX INFO: renamed from: lambda-8, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f26lambda8 = ComposableLambdaKt.composableLambdaInstance(-994959539, false, k.f9835p0);

    /* JADX INFO: renamed from: lambda-9, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f27lambda9 = ComposableLambdaKt.composableLambdaInstance(1044424363, false, l.f9836p0);

    /* JADX INFO: renamed from: lambda-10, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f17lambda10 = ComposableLambdaKt.composableLambdaInstance(-703422839, false, b.f9826p0);

    /* JADX INFO: renamed from: lambda-11, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f18lambda11 = ComposableLambdaKt.composableLambdaInstance(-2107138081, false, c.f9827p0);

    /* JADX INFO: renamed from: lambda-12, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f19lambda12 = ComposableLambdaKt.composableLambdaInstance(-535903298, false, d.f9828p0);

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f9825p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1023749866, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-1.<anonymous> (AppBar.kt:123)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class b extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f9826p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "$this$null");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-703422839, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-10.<anonymous> (AppBar.kt:341)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f9827p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2107138081, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-11.<anonymous> (AppBar.kt:1246)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f9828p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-535903298, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-12.<anonymous> (AppBar.kt:1247)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class e extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f9829p0 = new e(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "$this$null");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1394022792, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-2.<anonymous> (AppBar.kt:124)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f9830p0 = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-448652169, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-3.<anonymous> (AppBar.kt:186)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class g extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f9831p0 = new g(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "$this$null");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2098467925, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-4.<anonymous> (AppBar.kt:187)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f9832p0 = new h(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1103559359, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-5.<anonymous> (AppBar.kt:227)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class i extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f9833p0 = new i(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "$this$null");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(319435933, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-6.<anonymous> (AppBar.kt:228)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f9834p0 = new j(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1648696171, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-7.<anonymous> (AppBar.kt:282)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class k extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f9835p0 = new k(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "$this$null");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-994959539, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-8.<anonymous> (AppBar.kt:283)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f9836p0 = new l(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1044424363, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-9.<anonymous> (AppBar.kt:340)");
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
    public final Function2<Composer, Integer, Unit> m1020getLambda1$material3_release() {
        return f16lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-10$material3_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m1021getLambda10$material3_release() {
        return f17lambda10;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-11$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1022getLambda11$material3_release() {
        return f18lambda11;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-12$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1023getLambda12$material3_release() {
        return f19lambda12;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m1024getLambda2$material3_release() {
        return f20lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1025getLambda3$material3_release() {
        return f21lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$material3_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m1026getLambda4$material3_release() {
        return f22lambda4;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-5$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1027getLambda5$material3_release() {
        return f23lambda5;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-6$material3_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m1028getLambda6$material3_release() {
        return f24lambda6;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-7$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1029getLambda7$material3_release() {
        return f25lambda7;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-8$material3_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m1030getLambda8$material3_release() {
        return f26lambda8;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-9$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1031getLambda9$material3_release() {
        return f27lambda9;
    }
}
