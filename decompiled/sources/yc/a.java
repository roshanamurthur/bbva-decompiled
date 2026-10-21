package yc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: DrawableToBitmapConverter.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0509a f94762a = new C0509a();

    @Nullable
    public static BitmapResource a(BitmapPool bitmapPool, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i10 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i11 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i10 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i11 = current.getIntrinsicHeight();
                    }
                    Lock bitmapDrawableLock = TransformationUtils.getBitmapDrawableLock();
                    bitmapDrawableLock.lock();
                    Bitmap bitmap2 = bitmapPool.get(i10, i11, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmap2);
                        current.setBounds(0, 0, i10, i11);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        bitmapDrawableLock.unlock();
                        bitmap = bitmap2;
                    } catch (Throwable th2) {
                        bitmapDrawableLock.unlock();
                        throw th2;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                z10 = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z10 = true;
        }
        if (!z10) {
            bitmapPool = f94762a;
        }
        return BitmapResource.obtain(bitmap, bitmapPool);
    }

    /* JADX INFO: renamed from: yc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrawableToBitmapConverter.java */
    public class C0509a extends BitmapPoolAdapter {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
        public final void put(Bitmap bitmap) {
        }
    }
}
