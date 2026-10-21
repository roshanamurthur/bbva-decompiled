package com.google.accompanist.themeadapter.material;

import androidx.compose.material.Colors;
import androidx.compose.material.Shapes;
import androidx.compose.material.Typography;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MdcTheme.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/google/accompanist/themeadapter/material/ThemeParameters;", "", "Landroidx/compose/material/Colors;", "component1", "Landroidx/compose/material/Typography;", "component2", "Landroidx/compose/material/Shapes;", "component3", "colors", "typography", "shapes", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/material/Colors;", "getColors", "()Landroidx/compose/material/Colors;", "b", "Landroidx/compose/material/Typography;", "getTypography", "()Landroidx/compose/material/Typography;", "c", "Landroidx/compose/material/Shapes;", "getShapes", "()Landroidx/compose/material/Shapes;", "<init>", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;)V", "themeadapter-material_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ThemeParameters {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Colors colors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Typography typography;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Shapes shapes;

    public ThemeParameters(@Nullable Colors colors, @Nullable Typography typography, @Nullable Shapes shapes) {
        this.colors = colors;
        this.typography = typography;
        this.shapes = shapes;
    }

    public static /* synthetic */ ThemeParameters copy$default(ThemeParameters themeParameters, Colors colors, Typography typography, Shapes shapes, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            colors = themeParameters.colors;
        }
        if ((i10 & 2) != 0) {
            typography = themeParameters.typography;
        }
        if ((i10 & 4) != 0) {
            shapes = themeParameters.shapes;
        }
        return themeParameters.copy(colors, typography, shapes);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Typography getTypography() {
        return this.typography;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Shapes getShapes() {
        return this.shapes;
    }

    @NotNull
    public final ThemeParameters copy(@Nullable Colors colors, @Nullable Typography typography, @Nullable Shapes shapes) {
        return new ThemeParameters(colors, typography, shapes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeParameters)) {
            return false;
        }
        ThemeParameters themeParameters = (ThemeParameters) other;
        return Intrinsics.areEqual(this.colors, themeParameters.colors) && Intrinsics.areEqual(this.typography, themeParameters.typography) && Intrinsics.areEqual(this.shapes, themeParameters.shapes);
    }

    @Nullable
    public final Colors getColors() {
        return this.colors;
    }

    @Nullable
    public final Shapes getShapes() {
        return this.shapes;
    }

    @Nullable
    public final Typography getTypography() {
        return this.typography;
    }

    public int hashCode() {
        Colors colors = this.colors;
        int iHashCode = (colors == null ? 0 : colors.hashCode()) * 31;
        Typography typography = this.typography;
        int iHashCode2 = (iHashCode + (typography == null ? 0 : typography.hashCode())) * 31;
        Shapes shapes = this.shapes;
        return iHashCode2 + (shapes != null ? shapes.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ThemeParameters(colors=" + this.colors + ", typography=" + this.typography + ", shapes=" + this.shapes + RootService.CLOSE_BRACKET;
    }
}
