package mx.openpay.library.ui.taponphone.charge;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mastercard.sonic.controller.SonicController;
import com.mastercard.sonic.controller.SonicEnvironment;
import com.mastercard.sonic.controller.SonicType;
import com.mastercard.sonic.listeners.OnPrepareListener;
import com.mastercard.sonic.model.SonicMerchant;
import g.g;
import g.h;
import g.i;
import g.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.mapper.ChargeMapperKt;
import mx.openpay.library.core.mapper.OpenPayErrorMapperKt;
import mx.openpay.library.core.model.OpenPayChargeState;
import mx.openpay.library.core.model.OpenPayError;
import mx.openpay.library.core.model.OpenPayProcessingStep;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPayTerminalChargeCreation;
import mx.openpay.library.core.model.extra.ChargeTransaction;
import mx.openpay.library.core.util.CardUtils;
import mx.openpay.library.di.DependenciesProvider;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.ProcessingStep;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.eglobal.Merchant;
import mx.openpay.library.domain.model.taponphone.NotifyUserItem;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallback;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallbackStates;
import mx.openpay.library.domain.util.Constant;
import mx.openpay.library.domain.util.Result;
import mx.openpay.library.domain.util.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0003#\"$B\u0007¢\u0006\u0004\b \u0010!J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00188F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001b¨\u0006%"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", "context", "Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;", "chargeData", "Lcom/mastercard/sonic/controller/SonicController;", "sonicController", "Lkotlinx/coroutines/Job;", "executeCharge", "", "withPoints", "onPointsModalResponse", "", "plans", "onPlansModalResponse", "", "encodedImage", "onSignatureRecorded", "cancelProcess", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "charge", "", "postProcessedStep", "Landroidx/lifecycle/LiveData;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$IntegratorUpdateState;", "getIntegratorUpdateState", "()Landroidx/lifecycle/LiveData;", "integratorUpdateState", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "getUiState", "uiState", "<init>", "()V", "Companion", "ChargeUiState", "IntegratorUpdateState", "library_release"}, k = 1, mv = {1, 8, 0})
public final class TapOnPhoneCreateChargeViewModel extends ViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CreateCharge f84366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SonicMerchant f84367c;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84365a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f84368d = new MutableLiveData();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableLiveData f84369e = new MutableLiveData(ChargeUiState.Idle.INSTANCE);

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "", "BringCardCloser", "Idle", "MoveCardAway", "PayWithPlans", "PayWithPoints", "PlayMasterCardSoundAndAnimation", "PlayVisaBrandingSoundAndAnimation", "Processing", "RequestDigitalSignature", "SeeDevice", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$BringCardCloser;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$Idle;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$MoveCardAway;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$PayWithPlans;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$PayWithPoints;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$PlayMasterCardSoundAndAnimation;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$PlayVisaBrandingSoundAndAnimation;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$Processing;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$RequestDigitalSignature;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$SeeDevice;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class ChargeUiState {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$BringCardCloser;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class BringCardCloser extends ChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final BringCardCloser INSTANCE = new BringCardCloser();

            public BringCardCloser() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$Idle;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class Idle extends ChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final Idle INSTANCE = new Idle();

            public Idle() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$MoveCardAway;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class MoveCardAway extends ChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final MoveCardAway INSTANCE = new MoveCardAway();

            public MoveCardAway() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$PayWithPlans;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "", "", "a", "Ljava/util/List;", "getPlans", "()Ljava/util/List;", "plans", "<init>", "(Ljava/util/List;)V", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class PayWithPlans extends ChargeUiState {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final List plans;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PayWithPlans(@NotNull List<Integer> plans) {
                super(null);
                Intrinsics.checkNotNullParameter(plans, "plans");
                this.plans = plans;
            }

            @NotNull
            public final List<Integer> getPlans() {
                return this.plans;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$PayWithPoints;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class PayWithPoints extends ChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final PayWithPoints INSTANCE = new PayWithPoints();

            public PayWithPoints() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$PlayMasterCardSoundAndAnimation;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "a", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "getCharge", "()Lmx/openpay/library/core/model/extra/ChargeTransaction;", "charge", "<init>", "(Lmx/openpay/library/core/model/extra/ChargeTransaction;)V", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class PlayMasterCardSoundAndAnimation extends ChargeUiState {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final ChargeTransaction charge;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayMasterCardSoundAndAnimation(@NotNull ChargeTransaction charge) {
                super(null);
                Intrinsics.checkNotNullParameter(charge, "charge");
                this.charge = charge;
            }

            @NotNull
            public final ChargeTransaction getCharge() {
                return this.charge;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$PlayVisaBrandingSoundAndAnimation;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "a", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "getCharge", "()Lmx/openpay/library/core/model/extra/ChargeTransaction;", "charge", "<init>", "(Lmx/openpay/library/core/model/extra/ChargeTransaction;)V", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class PlayVisaBrandingSoundAndAnimation extends ChargeUiState {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final ChargeTransaction charge;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayVisaBrandingSoundAndAnimation(@NotNull ChargeTransaction charge) {
                super(null);
                Intrinsics.checkNotNullParameter(charge, "charge");
                this.charge = charge;
            }

            @NotNull
            public final ChargeTransaction getCharge() {
                return this.charge;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$Processing;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class Processing extends ChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final Processing INSTANCE = new Processing();

            public Processing() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$RequestDigitalSignature;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class RequestDigitalSignature extends ChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final RequestDigitalSignature INSTANCE = new RequestDigitalSignature();

            public RequestDigitalSignature() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState$SeeDevice;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$ChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class SeeDevice extends ChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final SeeDevice INSTANCE = new SeeDevice();

            public SeeDevice() {
                super(null);
            }
        }

        public ChargeUiState() {
        }

        public /* synthetic */ ChargeUiState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$IntegratorUpdateState;", "", "CompleteChargeStatus", "UpdateChargeStatus", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$IntegratorUpdateState$CompleteChargeStatus;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$IntegratorUpdateState$UpdateChargeStatus;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class IntegratorUpdateState {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bR#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$IntegratorUpdateState$CompleteChargeStatus;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$IntegratorUpdateState;", "Lmx/openpay/library/core/model/OpenPayResult;", "Lmx/openpay/library/core/model/OpenPayChargeState;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "a", "Lmx/openpay/library/core/model/OpenPayResult;", "getResult", "()Lmx/openpay/library/core/model/OpenPayResult;", "result", "<init>", "(Lmx/openpay/library/core/model/OpenPayResult;)V", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class CompleteChargeStatus extends IntegratorUpdateState {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final OpenPayResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompleteChargeStatus(@NotNull OpenPayResult<? extends OpenPayChargeState<ChargeTransaction>> result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            public final OpenPayResult<OpenPayChargeState<ChargeTransaction>> getResult() {
                return this.result;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bR#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$IntegratorUpdateState$UpdateChargeStatus;", "Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeViewModel$IntegratorUpdateState;", "Lmx/openpay/library/core/model/OpenPayResult;", "Lmx/openpay/library/core/model/OpenPayChargeState;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "a", "Lmx/openpay/library/core/model/OpenPayResult;", "getResult", "()Lmx/openpay/library/core/model/OpenPayResult;", "result", "<init>", "(Lmx/openpay/library/core/model/OpenPayResult;)V", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class UpdateChargeStatus extends IntegratorUpdateState {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final OpenPayResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateChargeStatus(@NotNull OpenPayResult<? extends OpenPayChargeState<ChargeTransaction>> result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            public final OpenPayResult<OpenPayChargeState<ChargeTransaction>> getResult() {
                return this.result;
            }
        }

        public IntegratorUpdateState() {
        }

        public /* synthetic */ IntegratorUpdateState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CardUtils.CardBrand.values().length];
            try {
                iArr[CardUtils.CardBrand.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardUtils.CardBrand.VISA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardUtils.CardBrand.MASTERCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProcessingStep.values().length];
            try {
                iArr2[ProcessingStep.PROCESSED_STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProcessingStep.PAY_WITH_POINTS_STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProcessingStep.PAY_WITH_PLANS_STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ProcessingStep.DIGITAL_SIGN_STEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void access$evalChargeResult(TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel, Result result) {
        MutableLiveData mutableLiveData;
        Object completeChargeStatus;
        MutableLiveData mutableLiveData2;
        IntegratorUpdateState completeChargeStatus2;
        tapOnPhoneCreateChargeViewModel.getClass();
        if (result instanceof Result.Success) {
            ProcessingStep processStep = ((Result.Success) result).getProcessStep();
            int i10 = processStep == null ? -1 : WhenMappings.$EnumSwitchMapping$1[processStep.ordinal()];
            if (i10 == -1) {
                mutableLiveData2 = tapOnPhoneCreateChargeViewModel.f84368d;
                completeChargeStatus2 = new IntegratorUpdateState.CompleteChargeStatus(new OpenPayResult.Failure(OpenPayError.Unknown.INSTANCE));
            } else if (i10 == 1) {
                ChargeTransaction chargeTransactionMapToLibraryChargeTransactionModel = ChargeMapperKt.mapToLibraryChargeTransactionModel((Charge) ResultKt.getSuccessData(result));
                int i11 = WhenMappings.$EnumSwitchMapping$0[CardUtils.INSTANCE.getCardType(chargeTransactionMapToLibraryChargeTransactionModel.getCardNumber()).ordinal()];
                if (i11 == 1) {
                    tapOnPhoneCreateChargeViewModel.postProcessedStep(chargeTransactionMapToLibraryChargeTransactionModel);
                    return;
                } else if (i11 == 2) {
                    mutableLiveData = tapOnPhoneCreateChargeViewModel.f84369e;
                    completeChargeStatus = new ChargeUiState.PlayVisaBrandingSoundAndAnimation(chargeTransactionMapToLibraryChargeTransactionModel);
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    mutableLiveData = tapOnPhoneCreateChargeViewModel.f84369e;
                    completeChargeStatus = new ChargeUiState.PlayMasterCardSoundAndAnimation(chargeTransactionMapToLibraryChargeTransactionModel);
                }
            } else if (i10 == 2) {
                mutableLiveData2 = tapOnPhoneCreateChargeViewModel.f84368d;
                completeChargeStatus2 = new IntegratorUpdateState.UpdateChargeStatus(new OpenPayResult.Success(new OpenPayChargeState.Processing(OpenPayProcessingStep.PayWithPoints.INSTANCE)));
            } else if (i10 == 3) {
                mutableLiveData2 = tapOnPhoneCreateChargeViewModel.f84368d;
                completeChargeStatus2 = new IntegratorUpdateState.UpdateChargeStatus(new OpenPayResult.Success(new OpenPayChargeState.Processing(OpenPayProcessingStep.PayWithPlans.INSTANCE)));
            } else {
                if (i10 != 4) {
                    return;
                }
                mutableLiveData2 = tapOnPhoneCreateChargeViewModel.f84368d;
                completeChargeStatus2 = new IntegratorUpdateState.UpdateChargeStatus(new OpenPayResult.Success(new OpenPayChargeState.Processing(OpenPayProcessingStep.RequireDigitalSign.INSTANCE)));
            }
            mutableLiveData2.postValue(completeChargeStatus2);
            return;
        }
        if (!(result instanceof Result.Failure)) {
            return;
        }
        mutableLiveData = tapOnPhoneCreateChargeViewModel.f84368d;
        completeChargeStatus = new IntegratorUpdateState.CompleteChargeStatus(new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError())));
        mutableLiveData.postValue(completeChargeStatus);
    }

    public static final void access$prepareMasterCardBrand(TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel, Context context, SonicController sonicController) throws JSONException {
        String merchantName;
        tapOnPhoneCreateChargeViewModel.getClass();
        DependenciesProvider dependenciesProvider = DependenciesProvider.INSTANCE;
        dependenciesProvider.provideCurrentCountry();
        SonicMerchant.Builder builder = new SonicMerchant.Builder();
        Merchant activeMerchantInfo = OpenPaySdk.INSTANCE.getTapOnPhoneController().getActiveMerchantInfo();
        if (activeMerchantInfo == null || (merchantName = activeMerchantInfo.getMerchantName()) == null) {
            merchantName = "";
        }
        tapOnPhoneCreateChargeViewModel.f84367c = builder.merchantName(merchantName).merchantCategoryCodes(new String[]{"MCC 0000"}).countryCode(Constant.MEX_ISO_CODE).build();
        SonicType sonicType = SonicType.SOUND_AND_ANIMATION;
        SonicEnvironment sonicEnvironment = dependenciesProvider.isProdEnv() ? SonicEnvironment.PRODUCTION : SonicEnvironment.SANDBOX;
        SonicMerchant sonicMerchant = tapOnPhoneCreateChargeViewModel.f84367c;
        if (sonicMerchant == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sonicMerchant");
            sonicMerchant = null;
        }
        sonicController.prepare(sonicType, "checkout", sonicEnvironment, sonicMerchant, true, context, new OnPrepareListener() { // from class: mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeViewModel$prepareMasterCardBrand$1
            @Override // com.mastercard.sonic.listeners.OnPrepareListener
            public void onPrepared(int statusCode) {
            }
        });
    }

    public static final TapOnPhoneCallback access$tapOnPhoneChargeCallback(final TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel) {
        tapOnPhoneCreateChargeViewModel.getClass();
        return new TapOnPhoneCallback() { // from class: mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeViewModel$tapOnPhoneChargeCallback$1

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NotifyUserItem.values().length];
                    try {
                        iArr[NotifyUserItem.IDLE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NotifyUserItem.PROCESSING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NotifyUserItem.INITIALIZE_KEYS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NotifyUserItem.DO_NOT_REMOVE_CARD.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[NotifyUserItem.CANCELLING.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[NotifyUserItem.BRING_CARD_CLOSER.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[NotifyUserItem.MOVE_CARD_AWAY.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[NotifyUserItem.SEE_DEVICE.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // mx.openpay.library.domain.model.taponphone.TapOnPhoneCallback
            public void execute(@NotNull TapOnPhoneCallbackStates state) {
                MutableLiveData mutableLiveData;
                TapOnPhoneCreateChargeViewModel.ChargeUiState chargeUiState;
                Intrinsics.checkNotNullParameter(state, "state");
                if (state instanceof TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.PayWithPoints) {
                    this.f84375a.f84366b = ((TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.PayWithPoints) state).getCreateCharge();
                    mutableLiveData = this.f84375a.f84369e;
                    chargeUiState = TapOnPhoneCreateChargeViewModel.ChargeUiState.PayWithPoints.INSTANCE;
                } else {
                    if (state instanceof TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.PayWithPlans) {
                        TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.PayWithPlans payWithPlans = (TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.PayWithPlans) state;
                        this.f84375a.f84366b = payWithPlans.getCreateCharge();
                        this.f84375a.f84369e.postValue(new TapOnPhoneCreateChargeViewModel.ChargeUiState.PayWithPlans(payWithPlans.getPlans()));
                        return;
                    }
                    if (state instanceof TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.RequestDigitalSignature) {
                        this.f84375a.f84366b = ((TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.RequestDigitalSignature) state).getCreateCharge();
                        mutableLiveData = this.f84375a.f84369e;
                        chargeUiState = TapOnPhoneCreateChargeViewModel.ChargeUiState.RequestDigitalSignature.INSTANCE;
                    } else if (state instanceof TapOnPhoneCallbackStates.NotifyUser) {
                        switch (WhenMappings.$EnumSwitchMapping$0[((TapOnPhoneCallbackStates.NotifyUser) state).getItem().ordinal()]) {
                            case 1:
                                mutableLiveData = this.f84375a.f84369e;
                                chargeUiState = TapOnPhoneCreateChargeViewModel.ChargeUiState.Idle.INSTANCE;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                if (!this.f84375a.f84365a) {
                                    return;
                                }
                                mutableLiveData = this.f84375a.f84369e;
                                chargeUiState = TapOnPhoneCreateChargeViewModel.ChargeUiState.Processing.INSTANCE;
                                break;
                            case 6:
                                mutableLiveData = this.f84375a.f84369e;
                                chargeUiState = TapOnPhoneCreateChargeViewModel.ChargeUiState.BringCardCloser.INSTANCE;
                                break;
                            case 7:
                                this.f84375a.f84365a = false;
                                mutableLiveData = this.f84375a.f84369e;
                                chargeUiState = TapOnPhoneCreateChargeViewModel.ChargeUiState.MoveCardAway.INSTANCE;
                                break;
                            case 8:
                                mutableLiveData = this.f84375a.f84369e;
                                chargeUiState = TapOnPhoneCreateChargeViewModel.ChargeUiState.SeeDevice.INSTANCE;
                                break;
                            default:
                                return;
                        }
                    } else {
                        return;
                    }
                }
                mutableLiveData.postValue(chargeUiState);
            }
        };
    }

    @NotNull
    public final Job cancelProcess() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g.f(null), 3, null);
    }

    @NotNull
    public final Job executeCharge(@NotNull Context context, @Nullable OpenPayTerminalChargeCreation chargeData, @NotNull SonicController sonicController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sonicController, "sonicController");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g(chargeData, this, context, sonicController, null), 3, null);
    }

    @NotNull
    public final LiveData<IntegratorUpdateState> getIntegratorUpdateState() {
        return this.f84368d;
    }

    @NotNull
    public final LiveData<ChargeUiState> getUiState() {
        return this.f84369e;
    }

    @NotNull
    public final Job onPlansModalResponse(int plans) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h(this, plans, null), 3, null);
    }

    @NotNull
    public final Job onPointsModalResponse(boolean withPoints) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i(this, withPoints, null), 3, null);
    }

    @NotNull
    public final Job onSignatureRecorded(@NotNull String encodedImage) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j(this, encodedImage, null), 3, null);
    }

    public final void postProcessedStep(@NotNull ChargeTransaction charge) {
        Intrinsics.checkNotNullParameter(charge, "charge");
        this.f84368d.postValue(new IntegratorUpdateState.CompleteChargeStatus(new OpenPayResult.Success(new OpenPayChargeState.Success(charge))));
    }
}
