package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f1580p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f1581q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public WeakReference<View> f1582r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public LayoutInflater f1583s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public OnInflateListener f1584t0;

    public interface OnInflateListener {
        void onInflate(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getInflatedId() {
        return this.f1581q0;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1583s0;
    }

    public int getLayoutResource() {
        return this.f1580p0;
    }

    public View inflate() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1580p0 == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f1583s0;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f1580p0, viewGroup, false);
        int i10 = this.f1581q0;
        if (i10 != -1) {
            viewInflate.setId(i10);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f1582r0 = new WeakReference<>(viewInflate);
        OnInflateListener onInflateListener = this.f1584t0;
        if (onInflateListener != null) {
            onInflateListener.onInflate(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1581q0 = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1583s0 = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1580p0 = i10;
    }

    public void setOnInflateListener(OnInflateListener onInflateListener) {
        this.f1584t0 = onInflateListener;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f1582r0;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            inflate();
        }
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1580p0 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewStubCompat, i10, 0);
        this.f1581q0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.f1580p0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas) {
    }
}
