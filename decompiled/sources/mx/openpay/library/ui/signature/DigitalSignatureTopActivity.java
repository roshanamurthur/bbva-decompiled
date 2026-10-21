package mx.openpay.library.ui.signature;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.ViewModelProvider;
import f.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.R;
import mx.openpay.library.databinding.ActivityDigitalSignatureComponentBinding;
import n4.j;
import n4.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lmx/openpay/library/ui/signature/DigitalSignatureTopActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "library_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDigitalSignatureTopActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigitalSignatureTopActivity.kt\nmx/openpay/library/ui/signature/DigitalSignatureTopActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,100:1\n262#2,2:101\n262#2,2:103\n262#2,2:105\n*S KotlinDebug\n*F\n+ 1 DigitalSignatureTopActivity.kt\nmx/openpay/library/ui/signature/DigitalSignatureTopActivity\n*L\n52#1:101,2\n58#1:103,2\n80#1:105,2\n*E\n"})
public final class DigitalSignatureTopActivity extends AppCompatActivity {

    @NotNull
    public static final String ENCODED_IMAGE = "ENCODED_IMAGE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivityDigitalSignatureComponentBinding f84350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DigitalSignatureViewModel f84351b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmx/openpay/library/ui/signature/DigitalSignatureTopActivity$Companion;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "getIntent", "", DigitalSignatureTopActivity.ENCODED_IMAGE, "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent getIntent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) DigitalSignatureTopActivity.class);
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
    public static final void access$updateUI(DigitalSignatureTopActivity digitalSignatureTopActivity, DigitalSignatureViewModel.SignatureUiState signatureUiState) {
        boolean z10;
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding;
        digitalSignatureTopActivity.getClass();
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding2 = null;
        if (signatureUiState instanceof DigitalSignatureViewModel.SignatureUiState.Intro) {
            ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding3 = digitalSignatureTopActivity.f84350a;
            if (activityDigitalSignatureComponentBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDigitalSignatureComponentBinding3 = null;
            }
            LinearLayout linearLayout = activityDigitalSignatureComponentBinding3.captionContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.captionContainer");
            z10 = false;
            linearLayout.setVisibility(0);
            ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding4 = digitalSignatureTopActivity.f84350a;
            if (activityDigitalSignatureComponentBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDigitalSignatureComponentBinding4 = null;
            }
            activityDigitalSignatureComponentBinding4.clearButton.setEnabled(false);
            activityDigitalSignatureComponentBinding = digitalSignatureTopActivity.f84350a;
            if (activityDigitalSignatureComponentBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDigitalSignatureComponentBinding2 = activityDigitalSignatureComponentBinding;
            }
        } else {
            if (!(signatureUiState instanceof DigitalSignatureViewModel.SignatureUiState.Drawing)) {
                if (signatureUiState instanceof DigitalSignatureViewModel.SignatureUiState.DrawingFinished) {
                    Intent intent = new Intent();
                    intent.putExtra(ENCODED_IMAGE, ((DigitalSignatureViewModel.SignatureUiState.DrawingFinished) signatureUiState).getEncodedImage());
                    digitalSignatureTopActivity.setResult(-1, intent);
                    digitalSignatureTopActivity.finish();
                    return;
                }
                return;
            }
            ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding5 = digitalSignatureTopActivity.f84350a;
            if (activityDigitalSignatureComponentBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDigitalSignatureComponentBinding5 = null;
            }
            LinearLayout linearLayout2 = activityDigitalSignatureComponentBinding5.captionContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.captionContainer");
            linearLayout2.setVisibility(8);
            ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding6 = digitalSignatureTopActivity.f84350a;
            if (activityDigitalSignatureComponentBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDigitalSignatureComponentBinding6 = null;
            }
            z10 = true;
            activityDigitalSignatureComponentBinding6.clearButton.setEnabled(true);
            activityDigitalSignatureComponentBinding = digitalSignatureTopActivity.f84350a;
            if (activityDigitalSignatureComponentBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDigitalSignatureComponentBinding2 = activityDigitalSignatureComponentBinding;
            }
        }
        activityDigitalSignatureComponentBinding2.continueButton.setEnabled(z10);
    }

    public static final void b(DigitalSignatureTopActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        it.setVisibility(8);
        DigitalSignatureViewModel digitalSignatureViewModel = this$0.f84351b;
        if (digitalSignatureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            digitalSignatureViewModel = null;
        }
        digitalSignatureViewModel.drawingStarted();
    }

    public static final void c(DigitalSignatureTopActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding = this$0.f84350a;
        DigitalSignatureViewModel digitalSignatureViewModel = null;
        if (activityDigitalSignatureComponentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding = null;
        }
        activityDigitalSignatureComponentBinding.signatureView.clearCanvas();
        DigitalSignatureViewModel digitalSignatureViewModel2 = this$0.f84351b;
        if (digitalSignatureViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            digitalSignatureViewModel = digitalSignatureViewModel2;
        }
        digitalSignatureViewModel.resetToIntro();
    }

    public static final void d(DigitalSignatureTopActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding = this$0.f84350a;
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding2 = null;
        if (activityDigitalSignatureComponentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding = null;
        }
        if (activityDigitalSignatureComponentBinding.signatureView.isBitmapEmpty()) {
            return;
        }
        DigitalSignatureViewModel digitalSignatureViewModel = this$0.f84351b;
        if (digitalSignatureViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            digitalSignatureViewModel = null;
        }
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding3 = this$0.f84350a;
        if (activityDigitalSignatureComponentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDigitalSignatureComponentBinding2 = activityDigitalSignatureComponentBinding3;
        }
        digitalSignatureViewModel.generateImage(activityDigitalSignatureComponentBinding2.signatureView.getSignatureBitmap());
    }

    public final void a() {
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding = this.f84350a;
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding2 = null;
        if (activityDigitalSignatureComponentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding = null;
        }
        int i10 = 4;
        activityDigitalSignatureComponentBinding.closeButton.setOnClickListener(new k5.b(this, i10));
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding3 = this.f84350a;
        if (activityDigitalSignatureComponentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding3 = null;
        }
        activityDigitalSignatureComponentBinding3.captionContainer.setOnClickListener(new w5.a(this, 6));
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding4 = this.f84350a;
        if (activityDigitalSignatureComponentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding4 = null;
        }
        activityDigitalSignatureComponentBinding4.clearButton.setOnClickListener(new j(this, i10));
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding5 = this.f84350a;
        if (activityDigitalSignatureComponentBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDigitalSignatureComponentBinding2 = activityDigitalSignatureComponentBinding5;
        }
        activityDigitalSignatureComponentBinding2.continueButton.setOnClickListener(new k(this, 7));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBindingInflate = ActivityDigitalSignatureComponentBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(activityDigitalSignatureComponentBindingInflate, "inflate(layoutInflater)");
        this.f84350a = activityDigitalSignatureComponentBindingInflate;
        DigitalSignatureViewModel digitalSignatureViewModel = null;
        if (activityDigitalSignatureComponentBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBindingInflate = null;
        }
        setContentView(activityDigitalSignatureComponentBindingInflate.getRoot());
        Typeface font = ResourcesCompat.getFont(this, R.font.bento_font);
        Typeface font2 = ResourcesCompat.getFont(this, R.font.bento_font_medium);
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding = this.f84350a;
        if (activityDigitalSignatureComponentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding = null;
        }
        activityDigitalSignatureComponentBinding.titleTextview.setTypeface(font);
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding2 = this.f84350a;
        if (activityDigitalSignatureComponentBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding2 = null;
        }
        activityDigitalSignatureComponentBinding2.captionTextview.setTypeface(font);
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding3 = this.f84350a;
        if (activityDigitalSignatureComponentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding3 = null;
        }
        activityDigitalSignatureComponentBinding3.clearButton.setTypeface(font2);
        ActivityDigitalSignatureComponentBinding activityDigitalSignatureComponentBinding4 = this.f84350a;
        if (activityDigitalSignatureComponentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDigitalSignatureComponentBinding4 = null;
        }
        activityDigitalSignatureComponentBinding4.continueButton.setTypeface(font2);
        DigitalSignatureViewModel digitalSignatureViewModel2 = (DigitalSignatureViewModel) new ViewModelProvider(this).get(DigitalSignatureViewModel.class);
        this.f84351b = digitalSignatureViewModel2;
        if (digitalSignatureViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            digitalSignatureViewModel = digitalSignatureViewModel2;
        }
        digitalSignatureViewModel.getUiState().observe(this, new d(new b(this)));
        a();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "onBackPressedDispatcher");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new f.c(this), 3, null);
    }

    public static final void a(DigitalSignatureTopActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.putExtra(ENCODED_IMAGE, "");
        this$0.setResult(-1, intent);
        this$0.finish();
    }
}
