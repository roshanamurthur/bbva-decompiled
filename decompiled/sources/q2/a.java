package q2;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.ObservableList;
import java.util.List;

/* JADX INFO: compiled from: ObservableListAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a<T> extends BaseAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public List<T> f92750p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public C0481a f92751q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Context f92752r0;
    public final LayoutInflater v0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f92754t0 = R.layout.simple_spinner_item;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f92753s0 = R.layout.simple_spinner_dropdown_item;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f92755u0 = 0;

    /* JADX INFO: renamed from: q2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ObservableListAdapter.java */
    public class C0481a extends ObservableList.OnListChangedCallback {
        public C0481a() {
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onChanged(ObservableList observableList) {
            a.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onItemRangeChanged(ObservableList observableList, int i10, int i11) {
            a.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onItemRangeInserted(ObservableList observableList, int i10, int i11) {
            a.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onItemRangeMoved(ObservableList observableList, int i10, int i11, int i12) {
            a.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onItemRangeRemoved(ObservableList observableList, int i10, int i11) {
            a.this.notifyDataSetChanged();
        }
    }

    public a(Context context, List list) {
        this.f92752r0 = context;
        this.v0 = (LayoutInflater) context.getSystemService("layout_inflater");
        b(list);
    }

    public final View a(int i10, int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i10 == 0 ? new TextView(this.f92752r0) : this.v0.inflate(i10, viewGroup, false);
        }
        int i12 = this.f92755u0;
        TextView textView = (TextView) (i12 == 0 ? view : view.findViewById(i12));
        T t10 = this.f92750p0.get(i11);
        textView.setText(t10 instanceof CharSequence ? (CharSequence) t10 : String.valueOf(t10));
        return view;
    }

    public final void b(List<T> list) {
        List<T> list2 = this.f92750p0;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof ObservableList) {
            ((ObservableList) list2).removeOnListChangedCallback(this.f92751q0);
        }
        this.f92750p0 = list;
        if (list instanceof ObservableList) {
            if (this.f92751q0 == null) {
                this.f92751q0 = new C0481a();
            }
            ((ObservableList) this.f92750p0).addOnListChangedCallback(this.f92751q0);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f92750p0.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return a(this.f92753s0, i10, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return this.f92750p0.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        return a(this.f92754t0, i10, view, viewGroup);
    }
}
