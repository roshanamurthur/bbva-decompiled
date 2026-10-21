package com.airbnb.lottie.manager;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ImageAssetManager {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f25942e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Context f25943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ImageAssetDelegate f25945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, LottieImageAsset> f25946d;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, LottieImageAsset> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f25944b = str;
        } else {
            this.f25944b = str.concat("/");
        }
        this.f25946d = map;
        setDelegate(imageAssetDelegate);
        if (callback instanceof View) {
            this.f25943a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f25943a = null;
        }
    }

    public final void a(String str, @Nullable Bitmap bitmap) {
        synchronized (f25942e) {
            this.f25946d.get(str).setBitmap(bitmap);
        }
    }

    @Nullable
    public Bitmap bitmapForId(String str) {
        String str2 = this.f25944b;
        LottieImageAsset lottieImageAsset = this.f25946d.get(str);
        if (lottieImageAsset == null) {
            return null;
        }
        Bitmap bitmap = lottieImageAsset.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        ImageAssetDelegate imageAssetDelegate = this.f25945c;
        if (imageAssetDelegate != null) {
            Bitmap bitmapFetchBitmap = imageAssetDelegate.fetchBitmap(lottieImageAsset);
            if (bitmapFetchBitmap != null) {
                a(str, bitmapFetchBitmap);
            }
            return bitmapFetchBitmap;
        }
        Context context = this.f25943a;
        if (context == null) {
            return null;
        }
        String fileName = lottieImageAsset.getFileName();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                Bitmap bitmapResizeBitmapIfNeeded = Utils.resizeBitmapIfNeeded(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), lottieImageAsset.getWidth(), lottieImageAsset.getHeight());
                a(str, bitmapResizeBitmapIfNeeded);
                return bitmapResizeBitmapIfNeeded;
            } catch (IllegalArgumentException e5) {
                Logger.warning("data URL did not have correct base64 format.", e5);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(str2 + fileName), null, options);
                if (bitmapDecodeStream != null) {
                    Bitmap bitmapResizeBitmapIfNeeded2 = Utils.resizeBitmapIfNeeded(bitmapDecodeStream, lottieImageAsset.getWidth(), lottieImageAsset.getHeight());
                    a(str, bitmapResizeBitmapIfNeeded2);
                    return bitmapResizeBitmapIfNeeded2;
                }
                Logger.warning("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e7) {
                Logger.warning("Unable to decode image `" + str + "`.", e7);
                return null;
            }
        } catch (IOException e10) {
            Logger.warning("Unable to open asset.", e10);
            return null;
        }
    }

    @Nullable
    public LottieImageAsset getImageAssetById(String str) {
        return this.f25946d.get(str);
    }

    public boolean hasSameContext(Context context) {
        Context context2 = this.f25943a;
        if (context == null) {
            return context2 == null;
        }
        if (context2 instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == context2;
    }

    public void setDelegate(@Nullable ImageAssetDelegate imageAssetDelegate) {
        this.f25945c = imageAssetDelegate;
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        Map<String, LottieImageAsset> map = this.f25946d;
        if (bitmap != null) {
            Bitmap bitmap2 = map.get(str).getBitmap();
            a(str, bitmap);
            return bitmap2;
        }
        LottieImageAsset lottieImageAsset = map.get(str);
        Bitmap bitmap3 = lottieImageAsset.getBitmap();
        lottieImageAsset.setBitmap(null);
        return bitmap3;
    }
}
