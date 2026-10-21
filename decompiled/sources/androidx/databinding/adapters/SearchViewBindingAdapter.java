package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.widget.SearchView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@BindingMethods({@BindingMethod(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @BindingMethod(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @BindingMethod(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class SearchViewBindingAdapter {

    @TargetApi(11)
    public interface OnQueryTextChange {
        boolean onQueryTextChange(String str);
    }

    @TargetApi(11)
    public interface OnQueryTextSubmit {
        boolean onQueryTextSubmit(String str);
    }

    @TargetApi(11)
    public interface OnSuggestionClick {
        boolean onSuggestionClick(int i10);
    }

    @TargetApi(11)
    public interface OnSuggestionSelect {
        boolean onSuggestionSelect(int i10);
    }

    public class a implements SearchView.OnQueryTextListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnQueryTextSubmit f20593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnQueryTextChange f20594b;

        public a(OnQueryTextSubmit onQueryTextSubmit, OnQueryTextChange onQueryTextChange) {
            this.f20593a = onQueryTextSubmit;
            this.f20594b = onQueryTextChange;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextChange(String str) {
            OnQueryTextChange onQueryTextChange = this.f20594b;
            if (onQueryTextChange != null) {
                return onQueryTextChange.onQueryTextChange(str);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextSubmit(String str) {
            OnQueryTextSubmit onQueryTextSubmit = this.f20593a;
            if (onQueryTextSubmit != null) {
                return onQueryTextSubmit.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    public class b implements SearchView.OnSuggestionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnSuggestionSelect f20595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnSuggestionClick f20596b;

        public b(OnSuggestionSelect onSuggestionSelect, OnSuggestionClick onSuggestionClick) {
            this.f20595a = onSuggestionSelect;
            this.f20596b = onSuggestionClick;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public final boolean onSuggestionClick(int i10) {
            OnSuggestionClick onSuggestionClick = this.f20596b;
            if (onSuggestionClick != null) {
                return onSuggestionClick.onSuggestionClick(i10);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public final boolean onSuggestionSelect(int i10) {
            OnSuggestionSelect onSuggestionSelect = this.f20595a;
            if (onSuggestionSelect != null) {
                return onSuggestionSelect.onSuggestionSelect(i10);
            }
            return false;
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void setOnQueryTextListener(SearchView searchView, OnQueryTextSubmit onQueryTextSubmit, OnQueryTextChange onQueryTextChange) {
        if (onQueryTextSubmit == null && onQueryTextChange == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new a(onQueryTextSubmit, onQueryTextChange));
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void setOnSuggestListener(SearchView searchView, OnSuggestionSelect onSuggestionSelect, OnSuggestionClick onSuggestionClick) {
        if (onSuggestionSelect == null && onSuggestionClick == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new b(onSuggestionSelect, onSuggestionClick));
        }
    }
}
