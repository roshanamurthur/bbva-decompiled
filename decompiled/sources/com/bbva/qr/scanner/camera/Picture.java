package com.bbva.qr.scanner.camera;

import android.hardware.Camera;
import com.bbva.document.scanner.plugin.command.PreviewDocumentCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CameraOptions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0006\u001a\u00060\u0002R\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0018\u00010\u0002R\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0004\u001a\u00060\u0002R\u00020\u0003HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0018\u00010\u0002R\u00020\u0003HÆ\u0003J'\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0002R\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0018\u00010\u0002R\u00020\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0006\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/bbva/qr/scanner/camera/Picture;", "", "Landroid/hardware/Camera$Size;", "Landroid/hardware/Camera;", "component1", "component2", PreviewDocumentCommand.ID, "content", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroid/hardware/Camera$Size;", "getPreview", "()Landroid/hardware/Camera$Size;", "b", "getContent", "<init>", "(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)V", "qr_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Picture {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Camera.Size preview;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Camera.Size content;

    public Picture(@NotNull Camera.Size preview, @Nullable Camera.Size size) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        this.preview = preview;
        this.content = size;
    }

    public static /* synthetic */ Picture copy$default(Picture picture, Camera.Size size, Camera.Size size2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            size = picture.preview;
        }
        if ((i10 & 2) != 0) {
            size2 = picture.content;
        }
        return picture.copy(size, size2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Camera.Size getPreview() {
        return this.preview;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Camera.Size getContent() {
        return this.content;
    }

    @NotNull
    public final Picture copy(@NotNull Camera.Size preview, @Nullable Camera.Size content) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        return new Picture(preview, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Picture)) {
            return false;
        }
        Picture picture = (Picture) other;
        return Intrinsics.areEqual(this.preview, picture.preview) && Intrinsics.areEqual(this.content, picture.content);
    }

    @Nullable
    public final Camera.Size getContent() {
        return this.content;
    }

    @NotNull
    public final Camera.Size getPreview() {
        return this.preview;
    }

    public int hashCode() {
        int iHashCode = this.preview.hashCode() * 31;
        Camera.Size size = this.content;
        return iHashCode + (size == null ? 0 : size.hashCode());
    }

    @NotNull
    public String toString() {
        return "Picture(preview=" + this.preview + ", content=" + this.content + ")";
    }

    public /* synthetic */ Picture(Camera.Size size, Camera.Size size2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(size, (i10 & 2) != 0 ? null : size2);
    }
}
