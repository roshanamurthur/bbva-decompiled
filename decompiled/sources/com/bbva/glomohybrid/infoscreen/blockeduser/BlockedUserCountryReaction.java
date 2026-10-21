package com.bbva.glomohybrid.infoscreen.blockeduser;

import android.app.Activity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BlockedUserCountryReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/blockeduser/BlockedUserCountryReaction;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class BlockedUserCountryReaction implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f32272p0;

    public BlockedUserCountryReaction(@NotNull BaseReaction baseReaction, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f32272p0 = baseReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        this.f32272p0.whenever("blocked-user").doAction(InfoScreenActivity.INSTANCE.getACTION_POSITIVE_BUTTON()).then().doWebNavigation("keyRecovery");
    }
}
