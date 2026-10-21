package com.bbva.component.ui.modal.list.utils;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.bbva.nativesettings.common.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AccessibilityTool.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001¨\u0006\u0005"}, d2 = {"getAccessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "Landroid/content/Context;", "isGoogleTalkbackActive", "", "component-ui-modal_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessibilityTool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityTool.kt\ncom/bbva/component/ui/modal/list/utils/AccessibilityToolKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
public final class AccessibilityToolKt {
    @Nullable
    public static final AccessibilityManager getAccessibilityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService(Constants.ACCESSIBILITY);
        if (systemService == null || !(systemService instanceof AccessibilityManager)) {
            return null;
        }
        return (AccessibilityManager) systemService;
    }

    public static final boolean isGoogleTalkbackActive(@NotNull AccessibilityManager accessibilityManager) {
        Intrinsics.checkNotNullParameter(accessibilityManager, "<this>");
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        Intrinsics.checkNotNullExpressionValue(enabledAccessibilityServiceList, "getEnabledAccessibilityServiceList(...)");
        return !enabledAccessibilityServiceList.isEmpty();
    }
}
