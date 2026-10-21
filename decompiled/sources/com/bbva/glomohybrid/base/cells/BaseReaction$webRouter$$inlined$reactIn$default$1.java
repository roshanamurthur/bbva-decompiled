package com.bbva.glomohybrid.base.cells;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.model.to_web.NavigationOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CellsReactor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "P", "", "component", "kotlin.jvm.PlatformType", "params", "execute", "(Ljava/lang/Object;Ljava/lang/Object;)V", "com/bbva/glomohybrid/base/cells/CellsReactor$reactIn$1"}, k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nCellsReactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor$reactIn$1\n+ 2 BaseReaction.kt\ncom/bbva/glomohybrid/base/cells/BaseReaction\n*L\n1#1,83:1\n84#2,3:84\n*E\n"})
public final class BaseReaction$webRouter$$inlined$reactIn$default$1<C, P> implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f31052p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1 f31053q0;

    public BaseReaction$webRouter$$inlined$reactIn$default$1(boolean z10, Function1 function1) {
        this.f31052p0 = z10;
        this.f31053q0 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(P p4, T t10) {
        Intrinsics.checkNotNull(p4);
        ((WebController) p4).navigateTo((String) this.f31053q0.invoke(t10), null, NavigationOptions.skipHistory(this.f31052p0));
    }
}
