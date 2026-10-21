package com.bbva.cells.componentkit.dsl;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.cells.componentkit.model.dsl.Visibility;
import com.bbva.cells.componentkit.resource.ResourceStringKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\u0006\u001a!\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\f*\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010\u0011\u001a\u00020\f*\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\t\u001a\u0019\u0010\u0012\u001a\u00020\f*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\f*\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\f*\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¨\u0006\u0019"}, d2 = {"color", "", "context", "Landroid/content/Context;", "resource", "Lcom/bbva/cells/componentkit/model/dsl/Resource;", "(Landroid/content/Context;Lcom/bbva/cells/componentkit/model/dsl/Resource;)Ljava/lang/Integer;", "colorState", "resourceId", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "(Landroid/content/Context;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;)Ljava/lang/Integer;", "accessibilityLabel", "", "Landroid/view/View;", "value", "", "backgroundColor", "backgroundColorState", EnableHandler.ID, "", "(Landroid/view/View;Ljava/lang/Boolean;)V", "settings", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "visibility", "Lcom/bbva/cells/componentkit/model/dsl/Visibility;", "componentkit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ViewKt {

    /* JADX INFO: compiled from: View.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Visibility.values().length];
            iArr[Visibility.Visible.ordinal()] = 1;
            iArr[Visibility.Invisible.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void accessibilityLabel(@NotNull View view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setContentDescription(str);
    }

    public static final void backgroundColor(@NotNull View view, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Integer numColor = color(context, resource);
        if (numColor == null) {
            return;
        }
        view.setBackgroundColor(numColor.intValue());
    }

    public static final void backgroundColorState(@NotNull View view, @Nullable ResourceId resourceId) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Integer numColorState = colorState(context, resourceId);
        if (numColorState == null) {
            return;
        }
        view.setBackgroundColor(numColorState.intValue());
    }

    @Nullable
    public static final Integer color(@NotNull Context context, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (resource == null) {
            return null;
        }
        ResourceId id = resource.getId();
        if ((id == null ? null : id.getAndroidId()) != null) {
            ResourceId id2 = resource.getId();
            Integer androidId = id2 != null ? id2.getAndroidId() : null;
            Intrinsics.checkNotNull(androidId);
            return Integer.valueOf(ContextCompat.getColor(context, androidId.intValue()));
        }
        ResourceId id3 = resource.getId();
        if ((id3 == null ? null : id3.getValue()) == null) {
            return Integer.valueOf(Color.parseColor(resource.getValue()));
        }
        ResourceId id4 = resource.getId();
        String value = id4 != null ? id4.getValue() : null;
        Intrinsics.checkNotNull(value);
        return Integer.valueOf(ResourceStringKt.idToColor(value, context));
    }

    @Nullable
    public static final Integer colorState(@NotNull Context context, @Nullable ResourceId resourceId) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourceId == null) {
            return null;
        }
        if (resourceId.getAndroidId() != null) {
            Integer androidId = resourceId.getAndroidId();
            Intrinsics.checkNotNull(androidId);
            return androidId;
        }
        String value = resourceId.getValue();
        if (value == null) {
            return null;
        }
        return Integer.valueOf(ResourceStringKt.toColorId(value, context));
    }

    public static final void enable(@NotNull View view, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (bool == null) {
            return;
        }
        view.setEnabled(bool.booleanValue());
    }

    public static final void settings(@NotNull View view, @Nullable ViewSettings viewSettings) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (viewSettings == null) {
            return;
        }
        backgroundColor(view, viewSettings.getBackgroundColor());
        backgroundColorState(view, viewSettings.getBackgroundColorState());
        enable(view, viewSettings.getEnable());
        visibility(view, viewSettings.getVisibility());
        accessibilityLabel(view, viewSettings.getAccessibilityLabel());
    }

    public static final void visibility(@NotNull View view, @Nullable Visibility visibility) {
        int i10;
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i11 = visibility == null ? -1 : WhenMappings.$EnumSwitchMapping$0[visibility.ordinal()];
        if (i11 != -1) {
            if (i11 != 1) {
                i10 = i11 != 2 ? 8 : 4;
            } else {
                i10 = 0;
            }
            view.setVisibility(i10);
        }
    }
}
