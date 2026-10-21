package com.bbva.qr.scanner.camera;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CameraOptions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J?\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/bbva/qr/scanner/camera/CameraOptions;", "", "", "component1", "Lcom/bbva/qr/scanner/camera/Focus;", "component2", "Lcom/bbva/qr/scanner/camera/Flash;", "component3", "Lcom/bbva/qr/scanner/camera/FrameSize;", "component4", "Lcom/bbva/qr/scanner/camera/Facing;", "component5", "requestedFps", "focusMode", "flashMode", "previewSize", "facing", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "F", "getRequestedFps", "()F", "b", "Lcom/bbva/qr/scanner/camera/Focus;", "getFocusMode", "()Lcom/bbva/qr/scanner/camera/Focus;", "c", "Lcom/bbva/qr/scanner/camera/Flash;", "getFlashMode", "()Lcom/bbva/qr/scanner/camera/Flash;", "d", "Lcom/bbva/qr/scanner/camera/FrameSize;", "getPreviewSize", "()Lcom/bbva/qr/scanner/camera/FrameSize;", "e", "Lcom/bbva/qr/scanner/camera/Facing;", "getFacing", "()Lcom/bbva/qr/scanner/camera/Facing;", "<init>", "(FLcom/bbva/qr/scanner/camera/Focus;Lcom/bbva/qr/scanner/camera/Flash;Lcom/bbva/qr/scanner/camera/FrameSize;Lcom/bbva/qr/scanner/camera/Facing;)V", "qr_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CameraOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float requestedFps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Focus focusMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Flash flashMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FrameSize previewSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Facing facing;

    public CameraOptions(float f6, @Nullable Focus focus, @Nullable Flash flash, @NotNull FrameSize previewSize, @NotNull Facing facing) {
        Intrinsics.checkNotNullParameter(previewSize, "previewSize");
        Intrinsics.checkNotNullParameter(facing, "facing");
        this.requestedFps = f6;
        this.focusMode = focus;
        this.flashMode = flash;
        this.previewSize = previewSize;
        this.facing = facing;
    }

    public static /* synthetic */ CameraOptions copy$default(CameraOptions cameraOptions, float f6, Focus focus, Flash flash, FrameSize frameSize, Facing facing, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = cameraOptions.requestedFps;
        }
        if ((i10 & 2) != 0) {
            focus = cameraOptions.focusMode;
        }
        Focus focus2 = focus;
        if ((i10 & 4) != 0) {
            flash = cameraOptions.flashMode;
        }
        Flash flash2 = flash;
        if ((i10 & 8) != 0) {
            frameSize = cameraOptions.previewSize;
        }
        FrameSize frameSize2 = frameSize;
        if ((i10 & 16) != 0) {
            facing = cameraOptions.facing;
        }
        return cameraOptions.copy(f6, focus2, flash2, frameSize2, facing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getRequestedFps() {
        return this.requestedFps;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Focus getFocusMode() {
        return this.focusMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Flash getFlashMode() {
        return this.flashMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FrameSize getPreviewSize() {
        return this.previewSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Facing getFacing() {
        return this.facing;
    }

    @NotNull
    public final CameraOptions copy(float requestedFps, @Nullable Focus focusMode, @Nullable Flash flashMode, @NotNull FrameSize previewSize, @NotNull Facing facing) {
        Intrinsics.checkNotNullParameter(previewSize, "previewSize");
        Intrinsics.checkNotNullParameter(facing, "facing");
        return new CameraOptions(requestedFps, focusMode, flashMode, previewSize, facing);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraOptions)) {
            return false;
        }
        CameraOptions cameraOptions = (CameraOptions) other;
        return Float.compare(this.requestedFps, cameraOptions.requestedFps) == 0 && this.focusMode == cameraOptions.focusMode && this.flashMode == cameraOptions.flashMode && Intrinsics.areEqual(this.previewSize, cameraOptions.previewSize) && this.facing == cameraOptions.facing;
    }

    @NotNull
    public final Facing getFacing() {
        return this.facing;
    }

    @Nullable
    public final Flash getFlashMode() {
        return this.flashMode;
    }

    @Nullable
    public final Focus getFocusMode() {
        return this.focusMode;
    }

    @NotNull
    public final FrameSize getPreviewSize() {
        return this.previewSize;
    }

    public final float getRequestedFps() {
        return this.requestedFps;
    }

    public int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.requestedFps) * 31;
        Focus focus = this.focusMode;
        int iHashCode = (iFloatToIntBits + (focus == null ? 0 : focus.hashCode())) * 31;
        Flash flash = this.flashMode;
        return this.facing.hashCode() + ((this.previewSize.hashCode() + ((iHashCode + (flash != null ? flash.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CameraOptions(requestedFps=" + this.requestedFps + ", focusMode=" + this.focusMode + ", flashMode=" + this.flashMode + ", previewSize=" + this.previewSize + ", facing=" + this.facing + ")";
    }
}
