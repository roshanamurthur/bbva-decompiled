package com.bbva.network.glide.svg;

import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SvgDrawableTranscoder.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/network/glide/svg/SvgDrawableTranscoder;", "Lcom/bumptech/glide/load/resource/transcode/ResourceTranscoder;", "Lcom/caverock/androidsvg/SVG;", "Landroid/graphics/drawable/PictureDrawable;", "()V", "transcode", "Lcom/bumptech/glide/load/engine/Resource;", "toTranscode", "options", "Lcom/bumptech/glide/load/Options;", "network-image_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SvgDrawableTranscoder implements ResourceTranscoder<SVG, PictureDrawable> {
    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @NotNull
    public Resource<PictureDrawable> transcode(@NotNull Resource<SVG> toTranscode, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(toTranscode, "toTranscode");
        Intrinsics.checkNotNullParameter(options, "options");
        SVG svg = toTranscode.get();
        Intrinsics.checkNotNullExpressionValue(svg, "toTranscode.get()");
        return new SimpleResource(new PictureDrawable(svg.renderToPicture()));
    }
}
