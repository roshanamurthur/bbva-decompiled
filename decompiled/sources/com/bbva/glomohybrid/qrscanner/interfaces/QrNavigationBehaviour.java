package com.bbva.glomohybrid.qrscanner.interfaces;

import androidx.lifecycle.LiveData;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QrNavigationBehaviour.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/interfaces/QrNavigationBehaviour;", "", "event", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/glomohybrid/base/models/common/Event;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Event;", "getEvent", "()Landroidx/lifecycle/LiveData;", "setIntent", "", "intent", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface QrNavigationBehaviour {
    @NotNull
    LiveData<Event<QrContract.Event>> getEvent();

    void setIntent(@NotNull QrContract.Intent intent);
}
