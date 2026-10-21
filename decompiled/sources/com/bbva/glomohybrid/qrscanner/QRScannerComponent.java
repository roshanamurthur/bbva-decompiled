package com.bbva.glomohybrid.qrscanner;

import android.content.Intent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QRScannerComponent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/QRScannerComponent;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "()V", "getId", "", "showScanner", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/fragment/app/FragmentActivity;", "type", "Companion", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class QRScannerComponent extends ReactiveComponent {

    @NotNull
    public static final String ID = "qr-scanner-component";

    @NotNull
    public static final String QR_PAYMENT = "qr_payment";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Object> f34383p0 = new ActionSpec<>("camera-permission-rejected");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Object> f34384q0 = new ActionSpec<>("cancel-scanner");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Object> f34385r0 = new ActionSpec<>("close-scanner");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Object> f34386s0 = new ActionSpec<>("init-qr");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Object> f34387t0 = new ActionSpec<>("open-qr-info");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Object> f34388u0 = new ActionSpec<>("tabbar-button-pressed");

    @NotNull
    public static final ActionSpec<Object> v0 = new ActionSpec<>("scanner-result");

    /* JADX INFO: compiled from: QRScannerComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/QRScannerComponent$Companion;", "", "()V", "ACTION_CAMERA_PERMISSION_REJECTED", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getACTION_CAMERA_PERMISSION_REJECTED", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_CANCEL_SCANNER", "getACTION_CANCEL_SCANNER", "ACTION_CLOSE_SCANNER", "getACTION_CLOSE_SCANNER", "ACTION_INIT_QR", "getACTION_INIT_QR", "ACTION_OPEN_QR_INFO", "getACTION_OPEN_QR_INFO", "ACTION_QR_SCANNER_RESULT", "getACTION_QR_SCANNER_RESULT", "ACTION_TABBAR_BUTTON_PRESSED", "getACTION_TABBAR_BUTTON_PRESSED", "ID", "", "QR_PAYMENT", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Object> getACTION_CAMERA_PERMISSION_REJECTED() {
            return QRScannerComponent.f34383p0;
        }

        @NotNull
        public final ActionSpec<Object> getACTION_CANCEL_SCANNER() {
            return QRScannerComponent.f34384q0;
        }

        @NotNull
        public final ActionSpec<Object> getACTION_CLOSE_SCANNER() {
            return QRScannerComponent.f34385r0;
        }

        @NotNull
        public final ActionSpec<Object> getACTION_INIT_QR() {
            return QRScannerComponent.f34386s0;
        }

        @NotNull
        public final ActionSpec<Object> getACTION_OPEN_QR_INFO() {
            return QRScannerComponent.f34387t0;
        }

        @NotNull
        public final ActionSpec<Object> getACTION_QR_SCANNER_RESULT() {
            return QRScannerComponent.v0;
        }

        @NotNull
        public final ActionSpec<Object> getACTION_TABBAR_BUTTON_PRESSED() {
            return QRScannerComponent.f34388u0;
        }
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    public final void showScanner(@NotNull FragmentActivity activity, @NotNull String type) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(type, "type");
        Intent intent = new Intent(activity, (Class<?>) QRScannerActivity.class);
        intent.putExtra(QRScannerActivity.QR_TYPE_KEY, type);
        ContextCompat.startActivity(activity, intent, null);
    }
}
