package c8;

import android.content.Intent;
import android.net.Uri;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.R;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.bbva.glomohybrid.base.file.reactions.FileReactions;
import com.bbva.glomohybrid.base.file.receipts.model.Receipt;
import com.bbva.glomohybrid.base.file.viewmodel.FileManagerComponent;
import com.bbva.glomohybrid.cellsweb.presentation.reactions.ApplicationSettingsReactions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25420p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PageReactionDelegator f25421q0;

    public /* synthetic */ a(PageReactionDelegator pageReactionDelegator, int i10) {
        this.f25420p0 = i10;
        this.f25421q0 = pageReactionDelegator;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        int i10 = this.f25420p0;
        PageReactionDelegator pageReactionDelegator = this.f25421q0;
        switch (i10) {
            case 0:
                FileReactions this$0 = (FileReactions) pageReactionDelegator;
                FileInteraction fileInteraction = (FileInteraction) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(fileInteraction, "null cannot be cast to non-null type com.bbva.glomohybrid.base.file.channels.FileInteraction.Receipt");
                String string = this$0.f31351q0.getString(R.string.receipt);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ((FileManagerComponent) obj).shareReceipt(new Receipt(string, ((FileInteraction.Receipt) fileInteraction).getContent()));
                break;
            default:
                ApplicationSettingsReactions this$1 = (ApplicationSettingsReactions) pageReactionDelegator;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this$1.f31667q0.getPackageName(), null));
                this$1.f31667q0.startActivity(intent);
                break;
        }
    }
}
