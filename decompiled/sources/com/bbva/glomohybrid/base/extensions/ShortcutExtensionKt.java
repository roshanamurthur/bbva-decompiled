package com.bbva.glomohybrid.base.extensions;

import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShortcutExtension.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"PRIVATE_SHORTCUT_MANAGER_KEY", "", "toDeeplink", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ShortcutExtensionKt {

    @NotNull
    public static final String PRIVATE_SHORTCUT_MANAGER_KEY = "shortcut-manager-private";

    @NotNull
    public static final DeepLinkModel toDeeplink(@NotNull ShortcutModel shortcutModel) {
        Intrinsics.checkNotNullParameter(shortcutModel, "<this>");
        return new DeepLinkModel("", shortcutModel.getAction(), shortcutModel.getArgs(), null, 8, null);
    }
}
