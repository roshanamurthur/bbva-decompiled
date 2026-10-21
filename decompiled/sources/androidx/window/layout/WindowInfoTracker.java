package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInfoTracker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "windowLayoutInfo", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface WindowInfoTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f24214a;

    /* JADX INFO: compiled from: WindowInfoTracker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007¨\u0006\u0011"}, d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowInfoTracker;", "getOrCreate", "Landroidx/window/layout/WindowBackend;", "windowBackend$window_release", "(Landroid/content/Context;)Landroidx/window/layout/WindowBackend;", "windowBackend", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "overridingDecorator", "", "overrideDecorator", "reset", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f24214a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static WindowInfoTrackerDecorator f24215b;

        static {
            Reflection.getOrCreateKotlinClass(WindowInfoTracker.class).getSimpleName();
            f24215b = e.f24231a;
        }

        @JvmStatic
        @JvmName(name = "getOrCreate")
        @NotNull
        public final WindowInfoTracker getOrCreate(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return f24215b.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(@NotNull WindowInfoTrackerDecorator overridingDecorator) {
            Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            f24215b = overridingDecorator;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            f24215b = e.f24231a;
        }

        @NotNull
        public final WindowBackend windowBackend$window_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                WindowLayoutComponent windowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (Throwable unused) {
            }
            return extensionWindowLayoutInfoBackend == null ? SidecarWindowBackend.INSTANCE.getInstance(context) : extensionWindowLayoutInfoBackend;
        }
    }

    @NotNull
    Flow<WindowLayoutInfo> windowLayoutInfo(@NotNull Activity activity);
}
