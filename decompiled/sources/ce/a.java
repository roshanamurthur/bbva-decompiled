package ce;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: compiled from: BottomNavigationView.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements ViewUtils.OnApplyWindowInsetsListener {
    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    @NonNull
    public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
        relativePadding.bottom = windowInsetsCompat.getSystemWindowInsetBottom() + relativePadding.bottom;
        boolean z10 = ViewCompat.getLayoutDirection(view) == 1;
        int systemWindowInsetLeft = windowInsetsCompat.getSystemWindowInsetLeft();
        int systemWindowInsetRight = windowInsetsCompat.getSystemWindowInsetRight();
        relativePadding.start += z10 ? systemWindowInsetRight : systemWindowInsetLeft;
        int i10 = relativePadding.end;
        if (!z10) {
            systemWindowInsetLeft = systemWindowInsetRight;
        }
        relativePadding.end = i10 + systemWindowInsetLeft;
        relativePadding.applyToView(view);
        return windowInsetsCompat;
    }
}
