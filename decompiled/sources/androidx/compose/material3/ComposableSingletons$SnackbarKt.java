package androidx.compose.material3;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SnackbarKt {

    @NotNull
    public static final ComposableSingletons$SnackbarKt INSTANCE = new ComposableSingletons$SnackbarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f42lambda1 = ComposableLambdaKt.composableLambdaInstance(-505750804, false, a.f9851p0);

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f9851p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-505750804, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda-1.<anonymous> (Snackbar.kt:225)");
                }
                IconKt.m1140Iconww6aTOc(CloseKt.getClose(Icons.Filled.INSTANCE), Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1304getSnackbarDismissadMyvUU(), composer2, 6), (Modifier) null, 0L, composer2, 0, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1046getLambda1$material3_release() {
        return f42lambda1;
    }
}
