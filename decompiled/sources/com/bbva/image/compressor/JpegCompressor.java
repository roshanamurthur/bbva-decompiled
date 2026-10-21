package com.bbva.image.compressor;

import android.graphics.Bitmap;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JpegCompressor.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/bbva/image/compressor/JpegCompressor;", "Lcom/bbva/image/compressor/ImageCompressor;", "Landroid/graphics/Bitmap;", "bitmap", "Ljava/io/File;", "target", "", "compress", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_QUALITY, "<init>", "(I)V", "Companion", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class JpegCompressor extends ImageCompressor {

    @NotNull
    public static final String ID = "jpeg";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34879b;

    public JpegCompressor() {
        this(0, 1, null);
    }

    @Override // com.bbva.image.compressor.ImageCompressor
    public void compress(@NotNull Bitmap bitmap, @NotNull File target) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(target, "target");
        internalCompress(Bitmap.CompressFormat.JPEG, bitmap, target, this.f34879b);
    }

    @Override // com.bbva.image.compressor.ImageCompressor
    @NotNull
    public String getId() {
        return this.id;
    }

    public JpegCompressor(int i10) {
        this.f34879b = i10;
        this.id = ID;
    }

    public /* synthetic */ JpegCompressor(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 100 : i10);
    }
}
