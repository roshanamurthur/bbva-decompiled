package mx.openpay.library.ui.signature;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.R;
import mx.openpay.library.core.bluetooth.BluetoothController;
import mx.openpay.library.databinding.ActivityDigitalSignatureComponentBinding;
import mx.openpay.library.ui.util.UIExtensionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lmx/openpay/library/ui/signature/DigitalSignatureComponentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "library_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDigitalSignatureComponentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigitalSignatureComponentActivity.kt\nmx/openpay/library/ui/signature/DigitalSignatureComponentActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,103:1\n262#2,2:104\n262#2,2:106\n262#2,2:108\n*S KotlinDebug\n*F\n+ 1 DigitalSignatureComponentActivity.kt\nmx/openpay/library/ui/signature/DigitalSignatureComponentActivity\n*L\n54#1:104,2\n60#1:106,2\n78#1:108,2\n*E\n"})
public final class DigitalSignatureComponentActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivityDigitalSignatureComponentBinding f84348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DigitalSignatureViewModel f84349b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/ui/signature/DigitalSignatureComponentActivity$Companion;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "getIntent", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent getIntent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) DigitalSignatureComponentActivity.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e A[PHI: r0
      0x002e: PHI (r0v8 boolean) = (r0v5 boolean), (r0v9 boolean) binds: [B:24:0x005f, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[PHI: r0 r4
      0x0032: PHI (r0v6 boolean) = (r0v5 boolean), (r0v9 boolean) binds: [B:24:0x005f, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v2 mx.openpay.library.databinding.ActivityDigitalSignatureComponentBinding) = 
      (r4v1 mx.openpay.library.databinding.ActivityDigitalSignatureComponentBinding)
      (r4v4 mx.openpay.library.databinding.ActivityDigitalSignatureComponentBinding)
     binds: [B:24:0x005f, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void access$updateUI(DigitalSignatureComponentActivity digitalSignatureComponentActivity, DigitalSignatureViewModel.SignatureUiState signatureUiState) {
        boolean z10;
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding;
        digitalSignatureComponentActivity.getClass();
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding2 = null;
        if (signatureUiState instanceof DigitalSignatureViewModel.SignatureUiState.Intro) {
            ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding3 = digitalSignatureComponentActivity.f84348a;
            if (activityDigitalSignatureComponentBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDigitalSignatureComponentBinding3 = null;
            }
            LinearLayout linearLayout = activityDigitalSignatureComponentBinding3.captionContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.captionContainer");
            z10 = false;
            linearLayout.setVisibility(0);
            ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding4 = digitalSignatureComponentActivity.f84348a;
            if (activityDigitalSignatureComponentBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDigitalSignatureComponentBinding4 = null;
            }
            activityDigitalSignatureComponentBinding4.clearButton.setEnabled(false);
            activityDigitalSignatureComponentBinding = digitalSignatureComponentActivity.f84348a;
            if (activityDigitalSignatureComponentBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDigitalSignatureComponentBinding2 = activityDigitalSignatureComponentBinding;
            }
        } else {
            if (!(signatureUiState instanceof DigitalSignatureViewModel.SignatureUiState.Drawing)) {
                if (signatureUiState instanceof DigitalSignatureViewModel.SignatureUiState.DrawingFinished) {
                    BluetoothController.INSTANCE.onSignatureRecorded(((DigitalSignatureViewModel.SignatureUiState.DrawingFinished) signatureUiState).getEncodedImage());
                    digitalSignatureComponentActivity.finish();
                    return;
                }
                return;
            }
            ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding5 = digitalSignatureComponentActivity.f84348a;
            if (activityDigitalSignatureComponentBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDigitalSignatureComponentBinding5 = null;
            }
            LinearLayout linearLayout2 = activityDigitalSignatureComponentBinding5.captionContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.captionContainer");
            linearLayout2.setVisibility(8);
            ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding6 = digitalSignatureComponentActivity.f84348a;
            if (activityDigitalSignatureComponentBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDigitalSignatureComponentBinding6 = null;
            }
            z10 = true;
            activityDigitalSignatureComponentBinding6.clearButton.setEnabled(true);
            activityDigitalSignatureComponentBinding = digitalSignatureComponentActivity.f84348a;
            if (activityDigitalSignatureComponentBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDigitalSignatureComponentBinding2 = activityDigitalSignatureComponentBinding;
            }
        }
        activityDigitalSignatureComponentBinding2.continueButton.setEnabled(z10);
    }

    public static final void b(DigitalSignatureComponentActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        it.setVisibility(8);
        DigitalSignatureViewModel digitalSignatureViewModel = this$0.f84349b;
        if (digitalSignatureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            digitalSignatureViewModel = null;
        }
        digitalSignatureViewModel.drawingStarted();
    }

    public static final void c(DigitalSignatureComponentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding = this$0.f84348a;
        DigitalSignatureViewModel digitalSignatureViewModel = null;
        if (activityDigitalSignatureComponentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding = null;
        }
        activityDigitalSignatureComponentBinding.signatureView.clearCanvas();
        DigitalSignatureViewModel digitalSignatureViewModel2 = this$0.f84349b;
        if (digitalSignatureViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            digitalSignatureViewModel = digitalSignatureViewModel2;
        }
        digitalSignatureViewModel.resetToIntro();
    }

    public static final void d(DigitalSignatureComponentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding = this$0.f84348a;
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding2 = null;
        if (activityDigitalSignatureComponentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding = null;
        }
        if (activityDigitalSignatureComponentBinding.signatureView.isBitmapEmpty()) {
            return;
        }
        DigitalSignatureViewModel digitalSignatureViewModel = this$0.f84349b;
        if (digitalSignatureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            digitalSignatureViewModel = null;
        }
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding3 = this$0.f84348a;
        if (activityDigitalSignatureComponentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDigitalSignatureComponentBinding2 = activityDigitalSignatureComponentBinding3;
        }
        digitalSignatureViewModel.generateImage(activityDigitalSignatureComponentBinding2.signatureView.getSignatureBitmap());
    }

    public final void a() {
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding = this.f84348a;
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding2 = null;
        if (activityDigitalSignatureComponentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding = null;
        }
        int i10 = 2;
        activityDigitalSignatureComponentBinding.closeButton.setOnClickListener(new t5.a(this, i10));
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding3 = this.f84348a;
        if (activityDigitalSignatureComponentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding3 = null;
        }
        int i11 = 3;
        activityDigitalSignatureComponentBinding3.captionContainer.setOnClickListener(new t5.b(this, 3));
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding4 = this.f84348a;
        if (activityDigitalSignatureComponentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding4 = null;
        }
        activityDigitalSignatureComponentBinding4.clearButton.setOnClickListener(new u5.a(this, i10));
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding5 = this.f84348a;
        if (activityDigitalSignatureComponentBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDigitalSignatureComponentBinding2 = activityDigitalSignatureComponentBinding5;
        }
        activityDigitalSignatureComponentBinding2.continueButton.setOnClickListener(new k5.a(this, i11));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBindingInflate = ActivityDigitalSignatureComponentBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(activityDigitalSignatureComponentBindingInflate, "inflate(layoutInflater)");
        this.f84348a = activityDigitalSignatureComponentBindingInflate;
        DigitalSignatureViewModel digitalSignatureViewModel = null;
        if (activityDigitalSignatureComponentBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBindingInflate = null;
        }
        setContentView(activityDigitalSignatureComponentBindingInflate.getRoot());
        Window setStatusBar$lambda$4 = getWindow();
        Intrinsics.checkNotNullExpressionValue(setStatusBar$lambda$4, "setStatusBar$lambda$4");
        Context context = setStatusBar$lambda$4.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        UIExtensionKt.changeStatusBarColor(setStatusBar$lambda$4, context, R.color.background_screen);
        UIExtensionKt.setSystemBarAppearance(setStatusBar$lambda$4, UIExtensionKt.isDarkMode(this));
        DigitalSignatureViewModel digitalSignatureViewModel2 = (DigitalSignatureViewModel) new ViewModelProvider(this).get(DigitalSignatureViewModel.class);
        this.f84349b = digitalSignatureViewModel2;
        if (digitalSignatureViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            digitalSignatureViewModel = digitalSignatureViewModel2;
        }
        digitalSignatureViewModel.getUiState().observe(this, new f.b(new a(this)));
        a();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new f.a(this), 3, null);
    }

    public static final void a(DigitalSignatureComponentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BluetoothController.INSTANCE.onSignatureRecorded("");
        this$0.finish();
    }
}
