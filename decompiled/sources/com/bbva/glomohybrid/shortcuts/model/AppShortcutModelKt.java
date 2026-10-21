package com.bbva.glomohybrid.shortcuts.model;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import bk.v;
import com.bbva.notifications.activity.NotificationActivity;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppShortcutModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u001a\u0012\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004¨\u0006\r"}, d2 = {"toIntent", "Landroid/content/Intent;", "Lcom/bbva/glomohybrid/shortcuts/model/Action;", "context", "Landroid/content/Context;", "extras", "", "", "Ljava/io/Serializable;", "toShortcutInfoCompat", "Landroidx/core/content/pm/ShortcutInfoCompat;", "Lcom/bbva/glomohybrid/shortcuts/model/AppShortcut;", "ctx", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppShortcutModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppShortcutModel.kt\ncom/bbva/glomohybrid/shortcuts/model/AppShortcutModelKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,56:1\n215#2,2:57\n*S KotlinDebug\n*F\n+ 1 AppShortcutModel.kt\ncom/bbva/glomohybrid/shortcuts/model/AppShortcutModelKt\n*L\n37#1:57,2\n*E\n"})
public final class AppShortcutModelKt {
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @NotNull
    public static final Intent toIntent(@NotNull Action action, @NotNull Context context, @NotNull Map<String, ? extends Serializable> extras) {
        Intrinsics.checkNotNullParameter(action, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intent intent = new Intent();
        intent.setAction(action.getAction());
        String targetClass = action.getTargetClass();
        if (targetClass == null) {
            intent.setClass(context, NotificationActivity.class);
        } else {
            String targetPackage = action.getTargetPackage();
            if (targetPackage == null) {
                targetPackage = context.getPackageName();
            }
            if (intent.setClassName(targetPackage, targetClass) == null) {
                intent.setClass(context, NotificationActivity.class);
            }
        }
        for (Map.Entry<String, ? extends Serializable> entry : extras.entrySet()) {
            intent.putExtra(entry.getKey(), entry.getValue());
        }
        return intent;
    }

    @NotNull
    public static final ShortcutInfoCompat toShortcutInfoCompat(@NotNull AppShortcut appShortcut, @NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(appShortcut, "<this>");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        ShortcutInfoCompat.Builder rank = new ShortcutInfoCompat.Builder(ctx, appShortcut.getId().getValue()).setShortLabel(appShortcut.getShortLabel()).setLongLabel(appShortcut.getLongLabel()).setDisabledMessage(appShortcut.getDisableMessage()).setIcon(IconCompat.createWithResource(ctx, appShortcut.getIconId())).setIntent(toIntent(appShortcut.getAction(), ctx, appShortcut.getExtras())).setRank(appShortcut.getRank());
        if (Build.VERSION.SDK_INT >= 25) {
            rank.setCategories(v.setOf("android.shortcut.conversation"));
        }
        ShortcutInfoCompat shortcutInfoCompatBuild = rank.build();
        Intrinsics.checkNotNullExpressionValue(shortcutInfoCompatBuild, "build(...)");
        return shortcutInfoCompatBuild;
    }
}
