package com.bbva.component.ui.loader;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoaderSpinnerViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bbva/component/ui/loader/LoaderSpinnerViewModel;", "Lcom/bbva/cells/component/kit/ui/viewmodel/ViewModel;", "", "value", "", "showSpinner", "Landroidx/lifecycle/LiveData;", "getShowSpinner", "()Landroidx/lifecycle/LiveData;", "Landroid/app/Application;", Constants.APPLICATION, "<init>", "(Landroid/app/Application;)V", "component-ui-loader-spinner_release"}, k = 1, mv = {1, 4, 0})
public final class LoaderSpinnerViewModel extends ViewModel {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final MutableLiveData<Boolean> f28430r0;

    public LoaderSpinnerViewModel(@NotNull Application application) {
        super(application);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        this.f28430r0 = mutableLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getShowSpinner() {
        return this.f28430r0;
    }

    public final void showSpinner(boolean value) {
        this.f28430r0.setValue(Boolean.valueOf(value));
    }
}
