package com.bbva.network.glide.extension;

import android.graphics.Bitmap;
import android.graphics.drawable.PictureDrawable;
import com.bbva.network.glide.svg.BitmapInputStreamDecoder;
import com.bbva.network.glide.svg.SvgBitmapTranscoder;
import com.bbva.network.glide.svg.SvgDrawableTranscoder;
import com.bbva.network.glide.svg.SvgInputStreamDecoder;
import com.bumptech.glide.Registry;
import com.caverock.androidsvg.SVG;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Register.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"svg", "Lcom/bumptech/glide/Registry;", "network-image_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RegisterKt {
    @NotNull
    public static final Registry svg(@NotNull Registry registry) {
        Intrinsics.checkNotNullParameter(registry, "<this>");
        Registry registryAppend = registry.register(SVG.class, PictureDrawable.class, new SvgDrawableTranscoder()).register(SVG.class, Bitmap.class, new SvgBitmapTranscoder()).append(InputStream.class, Bitmap.class, new BitmapInputStreamDecoder()).append(InputStream.class, SVG.class, new SvgInputStreamDecoder());
        Intrinsics.checkNotNullExpressionValue(registryAppend, "register(SVG::class.java… SvgInputStreamDecoder())");
        return registryAppend;
    }
}
