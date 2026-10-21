package androidx.appcompat.widget;

import android.R;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import com.bbva.nativesettings.common.Constants;
import com.google.android.gms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {
    public static final l B1;
    public final WeakHashMap<String, Drawable.ConstantState> A1;
    public final SearchAutoComplete J0;
    public final View K0;
    public final View L0;
    public final View M0;
    public final ImageView N0;
    public final ImageView O0;
    public final ImageView P0;
    public final ImageView Q0;
    public final View R0;
    public m S0;
    public final Rect T0;
    public final Rect U0;
    public final int[] V0;
    public final int[] W0;
    public final ImageView X0;
    public final Drawable Y0;
    public final int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final int f1388a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final Intent f1389b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final Intent f1390c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final CharSequence f1391d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public OnQueryTextListener f1392e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public OnCloseListener f1393f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public View.OnFocusChangeListener f1394g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public OnSuggestionListener f1395h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public View.OnClickListener f1396i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f1397j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f1398k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public CursorAdapter f1399l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f1400m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public CharSequence f1401n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f1402o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f1403p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f1404q1;
    public boolean r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public String f1405s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public CharSequence f1406t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f1407u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f1408v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public SearchableInfo f1409w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public Bundle f1410x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final b f1411y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final c f1412z1;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1413a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1417e;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1414b = propertyMapper.mapInt("imeOptions", R.attr.imeOptions);
            this.f1415c = propertyMapper.mapInt("maxWidth", R.attr.maxWidth);
            this.f1416d = propertyMapper.mapBoolean("iconifiedByDefault", androidx.appcompat.R.attr.iconifiedByDefault);
            this.f1417e = propertyMapper.mapObject("queryHint", androidx.appcompat.R.attr.queryHint);
            this.f1413a = true;
        }

        public void readProperties(@NonNull SearchView searchView, @NonNull PropertyReader propertyReader) {
            if (!this.f1413a) {
                throw androidx.appcompat.widget.j.c();
            }
            propertyReader.readInt(this.f1414b, searchView.getImeOptions());
            propertyReader.readInt(this.f1415c, searchView.getMaxWidth());
            propertyReader.readBoolean(this.f1416d, searchView.isIconfiedByDefault());
            propertyReader.readObject(this.f1417e, searchView.getQueryHint());
        }
    }

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i10);

        boolean onSuggestionSelect(int i10);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f1418q0;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1418q0 = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" isIconified=");
            return androidx.appcompat.app.i.c(sb2, this.f1418q0, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1418q0));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f1419t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public SearchView f1420u0;
        public boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final a f1421w0;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.v0) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService(Constants.INPUT_METHOD)).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.v0 = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            l lVar = SearchView.B1;
            lVar.getClass();
            l.a();
            Method method = lVar.f1435c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1419t0 <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.v0) {
                a aVar = this.f1421w0;
                removeCallbacks(aVar);
                post(aVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f1420u0;
            searchView.o(searchView.isIconified());
            searchView.post(searchView.f1411y1);
            if (searchView.J0.hasFocus()) {
                searchView.e();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1420u0.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1420u0.hasFocus() && getVisibility() == 0) {
                this.v0 = true;
                Context context = getContext();
                l lVar = SearchView.B1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(Constants.INPUT_METHOD);
            a aVar = this.f1421w0;
            if (!z10) {
                this.v0 = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.v0 = true;
                    return;
                }
                this.v0 = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1420u0 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1419t0 = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, androidx.appcompat.R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1421w0 = new a();
            this.f1419t0 = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.k();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CursorAdapter cursorAdapter = SearchView.this.f1399l1;
            if (cursorAdapter instanceof p1) {
                cursorAdapter.changeCursor(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1394g1;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int dimensionPixelSize;
            SearchView searchView = SearchView.this;
            View view2 = searchView.R0;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.L0.getPaddingLeft();
                Rect rect = new Rect();
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(searchView);
                if (searchView.f1397j1) {
                    dimensionPixelSize = resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_dropdownitem_icon_width);
                } else {
                    dimensionPixelSize = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.J0;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                searchAutoComplete.setDropDownHorizontalOffset(zIsLayoutRtl ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.N0;
            SearchAutoComplete searchAutoComplete = searchView.J0;
            if (view == imageView) {
                searchView.o(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f1396i1;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.P0) {
                searchView.f();
                return;
            }
            if (view == searchView.O0) {
                searchView.i();
                return;
            }
            if (view != searchView.Q0) {
                if (view == searchAutoComplete) {
                    searchView.e();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f1409w1;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.d(searchView.f1390c1, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f1389b1);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1409w1 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.J0;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.c("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                return true;
            }
            if (searchView.f1409w1 == null || searchView.f1399l1 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return searchView.g(searchAutoComplete.getListSelection());
            }
            if (i10 != 21 && i10 != 22) {
                if (i10 != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(i10 == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            searchAutoComplete.a();
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.i();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.g(i10);
        }
    }

    @RequiresApi(29)
    public static class k {
        @DoNotInline
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @DoNotInline
        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f1433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f1434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f1435c;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class m extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f1436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f1437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f1438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f1439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1441f;

        public m(SearchAutoComplete searchAutoComplete, Rect rect, Rect rect2) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f1440e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f1437b = rect3;
            Rect rect4 = new Rect();
            this.f1439d = rect4;
            Rect rect5 = new Rect();
            this.f1438c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f1436a = searchAutoComplete;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x4 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1441f;
                    if (z11 && !this.f1439d.contains(x4, y7)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f1441f;
                    this.f1441f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f1437b.contains(x4, y7)) {
                this.f1441f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            Rect rect = this.f1438c;
            View view = this.f1436a;
            if (!z10 || rect.contains(x4, y7)) {
                motionEvent.setLocation(x4 - rect.left, y7 - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        l lVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            l lVar2 = new l();
            lVar2.f1433a = null;
            lVar2.f1434b = null;
            lVar2.f1435c = null;
            l.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                lVar2.f1433a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                lVar2.f1434b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                lVar2.f1435c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            lVar = lVar2;
        }
        B1 = lVar;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_search_view_preferred_width);
    }

    public final Intent c(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1406t1);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1410x1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1409w1.getSearchActivity());
        return intent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1403p1 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.J0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1403p1 = false;
    }

    public final Intent d(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1410x1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void e() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.J0;
        if (i10 >= 29) {
            k.a(searchAutoComplete);
            return;
        }
        l lVar = B1;
        lVar.getClass();
        l.a();
        Method method = lVar.f1433a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        lVar.getClass();
        l.a();
        Method method2 = lVar.f1434b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void f() {
        SearchAutoComplete searchAutoComplete = this.J0;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f1397j1) {
            OnCloseListener onCloseListener = this.f1393f1;
            if (onCloseListener == null || !onCloseListener.onClose()) {
                clearFocus();
                o(true);
            }
        }
    }

    public final boolean g(int i10) {
        int position;
        String strE;
        OnSuggestionListener onSuggestionListener = this.f1395h1;
        if (onSuggestionListener != null && onSuggestionListener.onSuggestionClick(i10)) {
            return false;
        }
        Cursor cursor = this.f1399l1.getCursor();
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intentC = null;
            try {
                int i11 = p1.K0;
                String strE2 = p1.e(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strE2 == null) {
                    strE2 = this.f1409w1.getSuggestIntentAction();
                }
                if (strE2 == null) {
                    strE2 = "android.intent.action.SEARCH";
                }
                String strE3 = p1.e(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strE3 == null) {
                    strE3 = this.f1409w1.getSuggestIntentData();
                }
                if (strE3 != null && (strE = p1.e(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strE3 = strE3 + "/" + Uri.encode(strE);
                }
                intentC = c(strE2, strE3 == null ? null : Uri.parse(strE3), p1.e(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), p1.e(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e5) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e5);
            }
            if (intentC != null) {
                try {
                    getContext().startActivity(intentC);
                } catch (RuntimeException unused2) {
                    intentC.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.J0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
        return true;
    }

    public int getImeOptions() {
        return this.J0.getImeOptions();
    }

    public int getInputType() {
        return this.J0.getInputType();
    }

    public int getMaxWidth() {
        return this.f1404q1;
    }

    public CharSequence getQuery() {
        return this.J0.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1401n1;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1409w1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1391d1 : getContext().getText(this.f1409w1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1388a1;
    }

    public int getSuggestionRowLayout() {
        return this.Z0;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.f1399l1;
    }

    public final void h(int i10) {
        OnSuggestionListener onSuggestionListener = this.f1395h1;
        if (onSuggestionListener == null || !onSuggestionListener.onSuggestionSelect(i10)) {
            Editable text = this.J0.getText();
            Cursor cursor = this.f1399l1.getCursor();
            if (cursor == null) {
                return;
            }
            if (!cursor.moveToPosition(i10)) {
                setQuery(text);
                return;
            }
            CharSequence charSequenceConvertToString = this.f1399l1.convertToString(cursor);
            if (charSequenceConvertToString != null) {
                setQuery(charSequenceConvertToString);
            } else {
                setQuery(text);
            }
        }
    }

    public final void i() {
        SearchAutoComplete searchAutoComplete = this.J0;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OnQueryTextListener onQueryTextListener = this.f1392e1;
        if (onQueryTextListener == null || !onQueryTextListener.onQueryTextSubmit(text.toString())) {
            if (this.f1409w1 != null) {
                getContext().startActivity(c("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public boolean isIconfiedByDefault() {
        return this.f1397j1;
    }

    public boolean isIconified() {
        return this.f1398k1;
    }

    public boolean isQueryRefinementEnabled() {
        return this.f1402o1;
    }

    public boolean isSubmitButtonEnabled() {
        return this.f1400m1;
    }

    public final void j() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.J0.getText());
        if (!z11 && (!this.f1397j1 || this.f1407u1)) {
            z10 = false;
        }
        int i10 = z10 ? 0 : 8;
        ImageView imageView = this.P0;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void k() {
        int[] iArr = this.J0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.L0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.M0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z10 = this.f1397j1;
        SearchAutoComplete searchAutoComplete = this.J0;
        CharSequence charSequence2 = charSequence;
        if (z10 && (drawable = this.Y0) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void m() {
        this.M0.setVisibility(((this.f1400m1 || this.r1) && !isIconified() && (this.O0.getVisibility() == 0 || this.Q0.getVisibility() == 0)) ? 0 : 8);
    }

    public final void n(boolean z10) {
        boolean z11 = this.f1400m1;
        this.O0.setVisibility((!z11 || !(z11 || this.r1) || isIconified() || !hasFocus() || (!z10 && this.r1)) ? 8 : 0);
    }

    public final void o(boolean z10) {
        this.f1398k1 = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.J0.getText());
        this.N0.setVisibility(i11);
        n(!zIsEmpty);
        this.K0.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.X0;
        if (imageView.getDrawable() != null && !this.f1397j1) {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        j();
        p(zIsEmpty);
        m();
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        o(true);
        this.J0.setImeOptions(this.f1408v1);
        this.f1407u1 = false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewExpanded() {
        if (this.f1407u1) {
            return;
        }
        this.f1407u1 = true;
        SearchAutoComplete searchAutoComplete = this.J0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f1408v1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1411y1);
        post(this.f1412z1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int[] iArr = this.V0;
            SearchAutoComplete searchAutoComplete = this.J0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.W0;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.T0;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.U0;
            rect2.set(i16, 0, i17, i18);
            m mVar = this.S0;
            if (mVar == null) {
                m mVar2 = new m(searchAutoComplete, rect2, rect);
                this.S0 = mVar2;
                setTouchDelegate(mVar2);
            } else {
                mVar.f1437b.set(rect2);
                Rect rect3 = mVar.f1439d;
                rect3.set(rect2);
                int i19 = -mVar.f1440e;
                rect3.inset(i19, i19);
                mVar.f1438c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (isIconified()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f1404q1;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1404q1;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f1404q1) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onQueryRefine(@Nullable CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        o(savedState.f1418q0);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1418q0 = isIconified();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f1411y1);
    }

    public final void p(boolean z10) {
        int i10 = 8;
        if (this.r1 && !isIconified() && z10) {
            this.O0.setVisibility(8);
            i10 = 0;
        }
        this.Q0.setVisibility(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f1403p1 || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.J0.requestFocus(i10, rect);
        if (zRequestFocus) {
            o(false);
        }
        return zRequestFocus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f1410x1 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            f();
            return;
        }
        o(false);
        SearchAutoComplete searchAutoComplete = this.J0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1396i1;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1397j1 == z10) {
            return;
        }
        this.f1397j1 = z10;
        o(z10);
        l();
    }

    public void setImeOptions(int i10) {
        this.J0.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.J0.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1404q1 = i10;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.f1393f1 = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1394g1 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.f1392e1 = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1396i1 = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.f1395h1 = onSuggestionListener;
    }

    public void setQuery(CharSequence charSequence, boolean z10) {
        SearchAutoComplete searchAutoComplete = this.J0;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1406t1 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        i();
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.f1401n1 = charSequence;
        l();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f1402o1 = z10;
        CursorAdapter cursorAdapter = this.f1399l1;
        if (cursorAdapter instanceof p1) {
            ((p1) cursorAdapter).f1652x0 = z10 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1409w1 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.J0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1409w1.getImeOptions());
            int inputType = this.f1409w1.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1409w1.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            CursorAdapter cursorAdapter = this.f1399l1;
            if (cursorAdapter != null) {
                cursorAdapter.changeCursor(null);
            }
            if (this.f1409w1.getSuggestAuthority() != null) {
                p1 p1Var = new p1(getContext(), this, this.f1409w1, this.A1);
                this.f1399l1 = p1Var;
                searchAutoComplete.setAdapter(p1Var);
                ((p1) this.f1399l1).f1652x0 = this.f1402o1 ? 2 : 1;
            }
            l();
        }
        SearchableInfo searchableInfo2 = this.f1409w1;
        boolean z10 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1409w1.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1389b1;
            } else if (this.f1409w1.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1390c1;
            }
            if (intent != null) {
                z10 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.r1 = z10;
        if (z10) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        o(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1400m1 = z10;
        o(isIconified());
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.f1399l1 = cursorAdapter;
        this.J0.setAdapter(cursorAdapter);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.T0 = new Rect();
        this.U0 = new Rect();
        this.V0 = new int[2];
        this.W0 = new int[2];
        this.f1411y1 = new b();
        this.f1412z1 = new c();
        this.A1 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = androidx.appcompat.R.styleable.SearchView;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        LayoutInflater.from(context).inflate(tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SearchView_layout, androidx.appcompat.R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(androidx.appcompat.R.id.search_src_text);
        this.J0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.K0 = findViewById(androidx.appcompat.R.id.search_edit_frame);
        View viewFindViewById = findViewById(androidx.appcompat.R.id.search_plate);
        this.L0 = viewFindViewById;
        View viewFindViewById2 = findViewById(androidx.appcompat.R.id.submit_area);
        this.M0 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(androidx.appcompat.R.id.search_button);
        this.N0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(androidx.appcompat.R.id.search_go_btn);
        this.O0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(androidx.appcompat.R.id.search_close_btn);
        this.P0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(androidx.appcompat.R.id.search_voice_btn);
        this.Q0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(androidx.appcompat.R.id.search_mag_icon);
        this.X0 = imageView5;
        ViewCompat.setBackground(viewFindViewById, tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_queryBackground));
        ViewCompat.setBackground(viewFindViewById2, tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_submitBackground));
        int i11 = androidx.appcompat.R.styleable.SearchView_searchIcon;
        imageView.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(i11));
        imageView2.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_goIcon));
        imageView3.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(i11));
        this.Y0 = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_searchHintIcon);
        TooltipCompat.setTooltipText(imageView, getResources().getString(androidx.appcompat.R.string.abc_searchview_description_search));
        this.Z0 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SearchView_suggestionRowLayout, androidx.appcompat.R.layout.abc_search_dropdown_item_icons_2line);
        this.f1388a1 = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1391d1 = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.SearchView_defaultQueryHint);
        this.f1401n1 = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.SearchView_queryHint);
        int i12 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SearchView_android_imeOptions, -1);
        if (i12 != -1) {
            setImeOptions(i12);
        }
        int i13 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SearchView_android_inputType, -1);
        if (i13 != -1) {
            setInputType(i13);
        }
        setFocusable(tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SearchView_android_focusable, true));
        tintTypedArrayObtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1389b1 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1390c1 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.R0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        o(this.f1397j1);
        l();
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.J0;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.J0.getText();
            searchView.f1406t1 = text;
            boolean zIsEmpty = TextUtils.isEmpty(text);
            searchView.n(!zIsEmpty);
            searchView.p(zIsEmpty);
            searchView.j();
            searchView.m();
            if (searchView.f1392e1 != null && !TextUtils.equals(charSequence, searchView.f1405s1)) {
                searchView.f1392e1.onQueryTextChange(charSequence.toString());
            }
            searchView.f1405s1 = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.h(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
