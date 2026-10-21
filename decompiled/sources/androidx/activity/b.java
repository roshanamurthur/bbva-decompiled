package androidx.activity;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bbva.nativesettings.common.Constants;
import com.google.android.material.search.w;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.mypinpad.tsdk.isolation.ty;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f378p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f379q0;

    public /* synthetic */ b(Object obj, int i10) {
        this.f378p0 = i10;
        this.f379q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws TerminalException {
        int i10 = this.f378p0;
        Object obj = this.f379q0;
        switch (i10) {
            case 0:
                ((ComponentActivity) obj).invalidateMenu();
                break;
            case 1:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService(Constants.INPUT_METHOD)).showSoftInput(view, 0);
                break;
            case 2:
                w wVar = (w) obj;
                AnimatorSet animatorSetD = wVar.d(true);
                animatorSetD.addListener(new com.google.android.material.search.s(wVar));
                animatorSetD.start();
                break;
            default:
                ty.setOnFocusChangeListener(new Object[]{(ty) obj}, -1397233336, 1397233340, (int) System.currentTimeMillis());
                break;
        }
    }
}
