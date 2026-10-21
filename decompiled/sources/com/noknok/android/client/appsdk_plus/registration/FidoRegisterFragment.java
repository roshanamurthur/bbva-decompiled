package com.noknok.android.client.appsdk_plus.registration;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.ViewCompat;
import com.noknok.android.client.appsdk_plus.OperationResult;
import com.noknok.android.client.appsdk_plus.OperationResultListener;
import com.noknok.android.client.appsdk_plus.OperationResultObserver;
import com.noknok.android.client.appsdk_plus.R;
import com.noknok.android.client.appsdk_plus.databinding.CustomToastLayoutBinding;
import com.noknok.android.client.appsdk_plus.databinding.FidoModalityItemBinding;
import com.noknok.android.client.appsdk_plus.databinding.FragmentFidoRegisterBinding;
import com.noknok.android.client.appsdk_plus.databinding.NnlRenameRegDialogBinding;
import com.noknok.android.client.utils.DialogBuilder;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import com.noknok.android.client.utils.ViewWrapper;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Iterator;
import java.util.List;
import n4.c;
import n4.d;
import n4.q;
import n4.r;

/* JADX INFO: loaded from: classes11.dex */
public class FidoRegisterFragment extends BaseFidoRegFragment {
    public static final String TAG = "FidoRegisterFragment";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IFidoRegistrationListener f63081c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FragmentFidoRegisterBinding f63082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OperationResultObserver f63083b;

