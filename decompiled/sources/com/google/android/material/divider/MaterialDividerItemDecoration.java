package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.camera.core.impl.utils.b;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44626i = R.style.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public Drawable f44627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColorInt
    public int f44629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f44634h;

    public MaterialDividerItemDecoration(@NonNull Context context, int i10) {
        this(context, null, i10);
    }

    public final boolean a(@NonNull View view, @NonNull RecyclerView recyclerView) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z10 = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
        if (childAdapterPosition != -1) {
            return (!z10 || this.f44633g) && shouldDrawDivider(childAdapterPosition, adapter);
        }
        return false;
    }

    @ColorInt
    public int getDividerColor() {
        return this.f44629c;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f44632f;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f44631e;
    }

    @Px
    public int getDividerThickness() {
        return this.f44628b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (a(view, recyclerView)) {
            if (this.f44630d == 1) {
                rect.bottom = this.f44628b;
            } else if (ViewUtils.isLayoutRtl(recyclerView)) {
                rect.left = this.f44628b;
            } else {
                rect.right = this.f44628b;
            }
        }
    }

    public int getOrientation() {
        return this.f44630d;
    }

    public boolean isLastItemDecorated() {
        return this.f44633g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        int height;
        int paddingTop;
        int i10;
        int i11;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i12 = this.f44630d;
        Rect rect = this.f44634h;
        int i13 = 0;
        if (i12 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
            int i14 = paddingLeft + (zIsLayoutRtl ? this.f44632f : this.f44631e);
            int i15 = width - (zIsLayoutRtl ? this.f44631e : this.f44632f);
            int childCount = recyclerView.getChildCount();
            while (i13 < childCount) {
                View childAt = recyclerView.getChildAt(i13);
                if (a(childAt, recyclerView)) {
                    recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, rect);
                    int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                    this.f44627a.setBounds(i14, iRound - this.f44628b, i15, iRound);
                    this.f44627a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                    this.f44627a.draw(canvas);
                }
                i13++;
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
        int i16 = paddingTop + this.f44631e;
        int i17 = height - this.f44632f;
        boolean zIsLayoutRtl2 = ViewUtils.isLayoutRtl(recyclerView);
        int childCount2 = recyclerView.getChildCount();
        while (i13 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i13);
            if (a(childAt2, recyclerView)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
                int iRound2 = Math.round(childAt2.getTranslationX());
                if (zIsLayoutRtl2) {
                    i11 = rect.left + iRound2;
                    i10 = this.f44628b + i11;
                } else {
                    i10 = iRound2 + rect.right;
                    i11 = i10 - this.f44628b;
                }
                this.f44627a.setBounds(i11, i16, i10, i17);
                this.f44627a.setAlpha(Math.round(childAt2.getAlpha() * 255.0f));
                this.f44627a.draw(canvas);
            }
            i13++;
        }
        canvas.restore();
    }

    public void setDividerColor(@ColorInt int i10) {
        this.f44629c = i10;
        Drawable drawableWrap = DrawableCompat.wrap(this.f44627a);
        this.f44627a = drawableWrap;
        DrawableCompat.setTint(drawableWrap, i10);
    }

    public void setDividerColorResource(@NonNull Context context, @ColorRes int i10) {
        setDividerColor(ContextCompat.getColor(context, i10));
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f44632f = i10;
    }

    public void setDividerInsetEndResource(@NonNull Context context, @DimenRes int i10) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(@Px int i10) {
        this.f44631e = i10;
    }

    public void setDividerInsetStartResource(@NonNull Context context, @DimenRes int i10) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(@Px int i10) {
        this.f44628b = i10;
    }

    public void setDividerThicknessResource(@NonNull Context context, @DimenRes int i10) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i10));
    }

    public void setLastItemDecorated(boolean z10) {
        this.f44633g = z10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(b.a("Invalid orientation: ", i10, ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.f44630d = i10;
    }

    public boolean shouldDrawDivider(int i10, @Nullable RecyclerView.Adapter<?> adapter) {
        return true;
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, R.attr.materialDividerStyle, i10);
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        this.f44634h = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i10, f44626i, new int[0]);
        this.f44629c = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.f44628b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f44631e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f44632f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.f44633g = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f44627a = new ShapeDrawable();
        setDividerColor(this.f44629c);
        setOrientation(i11);
    }
}
