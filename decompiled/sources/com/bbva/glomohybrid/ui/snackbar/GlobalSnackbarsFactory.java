package com.bbva.glomohybrid.ui.snackbar;

import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import com.bbva.glomohybrid.ui.R;
import com.bbva.showinfo.model.SnackBarDuration;
import com.bbva.showinfo.model.SnackBarType;
import com.google.android.gms.wearable.WearableStatusCodes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GlobalSnackbarsFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/ui/snackbar/GlobalSnackbarsFactory;", "", "activityNotFoundSnackbar", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec$ResourcesSnackbar;", "networkNotAvailableSnackbar", "sessionExpirationSnackbar", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface GlobalSnackbarsFactory {

    /* JADX INFO: compiled from: GlobalSnackbarsFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static SnackbarSpec.ResourcesSnackbar activityNotFoundSnackbar(@NotNull GlobalSnackbarsFactory globalSnackbarsFactory) {
            return new SnackbarSpec.ResourcesSnackbar(R.id.snackbarActivityNotFoundError, R.string.half_modal_activity_not_found, SnackBarDuration.Indefinite.INSTANCE.getSnackBarValue(), SnackBarType.ERROR, null, 16, null);
        }

        @NotNull
        public static SnackbarSpec.ResourcesSnackbar networkNotAvailableSnackbar(@NotNull GlobalSnackbarsFactory globalSnackbarsFactory) {
            return new SnackbarSpec.ResourcesSnackbar(R.id.snackbarNetworkError, R.string.half_modal_no_connection, SnackBarDuration.Indefinite.INSTANCE.getSnackBarValue(), SnackBarType.ERROR, null, 16, null);
        }

        @NotNull
        public static SnackbarSpec.ResourcesSnackbar sessionExpirationSnackbar(@NotNull GlobalSnackbarsFactory globalSnackbarsFactory) {
            return new SnackbarSpec.ResourcesSnackbar(R.id.snackbarSessionExpiration, R.string.half_modal_expired_session_message, WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, SnackBarType.INFO, null, 16, null);
        }
    }

    @NotNull
    SnackbarSpec.ResourcesSnackbar activityNotFoundSnackbar();

    @NotNull
    SnackbarSpec.ResourcesSnackbar networkNotAvailableSnackbar();

    @NotNull
    SnackbarSpec.ResourcesSnackbar sessionExpirationSnackbar();
}
