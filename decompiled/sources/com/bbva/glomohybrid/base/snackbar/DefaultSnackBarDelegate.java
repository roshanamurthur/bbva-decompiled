package com.bbva.glomohybrid.base.snackbar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnackBarDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/snackbar/DefaultSnackBarDelegate;", "Lcom/bbva/glomohybrid/base/snackbar/SnackBarDelegate;", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "snackBarObserver", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "snackbarSpec", "", "showSnackBar", "hideSnackBar", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultSnackBarDelegate implements SnackBarDelegate {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<SnackbarState> f31566p0 = new MutableLiveData<>();

    @Override // com.bbva.glomohybrid.base.snackbar.SnackBarDelegate
    public void hideSnackBar() {
        this.f31566p0.setValue(SnackbarState.Hide.INSTANCE);
    }

    @Override // com.bbva.glomohybrid.base.snackbar.SnackBarDelegate
    public void showSnackBar(@NotNull SnackbarSpec snackbarSpec) {
        Intrinsics.checkNotNullParameter(snackbarSpec, "snackbarSpec");
        this.f31566p0.setValue(new SnackbarState.Show(snackbarSpec));
    }

    @Override // com.bbva.glomohybrid.base.snackbar.SnackBarDelegate
    @NotNull
    public LiveData<SnackbarState> snackBarObserver() {
        return this.f31566p0;
    }
}
