package com.bbva.notifications.extensions;

import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.component.ui.shortcuts.model.ShortcutItem;
import com.bbva.notifications.model.NotificationShortcutItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NotificationShortcutItemModelExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"", "Lcom/bbva/notifications/model/NotificationShortcutItemModel;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutItem;", "toView", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNotificationShortcutItemModelExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationShortcutItemModelExtensions.kt\ncom/bbva/notifications/extensions/NotificationShortcutItemModelExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1549#2:37\n1620#2,3:38\n*S KotlinDebug\n*F\n+ 1 NotificationShortcutItemModelExtensions.kt\ncom/bbva/notifications/extensions/NotificationShortcutItemModelExtensionsKt\n*L\n14#1:37\n14#1:38,3\n*E\n"})
public final class NotificationShortcutItemModelExtensionsKt {
    @NotNull
    public static final List<ShortcutItem> toView(@NotNull List<NotificationShortcutItemModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<NotificationShortcutItemModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toView((NotificationShortcutItemModel) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final ShortcutItem toView(@NotNull NotificationShortcutItemModel notificationShortcutItemModel) {
        ImageSettings imageSettings;
        Intrinsics.checkNotNullParameter(notificationShortcutItemModel, "<this>");
        String route = notificationShortcutItemModel.getRoute();
        if (com.bbva.glomoutils.StringExtensionsKt.isURL(notificationShortcutItemModel.getImage())) {
            imageSettings = SettingsKt.imageSettings(new a(notificationShortcutItemModel));
        } else {
            imageSettings = SettingsKt.imageSettings(new b(notificationShortcutItemModel));
        }
        return new ShortcutItem(route, imageSettings, SettingsKt.textSettings(new c(notificationShortcutItemModel.getText())), (ViewSettings) null, 8, (DefaultConstructorMarker) null);
    }
}
