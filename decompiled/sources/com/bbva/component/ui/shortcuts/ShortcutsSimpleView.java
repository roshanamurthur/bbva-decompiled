package com.bbva.component.ui.shortcuts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.component.ui.shortcuts.databinding.ViewSkeletonSimpleBinding;
import com.bbva.component.ui.shortcuts.model.ShortcutItem;
import com.bbva.component.ui.shortcuts.model.ShortcutsState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z5.b;
import z5.c;

/* JADX INFO: compiled from: ShortcutsSimpleView.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/ui/shortcuts/ShortcutsSimpleView;", "Landroid/widget/LinearLayout;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/component/ui/shortcuts/ShortcutsViewModel;", "q0", "Lcom/bbva/component/ui/shortcuts/ShortcutsViewModel;", "getViewModel", "()Lcom/bbva/component/ui/shortcuts/ShortcutsViewModel;", "viewModel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nShortcutsSimpleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutsSimpleView.kt\ncom/bbva/component/ui/shortcuts/ShortcutsSimpleView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
public final class ShortcutsSimpleView extends LinearLayout implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28741p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ShortcutsViewModel viewModel;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShortcutsSimpleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$updateView(ShortcutsSimpleView shortcutsSimpleView, ShortcutsState shortcutsState) {
        shortcutsSimpleView.getClass();
        if (shortcutsState instanceof ShortcutsState.Loading) {
            shortcutsSimpleView.removeAllViews();
            ViewSkeletonSimpleBinding viewSkeletonSimpleBindingInflate = ViewSkeletonSimpleBinding.inflate(LayoutInflater.from(shortcutsSimpleView.getContext()), shortcutsSimpleView, false);
            Intrinsics.checkNotNullExpressionValue(viewSkeletonSimpleBindingInflate, "inflate(...)");
            viewSkeletonSimpleBindingInflate.skeletonShortcuts.startAnimation();
            shortcutsSimpleView.addView(viewSkeletonSimpleBindingInflate.getRoot());
            return;
        }
        if (shortcutsState instanceof ShortcutsState.Ready) {
            List<ShortcutItem> items = ((ShortcutsState.Ready) shortcutsState).getShortcutsConfiguration().getItems();
            shortcutsSimpleView.removeAllViews();
            for (int i10 = 0; i10 < 4; i10++) {
                ShortcutItem shortcutItem = (ShortcutItem) CollectionsKt___CollectionsKt.getOrNull(items, i10);
                Context context = shortcutsSimpleView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ShortcutItemView shortcutItemView = new ShortcutItemView(context, null, 0, 6, null);
                if (shortcutItem == null) {
                    shortcutItemView.setVisibility(4);
                } else {
                    shortcutItemView.setIcon$component_ui_shortcuts_release(shortcutItem.getIcon());
                    shortcutItemView.setText$component_ui_shortcuts_release(shortcutItem.getLabel());
                    shortcutItemView.setSettings$component_ui_shortcuts_release(shortcutItem.getView());
                    shortcutItemView.setOnTapListener(new b(shortcutsSimpleView, shortcutItem));
                }
                shortcutsSimpleView.addView(shortcutItemView);
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f28741p0.getCoroutineContext();
    }

    @NotNull
    public final ShortcutsViewModel getViewModel() {
        return this.viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShortcutsSimpleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShortcutsSimpleView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShortcutsSimpleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28741p0 = CoroutineScopeKt.MainScope();
        this.viewModel = new ShortcutsViewModel();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.shortcuts_padding_m);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setOrientation(0);
        setGravity(1);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(this, null), 3, null);
    }
}
