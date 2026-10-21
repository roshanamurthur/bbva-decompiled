package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018B\t\b\u0016¢\u0006\u0004\b\u0017\u0010\u000fB \b\u0016\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0019B\u0016\b\u0016\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u001aJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000R\u001d\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0016\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "merge", "a", "Z", "getIncludeFontPadding", "()Z", "getIncludeFontPadding$annotations", "()V", "includeFontPadding", "Landroidx/compose/ui/text/EmojiSupportMatch;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getEmojiSupportMatch-_3YsG6Y", "()I", "emojiSupportMatch", "<init>", "(Z)V", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class PlatformParagraphStyle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final PlatformParagraphStyle f17662c = new PlatformParagraphStyle();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean includeFontPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int emojiSupportMatch;

    /* JADX INFO: compiled from: AndroidTextStyle.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.f17662c;
        }
    }

    public PlatformParagraphStyle(boolean z10) {
        this.includeFontPadding = z10;
        this.emojiSupportMatch = EmojiSupportMatch.INSTANCE.m3864getDefault_3YsG6Y();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) other;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m3860equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    /* JADX INFO: renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name and from getter */
    public final int getEmojiSupportMatch() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return EmojiSupportMatch.m3861hashCodeimpl(this.emojiSupportMatch) + ((this.includeFontPadding ? 1231 : 1237) * 31);
    }

    @NotNull
    public final PlatformParagraphStyle merge(@Nullable PlatformParagraphStyle other) {
        return other == null ? this : other;
    }

    @NotNull
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m3862toStringimpl(this.emojiSupportMatch)) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public /* synthetic */ PlatformParagraphStyle(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? EmojiSupportMatch.INSTANCE.m3864getDefault_3YsG6Y() : i10, (i11 & 2) != 0 ? true : z10, (DefaultConstructorMarker) null);
    }

    public PlatformParagraphStyle(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this.includeFontPadding = z10;
        this.emojiSupportMatch = i10;
    }

    public /* synthetic */ PlatformParagraphStyle(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? EmojiSupportMatch.INSTANCE.m3864getDefault_3YsG6Y() : i10, null);
    }

    public PlatformParagraphStyle(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.includeFontPadding = true;
        this.emojiSupportMatch = i10;
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.INSTANCE.m3864getDefault_3YsG6Y(), true, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }
}
