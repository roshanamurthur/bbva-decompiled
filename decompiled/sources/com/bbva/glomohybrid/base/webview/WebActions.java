package com.bbva.glomohybrid.base.webview;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.reactor.PageReaction;
import com.bbva.cellscore.web.WebController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebActions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/webview/WebActions;", "", "Lcom/bbva/cellscore/reactor/PageReaction;", "Landroid/content/Context;", "context", "", "configureWebActions", "", "ID", "Ljava/lang/String;", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/glomohybrid/base/webview/WebPermissionCallback;", "a", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getACTION_REQUEST_LOCATION_PERMISSION", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_REQUEST_LOCATION_PERMISSION", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWebActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebActions.kt\ncom/bbva/glomohybrid/base/webview/WebActions\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,64:1\n25#2,8:65\n*S KotlinDebug\n*F\n+ 1 WebActions.kt\ncom/bbva/glomohybrid/base/webview/WebActions\n*L\n52#1:65,8\n*E\n"})
public final class WebActions {

    @NotNull
    public static final String ID = "component-id-cells-web-controller";

    @NotNull
    public static final WebActions INSTANCE = new WebActions();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ActionSpec<WebPermissionCallback> ACTION_REQUEST_LOCATION_PERMISSION = new ActionSpec<>("webaction-request-location-permission");

    public final void configureWebActions(@NotNull PageReaction pageReaction, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(pageReaction, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = pageReaction.whenever(ID).doAction(ACTION_REQUEST_LOCATION_PERMISSION).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        final String str = "android.permission.ACCESS_FINE_LOCATION";
        ReactorCoreBuilder.ReactionBuilder reactionBuilderWithPermissions = reactionBuilderThen.withPermissions("android.permission.ACCESS_FINE_LOCATION");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderWithPermissions, "withPermissions(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderWithPermissions.inside(ID, WebController.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.webview.WebActions$managePermission$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, WebPermissionCallback webPermissionCallback) {
                Intrinsics.checkNotNull(p4);
                webPermissionCallback.run(ContextCompat.checkSelfPermission(context, str) == 0);
            }
        }), "doReaction(...)");
    }

    @NotNull
    public final ActionSpec<WebPermissionCallback> getACTION_REQUEST_LOCATION_PERMISSION() {
        return ACTION_REQUEST_LOCATION_PERMISSION;
    }
}
