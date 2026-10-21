package com.bbva.glomohybrid.base.shortcuts;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import androidx.annotation.RequiresApi;
import androidx.core.content.pm.g;
import androidx.core.content.pm.h;
import androidx.core.content.pm.i0;
import androidx.core.content.pm.j;
import androidx.core.content.pm.s0;
import bk.d;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShortcutController.kt */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(25)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/base/shortcuts/ShortcutController;", "", "Lcom/bbva/glomohybrid/base/shortcuts/Shortcut;", "shortcut", "", "add", RemoveCommand.ID, "removeAllShortcuts", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class ShortcutController {

    @NotNull
    public static final String ID = "shortcut-controller";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f31561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f31562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f31563c;

    /* JADX INFO: compiled from: ShortcutController.kt */
    public static final class a extends Lambda implements Function0<ShortcutManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ShortcutManager invoke() {
            return s0.a(ShortcutController.this.f31561a.getSystemService(i0.a()));
        }
    }

    public ShortcutController(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31561a = context;
        this.f31562b = LazyKt__LazyJVMKt.lazy(new a());
        this.f31563c = new LinkedHashMap();
    }

    public final void add(@NotNull Shortcut shortcut) {
        Intrinsics.checkNotNullParameter(shortcut, "shortcut");
        LinkedHashMap linkedHashMap = this.f31563c;
        ShortcutInfo shortcutInfoA = j.a(linkedHashMap.get(shortcut.getId()));
        if (shortcutInfoA == null) {
            h.a();
            String id = shortcut.getId();
            Context context = this.f31561a;
            ShortcutInfo.Builder builderA = g.a(context, id);
            String strLoadString = PropertiesHelper.loadString(context, shortcut.getShortText());
            if (strLoadString == null) {
                strLoadString = "";
            }
            ShortcutInfo.Builder shortLabel = builderA.setShortLabel(strLoadString);
            String strLoadString2 = PropertiesHelper.loadString(context, shortcut.getLongText());
            if (strLoadString2 == null) {
                strLoadString2 = "";
            }
            ShortcutInfo.Builder longLabel = shortLabel.setLongLabel(strLoadString2);
            Icon iconCreateWithResource = Icon.createWithResource(context, PropertiesHelper.loadDrawableId(context, shortcut.getIcon()));
            Intrinsics.checkNotNullExpressionValue(iconCreateWithResource, "createWithResource(...)");
            ShortcutInfo.Builder intents = longLabel.setIcon(iconCreateWithResource).setIntents(ShortcutModelKt.toIntentArray(shortcut.getActions()));
            String strLoadString3 = PropertiesHelper.loadString(context, shortcut.getDisabledMessage());
            shortcutInfoA = intents.setDisabledMessage(strLoadString3 != null ? strLoadString3 : "").build();
            Intrinsics.checkNotNullExpressionValue(shortcutInfoA, "build(...)");
        }
        Object value = this.f31562b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        s0.a(value).addDynamicShortcuts(d.listOf(shortcutInfoA));
        String id2 = shortcutInfoA.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
        linkedHashMap.put(id2, shortcutInfoA);
    }

    public final void remove(@NotNull Shortcut shortcut) {
        Intrinsics.checkNotNullParameter(shortcut, "shortcut");
        Object value = this.f31562b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        s0.a(value).removeDynamicShortcuts(d.listOf(shortcut.getId()));
        this.f31563c.remove(shortcut.getId());
    }

    public final void removeAllShortcuts() {
        Object value = this.f31562b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        s0.a(value).removeAllDynamicShortcuts();
        this.f31563c.clear();
    }
}
