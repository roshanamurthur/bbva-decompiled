package ke;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigationrail.NavigationRailView;

/* JADX INFO: compiled from: NavigationRailView.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements ViewUtils.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NavigationRailView f79313p0;

    public b(NavigationRailView navigationRailView) {
        this.f79313p0 = navigationRailView;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    @NonNull
    public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        NavigationRailView navigationRailView = this.f79313p0;
        Boolean bool = navigationRailView.f45019x0;
        if (bool != null ? bool.booleanValue() : ViewCompat.getFitsSystemWindows(navigationRailView)) {
            relativePadding.top += insets.top;
        }
        Boolean bool2 = navigationRailView.f45020y0;
        if (bool2 != null ? bool2.booleanValue() : ViewCompat.getFitsSystemWindows(navigationRailView)) {
            relativePadding.bottom += insets.bottom;
        }
        Boolean bool3 = navigationRailView.E0;
        if (bool3 != null ? bool3.booleanValue() : ViewCompat.getFitsSystemWindows(navigationRailView)) {
            relativePadding.start += ViewUtils.isLayoutRtl(view) ? insets.right : insets.left;
        }
        relativePadding.applyToView(view);
        return windowInsetsCompat;
    }
}
