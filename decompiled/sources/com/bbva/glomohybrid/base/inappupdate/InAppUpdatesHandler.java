package com.bbva.glomohybrid.base.inappupdate;

import androidx.appcompat.app.AppCompatActivity;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.models.InAppUpdateInfo;
import com.bbva.glomohybrid.base.models.InAppUpdateType;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InAppUpdatesHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\fH&J\b\u0010\u0017\u001a\u00020\fH&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler;", "", "flexibleUpdateAlreadyShown", "", "getFlexibleUpdateAlreadyShown", "()Z", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler$InstallState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "configure", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/appcompat/app/AppCompatActivity;", "getInfoForDownload", "Lcom/bbva/glomohybrid/base/models/InAppUpdateInfo;", "updateType", "Lcom/bbva/glomohybrid/base/models/InAppUpdateType;", "(Lcom/bbva/glomohybrid/base/models/InAppUpdateType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInfoForInstall", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", EventDataKeys.Acquisition.ACQUISITION_TYPE_INSTALL, "installationRequired", "startFlow", "inAppUpdateType", "infoUpdate", "Companion", "InstallState", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface InAppUpdatesHandler {
    public static final long ANIMATION_DELAY = 1200;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f31401a;
    public static final int IMMEDIATELY_UPDATE_REQUEST_CODE = 23478;

    /* JADX INFO: compiled from: InAppUpdatesHandler.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler$Companion;", "", "()V", "ANIMATION_DELAY", "", "IMMEDIATELY_UPDATE_REQUEST_CODE", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static final long ANIMATION_DELAY = 1200;
        public static final int IMMEDIATELY_UPDATE_REQUEST_CODE = 23478;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f31401a = new Companion();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: InAppUpdatesHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler$InstallState;", "", ExpectedUserActionOnPoiTypes.NONE, "READY", "REQUIRED", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class InstallState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InstallState[] $VALUES;
        public static final InstallState NONE;
        public static final InstallState READY;
        public static final InstallState REQUIRED;

        static {
            InstallState installState = new InstallState(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = installState;
            InstallState installState2 = new InstallState("READY", 1);
            READY = installState2;
            InstallState installState3 = new InstallState("REQUIRED", 2);
            REQUIRED = installState3;
            InstallState[] installStateArr = {installState, installState2, installState3};
            $VALUES = installStateArr;
            $ENTRIES = EnumEntriesKt.enumEntries(installStateArr);
        }

        public InstallState() {
            throw null;
        }

        @NotNull
        public static EnumEntries<InstallState> getEntries() {
            return $ENTRIES;
        }

        public static InstallState valueOf(String str) {
            return (InstallState) Enum.valueOf(InstallState.class, str);
        }

        public static InstallState[] values() {
            return (InstallState[]) $VALUES.clone();
        }
    }

    void configure(@NotNull AppCompatActivity activity);

    /* JADX INFO: renamed from: getFlexibleUpdateAlreadyShown */
    boolean getV0();

    @Nullable
    Object getInfoForDownload(@NotNull InAppUpdateType inAppUpdateType, @NotNull Continuation<? super InAppUpdateInfo> continuation);

    @Nullable
    Object getInfoForInstall(@NotNull Continuation<? super InAppUpdateInfo> continuation);

    @NotNull
    StateFlow<InstallState> getState();

    void install();

    void installationRequired();

    boolean startFlow(@NotNull InAppUpdateType inAppUpdateType, @NotNull InAppUpdateInfo infoUpdate);
}
