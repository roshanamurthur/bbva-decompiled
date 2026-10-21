package androidx.window.layout;

import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowMetricsCalculator.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m {
    static {
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.INSTANCE;
    }

    @JvmStatic
    @NotNull
    public static WindowMetricsCalculator a() {
        return WindowMetricsCalculator.INSTANCE.getOrCreate();
    }

    @JvmStatic
    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static void b(@NotNull WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.INSTANCE.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @JvmStatic
    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static void c() {
        WindowMetricsCalculator.INSTANCE.reset();
    }
}
