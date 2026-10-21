package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncListUtil<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f22555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataCallback<T> f22557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewCallback f22558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TileList<T> f22559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f22560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f22561g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22565k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f22562h = new int[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f22563i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f22564j = new int[2];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22566l = 0;
    public int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22567n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22568o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SparseIntArray f22569p = new SparseIntArray();

    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @UiThread
        public void extendRangeInto(@NonNull int[] iArr, @NonNull int[] iArr2, int i10) {
            int i11 = iArr[1];
            int i12 = iArr[0];
            int i13 = (i11 - i12) + 1;
            int i14 = i13 / 2;
            iArr2[0] = i12 - (i10 == 1 ? i13 : i14);
            if (i10 != 2) {
                i13 = i14;
            }
            iArr2[1] = i11 + i13;
        }

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] iArr);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int i10);
    }

    public class a implements ThreadUtil$MainThreadCallback<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
        public final void addTile(int i10, TileList.Tile<T> tile) {
            TileList.Tile<T> tile2;
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            int i11 = 0;
            if (!(i10 == asyncListUtil.f22568o)) {
                asyncListUtil.f22561g.recycleTile(tile);
                return;
            }
            TileList<T> tileList = asyncListUtil.f22559e;
            SparseArray<TileList.Tile<T>> sparseArray = tileList.f22929b;
            int iIndexOfKey = sparseArray.indexOfKey(tile.mStartPosition);
            if (iIndexOfKey < 0) {
                sparseArray.put(tile.mStartPosition, tile);
                tile2 = null;
            } else {
                TileList.Tile<T> tileValueAt = sparseArray.valueAt(iIndexOfKey);
                sparseArray.setValueAt(iIndexOfKey, tile);
                if (tileList.f22930c == tileValueAt) {
                    tileList.f22930c = tile;
                }
                tile2 = tileValueAt;
            }
            if (tile2 != null) {
                asyncListUtil.f22561g.recycleTile(tile2);
            }
            int i12 = tile.mStartPosition + tile.mItemCount;
            while (true) {
                SparseIntArray sparseIntArray = asyncListUtil.f22569p;
                if (i11 >= sparseIntArray.size()) {
                    return;
                }
                int iKeyAt = sparseIntArray.keyAt(i11);
                if (tile.mStartPosition > iKeyAt || iKeyAt >= i12) {
                    i11++;
                } else {
                    sparseIntArray.removeAt(i11);
                    asyncListUtil.f22558d.onItemLoaded(iKeyAt);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
        public final void removeTile(int i10, int i11) {
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            if (i10 == asyncListUtil.f22568o) {
                TileList<T> tileList = asyncListUtil.f22559e;
                SparseArray<TileList.Tile<T>> sparseArray = tileList.f22929b;
                TileList.Tile<T> tile = sparseArray.get(i11);
                if (tileList.f22930c == tile) {
                    tileList.f22930c = null;
                }
                sparseArray.delete(i11);
                if (tile == null) {
                    return;
                }
                asyncListUtil.f22561g.recycleTile(tile);
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
        public final void updateItemCount(int i10, int i11) {
            TileList.Tile<T> tileValueAt;
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            if (i10 != asyncListUtil.f22568o) {
                return;
            }
            asyncListUtil.m = i11;
            asyncListUtil.f22558d.onDataRefresh();
            asyncListUtil.f22567n = asyncListUtil.f22568o;
            int i12 = 0;
            while (true) {
                TileList<T> tileList = asyncListUtil.f22559e;
                if (i12 >= tileList.f22929b.size()) {
                    tileList.f22929b.clear();
                    asyncListUtil.f22565k = false;
                    asyncListUtil.a();
                    return;
                }
                if (i12 >= 0) {
                    SparseArray<TileList.Tile<T>> sparseArray = tileList.f22929b;
                    if (i12 < sparseArray.size()) {
                        tileValueAt = sparseArray.valueAt(i12);
                    }
                    asyncListUtil.f22561g.recycleTile(tileValueAt);
                    i12++;
                } else {
                    tileList.getClass();
                }
                tileValueAt = null;
                asyncListUtil.f22561g.recycleTile(tileValueAt);
                i12++;
            }
        }
    }

    public class b implements ThreadUtil$BackgroundCallback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TileList.Tile<T> f22571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseBooleanArray f22572b = new SparseBooleanArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22576f;

        public b() {
        }

        public final void a(int i10, int i11, int i12, boolean z10) {
            int i13 = i10;
            while (i13 <= i11) {
                int i14 = z10 ? (i11 + i10) - i13 : i13;
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                asyncListUtil.f22561g.loadTile(i14, i12);
                i13 += asyncListUtil.f22556b;
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
        public final void loadTile(int i10, int i11) {
            SparseBooleanArray sparseBooleanArray = this.f22572b;
            if (sparseBooleanArray.get(i10)) {
                return;
            }
            TileList.Tile<T> tile = this.f22571a;
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            if (tile != null) {
                this.f22571a = tile.f22931a;
            } else {
                tile = new TileList.Tile<>(asyncListUtil.f22555a, asyncListUtil.f22556b);
            }
            tile.mStartPosition = i10;
            int iMin = Math.min(asyncListUtil.f22556b, this.f22574d - i10);
            tile.mItemCount = iMin;
            T[] tArr = tile.mItems;
            int i12 = tile.mStartPosition;
            DataCallback<T> dataCallback = asyncListUtil.f22557c;
            dataCallback.fillData(tArr, i12, iMin);
            int maxCachedTiles = dataCallback.getMaxCachedTiles();
            while (sparseBooleanArray.size() >= maxCachedTiles) {
                int iKeyAt = sparseBooleanArray.keyAt(0);
                int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i13 = this.f22575e - iKeyAt;
                int i14 = iKeyAt2 - this.f22576f;
                if (i13 > 0 && (i13 >= i14 || i11 == 2)) {
                    sparseBooleanArray.delete(iKeyAt);
                    asyncListUtil.f22560f.removeTile(this.f22573c, iKeyAt);
                } else {
                    if (i14 <= 0 || (i13 >= i14 && i11 != 1)) {
                        break;
                    }
                    sparseBooleanArray.delete(iKeyAt2);
                    asyncListUtil.f22560f.removeTile(this.f22573c, iKeyAt2);
                }
            }
            sparseBooleanArray.put(tile.mStartPosition, true);
            asyncListUtil.f22560f.addTile(this.f22573c, tile);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
        public final void recycleTile(TileList.Tile<T> tile) {
            AsyncListUtil.this.f22557c.recycleData(tile.mItems, tile.mItemCount);
            tile.f22931a = this.f22571a;
            this.f22571a = tile;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
        public final void refresh(int i10) {
            this.f22573c = i10;
            this.f22572b.clear();
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            int iRefreshData = asyncListUtil.f22557c.refreshData();
            this.f22574d = iRefreshData;
            asyncListUtil.f22560f.updateItemCount(this.f22573c, iRefreshData);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
        public final void updateRange(int i10, int i11, int i12, int i13, int i14) {
            if (i10 > i11) {
                return;
            }
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            int i15 = asyncListUtil.f22556b;
            int i16 = i10 - (i10 % i15);
            int i17 = i11 - (i11 % i15);
            int i18 = i12 - (i12 % i15);
            this.f22575e = i18;
            int i19 = i13 - (i13 % i15);
            this.f22576f = i19;
            if (i14 == 1) {
                a(i18, i17, i14, true);
                a(i17 + asyncListUtil.f22556b, this.f22576f, i14, false);
            } else {
                a(i16, i19, i14, false);
                a(this.f22575e, i16 - asyncListUtil.f22556b, i14, true);
            }
        }
    }

    public AsyncListUtil(@NonNull Class<T> cls, int i10, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
        a aVar = new a();
        b bVar = new b();
        this.f22555a = cls;
        this.f22556b = i10;
        this.f22557c = dataCallback;
        this.f22558d = viewCallback;
        this.f22559e = new TileList<>(i10);
        this.f22560f = new o(aVar);
        this.f22561g = new p(bVar);
        refresh();
    }

    public final void a() {
        int i10;
        ViewCallback viewCallback = this.f22558d;
        int[] iArr = this.f22562h;
        viewCallback.getItemRangeInto(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (i11 > i12 || i11 < 0 || i12 >= this.m) {
            return;
        }
        boolean z10 = this.f22565k;
        int[] iArr2 = this.f22563i;
        if (!z10 || i11 > iArr2[1] || (i10 = iArr2[0]) > i12) {
            this.f22566l = 0;
        } else if (i11 < i10) {
            this.f22566l = 1;
        } else if (i11 > i10) {
            this.f22566l = 2;
        }
        iArr2[0] = i11;
        iArr2[1] = i12;
        int i13 = this.f22566l;
        int[] iArr3 = this.f22564j;
        viewCallback.extendRangeInto(iArr, iArr3, i13);
        iArr3[0] = Math.min(iArr[0], Math.max(iArr3[0], 0));
        int iMax = Math.max(iArr[1], Math.min(iArr3[1], this.m - 1));
        iArr3[1] = iMax;
        this.f22561g.updateRange(iArr[0], iArr[1], iArr3[0], iMax, this.f22566l);
    }

    @Nullable
    public T getItem(int i10) {
        T t10;
        int i11;
        if (i10 < 0 || i10 >= this.m) {
            throw new IndexOutOfBoundsException(i10 + " is not within 0 and " + this.m);
        }
        TileList<T> tileList = this.f22559e;
        TileList.Tile<T> tile = tileList.f22930c;
        if (tile == null || (i11 = tile.mStartPosition) > i10 || i10 >= i11 + tile.mItemCount) {
            int i12 = i10 - (i10 % tileList.f22928a);
            SparseArray<TileList.Tile<T>> sparseArray = tileList.f22929b;
            int iIndexOfKey = sparseArray.indexOfKey(i12);
            if (iIndexOfKey < 0) {
                t10 = null;
            } else {
                tileList.f22930c = sparseArray.valueAt(iIndexOfKey);
                TileList.Tile<T> tile2 = tileList.f22930c;
                t10 = tile2.mItems[i10 - tile2.mStartPosition];
            }
        } else {
            TileList.Tile<T> tile3 = tileList.f22930c;
            t10 = tile3.mItems[i10 - tile3.mStartPosition];
        }
        if (t10 == null && this.f22568o == this.f22567n) {
            this.f22569p.put(i10, 0);
        }
        return t10;
    }

    public int getItemCount() {
        return this.m;
    }

    public void onRangeChanged() {
        if (this.f22568o != this.f22567n) {
            return;
        }
        a();
        this.f22565k = true;
    }

    public void refresh() {
        this.f22569p.clear();
        int i10 = this.f22568o + 1;
        this.f22568o = i10;
        this.f22561g.refresh(i10);
    }

    public static abstract class DataCallback<T> {
        @WorkerThread
        public abstract void fillData(@NonNull T[] tArr, int i10, int i11);

        @WorkerThread
        public int getMaxCachedTiles() {
            return 10;
        }

        @WorkerThread
        public abstract int refreshData();

        @WorkerThread
        public void recycleData(@NonNull T[] tArr, int i10) {
        }
    }
}
