package com.bbva.signaturepad.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.bbva.signaturepad.databinding.ActivityDigitalSignatureBinding;
import com.bbva.signaturepad.ui.widget.SignaturePadView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r5.c;
import r5.d;
import w8.a;
import w8.b;

/* JADX INFO: compiled from: SignaturePadActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/signaturepad/ui/SignaturePadActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "signaturepad_release"}, k = 1, mv = {1, 9, 0})
public final class SignaturePadActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int RESULT_ERROR = -2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ImageView f36568p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LinearLayout f36569q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Button f36570r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Button f36571s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public SignaturePadView f36572t0;

    /* JADX INFO: compiled from: SignaturePadActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/signaturepad/ui/SignaturePadActivity$Companion;", "", "()V", "RESULT_ERROR", "", "signaturepad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDigitalSignatureBinding activityDigitalSignatureBindingInflate = ActivityDigitalSignatureBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(activityDigitalSignatureBindingInflate, "inflate(...)");
        setContentView(activityDigitalSignatureBindingInflate.getRoot());
        ImageView DigitalSignClearImg = activityDigitalSignatureBindingInflate.DigitalSignClearImg;
        Intrinsics.checkNotNullExpressionValue(DigitalSignClearImg, "DigitalSignClearImg");
        this.f36568p0 = DigitalSignClearImg;
        LinearLayout DigitalSignDirectionsLayout = activityDigitalSignatureBindingInflate.DigitalSignDirectionsLayout;
        Intrinsics.checkNotNullExpressionValue(DigitalSignDirectionsLayout, "DigitalSignDirectionsLayout");
        this.f36569q0 = DigitalSignDirectionsLayout;
        Button DeleteBtn = activityDigitalSignatureBindingInflate.DeleteBtn;
        Intrinsics.checkNotNullExpressionValue(DeleteBtn, "DeleteBtn");
        this.f36570r0 = DeleteBtn;
        Button AcceptBtn = activityDigitalSignatureBindingInflate.AcceptBtn;
        Intrinsics.checkNotNullExpressionValue(AcceptBtn, "AcceptBtn");
        this.f36571s0 = AcceptBtn;
        SignaturePadView DigitalSignView = activityDigitalSignatureBindingInflate.DigitalSignView;
        Intrinsics.checkNotNullExpressionValue(DigitalSignView, "DigitalSignView");
        this.f36572t0 = DigitalSignView;
        ImageView imageView = this.f36568p0;
        SignaturePadView signaturePadView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearImg");
            imageView = null;
        }
        int i10 = 3;
        imageView.setOnClickListener(new c(this, i10));
        Button button = this.f36570r0;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deleteBtn");
            button = null;
        }
        button.setOnClickListener(new d(this, i10));
        Button button2 = this.f36571s0;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acceptBtn");
            button2 = null;
        }
        int i11 = 2;
        button2.setOnClickListener(new a(this, 2));
        LinearLayout linearLayout = this.f36569q0;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("directionsLayout");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new b(this, i11));
        SignaturePadView signaturePadView2 = this.f36572t0;
        if (signaturePadView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("digitalSignView");
        } else {
            signaturePadView = signaturePadView2;
        }
        signaturePadView.setSignatureCallback(new SignaturePadView.SignatureCallback() { // from class: com.bbva.signaturepad.ui.SignaturePadActivity$setListeners$5
            @Override // com.bbva.signaturepad.ui.widget.SignaturePadView.SignatureCallback
            public void onClear() {
                SignaturePadActivity signaturePadActivity = this.f36574a;
                View view = signaturePadActivity.f36570r0;
                View view2 = null;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deleteBtn");
                    view = null;
                }
                view.setEnabled(false);
                View view3 = signaturePadActivity.f36571s0;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("acceptBtn");
                } else {
                    view2 = view3;
                }
                view2.setEnabled(false);
            }

            @Override // com.bbva.signaturepad.ui.widget.SignaturePadView.SignatureCallback
            public void onStart() {
                SignaturePadActivity signaturePadActivity = this.f36574a;
                View view = signaturePadActivity.f36570r0;
                View view2 = null;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deleteBtn");
                    view = null;
                }
                view.setEnabled(true);
                View view3 = signaturePadActivity.f36571s0;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("acceptBtn");
                } else {
                    view2 = view3;
                }
                view2.setEnabled(true);
            }
        });
    }
}
