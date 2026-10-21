package com.dasnano.vdphotoselfiecapture.api.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.camera.core.s1;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.dasnano.vdphotoselfiecapture.R;
import com.dasnano.vdphotoselfiecapture.api.model.Action;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.dasnano.vdphotoselfiecapture.other.FaceOrientation;
import com.dasnano.vdphotoselfiecapture.other.util.Utils;
import com.google.gson.annotations.SerializedName;
import com.google.mlkit.vision.face.Face;
import com.veridas.config.Configuration;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.fragment.DasFragment;
import com.veridas.log.Log;
import com.veridas.logger.VDLogger;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: Action.kt */
/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 `2\u00020\u0001:\u0004^_`aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007JH\u0010=\u001a\u00020>2\u000e\u0010?\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010G\u001a\u0004\u0018\u00010DJ\t\u0010H\u001a\u00020\tHÖ\u0001J2\u0010I\u001a\u0004\u0018\u00010D2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010G\u001a\u0004\u0018\u00010DH\u0002J\u001a\u0010J\u001a\u0004\u0018\u00010\u00032\b\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020NJ \u0010O\u001a\u00020!2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010S\u001a\u00020TJ\u000e\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020\tJ*\u0010W\u001a\u00020T2\u000e\u0010?\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030@2\b\u0010X\u001a\u0004\u0018\u00010D2\u0006\u0010Y\u001a\u00020\tH\u0002J\u0019\u0010Z\u001a\u00020T2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\tHÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u000bR \u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u00020\tX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010+\u001a\u00020\tX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R \u00101\u001a\u00020\tX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001fR \u00105\u001a\u00020\u0012X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010\u000b\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R \u00109\u001a\u00020\u0012X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\u0015\"\u0004\b<\u0010\u0017¨\u0006b"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Action;", "Landroid/os/Parcelable;", "name", "", "type", "parameters", "Lcom/dasnano/vdphotoselfiecapture/api/model/Parameters;", "(Ljava/lang/String;Ljava/lang/String;Lcom/dasnano/vdphotoselfiecapture/api/model/Parameters;)V", "actionInvalidationIndex", "", "getActionInvalidationIndex$annotations", "()V", "actionStatus", "Lcom/dasnano/vdphotoselfiecapture/api/model/Action$ActionStatus;", "getActionStatus$annotations", "actionValidationIndex", "getActionValidationIndex$annotations", "challengeStartDetectionTime", "", "getChallengeStartDetectionTime$annotations", "getChallengeStartDetectionTime", "()J", "setChallengeStartDetectionTime", "(J)V", "helpAnimation", "getHelpAnimation", "()I", "invalidationActionThreshold", "getInvalidationActionThreshold$annotations", "getInvalidationActionThreshold", "setInvalidationActionThreshold", "(I)V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "()Z", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getParameters", "()Lcom/dasnano/vdphotoselfiecapture/api/model/Parameters;", "setParameters", "(Lcom/dasnano/vdphotoselfiecapture/api/model/Parameters;)V", "timeoutSeconds", "getTimeoutSeconds$annotations", "getTimeoutSeconds", "setTimeoutSeconds", "getType", "setType", "validationActionThreshold", "getValidationActionThreshold$annotations", "getValidationActionThreshold", "setValidationActionThreshold", "webVTTEndTime", "getWebVTTEndTime$annotations", "getWebVTTEndTime", "setWebVTTEndTime", "webVTTStartTime", "getWebVTTStartTime$annotations", "getWebVTTStartTime", "setWebVTTStartTime", "checkFaceAction", "Lcom/dasnano/vdphotoselfiecapture/api/model/Action$AccomplishStatus;", "fragment", "Lcom/veridas/fragment/DasFragment;", "face", "Lcom/google/mlkit/vision/face/Face;", "leftArrow", "Landroid/widget/ImageView;", "rightArrow", "topArrow", "bottomArrow", "describeContents", "getCurrentProgressArrow", "getHelpText", "context", "Landroid/content/Context;", "configuration", "Lcom/veridas/config/Configuration;", "isErrorMovement", "currentPosition", "Lcom/dasnano/vdphotoselfiecapture/other/FaceOrientation$FaceOrientationState;", "targetPosition", "resetParameters", "", "setValidationActionThresholdFromCameraFPS", "cameraFPS", "updateProgressBarProgress", "arrowImageView", "currentMovementAchievement", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "AccomplishStatus", "ActionStatus", "Companion", ConstantsKt.TYPE, "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Action implements Parcelable {
    private int actionInvalidationIndex;

    @NotNull
    private ActionStatus actionStatus;
    private int actionValidationIndex;
    private long challengeStartDetectionTime;
    private int invalidationActionThreshold;

    @NotNull
    private String name;

    @NotNull
    private Parameters parameters;
    private int timeoutSeconds;

    @SerializedName(Name.LABEL)
    @NotNull
    private String type;
    private int validationActionThreshold;
    private long webVTTEndTime;
    private long webVTTStartTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Action> CREATOR = new Creator();
    private static final String TAG = "Action";

    /* JADX INFO: compiled from: Action.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Action$AccomplishStatus;", "", "(Ljava/lang/String;I)V", "TIMEOUT", "RETURNING_TO_CENTER", "WRONG_MOVEMENT", "NOT_ACCOMPLISHED", "ACCOMPLISHED", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum AccomplishStatus {
        TIMEOUT,
        RETURNING_TO_CENTER,
        WRONG_MOVEMENT,
        NOT_ACCOMPLISHED,
        ACCOMPLISHED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<AccomplishStatus> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Action$ActionStatus;", "", "(Ljava/lang/String;I)V", "REACHING_POSITION", "RETURNING_TO_CENTER_HORIZONTAL_LEFT", "RETURNING_TO_CENTER_HORIZONTAL_RIGHT", "RETURNING_TO_CENTER_VERTICAL_TOP", "RETURNING_TO_CENTER_VERTICAL_BOTTOM", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum ActionStatus {
        REACHING_POSITION,
        RETURNING_TO_CENTER_HORIZONTAL_LEFT,
        RETURNING_TO_CENTER_HORIZONTAL_RIGHT,
        RETURNING_TO_CENTER_VERTICAL_TOP,
        RETURNING_TO_CENTER_VERTICAL_BOTTOM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<ActionStatus> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Action$Companion;", "", "Lcom/dasnano/vdphotoselfiecapture/api/model/Action$ActionStatus;", "actionStatus", "", "isActionCenter", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static final FaceOrientation.FaceOrientationState access$getFaceOrientationFromActionTypeAndStatus(Companion companion, Action action, ActionStatus actionStatus) {
            if (companion.isActionCenter(actionStatus)) {
                return FaceOrientation.FaceOrientationState.CENTER_CENTER;
            }
            if (l.equals(action.getType(), TYPE.MOVE_HEAD_AND_BACK, true)) {
                String direction = action.getParameters().getDirection();
                switch (direction.hashCode()) {
                    case -1383228885:
                        if (direction.equals("bottom")) {
                            return FaceOrientation.FaceOrientationState.BOTTOM_CENTER;
                        }
                        break;
                    case 115029:
                        if (direction.equals("top")) {
                            return FaceOrientation.FaceOrientationState.TOP_CENTER;
                        }
                        break;
                    case 3317767:
                        if (direction.equals(Parameters.DIRECTION.LEFT)) {
                            return FaceOrientation.FaceOrientationState.CENTER_LEFT;
                        }
                        break;
                    case 108511772:
                        if (direction.equals(Parameters.DIRECTION.RIGHT)) {
                            return FaceOrientation.FaceOrientationState.CENTER_RIGHT;
                        }
                        break;
                }
            }
            return FaceOrientation.FaceOrientationState.ERROR_UNKNOWN;
        }

        public final boolean isActionCenter(@NotNull ActionStatus actionStatus) {
            Intrinsics.checkNotNullParameter(actionStatus, "actionStatus");
            return actionStatus == ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_LEFT || actionStatus == ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_RIGHT || actionStatus == ActionStatus.RETURNING_TO_CENTER_VERTICAL_BOTTOM || actionStatus == ActionStatus.RETURNING_TO_CENTER_VERTICAL_TOP;
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Action createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Action(parcel.readString(), parcel.readString(), Parameters.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Action[] newArray(int i10) {
            return new Action[i10];
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Action$TYPE;", "", "()V", "MOVE_HEAD_AND_BACK", "", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TYPE {

        @NotNull
        public static final TYPE INSTANCE = new TYPE();

        @NotNull
        public static final String MOVE_HEAD_AND_BACK = "move-head-and-back";

        private TYPE() {
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FaceOrientation.FaceOrientationState.values().length];
            try {
                iArr[FaceOrientation.FaceOrientationState.CENTER_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaceOrientation.FaceOrientationState.CENTER_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaceOrientation.FaceOrientationState.TOP_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActionStatus.values().length];
            try {
                iArr2[ActionStatus.REACHING_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ActionStatus.RETURNING_TO_CENTER_VERTICAL_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ActionStatus.RETURNING_TO_CENTER_VERTICAL_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Action(@NotNull String name, @NotNull String type, @NotNull Parameters parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.name = name;
        this.type = type;
        this.parameters = parameters;
        this.validationActionThreshold = 3;
        this.invalidationActionThreshold = 10;
        this.actionStatus = ActionStatus.REACHING_POSITION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkFaceAction$lambda$0(ImageView imageView, ImageView imageView2, Action this$0, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i10 = 8;
        if (imageView != null) {
            imageView.setVisibility((imageView2 != null && imageView.getId() == imageView2.getId() && this$0.actionStatus == ActionStatus.REACHING_POSITION) ? 0 : 8);
        }
        if (imageView3 != null) {
            imageView3.setVisibility((imageView2 != null && imageView3.getId() == imageView2.getId() && this$0.actionStatus == ActionStatus.REACHING_POSITION) ? 0 : 8);
        }
        if (imageView4 != null) {
            imageView4.setVisibility((imageView2 != null && imageView4.getId() == imageView2.getId() && this$0.actionStatus == ActionStatus.REACHING_POSITION) ? 0 : 8);
        }
        if (imageView5 != null) {
            if (imageView2 != null && imageView5.getId() == imageView2.getId() && this$0.actionStatus == ActionStatus.REACHING_POSITION) {
                i10 = 0;
            }
            imageView5.setVisibility(i10);
        }
    }

    private final ImageView getCurrentProgressArrow(ImageView leftArrow, ImageView rightArrow, ImageView topArrow, ImageView bottomArrow) {
        switch (this.parameters.getDirection()) {
            case "bottom":
                return bottomArrow;
            case "top":
                return topArrow;
            case "left":
                return leftArrow;
            case "right":
                return rightArrow;
            default:
                return null;
        }
    }

    private final boolean isErrorMovement(FaceOrientation.FaceOrientationState currentPosition, FaceOrientation.FaceOrientationState targetPosition, ActionStatus actionStatus) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[actionStatus.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (currentPosition == FaceOrientation.FaceOrientationState.DEAD_ZONE || currentPosition == FaceOrientation.FaceOrientationState.CENTER_RIGHT || currentPosition == targetPosition) {
                            return false;
                        }
                    } else if (currentPosition == FaceOrientation.FaceOrientationState.DEAD_ZONE || currentPosition == FaceOrientation.FaceOrientationState.CENTER_LEFT || currentPosition == targetPosition) {
                        return false;
                    }
                } else if (currentPosition == FaceOrientation.FaceOrientationState.DEAD_ZONE || currentPosition == FaceOrientation.FaceOrientationState.BOTTOM_CENTER || currentPosition == targetPosition) {
                    return false;
                }
            } else if (currentPosition == FaceOrientation.FaceOrientationState.DEAD_ZONE || currentPosition == FaceOrientation.FaceOrientationState.TOP_CENTER || currentPosition == targetPosition) {
                return false;
            }
        } else if (currentPosition == FaceOrientation.FaceOrientationState.DEAD_ZONE || currentPosition == FaceOrientation.FaceOrientationState.CENTER_CENTER || currentPosition == targetPosition) {
            return false;
        }
        return true;
    }

    private final void updateProgressBarProgress(DasFragment<?, ?> fragment, final ImageView arrowImageView, final int currentMovementAchievement) {
        if (arrowImageView != null) {
            fragment.runOnUiThread(new Runnable() { // from class: od.a
                @Override // java.lang.Runnable
                public final void run() {
                    Action.updateProgressBarProgress$lambda$1(currentMovementAchievement, arrowImageView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProgressBarProgress$lambda$1(int i10, ImageView imageView) {
        if (i10 >= 95) {
            imageView.setImageResource(R.drawable.vd_photo_arrow_5);
            return;
        }
        if (i10 >= 70) {
            imageView.setImageResource(R.drawable.vd_photo_arrow_4);
            return;
        }
        if (i10 >= 60) {
            imageView.setImageResource(R.drawable.vd_photo_arrow_3);
            return;
        }
        if (i10 >= 40) {
            imageView.setImageResource(R.drawable.vd_photo_arrow_2);
        } else if (i10 >= 20) {
            imageView.setImageResource(R.drawable.vd_photo_arrow_1);
        } else {
            imageView.setImageResource(R.drawable.vd_photo_arrow_0);
        }
    }

    @NotNull
    public final AccomplishStatus checkFaceAction(@NotNull DasFragment<?, ?> fragment, @Nullable Face face, @Nullable ImageView leftArrow, @Nullable ImageView rightArrow, @Nullable ImageView topArrow, @Nullable ImageView bottomArrow) {
        ActionStatus actionStatus;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        long time = new Date().getTime();
        ImageView currentProgressArrow = getCurrentProgressArrow(leftArrow, rightArrow, topArrow, bottomArrow);
        fragment.runOnUiThread(new s1(leftArrow, currentProgressArrow, this, rightArrow, topArrow, bottomArrow, 1));
        if (this.webVTTStartTime == 0) {
            this.webVTTStartTime = time;
        }
        if (this.webVTTStartTime + ((long) (this.timeoutSeconds * 1000)) < time) {
            return AccomplishStatus.TIMEOUT;
        }
        FaceOrientation.FaceOrientationState faceOrientationStateAccess$getFaceOrientationFromActionTypeAndStatus = Companion.access$getFaceOrientationFromActionTypeAndStatus(INSTANCE, this, this.actionStatus);
        FaceOrientation currentFrameFaceOrientation = Utils.getCurrentFrameFaceOrientation(face, this.actionStatus, faceOrientationStateAccess$getFaceOrientationFromActionTypeAndStatus);
        updateProgressBarProgress(fragment, currentProgressArrow, currentFrameFaceOrientation.getCurrentMovementAchievement());
        if ((faceOrientationStateAccess$getFaceOrientationFromActionTypeAndStatus == currentFrameFaceOrientation.getCurrentOrientation() || currentFrameFaceOrientation.getCurrentOrientation() == FaceOrientation.FaceOrientationState.DEAD_ZONE) && currentFrameFaceOrientation.getCurrentMovementAchievement() >= 100) {
            this.actionValidationIndex++;
        } else {
            int i10 = this.actionValidationIndex;
            if (i10 > 0) {
                this.actionValidationIndex = i10 - 1;
            }
        }
        FaceOrientation.FaceOrientationState currentOrientation = currentFrameFaceOrientation.getCurrentOrientation();
        Intrinsics.checkNotNullExpressionValue(currentOrientation, "getCurrentOrientation(...)");
        if (isErrorMovement(currentOrientation, faceOrientationStateAccess$getFaceOrientationFromActionTypeAndStatus, this.actionStatus)) {
            this.actionInvalidationIndex++;
        } else {
            int i11 = this.actionInvalidationIndex;
            if (i11 > 0) {
                this.actionInvalidationIndex = i11 - 1;
            }
        }
        if (this.actionValidationIndex < this.validationActionThreshold || this.actionStatus != ActionStatus.REACHING_POSITION || !l.equals(this.type, TYPE.MOVE_HEAD_AND_BACK, true)) {
            VDLogger.Companion companion = VDLogger.INSTANCE;
            String currentOrientationAsString = currentFrameFaceOrientation.getCurrentOrientationAsString();
            Intrinsics.checkNotNullExpressionValue(currentOrientationAsString, "getCurrentOrientationAsString(...)");
            companion.log("VERIDAS", "orientation: %s Validation: %d/%d Invalidation: %d/%d", currentOrientationAsString, Integer.valueOf(this.actionValidationIndex), Integer.valueOf(this.validationActionThreshold), Integer.valueOf(this.actionInvalidationIndex), Integer.valueOf(this.invalidationActionThreshold));
            if (this.actionValidationIndex <= this.validationActionThreshold) {
                return this.actionInvalidationIndex > this.invalidationActionThreshold ? AccomplishStatus.WRONG_MOVEMENT : AccomplishStatus.NOT_ACCOMPLISHED;
            }
            this.webVTTEndTime = time;
            return AccomplishStatus.ACCOMPLISHED;
        }
        this.actionValidationIndex = 0;
        this.actionInvalidationIndex = 0;
        FaceOrientation.FaceOrientationState currentOrientation2 = currentFrameFaceOrientation.getCurrentOrientation();
        int i12 = currentOrientation2 != null ? WhenMappings.$EnumSwitchMapping$0[currentOrientation2.ordinal()] : -1;
        if (i12 == 1) {
            actionStatus = ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_LEFT;
        } else if (i12 != 2) {
            actionStatus = i12 != 3 ? ActionStatus.RETURNING_TO_CENTER_VERTICAL_BOTTOM : ActionStatus.RETURNING_TO_CENTER_VERTICAL_TOP;
        } else {
            actionStatus = ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_RIGHT;
        }
        this.actionStatus = actionStatus;
        currentFrameFaceOrientation.setCurrentMovementAchievement(0);
        updateProgressBarProgress(fragment, currentProgressArrow, 0);
        if (currentProgressArrow != null) {
            currentProgressArrow.setRotation((currentProgressArrow.getRotation() + 180) % 360);
        }
        return AccomplishStatus.RETURNING_TO_CENTER;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getChallengeStartDetectionTime() {
        return this.challengeStartDetectionTime;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int getHelpAnimation() {
        if (!l.equals(this.type, TYPE.MOVE_HEAD_AND_BACK, true)) {
            return 0;
        }
        String direction = this.parameters.getDirection();
        switch (direction.hashCode()) {
            case -1383228885:
                if (direction.equals("bottom")) {
                    return this.actionStatus == ActionStatus.REACHING_POSITION ? R.raw.vd_photo_centertobottom : R.raw.vd_photo_bottomtocenter;
                }
                return 0;
            case 115029:
                if (direction.equals("top")) {
                    return this.actionStatus == ActionStatus.REACHING_POSITION ? R.raw.vd_photo_centertotop : R.raw.vd_photo_toptocenter;
                }
                return 0;
            case 3317767:
                if (direction.equals(Parameters.DIRECTION.LEFT)) {
                    return this.actionStatus == ActionStatus.REACHING_POSITION ? R.raw.vd_photo_centertoleft : R.raw.vd_photo_lefttocenter;
                }
                return 0;
            case 108511772:
                if (direction.equals(Parameters.DIRECTION.RIGHT)) {
                    return this.actionStatus == ActionStatus.REACHING_POSITION ? R.raw.vd_photo_centertoright : R.raw.vd_photo_righttocenter;
                }
                return 0;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final String getHelpText(@Nullable Context context, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (context == null) {
            return "";
        }
        try {
            if (l.equals(this.type, TYPE.MOVE_HEAD_AND_BACK, true)) {
                String direction = this.parameters.getDirection();
                switch (direction.hashCode()) {
                    case -1383228885:
                        if (direction.equals("bottom")) {
                            return this.actionStatus == ActionStatus.REACHING_POSITION ? configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_CHALLENGE_BOTTOM_TEXT) : configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_CHALLENGE_CENTER_TEXT);
                        }
                        break;
                    case 115029:
                        if (direction.equals("top")) {
                            return this.actionStatus == ActionStatus.REACHING_POSITION ? configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_CHALLENGE_TOP_TEXT) : configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_CHALLENGE_CENTER_TEXT);
                        }
                        break;
                    case 3317767:
                        if (direction.equals(Parameters.DIRECTION.LEFT)) {
                            return this.actionStatus == ActionStatus.REACHING_POSITION ? configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_CHALLENGE_LEFT_TEXT) : configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_CHALLENGE_CENTER_TEXT);
                        }
                        break;
                    case 108511772:
                        if (direction.equals(Parameters.DIRECTION.RIGHT)) {
                            return this.actionStatus == ActionStatus.REACHING_POSITION ? configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_CHALLENGE_RIGHT_TEXT) : configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_CHALLENGE_CENTER_TEXT);
                        }
                        break;
                }
            }
        } catch (PropertyNameNotFoundException e5) {
            Log.e(TAG, e5);
        }
        return "";
    }

    public final int getInvalidationActionThreshold() {
        return this.invalidationActionThreshold;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.parameters;
    }

    public final int getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getValidationActionThreshold() {
        return this.validationActionThreshold;
    }

    public final long getWebVTTEndTime() {
        return this.webVTTEndTime;
    }

    public final long getWebVTTStartTime() {
        return this.webVTTStartTime;
    }

    public final boolean isValid() {
        if (CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(new String[]{TYPE.MOVE_HEAD_AND_BACK}, 1)).contains(this.type)) {
            return this.parameters.isValid();
        }
        return false;
    }

    public final void resetParameters() {
        this.actionStatus = ActionStatus.REACHING_POSITION;
        this.actionValidationIndex = 0;
        this.challengeStartDetectionTime = 0L;
        this.webVTTStartTime = 0L;
        this.webVTTEndTime = 0L;
    }

    public final void setChallengeStartDetectionTime(long j10) {
        this.challengeStartDetectionTime = j10;
    }

    public final void setInvalidationActionThreshold(int i10) {
        this.invalidationActionThreshold = i10;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setParameters(@NotNull Parameters parameters) {
        Intrinsics.checkNotNullParameter(parameters, "<set-?>");
        this.parameters = parameters;
    }

    public final void setTimeoutSeconds(int i10) {
        this.timeoutSeconds = i10;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setValidationActionThreshold(int i10) {
        this.validationActionThreshold = i10;
    }

    public final void setValidationActionThresholdFromCameraFPS(int cameraFPS) {
        if (cameraFPS <= 10) {
            this.validationActionThreshold = 2;
            this.invalidationActionThreshold = 3;
        } else if (cameraFPS <= 20) {
            this.validationActionThreshold = 4;
            this.invalidationActionThreshold = 6;
        } else if (cameraFPS <= 30) {
            this.validationActionThreshold = 6;
            this.invalidationActionThreshold = 9;
        } else {
            this.validationActionThreshold = 8;
            this.invalidationActionThreshold = 12;
        }
    }

    public final void setWebVTTEndTime(long j10) {
        this.webVTTEndTime = j10;
    }

    public final void setWebVTTStartTime(long j10) {
        this.webVTTStartTime = j10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        this.parameters.writeToParcel(parcel, flags);
    }

    private static /* synthetic */ void getActionInvalidationIndex$annotations() {
    }

    private static /* synthetic */ void getActionStatus$annotations() {
    }

    private static /* synthetic */ void getActionValidationIndex$annotations() {
    }

    public static /* synthetic */ void getChallengeStartDetectionTime$annotations() {
    }

    public static /* synthetic */ void getInvalidationActionThreshold$annotations() {
    }

    public static /* synthetic */ void getTimeoutSeconds$annotations() {
    }

    public static /* synthetic */ void getValidationActionThreshold$annotations() {
    }

    public static /* synthetic */ void getWebVTTEndTime$annotations() {
    }

    public static /* synthetic */ void getWebVTTStartTime$annotations() {
    }
}
