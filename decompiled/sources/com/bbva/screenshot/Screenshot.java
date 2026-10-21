package com.bbva.screenshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Screenshot.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/screenshot/Screenshot;", "", "()V", "capture", "Landroid/graphics/Bitmap;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "viewId", "", TypedValues.AttributesType.S_FRAME, "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "viewGroup", "Landroid/view/ViewGroup;", "screenshot_release"}, k = 1, mv = {1, 1, 13})
public final class Screenshot {
    @JvmOverloads
    @Nullable
    public static /* synthetic */ Bitmap capture$default(Screenshot screenshot, Activity activity, int i10, Rect rect, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            rect = null;
        }
        return screenshot.capture(activity, i10, rect);
    }

    @JvmOverloads
    @Nullable
    public final Bitmap capture(@NotNull Activity activity, @IdRes int i10) {
        return capture$default(this, activity, i10, (Rect) null, 4, (Object) null);
    }

    @JvmOverloads
    @Nullable
    public static /* synthetic */ Bitmap capture$default(Screenshot screenshot, ViewGroup viewGroup, int i10, Rect rect, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            rect = null;
        }
        return screenshot.capture(viewGroup, i10, rect);
    }

    @JvmOverloads
    @Nullable
    public final Bitmap capture(@NotNull View view) {
        return capture$default(this, view, null, 2, null);
    }

    @JvmOverloads
    @Nullable
    public static /* synthetic */ Bitmap capture$default(Screenshot screenshot, View view, Rect rect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rect = null;
        }
        return screenshot.capture(view, rect);
    }

    @JvmOverloads
    @Nullable
    public final Bitmap capture(@NotNull ViewGroup viewGroup, @IdRes int i10) {
        return capture$default(this, viewGroup, i10, (Rect) null, 4, (Object) null);
    }

    @JvmOverloads
    @Nullable
    public final Bitmap capture(@NotNull Activity activity, @IdRes int viewId, @Nullable Rect frame) {
        View viewFindViewById = activity.findViewById(viewId);
        if (viewFindViewById != null) {
            return capture(viewFindViewById, frame);
        }
        return null;
    }

    @JvmOverloads
    @Nullable
    public final Bitmap capture(@NotNull ViewGroup viewGroup, @IdRes int viewId, @Nullable Rect frame) {
        View viewFindViewById = viewGroup.findViewById(viewId);
        if (viewFindViewById != null) {
            return capture(viewFindViewById, frame);
        }
        return null;
    }

    @JvmOverloads
    @Nullable
    public final Bitmap capture(@NotNull View view, @Nullable Rect frame) {
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(returnedBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        if (frame != null) {
            Intrinsics.checkExpressionValueIsNotNull(returnedBitmap, "returnedBitmap");
            Rect rect = new Rect(0, 0, returnedBitmap.getWidth(), returnedBitmap.getHeight());
            Rect rect2 = new Rect();
            if (rect2.setIntersect(rect, frame) && !rect2.isEmpty()) {
                returnedBitmap = Bitmap.createBitmap(returnedBitmap, rect2.left, rect2.top, rect2.width(), rect2.height());
            }
        }
        view.draw(canvas);
        return returnedBitmap;
    }
}
