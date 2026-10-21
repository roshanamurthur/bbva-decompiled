package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "", "()V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "Generic", "Rectangle", "Rounded", "Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Outline {

    /* JADX INFO: compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/graphics/Path;", "a", "Landroidx/compose/ui/graphics/Path;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "path", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "bounds", "<init>", "(Landroidx/compose/ui/graphics/Path;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final class Generic extends Outline {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Path path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Generic(@NotNull Path path) {
            super(null);
            Intrinsics.checkNotNullParameter(path, "path");
            this.path = path;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Generic) {
                return Intrinsics.areEqual(this.path, ((Generic) other).path);
            }
            return false;
        }

        @Override // androidx.compose.ui.graphics.Outline
        @NotNull
        /* JADX INFO: renamed from: getBounds */
        public Rect getRect() {
            return this.path.getBounds();
        }

        @NotNull
        public final Path getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }
    }

    /* JADX INFO: compiled from: Outline.kt */
    @Immutable
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/geometry/Rect;", "a", "Landroidx/compose/ui/geometry/Rect;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "rect", "getBounds", "bounds", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final class Rectangle extends Outline {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Rect rect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rectangle(@NotNull Rect rect) {
            super(null);
            Intrinsics.checkNotNullParameter(rect, "rect");
            this.rect = rect;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Rectangle) {
                return Intrinsics.areEqual(this.rect, ((Rectangle) other).rect);
            }
            return false;
        }

        @Override // androidx.compose.ui.graphics.Outline
        @NotNull
        /* JADX INFO: renamed from: getBounds, reason: from getter */
        public Rect getRect() {
            return this.rect;
        }

        @NotNull
        public final Rect getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    /* JADX INFO: compiled from: Outline.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/geometry/RoundRect;", "a", "Landroidx/compose/ui/geometry/RoundRect;", "getRoundRect", "()Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "Landroidx/compose/ui/graphics/Path;", "b", "Landroidx/compose/ui/graphics/Path;", "getRoundRectPath$ui_graphics_release", "()Landroidx/compose/ui/graphics/Path;", "roundRectPath", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "bounds", "<init>", "(Landroidx/compose/ui/geometry/RoundRect;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
    public static final class Rounded extends Outline {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final RoundRect roundRect;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Path roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Rounded(@NotNull RoundRect roundRect) {
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(roundRect, "roundRect");
            Path Path = null;
            this.roundRect = roundRect;
            if (!OutlineKt.access$hasSameCornerRadius(roundRect)) {
                Path = AndroidPath_androidKt.Path();
                Path.addRoundRect(roundRect);
            }
            this.roundRectPath = Path;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Rounded) {
                return Intrinsics.areEqual(this.roundRect, ((Rounded) other).roundRect);
            }
            return false;
        }

        @Override // androidx.compose.ui.graphics.Outline
        @NotNull
        /* JADX INFO: renamed from: getBounds */
        public Rect getRect() {
            return RoundRectKt.getBoundingRect(this.roundRect);
        }

        @NotNull
        public final RoundRect getRoundRect() {
            return this.roundRect;
        }

        @Nullable
        /* JADX INFO: renamed from: getRoundRectPath$ui_graphics_release, reason: from getter */
        public final Path getRoundRectPath() {
            return this.roundRectPath;
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public Outline() {
    }

    public /* synthetic */ Outline(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: getBounds */
    public abstract Rect getRect();
}
