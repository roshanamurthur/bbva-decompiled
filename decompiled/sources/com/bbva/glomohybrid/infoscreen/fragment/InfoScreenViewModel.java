package com.bbva.glomohybrid.infoscreen.fragment;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;

/* JADX INFO: compiled from: InfoScreenViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenDialogActions;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class InfoScreenViewModel extends ViewModel implements InfoScreenDialogActions {
    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogActions
    public void onAcceptButtonClick() {
        InfoScreenDialogActions.DefaultImpls.onAcceptButtonClick(this);
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogActions
    public void onCancelButtonClick() {
        InfoScreenDialogActions.DefaultImpls.onCancelButtonClick(this);
    }
}
