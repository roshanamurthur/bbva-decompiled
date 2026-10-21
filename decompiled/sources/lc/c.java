package lc;

import android.view.View;
import android.widget.EditText;
import com.bbva.ui.widget.BbvaAutoCompleteTextInputLayout;
import com.facetec.sdk.bz;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f83178c;

    public /* synthetic */ c(Object obj, Object obj2, int i10) {
        this.f83176a = i10;
        this.f83177b = obj;
        this.f83178c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.f83176a;
        Object obj = this.f83178c;
        Object obj2 = this.f83177b;
        switch (i10) {
            case 0:
                BbvaAutoCompleteTextInputLayout this$0 = (BbvaAutoCompleteTextInputLayout) obj2;
                Function1 listener = (Function1) obj;
                int i11 = BbvaAutoCompleteTextInputLayout.$stable;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(listener, "$listener");
                this$0.a();
                listener.invoke(Boolean.valueOf(z10));
                break;
            default:
                ((bz) obj2).aT_((EditText) obj, view, z10);
                break;
        }
    }
}
