package com.bbva.component.ui.shortcuts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.ui.shortcuts.model.ShortcutsState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShortcutsViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/ui/shortcuts/ShortcutsViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsState;", "", "id", "", "tap$component_ui_shortcuts_release", "(Ljava/lang/String;)V", "tap", "Lkotlinx/coroutines/flow/Flow;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getOnTapEvents", "()Lkotlinx/coroutines/flow/Flow;", "onTapEvents", "<init>", "()V", "Companion", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0})
public final class ShortcutsViewModel extends ViewModel<ShortcutsState> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<String> onTapEvents;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<String> f28743x0 = new ActionSpec<>("on-shortcut-tapped");

    /* JADX INFO: compiled from: ShortcutsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/shortcuts/ShortcutsViewModel$Companion;", "", "()V", "onItemTapped", "Lcom/bbva/cells/componentkit/ActionSpec;", "", "getOnItemTapped", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<String> getOnItemTapped() {
            return ShortcutsViewModel.f28743x0;
        }
    }

    public ShortcutsViewModel() {
        super(new JsonDeserializer(ShortcutsState.INSTANCE.serializer()));
        this.onTapEvents = events(f28743x0);
    }

    @NotNull
    public final Flow<String> getOnTapEvents() {
        return this.onTapEvents;
    }

    public final void tap$component_ui_shortcuts_release(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        fire(f28743x0, id);
    }
}
