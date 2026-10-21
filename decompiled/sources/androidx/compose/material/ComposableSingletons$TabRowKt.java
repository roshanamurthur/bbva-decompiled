package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$TabRowKt {

    @NotNull
    public static final ComposableSingletons$TabRowKt INSTANCE = new ComposableSingletons$TabRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f13lambda1 = ComposableLambdaKt.composableLambdaInstance(182187156, false, a.f7025p0);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f14lambda2 = ComposableLambdaKt.composableLambdaInstance(-1480449365, false, b.f7026p0);

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7025p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(182187156, iIntValue, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-1.<anonymous> (TabRow.kt:140)");
                }
                TabRowDefaults.INSTANCE.m852Divider9IZ8Weo(null, 0.0f, 0L, composer2, 3072, 7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f7026p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1480449365, iIntValue, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-2.<anonymous> (TabRow.kt:235)");
                }
                TabRowDefaults.INSTANCE.m852Divider9IZ8Weo(null, 0.0f, 0L, composer2, 3072, 7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m744getLambda1$material_release() {
        return f13lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m745getLambda2$material_release() {
        return f14lambda2;
    }
}
