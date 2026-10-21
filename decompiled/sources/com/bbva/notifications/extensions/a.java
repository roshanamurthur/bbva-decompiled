package com.bbva.notifications.extensions;

import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.notifications.model.NotificationShortcutItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NotificationShortcutItemModelExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends Lambda implements Function1<ImageSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NotificationShortcutItemModel f35363p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NotificationShortcutItemModel notificationShortcutItemModel) {
        super(1);
        this.f35363p0 = notificationShortcutItemModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ImageSettings imageSettings) {
        ImageSettings imageSettings2 = imageSettings;
        Intrinsics.checkNotNullParameter(imageSettings2, "$this$imageSettings");
        imageSettings2.setUrl(this.f35363p0.getImage());
        return Unit.INSTANCE;
    }
}
