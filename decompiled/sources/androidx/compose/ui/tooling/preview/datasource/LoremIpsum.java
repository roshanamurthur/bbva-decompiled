package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import v1.a;

/* JADX INFO: compiled from: LoremIpsum.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "values", "", "words", "<init>", "(I)V", "()V", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0})
public final class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18291a;

    public LoremIpsum(int i10) {
        this.f18291a = i10;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* synthetic */ int getCount() {
        return a.a(this);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public Sequence<String> getValues() {
        return SequencesKt__SequencesKt.sequenceOf(SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.take(SequencesKt__SequencesKt.generateSequence(new w1.a(new Ref.IntRef(), LoremIpsumKt.f18292a.size())), this.f18291a), " ", null, null, 0, null, null, 62, null));
    }

    public LoremIpsum() {
        this(500);
    }
}
