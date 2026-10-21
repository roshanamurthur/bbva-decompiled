package com.bbva.glomohybrid.base.cells;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.glomohybrid.logs.LoggerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CellsReactor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "P", "", "component", "kotlin.jvm.PlatformType", "params", "execute", "(Ljava/lang/Object;Ljava/lang/Object;)V", "com/bbva/glomohybrid/base/cells/CellsReactor$reactIn$1"}, k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nCellsReactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor$reactIn$1\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,83:1\n72#2,11:84\n*E\n"})
public final class CellsReactor$log$$inlined$reactIn$default$1<C, P> implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1 f31054p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoggerLevel f31055q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Exception f31056r0;

    public CellsReactor$log$$inlined$reactIn$default$1(Function1 function1, LoggerLevel loggerLevel, Exception exc) {
        this.f31054p0 = function1;
        this.f31055q0 = loggerLevel;
        this.f31056r0 = exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(P p4, T t10) {
        Intrinsics.checkNotNull(p4);
        String str = (String) this.f31054p0.invoke(t10);
        int i10 = CellsReactor.WhenMappings.$EnumSwitchMapping$0[this.f31055q0.ordinal()];
        Exception exc = this.f31056r0;
        switch (i10) {
            case 1:
                LoggerKt.logVerbose$default(str, null, 2, null);
                break;
            case 2:
                LoggerKt.logDebug$default(str, null, 2, null);
                break;
            case 3:
                LoggerKt.logWarning$default(str, null, 2, null);
                break;
            case 4:
                LoggerKt.logInfo$default(str, null, 2, null);
                break;
            case 5:
                LoggerKt.logCritical$default(str, exc, null, 4, null);
                break;
            case 6:
                LoggerKt.logError$default(str, exc, null, 4, null);
                break;
        }
    }
}
