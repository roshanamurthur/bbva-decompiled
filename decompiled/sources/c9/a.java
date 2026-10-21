package c9;

import android.R;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import com.bbva.glomohybrid.infoscreen.optionlist.OptionListActivity;
import com.bbva.ui.widget.BbvaTextInputLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25423p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f25424q0;

    public /* synthetic */ a(KeyEvent.Callback callback, int i10) {
        this.f25423p0 = i10;
        this.f25424q0 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f25423p0;
        KeyEvent.Callback callback = this.f25424q0;
        switch (i10) {
            case 0:
                OptionListActivity this$0 = (OptionListActivity) callback;
                OptionListActivity.Companion companion = OptionListActivity.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.onCLoseButtonClicked();
                break;
            case 1:
                BbvaTextInputLayout this$1 = (BbvaTextInputLayout) callback;
                int i11 = BbvaTextInputLayout.$stable;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.clearText();
                this$1.f37672r0.sendAccessibilityEvent(8);
                break;
            default:
                com.google.android.material.sidesheet.a aVar = (com.google.android.material.sidesheet.a) callback;
                if (aVar.f45362y0 && aVar.isShowing()) {
                    if (!aVar.F0) {
                        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        aVar.E0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        aVar.F0 = true;
                    }
                    if (aVar.E0) {
                        aVar.cancel();
                    }
                    break;
                }
                break;
        }
    }
}
