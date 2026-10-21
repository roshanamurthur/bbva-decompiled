package com.bbva.glomohybrid.qrscanner.viewmodel;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.base.models.common.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QrToolbarViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrToolbarViewModel;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/GalleryViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "intent", "", "setIntent", "", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Companion", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class QrToolbarViewModel extends GalleryViewModel {

    @NotNull
    public static final String ID = "qr-toolbar-view-model";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f34459t0;

    public QrToolbarViewModel(@Nullable MessageDispatcher messageDispatcher) {
        super(messageDispatcher);
        this.f34459t0 = messageDispatcher;
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
        if (intent instanceof QrContract.Intent.MainButtonClick) {
            get_event().setValue(new Event<>(QrContract.Event.Gallery.INSTANCE));
            setGalleryWasOpened(true);
        } else if (intent instanceof QrContract.Intent.CloseButtonClick) {
            if (getGalleryWasOpened()) {
                sendCancelGalleryMessage();
            }
            get_event().setValue(new Event<>(QrContract.Event.Close.INSTANCE));
        }
    }
}
