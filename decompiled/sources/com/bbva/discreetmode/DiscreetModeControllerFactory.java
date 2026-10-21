package com.bbva.discreetmode;

import android.content.Context;
import com.bbva.discreetmode.camera.DiscreetModeCamera;
import com.bbva.discreetmode.camera.DiscreetModeCameraController;
import com.bbva.discreetmode.combined.CombinedController;
import com.bbva.discreetmode.models.DiscreetModeConfiguration;
import com.bbva.discreetmode.proximity.DiscreetModeProximityController;
import com.bbva.discreetmode.proximity.DiscreetModeProximitySensor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiscreetModeControllerFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/discreetmode/DiscreetModeControllerFactory;", "", "Landroid/content/Context;", "context", "Lcom/bbva/discreetmode/DiscreetMode$Type;", "type", "Lcom/bbva/discreetmode/models/DiscreetModeConfiguration;", "config", "Lcom/bbva/discreetmode/DiscreetModeController;", "getController$discreetmode_release", "(Landroid/content/Context;Lcom/bbva/discreetmode/DiscreetMode$Type;Lcom/bbva/discreetmode/models/DiscreetModeConfiguration;)Lcom/bbva/discreetmode/DiscreetModeController;", "getController", "<init>", "()V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeControllerFactory {

    @NotNull
    public static final DiscreetModeControllerFactory INSTANCE = new DiscreetModeControllerFactory();

    /* JADX INFO: compiled from: DiscreetModeControllerFactory.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscreetMode.Type.values().length];
            iArr[DiscreetMode.Type.BOTH.ordinal()] = 1;
            iArr[DiscreetMode.Type.CAMERA.ordinal()] = 2;
            iArr[DiscreetMode.Type.PROXIMITY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public final DiscreetModeController getController$discreetmode_release(@NotNull Context context, @Nullable DiscreetMode.Type type, @NotNull DiscreetModeConfiguration config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return new CombinedController(new DiscreetModeCamera(context, config.getCom.bbva.plugin.media.capture.util.Constants.CAMERA_SRC java.lang.String().getConfiguration()), new DiscreetModeProximitySensor(context, config.getCom.salesforce.marketingcloud.storage.db.i.a.x java.lang.String()), config.getCom.bbva.plugin.media.capture.util.Constants.CAMERA_SRC java.lang.String().getNotificationDelay());
        }
        if (i10 == 2) {
            return new DiscreetModeCameraController(new DiscreetModeCamera(context, config.getCom.bbva.plugin.media.capture.util.Constants.CAMERA_SRC java.lang.String().getConfiguration()), config.getCom.bbva.plugin.media.capture.util.Constants.CAMERA_SRC java.lang.String().getNotificationDelay());
        }
        if (i10 == 3) {
            return new DiscreetModeProximityController(new DiscreetModeProximitySensor(context, config.getCom.salesforce.marketingcloud.storage.db.i.a.x java.lang.String()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
