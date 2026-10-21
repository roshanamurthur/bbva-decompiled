package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$TimePickerKt {

    @NotNull
    public static final ComposableSingletons$TimePickerKt INSTANCE = new ComposableSingletons$TimePickerKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f45lambda1 = ComposableLambdaKt.composableLambdaInstance(1425358052, false, a.f9854p0);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f46lambda2 = ComposableLambdaKt.composableLambdaInstance(-1179219109, false, b.f9855p0);

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class a extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f9854p0 = new a(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope ToggleItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ToggleItem, "$this$ToggleItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1425358052, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda-1.<anonymous> (TimePicker.kt:996)");
                }
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1307getTimePickerAMadMyvUU(), composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class b extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f9855p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope ToggleItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ToggleItem, "$this$ToggleItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1179219109, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda-2.<anonymous> (TimePicker.kt:1012)");
                }
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1316getTimePickerPMadMyvUU(), composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m1049getLambda1$material3_release() {
        return f45lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m1050getLambda2$material3_release() {
        return f46lambda2;
    }
}
