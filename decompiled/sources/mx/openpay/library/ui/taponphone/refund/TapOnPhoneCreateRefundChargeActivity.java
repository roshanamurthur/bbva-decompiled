package mx.openpay.library.ui.taponphone.refund;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import h.c;
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
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.databinding.ActivityTapOnPhoneCreateRefundChargeBinding;
import mx.openpay.library.ui.util.DoubleExtensionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "library_release"}, k = 1, mv = {1, 8, 0})
public final class TapOnPhoneCreateRefundChargeActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TapOnPhoneCreateRefundChargeViewModel f84388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActivityTapOnPhoneCreateRefundChargeBinding f84389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f84390c = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeActivity$Companion;", "", "Landroid/content/Context;", "context", "Lmx/openpay/library/core/model/OpenPayTransaction;", "transactionData", "Landroid/content/Intent;", "getIntent", "", "TRANSACTION_DATA", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent getIntent(@NotNull Context context, @NotNull OpenPayTransaction transactionData) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(transactionData, "transactionData");
            Intent intent = new Intent(context, (Class<?>) TapOnPhoneCreateRefundChargeActivity.class);
            intent.putExtra("TRANSACTION_DATA", transactionData);
            return intent;
        }
    }

    public static final void access$updateUI(TapOnPhoneCreateRefundChargeActivity tapOnPhoneCreateRefundChargeActivity, TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState refundChargeUiState) {
        TextView textView;
        tapOnPhoneCreateRefundChargeActivity.getClass();
        if (Intrinsics.areEqual(refundChargeUiState, TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState.Idle.INSTANCE)) {
            return;
        }
        ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding = null;
        if (Intrinsics.areEqual(refundChargeUiState, TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState.Processing.INSTANCE)) {
            ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding2 = tapOnPhoneCreateRefundChargeActivity.f84389b;
            if (activityTapOnPhoneCreateRefundChargeBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTapOnPhoneCreateRefundChargeBinding2 = null;
            }
            activityTapOnPhoneCreateRefundChargeBinding2.tapOnPhoneLoader.setVisibility(0);
            ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding3 = tapOnPhoneCreateRefundChargeActivity.f84389b;
            if (activityTapOnPhoneCreateRefundChargeBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityTapOnPhoneCreateRefundChargeBinding = activityTapOnPhoneCreateRefundChargeBinding3;
            }
            activityTapOnPhoneCreateRefundChargeBinding.tapOnPhoneLoaderMessage.setVisibility(8);
            return;
        }
        if (Intrinsics.areEqual(refundChargeUiState, TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState.BringCardCloser.INSTANCE)) {
            ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding4 = tapOnPhoneCreateRefundChargeActivity.f84389b;
            if (activityTapOnPhoneCreateRefundChargeBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTapOnPhoneCreateRefundChargeBinding4 = null;
            }
            activityTapOnPhoneCreateRefundChargeBinding4.tapOnPhoneLoader.setVisibility(8);
            ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding5 = tapOnPhoneCreateRefundChargeActivity.f84389b;
            if (activityTapOnPhoneCreateRefundChargeBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityTapOnPhoneCreateRefundChargeBinding = activityTapOnPhoneCreateRefundChargeBinding5;
            }
            activityTapOnPhoneCreateRefundChargeBinding.tapOnPhoneAnimation.playAnimation();
            return;
        }
        if (Intrinsics.areEqual(refundChargeUiState, TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState.MoveCardAway.INSTANCE)) {
            ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding6 = tapOnPhoneCreateRefundChargeActivity.f84389b;
            if (activityTapOnPhoneCreateRefundChargeBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTapOnPhoneCreateRefundChargeBinding6 = null;
            }
            activityTapOnPhoneCreateRefundChargeBinding6.tapOnPhoneLoader.setVisibility(0);
            ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding7 = tapOnPhoneCreateRefundChargeActivity.f84389b;
            if (activityTapOnPhoneCreateRefundChargeBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTapOnPhoneCreateRefundChargeBinding7 = null;
            }
            activityTapOnPhoneCreateRefundChargeBinding7.tapOnPhoneLoaderMessage.setText(R.string.tap_on_phone_loader_move_card_away);
            ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding8 = tapOnPhoneCreateRefundChargeActivity.f84389b;
            if (activityTapOnPhoneCreateRefundChargeBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityTapOnPhoneCreateRefundChargeBinding = activityTapOnPhoneCreateRefundChargeBinding8;
            }
            textView = activityTapOnPhoneCreateRefundChargeBinding.tapOnPhoneLoaderMessage;
        } else {
            if (!Intrinsics.areEqual(refundChargeUiState, TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState.SeeDevice.INSTANCE)) {
                if (refundChargeUiState instanceof TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState.CompleteRefundChargeStatus) {
                    BuildersKt__Builders_commonKt.launch$default(tapOnPhoneCreateRefundChargeActivity.f84390c, null, null, new c(((TapOnPhoneCreateRefundChargeViewModel.RefundChargeUiState.CompleteRefundChargeStatus) refundChargeUiState).getResult(), null), 3, null);
                    tapOnPhoneCreateRefundChargeActivity.finish();
                    return;
                }
                return;
            }
            ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding9 = tapOnPhoneCreateRefundChargeActivity.f84389b;
            if (activityTapOnPhoneCreateRefundChargeBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityTapOnPhoneCreateRefundChargeBinding = activityTapOnPhoneCreateRefundChargeBinding9;
            }
            textView = activityTapOnPhoneCreateRefundChargeBinding.tapOnPhoneBottomDisclaimer;
        }
        textView.setVisibility(0);
    }

    public final void a() {
        ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding = this.f84389b;
        if (activityTapOnPhoneCreateRefundChargeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateRefundChargeBinding = null;
        }
        activityTapOnPhoneCreateRefundChargeBinding.tapOnPhoneCancel.setOnClickListener(new x5.a(this, 3));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBindingInflate = ActivityTapOnPhoneCreateRefundChargeBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(activityTapOnPhoneCreateRefundChargeBindingInflate, "inflate(layoutInflater)");
        this.f84389b = activityTapOnPhoneCreateRefundChargeBindingInflate;
        TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel = null;
        if (activityTapOnPhoneCreateRefundChargeBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateRefundChargeBindingInflate = null;
        }
        setContentView(activityTapOnPhoneCreateRefundChargeBindingInflate.getRoot());
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel2 = (TapOnPhoneCreateRefundChargeViewModel) new ViewModelProvider(this).get(TapOnPhoneCreateRefundChargeViewModel.class);
        this.f84388a = tapOnPhoneCreateRefundChargeViewModel2;
        if (tapOnPhoneCreateRefundChargeViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            tapOnPhoneCreateRefundChargeViewModel2 = null;
        }
        tapOnPhoneCreateRefundChargeViewModel2.getUiState().observe(this, new h.b(new a(this)));
        ActivityTapOnPhoneCreateRefundChargeBinding activityTapOnPhoneCreateRefundChargeBinding = this.f84389b;
        if (activityTapOnPhoneCreateRefundChargeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTapOnPhoneCreateRefundChargeBinding = null;
        }
        TextView textView = activityTapOnPhoneCreateRefundChargeBinding.tapOnPhoneSaleAmount;
        int i10 = R.string.tap_on_phone_sale_amount;
        Object[] objArr = new Object[1];
        OpenPayTransaction openPayTransaction = (OpenPayTransaction) getIntent().getParcelableExtra("TRANSACTION_DATA");
        objArr[0] = openPayTransaction != null ? DoubleExtensionKt.formatToStringWithDecimals(openPayTransaction.getAmount()) : null;
        textView.setText(getString(i10, objArr));
        TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel3 = this.f84388a;
        if (tapOnPhoneCreateRefundChargeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            tapOnPhoneCreateRefundChargeViewModel = tapOnPhoneCreateRefundChargeViewModel3;
        }
        tapOnPhoneCreateRefundChargeViewModel.executeRefundCharge(this, (OpenPayTransaction) getIntent().getParcelableExtra("TRANSACTION_DATA"));
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new h.a(this), 3, null);
        a();
    }

    public static final void a(TapOnPhoneCreateRefundChargeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TapOnPhoneCreateRefundChargeViewModel tapOnPhoneCreateRefundChargeViewModel = this$0.f84388a;
        if (tapOnPhoneCreateRefundChargeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            tapOnPhoneCreateRefundChargeViewModel = null;
        }
        tapOnPhoneCreateRefundChargeViewModel.cancelProcess();
    }
}
