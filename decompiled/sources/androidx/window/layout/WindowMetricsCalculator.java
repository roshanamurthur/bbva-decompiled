package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowMetricsCalculator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator;", "", "computeCurrentWindowMetrics", "Landroidx/window/layout/WindowMetrics;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "computeMaximumWindowMetrics", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface WindowMetricsCalculator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f24226a;

    /* JADX INFO: compiled from: WindowMetricsCalculator.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator$Companion;", "", "Landroidx/window/layout/WindowMetricsCalculator;", "getOrCreate", "Landroidx/window/layout/WindowMetricsCalculatorDecorator;", "overridingDecorator", "", "overrideDecorator", "reset", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f24226a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static Function1<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> f24227b = a.f24228p0;

        /* JADX INFO: compiled from: WindowMetricsCalculator.kt */
        public static final class a extends Lambda implements Function1<WindowMetricsCalculator, WindowMetricsCalculator> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f24228p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
                WindowMetricsCalculator it = windowMetricsCalculator;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }

        /* JADX INFO: compiled from: WindowMetricsCalculator.kt */
        public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<WindowMetricsCalculator, WindowMetricsCalculator> {
            public b(Object obj) {
                super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
                WindowMetricsCalculator p4 = windowMetricsCalculator;
                Intrinsics.checkNotNullParameter(p4, "p0");
                return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(p4);
            }
        }

        /* JADX INFO: compiled from: WindowMetricsCalculator.kt */
        public static final class c extends Lambda implements Function1<WindowMetricsCalculator, WindowMetricsCalculator> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final c f24229p0 = new c(1);

            @Override // kotlin.jvm.functions.Function1
            public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
                WindowMetricsCalculator it = windowMetricsCalculator;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }

        @JvmStatic
        @NotNull
        public final WindowMetricsCalculator getOrCreate() {
            return f24227b.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @JvmStatic
        @ExperimentalWindowApi
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void overrideDecorator(@NotNull WindowMetricsCalculatorDecorator overridingDecorator) {
            Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            f24227b = new b(overridingDecorator);
        }

        @JvmStatic
        @ExperimentalWindowApi
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void reset() {
            f24227b = c.f24229p0;
        }
    }

    @NotNull
    WindowMetrics computeCurrentWindowMetrics(@NotNull Activity activity);

    @NotNull
    WindowMetrics computeMaximumWindowMetrics(@NotNull Activity activity);
}
