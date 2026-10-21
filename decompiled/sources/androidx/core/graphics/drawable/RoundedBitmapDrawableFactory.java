package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f2.a;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class RoundedBitmapDrawableFactory {
    @NonNull
    public static RoundedBitmapDrawable create(@NonNull Resources resources, @Nullable Bitmap bitmap) {
        return new a(resources, bitmap);
    }

    @NonNull
    public static RoundedBitmapDrawable create(@NonNull Resources resources, @NonNull String str) {
        RoundedBitmapDrawable roundedBitmapDrawableCreate = create(resources, BitmapFactory.decodeFile(str));
        if (roundedBitmapDrawableCreate.getBitmap() == null) {
            Log.w("RoundedBitmapDrawableFa", "RoundedBitmapDrawable cannot decode " + str);
        }
        return roundedBitmapDrawableCreate;
    }

    @NonNull
    public static RoundedBitmapDrawable create(@NonNull Resources resources, @NonNull InputStream inputStream) {
        RoundedBitmapDrawable roundedBitmapDrawableCreate = create(resources, BitmapFactory.decodeStream(inputStream));
        if (roundedBitmapDrawableCreate.getBitmap() == null) {
            Log.w("RoundedBitmapDrawableFa", "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return roundedBitmapDrawableCreate;
    }
}
