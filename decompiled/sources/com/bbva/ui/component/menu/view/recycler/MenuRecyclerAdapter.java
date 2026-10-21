package com.bbva.ui.component.menu.view.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.ui.component.menu.databinding.LayoutSlideMenuItemBinding;
import com.bbva.ui.component.menu.model.MenuItem;
import com.bbva.ui.component.menu.view.recycler.MenuRecyclerAdapter;
import com.bbva.ui.component.menu.view.recycler.item.MenuItemView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuRecyclerAdapter.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00016B/\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u00020\u0005\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b4\u00105J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\tR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R?\u00101\u001a\u001f\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\t\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00067"}, d2 = {"Lcom/bbva/ui/component/menu/view/recycler/MenuRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bbva/ui/component/menu/view/recycler/MenuRecyclerAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "holder", "", "onBindViewHolder", "getItemCount", "paddingLeft", "paddingRight", "onOrientationChanged", "id", "", "checkItem", "isFeatured", "featureItem", "cleanAndCheckItem", "cleanFeaturedItems", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "r0", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "", "s0", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "setState", "(Ljava/lang/String;)V", "state", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "menuItem", "u0", "Lkotlin/jvm/functions/Function1;", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "setClickListener", "(Lkotlin/jvm/functions/Function1;)V", "clickListener", "itemPaddingLeft", "itemPaddingRight", "<init>", "(IILjava/util/List;Ljava/lang/String;)V", "ViewHolder", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenuRecyclerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuRecyclerAdapter.kt\ncom/bbva/ui/component/menu/view/recycler/MenuRecyclerAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n288#2,2:105\n288#2,2:107\n1860#2,3:109\n2630#2:112\n1860#2,3:114\n1#3:113\n*S KotlinDebug\n*F\n+ 1 MenuRecyclerAdapter.kt\ncom/bbva/ui/component/menu/view/recycler/MenuRecyclerAdapter\n*L\n63#1:105,2\n71#1:107,2\n79#1:109,3\n85#1:112\n86#1:114,3\n85#1:113\n*E\n"})
public final class MenuRecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f36997p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f36998q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends MenuItem> data;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String state;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f37001t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super MenuItem, Unit> clickListener;

    /* JADX INFO: compiled from: MenuRecyclerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/ui/component/menu/view/recycler/MenuRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/bbva/ui/component/menu/view/recycler/item/MenuItemView;", "(Lcom/bbva/ui/component/menu/view/recycler/MenuRecyclerAdapter;Lcom/bbva/ui/component/menu/view/recycler/item/MenuItemView;)V", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final /* synthetic */ int f37003p0 = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull final MenuRecyclerAdapter menuRecyclerAdapter, MenuItemView itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            itemView.setOnClickListener(new View.OnClickListener() { // from class: jc.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = MenuRecyclerAdapter.ViewHolder.f37003p0;
                    MenuRecyclerAdapter.ViewHolder this$0 = this.f79066p0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    MenuRecyclerAdapter this$1 = menuRecyclerAdapter;
                    Intrinsics.checkNotNullParameter(this$1, "this$1");
                    Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.bbva.ui.component.menu.view.recycler.item.MenuItemView");
                    MenuItemView menuItemView = (MenuItemView) view;
                    MenuItem f37022r0 = menuItemView.getF37022r0();
                    int adapterPosition = this$0.getAdapterPosition();
                    if (f37022r0 == null || adapterPosition == -1) {
                        return;
                    }
                    if (f37022r0.getIsCheckable() && !menuItemView.getF37023s0()) {
                        this$1.cleanAndCheckItem(adapterPosition);
                    }
                    Function1<MenuItem, Unit> clickListener = this$1.getClickListener();
                    if (clickListener != null) {
                        clickListener.invoke(f37022r0);
                    }
                }
            });
        }
    }

    public MenuRecyclerAdapter(int i10, int i11, @NotNull List<? extends MenuItem> data, @Nullable String str) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f36997p0 = i10;
        this.f36998q0 = i11;
        this.data = data;
        this.state = str;
        this.f37001t0 = -1;
    }

    public final boolean checkItem(int id) {
        Object next;
        Iterator<T> it = this.data.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MenuItem menuItem = (MenuItem) next;
            if (menuItem.getId() == id && menuItem.getIsCheckable()) {
                break;
            }
        }
        MenuItem menuItem2 = (MenuItem) next;
        if (menuItem2 == null) {
            return false;
        }
        cleanAndCheckItem(this.data.indexOf(menuItem2));
        return true;
    }

    public final void cleanAndCheckItem(int position) {
        int i10 = this.f37001t0;
        if (i10 >= 0) {
            notifyItemChanged(i10);
        }
        int i11 = 0;
        for (Object obj : this.data) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((MenuItem) obj).setChecked(i11 == position);
            i11 = i12;
        }
        this.f37001t0 = position;
        if (position >= 0) {
            notifyItemChanged(position);
        }
    }

    public final void cleanFeaturedItems() {
        int i10;
        List<? extends MenuItem> list = this.data;
        Iterator<T> it = list.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((MenuItem) it.next()).setFeatured(false);
            }
        }
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            notifyItemChanged(i10);
            i10 = i11;
        }
    }

    public final void featureItem(int id, boolean isFeatured) {
        Object next;
        Iterator<T> it = this.data.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((MenuItem) next).getId() != id);
        MenuItem menuItem = (MenuItem) next;
        if (menuItem != null) {
            menuItem.setFeatured(isFeatured);
            notifyItemChanged(this.data.indexOf(menuItem));
        }
    }

    @Nullable
    public final Function1<MenuItem, Unit> getClickListener() {
        return this.clickListener;
    }

    @NotNull
    public final List<MenuItem> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    public final void onOrientationChanged(int paddingLeft, int paddingRight) {
        this.f36997p0 = paddingLeft;
        this.f36998q0 = paddingRight;
    }

    public final void setClickListener(@Nullable Function1<? super MenuItem, Unit> function1) {
        this.clickListener = function1;
    }

    public final void setData(@NotNull List<? extends MenuItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setState(@Nullable String str) {
        this.state = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MenuItem menuItem = this.data.get(position);
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.bbva.ui.component.menu.view.recycler.item.MenuItemView");
        MenuItemView menuItemView = (MenuItemView) view;
        if (this.f36997p0 != menuItemView.getPaddingLeft() || this.f36998q0 != menuItemView.getPaddingRight()) {
            menuItemView.setPadding(this.f36997p0, menuItemView.getPaddingTop(), this.f36998q0, menuItemView.getPaddingBottom());
        }
        menuItemView.setItem(menuItem, this.state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int position) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        MenuItem menuItem = this.data.get(position);
        LayoutSlideMenuItemBinding layoutSlideMenuItemBindingInflate = LayoutSlideMenuItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(layoutSlideMenuItemBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        MenuItemView root = layoutSlideMenuItemBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        root.setPadding(this.f36997p0, root.getPaddingTop(), this.f36998q0, root.getPaddingBottom());
        root.setItem(menuItem, this.state);
        return new ViewHolder(this, root);
    }
}
