package com.veridas.bidicode.dependencies;

import android.graphics.Bitmap;
import com.veridas.bidicode.entities.RawBidiCode;
import com.veridas.lib.entities.resources.bidicode.BidiType;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BidiCodeFinder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J6\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/veridas/bidicode/dependencies/BidiCodeFinder;", "", "search", "", "Lcom/veridas/bidicode/entities/RawBidiCode;", "bitmap", "Landroid/graphics/Bitmap;", "toBeFoundBidiCodeTypes", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "yuvData", "Ljava/nio/ByteBuffer;", "dataWidth", "", "dataHeight", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BidiCodeFinder {
    @Nullable
    List<RawBidiCode> search(@NotNull Bitmap bitmap, @NotNull List<? extends BidiType> toBeFoundBidiCodeTypes);

    @Nullable
    List<RawBidiCode> search(@NotNull ByteBuffer yuvData, int dataWidth, int dataHeight, @NotNull List<? extends BidiType> toBeFoundBidiCodeTypes);
}
