package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PorterDuff.Mode f19890c = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f19891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f19892b;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] mData;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt2;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable mParcelable;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mString1;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList mTintList;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mTintModeStr;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int mType;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IconType {
    }

    @RequiresApi(23)
    public static class a {
        public static IconCompat a(@NonNull Object obj) {
            Preconditions.checkNotNull(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.createWithResource(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.createWithContentUri(e(obj));
            }
            if (iD == 6) {
                return IconCompat.createWithAdaptiveBitmapContentUri(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f19891a = obj;
            return iconCompat;
        }

        @DrawableRes
        @IdRes
        public static int b(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        @Nullable
        public static String c(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static int d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                Objects.toString(obj);
                return -1;
            } catch (NoSuchMethodException unused2) {
                Objects.toString(obj);
                return -1;
            } catch (InvocationTargetException unused3) {
                Objects.toString(obj);
                return -1;
            }
        }

        @Nullable
        @DoNotInline
        public static Uri e(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        @DoNotInline
        public static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @DoNotInline
        public static Icon g(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.mType) {
                case -1:
                    return (Icon) iconCompat.f19891a;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f19891a);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.getResPackage(), iconCompat.mInt1);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f19891a, iconCompat.mInt1, iconCompat.mInt2);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f19891a);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f19891a, false)) : b.b((Bitmap) iconCompat.f19891a);
                    break;
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.getUri());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.getUri());
                        }
                        InputStream uriInputStream = iconCompat.getUriInputStream(context);
                        if (uriInputStream == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.getUri());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(uriInputStream), false));
                        } else {
                            iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(uriInputStream));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.mTintList;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f19892b;
            if (mode != IconCompat.f19890c) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    @RequiresApi(26)
    public static class b {
        @DoNotInline
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @DoNotInline
        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @RequiresApi(28)
    public static class c {
        @DoNotInline
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @DoNotInline
        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @DoNotInline
        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        @DoNotInline
        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @RequiresApi(30)
    public static class d {
        @DoNotInline
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.f19892b = f19890c;
        this.mTintModeStr = null;
    }

    @VisibleForTesting
    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f6 = iMin;
        float f10 = 0.5f * f6;
        float f11 = 0.9166667f * f10;
        if (z10) {
            float f12 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static Resources b(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", str);
            return null;
        }
    }

    @Nullable
    public static IconCompat createFromBundle(@NonNull Bundle bundle) {
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.mInt1 = bundle.getInt("int1");
        iconCompat.mInt2 = bundle.getInt("int2");
        iconCompat.mString1 = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.mTintList = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f19892b = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                iconCompat.f19891a = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i10);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f19891a = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f19891a = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    @Nullable
    @RequiresApi(23)
    public static IconCompat createFromIcon(@NonNull Context context, @NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        int iD = a.d(icon);
        if (iD == 2) {
            String strC = a.c(icon);
            try {
                return createWithResource(b(context, strC), strC, a.b(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        if (iD == 4) {
            return createWithContentUri(a.e(icon));
        }
        if (iD == 6) {
            return createWithAdaptiveBitmapContentUri(a.e(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f19891a = icon;
        return iconCompat;
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createFromIconOrNullIfZeroResId(@NonNull Icon icon) {
        if (a.d(icon) == 2 && a.b(icon) == 0) {
            return null;
        }
        return a.a(icon);
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmap(@NonNull Bitmap bitmap) {
        ObjectsCompat.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f19891a = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull String str) {
        ObjectsCompat.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f19891a = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithBitmap(@NonNull Bitmap bitmap) {
        ObjectsCompat.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f19891a = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithContentUri(@NonNull String str) {
        ObjectsCompat.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f19891a = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithData(@NonNull byte[] bArr, int i10, int i11) {
        ObjectsCompat.requireNonNull(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f19891a = bArr;
        iconCompat.mInt1 = i10;
        iconCompat.mInt2 = i11;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithResource(@NonNull Context context, @DrawableRes int i10) {
        ObjectsCompat.requireNonNull(context);
        return createWithResource(context.getResources(), context.getPackageName(), i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addToShortcutIntent(@NonNull Intent intent, @Nullable Drawable drawable, @NonNull Context context) {
        Bitmap bitmapCopy;
        checkResource(context);
        int i10 = this.mType;
        if (i10 == 1) {
            bitmapCopy = (Bitmap) this.f19891a;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i10 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.mInt1));
                    return;
                }
                Drawable drawable2 = ContextCompat.getDrawable(contextCreatePackageContext, this.mInt1);
                if (drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID)).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawable2.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawable2.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e5) {
                throw new IllegalArgumentException("Can't find package " + this.f19891a, e5);
            }
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = a((Bitmap) this.f19891a, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void checkResource(@NonNull Context context) {
        Object obj;
        int identifier;
        if (this.mType != 2 || (obj = this.f19891a) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
            String str2 = str.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, -1)[0];
            if ("0_resource_name_obfuscated".equals(str4) || this.mInt1 == (identifier = b(context, getResPackage()).getIdentifier(str4, str3, str5))) {
                return;
            }
            this.mInt1 = identifier;
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bitmap getBitmap() {
        int i10 = this.mType;
        if (i10 == -1) {
            Object obj = this.f19891a;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f19891a;
        }
        if (i10 == 5) {
            return a((Bitmap) this.f19891a, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @DrawableRes
    public int getResId() {
        int i10 = this.mType;
        if (i10 == -1) {
            return a.b(this.f19891a);
        }
        if (i10 == 2) {
            return this.mInt1;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public String getResPackage() {
        int i10 = this.mType;
        if (i10 == -1) {
            return a.c(this.f19891a);
        }
        if (i10 == 2) {
            String str = this.mString1;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f19891a).split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, -1)[0] : this.mString1;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int getType() {
        int i10 = this.mType;
        return i10 == -1 ? a.d(this.f19891a) : i10;
    }

    @NonNull
    public Uri getUri() {
        int i10 = this.mType;
        if (i10 == -1) {
            return a.e(this.f19891a);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f19891a);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public InputStream getUriInputStream(@NonNull Context context) {
        Uri uri = getUri();
        String scheme = uri.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (Exception e5) {
                Log.w("IconCompat", "Unable to load image from URI: " + uri, e5);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f19891a));
        } catch (FileNotFoundException e7) {
            Log.w("IconCompat", "Unable to load image from path: " + uri, e7);
            return null;
        }
    }

    @Nullable
    public Drawable loadDrawable(@NonNull Context context) {
        checkResource(context);
        return a.f(toIcon(context), context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.f19892b = PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                Parcelable parcelable = this.mParcelable;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f19891a = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.mParcelable;
                if (parcelable2 != null) {
                    this.f19891a = parcelable2;
                    return;
                }
                byte[] bArr = this.mData;
                this.f19891a = bArr;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.mData, Charset.forName("UTF-16"));
                this.f19891a = str;
                if (this.mType == 2 && this.mString1 == null) {
                    this.mString1 = str.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f19891a = this.mData;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z10) {
        this.mTintModeStr = this.f19892b.name();
        switch (this.mType) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.mParcelable = (Parcelable) this.f19891a;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.mParcelable = (Parcelable) this.f19891a;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f19891a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.mData = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.mData = ((String) this.f19891a).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.mData = (byte[]) this.f19891a;
                return;
            case 4:
            case 6:
                this.mData = this.f19891a.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @NonNull
    public IconCompat setTint(@ColorInt int i10) {
        return setTintList(ColorStateList.valueOf(i10));
    }

    @NonNull
    public IconCompat setTintList(@Nullable ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    @NonNull
    public IconCompat setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f19892b = mode;
        return this;
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch (this.mType) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f19891a);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f19891a);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f19891a);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f19891a);
                break;
        }
        bundle.putInt("type", this.mType);
        bundle.putInt("int1", this.mInt1);
        bundle.putInt("int2", this.mInt2);
        bundle.putString("string1", this.mString1);
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f19892b;
        if (mode != f19890c) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @NonNull
    @RequiresApi(23)
    @Deprecated
    public Icon toIcon() {
        return toIcon(null);
    }

    @NonNull
    public String toString() {
        String str;
        if (this.mType == -1) {
            return String.valueOf(this.f19891a);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.mType) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.mType) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f19891a).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f19891a).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.mString1);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(getResId())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.mInt1);
                if (this.mInt2 != 0) {
                    sb2.append(" off=");
                    sb2.append(this.mInt2);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f19891a);
                break;
        }
        if (this.mTintList != null) {
            sb2.append(" tint=");
            sb2.append(this.mTintList);
        }
        if (this.f19892b != f19890c) {
            sb2.append(" mode=");
            sb2.append(this.f19892b);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @NonNull
    @RequiresApi(23)
    public Icon toIcon(@Nullable Context context) {
        return a.g(this, context);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createWithResource(@Nullable Resources resources, @NonNull String str, @DrawableRes int i10) {
        ObjectsCompat.requireNonNull(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.mInt1 = i10;
            if (resources != null) {
                try {
                    iconCompat.f19891a = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f19891a = str;
            }
            iconCompat.mString1 = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull Uri uri) {
        ObjectsCompat.requireNonNull(uri);
        return createWithAdaptiveBitmapContentUri(uri.toString());
    }

    @NonNull
    public static IconCompat createWithContentUri(@NonNull Uri uri) {
        ObjectsCompat.requireNonNull(uri);
        return createWithContentUri(uri.toString());
    }

    public IconCompat(int i10) {
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.f19892b = f19890c;
        this.mTintModeStr = null;
        this.mType = i10;
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createFromIcon(@NonNull Icon icon) {
        return a.a(icon);
    }
}
