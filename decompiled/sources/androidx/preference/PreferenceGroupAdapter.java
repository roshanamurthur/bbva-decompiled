package androidx.preference;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.animation.core.AnimationKt;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class PreferenceGroupAdapter extends RecyclerView.Adapter<PreferenceViewHolder> implements Preference.b, PreferenceGroup.PreferencePositionCallback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PreferenceGroup f22377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f22378q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArrayList f22379r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ArrayList f22380s0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final a f22382u0 = new a();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Handler f22381t0 = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PreferenceGroupAdapter.this.d();
        }
    }

    public class b extends DiffUtil.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f22384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f22385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PreferenceManager.PreferenceComparisonCallback f22386c;

        public b(List list, ArrayList arrayList, PreferenceManager.PreferenceComparisonCallback preferenceComparisonCallback) {
            this.f22384a = list;
            this.f22385b = arrayList;
            this.f22386c = preferenceComparisonCallback;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean areContentsTheSame(int i10, int i11) {
            return this.f22386c.arePreferenceContentsTheSame((Preference) this.f22384a.get(i10), (Preference) this.f22385b.get(i11));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final boolean areItemsTheSame(int i10, int i11) {
            return this.f22386c.arePreferenceItemsTheSame((Preference) this.f22384a.get(i10), (Preference) this.f22385b.get(i11));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final int getNewListSize() {
            return this.f22385b.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public final int getOldListSize() {
            return this.f22384a.size();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22389c;

        public c(@NonNull Preference preference) {
            this.f22389c = preference.getClass().getName();
            this.f22387a = preference.getLayoutResource();
            this.f22388b = preference.getWidgetLayoutResource();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22387a == cVar.f22387a && this.f22388b == cVar.f22388b && TextUtils.equals(this.f22389c, cVar.f22389c);
        }

        public final int hashCode() {
            return this.f22389c.hashCode() + ((((527 + this.f22387a) * 31) + this.f22388b) * 31);
        }
    }

    public PreferenceGroupAdapter(@NonNull PreferenceGroup preferenceGroup) {
        this.f22377p0 = preferenceGroup;
        preferenceGroup.f22297d1 = this;
        this.f22378q0 = new ArrayList();
        this.f22379r0 = new ArrayList();
        this.f22380s0 = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).shouldUseGeneratedIds());
        } else {
            setHasStableIds(true);
        }
        d();
    }

    public static boolean c(PreferenceGroup preferenceGroup) {
        return preferenceGroup.getInitialExpandedChildrenCount() != Integer.MAX_VALUE;
    }

    public final ArrayList a(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Preference> arrayList2 = new ArrayList();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i10 = 0;
        for (int i11 = 0; i11 < preferenceCount; i11++) {
            Preference preference = preferenceGroup.getPreference(i11);
            if (preference.isVisible()) {
                if (!c(preferenceGroup) || i10 < preferenceGroup.getInitialExpandedChildrenCount()) {
                    arrayList.add(preference);
                } else {
                    arrayList2.add(preference);
                }
                if (preference instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                    if (!preferenceGroup2.isOnSameScreenAsChildren()) {
                        continue;
                    } else {
                        if (c(preferenceGroup) && c(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference2 : a(preferenceGroup2)) {
                            if (!c(preferenceGroup) || i10 < preferenceGroup.getInitialExpandedChildrenCount()) {
                                arrayList.add(preference2);
                            } else {
                                arrayList2.add(preference2);
                            }
                            i10++;
                        }
                    }
                } else {
                    i10++;
                }
            }
        }
        if (c(preferenceGroup) && i10 > preferenceGroup.getInitialExpandedChildrenCount()) {
            Context context = preferenceGroup.getContext();
            long j10 = preferenceGroup.f22308s0;
            androidx.preference.a aVar = new androidx.preference.a(context);
            aVar.setLayoutResource(R.layout.expand_button);
            aVar.setIcon(R.drawable.ic_arrow_down_24dp);
            aVar.setTitle(R.string.expand_button_title);
            aVar.setOrder(RoomDatabase.MAX_BIND_PARAMETER_CNT);
            ArrayList arrayList3 = new ArrayList();
            CharSequence string = null;
            for (Preference preference3 : arrayList2) {
                CharSequence title = preference3.getTitle();
                boolean z10 = preference3 instanceof PreferenceGroup;
                if (z10 && !TextUtils.isEmpty(title)) {
                    arrayList3.add((PreferenceGroup) preference3);
                }
                if (arrayList3.contains(preference3.getParent())) {
                    if (z10) {
                        arrayList3.add((PreferenceGroup) preference3);
                    }
                } else if (!TextUtils.isEmpty(title)) {
                    string = string == null ? title : aVar.getContext().getString(R.string.summary_collapsed_preference_list, string, title);
                }
            }
            aVar.setSummary(string);
            aVar.f22444l1 = j10 + AnimationKt.MillisToNanos;
            aVar.setOnPreferenceClickListener(new e(this, preferenceGroup));
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final void b(PreferenceGroup preferenceGroup, ArrayList arrayList) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f22369n1);
        }
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i10 = 0; i10 < preferenceCount; i10++) {
            Preference preference = preferenceGroup.getPreference(i10);
            arrayList.add(preference);
            c cVar = new c(preference);
            if (!this.f22380s0.contains(cVar)) {
                this.f22380s0.add(cVar);
            }
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (preferenceGroup2.isOnSameScreenAsChildren()) {
                    b(preferenceGroup2, arrayList);
                }
            }
            preference.f22297d1 = this;
        }
    }

    public final void d() {
        Iterator it = this.f22378q0.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).f22297d1 = null;
        }
        ArrayList arrayList = new ArrayList(this.f22378q0.size());
        this.f22378q0 = arrayList;
        PreferenceGroup preferenceGroup = this.f22377p0;
        b(preferenceGroup, arrayList);
        ArrayList arrayList2 = this.f22379r0;
        ArrayList arrayListA = a(preferenceGroup);
        this.f22379r0 = arrayListA;
        PreferenceManager preferenceManager = preferenceGroup.getPreferenceManager();
        if (preferenceManager == null || preferenceManager.getPreferenceComparisonCallback() == null) {
            notifyDataSetChanged();
        } else {
            DiffUtil.calculateDiff(new b(arrayList2, arrayListA, preferenceManager.getPreferenceComparisonCallback())).dispatchUpdatesTo(this);
        }
        Iterator it2 = this.f22378q0.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).f22300g1 = false;
        }
    }

    @Nullable
    public Preference getItem(int i10) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return null;
        }
        return (Preference) this.f22379r0.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f22379r0.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        if (hasStableIds()) {
            return getItem(i10).a();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        c cVar = new c(getItem(i10));
        ArrayList arrayList = this.f22380s0;
        int iIndexOf = arrayList.indexOf(cVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(cVar);
        return size;
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public int getPreferenceAdapterPosition(@NonNull String str) {
        int size = this.f22379r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (TextUtils.equals(str, ((Preference) this.f22379r0.get(i10)).getKey())) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.b
    public void onPreferenceChange(@NonNull Preference preference) {
        int iIndexOf = this.f22379r0.indexOf(preference);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.b
    public void onPreferenceHierarchyChange(@NonNull Preference preference) {
        Handler handler = this.f22381t0;
        a aVar = this.f22382u0;
        handler.removeCallbacks(aVar);
        handler.post(aVar);
    }

    @Override // androidx.preference.Preference.b
    public void onPreferenceVisibilityChange(@NonNull Preference preference) {
        onPreferenceHierarchyChange(preference);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder, int i10) {
        ColorStateList colorStateList;
        Preference item = getItem(i10);
        Drawable background = preferenceViewHolder.itemView.getBackground();
        Drawable drawable = preferenceViewHolder.f22412p0;
        if (background != drawable) {
            ViewCompat.setBackground(preferenceViewHolder.itemView, drawable);
        }
        TextView textView = (TextView) preferenceViewHolder.findViewById(android.R.id.title);
        if (textView != null && (colorStateList = preferenceViewHolder.f22413q0) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        item.onBindViewHolder(preferenceViewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public PreferenceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        c cVar = (c) this.f22380s0.get(i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.BackgroundStyle);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = AppCompatResources.getDrawable(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(cVar.f22387a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            ViewCompat.setBackground(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i11 = cVar.f22388b;
            if (i11 != 0) {
                layoutInflaterFrom.inflate(i11, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new PreferenceViewHolder(viewInflate);
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public int getPreferenceAdapterPosition(@NonNull Preference preference) {
        int size = this.f22379r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preference2 = (Preference) this.f22379r0.get(i10);
            if (preference2 != null && preference2.equals(preference)) {
                return i10;
            }
        }
        return -1;
    }
}
