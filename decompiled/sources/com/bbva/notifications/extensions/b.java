package com.bbva.notifications.extensions;

import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.notifications.model.NotificationShortcutItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NotificationShortcutItemModelExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends Lambda implements Function1<ImageSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NotificationShortcutItemModel f35364p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NotificationShortcutItemModel notificationShortcutItemModel) {
        super(1);
        this.f35364p0 = notificationShortcutItemModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ImageSettings imageSettings) {
        ImageSettings imageSettings2 = imageSettings;
        Intrinsics.checkNotNullParameter(imageSettings2, "$this$imageSettings");
        imageSettings2.setSource(new ResourceId(this.f35364p0.getImage(), (Integer) null, 2, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }
}
