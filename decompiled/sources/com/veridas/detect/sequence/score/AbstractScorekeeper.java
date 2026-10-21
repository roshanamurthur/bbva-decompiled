package com.veridas.detect.sequence.score;

import com.veridas.detect.sequence.context.SequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractScorekeeper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "C", "Lcom/veridas/detect/sequence/score/Scorekeeper;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "context", "", "visit", "(Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;)V", "a", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "getContext", "()Lcom/veridas/detect/sequence/context/SequentialAnalysisContext;", "setContext", "<init>", "()V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public abstract class AbstractScorekeeper<C extends SequentialAnalysisContext> extends Scorekeeper implements SequentialAnalysisContextVisitor<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public C context;

    @Nullable
    public final C getContext() {
        return this.context;
    }

    public final void setContext(@Nullable C c10) {
        this.context = c10;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull C context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Score score = context.getScore();
        this.context = context;
        tally(score);
    }
}
