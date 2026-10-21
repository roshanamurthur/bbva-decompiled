package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.mastercard.sonic.androidsvg.SVGParser;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaStoreUtil {
    public static boolean isAndroidPickerUri(Uri uri) {
        return isMediaStoreUri(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean isMediaStoreImageUri(Uri uri) {
        return isMediaStoreUri(uri) && !uri.getPathSegments().contains("video");
    }

    public static boolean isMediaStoreUri(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && SVGParser.XML_STYLESHEET_ATTR_MEDIA.equals(uri.getAuthority());
    }

    public static boolean isMediaStoreVideoUri(Uri uri) {
        return isMediaStoreUri(uri) && uri.getPathSegments().contains("video");
    }

    public static boolean isThumbnailSize(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }
}
