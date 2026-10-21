package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SubcomposeLayoutKt {

    @NotNull
    public static final ComposableSingletons$SubcomposeLayoutKt INSTANCE = new ComposableSingletons$SubcomposeLayoutKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f51lambda1 = ComposableLambdaKt.composableLambdaInstance(-1741544742, false, a.f16530p0);

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16530p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741544742, iIntValue, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda-1.<anonymous> (SubcomposeLayout.kt:679)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m3569getLambda1$ui_release() {
        return f51lambda1;
    }
}
