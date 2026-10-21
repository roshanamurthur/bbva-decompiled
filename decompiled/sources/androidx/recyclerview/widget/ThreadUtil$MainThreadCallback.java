package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes2.dex */
public interface ThreadUtil$MainThreadCallback<T> {
    @SuppressLint({"UnknownNullness"})
    void addTile(int i10, TileList.Tile<T> tile);

    void removeTile(int i10, int i11);

    void updateItemCount(int i10, int i11);
}
