package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextIndent.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001e\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "Landroidx/compose/ui/unit/TextUnit;", "firstLine", "restLine", "copy-NB67dxo", "(JJ)Landroidx/compose/ui/text/style/TextIndent;", "copy", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "J", "getFirstLine-XSAIIZE", "()J", "b", "getRestLine-XSAIIZE", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextIndent {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TextIndent f18273c = new TextIndent(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long firstLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long restLine;

    public TextIndent(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this.firstLine = j10;
        this.restLine = j11;
    }

    /* JADX INFO: renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ TextIndent m4317copyNB67dxo$default(TextIndent textIndent, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = textIndent.firstLine;
        }
        if ((i10 & 2) != 0) {
            j11 = textIndent.restLine;
        }
        return textIndent.m4318copyNB67dxo(j10, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-NB67dxo, reason: not valid java name */
    public final TextIndent m4318copyNB67dxo(long firstLine, long restLine) {
        return new TextIndent(firstLine, restLine, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) other;
        return TextUnit.m4567equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m4567equalsimpl0(this.restLine, textIndent.restLine);
    }

    /* JADX INFO: renamed from: getFirstLine-XSAIIZE, reason: not valid java name and from getter */
    public final long getFirstLine() {
        return this.firstLine;
    }

    /* JADX INFO: renamed from: getRestLine-XSAIIZE, reason: not valid java name and from getter */
    public final long getRestLine() {
        return this.restLine;
    }

    public int hashCode() {
        return TextUnit.m4571hashCodeimpl(this.restLine) + (TextUnit.m4571hashCodeimpl(this.firstLine) * 31);
    }

    @NotNull
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m4577toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m4577toStringimpl(this.restLine)) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ TextIndent(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? TextUnitKt.getSp(0) : j10, (i10 & 2) != 0 ? TextUnitKt.getSp(0) : j11, null);
    }

    /* JADX INFO: compiled from: TextIndent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextIndent;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextIndent getNone() {
            return TextIndent.f18273c;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
