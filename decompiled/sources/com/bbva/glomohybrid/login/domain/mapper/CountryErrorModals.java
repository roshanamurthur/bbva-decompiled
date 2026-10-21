package com.bbva.glomohybrid.login.domain.mapper;

import androidx.fragment.app.FragmentActivity;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalState;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomoconfig.factory.HalfModalComponentFactory;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.login.domain.model.CountryLoginErrorType;
import com.bbva.glomohybrid.login.presentation.reactions.LoginModals;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountryErrorModals.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/mapper/CountryErrorModals;", "Lcom/bbva/glomohybrid/login/presentation/reactions/LoginModals;", "", "configure", "Lcom/bbva/glomohybrid/login/domain/model/CountryLoginErrorType;", "errorType", "", "getModalId", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "id", "message", "showModal", "", "isNavigation", "s0", "Ljava/lang/String;", "getGenericErrorId", "()Ljava/lang/String;", "genericErrorId", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "halfModalComponent", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryErrorModals.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryErrorModals.kt\ncom/bbva/glomohybrid/login/domain/mapper/CountryErrorModals\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1#2:94\n1747#3,3:95\n*S KotlinDebug\n*F\n+ 1 CountryErrorModals.kt\ncom/bbva/glomohybrid/login/domain/mapper/CountryErrorModals\n*L\n91#1:95,3\n*E\n"})
public final class CountryErrorModals extends LoginModals {

    @NotNull
    public static final String akamai = "half_modal_error_akamai";

    @NotNull
    public static final String biometricFaceId = "biometric-error-half-modal-face";

    @NotNull
    public static final String biometricFingerprintId = "biometric-error-half-modal-fingerprint";

    @NotNull
    public static final String blockedUserId = "blocked-user";

    @NotNull
    public static final String expiredPassword = "expired-password-half-modal";

    @NotNull
    public static final String flowmeter = "flowmeter_half_modal";

    @NotNull
    public static final String invalidCredentialsId = "invalid-username-password-half-modal";

    @NotNull
    public static final String kne0116 = "half_modal_error_kne0116";

    @NotNull
    public static final String maintenanceFlowmeter = "maintenance-flowmeter";

    @NotNull
    public static final String standIn = "stand_in_user_half_modal";

    @NotNull
    public static final String technicalError = "technical-error-half-modal";

    @NotNull
    public static final String unauthorizedAccess = "unauthorized-access-half-modal";

    @NotNull
    public static final String unavailableServiceFaceId = "unavailable-service-half-modal-face";

    @NotNull
    public static final String unavailableServiceFingerprintId = "unavailable-service-half-modal-fingerprint";

    @NotNull
    public static final String unavailableServiceId = "unavailable-service-half-modal";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final HalfModalComponent f33375r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String genericErrorId;

    /* JADX INFO: compiled from: CountryErrorModals.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CountryLoginErrorType.values().length];
            try {
                iArr[CountryLoginErrorType.InvalidCredentials.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryLoginErrorType.BlockedUser.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryLoginErrorType.ExpiredCredentials.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CountryLoginErrorType.UnauthorizedAccess.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CountryLoginErrorType.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CountryLoginErrorType.Flowmeter.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CountryLoginErrorType.MaintenanceFlowmeter.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryErrorModals(@NotNull BaseReaction baseReaction, @NotNull HalfModalComponent halfModalComponent) {
        super(baseReaction, halfModalComponent);
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        Intrinsics.checkNotNullParameter(halfModalComponent, "halfModalComponent");
        this.f33375r0 = halfModalComponent;
        this.genericErrorId = "unavailable-service-half-modal";
    }

    @Override // com.bbva.glomohybrid.login.presentation.reactions.LoginModals
    public void configure() {
        super.configure();
    }

    @Override // com.bbva.glomohybrid.login.presentation.reactions.LoginModals
    @NotNull
    public String getGenericErrorId() {
        return this.genericErrorId;
    }

    @Override // com.bbva.glomohybrid.login.presentation.reactions.LoginModals
    @NotNull
    public String getModalId(@NotNull CountryLoginErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        switch (WhenMappings.$EnumSwitchMapping$0[errorType.ordinal()]) {
            case 1:
                return invalidCredentialsId;
            case 2:
                return "blocked-user";
            case 3:
                return expiredPassword;
            case 4:
                return unauthorizedAccess;
            case 5:
                return "unavailable-service-half-modal";
            case 6:
                return flowmeter;
            case 7:
                return "maintenance-flowmeter";
            default:
                return getGenericErrorId();
        }
    }

    @Override // com.bbva.glomohybrid.login.presentation.reactions.LoginModals
    public boolean isNavigation(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"blocked-user", "maintenance-flowmeter"});
        if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
            return false;
        }
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((String) it.next(), id)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    @Override // com.bbva.glomohybrid.login.presentation.reactions.LoginModals
    public void showModal(@NotNull FragmentActivity activity, @NotNull String id, @Nullable String message) {
        HalfModalState halfModalStateGenericError;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(id, "id");
        switch (id) {
            case "half_modal_error_akamai":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.akamaiError();
                break;
            case "invalid-username-password-half-modal":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.invalidCredentials();
                break;
            case "biometric-error-half-modal-face":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.biometricHalfModalError();
                break;
            case "unauthorized-access-half-modal":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.unavailableService();
                break;
            case "half_modal_error_kne0116":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.kne0116Error();
                break;
            case "blocked-user":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.blockedUser();
                break;
            case "unavailable-service-half-modal-face":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.unavailableService();
                break;
            case "unavailable-service-half-modal-fingerprint":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.unavailableService();
                break;
            case "unavailable-service-half-modal":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.technicalError();
                break;
            case "stand_in_user_half_modal":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.standInUser();
                break;
            case "flowmeter_half_modal":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.contingencyError();
                break;
            case "technical-error-half-modal":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.technicalError();
                break;
            case "biometric-error-half-modal-fingerprint":
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.biometricHalfModalError();
                break;
            default:
                halfModalStateGenericError = HalfModalComponentFactory.INSTANCE.genericError();
                break;
        }
        this.f33375r0.configure(halfModalStateGenericError).show(activity);
    }
}
