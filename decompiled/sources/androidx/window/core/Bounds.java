package androidx.window.core;

import android.graphics.Rect;
import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Bounds.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b \u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001e¨\u0006$"}, d2 = {"Landroidx/window/core/Bounds;", "", "Landroid/graphics/Rect;", "toRect", "", "toString", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLeft", "()I", Parameters.DIRECTION.LEFT, "b", "getTop", "top", "c", "getRight", Parameters.DIRECTION.RIGHT, "d", "getBottom", "bottom", "getWidth", "width", "getHeight", "height", "isEmpty", "()Z", "isZero", "<init>", "(IIII)V", "rect", "(Landroid/graphics/Rect;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class Bounds {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int bottom;

    public Bounds(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.top = i11;
        this.right = i12;
        this.bottom = i13;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Bounds.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        Bounds bounds = (Bounds) other;
        return this.left == bounds.left && this.top == bounds.top && this.right == bounds.right && this.bottom == bounds.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public final boolean isEmpty() {
        return getHeight() == 0 || getWidth() == 0;
    }

    public final boolean isZero() {
        return getHeight() == 0 && getWidth() == 0;
    }

    @NotNull
    public final Rect toRect() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Bounds { [");
        sb2.append(this.left);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(this.top);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(this.right);
        sb2.append(AbstractJsonLexerKt.COMMA);
        return a.c(sb2, this.bottom, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bounds(@NotNull Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        Intrinsics.checkNotNullParameter(rect, "rect");
    }
}
