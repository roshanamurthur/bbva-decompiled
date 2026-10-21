package com.bbva.glomohybrid.qrscanner.viewmodel;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.qr.model.response.BarcodeResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QrContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract;", "", "()V", "Event", "Intent", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class QrContract {

    /* JADX INFO: compiled from: QrContract.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Event;", "", "()V", "Close", "Gallery", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Event$Close;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Event$Gallery;", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Event$Close;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Event;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Close extends Event {

            @NotNull
            public static final Close INSTANCE = new Close();

            public Close() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Event$Gallery;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Event;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Gallery extends Event {

            @NotNull
            public static final Gallery INSTANCE = new Gallery();

            public Gallery() {
                super(null);
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: QrContract.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "", "()V", "CloseButtonClick", "CloseGalleryClick", "GalleryBarcodeResult", "LeftButtonClick", "MainButtonClick", "MiddleButtonClick", "RightButtonClick", "ToolbarButtonClick", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$CloseButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$CloseGalleryClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$GalleryBarcodeResult;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$LeftButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$MainButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$MiddleButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$RightButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$ToolbarButtonClick;", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$CloseButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CloseButtonClick extends Intent {

            @NotNull
            public static final CloseButtonClick INSTANCE = new CloseButtonClick();

            public CloseButtonClick() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$CloseGalleryClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CloseGalleryClick extends Intent {

            @NotNull
            public static final CloseGalleryClick INSTANCE = new CloseGalleryClick();

            public CloseGalleryClick() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$GalleryBarcodeResult;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/qr/model/response/BarcodeResult;", "component1", "barcodeResult", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobile/help/kit/result/Result;", "getBarcodeResult", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;)V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class GalleryBarcodeResult extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Result<BarcodeResult> barcodeResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GalleryBarcodeResult(@NotNull Result<BarcodeResult> barcodeResult) {
                super(null);
                Intrinsics.checkNotNullParameter(barcodeResult, "barcodeResult");
                this.barcodeResult = barcodeResult;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GalleryBarcodeResult copy$default(GalleryBarcodeResult galleryBarcodeResult, Result result, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    result = galleryBarcodeResult.barcodeResult;
                }
                return galleryBarcodeResult.copy(result);
            }

            @NotNull
            public final Result<BarcodeResult> component1() {
                return this.barcodeResult;
            }

            @NotNull
            public final GalleryBarcodeResult copy(@NotNull Result<BarcodeResult> barcodeResult) {
                Intrinsics.checkNotNullParameter(barcodeResult, "barcodeResult");
                return new GalleryBarcodeResult(barcodeResult);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GalleryBarcodeResult) && Intrinsics.areEqual(this.barcodeResult, ((GalleryBarcodeResult) other).barcodeResult);
            }

            @NotNull
            public final Result<BarcodeResult> getBarcodeResult() {
                return this.barcodeResult;
            }

            public int hashCode() {
                return this.barcodeResult.hashCode();
            }

            @NotNull
            public String toString() {
                return "GalleryBarcodeResult(barcodeResult=" + this.barcodeResult + ")";
            }
        }

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$LeftButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LeftButtonClick extends Intent {

            @NotNull
            public static final LeftButtonClick INSTANCE = new LeftButtonClick();

            public LeftButtonClick() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$MainButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MainButtonClick extends Intent {

            @NotNull
            public static final MainButtonClick INSTANCE = new MainButtonClick();

            public MainButtonClick() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$MiddleButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MiddleButtonClick extends Intent {

            @NotNull
            public static final MiddleButtonClick INSTANCE = new MiddleButtonClick();

            public MiddleButtonClick() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$RightButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RightButtonClick extends Intent {

            @NotNull
            public static final RightButtonClick INSTANCE = new RightButtonClick();

            public RightButtonClick() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: QrContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent$ToolbarButtonClick;", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrContract$Intent;", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ToolbarButtonClick extends Intent {

            @NotNull
            public static final ToolbarButtonClick INSTANCE = new ToolbarButtonClick();

            public ToolbarButtonClick() {
                super(null);
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
