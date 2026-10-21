package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.TempListUtilsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.y2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextDecoration.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0086\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "decoration", "plus", "other", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "toString", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMask", "()I", "mask", "<init>", "(I)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextDecoration {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final TextDecoration f18259b = new TextDecoration(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TextDecoration f18260c = new TextDecoration(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final TextDecoration f18261d = new TextDecoration(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int mask;

    public TextDecoration(int i10) {
        this.mask = i10;
    }

    public final boolean contains(@NotNull TextDecoration other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = other.mask;
        int i11 = this.mask;
        return (i10 | i11) == i11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof TextDecoration) {
            return this.mask == ((TextDecoration) other).mask;
        }
        return false;
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    @NotNull
    public final TextDecoration plus(@NotNull TextDecoration decoration) {
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        return new TextDecoration(decoration.mask | this.mask);
    }

    @NotNull
    public String toString() {
        int i10 = this.mask;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((f18260c.mask & i10) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & f18261d.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return y2.b(new StringBuilder("TextDecoration["), TempListUtilsKt.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null), AbstractJsonLexerKt.END_LIST);
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }

    /* JADX INFO: compiled from: TextDecoration.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "()V", "LineThrough", "Landroidx/compose/ui/text/style/TextDecoration;", "getLineThrough$annotations", "getLineThrough", "()Landroidx/compose/ui/text/style/TextDecoration;", "None", "getNone$annotations", "getNone", "Underline", "getUnderline$annotations", "getUnderline", "combine", "decorations", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n108#2,3:112\n111#2,2:119\n113#2:122\n33#3,4:115\n38#3:121\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:119,2\n57#1:122\n57#1:115,4\n57#1:121\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextDecoration combine(@NotNull List<TextDecoration> decorations) {
            Intrinsics.checkNotNullParameter(decorations, "decorations");
            Integer numValueOf = 0;
            int size = decorations.size();
            for (int i10 = 0; i10 < size; i10++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | decorations.get(i10).getMask());
            }
            return new TextDecoration(numValueOf.intValue());
        }

        @NotNull
        public final TextDecoration getLineThrough() {
            return TextDecoration.f18261d;
        }

        @NotNull
        public final TextDecoration getNone() {
            return TextDecoration.f18259b;
        }

        @NotNull
        public final TextDecoration getUnderline() {
            return TextDecoration.f18260c;
        }

        @Stable
        public static /* synthetic */ void getLineThrough$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @Stable
        public static /* synthetic */ void getUnderline$annotations() {
        }
    }
}
