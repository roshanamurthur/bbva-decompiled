package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
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
    public static Function3<RowScope, Composer, Integer, Unit> f5lambda1 = ComposableLambdaKt.composableLambdaInstance(-771938130, false, a.f7017p0);

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class a extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7017p0 = new a(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "$this$null");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-771938130, iIntValue, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-1.<anonymous> (AppBar.kt:80)");
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
    public final Function3<RowScope, Composer, Integer, Unit> m736getLambda1$material_release() {
        return f5lambda1;
    }
}
