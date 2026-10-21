package com.bbva.glomohybrid.qrscanner.customenroll.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.qrscanner.customenroll.cells.channels.QrReaderChannels;
import com.bbva.glomohybrid.qrscanner.customenroll.model.QRReaderEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: compiled from: QrReaderViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/customenroll/viewmodel/QrReaderViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "position", "", "tabSelected", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/glomohybrid/base/models/common/Event;", "Lcom/bbva/glomohybrid/qrscanner/customenroll/model/QRReaderEvent;", "getEvent$QRScanner_mexicoRelease", "()Landroidx/lifecycle/LiveData;", "event", "", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Companion", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class QrReaderViewModel extends BaseViewModel implements KoinComponent {

    @NotNull
    public static final String ID = "qr-reader-view-model";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f34400q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Event<QRReaderEvent>> f34401r0 = new MutableLiveData<>();

    public QrReaderViewModel(@Nullable MessageDispatcher messageDispatcher) {
        this.f34400q0 = messageDispatcher;
    }

    @NotNull
    public final LiveData<Event<QRReaderEvent>> getEvent$QRScanner_mexicoRelease() {
        return this.f34401r0;
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

    public final void tabSelected(int position) {
        if (position == 1) {
            Channel<Void> deviceAccessesOcrReaderChannel = QrReaderChannels.INSTANCE.getDeviceAccessesOcrReaderChannel();
            MessageDispatcher messageDispatcher = this.f34400q0;
            if (messageDispatcher != null) {
                String name = deviceAccessesOcrReaderChannel.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                messageDispatcher.sendMessage(new WebMessage(name, null));
            }
            this.f34401r0.setValue(new Event<>(QRReaderEvent.Close.INSTANCE));
        }
    }
}
