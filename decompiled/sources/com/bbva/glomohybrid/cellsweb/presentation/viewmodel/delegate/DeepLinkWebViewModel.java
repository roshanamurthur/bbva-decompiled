package com.bbva.glomohybrid.cellsweb.presentation.viewmodel.delegate;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeepLinkWebViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\bH&J\b\u0010\u0017\u001a\u00020\bH&J\b\u0010\u0018\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeepLinkWebViewModel;", "", "deeplinkEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/bbva/glomohybrid/cellsweb/presentation/viewmodel/delegate/DeeplinkWebContract$Event;", "getDeeplinkEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "configDeeplinkObservers", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "handleGemaLink", DeepLinkListenerAdapter.Constants.DEEP_LINK, "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "handlePrivateDeepLink", "handlePrivateShortcut", "shortcut", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "handlePublicDeepLink", "handleQRLink", "qr", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "notifyDeepLink", "notifyGemaDeeplink", "notifyShortcut", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DeepLinkWebViewModel {
    void configDeeplinkObservers(@NotNull CoroutineScope scope);

    @NotNull
    SharedFlow<DeeplinkWebContract.Event> getDeeplinkEvents();

    void handleGemaLink(@NotNull DeepLinkModel deepLink);

    void handlePrivateDeepLink(@NotNull DeepLinkModel deepLink);

    void handlePrivateShortcut(@NotNull ShortcutModel shortcut);

    void handlePublicDeepLink(@NotNull DeepLinkModel deepLink);

    void handleQRLink(@NotNull QRPayload qr);

    void notifyDeepLink();

    void notifyGemaDeeplink();

    void notifyShortcut();
}
