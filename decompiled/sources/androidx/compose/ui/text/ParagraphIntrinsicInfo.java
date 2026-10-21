package androidx.compose.ui.text;

import androidx.activity.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "component1", "", "component2", "component3", "intrinsics", "startIndex", "endIndex", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/ParagraphIntrinsics;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStartIndex", "()I", "c", "getEndIndex", "<init>", "(Landroidx/compose/ui/text/ParagraphIntrinsics;II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ParagraphIntrinsicInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ParagraphIntrinsics intrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int endIndex;

    public ParagraphIntrinsicInfo(@NotNull ParagraphIntrinsics intrinsics, int i10, int i11) {
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
        this.intrinsics = intrinsics;
        this.startIndex = i10;
        this.endIndex = i11;
    }

    public static /* synthetic */ ParagraphIntrinsicInfo copy$default(ParagraphIntrinsicInfo paragraphIntrinsicInfo, ParagraphIntrinsics paragraphIntrinsics, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            paragraphIntrinsics = paragraphIntrinsicInfo.intrinsics;
        }
        if ((i12 & 2) != 0) {
            i10 = paragraphIntrinsicInfo.startIndex;
        }
        if ((i12 & 4) != 0) {
            i11 = paragraphIntrinsicInfo.endIndex;
        }
        return paragraphIntrinsicInfo.copy(paragraphIntrinsics, i10, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    @NotNull
    public final ParagraphIntrinsicInfo copy(@NotNull ParagraphIntrinsics intrinsics, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
        return new ParagraphIntrinsicInfo(intrinsics, startIndex, endIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) other;
        return Intrinsics.areEqual(this.intrinsics, paragraphIntrinsicInfo.intrinsics) && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    @NotNull
    public final ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return (((this.intrinsics.hashCode() * 31) + this.startIndex) * 31) + this.endIndex;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.intrinsics);
        sb2.append(", startIndex=");
        sb2.append(this.startIndex);
        sb2.append(", endIndex=");
        return a.d(sb2, this.endIndex, RootService.CLOSE_BRACKET);
    }
}
