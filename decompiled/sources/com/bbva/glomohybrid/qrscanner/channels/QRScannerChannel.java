package com.bbva.glomohybrid.qrscanner.channels;

import androidx.databinding.f;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QRScannerChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/channels/QRScannerChannel;", "", "", "QR_SCANNER_CHANNEL_NAME", "Ljava/lang/String;", "CANCEL_QR_SCANNER_CHANNEL", "QR_CAMERA_PERMISSION_REJECTED_CHANNEL", "QR_TABBAR_BUTTON_CHANNEL", "QR_READER_INIT_CHANNEL", "QR_READER_RESULT_CHANNEL", "QR_READER_SHOW_INFO_CHANNEL", "CANCEL_QR_FROM_GALLERY", "Lcom/bbva/cellscore/channel/model/Channel;", "a", "Lkotlin/Lazy;", "getOpenQRScannerChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "openQRScannerChannel", "b", "getSucessQRScannerGalleryChannel", "sucessQRScannerGalleryChannel", "c", "getErrorQRScannerGalleryChannel", "errorQRScannerGalleryChannel", "<init>", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class QRScannerChannel {

    @NotNull
    public static final String CANCEL_QR_FROM_GALLERY = "global_cancel_qr_from_gallery";

    @NotNull
    public static final String CANCEL_QR_SCANNER_CHANNEL = "qr_processor_close_button_pressed";

    @NotNull
    public static final String QR_CAMERA_PERMISSION_REJECTED_CHANNEL = "qr_reader_camera_permission_request_error";

    @NotNull
    public static final String QR_READER_INIT_CHANNEL = "qr_reader_init_manager";

    @NotNull
    public static final String QR_READER_RESULT_CHANNEL = "qr_reader_result";

    @NotNull
    public static final String QR_READER_SHOW_INFO_CHANNEL = "qr_processor_info_button_pressed";

    @NotNull
    public static final String QR_SCANNER_CHANNEL_NAME = "qr_scanner_action_buttons";

    @NotNull
    public static final String QR_TABBAR_BUTTON_CHANNEL = "qr_processor_tabbar_button_pressed";

    @NotNull
    public static final QRScannerChannel INSTANCE = new QRScannerChannel();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy openQRScannerChannel = LazyKt__LazyJVMKt.lazy(b.f34397p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy sucessQRScannerGalleryChannel = LazyKt__LazyJVMKt.lazy(c.f34398p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy errorQRScannerGalleryChannel = LazyKt__LazyJVMKt.lazy(a.f34396p0);

    /* JADX INFO: compiled from: QRScannerChannel.kt */
    public static final class a extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34396p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return f.d("global_error_qr_from_gallery");
        }
    }

    /* JADX INFO: compiled from: QRScannerChannel.kt */
    public static final class b extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f34397p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return new WebChannel.Builder("mobile_open_qr_scanner").toNativeObject(new androidx.emoji2.text.flatbuffer.a()).create();
        }
    }

    /* JADX INFO: compiled from: QRScannerChannel.kt */
    public static final class c extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f34398p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return f.d("global_qr_from_gallery");
        }
    }

    @NotNull
    public final Channel<String> getErrorQRScannerGalleryChannel() {
        Object value = errorQRScannerGalleryChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<String> getOpenQRScannerChannel() {
        Object value = openQRScannerChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<String> getSucessQRScannerGalleryChannel() {
        Object value = sucessQRScannerGalleryChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }
}
