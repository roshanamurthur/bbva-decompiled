package com.noknok.android.client.utils;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FragmentTracker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static FragmentTracker f63441c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63443a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63440b = FragmentData.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SparseArray<FragmentData> f63442d = new SparseArray<>();

    public static class FragmentData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Fragment f63444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<FragmentUpdater> f63445b = new ArrayList();

        public FragmentData(Fragment fragment) {
            this.f63444a = fragment;
        }
    }

    public interface FragmentUpdater {
        void update(Fragment fragment);
    }

    public static FragmentTracker getFragmentTracker() {
        if (f63441c == null) {
            f63441c = new FragmentTracker();
        }
        return f63441c;
    }

    public int generateFragmentId() {
        int i10 = this.f63443a;
        this.f63443a = i10 + 1;
        return i10;
    }

    public void onCreateViewFragment(int i10, Fragment fragment) {
        SparseArray<FragmentData> sparseArray = f63442d;
        FragmentData fragmentData = sparseArray.get(i10);
        if (fragmentData == null) {
            sparseArray.put(i10, new FragmentData(fragment));
            return;
        }
        fragmentData.f63444a = fragment;
        Iterator it = fragmentData.f63445b.iterator();
        while (it.hasNext()) {
            ((FragmentUpdater) it.next()).update(fragment);
        }
        fragmentData.f63445b.clear();
    }

    public void onDetachFragment(int i10) {
        Fragment fragment;
        SparseArray<FragmentData> sparseArray = f63442d;
        FragmentData fragmentData = sparseArray.get(i10);
        if (fragmentData == null || (fragment = fragmentData.f63444a) == null) {
            Logger.e(f63440b, "onDetachFragment called multiple times");
        } else if (fragment.isRemoving()) {
            sparseArray.remove(i10);
        } else {
            fragmentData.f63444a = null;
        }
    }

    public void updateFragment(int i10, FragmentUpdater fragmentUpdater) {
        FragmentData fragmentData = f63442d.get(i10);
        if (fragmentData == null) {
            Logger.w(f63440b, "Not updating fragment has been permanently deleted");
            return;
        }
        Fragment fragment = fragmentData.f63444a;
        if (fragment == null) {
            fragmentData.f63445b.add(fragmentUpdater);
        } else {
            fragmentUpdater.update(fragment);
        }
    }
}
