package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class StreamGifDecoder implements ResourceDecoder<InputStream, GifDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f38680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceDecoder<ByteBuffer, GifDrawable> f38681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayPool f38682c;

    public StreamGifDecoder(List<ImageHeaderParser> list, ResourceDecoder<ByteBuffer, GifDrawable> resourceDecoder, ArrayPool arrayPool) {
        this.f38680a = list;
        this.f38681b = resourceDecoder;
        this.f38682c = arrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<GifDrawable> decode(@NonNull InputStream inputStream, int i10, int i11, @NonNull Options options) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i12 = inputStream.read(bArr);
                if (i12 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e5);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f38681b.decode(ByteBuffer.wrap(byteArray), i10, i11, options);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull InputStream inputStream, @NonNull Options options) throws IOException {
        return !((Boolean) options.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(this.f38680a, inputStream, this.f38682c) == ImageHeaderParser.ImageType.GIF;
    }
}
