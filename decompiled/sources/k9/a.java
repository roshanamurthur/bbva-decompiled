package k9;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.bbva.glomohybrid.base.extensions.ViewGroupExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.LandingActivity;
import com.bbva.ui.component.menu.SlideMenuView;
import com.google.android.material.search.SearchView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f79256p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f79257q0;

    public /* synthetic */ a(KeyEvent.Callback callback, int i10) {
        this.f79256p0 = i10;
        this.f79257q0 = callback;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsets) {
        int i10 = this.f79256p0;
        KeyEvent.Callback callback = this.f79257q0;
        switch (i10) {
            case 0:
                LandingActivity this$0 = (LandingActivity) callback;
                LandingActivity.Companion companion = LandingActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
                SlideMenuView slideMenuView = this$0.i().slideMenuView;
                Intrinsics.checkNotNullExpressionValue(slideMenuView, "slideMenuView");
                ViewGroupExtensionsKt.setMargin(slideMenuView, Integer.valueOf(insets.left), 0, Integer.valueOf(insets.right), Integer.valueOf(insets.bottom));
                break;
            default:
                SearchView.a((SearchView) callback, windowInsets);
                break;
        }
        return windowInsets;
    }
}
