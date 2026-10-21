package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MenuBuilder f940p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f941q0 = -1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f942r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f943s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final LayoutInflater f944t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f945u0;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f943s0 = z10;
        this.f944t0 = layoutInflater;
        this.f940p0 = menuBuilder;
        this.f945u0 = i10;
        a();
    }

    public final void a() {
        MenuBuilder menuBuilder = this.f940p0;
        MenuItemImpl expandedItem = menuBuilder.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> nonActionItems = menuBuilder.getNonActionItems();
            int size = nonActionItems.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (nonActionItems.get(i10) == expandedItem) {
                    this.f941q0 = i10;
                    return;
                }
            }
        }
        this.f941q0 = -1;
    }

    public MenuBuilder getAdapterMenu() {
        return this.f940p0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        boolean z10 = this.f943s0;
        MenuBuilder menuBuilder = this.f940p0;
        ArrayList<MenuItemImpl> nonActionItems = z10 ? menuBuilder.getNonActionItems() : menuBuilder.getVisibleItems();
        return this.f941q0 < 0 ? nonActionItems.size() : nonActionItems.size() - 1;
    }

    public boolean getForceShowIcon() {
        return this.f942r0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f944t0.inflate(this.f945u0, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f940p0.isGroupDividerEnabled() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.f942r0) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean z10) {
        this.f942r0 = z10;
    }

    @Override // android.widget.Adapter
    public MenuItemImpl getItem(int i10) {
        boolean z10 = this.f943s0;
        MenuBuilder menuBuilder = this.f940p0;
        ArrayList<MenuItemImpl> nonActionItems = z10 ? menuBuilder.getNonActionItems() : menuBuilder.getVisibleItems();
        int i11 = this.f941q0;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return nonActionItems.get(i10);
    }
}
