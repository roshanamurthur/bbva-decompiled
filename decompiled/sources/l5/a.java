package l5;

import androidx.lifecycle.Observer;
import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LoaderSpinnerComponent.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a<T> implements Observer<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoaderSpinnerComponent f83092a;

    public a(LoaderSpinnerComponent loaderSpinnerComponent) {
        this.f83092a = loaderSpinnerComponent;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkExpressionValueIsNotNull(it, "it");
        boolean zBooleanValue = it.booleanValue();
        LoaderSpinnerComponent loaderSpinnerComponent = this.f83092a;
        if (zBooleanValue) {
            loaderSpinnerComponent.showSpinner();
        } else {
            loaderSpinnerComponent.hideSpinner();
        }
    }
}
