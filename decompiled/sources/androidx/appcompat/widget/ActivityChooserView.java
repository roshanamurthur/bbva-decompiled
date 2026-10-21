package androidx.appcompat.widget;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    public final a E0;
    public final b F0;
    public ListPopupWindow G0;
    public PopupWindow.OnDismissListener H0;
    public boolean I0;
    public int J0;
    public boolean K0;
    public int L0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final f f1104p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final g f1105q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final View f1106r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Drawable f1107s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final FrameLayout f1108t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ImageView f1109u0;
    public final FrameLayout v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ImageView f1110w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f1111x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ActionProvider f1112y0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int[] f1113p0 = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, f1113p0);
            setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1104p0.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1104p0.notifyDataSetInvalidated();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.isShowingPopup()) {
                if (!activityChooserView.isShown()) {
                    activityChooserView.getListPopupWindow().dismiss();
                    return;
                }
                activityChooserView.getListPopupWindow().show();
                ActionProvider actionProvider = activityChooserView.f1112y0;
                if (actionProvider != null) {
                    actionProvider.subUiVisibilityChanged(true);
                }
            }
        }
    }

    public class c extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
        }
    }

    public class d extends ForwardingListener {
        public d(FrameLayout frameLayout) {
            super(frameLayout);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu getPopup() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean onForwardingStarted() {
            ActivityChooserView.this.showPopup();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean onForwardingStopped() {
            ActivityChooserView.this.dismissPopup();
            return true;
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            int size;
            super.onChanged();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f1104p0.getCount() > 0) {
                activityChooserView.f1108t0.setEnabled(true);
            } else {
                activityChooserView.f1108t0.setEnabled(false);
            }
            int iF = activityChooserView.f1104p0.f1118p0.f();
            ActivityChooserModel activityChooserModel = activityChooserView.f1104p0.f1118p0;
            synchronized (activityChooserModel.f1090a) {
                activityChooserModel.c();
                size = activityChooserModel.f1092c.size();
            }
            if (iF == 1 || (iF > 1 && size > 0)) {
                activityChooserView.v0.setVisibility(0);
                ResolveInfo resolveInfoG = activityChooserView.f1104p0.f1118p0.g();
                PackageManager packageManager = activityChooserView.getContext().getPackageManager();
                activityChooserView.f1110w0.setImageDrawable(resolveInfoG.loadIcon(packageManager));
                if (activityChooserView.L0 != 0) {
                    activityChooserView.v0.setContentDescription(activityChooserView.getContext().getString(activityChooserView.L0, resolveInfoG.loadLabel(packageManager)));
                }
            } else {
                activityChooserView.v0.setVisibility(8);
            }
            if (activityChooserView.v0.getVisibility() == 0) {
                activityChooserView.f1106r0.setBackgroundDrawable(activityChooserView.f1107s0);
            } else {
                activityChooserView.f1106r0.setBackgroundDrawable(null);
            }
        }
    }

    public class f extends BaseAdapter {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ActivityChooserModel f1118p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f1119q0 = 4;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f1120r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f1121s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f1122t0;

        public f() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int iF = this.f1118p0.f();
            if (!this.f1120r0 && this.f1118p0.g() != null) {
                iF--;
            }
            int iMin = Math.min(iF, this.f1119q0);
            return this.f1122t0 ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f1120r0 && this.f1118p0.g() != null) {
                i10++;
            }
            return this.f1118p0.e(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i10) {
            return (this.f1122t0 && i10 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i10);
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(activityChooserView.getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(androidx.appcompat.R.id.title)).setText(activityChooserView.getContext().getString(androidx.appcompat.R.string.abc_activity_chooser_view_see_all));
                return viewInflate;
            }
            if (view == null || view.getId() != androidx.appcompat.R.id.list_item) {
                view = LayoutInflater.from(activityChooserView.getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = activityChooserView.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(androidx.appcompat.R.id.icon);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i10);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(androidx.appcompat.R.id.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f1120r0 && i10 == 0 && this.f1121s0) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }
    }

    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            int i10 = 0;
            if (view != activityChooserView.v0) {
                if (view != activityChooserView.f1108t0) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.I0 = false;
                activityChooserView.a(activityChooserView.J0);
                return;
            }
            activityChooserView.dismissPopup();
            ResolveInfo resolveInfoG = ActivityChooserView.this.f1104p0.f1118p0.g();
            ActivityChooserModel activityChooserModel = ActivityChooserView.this.f1104p0.f1118p0;
            synchronized (activityChooserModel.f1090a) {
                try {
                    activityChooserModel.c();
                    ArrayList arrayList = activityChooserModel.f1091b;
                    int size = arrayList.size();
                    while (true) {
                        if (i10 >= size) {
                            i10 = -1;
                            break;
                        } else if (((ActivityChooserModel.ActivityResolveInfo) arrayList.get(i10)).resolveInfo == resolveInfoG) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intent intentB = ActivityChooserView.this.f1104p0.f1118p0.b(i10);
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            PopupWindow.OnDismissListener onDismissListener = activityChooserView.H0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            ActionProvider actionProvider = activityChooserView.f1112y0;
            if (actionProvider != null) {
                actionProvider.subUiVisibilityChanged(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.a(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.dismissPopup();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (!activityChooserView.I0) {
                f fVar = activityChooserView.f1104p0;
                if (!fVar.f1120r0) {
                    i10++;
                }
                Intent intentB = fVar.f1118p0.b(i10);
                if (intentB != null) {
                    intentB.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(intentB);
                    return;
                }
                return;
            }
            if (i10 > 0) {
                ActivityChooserModel activityChooserModel = activityChooserView.f1104p0.f1118p0;
                synchronized (activityChooserModel.f1090a) {
                    try {
                        activityChooserModel.c();
                        ActivityChooserModel.ActivityResolveInfo activityResolveInfo = (ActivityChooserModel.ActivityResolveInfo) activityChooserModel.f1091b.get(i10);
                        ActivityChooserModel.ActivityResolveInfo activityResolveInfo2 = (ActivityChooserModel.ActivityResolveInfo) activityChooserModel.f1091b.get(0);
                        float f6 = activityResolveInfo2 != null ? (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f : 1.0f;
                        ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                        activityChooserModel.a(new ActivityChooserModel.HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f6));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.v0) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f1104p0.getCount() > 0) {
                activityChooserView.I0 = true;
                activityChooserView.a(activityChooserView.J0);
            }
            return true;
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    public final void a(int i10) {
        f fVar = this.f1104p0;
        if (fVar.f1118p0 == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.F0);
        ?? r1 = this.v0.getVisibility() == 0 ? 1 : 0;
        int iF = fVar.f1118p0.f();
        if (i10 == Integer.MAX_VALUE || iF <= i10 + r1) {
            if (fVar.f1122t0) {
                fVar.f1122t0 = false;
                fVar.notifyDataSetChanged();
            }
            if (fVar.f1119q0 != i10) {
                fVar.f1119q0 = i10;
                fVar.notifyDataSetChanged();
            }
        } else {
            if (!fVar.f1122t0) {
                fVar.f1122t0 = true;
                fVar.notifyDataSetChanged();
            }
            int i11 = i10 - 1;
            if (fVar.f1119q0 != i11) {
                fVar.f1119q0 = i11;
                fVar.notifyDataSetChanged();
            }
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.isShowing()) {
            return;
        }
        if (this.I0 || r1 == 0) {
            if (!fVar.f1120r0 || fVar.f1121s0 != r1) {
                fVar.f1120r0 = true;
                fVar.f1121s0 = r1;
                fVar.notifyDataSetChanged();
            }
        } else if (fVar.f1120r0 || fVar.f1121s0) {
            fVar.f1120r0 = false;
            fVar.f1121s0 = false;
            fVar.notifyDataSetChanged();
        }
        int i12 = fVar.f1119q0;
        fVar.f1119q0 = Integer.MAX_VALUE;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = fVar.getCount();
        int iMax = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            view = fVar.getView(i13, view, null);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        fVar.f1119q0 = i12;
        listPopupWindow.setContentWidth(Math.min(iMax, this.f1111x0));
        listPopupWindow.show();
        ActionProvider actionProvider = this.f1112y0;
        if (actionProvider != null) {
            actionProvider.subUiVisibilityChanged(true);
        }
        listPopupWindow.getListView().setContentDescription(getContext().getString(androidx.appcompat.R.string.abc_activitychooserview_choose_application));
        listPopupWindow.getListView().setSelector(new ColorDrawable(0));
    }

    public boolean dismissPopup() {
        if (!isShowingPopup()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.F0);
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ActivityChooserModel getDataModel() {
        return this.f1104p0.f1118p0;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.G0 == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.G0 = listPopupWindow;
            listPopupWindow.setAdapter(this.f1104p0);
            this.G0.setAnchorView(this);
            this.G0.setModal(true);
            ListPopupWindow listPopupWindow2 = this.G0;
            g gVar = this.f1105q0;
            listPopupWindow2.setOnItemClickListener(gVar);
            this.G0.setOnDismissListener(gVar);
        }
        return this.G0;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel activityChooserModel = this.f1104p0.f1118p0;
        if (activityChooserModel != null) {
            activityChooserModel.registerObserver(this.E0);
        }
        this.K0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel activityChooserModel = this.f1104p0.f1118p0;
        if (activityChooserModel != null) {
            activityChooserModel.unregisterObserver(this.E0);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.F0);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.K0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f1106r0.layout(0, 0, i12 - i10, i13 - i11);
        if (isShowingPopup()) {
            return;
        }
        dismissPopup();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.v0.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        View view = this.f1106r0;
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        f fVar = this.f1104p0;
        ActivityChooserView activityChooserView = ActivityChooserView.this;
        ActivityChooserModel activityChooserModel2 = activityChooserView.f1104p0.f1118p0;
        a aVar = activityChooserView.E0;
        if (activityChooserModel2 != null && activityChooserView.isShown()) {
            activityChooserModel2.unregisterObserver(aVar);
        }
        fVar.f1118p0 = activityChooserModel;
        if (activityChooserModel != null && activityChooserView.isShown()) {
            activityChooserModel.registerObserver(aVar);
        }
        fVar.notifyDataSetChanged();
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.L0 = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f1109u0.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1109u0.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.J0 = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.H0 = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(ActionProvider actionProvider) {
        this.f1112y0 = actionProvider;
    }

    public boolean showPopup() {
        if (isShowingPopup() || !this.K0) {
            return false;
        }
        this.I0 = false;
        a(this.J0);
        return true;
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.E0 = new a();
        this.F0 = new b();
        this.J0 = 4;
        int[] iArr = androidx.appcompat.R.styleable.ActivityChooserView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        this.J0 = typedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        g gVar = new g();
        this.f1105q0 = gVar;
        View viewFindViewById = findViewById(androidx.appcompat.R.id.activity_chooser_view_content);
        this.f1106r0 = viewFindViewById;
        this.f1107s0 = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(androidx.appcompat.R.id.default_activity_button);
        this.v0 = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i11 = androidx.appcompat.R.id.image;
        this.f1110w0 = (ImageView) frameLayout.findViewById(i11);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(androidx.appcompat.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f1108t0 = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i11);
        this.f1109u0 = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f1104p0 = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f1111x0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_config_prefDialogWidth));
    }
}
