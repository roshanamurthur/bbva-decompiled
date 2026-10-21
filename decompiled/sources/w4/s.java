package w4;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.base.file.receipts.model.Receipt;
import com.bbva.glomohybrid.base.file.viewmodel.FileManagerComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94155p0;

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f94155p0) {
            case 0:
                ((AnalyticsManager) obj).trackEvent(AnalyticsEvent.LOGIN_BIOMETRY_RETRIES_ERROR);
                break;
            default:
                Receipt receipt = (Receipt) obj2;
                Intrinsics.checkNotNull(receipt);
                ((FileManagerComponent) obj).shareReceipt(receipt);
                break;
        }
    }
}
