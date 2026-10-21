package com.bbva.glomohybrid.qrscanner.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.qrscanner.channels.QRScannerChannel;
import com.bbva.glomohybrid.qrscanner.interfaces.QrNavigationBehaviour;
import com.bbva.glomohybrid.qrscanner.model.QROperationConstants;
import com.bbva.glomohybrid.qrscanner.model.QrGalleryContent;
import com.bbva.glomohybrid.qrscanner.model.QrGalleryError;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.qr.model.response.BarcodeResult;
import com.bbva.qr.model.response.NonDetectableCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: compiled from: GalleryViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001'B\u0011\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0004R&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/GalleryViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/bbva/glomohybrid/qrscanner/interfaces/QrNavigationBehaviour;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "intent", "", "setIntent", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "handleGalleryResult", "sendCancelGalleryMessage", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bbva/glomohybrid/base/models/common/Event;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Event;", "r0", "Landroidx/lifecycle/MutableLiveData;", "get_event", "()Landroidx/lifecycle/MutableLiveData;", "_event", "", "s0", "Z", "getGalleryWasOpened", "()Z", "setGalleryWasOpened", "(Z)V", "galleryWasOpened", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "event", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Companion", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class GalleryViewModel extends BaseViewModel implements KoinComponent, QrNavigationBehaviour {

    @NotNull
    public static final String ID = "gallery-view-model";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f34453q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Event<QrContract.Event>> _event = new MutableLiveData<>();

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public boolean galleryWasOpened;

    public GalleryViewModel(@Nullable MessageDispatcher messageDispatcher) {
        this.f34453q0 = messageDispatcher;
    }

    @Override // com.bbva.glomohybrid.qrscanner.interfaces.QrNavigationBehaviour
    @NotNull
    public LiveData<Event<QrContract.Event>> getEvent() {
        return this._event;
    }

    public final boolean getGalleryWasOpened() {
        return this.galleryWasOpened;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return ID;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Event<QrContract.Event>> get_event() {
        return this._event;
    }

    @NotNull
    public String handleGalleryResult(@NotNull String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return payload;
    }

    public final void sendCancelGalleryMessage() {
        MessageDispatcher messageDispatcher = this.f34453q0;
        if (messageDispatcher != null) {
            messageDispatcher.sendMessage(QRScannerChannel.CANCEL_QR_FROM_GALLERY, Integer.valueOf(QROperationConstants.INSTANCE.getCODE_CANCEL()));
        }
    }

    public final void setGalleryWasOpened(boolean z10) {
        this.galleryWasOpened = z10;
    }

    @Override // com.bbva.glomohybrid.qrscanner.interfaces.QrNavigationBehaviour
    public void setIntent(@NotNull QrContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof QrContract.Intent.GalleryBarcodeResult) {
            Result<BarcodeResult> barcodeResult = ((QrContract.Intent.GalleryBarcodeResult) intent).getBarcodeResult();
            boolean z10 = barcodeResult instanceof Result.Success;
            MessageDispatcher messageDispatcher = this.f34453q0;
            if (z10) {
                QrGalleryContent qrGalleryContent = new QrGalleryContent(handleGalleryResult(((BarcodeResult) ((Result.Success) barcodeResult).getValue()).getPayload()));
                Channel<String> sucessQRScannerGalleryChannel = QRScannerChannel.INSTANCE.getSucessQRScannerGalleryChannel();
                if (messageDispatcher != null) {
                    String name = sucessQRScannerGalleryChannel.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    messageDispatcher.sendMessage(name, qrGalleryContent);
                }
            } else if (barcodeResult instanceof Result.Error) {
                if (((Result.Error) barcodeResult).getException() instanceof NonDetectableCode) {
                    QROperationConstants qROperationConstants = QROperationConstants.INSTANCE;
                    QrGalleryError qrGalleryError = new QrGalleryError(qROperationConstants.getNO_DETECTABLE_ERROR(), qROperationConstants.getCODE_NO_DETECTABLE_ERROR());
                    Channel<String> errorQRScannerGalleryChannel = QRScannerChannel.INSTANCE.getErrorQRScannerGalleryChannel();
                    if (messageDispatcher != null) {
                        String name2 = errorQRScannerGalleryChannel.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        messageDispatcher.sendMessage(name2, qrGalleryError);
                    }
                } else {
                    QROperationConstants qROperationConstants2 = QROperationConstants.INSTANCE;
                    QrGalleryError qrGalleryError2 = new QrGalleryError(qROperationConstants2.getDEFAULT_ERROR(), qROperationConstants2.getCODE_DEFAULT_ERROR());
                    Channel<String> errorQRScannerGalleryChannel2 = QRScannerChannel.INSTANCE.getErrorQRScannerGalleryChannel();
                    if (messageDispatcher != null) {
                        String name3 = errorQRScannerGalleryChannel2.getName();
                        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                        messageDispatcher.sendMessage(name3, qrGalleryError2);
                    }
                }
            }
            this._event.postValue(new Event<>(QrContract.Event.Close.INSTANCE));
        }
    }
}
