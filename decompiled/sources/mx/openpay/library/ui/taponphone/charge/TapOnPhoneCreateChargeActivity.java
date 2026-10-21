package mx.openpay.library.ui.taponphone.charge;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.mastercard.sonic.controller.SonicController;
import com.mastercard.sonic.listeners.OnCompleteListener;
import com.mastercard.sonic.widget.SonicBackground;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import mx.openpay.library.R;
import mx.openpay.library.core.model.OpenPayTerminalChargeCreation;
import mx.openpay.library.databinding.ActivityTapOnPhoneCreateChargeBinding;
import mx.openpay.library.ui.modal.PayWithPointsModal;
import mx.openpay.library.ui.modal.plans.PayWithPlansModal;
import mx.openpay.library.ui.signature.DigitalSignatureTopActivity;
import mx.openpay.library.ui.util.BigDecimalExtensionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "library_release"}, k = 1, mv = {1, 8, 0})
public final class TapOnPhoneCreateChargeActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TapOnPhoneCreateChargeViewModel f84358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActivityTapOnPhoneCreateChargeBinding f84359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f84360c = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SonicController f84361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActivityResultLauncher f84362e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/ui/taponphone/charge/TapOnPhoneCreateChargeActivity$Companion;", "", "Landroid/content/Context;", "context", "Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;", "chargeData", "Landroid/content/Intent;", "getIntent", "", "CHARGE_DATA", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent getIntent(@NotNull Context context, @NotNull OpenPayTerminalChargeCreation chargeData) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(chargeData, "chargeData");
            Intent intent = new Intent(context, (Class<?>) TapOnPhoneCreateChargeActivity.class);
            intent.putExtra("CHARGE_DATA", chargeData);
            return intent;
        }
    }

    public TapOnPhoneCreateChargeActivity() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new rb.a(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f84362e = activityResultLauncherRegisterForActivityResult;
    }

    public static final void access$updateIntegratorState(TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity, TapOnPhoneCreateChargeViewModel.IntegratorUpdateState integratorUpdateState) {
        tapOnPhoneCreateChargeActivity.getClass();
        if (integratorUpdateState instanceof TapOnPhoneCreateChargeViewModel.IntegratorUpdateState.UpdateChargeStatus) {
            BuildersKt__Builders_commonKt.launch$default(tapOnPhoneCreateChargeActivity.f84360c, null, null, new g.d(((TapOnPhoneCreateChargeViewModel.IntegratorUpdateState.UpdateChargeStatus) integratorUpdateState).getResult(), null), 3, null);
        } else if (integratorUpdateState instanceof TapOnPhoneCreateChargeViewModel.IntegratorUpdateState.CompleteChargeStatus) {
            BuildersKt__Builders_commonKt.launch$default(tapOnPhoneCreateChargeActivity.f84360c, null, null, new g.d(((TapOnPhoneCreateChargeViewModel.IntegratorUpdateState.CompleteChargeStatus) integratorUpdateState).getResult(), null), 3, null);
            tapOnPhoneCreateChargeActivity.finish();
        }
    }

    public static final void access$updateUI(final TapOnPhoneCreateChargeActivity tapOnPhoneCreateChargeActivity, final TapOnPhoneCreateChargeViewModel.ChargeUiState chargeUiState) throws JSONException {
        TextView textView;
        DialogFragment dialogFragmentNewInstance;
        FragmentManager supportFragmentManager;
        String str;
        tapOnPhoneCreateChargeActivity.getClass();
        if (Intrinsics.areEqual(chargeUiState, TapOnPhoneCreateChargeViewModel.ChargeUiState.Idle.INSTANCE)) {
            return;
        }
        if (Intrinsics.areEqual(chargeUiState, TapOnPhoneCreateChargeViewModel.ChargeUiState.PayWithPoints.INSTANCE)) {
            dialogFragmentNewInstance = new PayWithPointsModal(new c(tapOnPhoneCreateChargeActivity));
            supportFragmentManager = tapOnPhoneCreateChargeActivity.getSupportFragmentManager();
            str = PayWithPointsModal.PAY_WITH_POINTS_MODAL_TAG;
        } else {
            if (!(chargeUiState instanceof TapOnPhoneCreateChargeViewModel.ChargeUiState.PayWithPlans)) {
                if (Intrinsics.areEqual(chargeUiState, TapOnPhoneCreateChargeViewModel.ChargeUiState.RequestDigitalSignature.INSTANCE)) {
                    tapOnPhoneCreateChargeActivity.f84362e.launch(DigitalSignatureTopActivity.INSTANCE.getIntent(tapOnPhoneCreateChargeActivity));
                    return;
                }
                ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding = null;
                if (Intrinsics.areEqual(chargeUiState, TapOnPhoneCreateChargeViewModel.ChargeUiState.Processing.INSTANCE)) {
                    ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding2 = tapOnPhoneCreateChargeActivity.f84359b;
                    if (activityTapOnPhoneCreateChargeBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityTapOnPhoneCreateChargeBinding2 = null;
                    }
                    activityTapOnPhoneCreateChargeBinding2.tapOnPhoneLoader.setVisibility(0);
                    ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding3 = tapOnPhoneCreateChargeActivity.f84359b;
                    if (activityTapOnPhoneCreateChargeBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityTapOnPhoneCreateChargeBinding = activityTapOnPhoneCreateChargeBinding3;
                    }
                    activityTapOnPhoneCreateChargeBinding.tapOnPhoneLoaderMessage.setVisibility(8);
                    return;
                }
                if (Intrinsics.areEqual(chargeUiState, TapOnPhoneCreateChargeViewModel.ChargeUiState.BringCardCloser.INSTANCE)) {
                    ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding4 = tapOnPhoneCreateChargeActivity.f84359b;
                    if (activityTapOnPhoneCreateChargeBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityTapOnPhoneCreateChargeBinding4 = null;
                    }
                    activityTapOnPhoneCreateChargeBinding4.tapOnPhoneLoader.setVisibility(8);
                    ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding5 = tapOnPhoneCreateChargeActivity.f84359b;
                    if (activityTapOnPhoneCreateChargeBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityTapOnPhoneCreateChargeBinding = activityTapOnPhoneCreateChargeBinding5;
                    }
                    activityTapOnPhoneCreateChargeBinding.tapOnPhoneAnimation.playAnimation();
                    return;
                }
                if (Intrinsics.areEqual(chargeUiState, TapOnPhoneCreateChargeViewModel.ChargeUiState.MoveCardAway.INSTANCE)) {
                    ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding6 = tapOnPhoneCreateChargeActivity.f84359b;
                    if (activityTapOnPhoneCreateChargeBinding6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityTapOnPhoneCreateChargeBinding6 = null;
                    }
                    activityTapOnPhoneCreateChargeBinding6.tapOnPhoneLoader.setVisibility(0);
                    ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding7 = tapOnPhoneCreateChargeActivity.f84359b;
                    if (activityTapOnPhoneCreateChargeBinding7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityTapOnPhoneCreateChargeBinding7 = null;
                    }
                    activityTapOnPhoneCreateChargeBinding7.tapOnPhoneLoaderMessage.setText(R.string.tap_on_phone_loader_move_card_away);
                    ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding8 = tapOnPhoneCreateChargeActivity.f84359b;
                    if (activityTapOnPhoneCreateChargeBinding8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityTapOnPhoneCreateChargeBinding = activityTapOnPhoneCreateChargeBinding8;
                    }
                    textView = activityTapOnPhoneCreateChargeBinding.tapOnPhoneLoaderMessage;
                } else {
                    if (!Intrinsics.areEqual(chargeUiState, TapOnPhoneCreateChargeViewModel.ChargeUiState.SeeDevice.INSTANCE)) {
                        if (chargeUiState instanceof TapOnPhoneCreateChargeViewModel.ChargeUiState.PlayMasterCardSoundAndAnimation) {
                            ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding9 = tapOnPhoneCreateChargeActivity.f84359b;
                            if (activityTapOnPhoneCreateChargeBinding9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityTapOnPhoneCreateChargeBinding9 = null;
                            }
                            activityTapOnPhoneCreateChargeBinding9.tapOnPhoneLoader.setVisibility(8);
                            ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding10 = tapOnPhoneCreateChargeActivity.f84359b;
                            if (activityTapOnPhoneCreateChargeBinding10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityTapOnPhoneCreateChargeBinding10 = null;
                            }
                            activityTapOnPhoneCreateChargeBinding10.sonicView.setVisibility(0);
                            SonicController sonicController = tapOnPhoneCreateChargeActivity.f84361d;
                            if (sonicController == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("sonicController");
                                sonicController = null;
                            }
                            ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding11 = tapOnPhoneCreateChargeActivity.f84359b;
                            if (activityTapOnPhoneCreateChargeBinding11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityTapOnPhoneCreateChargeBinding = activityTapOnPhoneCreateChargeBinding11;
                            }
                            sonicController.play(activityTapOnPhoneCreateChargeBinding.sonicView, new OnCompleteListener() { // from class: mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeActivity$updateUI$3
                                @Override // com.mastercard.sonic.listeners.OnCompleteListener
                                public void onComplete(int statusCode) {
                                    TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel = this.f84363a.f84358a;
                                    if (tapOnPhoneCreateChargeViewModel == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                        tapOnPhoneCreateChargeViewModel = null;
                                    }
                                    tapOnPhoneCreateChargeViewModel.postProcessedStep(((TapOnPhoneCreateChargeViewModel.ChargeUiState.PlayMasterCardSoundAndAnimation) chargeUiState).getCharge());
                                }
                            });
                            return;
                        }
                        if (chargeUiState instanceof TapOnPhoneCreateChargeViewModel.ChargeUiState.PlayVisaBrandingSoundAndAnimation) {
                            ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding12 = tapOnPhoneCreateChargeActivity.f84359b;
                            if (activityTapOnPhoneCreateChargeBinding12 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityTapOnPhoneCreateChargeBinding12 = null;
                            }
                            activityTapOnPhoneCreateChargeBinding12.tapOnPhoneLoader.setVisibility(8);
                            ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding13 = tapOnPhoneCreateChargeActivity.f84359b;
                            if (activityTapOnPhoneCreateChargeBinding13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityTapOnPhoneCreateChargeBinding13 = null;
                            }
                            activityTapOnPhoneCreateChargeBinding13.visaBrandingView.setVisibility(0);
                            e eVar = new e(tapOnPhoneCreateChargeActivity, chargeUiState);
                            ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding14 = tapOnPhoneCreateChargeActivity.f84359b;
                            if (activityTapOnPhoneCreateChargeBinding14 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityTapOnPhoneCreateChargeBinding14 = null;
                            }
                            activityTapOnPhoneCreateChargeBinding14.visaBrandingView.setVisibility(0);
                            ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding15 = tapOnPhoneCreateChargeActivity.f84359b;
                            if (activityTapOnPhoneCreateChargeBinding15 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityTapOnPhoneCreateChargeBinding15 = null;
                            }
                            FrameLayout frameLayout = activityTapOnPhoneCreateChargeBinding15.visaBrandingView;
                            ComponentActivityKt.setContent$default(tapOnPhoneCreateChargeActivity, null, ComposableLambdaKt.composableLambdaInstance(-125700393, true, new g.a(eVar)), 1, null);
                            return;
                        }
                        return;
                    }
                    ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding16 = tapOnPhoneCreateChargeActivity.f84359b;
                    if (activityTapOnPhoneCreateChargeBinding16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityTapOnPhoneCreateChargeBinding = activityTapOnPhoneCreateChargeBinding16;
                    }
                    textView = activityTapOnPhoneCreateChargeBinding.tapOnPhoneBottomDisclaimer;
                }
                textView.setVisibility(0);
                return;
            }
            dialogFragmentNewInstance = PayWithPlansModal.INSTANCE.newInstance(new ArrayList<>(((TapOnPhoneCreateChargeViewModel.ChargeUiState.PayWithPlans) chargeUiState).getPlans()), new d(tapOnPhoneCreateChargeActivity));
            supportFragmentManager = tapOnPhoneCreateChargeActivity.getSupportFragmentManager();
            str = PayWithPlansModal.PAY_PLANS_MODAL_TAG;
        }
        dialogFragmentNewInstance.show(supportFragmentManager, str);
    }

    public final void a() {
        ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding = this.f84359b;
        if (activityTapOnPhoneCreateChargeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateChargeBinding = null;
        }
        activityTapOnPhoneCreateChargeBinding.tapOnPhoneCancel.setOnClickListener(new w8.f(this, 3));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BigDecimal amount;
        super.onCreate(savedInstanceState);
        ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBindingInflate = ActivityTapOnPhoneCreateChargeBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(activityTapOnPhoneCreateChargeBindingInflate, "inflate(layoutInflater)");
        this.f84359b = activityTapOnPhoneCreateChargeBindingInflate;
        SonicController sonicController = null;
        if (activityTapOnPhoneCreateChargeBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateChargeBindingInflate = null;
        }
        setContentView(activityTapOnPhoneCreateChargeBindingInflate.getRoot());
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel = (TapOnPhoneCreateChargeViewModel) new ViewModelProvider(this).get(TapOnPhoneCreateChargeViewModel.class);
        this.f84358a = tapOnPhoneCreateChargeViewModel;
        if (tapOnPhoneCreateChargeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            tapOnPhoneCreateChargeViewModel = null;
        }
        tapOnPhoneCreateChargeViewModel.getUiState().observe(this, new g.c(new a(this)));
        TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel2 = this.f84358a;
        if (tapOnPhoneCreateChargeViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            tapOnPhoneCreateChargeViewModel2 = null;
        }
        tapOnPhoneCreateChargeViewModel2.getIntegratorUpdateState().observe(this, new g.c(new b(this)));
        ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding = this.f84359b;
        if (activityTapOnPhoneCreateChargeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateChargeBinding = null;
        }
        activityTapOnPhoneCreateChargeBinding.sonicView.setVisibility(8);
        ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding2 = this.f84359b;
        if (activityTapOnPhoneCreateChargeBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateChargeBinding2 = null;
        }
        activityTapOnPhoneCreateChargeBinding2.sonicView.setBackground(SonicBackground.BLACK);
        this.f84361d = new SonicController();
        ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding3 = this.f84359b;
        if (activityTapOnPhoneCreateChargeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateChargeBinding3 = null;
        }
        activityTapOnPhoneCreateChargeBinding3.visaBrandingView.setVisibility(8);
        ActivityTapOnPhoneCreateChargeBinding activityTapOnPhoneCreateChargeBinding4 = this.f84359b;
        if (activityTapOnPhoneCreateChargeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateChargeBinding4 = null;
        }
        TextView textView = activityTapOnPhoneCreateChargeBinding4.tapOnPhoneSaleAmount;
        int i10 = R.string.tap_on_phone_sale_amount;
        Object[] objArr = new Object[1];
        OpenPayTerminalChargeCreation openPayTerminalChargeCreation = (OpenPayTerminalChargeCreation) getIntent().getParcelableExtra("CHARGE_DATA");
        objArr[0] = (openPayTerminalChargeCreation == null || (amount = openPayTerminalChargeCreation.getAmount()) == null) ? null : BigDecimalExtensionKt.formatToStringWithDecimals(amount);
        textView.setText(getString(i10, objArr));
        TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel3 = this.f84358a;
        if (tapOnPhoneCreateChargeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            tapOnPhoneCreateChargeViewModel3 = null;
        }
        OpenPayTerminalChargeCreation openPayTerminalChargeCreation2 = (OpenPayTerminalChargeCreation) getIntent().getParcelableExtra("CHARGE_DATA");
        SonicController sonicController2 = this.f84361d;
        if (sonicController2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sonicController");
        } else {
            sonicController = sonicController2;
        }
        tapOnPhoneCreateChargeViewModel3.executeCharge(this, openPayTerminalChargeCreation2, sonicController);
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new g.b(this), 3, null);
        a();
    }

    public static final void a(TapOnPhoneCreateChargeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel = this$0.f84358a;
        if (tapOnPhoneCreateChargeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            tapOnPhoneCreateChargeViewModel = null;
        }
        tapOnPhoneCreateChargeViewModel.cancelProcess();
    }

    public static final void a(TapOnPhoneCreateChargeActivity this$0, ActivityResult activityResult) {
        String stringExtra;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            TapOnPhoneCreateChargeViewModel tapOnPhoneCreateChargeViewModel = this$0.f84358a;
            if (tapOnPhoneCreateChargeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                tapOnPhoneCreateChargeViewModel = null;
            }
            Intent data = activityResult.getData();
            if (data == null || (stringExtra = data.getStringExtra(DigitalSignatureTopActivity.ENCODED_IMAGE)) == null) {
                stringExtra = "";
            }
            tapOnPhoneCreateChargeViewModel.onSignatureRecorded(stringExtra);
        }
    }
}
