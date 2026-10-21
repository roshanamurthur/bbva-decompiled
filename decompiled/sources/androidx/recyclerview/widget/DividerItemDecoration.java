package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f22637d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f22638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f22640c = new Rect();

    @SuppressLint({"UnknownNullness"})
    public DividerItemDecoration(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f22637d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f22638a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(i10);
    }

    @Nullable
    public Drawable getDrawable() {
        return this.f22638a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Drawable drawable = this.f22638a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f22639b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f22638a == null) {
            return;
        }
        int i10 = this.f22639b;
        Rect rect = this.f22640c;
        int i11 = 0;
        if (i10 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i11 < childCount) {
                View childAt = recyclerView.getChildAt(i11);
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f22638a.setBounds(paddingLeft, iRound - this.f22638a.getIntrinsicHeight(), width, iRound);
                this.f22638a.draw(canvas);
                i11++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i11);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f22638a.setBounds(iRound2 - this.f22638a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f22638a.draw(canvas);
            i11++;
        }
        canvas.restore();
    }

    public void setDrawable(@NonNull Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f22638a = drawable;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f22639b = i10;
    }
}
