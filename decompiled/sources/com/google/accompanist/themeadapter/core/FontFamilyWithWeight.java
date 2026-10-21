package com.google.accompanist.themeadapter.core;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResourceUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;", "", "Landroidx/compose/ui/text/font/FontFamily;", "component1", "Landroidx/compose/ui/text/font/FontWeight;", "component2", "fontFamily", "weight", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "b", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "<init>", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;)V", "themeadapter-core_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class FontFamilyWithWeight {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontFamily fontFamily;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontWeight weight;

    public FontFamilyWithWeight(@NotNull FontFamily fontFamily, @NotNull FontWeight weight) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(weight, "weight");
        this.fontFamily = fontFamily;
        this.weight = weight;
    }

    public static /* synthetic */ FontFamilyWithWeight copy$default(FontFamilyWithWeight fontFamilyWithWeight, FontFamily fontFamily, FontWeight fontWeight, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fontFamily = fontFamilyWithWeight.fontFamily;
        }
        if ((i10 & 2) != 0) {
            fontWeight = fontFamilyWithWeight.weight;
        }
        return fontFamilyWithWeight.copy(fontFamily, fontWeight);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FontWeight getWeight() {
        return this.weight;
    }

    @NotNull
    public final FontFamilyWithWeight copy(@NotNull FontFamily fontFamily, @NotNull FontWeight weight) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new FontFamilyWithWeight(fontFamily, weight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FontFamilyWithWeight)) {
            return false;
        }
        FontFamilyWithWeight fontFamilyWithWeight = (FontFamilyWithWeight) other;
        return Intrinsics.areEqual(this.fontFamily, fontFamilyWithWeight.fontFamily) && Intrinsics.areEqual(this.weight, fontFamilyWithWeight.weight);
    }

    @NotNull
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @NotNull
    public final FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.weight.hashCode() + (this.fontFamily.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FontFamilyWithWeight(fontFamily=" + this.fontFamily + ", weight=" + this.weight + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ FontFamilyWithWeight(FontFamily fontFamily, FontWeight fontWeight, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, (i10 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight);
    }
}
