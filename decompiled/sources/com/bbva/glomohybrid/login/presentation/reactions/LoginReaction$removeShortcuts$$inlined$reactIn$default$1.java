package com.bbva.glomohybrid.login.presentation.reactions;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.shortcuts.ShortcutController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CellsReactor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "P", "", "component", "kotlin.jvm.PlatformType", "params", "execute", "(Ljava/lang/Object;Ljava/lang/Object;)V", "com/bbva/glomohybrid/base/cells/CellsReactor$reactIn$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCellsReactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor$reactIn$1\n+ 2 LoginReaction.kt\ncom/bbva/glomohybrid/login/presentation/reactions/LoginReaction\n*L\n1#1,83:1\n384#2,2:84\n*E\n"})
public final class LoginReaction$removeShortcuts$$inlined$reactIn$default$1<C, P> implements Reaction.ReactionExecution {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(P p4, Object obj) {
        Intrinsics.checkNotNull(p4);
        ((ShortcutController) p4).removeAllShortcuts();
    }
}
