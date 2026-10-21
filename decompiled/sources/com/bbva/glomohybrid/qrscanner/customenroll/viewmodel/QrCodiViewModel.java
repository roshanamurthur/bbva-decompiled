package com.bbva.glomohybrid.qrscanner.customenroll.viewmodel;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrNavigationViewModel;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QrCodiViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/customenroll/viewmodel/QrCodiViewModel;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel;", "dispatcher", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "handleGalleryResult", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class QrCodiViewModel extends QrNavigationViewModel {
    public QrCodiViewModel(@Nullable MessageDispatcher messageDispatcher) {
        super(messageDispatcher);
    }

    @Override // com.bbva.glomohybrid.qrscanner.viewmodel.GalleryViewModel
    @NotNull
    public String handleGalleryResult(@NotNull String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return l.replace$default(payload, "\"", "\\\"", false, 4, (Object) null);
    }
}
