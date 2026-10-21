package t5;

import android.view.KeyEvent;
import android.view.View;
import com.bbva.component.ui.message.card.MessageCardView;
import com.bbva.ui.component.menu.SlideMenuView;
import com.bbva.ui.component.menu.SlideMenuViewModel;
import com.google.android.material.search.SearchView;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.signature.DigitalSignatureComponentActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93453p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f93454q0;

    public /* synthetic */ b(KeyEvent.Callback callback, int i10) {
        this.f93453p0 = i10;
        this.f93454q0 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f93453p0;
        KeyEvent.Callback callback = this.f93454q0;
        switch (i10) {
            case 0:
                MessageCardView.a((MessageCardView) callback);
                break;
            case 1:
                SlideMenuView this$0 = (SlideMenuView) callback;
                SlideMenuView.Companion companion = SlideMenuView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SlideMenuViewModel viewModel = this$0.f36940p0;
                Intrinsics.checkNotNullExpressionValue(viewModel, "viewModel");
                SlideMenuViewModel.toggle$default(viewModel, false, false, 2, null);
                break;
            case 2:
                int i11 = SearchView.X0;
                ((SearchView) callback).hide();
                break;
            default:
                DigitalSignatureComponentActivity.b((DigitalSignatureComponentActivity) callback, view);
                break;
        }
    }
}
