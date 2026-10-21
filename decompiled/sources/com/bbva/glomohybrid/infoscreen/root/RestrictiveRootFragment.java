package com.bbva.glomohybrid.infoscreen.root;

import androidx.core.app.ActivityCompat;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import kotlin.Metadata;

/* JADX INFO: compiled from: RestrictiveRootFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/root/RestrictiveRootFragment;", "Lcom/bbva/glomohybrid/infoscreen/root/RootFragment;", "()V", "onPositiveButtonClick", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RestrictiveRootFragment extends RootFragment {
    /* JADX WARN: Multi-variable type inference failed */
    public RestrictiveRootFragment() {
        super(InfoScreenType.RootRestrictedScreen.INSTANCE, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment
    public void onPositiveButtonClick() {
        ActivityCompat.finishAffinity(requireActivity());
    }
}
