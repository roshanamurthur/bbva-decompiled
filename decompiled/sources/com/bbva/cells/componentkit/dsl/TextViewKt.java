package com.bbva.cells.componentkit.dsl;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import com.bbva.cells.componentkit.model.dsl.Dimension;
import com.bbva.cells.componentkit.model.dsl.InputType;
import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.UnitType;
import com.bbva.cells.componentkit.resource.ResourceStringKt;
import com.noknok.android.client.metrics.Tabulator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010\u0011\u001a\u00020\u000b*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a\u0014\u0010\u0012\u001a\u00020\u000b*\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u000b*\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u000b*\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u0014\u0010\u0000\u001a\u00020\u000b*\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010\u001a\u001a\u00020\u000b*\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u0010\u001b\u001a\u00020\u000b*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u001c"}, d2 = {"text", "", "context", "Landroid/content/Context;", "resource", "Lcom/bbva/cells/componentkit/model/dsl/Resource;", "toTypedValue", "", Tabulator.KEY_UNIT, "Lcom/bbva/cells/componentkit/model/dsl/UnitType;", "font", "", "Landroid/widget/TextView;", "resourceId", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "hint", "hintColor", "hintColorState", "inputType", "input", "Lcom/bbva/cells/componentkit/model/dsl/InputType;", "settings", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "size", TypedValues.Custom.S_DIMENSION, "Lcom/bbva/cells/componentkit/model/dsl/Dimension;", "textColor", "textColorState", "componentkit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextViewKt {

    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InputType.values().length];
            iArr[InputType.Numbers.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UnitType.values().length];
            iArr2[UnitType.SP.ordinal()] = 1;
            iArr2[UnitType.DP.ordinal()] = 2;
            iArr2[UnitType.PX.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void font(@NotNull TextView textView, @Nullable ResourceId resourceId) {
        int fontId;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (resourceId == null) {
            return;
        }
        if (resourceId.getAndroidId() != null) {
            Integer androidId = resourceId.getAndroidId();
            Intrinsics.checkNotNull(androidId);
            fontId = androidId.intValue();
        } else {
            if (resourceId.getValue() == null) {
                return;
            }
            String value = resourceId.getValue();
            Intrinsics.checkNotNull(value);
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            fontId = ResourceStringKt.toFontId(value, context);
        }
        textView.setTypeface(ResourcesCompat.getFont(textView.getContext(), fontId));
    }

    public static final void hint(@NotNull TextView textView, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        String strText = text(context, resource);
        if (strText == null) {
            return;
        }
        textView.setHint(strText);
    }

    public static final void hintColor(@NotNull TextView textView, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Integer numColor = ViewKt.color(context, resource);
        if (numColor == null) {
            return;
        }
        textView.setHintTextColor(numColor.intValue());
    }

    public static final void hintColorState(@NotNull TextView textView, @Nullable ResourceId resourceId) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Integer numColorState = ViewKt.colorState(context, resourceId);
        if (numColorState == null) {
            return;
        }
        textView.setHintTextColor(numColorState.intValue());
    }

    public static final void inputType(@NotNull TextView textView, @Nullable InputType inputType) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        int i10 = inputType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i10 != -1) {
            textView.setInputType(i10 == 1 ? 2 : 1);
        }
    }

    public static final void settings(@NotNull TextView textView, @Nullable TextSettings textSettings) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (textSettings == null) {
            return;
        }
        ViewKt.settings(textView, textSettings.getView());
        inputType(textView, textSettings.getInput());
        textColor(textView, textSettings.getColor());
        textColorState(textView, textSettings.getColorState());
        font(textView, textSettings.getFont());
        text(textView, textSettings.getText());
        hint(textView, textSettings.getHint());
        hintColor(textView, textSettings.getHintColor());
        hintColorState(textView, textSettings.getHintColorState());
        size(textView, textSettings.getSize());
    }

    public static final void size(@NotNull TextView textView, @Nullable Dimension dimension) {
        float fApplyDimension;
        String value;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (dimension == null) {
            return;
        }
        ResourceId id = dimension.getId();
        Float fValueOf = null;
        fValueOf = null;
        if ((id == null ? null : id.getAndroidId()) != null) {
            Resources resources = textView.getContext().getResources();
            ResourceId id2 = dimension.getId();
            Integer androidId = id2 != null ? id2.getAndroidId() : null;
            Intrinsics.checkNotNull(androidId);
            fApplyDimension = resources.getDimension(androidId.intValue());
        } else {
            ResourceId id3 = dimension.getId();
            if ((id3 == null ? null : id3.getValue()) != null) {
                ResourceId id4 = dimension.getId();
                if (id4 != null && (value = id4.getValue()) != null) {
                    Context context = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    fValueOf = Float.valueOf(ResourceStringKt.idToDimension(value, context));
                }
                Intrinsics.checkNotNull(fValueOf);
                fApplyDimension = fValueOf.floatValue();
            } else {
                int typedValue = toTypedValue(dimension.getUnit());
                Float value2 = dimension.getValue();
                Intrinsics.checkNotNull(value2);
                fApplyDimension = TypedValue.applyDimension(typedValue, value2.floatValue(), textView.getContext().getResources().getDisplayMetrics());
            }
        }
        textView.setTextSize(fApplyDimension);
    }

    public static final void text(@NotNull TextView textView, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        String strText = text(context, resource);
        if (strText == null) {
            return;
        }
        textView.setText(strText);
    }

    public static final void textColor(@NotNull TextView textView, @Nullable Resource resource) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Integer numColor = ViewKt.color(context, resource);
        if (numColor == null) {
            return;
        }
        textView.setTextColor(numColor.intValue());
    }

    public static final void textColorState(@NotNull TextView textView, @Nullable ResourceId resourceId) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Integer numColorState = ViewKt.colorState(context, resourceId);
        if (numColorState == null) {
            return;
        }
        textView.setTextColor(numColorState.intValue());
    }

    public static final int toTypedValue(@Nullable UnitType unitType) {
        int i10 = unitType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[unitType.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final String text(@NotNull Context context, @Nullable Resource resource) {
        String value;
        Intrinsics.checkNotNullParameter(context, "context");
        if (resource == null) {
            return null;
        }
        ResourceId id = resource.getId();
        if ((id == null ? null : id.getAndroidId()) != null) {
            ResourceId id2 = resource.getId();
            Integer androidId = id2 != null ? id2.getAndroidId() : null;
            Intrinsics.checkNotNull(androidId);
            return context.getString(androidId.intValue());
        }
        ResourceId id3 = resource.getId();
        if ((id3 == null ? null : id3.getValue()) == null) {
            return resource.getValue();
        }
        ResourceId id4 = resource.getId();
        if (id4 == null || (value = id4.getValue()) == null) {
            return null;
        }
        return ResourceStringKt.idToString(value, context);
    }
}
