package com.bbva.ui.component.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.core.h0;
import androidx.camera.core.processing.m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bbva.cells.component.kit.ui.helper.ContextHelper;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.helper.UnitHelper;
import com.bbva.cells.component.kit.ui.property.UIComponentConfigurator;
import com.bbva.cellscore.app.CellsViewModelProviders;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.component.menu.SlideMenuView;
import com.bbva.ui.component.menu.databinding.ViewSlideMenuBinding;
import com.bbva.ui.component.menu.databinding.ViewSlideMenuItemsBinding;
import com.bbva.ui.component.menu.extensions.MapExtensionKt;
import com.bbva.ui.component.menu.extensions.ViewExtensionKt;
import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.bbva.ui.component.menu.model.HeaderSubItem;
import com.bbva.ui.component.menu.model.MenuItem;
import com.bbva.ui.component.menu.view.SavedState;
import com.bbva.ui.component.menu.view.recycler.MenuRecyclerAdapter;
import com.bbva.ui.component.menu.view.recycler.MenuRecyclerView;
import com.bbva.ui.component.menu.view.recycler.item.HeaderMenuItemView;
import com.bbva.ui.component.menu.view.recycler.item.MenuItemView;
import com.bbva.ui.component.menu.view.recycler.item.ShadowView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yarolegovich.slidingrootnav.SlideGravity;
import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;
import com.yarolegovich.slidingrootnav.callback.DragStateListener;
import ic.e;
import ic.f;
import ic.g;
import ic.h;
import ic.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import l5.i;
import l5.j;
import l5.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlideMenuView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u008d\u0001\u008c\u0001\u008e\u0001B8\b\u0007\u0012\u0007\u0010\u0085\u0001\u001a\u000203\u0012\f\b\u0002\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001\u0012\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u000b\u0012\t\b\u0002\u0010\u0089\u0001\u001a\u00020\u000b¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014J \u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u001c\u0010\u0018\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\"\u0010\u001c\u001a\u00020\u00072\u001a\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00150\u0019J\u001c\u0010\u001e\u001a\u00020\u00072\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0015J\u000e\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fJ\u001c\u0010#\u001a\u00020\u00072\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0015J(\u0010%\u001a\u00020\u00072 \u0010$\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00150\u0015J\u0006\u0010&\u001a\u00020\u0011J\u0006\u0010'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u0007J\u0006\u0010)\u001a\u00020\u0007J\u0006\u0010*\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u000bJ\u0006\u0010-\u001a\u00020\u0007J\u0016\u0010/\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0011J\u0006\u00100\u001a\u00020\u0007J\u001e\u00102\u001a\u00020\u00072\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015H\u0002R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R/\u0010\u0006\u001a\u0004\u0018\u00010\u00162\b\u0010>\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR/\u0010K\u001a\u0004\u0018\u00010E2\b\u0010>\u001a\u0004\u0018\u00010E8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR7\u00101\u001a\b\u0012\u0004\u0012\u00020L0\u00192\f\u0010>\u001a\b\u0012\u0004\u0012\u00020L0\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010@\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR/\u0010W\u001a\u0004\u0018\u00010L2\b\u0010>\u001a\u0004\u0018\u00010L8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010@\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010]\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010@\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R/\u0010`\u001a\u0004\u0018\u00010\u00162\b\u0010>\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010@\u001a\u0004\b_\u0010B\"\u0004\b\u0018\u0010DR\u0014\u0010c\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010ZR\u0016\u0010\u0082\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010ZR\u0016\u0010\u0084\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010Z¨\u0006\u008f\u0001"}, d2 = {"Lcom/bbva/ui/component/menu/SlideMenuView;", "Landroid/widget/FrameLayout;", "Lcom/yarolegovich/slidingrootnav/callback/DragStateListener;", "Lcom/bbva/ui/component/menu/OrientationListener;", "Landroid/os/Parcelable;", "onSaveInstanceState", "state", "", "onRestoreInstanceState", "Landroid/view/View;", "child", "", FirebaseAnalytics.Param.INDEX, "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "onDragStart", "", "isMenuOpened", "onDragEnd", "onOrientationChanged", "", "", "map", "setCloseAccessibilityLabel", "", "", "itemsConfig", "setMenuItemsConfig", "headerConfig", "setHeaderItemConfig", "", "shadowedItemsCount", "setShadowedItemConfig", "footerConfig", "setFooterItemConfig", "config", "setInfoMenuItemConfig", "isOpen", TrackMessageOpenedCommand.ACTION, HearingDisabilitiesConstants.CLOSE_MODAL, "lock", "unlock", "id", "checkItem", "clearFeaturedItems", "isFeatured", "featureItem", "cleanCheckedItems", FirebaseAnalytics.Param.ITEMS, "setupFeaturedItems", "Landroid/content/Context;", "q0", "Lkotlin/Lazy;", "getWrappedContext", "()Landroid/content/Context;", "wrappedContext", "Lcom/bbva/ui/component/menu/databinding/ViewSlideMenuItemsBinding;", "s0", "getMenuBinding", "()Lcom/bbva/ui/component/menu/databinding/ViewSlideMenuItemsBinding;", "menuBinding", "<set-?>", "v0", "Lkotlin/properties/ReadWriteProperty;", "getState", "()Ljava/lang/String;", "setState", "(Ljava/lang/String;)V", "Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", "w0", "getHeaderItem", "()Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", "setHeaderItem", "(Lcom/bbva/ui/component/menu/model/HeaderMenuItem;)V", "headerItem", "Lcom/bbva/ui/component/menu/model/MenuItem;", "x0", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "y0", "getFooterItem", "()Lcom/bbva/ui/component/menu/model/MenuItem;", "setFooterItem", "(Lcom/bbva/ui/component/menu/model/MenuItem;)V", "footerItem", "E0", "getShadowItemsCount", "()I", "setShadowItemsCount", "(I)V", "shadowItemsCount", "F0", "getCloseAccessibilityLabel", "closeAccessibilityLabel", "getDraggableLayout", "()Landroid/widget/FrameLayout;", "draggableLayout", "getClickableLayout", "()Landroid/view/View;", "clickableLayout", "Lcom/bbva/ui/component/menu/view/recycler/MenuRecyclerView;", "getRecyclerView", "()Lcom/bbva/ui/component/menu/view/recycler/MenuRecyclerView;", "recyclerView", "Lcom/bbva/ui/component/menu/view/recycler/item/HeaderMenuItemView;", "getHeaderMenuItemView", "()Lcom/bbva/ui/component/menu/view/recycler/item/HeaderMenuItemView;", "headerMenuItemView", "Lcom/bbva/ui/component/menu/view/recycler/item/MenuItemView;", "getFooterMenuItemView", "()Lcom/bbva/ui/component/menu/view/recycler/item/MenuItemView;", "footerMenuItemView", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getFooterGroup", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "footerGroup", "Lcom/bbva/ui/component/menu/view/recycler/item/ShadowView;", "getShadowView", "()Lcom/bbva/ui/component/menu/view/recycler/item/ShadowView;", "shadowView", "", "getDraggableLayoutPercentageWidth", "()F", "draggableLayoutPercentageWidth", "getMenuDraggableDistancePx", "menuDraggableDistancePx", "getItemPaddingLeft", "itemPaddingLeft", "getItemPaddingRight", "itemPaddingRight", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "a", "Position", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlideMenuView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlideMenuView.kt\ncom/bbva/ui/component/menu/SlideMenuView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,565:1\n33#2,3:566\n33#2,3:569\n33#2,3:572\n33#2,3:575\n33#2,3:578\n33#2,3:581\n1#3:584\n1549#4:585\n1620#4,3:586\n211#5,2:589\n*S KotlinDebug\n*F\n+ 1 SlideMenuView.kt\ncom/bbva/ui/component/menu/SlideMenuView\n*L\n150#1:566,3\n151#1:569,3\n152#1:572,3\n153#1:575,3\n154#1:578,3\n155#1:581,3\n292#1:585\n292#1:586,3\n557#1:589,2\n*E\n"})
public final class SlideMenuView extends FrameLayout implements DragStateListener, OrientationListener {

    @NotNull
    public final SlideMenuView$special$$inlined$observable$5 E0;

    @NotNull
    public final SlideMenuView$special$$inlined$observable$6 F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SlideMenuViewModel f36940p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy wrappedContext;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ViewSlideMenuBinding f36942r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy menuBinding;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final SlidingRootNav f36944t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Position f36945u0;

    @NotNull
    public final SlideMenuView$special$$inlined$observable$1 v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final SlideMenuView$special$$inlined$observable$2 f36946w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final SlideMenuView$special$$inlined$observable$3 f36947x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final SlideMenuView$special$$inlined$observable$4 f36948y0;
    public static final /* synthetic */ KProperty<Object>[] G0 = {androidx.camera.core.impl.utils.c.e(SlideMenuView.class, "state", "getState()Ljava/lang/String;", 0), androidx.camera.core.impl.utils.c.e(SlideMenuView.class, "headerItem", "getHeaderItem()Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", 0), androidx.camera.core.impl.utils.c.e(SlideMenuView.class, FirebaseAnalytics.Param.ITEMS, "getItems()Ljava/util/List;", 0), androidx.camera.core.impl.utils.c.e(SlideMenuView.class, "footerItem", "getFooterItem()Lcom/bbva/ui/component/menu/model/MenuItem;", 0), androidx.camera.core.impl.utils.c.e(SlideMenuView.class, "shadowItemsCount", "getShadowItemsCount()I", 0), androidx.camera.core.impl.utils.c.e(SlideMenuView.class, "closeAccessibilityLabel", "getCloseAccessibilityLabel()Ljava/lang/String;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SlideMenuView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/bbva/ui/component/menu/SlideMenuView$Companion;", "", "", "MENU_WIDTH", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "", "SCALE_FACTOR", "F", "<init>", "()V", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Context access$wrapContext(Companion companion, Context context, AttributeSet attributeSet) {
            companion.getClass();
            if (attributeSet == null) {
                return context;
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.cellsMenuStyle}, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…s(attrs, styleable, 0, 0)");
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.style.MenuStyle);
            typedArrayObtainStyledAttributes.recycle();
            return new ContextThemeWrapper(context, resourceId);
        }
    }

    /* JADX INFO: compiled from: SlideMenuView.kt */
    public enum Position {
        LEFT(0),
        RIGHT(1);


        @NotNull
        public static final Companion Companion = new Companion(null);
        private int id;

        /* JADX INFO: compiled from: SlideMenuView.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ui/component/menu/SlideMenuView$Position$Companion;", "", "()V", "fromId", "Lcom/bbva/ui/component/menu/SlideMenuView$Position;", "id", "", "fromId$component_ui_menu_release", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nSlideMenuView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlideMenuView.kt\ncom/bbva/ui/component/menu/SlideMenuView$Position$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,565:1\n1282#2,2:566\n*S KotlinDebug\n*F\n+ 1 SlideMenuView.kt\ncom/bbva/ui/component/menu/SlideMenuView$Position$Companion\n*L\n78#1:566,2\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
            @NotNull
            public final Position fromId$component_ui_menu_release(int id) {
                for (Position position : Position.values()) {
                    if (id == position.a()) {
                        if (position == null) {
                            return Position.LEFT;
                        }
                        return position;
                    }
                }
                position = null;
                if (position == null) {
                    return Position.LEFT;
                }
                return position;
            }
        }

        Position(int i10) {
            this.id = i10;
        }

        public final int a() {
            return this.id;
        }
    }

    /* JADX INFO: compiled from: SlideMenuView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MENU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SlideMenuView.kt */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CONTENT;
        public static final a MENU;

        static {
            a aVar = new a("MENU", 0);
            MENU = aVar;
            a aVar2 = new a("CONTENT", 1);
            CONTENT = aVar2;
            $VALUES = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: SlideMenuView.kt */
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View view2 = view;
            SlideMenuView slideMenuView = SlideMenuView.this;
            HeaderMenuItem headerItem = slideMenuView.getHeaderItem();
            HeaderSubItem thirdLine = headerItem != null ? headerItem.getThirdLine() : null;
            if ((view2 instanceof CellsTextView) && thirdLine != null) {
                slideMenuView.f36940p0.onThirdLineClick(HeaderSubItem.copy$default(thirdLine, 0, ((CellsTextView) view2).getText().toString(), null, 5, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SlideMenuView.kt */
    public static final class c extends Lambda implements Function0<ViewSlideMenuItemsBinding> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewSlideMenuItemsBinding invoke() {
            return ViewSlideMenuItemsBinding.inflate(LayoutInflater.from(SlideMenuView.this.getWrappedContext()));
        }
    }

    /* JADX INFO: compiled from: SlideMenuView.kt */
    public static final class d extends Lambda implements Function0<Context> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36951p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AttributeSet f36952q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, AttributeSet attributeSet) {
            super(0);
            this.f36951p0 = context;
            this.f36952q0 = attributeSet;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            return Companion.access$wrapContext(SlideMenuView.INSTANCE, this.f36951p0, this.f36952q0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideMenuView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$invalidateFooterView(SlideMenuView slideMenuView) {
        MenuItemView footerMenuItemView = slideMenuView.getFooterMenuItemView();
        MenuItem footerItem = slideMenuView.getFooterItem();
        if (footerItem != null) {
            footerMenuItemView.setItem(footerItem, slideMenuView.getState());
            footerMenuItemView.setOnClickListener(new ic.a(footerMenuItemView, slideMenuView, 0, footerItem));
        } else {
            footerMenuItemView.setVisibility(8);
        }
        slideMenuView.post(new m(slideMenuView, 2));
    }

    public static final void access$invalidateShadowView(SlideMenuView slideMenuView) {
        slideMenuView.getHeaderMenuItemView().reset();
        slideMenuView.getRecyclerView().reset();
        slideMenuView.getShadowView().reset();
        slideMenuView.post(new h0(slideMenuView, 3));
    }

    public static final void access$lock(SlideMenuView slideMenuView, Boolean bool) {
        SlidingRootNav slidingRootNav = slideMenuView.f36944t0;
        if (slidingRootNav == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slidingRootNav");
            slidingRootNav = null;
        }
        slidingRootNav.setMenuLocked(bool != null ? bool.booleanValue() : false);
    }

    public static final void access$setupState(SlideMenuView slideMenuView) {
        slideMenuView.getRecyclerView().getAdapter().setState(slideMenuView.getState());
        HeaderMenuItem headerItem = slideMenuView.getHeaderItem();
        if (headerItem != null) {
            slideMenuView.getHeaderMenuItemView().setItem(headerItem, slideMenuView.getState());
        }
        MenuItem footerItem = slideMenuView.getFooterItem();
        if (footerItem != null) {
            slideMenuView.getFooterMenuItemView().setItem(footerItem, slideMenuView.getState());
        }
    }

    public static final void access$toggle(SlideMenuView slideMenuView, Boolean bool) {
        slideMenuView.getClass();
        if (bool != null) {
            SlidingRootNav slidingRootNav = null;
            if (bool.booleanValue()) {
                slideMenuView.getClickableLayout().setClickable(true);
                SlidingRootNav slidingRootNav2 = slideMenuView.f36944t0;
                if (slidingRootNav2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("slidingRootNav");
                } else {
                    slidingRootNav = slidingRootNav2;
                }
                slidingRootNav.openMenu();
                slideMenuView.c(a.MENU);
                return;
            }
            slideMenuView.getClickableLayout().setClickable(false);
            SlidingRootNav slidingRootNav3 = slideMenuView.f36944t0;
            if (slidingRootNav3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("slidingRootNav");
            } else {
                slidingRootNav = slidingRootNav3;
            }
            slidingRootNav.closeMenu();
            slideMenuView.c(a.CONTENT);
        }
    }

    public static void b(SlideMenuView this$0) {
        View childAt;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getShadowItemsCount() <= 0) {
            this$0.getShadowView().getLayoutParams().height = 0;
            this$0.getShadowView().requestLayout();
            return;
        }
        int shadowItemsCount = this$0.getShadowItemsCount() - 1;
        if (shadowItemsCount >= this$0.getRecyclerView().getChildCount() || (childAt = this$0.getRecyclerView().getChildAt(shadowItemsCount)) == null) {
            return;
        }
        this$0.getShadowView().getLayoutParams().height = childAt.getBottom() + this$0.getRecyclerView().getTop() + (this$0.getShadowView().getTriangleHeight() / 2);
        this$0.getShadowView().requestLayout();
    }

    private final View getClickableLayout() {
        View view = this.f36942r0.clickableLayout;
        Intrinsics.checkNotNullExpressionValue(view, "containerBinding.clickableLayout");
        return view;
    }

    private final FrameLayout getDraggableLayout() {
        FrameLayout frameLayout = this.f36942r0.draggableLayout;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "containerBinding.draggableLayout");
        return frameLayout;
    }

    private final float getDraggableLayoutPercentageWidth() {
        return Math.abs(1 - (320 / (getResources().getDisplayMetrics().widthPixels / (getResources().getDisplayMetrics().densityDpi / 160))));
    }

    private final LinearLayoutCompat getFooterGroup() {
        LinearLayoutCompat linearLayoutCompat = getMenuBinding().footerGroup;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "menuBinding.footerGroup");
        return linearLayoutCompat;
    }

    private final MenuItemView getFooterMenuItemView() {
        MenuItemView menuItemView = getMenuBinding().footerMenuItemView;
        Intrinsics.checkNotNullExpressionValue(menuItemView, "menuBinding.footerMenuItemView");
        return menuItemView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderMenuItemView getHeaderMenuItemView() {
        HeaderMenuItemView headerMenuItemView = getMenuBinding().headerMenuItemView;
        Intrinsics.checkNotNullExpressionValue(headerMenuItemView, "menuBinding.headerMenuItemView");
        return headerMenuItemView;
    }

    private final int getItemPaddingLeft() {
        int iDpToPixels = (int) UnitHelper.dpToPixels(getResources(), 32.0f);
        int draggableLayoutPercentageWidth = (int) (getResources().getDisplayMetrics().widthPixels * getDraggableLayoutPercentageWidth());
        if (this.f36945u0 == Position.LEFT) {
            draggableLayoutPercentageWidth = getPaddingLeft();
        }
        return draggableLayoutPercentageWidth + iDpToPixels;
    }

    private final int getItemPaddingRight() {
        int iDpToPixels = (int) UnitHelper.dpToPixels(getResources(), 16.0f);
        int draggableLayoutPercentageWidth = (int) (getResources().getDisplayMetrics().widthPixels * getDraggableLayoutPercentageWidth());
        if (this.f36945u0 != Position.LEFT) {
            draggableLayoutPercentageWidth = getPaddingRight();
        }
        return draggableLayoutPercentageWidth + iDpToPixels;
    }

    private final ViewSlideMenuItemsBinding getMenuBinding() {
        return (ViewSlideMenuItemsBinding) this.menuBinding.getValue();
    }

    private final int getMenuDraggableDistancePx() {
        float f6 = getResources().getDisplayMetrics().widthPixels;
        float f10 = 0.8f * f6;
        return (int) ((((f6 - f10) / 2) + f10) - (f6 * getDraggableLayoutPercentageWidth()));
    }

    private final MenuRecyclerView getRecyclerView() {
        MenuRecyclerView menuRecyclerView = getMenuBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(menuRecyclerView, "menuBinding.recyclerView");
        return menuRecyclerView;
    }

    private final ShadowView getShadowView() {
        ShadowView shadowView = getMenuBinding().shadowView;
        Intrinsics.checkNotNullExpressionValue(shadowView, "menuBinding.shadowView");
        return shadowView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getWrappedContext() {
        return (Context) this.wrappedContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRecycleViewMarginBottom$lambda$20(SlideMenuView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewGroup.LayoutParams layoutParams = this$0.getRecyclerView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        if (this$0.getRecyclerView().getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin <= this$0.getFooterGroup().getTop() || !(this$0.getFooterMenuItemView().getVisibility() == 0 || this$0.getMenuBinding().footerMenuInfoView.getRoot().getVisibility() == 0)) {
            ViewExtensionKt.setMargin$default(this$0.getRecyclerView(), null, null, null, 0, 7, null);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this$0.getFooterGroup().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        ViewExtensionKt.setMargin$default(this$0.getRecyclerView(), null, null, null, Integer.valueOf(this$0.getFooterGroup().getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFeaturedItems(Map<Integer, Boolean> items) {
        if (items != null) {
            for (Map.Entry<Integer, Boolean> entry : items.entrySet()) {
                featureItem(entry.getKey().intValue(), entry.getValue().booleanValue());
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int index, @NotNull ViewGroup.LayoutParams params) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(getDraggableLayout());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl) || (child instanceof SlidingRootNav)) {
            super.addView(child, index, params);
        } else {
            getDraggableLayout().addView(child, index, params);
        }
    }

    public final void c(a aVar) {
        View childAt;
        int i10 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            getMenuBinding().rootLayout.setImportantForAccessibility(4);
            getClickableLayout().setImportantForAccessibility(2);
            getDraggableLayout().setImportantForAccessibility(1);
            getDraggableLayout().sendAccessibilityEvent(8);
            return;
        }
        getMenuBinding().rootLayout.setImportantForAccessibility(1);
        getClickableLayout().setImportantForAccessibility(1);
        getDraggableLayout().setImportantForAccessibility(4);
        if (getHeaderMenuItemView().getVisibility() == 0) {
            childAt = getHeaderMenuItemView();
        } else {
            childAt = getRecyclerView().getChildAt(0) != null ? getRecyclerView().getChildAt(0) : getMenuBinding().rootLayout;
        }
        childAt.sendAccessibilityEvent(8);
    }

    public final void checkItem(int id) {
        if (getRecyclerView().getAdapter().checkItem(id)) {
            getHeaderMenuItemView().setChecked(false);
        }
    }

    public final void cleanCheckedItems() {
        getRecyclerView().getAdapter().cleanAndCheckItem(-1);
    }

    public final void clearFeaturedItems() {
        getRecyclerView().getAdapter().cleanFeaturedItems();
    }

    public final void close() {
        SlideMenuViewModel viewModel = this.f36940p0;
        Intrinsics.checkNotNullExpressionValue(viewModel, "viewModel");
        SlideMenuViewModel.toggle$default(viewModel, false, false, 2, null);
    }

    public final void d() {
        HeaderMenuItemView headerMenuItemView = getHeaderMenuItemView();
        HeaderMenuItem headerItem = getHeaderItem();
        int i10 = 0;
        if (headerItem != null) {
            headerMenuItemView.setChecked(headerItem.getIsCheckable());
            headerMenuItemView.setVisibility(0);
            headerMenuItemView.setItem(headerItem, getState());
            headerMenuItemView.setOnClickListener(new ic.c(headerMenuItemView, this, i10, headerItem));
        } else {
            headerMenuItemView.setVisibility(8);
            headerMenuItemView.reset();
        }
        getHeaderMenuItemView().setThirdLineOnClickListener(new b());
        ViewGroup.LayoutParams layoutParams = getRecyclerView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        if (getHeaderMenuItemView().getVisibility() == 0) {
            getHeaderMenuItemView().measure(0, 0);
            ViewGroup.LayoutParams layoutParams3 = getHeaderMenuItemView().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i11 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
            getRecyclerView().setTopSpace(getHeaderMenuItemView().getSpace() + getHeaderMenuItemView().getMeasuredHeight() + i11);
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
        } else {
            getRecyclerView().setTopSpace(0);
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
        }
        post(new m(this, 2));
        getHeaderMenuItemView().reset();
        getRecyclerView().reset();
        getShadowView().reset();
        post(new h0(this, 3));
    }

    public final void e() {
        MenuRecyclerView recyclerView = getRecyclerView();
        recyclerView.setVisibility(getItems().isEmpty() ^ true ? 0 : 8);
        recyclerView.getAdapter().setData(getItems());
        recyclerView.getAdapter().notifyDataSetChanged();
        post(new m(this, 2));
    }

    public final void f(MutableLiveData mutableLiveData, final Function1 function1) {
        T value = mutableLiveData.getValue();
        if (value != 0) {
            function1.invoke(value);
        }
        mutableLiveData.observe(ContextHelper.getOwner(getContext()), new Observer() { // from class: ic.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SlideMenuView.Companion companion = SlideMenuView.INSTANCE;
                Function1 action = function1;
                Intrinsics.checkNotNullParameter(action, "$action");
                action.invoke(obj);
            }
        });
    }

    public final void featureItem(int id, boolean isFeatured) {
        getRecyclerView().getAdapter().featureItem(id, isFeatured);
    }

    @Nullable
    public final String getCloseAccessibilityLabel() {
        return getValue(this, G0[5]);
    }

    @Nullable
    public final MenuItem getFooterItem() {
        return getValue(this, G0[3]);
    }

    @Nullable
    public final HeaderMenuItem getHeaderItem() {
        return getValue(this, G0[1]);
    }

    @NotNull
    public final List<MenuItem> getItems() {
        return (List) getValue(this, G0[2]);
    }

    public final int getShadowItemsCount() {
        return getValue(this, G0[4]).intValue();
    }

    @Nullable
    public final String getState() {
        return getValue(this, G0[0]);
    }

    public final boolean isOpen() {
        SlidingRootNav slidingRootNav = this.f36944t0;
        if (slidingRootNav == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slidingRootNav");
            slidingRootNav = null;
        }
        return slidingRootNav.getLayout().getDragProgress() == 1.0f;
    }

    public final void lock() {
        this.f36940p0.lock(true);
    }

    @Override // com.yarolegovich.slidingrootnav.callback.DragStateListener
    public void onDragEnd(boolean isMenuOpened) {
        SlideMenuViewModel viewModel = this.f36940p0;
        Intrinsics.checkNotNullExpressionValue(viewModel, "viewModel");
        SlideMenuViewModel.onDragEnd$default(viewModel, isOpen(), false, 2, null);
    }

    @Override // com.bbva.ui.component.menu.OrientationListener
    public void onOrientationChanged() {
        getRecyclerView().getAdapter().onOrientationChanged(getItemPaddingLeft(), getItemPaddingRight());
        SlidingRootNav slidingRootNav = this.f36944t0;
        if (slidingRootNav == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slidingRootNav");
            slidingRootNav = null;
        }
        slidingRootNav.getLayout().setMaxDragDistance(getMenuDraggableDistancePx());
        d();
        HeaderMenuItemView headerMenuItemView = getHeaderMenuItemView();
        headerMenuItemView.setPadding(getItemPaddingLeft(), headerMenuItemView.getPaddingTop(), getItemPaddingRight(), headerMenuItemView.getPaddingBottom());
        e();
        getFooterGroup().setPadding(getItemPaddingLeft(), getPaddingTop(), getItemPaddingRight(), getPaddingBottom());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f36940p0.toggle(savedState.getIsMenuOpened(), true);
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        boolean zBooleanValue;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            AbsSavedState EMPTY_STATE = AbsSavedState.EMPTY_STATE;
            Intrinsics.checkNotNullExpressionValue(EMPTY_STATE, "EMPTY_STATE");
            return EMPTY_STATE;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        Boolean value = this.f36940p0.getObservableToggle$component_ui_menu_release().getValue();
        if (value == null) {
            zBooleanValue = false;
        } else {
            Intrinsics.checkNotNullExpressionValue(value, "viewModel.observableToggle.value ?: false");
            zBooleanValue = value.booleanValue();
        }
        savedState.setMenuOpened(zBooleanValue);
        return savedState;
    }

    public final void open() {
        SlideMenuViewModel viewModel = this.f36940p0;
        Intrinsics.checkNotNullExpressionValue(viewModel, "viewModel");
        SlideMenuViewModel.toggle$default(viewModel, true, false, 2, null);
    }

    public final void setCloseAccessibilityLabel(@Nullable String str) {
        setValue(this, G0[5], str);
    }

    public final void setFooterItem(@Nullable MenuItem menuItem) {
        setValue(this, G0[3], menuItem);
    }

    public final void setFooterItemConfig(@NotNull Map<String, ? extends Object> footerConfig) {
        Intrinsics.checkNotNullParameter(footerConfig, "footerConfig");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setFooterItem(new MenuItem.Builder(context).configuration(footerConfig).build());
    }

    public final void setHeaderItem(@Nullable HeaderMenuItem headerMenuItem) {
        setValue(this, G0[1], headerMenuItem);
    }

    public final void setHeaderItemConfig(@NotNull Map<String, ? extends Object> headerConfig) {
        Intrinsics.checkNotNullParameter(headerConfig, "headerConfig");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setHeaderItem(new HeaderMenuItem.Builder(context).configuration(headerConfig).build());
    }

    public final void setInfoMenuItemConfig(@NotNull Map<String, ? extends Map<String, ? extends Object>> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        UIComponentConfigurator.configureView(getContext(), getMenuBinding().footerMenuInfoView.getRoot(), config);
        UIComponentConfigurator.configureTextView(getContext(), getMenuBinding().footerMenuInfoView.infoTitle, config.get("title"));
        UIComponentConfigurator.configureTextView(getContext(), getMenuBinding().footerMenuInfoView.infoContent, config.get("content"));
    }

    public final void setItems(@NotNull List<? extends MenuItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        setValue(this, G0[2], list);
    }

    public final void setMenuItemsConfig(@NotNull List<? extends Map<String, ? extends Object>> itemsConfig) {
        Intrinsics.checkNotNullParameter(itemsConfig, "itemsConfig");
        List<? extends Map<String, ? extends Object>> list = itemsConfig;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Map<String, ? extends Object> map : list) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            arrayList.add(new MenuItem.Builder(context).configuration(map).build());
        }
        setItems(arrayList);
    }

    public final void setShadowItemsCount(int i10) {
        setValue(this, G0[4], Integer.valueOf(i10));
    }

    public final void setShadowedItemConfig(double shadowedItemsCount) {
        setShadowItemsCount((int) shadowedItemsCount);
    }

    public final void setState(@Nullable String str) {
        setValue(this, G0[0], str);
    }

    public final void unlock() {
        this.f36940p0.lock(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setCloseAccessibilityLabel(@Nullable Map<String, String> map) {
        setCloseAccessibilityLabel(PropertiesHelper.loadString(getContext(), MapExtensionKt.toProperty(map)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SlideMenuView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$3] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$6] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$5] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$1] */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$2] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$4] */
    @JvmOverloads
    public SlideMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        SlideMenuViewModel slideMenuViewModel = (SlideMenuViewModel) CellsViewModelProviders.of(getId(), context, SlideMenuViewModel.class);
        this.f36940p0 = slideMenuViewModel;
        this.wrappedContext = LazyKt__LazyJVMKt.lazy(new d(context, attributeSet));
        ViewSlideMenuBinding viewSlideMenuBindingInflate = ViewSlideMenuBinding.inflate(LayoutInflater.from(getWrappedContext()), this);
        Intrinsics.checkNotNullExpressionValue(viewSlideMenuBindingInflate, "inflate(LayoutInflater.from(wrappedContext), this)");
        this.f36942r0 = viewSlideMenuBindingInflate;
        this.menuBinding = LazyKt__LazyJVMKt.lazy(new c());
        Position position = Position.LEFT;
        this.f36945u0 = position;
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.v0 = new ObservableProperty<String>(obj) { // from class: com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, String oldValue, String newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                SlideMenuView.access$setupState(this);
            }
        };
        this.f36946w0 = new ObservableProperty<HeaderMenuItem>(obj) { // from class: com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, HeaderMenuItem oldValue, HeaderMenuItem newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.d();
            }
        };
        final List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f36947x0 = new ObservableProperty<List<? extends MenuItem>>(listEmptyList) { // from class: com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, List<? extends MenuItem> oldValue, List<? extends MenuItem> newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.e();
            }
        };
        this.f36948y0 = new ObservableProperty<MenuItem>(obj) { // from class: com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$4
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, MenuItem oldValue, MenuItem newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                SlideMenuView.access$invalidateFooterView(this);
            }
        };
        final int i12 = 0;
        this.E0 = new ObservableProperty<Integer>(i12) { // from class: com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$5
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.intValue();
                oldValue.intValue();
                SlideMenuView.access$invalidateShadowView(this);
            }
        };
        this.F0 = new ObservableProperty<String>(obj) { // from class: com.bbva.ui.component.menu.SlideMenuView$special$$inlined$observable$6
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, String oldValue, String newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                SlideMenuView slideMenuView = this;
                slideMenuView.getClickableLayout().setContentDescription(slideMenuView.getCloseAccessibilityLabel());
            }
        };
        Context wrappedContext = getWrappedContext();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = wrappedContext.obtainStyledAttributes(attributeSet, R.styleable.Menu, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.Menu, 0, 0)");
            this.f36945u0 = Position.Companion.fromId$component_ui_menu_release(typedArrayObtainStyledAttributes.getInt(R.styleable.Menu_cellsMenu_menuPosition, this.f36945u0.a()));
            typedArrayObtainStyledAttributes.recycle();
        }
        SlidingRootNav slidingRootNavInject = new SlidingRootNavBuilder(ViewExtensionKt.getActivity(this)).withContentView(this).withMenuView(getMenuBinding().getRoot()).withGravity(this.f36945u0 == position ? SlideGravity.LEFT : SlideGravity.RIGHT).withContentClickableWhenMenuOpened(true).addDragStateListener(this).withRootViewScale(0.8f).withDragDistancePx(getMenuDraggableDistancePx()).inject();
        Intrinsics.checkNotNullExpressionValue(slidingRootNavInject, "SlidingRootNavBuilder(ac…Px)\n            .inject()");
        this.f36944t0 = slidingRootNavInject;
        getClickableLayout().setOnClickListener(new t5.b(this, 1));
        getClickableLayout().setClickable(false);
        HeaderMenuItemView headerMenuItemView = getHeaderMenuItemView();
        headerMenuItemView.setPadding(getItemPaddingLeft(), headerMenuItemView.getPaddingTop(), getItemPaddingRight(), headerMenuItemView.getPaddingBottom());
        MenuRecyclerView recyclerView = getRecyclerView();
        recyclerView.setAdapter(new MenuRecyclerAdapter(getItemPaddingLeft(), getItemPaddingRight(), CollectionsKt__CollectionsKt.emptyList(), getState()));
        recyclerView.getAdapter().setClickListener(new ic.d(this));
        getFooterGroup().setPadding(getItemPaddingLeft(), getPaddingTop(), getItemPaddingRight(), getPaddingBottom());
        c(a.CONTENT);
        getClickableLayout().setContentDescription(getCloseAccessibilityLabel());
        slideMenuViewModel.newProperty("closeAccessibilityLabel").observe(ContextHelper.getOwner(getContext()), new Observer() { // from class: ic.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                this.f69594a.setCloseAccessibilityLabel((Map<String, String>) obj2);
            }
        });
        slideMenuViewModel.newProperty("menuItems").observe(ContextHelper.getOwner(getContext()), new Observer() { // from class: ic.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                this.f69595a.setMenuItemsConfig((List) obj2);
            }
        });
        slideMenuViewModel.newProperty("headerItem").observe(ContextHelper.getOwner(getContext()), new l5.b(this, 1));
        slideMenuViewModel.newProperty("shadowItemsCount").observe(ContextHelper.getOwner(getContext()), new i(1, this));
        slideMenuViewModel.newProperty("footerItem").observe(ContextHelper.getOwner(getContext()), new j(this, 1));
        slideMenuViewModel.newProperty("infoFooterItem").observe(ContextHelper.getOwner(getContext()), new k(this, 1));
        MutableLiveData<Boolean> observableToggle = slideMenuViewModel.getObservableToggle$component_ui_menu_release();
        Intrinsics.checkNotNullExpressionValue(observableToggle, "observableToggle");
        f(observableToggle, new e(this));
        MutableLiveData<Boolean> observableLock = slideMenuViewModel.getObservableLock$component_ui_menu_release();
        Intrinsics.checkNotNullExpressionValue(observableLock, "observableLock");
        f(observableLock, new f(this));
        MutableLiveData<Map<Integer, Boolean>> observableFeatured = slideMenuViewModel.getObservableFeatured$component_ui_menu_release();
        Intrinsics.checkNotNullExpressionValue(observableFeatured, "observableFeatured");
        f(observableFeatured, new g(this));
        MutableLiveData<String> observableState = slideMenuViewModel.getObservableState$component_ui_menu_release();
        Intrinsics.checkNotNullExpressionValue(observableState, "observableState");
        f(observableState, new h(this));
        MutableLiveData<String> observableHeaderText = slideMenuViewModel.getObservableHeaderText$component_ui_menu_release();
        Intrinsics.checkNotNullExpressionValue(observableHeaderText, "observableHeaderText");
        f(observableHeaderText, new ic.i(this));
        MutableLiveData<String> observableSubHeaderText = slideMenuViewModel.getObservableSubHeaderText$component_ui_menu_release();
        Intrinsics.checkNotNullExpressionValue(observableSubHeaderText, "observableSubHeaderText");
        f(observableSubHeaderText, new ic.j(this));
        MutableLiveData<String> observableThirdLineText = slideMenuViewModel.getObservableThirdLineText$component_ui_menu_release();
        Intrinsics.checkNotNullExpressionValue(observableThirdLineText, "observableThirdLineText");
        f(observableThirdLineText, new ic.k(this));
        MutableLiveData<String> observableHeaderInitials = slideMenuViewModel.getObservableHeaderInitials$component_ui_menu_release();
        Intrinsics.checkNotNullExpressionValue(observableHeaderInitials, "observableHeaderInitials");
        f(observableHeaderInitials, new l(this));
    }

    @Override // com.yarolegovich.slidingrootnav.callback.DragStateListener
    public void onDragStart() {
    }
}
