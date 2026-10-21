package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.WrappedDrawable;

/* JADX INFO: compiled from: AppCompatProgressBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1589c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f1590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f1591b;

    public c0(ProgressBar progressBar) {
        this.f1590a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i10) {
        ProgressBar progressBar = this.f1590a;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(progressBar.getContext(), attributeSet, f1589c, i10, 0);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            if (drawableIfKnown instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableIfKnown;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i11 = 0; i11 < numberOfFrames; i11++) {
                    Drawable drawableB = b(animationDrawable.getFrame(i11), true);
                    drawableB.setLevel(10000);
                    animationDrawable2.addFrame(drawableB, animationDrawable.getDuration(i11));
                }
                animationDrawable2.setLevel(10000);
                drawableIfKnown = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableIfKnown);
        }
        Drawable drawableIfKnown2 = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown2 != null) {
            progressBar.setProgressDrawable(b(drawableIfKnown2, false));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public final Drawable b(Drawable drawable, boolean z10) {
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable wrappedDrawable2 = wrappedDrawable.getWrappedDrawable();
            if (wrappedDrawable2 != null) {
                wrappedDrawable.setWrappedDrawable(b(wrappedDrawable2, z10));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id = layerDrawable.getId(i10);
                    drawableArr[i10] = b(layerDrawable.getDrawable(i10), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                    layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                    layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                    layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                    layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                    layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                    layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                    layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                    layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1591b == null) {
                    this.f1591b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
