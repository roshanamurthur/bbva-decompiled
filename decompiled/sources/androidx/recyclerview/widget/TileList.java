package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class TileList<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<Tile<T>> f22929b = new SparseArray<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Tile<T> f22930c;

    public static class Tile<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Tile<T> f22931a;
        public int mItemCount;
        public final T[] mItems;
        public int mStartPosition;

        public Tile(@NonNull Class<T> cls, int i10) {
            this.mItems = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
        }
    }

    public TileList(int i10) {
        this.f22928a = i10;
    }
}
