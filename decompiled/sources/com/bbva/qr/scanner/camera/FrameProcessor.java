package com.bbva.qr.scanner.camera;

import android.hardware.Camera;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.bbva.plugin.media.capture.util.Constants;
import com.bbva.qr.extension.LoggerKt;
import com.bbva.qr.scanner.detectors.Detector;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FrameProcessor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\u0010\u001e\u001a\u00060\u001dR\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\"\u0010\b\u001a\u00020\u00072\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\t\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/bbva/qr/scanner/camera/FrameProcessor;", "Ljava/lang/Runnable;", "", "", "Ljava/nio/ByteBuffer;", "buffers", TypedValues.AttributesType.S_FRAME, "", "nextFrame", "run", "", "u0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRotation", "()I", "setRotation", "(I)V", Key.ROTATION, "", "value", "v0", "Z", "getActive", "()Z", "setActive", "(Z)V", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "Landroid/hardware/Camera;", Constants.CAMERA_SRC, "Landroid/hardware/Camera$Size;", "previewSize", "Lcom/bbva/qr/scanner/detectors/Detector;", "detector", "<init>", "(Landroid/hardware/Camera;Landroid/hardware/Camera$Size;Lcom/bbva/qr/scanner/detectors/Detector;)V", "qr_release"}, k = 1, mv = {1, 8, 0})
public final class FrameProcessor implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Camera f36304p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Camera.Size f36305q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Detector f36306r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Object f36307s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public ByteBuffer f36308t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public int rotation;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public boolean active;

    public FrameProcessor(@NotNull Camera camera, @NotNull Camera.Size previewSize, @NotNull Detector detector) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(previewSize, "previewSize");
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f36304p0 = camera;
        this.f36305q0 = previewSize;
        this.f36306r0 = detector;
        this.f36307s0 = new Object();
        SystemClock.elapsedRealtime();
        this.active = true;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final int getRotation() {
        return this.rotation;
    }

    public final void nextFrame(@NotNull Map<byte[], ? extends ByteBuffer> buffers, @NotNull byte[] frame) {
        Intrinsics.checkNotNullParameter(buffers, "buffers");
        Intrinsics.checkNotNullParameter(frame, "frame");
        synchronized (this.f36307s0) {
            try {
                ByteBuffer byteBuffer = this.f36308t0;
                if (byteBuffer != null) {
                    this.f36304p0.addCallbackBuffer(byteBuffer.array());
                    this.f36308t0 = null;
                }
                if (buffers.containsKey(frame)) {
                    SystemClock.elapsedRealtime();
                    this.f36308t0 = buffers.get(frame);
                    this.f36307s0.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        ByteBuffer byteBuffer;
        while (true) {
            synchronized (this.f36307s0) {
                while (true) {
                    z10 = this.active;
                    if (!z10 || this.f36308t0 != null) {
                        break;
                    }
                    try {
                        this.f36307s0.wait();
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (!z10 || (byteBuffer = this.f36308t0) == null) {
                    break;
                    break;
                }
                Intrinsics.checkNotNull(byteBuffer);
                Camera.Size size = this.f36305q0;
                InputImage inputImageFromByteBuffer = InputImage.fromByteBuffer(byteBuffer, size.width, size.height, this.rotation, 17);
                Intrinsics.checkNotNullExpressionValue(inputImageFromByteBuffer, "fromByteBuffer(\n        …AT_NV21\n                )");
                ByteBuffer byteBuffer2 = this.f36308t0;
                Intrinsics.checkNotNull(byteBuffer2);
                this.f36308t0 = null;
                try {
                    try {
                        this.f36306r0.detect(inputImageFromByteBuffer);
                        this.f36304p0.addCallbackBuffer(byteBuffer2.array());
                    } catch (Throwable unused2) {
                        LoggerKt.logError$default("Error while trying to detect a QR", null, 2, null);
                        this.f36304p0.addCallbackBuffer(byteBuffer2.array());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    this.f36304p0.addCallbackBuffer(byteBuffer2.array());
                    throw th2;
                }
            }
        }
    }

    public final void setActive(boolean z10) {
        synchronized (this.f36307s0) {
            this.active = z10;
            this.f36307s0.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setRotation(int i10) {
        this.rotation = i10;
    }
}
