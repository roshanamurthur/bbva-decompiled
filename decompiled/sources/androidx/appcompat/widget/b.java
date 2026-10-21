package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ActionBarBackgroundDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f1588a;

    public b(ActionBarContainer actionBarContainer) {
        this.f1588a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1588a;
        if (actionBarContainer.f1051w0) {
            Drawable drawable = actionBarContainer.v0;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1049t0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1050u0;
        if (drawable3 == null || !actionBarContainer.f1052x0) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void getOutline(@NonNull Outline outline) {
        ActionBarContainer actionBarContainer = this.f1588a;
        if (actionBarContainer.f1051w0) {
            if (actionBarContainer.v0 != null) {
                actionBarContainer.f1049t0.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1049t0;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
