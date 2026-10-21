package mx.openpay.library.ui.modal;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.R;
import mx.openpay.library.databinding.ModalPayWithPointsBinding;
import mx.openpay.library.ui.FullScreenDialogFragment;
import mx.openpay.library.ui.util.UIExtensionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r5.b;
import zb.a;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Lmx/openpay/library/ui/modal/PayWithPointsModal;", "Lmx/openpay/library/ui/FullScreenDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onResume", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "library_release"}, k = 1, mv = {1, 8, 0})
public final class PayWithPointsModal extends FullScreenDialogFragment {
    public static final int $stable = 0;

    @NotNull
    public static final String PAY_WITH_POINTS_MODAL_TAG = "PAY_WITH_POINTS_MODAL_TAG";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f84336a;

    public PayWithPointsModal(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f84336a = listener;
    }

    public static final void a(PayWithPointsModal this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f84336a.invoke(Boolean.TRUE);
        this$0.dismiss();
    }

    public static final void b(PayWithPointsModal this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f84336a.invoke(Boolean.FALSE);
        this$0.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ModalPayWithPointsBinding modalPayWithPointsBindingInflate = ModalPayWithPointsBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(modalPayWithPointsBindingInflate, "inflate(layoutInflater)");
        Typeface font = ResourcesCompat.getFont(requireContext(), R.font.bento_font_bold);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            UIExtensionKt.changeStatusBarColor(window, contextRequireContext, R.color.background_screen_overlap);
        }
        modalPayWithPointsBindingInflate.yesButton.setTypeface(font);
        modalPayWithPointsBindingInflate.titleTextview.setTypeface(font);
        modalPayWithPointsBindingInflate.noButton.setTypeface(font);
        modalPayWithPointsBindingInflate.yesButton.setOnClickListener(new a(this, 2));
        modalPayWithPointsBindingInflate.noButton.setOnClickListener(new b(this, 1));
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
        FrameLayout root = modalPayWithPointsBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        UIExtensionKt.hideNavigationBar(window);
    }
}
