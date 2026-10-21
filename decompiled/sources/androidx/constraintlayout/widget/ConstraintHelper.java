package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {
    protected static final String CHILD_TAG = "CONSTRAINT_LAYOUT_HELPER_CHILD";
    protected int mCount;
    protected Helper mHelperWidget;
    protected int[] mIds;
    protected HashMap<Integer, String> mMap;
    protected String mReferenceIds;
    protected String mReferenceTags;
    protected boolean mUseViewMeasure;
    protected Context myContext;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View[] f19708p0;

    public ConstraintHelper(Context context) {
        super(context);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.f19708p0 = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(null);
    }

    public static boolean isChildOfHelper(View view) {
        return CHILD_TAG == view.getTag();
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        String strTrim = str.trim();
        int iE = e(strTrim);
        if (iE != 0) {
            this.mMap.put(Integer.valueOf(iE), strTrim);
            b(iE);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public void addView(View view) {
        if (view == this || view.getId() == -1 || view.getParent() == null) {
            return;
        }
        this.mReferenceIds = null;
        b(view.getId());
        requestLayout();
    }

    public void applyLayoutFeatures(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.mCount; i10++) {
            View viewById = constraintLayout.getViewById(this.mIds[i10]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.mCount + 1;
        int[] iArr = this.mIds;
        if (i11 > iArr.length) {
            this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i12 = this.mCount;
        iArr2[i12] = i10;
        this.mCount = i12 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).constraintTag)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public boolean containsId(int i10) {
        for (int i11 : this.mIds) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.myContext.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int e(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iD = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iD = ((Integer) designInformation).intValue();
            }
        }
        if (iD == 0 && constraintLayout != null) {
            iD = d(constraintLayout, str);
        }
        if (iD == 0) {
            try {
                iD = R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iD == 0 ? this.myContext.getResources().getIdentifier(str, "id", this.myContext.getPackageName()) : iD;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }

    public View[] getViews(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f19708p0;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.f19708p0 = new View[this.mCount];
        }
        for (int i10 = 0; i10 < this.mCount; i10++) {
            this.f19708p0[i10] = constraintLayout.getViewById(this.mIds[i10]);
        }
        return this.f19708p0;
    }

    public int indexFromId(int i10) {
        int i11 = -1;
        for (int i12 : this.mIds) {
            i11++;
            if (i12 == i10) {
                return i11;
            }
        }
        return i11;
    }

    public void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.mReferenceIds = string;
                    setIds(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.mReferenceTags = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintSet.Layout layout = constraint.layout;
        int[] iArr = layout.mReferenceIds;
        int i10 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = layout.mReferenceIdString;
            if (str != null) {
                if (str.length() > 0) {
                    ConstraintSet.Layout layout2 = constraint.layout;
                    String[] strArrSplit = layout2.mReferenceIdString.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i11 = 0;
                    for (String str2 : strArrSplit) {
                        int iE = e(str2.trim());
                        if (iE != 0) {
                            iArrCopyOf[i11] = iE;
                            i11++;
                        }
                    }
                    if (i11 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
                    }
                    layout2.mReferenceIds = iArrCopyOf;
                } else {
                    constraint.layout.mReferenceIds = null;
                }
            }
        }
        if (helperWidget == null) {
            return;
        }
        helperWidget.removeAllIds();
        if (constraint.layout.mReferenceIds == null) {
            return;
        }
        while (true) {
            int[] iArr2 = constraint.layout.mReferenceIds;
            if (i10 >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = sparseArray.get(iArr2[i10]);
            if (constraintWidget != null) {
                helperWidget.add(constraintWidget);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.mReferenceTags;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.mUseViewMeasure) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public int removeView(View view) {
        int i10;
        int id = view.getId();
        int i11 = -1;
        if (id == -1) {
            return -1;
        }
        this.mReferenceIds = null;
        for (int i12 = 0; i12 < this.mCount; i12++) {
            if (this.mIds[i12] == id) {
                int i13 = i12;
                while (true) {
                    i10 = this.mCount;
                    if (i13 >= i10 - 1) {
                        break;
                    }
                    int[] iArr = this.mIds;
                    int i14 = i13 + 1;
                    iArr[i13] = iArr[i14];
                    i13 = i14;
                }
                this.mIds[i10 - 1] = 0;
                this.mCount = i10 - 1;
                i11 = i12;
                break;
            }
        }
        requestLayout();
        return i11;
    }

    public void setIds(String str) {
        this.mReferenceIds = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.mCount = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.mReferenceTags = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.mCount = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.mReferenceIds == null) {
            b(i10);
        }
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
        String str;
        int iD;
        if (isInEditMode()) {
            setIds(this.mReferenceIds);
        }
        Helper helper = this.mHelperWidget;
        if (helper == null) {
            return;
        }
        helper.removeAllIds();
        for (int i10 = 0; i10 < this.mCount; i10++) {
            int i11 = this.mIds[i10];
            View viewById = constraintLayout.getViewById(i11);
            if (viewById == null && (iD = d(constraintLayout, (str = this.mMap.get(Integer.valueOf(i11))))) != 0) {
                this.mIds[i10] = iD;
                this.mMap.put(Integer.valueOf(iD), str);
                viewById = constraintLayout.getViewById(iD);
            }
            if (viewById != null) {
                this.mHelperWidget.add(constraintLayout.getViewWidget(viewById));
            }
        }
        this.mHelperWidget.updateConstraints(constraintLayout.mLayoutWidget);
    }

    public void validateParams() {
        if (this.mHelperWidget == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f19724q = (ConstraintWidget) this.mHelperWidget;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.f19708p0 = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public void applyLayoutFeatures() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((ConstraintLayout) parent);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.f19708p0 = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public void updatePreLayout(ConstraintWidgetContainer constraintWidgetContainer, Helper helper, SparseArray<ConstraintWidget> sparseArray) {
        helper.removeAllIds();
        for (int i10 = 0; i10 < this.mCount; i10++) {
            helper.add(sparseArray.get(this.mIds[i10]));
        }
    }

    public void applyHelperParams() {
    }

    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z10) {
    }
}
