package com.salesforce.marketingcloud.messages.iam;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.salesforce.marketingcloud.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/IamFullImageFillActivity;", "Lcom/salesforce/marketingcloud/messages/iam/IamFullscreenActivity;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "", "h", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", SharedPrefsStorage.VERSION_KEY, "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class IamFullImageFillActivity extends IamFullscreenActivity implements OnApplyWindowInsetsListener {
    private final void h() {
        requestWindowFeature(1);
        getWindow().setFlags(1536, 1536);
        getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @NotNull
    public WindowInsetsCompat onApplyWindowInsets(@NotNull View v3, @NotNull WindowInsetsCompat insets) {
        DisplayCutoutCompat displayCutout;
        Intrinsics.checkNotNullParameter(v3, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!isFinishing() && insets.hasInsets() && (displayCutout = insets.getDisplayCutout()) != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mcsdk_iam_fif_content_padding_top);
            int safeInsetTop = displayCutout.getSafeInsetTop();
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mcsdk_iam_fif_content_padding_bottom);
            int safeInsetBottom = displayCutout.getSafeInsetBottom();
            View viewFindViewById = v3.findViewById(R.id.mcsdk_iam_container);
            if (safeInsetTop >= dimensionPixelSize) {
                dimensionPixelSize = safeInsetTop;
            }
            if (safeInsetBottom >= dimensionPixelSize2) {
                dimensionPixelSize2 = safeInsetBottom;
            }
            viewFindViewById.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize2);
        }
        WindowInsetsCompat windowInsetsCompatConsumeSystemWindowInsets = insets.consumeSystemWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatConsumeSystemWindowInsets, "insets.consumeSystemWindowInsets()");
        return windowInsetsCompatConsumeSystemWindowInsets;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.IamFullscreenActivity, com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        h();
        super.onCreate(savedInstanceState);
        View view = this.f64632f;
        if (view != null) {
            ViewCompat.setOnApplyWindowInsetsListener(view, this);
        }
    }
}
