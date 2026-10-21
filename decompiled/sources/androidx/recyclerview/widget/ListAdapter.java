package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AsyncListDiffer<T> f22731p0;

    public class a implements AsyncListDiffer.ListListener<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
        public final void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2) {
            ListAdapter.this.onCurrentListChanged(list, list2);
        }
    }

    public ListAdapter(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
        a aVar = new a();
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), new AsyncDifferConfig.Builder(itemCallback).build());
        this.f22731p0 = asyncListDiffer;
        asyncListDiffer.addListListener(aVar);
    }

    @NonNull
    public List<T> getCurrentList() {
        return this.f22731p0.getCurrentList();
    }

    public T getItem(int i10) {
        return this.f22731p0.getCurrentList().get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f22731p0.getCurrentList().size();
    }

    public void submitList(@Nullable List<T> list) {
        this.f22731p0.submitList(list);
    }

    public void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
        this.f22731p0.submitList(list, runnable);
    }

    public ListAdapter(@NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        a aVar = new a();
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), asyncDifferConfig);
        this.f22731p0 = asyncListDiffer;
        asyncListDiffer.addListListener(aVar);
    }

    public void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2) {
    }
}
