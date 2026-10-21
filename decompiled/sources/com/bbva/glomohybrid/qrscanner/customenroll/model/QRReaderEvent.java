package com.bbva.glomohybrid.qrscanner.customenroll.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QRReaderEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/customenroll/model/QRReaderEvent;", "", "()V", "Close", "Lcom/bbva/glomohybrid/qrscanner/customenroll/model/QRReaderEvent$Close;", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class QRReaderEvent {

    /* JADX INFO: compiled from: QRReaderEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/customenroll/model/QRReaderEvent$Close;", "Lcom/bbva/glomohybrid/qrscanner/customenroll/model/QRReaderEvent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close extends QRReaderEvent {

        @NotNull
        public static final Close INSTANCE = new Close();

        public Close() {
            super(null);
        }
    }

    public QRReaderEvent() {
    }

    public /* synthetic */ QRReaderEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
