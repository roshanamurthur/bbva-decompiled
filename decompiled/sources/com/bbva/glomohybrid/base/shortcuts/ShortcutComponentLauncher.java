package com.bbva.glomohybrid.base.shortcuts;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.c;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShortcutComponentLauncher.kt */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(25)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/base/shortcuts/ShortcutComponentLauncher;", "", "", "reset", "Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;", "<set-?>", "a", "Lkotlin/properties/ReadWriteProperty;", "getAction", "()Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;", "setAction", "(Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;)V", "action", "", "b", "getReady", "()Z", "setReady", "(Z)V", "ready", "<init>", "()V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nShortcutComponentLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutComponentLauncher.kt\ncom/bbva/glomohybrid/base/shortcuts/ShortcutComponentLauncher\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,34:1\n33#2,3:35\n33#2,3:38\n*S KotlinDebug\n*F\n+ 1 ShortcutComponentLauncher.kt\ncom/bbva/glomohybrid/base/shortcuts/ShortcutComponentLauncher\n*L\n12#1:35,3\n15#1:38,3\n*E\n"})
public final class ShortcutComponentLauncher {

    @NotNull
    public static final String ID = "shortcut-component-launcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ShortcutComponentLauncher$special$$inlined$observable$1 f31557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ShortcutComponentLauncher$special$$inlined$observable$2 f31558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f31555c = {c.e(ShortcutComponentLauncher.class, "action", "getAction()Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;", 0), c.e(ShortcutComponentLauncher.class, "ready", "getReady()Z", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<ShortcutActions> f31556d = new ActionSpec<>("shortcut-clicked");

    /* JADX INFO: compiled from: ShortcutComponentLauncher.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/base/shortcuts/ShortcutComponentLauncher$Companion;", "", "()V", "ACTION_SHORTCUT_CLICKED", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;", "getACTION_SHORTCUT_CLICKED", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ID", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<ShortcutActions> getACTION_SHORTCUT_CLICKED() {
            return ShortcutComponentLauncher.f31556d;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bbva.glomohybrid.base.shortcuts.ShortcutComponentLauncher$special$$inlined$observable$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.bbva.glomohybrid.base.shortcuts.ShortcutComponentLauncher$special$$inlined$observable$2] */
    public ShortcutComponentLauncher() {
        Delegates delegates = Delegates.INSTANCE;
        final ShortcutActions shortcutActions = ShortcutActions.NONE;
        this.f31557a = new ObservableProperty<ShortcutActions>(shortcutActions) { // from class: com.bbva.glomohybrid.base.shortcuts.ShortcutComponentLauncher$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, ShortcutActions oldValue, ShortcutActions newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                ShortcutActions shortcutActions2 = newValue;
                if (shortcutActions2.isNone()) {
                    shortcutActions2 = null;
                }
                if (shortcutActions2 != null) {
                    ShortcutComponentLauncher.access$launch(this);
                }
            }
        };
        final Boolean bool = Boolean.FALSE;
        this.f31558b = new ObservableProperty<Boolean>(bool) { // from class: com.bbva.glomohybrid.base.shortcuts.ShortcutComponentLauncher$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.booleanValue();
                oldValue.booleanValue();
                ShortcutComponentLauncher.access$launch(this);
            }
        };
    }

    public static final void access$launch(ShortcutComponentLauncher shortcutComponentLauncher) {
        if (!shortcutComponentLauncher.getReady() || shortcutComponentLauncher.getAction().isNone()) {
            return;
        }
        CellsReactor.fire(ID, f31556d, shortcutComponentLauncher.getAction());
    }

    @NotNull
    public final ShortcutActions getAction() {
        return getValue(this, f31555c[0]);
    }

    public final boolean getReady() {
        return getValue(this, f31555c[1]).booleanValue();
    }

    public final void reset() {
        setAction(ShortcutActions.NONE);
    }

    public final void setAction(@NotNull ShortcutActions shortcutActions) {
        Intrinsics.checkNotNullParameter(shortcutActions, "<set-?>");
        setValue(this, f31555c[0], shortcutActions);
    }

    public final void setReady(boolean z10) {
        setValue(this, f31555c[1], Boolean.valueOf(z10));
    }
}
