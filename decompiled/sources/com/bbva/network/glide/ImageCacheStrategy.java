package com.bbva.network.glide;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: NetworkImageCache.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/network/glide/ImageCacheStrategy;", "", "ALL", ExpectedUserActionOnPoiTypes.NONE, "DATA", "RESOURCE", "AUTOMATIC", "network-image_release"}, k = 1, mv = {1, 8, 0})
public final class ImageCacheStrategy {
    private static final /* synthetic */ ImageCacheStrategy[] $VALUES;
    public static final ImageCacheStrategy ALL;
    public static final ImageCacheStrategy AUTOMATIC;
    public static final ImageCacheStrategy DATA;
    public static final ImageCacheStrategy NONE;
    public static final ImageCacheStrategy RESOURCE;

    static {
        ImageCacheStrategy imageCacheStrategy = new ImageCacheStrategy("ALL", 0);
        ALL = imageCacheStrategy;
        ImageCacheStrategy imageCacheStrategy2 = new ImageCacheStrategy(ExpectedUserActionOnPoiTypes.NONE, 1);
        NONE = imageCacheStrategy2;
        ImageCacheStrategy imageCacheStrategy3 = new ImageCacheStrategy("DATA", 2);
        DATA = imageCacheStrategy3;
        ImageCacheStrategy imageCacheStrategy4 = new ImageCacheStrategy("RESOURCE", 3);
        RESOURCE = imageCacheStrategy4;
        ImageCacheStrategy imageCacheStrategy5 = new ImageCacheStrategy("AUTOMATIC", 4);
        AUTOMATIC = imageCacheStrategy5;
        $VALUES = new ImageCacheStrategy[]{imageCacheStrategy, imageCacheStrategy2, imageCacheStrategy3, imageCacheStrategy4, imageCacheStrategy5};
    }

    public ImageCacheStrategy() {
        throw null;
    }

    public static ImageCacheStrategy valueOf(String str) {
        return (ImageCacheStrategy) Enum.valueOf(ImageCacheStrategy.class, str);
    }

    public static ImageCacheStrategy[] values() {
        return (ImageCacheStrategy[]) $VALUES.clone();
    }
}
