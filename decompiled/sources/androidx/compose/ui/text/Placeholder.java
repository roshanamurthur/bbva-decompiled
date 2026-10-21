package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Placeholder.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R \u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "Landroidx/compose/ui/unit/TextUnit;", "width", "height", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "placeholderVerticalAlign", "copy-K8Q-__8", "(JJI)Landroidx/compose/ui/text/Placeholder;", "copy", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "J", "getWidth-XSAIIZE", "()J", "b", "getHeight-XSAIIZE", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPlaceholderVerticalAlign-J6kI3mc", "()I", "<init>", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class Placeholder {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int placeholderVerticalAlign;

    public Placeholder(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.width = j10;
        this.height = j11;
        this.placeholderVerticalAlign = i10;
        if (!(!TextUnitKt.m4588isUnspecifiedR2X_6o(j10))) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        }
        if (!(!TextUnitKt.m4588isUnspecifiedR2X_6o(j11))) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }

    /* JADX INFO: renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m3897copyK8Q__8$default(Placeholder placeholder, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = placeholder.width;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = placeholder.height;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m3898copyK8Q__8(j12, j13, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m3898copyK8Q__8(long width, long height, int placeholderVerticalAlign) {
        return new Placeholder(width, height, placeholderVerticalAlign, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) other;
        return TextUnit.m4567equalsimpl0(this.width, placeholder.width) && TextUnit.m4567equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m3905equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    /* JADX INFO: renamed from: getHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name and from getter */
    public final int getPlaceholderVerticalAlign() {
        return this.placeholderVerticalAlign;
    }

    /* JADX INFO: renamed from: getWidth-XSAIIZE, reason: not valid java name and from getter */
    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return PlaceholderVerticalAlign.m3906hashCodeimpl(this.placeholderVerticalAlign) + ((TextUnit.m4571hashCodeimpl(this.height) + (TextUnit.m4571hashCodeimpl(this.width) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m4577toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m4577toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m3907toStringimpl(this.placeholderVerticalAlign)) + RootService.CLOSE_BRACKET;
    }
}
