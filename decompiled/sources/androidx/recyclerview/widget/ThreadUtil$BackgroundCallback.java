package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes2.dex */
public interface ThreadUtil$BackgroundCallback<T> {
    void loadTile(int i10, int i11);

    @SuppressLint({"UnknownNullness"})
    void recycleTile(TileList.Tile<T> tile);

    void refresh(int i10);

    void updateRange(int i10, int i11, int i12, int i13, int i14);
}
