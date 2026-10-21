package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList<b> f21610p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public FrameLayout f21611q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Context f21612r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public FragmentManager f21613s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f21614t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TabHost.OnTabChangeListener f21615u0;
    public b v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f21616w0;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f21617p0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f21617p0 = parcel.readString();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentTabHost.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" curTab=");
            return ad.d.f(sb2, this.f21617p0, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f21617p0);
        }
    }

    public static class a implements TabHost.TabContentFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f21618a;

        public a(Context context) {
            this.f21618a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public final View createTabContent(String str) {
            View view = new View(this.f21618a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f21619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Class<?> f21620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Bundle f21621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Fragment f21622d;

        public b(@Nullable Bundle bundle, @NonNull String str, @NonNull Class cls) {
            this.f21619a = str;
            this.f21620b = cls;
            this.f21621c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context) {
        super(context, null);
        this.f21610p0 = new ArrayList<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.inflatedId}, 0, 0);
        this.f21614t0 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Nullable
    public final FragmentTransaction a(@Nullable FragmentTransaction fragmentTransaction, @Nullable String str) {
        b bVar;
        Fragment fragment;
        ArrayList<b> arrayList = this.f21610p0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = arrayList.get(i10);
            if (bVar.f21619a.equals(str)) {
                break;
            }
            i10++;
        }
        if (this.v0 != bVar) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.f21613s0.beginTransaction();
            }
            b bVar2 = this.v0;
            if (bVar2 != null && (fragment = bVar2.f21622d) != null) {
                fragmentTransaction.detach(fragment);
            }
            if (bVar != null) {
                Fragment fragment2 = bVar.f21622d;
                if (fragment2 == null) {
                    Fragment fragmentInstantiate = this.f21613s0.getFragmentFactory().instantiate(this.f21612r0.getClassLoader(), bVar.f21620b.getName());
                    bVar.f21622d = fragmentInstantiate;
                    fragmentInstantiate.setArguments(bVar.f21621c);
                    fragmentTransaction.add(this.f21614t0, bVar.f21622d, bVar.f21619a);
                } else {
                    fragmentTransaction.attach(fragment2);
                }
            }
            this.v0 = bVar;
        }
        return fragmentTransaction;
    }

    @Deprecated
    public void addTab(@NonNull TabHost.TabSpec tabSpec, @NonNull Class<?> cls, @Nullable Bundle bundle) {
        tabSpec.setContent(new a(this.f21612r0));
        String tag = tabSpec.getTag();
        b bVar = new b(bundle, tag, cls);
        if (this.f21616w0) {
            Fragment fragmentFindFragmentByTag = this.f21613s0.findFragmentByTag(tag);
            bVar.f21622d = fragmentFindFragmentByTag;
            if (fragmentFindFragmentByTag != null && !fragmentFindFragmentByTag.isDetached()) {
                FragmentTransaction fragmentTransactionBeginTransaction = this.f21613s0.beginTransaction();
                fragmentTransactionBeginTransaction.detach(bVar.f21622d);
                fragmentTransactionBeginTransaction.commit();
            }
        }
        this.f21610p0.add(bVar);
        addTab(tabSpec);
    }

    public final void b() {
        if (this.f21611q0 == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f21614t0);
            this.f21611q0 = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f21614t0);
        }
    }

    public final void c(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f21611q0 = frameLayout2;
            frameLayout2.setId(this.f21614t0);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        ArrayList<b> arrayList = this.f21610p0;
        int size = arrayList.size();
        FragmentTransaction fragmentTransactionBeginTransaction = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            Fragment fragmentFindFragmentByTag = this.f21613s0.findFragmentByTag(bVar.f21619a);
            bVar.f21622d = fragmentFindFragmentByTag;
            if (fragmentFindFragmentByTag != null && !fragmentFindFragmentByTag.isDetached()) {
                if (bVar.f21619a.equals(currentTabTag)) {
                    this.v0 = bVar;
                } else {
                    if (fragmentTransactionBeginTransaction == null) {
                        fragmentTransactionBeginTransaction = this.f21613s0.beginTransaction();
                    }
                    fragmentTransactionBeginTransaction.detach(bVar.f21622d);
                }
            }
        }
        this.f21616w0 = true;
        FragmentTransaction fragmentTransactionA = a(fragmentTransactionBeginTransaction, currentTabTag);
        if (fragmentTransactionA != null) {
            fragmentTransactionA.commit();
            this.f21613s0.executePendingTransactions();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21616w0 = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f21617p0);
    }

    @Override // android.view.View
    @NonNull
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f21617p0 = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@Nullable String str) {
        FragmentTransaction fragmentTransactionA;
        if (this.f21616w0 && (fragmentTransactionA = a(null, str)) != null) {
            fragmentTransactionA.commit();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f21615u0;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener onTabChangeListener) {
        this.f21615u0 = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        c(context);
        super.setup();
        this.f21612r0 = context;
        this.f21613s0 = fragmentManager;
        b();
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21610p0 = new ArrayList<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f21614t0 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void setup(@NonNull Context context, @NonNull FragmentManager fragmentManager, int i10) {
        c(context);
        super.setup();
        this.f21612r0 = context;
        this.f21613s0 = fragmentManager;
        this.f21614t0 = i10;
        b();
        this.f21611q0.setId(i10);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }
}
