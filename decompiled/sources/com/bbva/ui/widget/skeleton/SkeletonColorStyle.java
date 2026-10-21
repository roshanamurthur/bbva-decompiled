package com.bbva.ui.widget.skeleton;

import android.content.Context;
import androidx.annotation.ColorInt;
import com.bbva.ui.R;
import com.bbva.ui.extensions.ContextKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SkeletonColorStyle.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/ui/widget/skeleton/SkeletonColorStyle;", "", "Landroid/content/Context;", "context", "", "getPreloadingColor", "getDefaultColor", "AMBIENT", "ALTERNATIVE", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class SkeletonColorStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SkeletonColorStyle[] $VALUES;
    public static final SkeletonColorStyle ALTERNATIVE;
    public static final SkeletonColorStyle AMBIENT;

    /* JADX INFO: compiled from: SkeletonColorStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkeletonColorStyle.values().length];
            try {
                iArr[SkeletonColorStyle.AMBIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkeletonColorStyle.ALTERNATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        SkeletonColorStyle skeletonColorStyle = new SkeletonColorStyle("AMBIENT", 0);
        AMBIENT = skeletonColorStyle;
        SkeletonColorStyle skeletonColorStyle2 = new SkeletonColorStyle("ALTERNATIVE", 1);
        ALTERNATIVE = skeletonColorStyle2;
        SkeletonColorStyle[] skeletonColorStyleArr = {skeletonColorStyle, skeletonColorStyle2};
        $VALUES = skeletonColorStyleArr;
        $ENTRIES = EnumEntriesKt.enumEntries(skeletonColorStyleArr);
    }

    public SkeletonColorStyle() {
        throw null;
    }

    @NotNull
    public static EnumEntries<SkeletonColorStyle> getEntries() {
        return $ENTRIES;
    }

    public static SkeletonColorStyle valueOf(String str) {
        return (SkeletonColorStyle) Enum.valueOf(SkeletonColorStyle.class, str);
    }

    public static SkeletonColorStyle[] values() {
        return (SkeletonColorStyle[]) $VALUES.clone();
    }

    @ColorInt
    public final int getDefaultColor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return ContextKt.themeColor(context, R.attr.surface_ambient_default);
        }
        if (i10 == 2) {
            return ContextKt.themeColor(context, R.attr.surface_alternative_default);
        }
        throw new NoWhenBranchMatchedException();
    }

    @ColorInt
    public final int getPreloadingColor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return ContextKt.themeColor(context, R.attr.surface_ambient_preloading);
        }
        if (i10 == 2) {
            return ContextKt.themeColor(context, R.attr.surface_alternative_preloading);
        }
        throw new NoWhenBranchMatchedException();
    }
}
