package com.bbva.widgets.image.extensions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageViewExtensions.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t\u001a\n\u0010\n\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u0007*\u00020\u0000¨\u0006\r"}, d2 = {"Landroid/widget/ImageView;", "", "url", "", "default", "placeHolder", "transitionDuration", "", "load", "(Landroid/widget/ImageView;Ljava/lang/String;ILjava/lang/Integer;I)V", "applyTopCropMatrix", "applyStartCropMatrix", "applyStartOrTopCropMatrix", "widgets-image-extensions_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nImageViewExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewExtensions.kt\ncom/bbva/widgets/image/extensions/ImageViewExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public final class ImageViewExtensionsKt {
    public static final Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return a(baseContext);
    }

    public static final void applyStartCropMatrix(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            float height = ((imageView.getHeight() - imageView.getPaddingBottom()) - imageView.getPaddingTop()) / drawable.getIntrinsicHeight();
            Matrix imageMatrix = imageView.getImageMatrix();
            imageMatrix.setScale(height, height);
            imageView.setImageMatrix(imageMatrix);
        }
    }

    public static final void applyStartOrTopCropMatrix(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Drawable drawable = imageView.getDrawable();
        Float fValueOf = null;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 != null) {
                int intrinsicHeight = drawable2.getIntrinsicHeight();
                int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                int height = (imageView.getHeight() - imageView.getPaddingBottom()) - imageView.getPaddingTop();
                float f6 = width / intrinsicWidth;
                Float fValueOf2 = Float.valueOf(f6);
                fValueOf2.floatValue();
                float f10 = intrinsicHeight;
                float f11 = height;
                fValueOf = f6 * f10 > f11 ? fValueOf2 : null;
                if (fValueOf == null) {
                    fValueOf = Float.valueOf(f11 / f10);
                }
            }
        }
        if (fValueOf != null) {
            float fFloatValue = fValueOf.floatValue();
            Matrix imageMatrix = imageView.getImageMatrix();
            imageMatrix.setScale(fFloatValue, fFloatValue);
            imageView.setImageMatrix(imageMatrix);
        }
    }

    public static final void applyTopCropMatrix(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            float width = ((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / drawable.getIntrinsicWidth();
            Matrix imageMatrix = imageView.getImageMatrix();
            imageMatrix.setScale(width, width);
            imageView.setImageMatrix(imageMatrix);
        }
    }

    public static final void b(ImageView imageView, String str, @DrawableRes int i10, @DrawableRes Integer num, int i11) {
        RequestBuilder requestBuilderTransition = Glide.with(imageView).mo4916load(str).error(i10).transition(DrawableTransitionOptions.withCrossFade(i11));
        Intrinsics.checkNotNullExpressionValue(requestBuilderTransition, "transition(...)");
        if (num != null) {
            requestBuilderTransition.placeholder(num.intValue());
        }
        requestBuilderTransition.into(imageView);
    }

    public static final void load(@NotNull ImageView imageView, @Nullable String str, @DrawableRes int i10, @DrawableRes @Nullable Integer num, int i11) {
        Unit unit;
        Activity activityA;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Context context = imageView.getContext();
        if (context == null || (activityA = a(context)) == null) {
            unit = null;
        } else {
            if (!activityA.isDestroyed()) {
                b(imageView, str, i10, num, i11);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            b(imageView, str, i10, num, i11);
        }
    }

    public static /* synthetic */ void load$default(ImageView imageView, String str, int i10, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        load(imageView, str, i10, num, i11);
    }
}
