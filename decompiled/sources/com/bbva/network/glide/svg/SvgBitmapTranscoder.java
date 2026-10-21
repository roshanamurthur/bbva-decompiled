package com.bbva.network.glide.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SvgBitmapTranscoder.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/network/glide/svg/SvgBitmapTranscoder;", "Lcom/bumptech/glide/load/resource/transcode/ResourceTranscoder;", "Lcom/caverock/androidsvg/SVG;", "Landroid/graphics/Bitmap;", "()V", "transcode", "Lcom/bumptech/glide/load/engine/Resource;", "toTranscode", "options", "Lcom/bumptech/glide/load/Options;", "network-image_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSvgBitmapTranscoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SvgBitmapTranscoder.kt\ncom/bbva/network/glide/svg/SvgBitmapTranscoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class SvgBitmapTranscoder implements ResourceTranscoder<SVG, Bitmap> {
    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @NotNull
    public Resource<Bitmap> transcode(@NotNull Resource<SVG> toTranscode, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(toTranscode, "toTranscode");
        Intrinsics.checkNotNullParameter(options, "options");
        SVG svg = toTranscode.get();
        Intrinsics.checkNotNullExpressionValue(svg, "toTranscode.get()");
        SVG svg2 = svg;
        svg2.setDocumentPreserveAspectRatio(PreserveAspectRatio.START);
        Integer numValueOf = Integer.valueOf((int) svg2.getDocumentWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : (int) (svg2.getDocumentViewBox().right - svg2.getDocumentViewBox().left);
        Integer numValueOf2 = Integer.valueOf((int) svg2.getDocumentHeight());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iIntValue2 = num != null ? num.intValue() : (int) (svg2.getDocumentViewBox().bottom - svg2.getDocumentViewBox().top);
        PictureDrawable pictureDrawable = new PictureDrawable(svg2.renderToPicture(iIntValue, iIntValue2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        new Canvas(bitmapCreateBitmap).drawPicture(pictureDrawable.getPicture());
        return new SimpleResource(bitmapCreateBitmap);
    }
}
