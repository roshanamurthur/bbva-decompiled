package com.bbva.glomohybrid.qrscanner.viewmodel;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.qrscanner.channels.QRScannerChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QrNavigationViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eB\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/GalleryViewModel;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "intent", "", "setIntent", "", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Companion", "ChannelEvent", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class QrNavigationViewModel extends GalleryViewModel {

    @NotNull
    public static final String ID = "qr-navigation-view-model";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f34457t0;

    /* JADX INFO: compiled from: QrNavigationViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "CloseButton", "LeftButton", "MiddleButton", "RightButton", "ToolbarButton", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$CloseButton;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$LeftButton;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$MiddleButton;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$RightButton;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$ToolbarButton;", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static abstract class ChannelEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: compiled from: QrNavigationViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$CloseButton;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CloseButton extends ChannelEvent {

            @NotNull
            public static final CloseButton INSTANCE = new CloseButton();

            public CloseButton() {
                super("qr-close-button", null);
            }
        }

        /* JADX INFO: compiled from: QrNavigationViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$LeftButton;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LeftButton extends ChannelEvent {

            @NotNull
            public static final LeftButton INSTANCE = new LeftButton();

            public LeftButton() {
                super("qr-left-button", null);
            }
        }

        /* JADX INFO: compiled from: QrNavigationViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$MiddleButton;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MiddleButton extends ChannelEvent {

            @NotNull
            public static final MiddleButton INSTANCE = new MiddleButton();

            public MiddleButton() {
                super("qr-middle-button", null);
            }
        }

        /* JADX INFO: compiled from: QrNavigationViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$RightButton;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RightButton extends ChannelEvent {

            @NotNull
            public static final RightButton INSTANCE = new RightButton();

            public RightButton() {
                super("qr-right-button", null);
            }
        }

        /* JADX INFO: compiled from: QrNavigationViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent$ToolbarButton;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel$ChannelEvent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ToolbarButton extends ChannelEvent {

            @NotNull
            public static final ToolbarButton INSTANCE = new ToolbarButton();

            public ToolbarButton() {
                super("qr-toolbar-button", null);
            }
        }

        public ChannelEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this.id = str;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }
    }

    public QrNavigationViewModel(@Nullable MessageDispatcher messageDispatcher) {
        super(messageDispatcher);
        this.f34457t0 = messageDispatcher;
    }

    public final void a() {
        if (getGalleryWasOpened()) {
            sendCancelGalleryMessage();
        }
        get_event().postValue(new Event<>(QrContract.Event.Close.INSTANCE));
    }

    public final void b(String str) {
        MessageDispatcher messageDispatcher = this.f34457t0;
        if (messageDispatcher != null) {
            messageDispatcher.sendMessage(new WebMessage(QRScannerChannel.QR_SCANNER_CHANNEL_NAME, str));
        }
    }

    @Override // com.bbva.glomohybrid.qrscanner.viewmodel.GalleryViewModel, com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return ID;
    }

    @Override // com.bbva.glomohybrid.qrscanner.viewmodel.GalleryViewModel, com.bbva.glomohybrid.qrscanner.interfaces.QrNavigationBehaviour
    public void setIntent(@NotNull QrContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.setIntent(intent);
        if (intent instanceof QrContract.Intent.CloseButtonClick) {
            b(ChannelEvent.CloseButton.INSTANCE.getId());
            a();
            return;
        }
        if (intent instanceof QrContract.Intent.ToolbarButtonClick) {
            b(ChannelEvent.ToolbarButton.INSTANCE.getId());
            a();
            return;
        }
        if (intent instanceof QrContract.Intent.LeftButtonClick) {
            b(ChannelEvent.LeftButton.INSTANCE.getId());
            a();
            return;
        }
        if (intent instanceof QrContract.Intent.MainButtonClick) {
            get_event().postValue(new Event<>(QrContract.Event.Gallery.INSTANCE));
            setGalleryWasOpened(true);
            return;
        }
        if (intent instanceof QrContract.Intent.RightButtonClick) {
            b(ChannelEvent.RightButton.INSTANCE.getId());
            a();
        } else if (intent instanceof QrContract.Intent.MiddleButtonClick) {
            b(ChannelEvent.MiddleButton.INSTANCE.getId());
            a();
        } else if (intent instanceof QrContract.Intent.CloseGalleryClick) {
            sendCancelGalleryMessage();
        }
    }
}
