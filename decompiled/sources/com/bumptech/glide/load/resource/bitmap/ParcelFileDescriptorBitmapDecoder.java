package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
public final class ParcelFileDescriptorBitmapDecoder implements ResourceDecoder<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Downsampler f38587a;

    public ParcelFileDescriptorBitmapDecoder(Downsampler downsampler) {
        this.f38587a = downsampler;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource<Bitmap> decode(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @NonNull Options options) throws IOException {
        return this.f38587a.decode(parcelFileDescriptor, i10, i11, options);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull Options options) {
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= SvgConstantsKt.SPECIFIED_CLIP_RULE) && this.f38587a.handles(parcelFileDescriptor);
    }
}
