package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ListFragment extends Fragment {
    public boolean E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Handler f21657p0 = new Handler();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final a f21658q0 = new a();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final b f21659r0 = new b();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ListAdapter f21660s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ListView f21661t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public View f21662u0;
    public TextView v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public View f21663w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public View f21664x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CharSequence f21665y0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListView listView = ListFragment.this.f21661t0;
            listView.focusableViewAvailable(listView);
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            ListFragment.this.onListItemClick((ListView) adapterView, view, i10, j10);
        }
    }

    public final void c() {
        if (this.f21661t0 != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f21661t0 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.v0 = textView;
            if (textView == null) {
                this.f21662u0 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f21663w0 = view.findViewById(16711682);
            this.f21664x0 = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f21661t0 = listView;
            View view2 = this.f21662u0;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f21665y0;
                if (charSequence != null) {
                    this.v0.setText(charSequence);
                    this.f21661t0.setEmptyView(this.v0);
                }
            }
        }
        this.E0 = true;
        this.f21661t0.setOnItemClickListener(this.f21659r0);
        ListAdapter listAdapter = this.f21660s0;
        if (listAdapter != null) {
            this.f21660s0 = null;
            setListAdapter(listAdapter);
        } else if (this.f21663w0 != null) {
            d(false, false);
        }
        this.f21657p0.post(this.f21658q0);
    }

    public final void d(boolean z10, boolean z11) {
        c();
        View view = this.f21663w0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.E0 == z10) {
            return;
        }
        this.E0 = z10;
        if (z10) {
            if (z11) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f21664x0.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f21664x0.clearAnimation();
            }
            this.f21663w0.setVisibility(8);
            this.f21664x0.setVisibility(0);
            return;
        }
        if (z11) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f21664x0.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f21664x0.clearAnimation();
        }
        this.f21663w0.setVisibility(0);
        this.f21664x0.setVisibility(8);
    }

    @Nullable
    public ListAdapter getListAdapter() {
        return this.f21660s0;
    }

    @NonNull
    public ListView getListView() {
        c();
        return this.f21661t0;
    }

    public long getSelectedItemId() {
        c();
        return this.f21661t0.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        c();
        return this.f21661t0.getSelectedItemPosition();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f21657p0.removeCallbacks(this.f21658q0);
        this.f21661t0 = null;
        this.E0 = false;
        this.f21664x0 = null;
        this.f21663w0 = null;
        this.f21662u0 = null;
        this.v0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        c();
    }

    @NonNull
    public final ListAdapter requireListAdapter() {
        ListAdapter listAdapter = getListAdapter();
        if (listAdapter != null) {
            return listAdapter;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void setEmptyText(@Nullable CharSequence charSequence) {
        c();
        TextView textView = this.v0;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f21665y0 == null) {
            this.f21661t0.setEmptyView(this.v0);
        }
        this.f21665y0 = charSequence;
    }

    public void setListAdapter(@Nullable ListAdapter listAdapter) {
        boolean z10 = this.f21660s0 != null;
        this.f21660s0 = listAdapter;
        ListView listView = this.f21661t0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.E0 || z10) {
                return;
            }
            d(true, requireView().getWindowToken() != null);
        }
    }

    public void setListShown(boolean z10) {
        d(z10, true);
    }

    public void setListShownNoAnimation(boolean z10) {
        d(z10, false);
    }

    public void setSelection(int i10) {
        c();
        this.f21661t0.setSelection(i10);
    }

    public void onListItemClick(@NonNull ListView listView, @NonNull View view, int i10, long j10) {
    }
}
