package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(api = 28)
public final class DefaultOnHeaderDecodedListener implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HardwareConfigState f38523a = HardwareConfigState.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DecodeFormat f38526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DownsampleStrategy f38527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PreferredColorSpace f38529g;

    public class a implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public DefaultOnHeaderDecodedListener(int i10, int i11, @NonNull Options options) {
        this.f38524b = i10;
        this.f38525c = i11;
        this.f38526d = (DecodeFormat) options.get(Downsampler.DECODE_FORMAT);
        this.f38527e = (DownsampleStrategy) options.get(DownsampleStrategy.OPTION);
        Option<Boolean> option = Downsampler.ALLOW_HARDWARE_CONFIG;
        this.f38528f = options.get(option) != null && ((Boolean) options.get(option)).booleanValue();
        this.f38529g = (PreferredColorSpace) options.get(Downsampler.PREFERRED_COLOR_SPACE);
    }

    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        if (this.f38523a.isHardwareConfigAllowed(this.f38524b, this.f38525c, this.f38528f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f38526d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f38524b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f38525c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float scaleFactor = this.f38527e.getScaleFactor(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * scaleFactor);
        int iRound2 = Math.round(scaleFactor * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f38529g;
        if (preferredColorSpace != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
