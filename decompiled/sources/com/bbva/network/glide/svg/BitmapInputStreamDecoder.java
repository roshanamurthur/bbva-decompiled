package com.bbva.network.glide.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BitmapInputStreamDecoder.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/network/glide/svg/BitmapInputStreamDecoder;", "Lcom/bumptech/glide/load/ResourceDecoder;", "Ljava/io/InputStream;", "Landroid/graphics/Bitmap;", "source", "Lcom/bumptech/glide/load/Options;", "options", "", "handles", "", "width", "height", "Lcom/bumptech/glide/load/engine/Resource;", "decode", "<init>", "()V", "network-image_release"}, k = 1, mv = {1, 8, 0})
public final class BitmapInputStreamDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SvgInputStreamDecoder f35092a = new SvgInputStreamDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SvgBitmapTranscoder f35093b = new SvgBitmapTranscoder();

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NotNull InputStream source, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @NotNull
    public Resource<Bitmap> decode(@NotNull InputStream source, int width, int height, @NotNull Options options) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            return new SimpleResource(this.f35093b.transcode(this.f35092a.decode(source, width, height, options), options).get());
        } catch (SVGParseException unused) {
            source.reset();
            return new SimpleResource(BitmapFactory.decodeStream(source));
        }
    }
}
