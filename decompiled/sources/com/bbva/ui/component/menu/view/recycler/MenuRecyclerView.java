package com.bbva.ui.component.menu.view.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.camera.core.impl.utils.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bk.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuRecyclerView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/bbva/ui/component/menu/view/recycler/MenuRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/bbva/ui/component/menu/view/recycler/MenuRecyclerAdapter;", "getAdapter", "", "reset", "", "<set-?>", "b2", "Lkotlin/properties/ReadWriteProperty;", "getTopSpace", "()I", "setTopSpace", "(I)V", "topSpace", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenuRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuRecyclerView.kt\ncom/bbva/ui/component/menu/view/recycler/MenuRecyclerView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n33#2,3:55\n1549#3:58\n1620#3,3:59\n*S KotlinDebug\n*F\n+ 1 MenuRecyclerView.kt\ncom/bbva/ui/component/menu/view/recycler/MenuRecyclerView\n*L\n17#1:55,3\n32#1:58\n32#1:59,3\n*E\n"})
public final class MenuRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f37004c2 = {c.e(MenuRecyclerView.class, "topSpace", "getTopSpace()I", 0)};

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    @NotNull
    public final MenuRecyclerView$special$$inlined$observable$1 f37005b2;

    /* JADX INFO: compiled from: MenuRecyclerView.kt */
    public static final class a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37006a;

        public a(int i10) {
            this.f37006a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            if (parent.getChildAdapterPosition(view) == 0) {
                outRect.top += this.f37006a;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MenuRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final List access$getItemsDecoration(MenuRecyclerView menuRecyclerView, Class cls) {
        IntRange intRangeUntil = kotlin.ranges.c.until(0, menuRecyclerView.getItemDecorationCount());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(menuRecyclerView.getItemDecorationAt(((IntIterator) it).nextInt()));
        }
        return i.filterIsInstance(arrayList, cls);
    }

    public final int getTopSpace() {
        return getValue(this, f37004c2[0]).intValue();
    }

    public final void reset() {
        stopScroll();
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
    }

    public final void setTopSpace(int i10) {
        setValue(this, f37004c2[0], Integer.valueOf(i10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MenuRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @NotNull
    public MenuRecyclerAdapter getAdapter() {
        RecyclerView.Adapter adapter = super.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.bbva.ui.component.menu.view.recycler.MenuRecyclerAdapter");
        return (MenuRecyclerAdapter) adapter;
    }

    public /* synthetic */ MenuRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.bbva.ui.component.menu.view.recycler.MenuRecyclerView$special$$inlined$observable$1] */
    @JvmOverloads
    public MenuRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Delegates delegates = Delegates.INSTANCE;
        final int i11 = 0;
        this.f37005b2 = new ObservableProperty<Integer>(i11) { // from class: com.bbva.ui.component.menu.view.recycler.MenuRecyclerView$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                int iIntValue = newValue.intValue();
                oldValue.intValue();
                MenuRecyclerView menuRecyclerView = this;
                Iterator it = MenuRecyclerView.access$getItemsDecoration(menuRecyclerView, MenuRecyclerView.a.class).iterator();
                while (it.hasNext()) {
                    menuRecyclerView.removeItemDecoration((RecyclerView.ItemDecoration) it.next());
                }
                menuRecyclerView.addItemDecoration(new MenuRecyclerView.a(iIntValue));
            }
        };
        setItemAnimator(null);
        setLayoutManager(new LinearLayoutManager(context));
    }
}