    public FidoRegisterFragment() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FidoRegistrationViewModel.RegResultParam regResultParam) {
        List<FidoMethod> list = regResultParam.fidoMethods;
        this.f63082a.llList.removeAllViews();
        if (list == null) {
            String string = getString(R.string.nnl_appsdk_plus_no_fido_methods);
            TextView textView = new TextView(getActivity());
            textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            textView.setText(string);
            textView.setPadding(0, 60, 0, 0);
            this.f63082a.llList.addView(textView);
            return;
        }
        if (list.isEmpty()) {
            a();
            return;
        }
        Iterator<FidoMethod> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentFidoRegisterBinding fragmentFidoRegisterBindingInflate = FragmentFidoRegisterBinding.inflate(layoutInflater, viewGroup, false);
        this.f63082a = fragmentFidoRegisterBindingInflate;
        return fragmentFidoRegisterBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        OperationResultListener.removeInstance(this.f63083b);
    }

    @Override // com.noknok.android.client.appsdk_plus.registration.BaseFidoRegFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.mController == null) {
            return;
        }
        new ViewWrapper(this.f63082a.getRoot()).onShow();
        this.f63083b = new OperationResultObserver();
        this.mController.onRefresh(requireActivity(), this.mModel);
        OperationResultListener.addInstance(this.f63083b);
        int i10 = 1;
        this.mModel.getFidoMethodsLiveData().observe(getViewLifecycleOwner(), new q(this, i10));
        this.mModel.getOperationResult().observe(getViewLifecycleOwner(), new r(this, i10));
        this.mModel.getAskNameData().observe(getViewLifecycleOwner(), new c(this, i10));
        this.f63083b.getLiveData().observe(getViewLifecycleOwner(), new d(this, i10));
    }

    @Deprecated
    public FidoRegisterFragment setListener(IFidoRegistrationListener iFidoRegistrationListener) {
        f63081c = iFidoRegistrationListener;
        FidoRegistrationController fidoRegistrationController = this.mController;
        if (fidoRegistrationController != null) {
            fidoRegistrationController.setListener(iFidoRegistrationListener);
        }
        return this;
    }

    public FidoRegisterFragment(FidoRegistrationController fidoRegistrationController) {
        super(fidoRegistrationController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Pair pair) {
        a((String) pair.first, (String) pair.second);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Pair pair) {
        if (pair.second != null) {
            CustomToastLayoutBinding customToastLayoutBindingInflate = CustomToastLayoutBinding.inflate(getLayoutInflater());
            try {
                customToastLayoutBindingInflate.logo.setBackground(getContext().getPackageManager().getApplicationIcon(getContext().getPackageName()));
            } catch (PackageManager.NameNotFoundException unused) {
                Logger.e(TAG, "Error during getting application icon");
            }
            customToastLayoutBindingInflate.message.setText((CharSequence) pair.second);
            Toast toast = new Toast(getContext());
            toast.setDuration(0);
            toast.setView(customToastLayoutBindingInflate.getRoot());
            toast.setMargin(0.0f, 0.1f);
            toast.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OperationResult operationResult) {
        this.mController.onOpCompleted(requireActivity(), this.mModel, operationResult);
    }

    private void a(final String str, final String str2) {
        final NnlRenameRegDialogBinding nnlRenameRegDialogBindingInflate = NnlRenameRegDialogBinding.inflate(getLayoutInflater());
        new ViewWrapper(nnlRenameRegDialogBindingInflate.getRoot()).onShow();
        TextView textView = nnlRenameRegDialogBindingInflate.title;
        Context context = getContext();
        List<String> list = UIConfigTags.LEVELS_RENAME_REGISTRATION_VIEW;
        textView.setText(UiConfig.getText(context, list, UIConfigTags.TAG_NAME_YOUR_KEY_TITLE, R.string.nnl_appsdk_plus_name_your_key));
        EditText editText = nnlRenameRegDialogBindingInflate.etRenameReg;
        editText.setSelection(editText.getText().length());
        nnlRenameRegDialogBindingInflate.etRenameReg.setText(str2);
        nnlRenameRegDialogBindingInflate.etRenameReg.setHint(UiConfig.getText(getContext(), list, UIConfigTags.TAG_NAME_YOUR_KEY_HINT, R.string.nnl_appsdk_plus_name_your_key_hint));
        nnlRenameRegDialogBindingInflate.btnConfirm.setText(UiConfig.getText(getContext(), UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_DONE_BUTTON, R.string.nnl_appsdk_plus_done));
        nnlRenameRegDialogBindingInflate.btnConfirm.setEnabled(false);
        nnlRenameRegDialogBindingInflate.btnConfirm.setAlpha(0.25f);
        final AlertDialog alertDialogCreate = DialogBuilder.getInstance(getActivity()).create(nnlRenameRegDialogBindingInflate.getRoot());
        nnlRenameRegDialogBindingInflate.btnCancel.setOnClickListener(new p5.b(alertDialogCreate, 3));
        nnlRenameRegDialogBindingInflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.registration.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f63104p0.a(str, nnlRenameRegDialogBindingInflate, alertDialogCreate, view);
            }
        });
        nnlRenameRegDialogBindingInflate.etRenameReg.addTextChangedListener(new TextWatcher() { // from class: com.noknok.android.client.appsdk_plus.registration.FidoRegisterFragment.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String strValueOf = String.valueOf(editable);
                boolean z10 = (strValueOf.isEmpty() || strValueOf.equals(str2) || strValueOf.length() > 64) ? false : true;
                nnlRenameRegDialogBindingInflate.btnConfirm.setEnabled(z10);
                nnlRenameRegDialogBindingInflate.btnConfirm.setAlpha(z10 ? 1.0f : 0.25f);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, NnlRenameRegDialogBinding nnlRenameRegDialogBinding, AlertDialog alertDialog, View view) {
        this.mController.setCredentialName(requireActivity(), this.mModel, str, nnlRenameRegDialogBinding.etRenameReg.getText().toString().trim());
        alertDialog.dismiss();
    }

    private void a(final FidoMethod fidoMethod) {
        FidoModalityItemBinding fidoModalityItemBindingInflate = FidoModalityItemBinding.inflate(getLayoutInflater());
        new ViewWrapper(fidoModalityItemBindingInflate.getRoot()).onShow();
        int i10 = 1;
        if (fidoMethod.isFido2() && !fidoMethod.mAuthenticatorAttachment.equals(k.a.f65035b)) {
            fidoModalityItemBindingInflate.switchBtnRegDereg.setVisibility(8);
            fidoModalityItemBindingInflate.ivAddMethod.setVisibility(0);
            fidoModalityItemBindingInflate.ivAddMethod.setOnClickListener(new z5.a(this, fidoMethod, i10));
        } else {
            fidoModalityItemBindingInflate.switchBtnRegDereg.setChecked(true ^ fidoMethod.mIsRegPossible);
            fidoModalityItemBindingInflate.switchBtnRegDereg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.noknok.android.client.appsdk_plus.registration.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    this.f63102a.a(fidoMethod, compoundButton, z10);
                }
            });
            String str = fidoMethod.mIcon;
            if (str != null && !str.isEmpty()) {
                byte[] bArrDecode = Base64.decode(fidoMethod.mIcon.substring(22), 0);
                fidoModalityItemBindingInflate.ivModalityIcon.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            }
        }
        fidoModalityItemBindingInflate.tvModalityTitle.setText(fidoMethod.mTitle);
        this.f63082a.llList.addView(fidoModalityItemBindingInflate.getRoot());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(FidoMethod fidoMethod, View view) {
        this.mController.onRegister(requireActivity(), this.mModel, fidoMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(FidoMethod fidoMethod, CompoundButton compoundButton, boolean z10) {
        compoundButton.setChecked(!z10);
        if (z10) {
            this.mController.onRegister(requireActivity(), this.mModel, fidoMethod);
        } else {
            this.mController.onDeregister(requireActivity(), this.mModel, fidoMethod);
        }
    }

    private void a() {
        FidoModalityItemBinding fidoModalityItemBindingInflate = FidoModalityItemBinding.inflate(getLayoutInflater());
        fidoModalityItemBindingInflate.btnGenericRegister.setVisibility(0);
        fidoModalityItemBindingInflate.itemContainer.setVisibility(4);
        fidoModalityItemBindingInflate.btnGenericRegister.setOnClickListener(new p5.a(this, 3));
        this.f63082a.llList.addView(fidoModalityItemBindingInflate.getRoot());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.mController.onRegister(requireActivity(), this.mModel, (FidoMethod) null);
    }
}
