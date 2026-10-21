package com.bbva.glomohybrid.base.snackbar;

import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnackBarDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/base/snackbar/SnackBarDelegate;", "", "hideSnackBar", "", "showSnackBar", "snackbarSpec", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "snackBarObserver", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SnackBarDelegate {
    void hideSnackBar();

    void showSnackBar(@NotNull SnackbarSpec snackbarSpec);

    @NotNull
    LiveData<SnackbarState> snackBarObserver();

    /* JADX INFO: compiled from: SnackBarDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void hideSnackBar(@NotNull SnackBarDelegate snackBarDelegate) {
        }
    }
}
