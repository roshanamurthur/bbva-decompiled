package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$AndroidPopup_androidKt {

    @NotNull
    public static final ComposableSingletons$AndroidPopup_androidKt INSTANCE = new ComposableSingletons$AndroidPopup_androidKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f54lambda1 = ComposableLambdaKt.composableLambdaInstance(-1131826196, false, a.f18455p0);

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f18455p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1131826196, iIntValue, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda-1.<anonymous> (AndroidPopup.android.kt:446)");
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
    public final Function2<Composer, Integer, Unit> m4629getLambda1$ui_release() {
        return f54lambda1;
    }
}
