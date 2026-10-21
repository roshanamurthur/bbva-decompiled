package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/window/layout/ExtensionsWindowLayoutInfoAdapter;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "Landroidx/window/layout/FoldingFeature;", "translate$window_release", "(Landroid/app/Activity;Landroidx/window/extensions/layout/FoldingFeature;)Landroidx/window/layout/FoldingFeature;", "translate", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "info", "Landroidx/window/layout/WindowLayoutInfo;", "(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/WindowLayoutInfo;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class ExtensionsWindowLayoutInfoAdapter {

    @NotNull
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();

    @Nullable
    public final FoldingFeature translate$window_release(@NotNull Activity activity, @NotNull androidx.window.extensions.layout.FoldingFeature oemFeature) {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            fold = HardwareFoldingFeature.Type.INSTANCE.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = HardwareFoldingFeature.Type.INSTANCE.getHINGE();
        }
        int state2 = oemFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.FLAT;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = FoldingFeature.State.HALF_OPENED;
        }
        Rect bounds = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        Bounds bounds2 = new Bounds(bounds);
        Rect bounds3 = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity).getBounds();
        if (bounds2.isZero()) {
            return null;
        }
        if (bounds2.getWidth() != bounds3.width() && bounds2.getHeight() != bounds3.height()) {
            return null;
        }
        if (bounds2.getWidth() < bounds3.width() && bounds2.getHeight() < bounds3.height()) {
            return null;
        }
        if (bounds2.getWidth() == bounds3.width() && bounds2.getHeight() == bounds3.height()) {
            return null;
        }
        Rect bounds4 = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds4, "oemFeature.bounds");
        return new HardwareFoldingFeature(new Bounds(bounds4), fold, state);
    }

    @NotNull
    public final WindowLayoutInfo translate$window_release(@NotNull Activity activity, @NotNull androidx.window.extensions.layout.WindowLayoutInfo info) {
        FoldingFeature foldingFeatureTranslate$window_release;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(info, "info");
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(feature, "feature");
                foldingFeatureTranslate$window_release = extensionsWindowLayoutInfoAdapter.translate$window_release(activity, feature);
            } else {
                foldingFeatureTranslate$window_release = null;
            }
            if (foldingFeatureTranslate$window_release != null) {
                arrayList.add(foldingFeatureTranslate$window_release);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }
}
