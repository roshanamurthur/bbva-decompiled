package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001c\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0011\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0013\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/TabPosition;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getLeft-D9Ej5fM", "()F", Parameters.DIRECTION.LEFT, "b", "getWidth-D9Ej5fM", "width", "getRight-D9Ej5fM", Parameters.DIRECTION.RIGHT, "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,505:1\n51#2:506\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n*L\n339#1:506\n*E\n"})
public final class TabPosition {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float width;

    public TabPosition(float f6, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this.left = f6;
        this.width = f10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) other;
        return Dp.m4394equalsimpl0(this.left, tabPosition.left) && Dp.m4394equalsimpl0(this.width, tabPosition.width);
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m1351getRightD9Ej5fM() {
        return Dp.m4389constructorimpl(this.left + this.width);
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.width) + (Dp.m4395hashCodeimpl(this.left) * 31);
    }

    @NotNull
    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m4400toStringimpl(this.left)) + ", right=" + ((Object) Dp.m4400toStringimpl(m1351getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m4400toStringimpl(this.width)) + RootService.CLOSE_BRACKET;
    }
}
