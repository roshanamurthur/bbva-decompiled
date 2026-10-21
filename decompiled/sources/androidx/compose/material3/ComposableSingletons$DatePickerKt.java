package androidx.compose.material3;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DateRangeKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$DatePickerKt {

    @NotNull
    public static final ComposableSingletons$DatePickerKt INSTANCE = new ComposableSingletons$DatePickerKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f30lambda1 = ComposableLambdaKt.composableLambdaInstance(1244569435, false, a.f9839p0);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f31lambda2 = ComposableLambdaKt.composableLambdaInstance(668820324, false, b.f9840p0);

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f9839p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1244569435, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-1.<anonymous> (DatePicker.kt:1071)");
                }
                IconKt.m1140Iconww6aTOc(EditKt.getEdit(Icons.Filled.INSTANCE), Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1280getDatePickerSwitchToInputModeadMyvUU(), composer2, 6), (Modifier) null, 0L, composer2, 0, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f9840p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(668820324, iIntValue, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-2.<anonymous> (DatePicker.kt:1078)");
                }
                IconKt.m1140Iconww6aTOc(DateRangeKt.getDateRange(Icons.Filled.INSTANCE), Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1278getDatePickerSwitchToCalendarModeadMyvUU(), composer2, 6), (Modifier) null, 0L, composer2, 0, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1034getLambda1$material3_release() {
        return f30lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1035getLambda2$material3_release() {
        return f31lambda2;
    }
}
