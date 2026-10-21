package com.bbva.glomohybrid.qrscanner.customenroll.cells.channels;

import com.bbva.cellscore.channel.model.Channel;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QrReaderChannels.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/customenroll/cells/channels/QrReaderChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "Ljava/lang/Void;", "a", "Lcom/bbva/cellscore/channel/model/Channel;", "getDeviceAccessesOcrReaderChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "deviceAccessesOcrReaderChannel", "<init>", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class QrReaderChannels {

    @NotNull
    public static final QrReaderChannels INSTANCE = new QrReaderChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Channel<Void> deviceAccessesOcrReaderChannel = z1.b("device_access_read_card_ocr", "create(...)");

    @NotNull
    public final Channel<Void> getDeviceAccessesOcrReaderChannel() {
        return deviceAccessesOcrReaderChannel;
    }
}
