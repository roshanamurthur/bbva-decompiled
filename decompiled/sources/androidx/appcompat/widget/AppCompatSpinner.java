package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.TintableBackgroundView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    @StyleableRes
    public static final int[] f1229x0 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final k f1230p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Context f1231q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final a f1232r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SpinnerAdapter f1233s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f1234t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final g f1235u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Rect f1236w0;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1237a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1239c;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1238b = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.f1239c = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.f1237a = true;
        }

        public void readProperties(@NonNull AppCompatSpinner appCompatSpinner, @NonNull PropertyReader propertyReader) {
            if (!this.f1237a) {
                throw j.c();
            }
            propertyReader.readObject(this.f1238b, appCompatSpinner.getBackgroundTintList());
            propertyReader.readObject(this.f1239c, appCompatSpinner.getBackgroundTintMode());
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f1240p0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f1240p0 = parcel.readByte() != 0;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1240p0 ? (byte) 1 : (byte) 0);
        }
    }

    public class a extends ForwardingListener {

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ f f1241y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, f fVar) {
            super(view);
            this.f1241y0 = fVar;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu getPopup() {
            return this.f1241y0;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean onForwardingStarted() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (appCompatSpinner.getInternalPopup().isShowing()) {
                return true;
            }
            appCompatSpinner.f1235u0.c(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().isShowing()) {
                appCompatSpinner.f1235u0.c(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    @RequiresApi(23)
    public static final class c {
        @DoNotInline
        public static void a(@NonNull android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
            if (ObjectsCompat.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SpinnerAdapter f1247p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ListAdapter f1248q0;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1248q0;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1247p0;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1247p0;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1247p0;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1247p0;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1247p0;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1248q0;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1247p0;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1247p0;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @VisibleForTesting
    public class f extends ListPopupWindow implements g {

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public CharSequence f1249d1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public ListAdapter f1250e1;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public final Rect f1251f1;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public int f1252g1;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f fVar = f.this;
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    AppCompatSpinner.this.performItemClick(view, i10, fVar.f1250e1.getItemId(i10));
                }
                fVar.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                f fVar = f.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                fVar.getClass();
                if (!appCompatSpinner.isAttachedToWindow() || !appCompatSpinner.getGlobalVisibleRect(fVar.f1251f1)) {
                    fVar.dismiss();
                } else {
                    fVar.f();
                    f.super.show();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1256p0;

            public c(b bVar) {
                this.f1256p0 = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1256p0);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1251f1 = new Rect();
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new a());
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void a(CharSequence charSequence) {
            this.f1249d1 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void b(int i10) {
            this.f1252g1 = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void c(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            f();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            listView.setTextDirection(i10);
            listView.setTextAlignment(i11);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            setSelection(appCompatSpinner.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            setOnDismissListener(new c(bVar));
        }

        public final void f() {
            int i10;
            Drawable background = getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f1236w0);
                i10 = ViewUtils.isLayoutRtl(appCompatSpinner) ? appCompatSpinner.f1236w0.right : -appCompatSpinner.f1236w0.left;
            } else {
                Rect rect = appCompatSpinner.f1236w0;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i11 = appCompatSpinner.v0;
            if (i11 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.f1250e1, getBackground());
                int i12 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = appCompatSpinner.f1236w0;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                setContentWidth(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(i11);
            }
            setHorizontalOffset(ViewUtils.isLayoutRtl(appCompatSpinner) ? (((width - paddingRight) - getWidth()) - this.f1252g1) + i10 : paddingLeft + this.f1252g1 + i10);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final CharSequence getHintText() {
            return this.f1249d1;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.g
        public final void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.f1250e1 = listAdapter;
        }
    }

    @VisibleForTesting
    public interface g {
        void a(CharSequence charSequence);

        void b(int i10);

        void c(int i10, int i11);

        void dismiss();

        Drawable getBackground();

        CharSequence getHintText();

        int getHorizontalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i10);

        void setVerticalOffset(int i10);
    }

    public AppCompatSpinner(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f1236w0;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f1230p0;
        if (kVar != null) {
            kVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f1235u0;
        return gVar != null ? gVar.getHorizontalOffset() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f1235u0;
        return gVar != null ? gVar.getVerticalOffset() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1235u0 != null ? this.v0 : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final g getInternalPopup() {
        return this.f1235u0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f1235u0;
        return gVar != null ? gVar.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1231q0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f1235u0;
        return gVar != null ? gVar.getHintText() : super.getPrompt();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f1230p0;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f1230p0;
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f1235u0;
        if (gVar == null || !gVar.isShowing()) {
            return;
        }
        gVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1235u0 == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1240p0 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        g gVar = this.f1235u0;
        savedState.f1240p0 = gVar != null && gVar.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f1232r0;
        if (aVar == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f1235u0;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.isShowing()) {
            return true;
        }
        this.f1235u0.c(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f1230p0;
        if (kVar != null) {
            kVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        super.setBackgroundResource(i10);
        k kVar = this.f1230p0;
        if (kVar != null) {
            kVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f1235u0;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            gVar.b(i10);
            gVar.setHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f1235u0;
        if (gVar != null) {
            gVar.setVerticalOffset(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1235u0 != null) {
            this.v0 = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f1235u0;
        if (gVar != null) {
            gVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i10) {
        setPopupBackgroundDrawable(AppCompatResources.getDrawable(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f1235u0;
        if (gVar != null) {
            gVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        k kVar = this.f1230p0;
        if (kVar != null) {
            kVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        k kVar = this.f1230p0;
        if (kVar != null) {
            kVar.j(mode);
        }
    }

    public AppCompatSpinner(@NonNull Context context, int i10) {
        this(context, null, androidx.appcompat.R.attr.spinnerStyle, i10);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1234t0) {
            this.f1233s0 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        g gVar = this.f1235u0;
        if (gVar != null) {
            Context context = this.f1231q0;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            e eVar = new e();
            eVar.f1247p0 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                eVar.f1248q0 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    c.a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                }
            }
            gVar.setAdapter(eVar);
        }
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f1236w0 = new Rect();
        ThemeUtils.checkAppCompatTheme(this, getContext());
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.Spinner, i10, 0);
        this.f1230p0 = new k(this);
        if (theme != null) {
            this.f1231q0 = new ContextThemeWrapper(context, theme);
        } else {
            int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Spinner_popupTheme, 0);
            if (resourceId != 0) {
                this.f1231q0 = new ContextThemeWrapper(context, resourceId);
            } else {
                this.f1231q0 = context;
            }
        }
        TypedArray typedArray = null;
        if (i11 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1229x0, i10, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception unused) {
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i11 != 0) {
                        d dVar = new d();
                        this.f1235u0 = dVar;
                        dVar.f1245r0 = tintTypedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.Spinner_android_prompt);
                    } else if (i11 == 1) {
                        f fVar = new f(this.f1231q0, attributeSet, i10);
                        TintTypedArray tintTypedArrayObtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(this.f1231q0, attributeSet, androidx.appcompat.R.styleable.Spinner, i10, 0);
                        this.v0 = tintTypedArrayObtainStyledAttributes2.getLayoutDimension(androidx.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
                        fVar.setBackgroundDrawable(tintTypedArrayObtainStyledAttributes2.getDrawable(androidx.appcompat.R.styleable.Spinner_android_popupBackground));
                        fVar.f1249d1 = tintTypedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.Spinner_android_prompt);
                        tintTypedArrayObtainStyledAttributes2.recycle();
                        this.f1235u0 = fVar;
                        this.f1232r0 = new a(this, fVar);
                    }
                    textArray = tintTypedArrayObtainStyledAttributes.getTextArray(androidx.appcompat.R.styleable.Spinner_android_entries);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    tintTypedArrayObtainStyledAttributes.recycle();
                    this.f1234t0 = true;
                    spinnerAdapter = this.f1233s0;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f1233s0 = null;
                    }
                    this.f1230p0.e(attributeSet, i10);
                } catch (Throwable th2) {
                    th = th2;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th3) {
                th = th3;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i11 != 0) {
            d dVar2 = new d();
            this.f1235u0 = dVar2;
            dVar2.f1245r0 = tintTypedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.Spinner_android_prompt);
        } else if (i11 == 1) {
            f fVar2 = new f(this.f1231q0, attributeSet, i10);
            TintTypedArray tintTypedArrayObtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(this.f1231q0, attributeSet, androidx.appcompat.R.styleable.Spinner, i10, 0);
            this.v0 = tintTypedArrayObtainStyledAttributes3.getLayoutDimension(androidx.appcompat.R.styleable.Spinner_android_dropDownWidth, -2);
            fVar2.setBackgroundDrawable(tintTypedArrayObtainStyledAttributes3.getDrawable(androidx.appcompat.R.styleable.Spinner_android_popupBackground));
            fVar2.f1249d1 = tintTypedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.Spinner_android_prompt);
            tintTypedArrayObtainStyledAttributes3.recycle();
            this.f1235u0 = fVar2;
            this.f1232r0 = new a(this, fVar2);
        }
        textArray = tintTypedArrayObtainStyledAttributes.getTextArray(androidx.appcompat.R.styleable.Spinner_android_entries);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.f1234t0 = true;
        spinnerAdapter = this.f1233s0;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1233s0 = null;
        }
        this.f1230p0.e(attributeSet, i10);
    }

    @VisibleForTesting
    public class d implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @VisibleForTesting
        public AlertDialog f1243p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ListAdapter f1244q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public CharSequence f1245r0;

        public d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void a(CharSequence charSequence) {
            this.f1245r0 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void c(int i10, int i11) {
            if (this.f1244q0 == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            AlertDialog.Builder builder = new AlertDialog.Builder(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f1245r0;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            AlertDialog alertDialogCreate = builder.setSingleChoiceItems(this.f1244q0, appCompatSpinner.getSelectedItemPosition(), this).create();
            this.f1243p0 = alertDialogCreate;
            ListView listView = alertDialogCreate.getListView();
            listView.setTextDirection(i10);
            listView.setTextAlignment(i11);
            this.f1243p0.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void dismiss() {
            AlertDialog alertDialog = this.f1243p0;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f1243p0 = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final CharSequence getHintText() {
            return this.f1245r0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final int getHorizontalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final int getVerticalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final boolean isShowing() {
            AlertDialog alertDialog = this.f1243p0;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i10);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i10, this.f1244q0.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void setAdapter(ListAdapter listAdapter) {
            this.f1244q0 = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void b(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void setBackgroundDrawable(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void setHorizontalOffset(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void setVerticalOffset(int i10) {
        }
    }
}
