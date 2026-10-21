package mx.openpay.library.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import mx.openpay.library.R;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lmx/openpay/library/ui/FullScreenDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FullScreenDialogFragment extends DialogFragment {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.Theme_FullScreenDialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
