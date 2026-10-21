package f2;

import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;

/* JADX INFO: compiled from: RoundedBitmapDrawable21.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class a extends RoundedBitmapDrawable {
    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public final void a(int i10, int i11, int i12, Rect rect, Rect rect2) {
        Gravity.apply(i10, i11, i12, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(@NonNull Outline outline) {
        b();
        outline.setRoundRect(this.f19900h, getCornerRadius());
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public final boolean hasMipMap() {
        Bitmap bitmap = this.f19893a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public final void setMipMap(boolean z10) {
        Bitmap bitmap = this.f19893a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z10);
            invalidateSelf();
        }
    }
}
