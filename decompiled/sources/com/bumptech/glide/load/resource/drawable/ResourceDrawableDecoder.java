package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {
    public static final Option<Resources.Theme> THEME = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38635a;

    public ResourceDrawableDecoder(Context context) {
        this.f38635a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource<Drawable> decode(@NonNull Uri uri, int i10, int i11, @NonNull Options options) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f38635a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e5) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e5);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e7) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e7);
            }
        }
        Resources.Theme theme = ((String) Preconditions.checkNotNull(authority)).equals(context.getPackageName()) ? (Resources.Theme) options.get(THEME) : null;
        Drawable drawable = theme == null ? DrawableDecoderCompat.getDrawable(context, contextCreatePackageContext, identifier) : DrawableDecoderCompat.getDrawable(context, identifier, theme);
        if (drawable != null) {
            return new f(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Uri uri, @NonNull Options options) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
