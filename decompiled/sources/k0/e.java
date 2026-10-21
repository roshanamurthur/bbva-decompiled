package k0;

import android.widget.EditText;
import androidx.compose.material.ripple.RippleHostView;
import androidx.core.widget.ContentLoadingProgressBar;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.zoomauth.facialauth.FacialAuthCallback;
import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import com.bbva.zoomauth.facialauth.FacialAuthFragment$onUserCancelled$1;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f79158p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f79159q0;

    public /* synthetic */ e(Object obj, int i10) {
        this.f79158p0 = i10;
        this.f79159q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f79158p0;
        Object obj = this.f79159q0;
        switch (i10) {
            case 0:
                RippleHostView.setRippleState$lambda$2((RippleHostView) obj);
                break;
            case 1:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) obj;
                contentLoadingProgressBar.f20434q0 = false;
                contentLoadingProgressBar.f20433p0 = -1L;
                contentLoadingProgressBar.setVisibility(8);
                break;
            case 2:
                CommandCallback callback = (CommandCallback) obj;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.sendError(Errors.ErrorDefault);
                break;
            case 3:
                FacialAuthFragment this$0 = (FacialAuthFragment) obj;
                int i11 = FacialAuthFragment$onUserCancelled$1.f37789q0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FacialAuthCallback facialAuthCallback = this$0.f37783q0;
                Intrinsics.checkNotNull(facialAuthCallback);
                facialAuthCallback.onUserCancelled();
                break;
            case 4:
                ((DocumentFragment) obj).smartDetectorTimeOut.set(true);
                break;
            default:
                SearchView searchView = (SearchView) obj;
                EditText editText = searchView.f45142y0;
                editText.clearFocus();
                SearchBar searchBar = searchView.N0;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                ViewUtils.hideKeyboard(editText, searchView.T0);
                break;
        }
    }
}
