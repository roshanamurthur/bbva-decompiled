package com.noknok.android.client.asm.authui.fps;

import android.app.Dialog;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.noknok.android.client.asm.authui.fps.databinding.NnlAsmNativeFpsDialogContainerBinding;
import com.noknok.android.client.asm.authui.fps.databinding.NnlAsmNativeFpsDialogContentBinding;
import com.noknok.android.client.asm.json.FingerprintUIConfig;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import com.noknok.android.client.utils.ViewWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FpAuthUiFragment extends BottomSheetDialogFragment implements TextView.OnEditorActionListener, FpUiHandler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    NnlAsmNativeFpsDialogContainerBinding f63162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FpUiHandler f63163b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FingerprintManager.CryptoObject f63164c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63165d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63166e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IMatcher.RESULT f63167f = IMatcher.RESULT.SYSTEM_CANCELED;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FingerprintManager.AuthenticationResult f63168g = null;

    /* JADX INFO: renamed from: com.noknok.android.client.asm.authui.fps.FpAuthUiFragment$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63169a;

        static {
            int[] iArr = new int[FingerprintUIConfig.Mode.values().length];
            f63169a = iArr;
            try {
                iArr[FingerprintUIConfig.Mode.hide.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63169a[FingerprintUIConfig.Mode.no_icon.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.noknok.android.client.asm.authui.fps.FpUiHandler.Callback
    public void onAuthenticated(FingerprintManager.AuthenticationResult authenticationResult) {
        if (getActivity() != null) {
            ((FpActivity) getActivity()).resetInactivityTimer();
        }
        this.f63167f = IMatcher.RESULT.SUCCESS;
        this.f63168g = authenticationResult;
        a();
    }

    @Override // com.noknok.android.client.asm.authui.fps.FpUiHandler.Callback
    public void onAuthenticationFailed() {
        if (getActivity() != null) {
            ((FpActivity) getActivity()).resetInactivityTimer();
        }
        String str = this.f63166e;
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        this.f63162a.fallbackButton.setVisibility(0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog;
        if (FingerprintUIConfig.get(getContext()).useBottomSheetDialog) {
            dialog = super.onCreateDialog(bundle);
        } else {
            setStyle(0, R.style.NNLFPDialogTheme);
            dialog = new Dialog(getActivity(), getTheme());
        }
        FpActivity fpActivity = (FpActivity) getActivity();
        if (fpActivity.c() && fpActivity.b()) {
            dialog.getWindow().addFlags(4718592);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NnlAsmNativeFpsDialogContainerBinding nnlAsmNativeFpsDialogContainerBindingInflate = NnlAsmNativeFpsDialogContainerBinding.inflate(layoutInflater, viewGroup, false);
        this.f63162a = nnlAsmNativeFpsDialogContainerBindingInflate;
        new ViewWrapper(nnlAsmNativeFpsDialogContainerBindingInflate.getRoot()).onShow();
        this.f63162a.okCancelButton.setOnClickListener(new k5.b(this, 3));
        if (this.f63164c == null) {
            this.f63167f = IMatcher.RESULT.USER_NOT_ENROLLED;
            TextView textView = this.f63162a.includedFpsDialog.fingerprintStatus;
            Context context = getContext();
            List<String> list = UIConfigTags.LEVELS_FINGERPRINT_VIEW;
            textView.setText(UiConfig.getText(context, list, UIConfigTags.TAG_NATIVE_FINGERPRINT_NO_FP_TEMPLATE, R.string.nnl_asm_native_fps_no_fp_template));
            this.f63162a.okCancelButton.setText(UiConfig.getText(getContext(), list, UIConfigTags.TAG_OK_BUTTON, R.string.nnl_asm_native_fps_ok));
            this.f63165d = UiConfig.getText(getContext(), list, UIConfigTags.TAG_NATIVE_FINGERPRINT_ERROR_DESCRIPTION, R.string.nnl_asm_native_fps_error_description);
        } else {
            String str = this.f63166e;
            if (str != null && !str.trim().isEmpty()) {
                this.f63162a.fallbackButton.setText(this.f63166e);
                this.f63162a.fallbackButton.setOnClickListener(new w5.a(this, 5));
            }
            this.f63162a.okCancelButton.setText(UiConfig.getText(getContext(), UIConfigTags.LEVELS_FINGERPRINT_VIEW, UIConfigTags.TAG_CANCEL_BUTTON, R.string.nnl_asm_native_fps_cancel));
            NnlAsmNativeFpsDialogContentBinding nnlAsmNativeFpsDialogContentBinding = this.f63162a.includedFpsDialog;
            FpUiHandler fpUiHandler = new FpUiHandler(nnlAsmNativeFpsDialogContentBinding.fingerprintIcon, nnlAsmNativeFpsDialogContentBinding.fingerprintStatus, this);
            this.f63163b = fpUiHandler;
            fpUiHandler.startListening(this.f63164c);
        }
        getDialog().setTitle(UiConfig.getText(getContext(), UIConfigTags.LEVELS_FINGERPRINT_VIEW, UIConfigTags.TAG_FINGERPRINT_TITLE, R.string.nnl_asm_native_fps_title));
        this.f63162a.includedFpsDialog.fingerprintDescription.setText(this.f63165d);
        return this.f63162a.getRoot();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return i10 == 2;
    }

    @Override // com.noknok.android.client.asm.authui.fps.FpUiHandler.Callback
    public void onError(int i10) {
        Logger.e("FpAuthUiFragment", "Fingerprint returned error code: " + i10);
        if (getActivity() != null) {
            ((FpActivity) getActivity()).resetInactivityTimer();
        }
        if (i10 == 5) {
            this.f63167f = IMatcher.RESULT.SYSTEM_CANCELED;
        } else if (i10 == 7 || i10 == 9) {
            this.f63167f = IMatcher.RESULT.USER_LOCKOUT;
        } else if (i10 != 10) {
            this.f63167f = IMatcher.RESULT.ERRORAUTH;
        } else {
            this.f63167f = IMatcher.RESULT.CANCEL;
        }
        a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        Logger.v("FpAuthUiFragment", "onPause");
        super.onPause();
        if (((FpActivity) getActivity()).mAttachedToWindow) {
            FpUiHandler fpUiHandler = this.f63163b;
            if (fpUiHandler != null) {
                fpUiHandler.stopListening();
            }
            ((FpActivity) getActivity()).onCompleted(this.f63167f, this.f63168g);
            a();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        int i10 = AnonymousClass1.f63169a[FingerprintUIConfig.get(getContext()).currentDevice().mode.ordinal()];
        if (i10 == 1) {
            getDialog().hide();
        } else {
            if (i10 != 2) {
                return;
            }
            this.f63162a.includedFpsDialog.fingerprintIcon.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (FingerprintUIConfig.get(getContext()).useBottomSheetDialog) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.compose.ui.platform.d(this, 1));
        }
        ((View) getView().getParent()).setBackgroundColor(0);
    }

    public void setCryptoObject(FingerprintManager.CryptoObject cryptoObject) {
        this.f63164c = cryptoObject;
    }

    public void setDescriptionText(String str) {
        this.f63165d = str;
    }

    public void setFallbackTitle(String str) {
        this.f63166e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f63167f = IMatcher.RESULT.CANCEL;
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) ((BottomSheetDialog) getDialog()).findViewById(R.id.design_bottom_sheet));
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setPeekHeight(0);
    }

    private void a() {
        try {
            dismiss();
        } catch (RuntimeException e5) {
            Logger.e("FpAuthUiFragment", "Fail to dismiss FP dialog", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f63167f = IMatcher.RESULT.FALLBACK;
        dismiss();
    }
}
