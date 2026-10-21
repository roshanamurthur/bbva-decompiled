package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f19792p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f19793q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f19794r0;

    public Placeholder(Context context) {
        super(context);
        this.f19792p0 = -1;
        this.f19793q0 = null;
        this.f19794r0 = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f19794r0);
        this.f19792p0 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_placeholder_content) {
                    this.f19792p0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19792p0);
                } else if (index == R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f19794r0 = typedArrayObtainStyledAttributes.getInt(index, this.f19794r0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f19793q0;
    }

    public int getEmptyVisibility() {
        return this.f19794r0;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, ErrorCodes.ERR_CRY_IO_PROPERTIES, ErrorCodes.ERR_CRY_IO_PROPERTIES, ErrorCodes.ERR_CRY_IO_PROPERTIES);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f19792p0 == i10) {
            return;
        }
        View view = this.f19793q0;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f19793q0.getLayoutParams()).f19714f = false;
            this.f19793q0 = null;
        }
        this.f19792p0 = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f19794r0 = i10;
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
        if (this.f19793q0 == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f19793q0.getLayoutParams();
        layoutParams2.f19724q.setVisibility(0);
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = layoutParams.f19724q.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (horizontalDimensionBehaviour != dimensionBehaviour) {
            layoutParams.f19724q.setWidth(layoutParams2.f19724q.getWidth());
        }
        if (layoutParams.f19724q.getVerticalDimensionBehaviour() != dimensionBehaviour) {
            layoutParams.f19724q.setHeight(layoutParams2.f19724q.getHeight());
        }
        layoutParams2.f19724q.setVisibility(8);
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        if (this.f19792p0 == -1 && !isInEditMode()) {
            setVisibility(this.f19794r0);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f19792p0);
        this.f19793q0 = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).f19714f = true;
            this.f19793q0.setVisibility(0);
            setVisibility(0);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19792p0 = -1;
        this.f19793q0 = null;
        this.f19794r0 = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19792p0 = -1;
        this.f19793q0 = null;
        this.f19794r0 = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f19792p0 = -1;
        this.f19793q0 = null;
        this.f19794r0 = 4;
        a(attributeSet);
    }
}
