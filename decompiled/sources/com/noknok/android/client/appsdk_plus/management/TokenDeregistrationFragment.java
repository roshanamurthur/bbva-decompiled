package com.noknok.android.client.appsdk_plus.management;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.noknok.android.client.appsdk_plus.AppSDKPlus;
import com.noknok.android.client.appsdk_plus.NetworkConnection;
import com.noknok.android.client.appsdk_plus.OperationResult;
import com.noknok.android.client.appsdk_plus.OperationResultListener;
import com.noknok.android.client.appsdk_plus.OperationResultObserver;
import com.noknok.android.client.appsdk_plus.R;
import com.noknok.android.client.appsdk_plus.RegData;
import com.noknok.android.client.appsdk_plus.databinding.NnlAppsdkDpkListItemRowBinding;
import com.noknok.android.client.appsdk_plus.databinding.NnlAppsdkListFragmentBinding;
import com.noknok.android.client.appsdk_plus.databinding.NnlAppsdkListItemRowBinding;
import com.noknok.android.client.appsdk_plus.databinding.NnlRemoveAllRegsConfirmDialogBinding;
import com.noknok.android.client.appsdk_plus.databinding.NnlRemoveRegConfirmDialogBinding;
import com.noknok.android.client.appsdk_plus.databinding.NnlRenameRegDialogBinding;
import com.noknok.android.client.utils.DialogBuilder;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import com.noknok.android.client.utils.ViewWrapper;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import n4.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TokenDeregistrationFragment extends BaseManageFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f63006d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<JSONObject> f63007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NnlAppsdkListFragmentBinding f63008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OperationResultObserver f63009c;

    public class RegistrationsListAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<JSONObject> f63012a;

        public class ViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final NnlAppsdkListItemRowBinding f63014a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f63015b;

            public ViewHolder(@NonNull RegistrationsListAdapter registrationsListAdapter, NnlAppsdkListItemRowBinding nnlAppsdkListItemRowBinding) {
                super(nnlAppsdkListItemRowBinding.getRoot());
                this.f63015b = false;
                this.f63014a = nnlAppsdkListItemRowBinding;
                new ViewWrapper(nnlAppsdkListItemRowBinding.getRoot()).onShow();
            }
        }

        public RegistrationsListAdapter(List<JSONObject> list) {
            this.f63012a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f63012a.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(ViewHolder viewHolder, View view) {
            boolean z10 = !viewHolder.f63015b;
            viewHolder.f63015b = z10;
            viewHolder.f63014a.listItemExpandIcon.setImageResource(z10 ? R.drawable.nnl_appsdk_arrow_up : R.drawable.nnl_appsdk_arrow_down);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i10) {
            String string;
            TokenDeregistrationFragment.this.getActivity();
            JSONObject jSONObject = this.f63012a.get(i10);
            try {
                string = jSONObject.getString(jSONObject.has(AppSDKPlus.AUTHENTICATOR_NAME) ? AppSDKPlus.AUTHENTICATOR_NAME : "description");
                try {
                    viewHolder.f63014a.listItemName.setText(string);
                    if (jSONObject.has(AppSDKPlus.LAST_USED_TIMESTAMP)) {
                        viewHolder.f63014a.tvLastUsed.setText(TokenDeregistrationFragment.this.getLastUpdatedTime(jSONObject.getString(AppSDKPlus.LAST_USED_TIMESTAMP)));
                    }
                } catch (JSONException e5) {
                    e = e5;
                    int i11 = TokenDeregistrationFragment.f63006d;
                    Logger.e("TokenDeregistrationFragment", "Problem processing registration list", e);
                }
            } catch (JSONException e7) {
                e = e7;
                string = "Authenticator";
            }
            if (jSONObject.has("dpks")) {
                viewHolder.f63014a.llDpkList.removeAllViews();
                viewHolder.f63014a.llDpkList.setVisibility(viewHolder.f63015b ? 0 : 8);
                viewHolder.f63014a.llListHeader.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.management.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f63033p0.a(viewHolder, view);
                    }
                });
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("dpks");
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        NnlAppsdkDpkListItemRowBinding nnlAppsdkDpkListItemRowBindingInflate = NnlAppsdkDpkListItemRowBinding.inflate(TokenDeregistrationFragment.this.getLayoutInflater());
                        new ViewWrapper(nnlAppsdkDpkListItemRowBindingInflate.getRoot()).onShow();
                        String string2 = jSONArray.getJSONObject(i12).getString(AppSDKPlus.AUTHENTICATOR_NAME);
                        nnlAppsdkDpkListItemRowBindingInflate.listItemName.setText(string2);
                        nnlAppsdkDpkListItemRowBindingInflate.tvLastUsed.setText(TokenDeregistrationFragment.this.getLastUpdatedTime(jSONArray.getJSONObject(i12).getString(AppSDKPlus.LAST_USED_TIMESTAMP)));
                        TokenDeregistrationFragment.this.a(nnlAppsdkDpkListItemRowBindingInflate.listItemRemoveButton, jSONArray.getJSONObject(i12), string2);
                        TokenDeregistrationFragment.this.b(nnlAppsdkDpkListItemRowBindingInflate.listItemRenameButton, jSONArray.getJSONObject(i12), string2);
                        if (i12 == jSONArray.length() - 1) {
                            nnlAppsdkDpkListItemRowBindingInflate.listDpkItemDelimiter.setVisibility(8);
                        }
                        viewHolder.f63014a.llDpkList.addView(nnlAppsdkDpkListItemRowBindingInflate.getRoot());
                    }
                } catch (JSONException e10) {
                    int i13 = TokenDeregistrationFragment.f63006d;
                    Logger.e("TokenDeregistrationFragment", "Problem processing dpks list", e10);
                }
            } else {
                viewHolder.f63014a.listItemExpandIcon.setVisibility(4);
            }
            TokenDeregistrationFragment.this.a(viewHolder.f63014a.listItemRemoveButton, jSONObject, string);
            TokenDeregistrationFragment.this.b(viewHolder.f63014a.listItemRenameButton, jSONObject, string);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            viewGroup.getContext();
            return new ViewHolder(this, NnlAppsdkListItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext())));
        }
    }

    public TokenDeregistrationFragment() {
        super(null);
        this.f63007a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Pair pair) {
        if (pair.second != null) {
            Toast.makeText(getContext(), (CharSequence) pair.second, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Pair pair) {
        if (pair.second != null) {
            Toast.makeText(getContext(), (CharSequence) pair.second, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(View view, AlertDialog alertDialog, View view2) {
        view.setEnabled(true);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view, AlertDialog alertDialog, View view2) {
        view.setEnabled(true);
        this.mController.onRemoveAll(getActivity(), this.mModel);
        alertDialog.dismiss();
    }

    public String getLastUpdatedTime(String str) {
        Context context = getContext();
        if (context == null) {
            return "";
        }
        try {
            long timeInMillis = (Calendar.getInstance().getTimeInMillis() - Long.parseLong(str)) / 1000;
            int i10 = (int) (timeInMillis / 31536000);
            int i11 = ((int) (timeInMillis % 31536000)) / 2592000;
            int i12 = (int) (((timeInMillis % 31536000) % 2592000) / 604800);
            int i13 = (int) ((((timeInMillis % 31536000) % 2592000) % 604800) / 86400);
            int i14 = (int) ((((timeInMillis % 31536000) % 2592000) % 86400) / 3600);
            int i15 = (int) (((((timeInMillis % 31536000) % 2592000) % 86400) % 3600) / 60);
            int i16 = ((int) (((timeInMillis % 31536000) % 86400) % 3600)) % 60;
            String text = UiConfig.getText(context, UIConfigTags.LEVELS_MANAGE_REG_VIEW, UIConfigTags.TAG_LAST_USED_AUTHENTICATOR_FORMAT, R.string.last_used_authenticator_format);
            if (i10 > 0) {
                return a(context, text, i10, UIConfigTags.TAG_YEAR, UIConfigTags.TAG_YEARS, R.string.year, R.string.years);
            }
            if (i11 > 0) {
                return a(context, text, i11, UIConfigTags.TAG_MONTH, UIConfigTags.TAG_MONTHS, R.string.month, R.string.months);
            }
            if (i12 > 0) {
                return a(context, text, i12, "week", "week", R.string.week, R.string.weeks);
            }
            if (i13 > 0) {
                return a(context, text, i13, UIConfigTags.TAG_DAY, UIConfigTags.TAG_DAYS, R.string.day, R.string.days);
            }
            if (i14 > 0) {
                return a(context, text, i14, "hour", UIConfigTags.TAG_HOURS, R.string.hour, R.string.hours);
            }
            return i15 > 0 ? a(context, text, i15, UIConfigTags.TAG_MINUTE, UIConfigTags.TAG_MINUTES, R.string.minute, R.string.minutes) : a(context, text, i16, UIConfigTags.TAG_SECOND, UIConfigTags.TAG_SECONDS, R.string.second, R.string.seconds);
        } catch (NumberFormatException e5) {
            Logger.e("TokenDeregistrationFragment", "Failed to identify authenticator last used time", e5);
            return "";
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NnlAppsdkListFragmentBinding nnlAppsdkListFragmentBindingInflate = NnlAppsdkListFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f63008b = nnlAppsdkListFragmentBindingInflate;
        return nnlAppsdkListFragmentBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        OperationResultListener.removeInstance(this.f63009c);
    }

    @Override // com.noknok.android.client.appsdk_plus.management.BaseManageFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.mController == null) {
            return;
        }
        new ViewWrapper(this.f63008b.getRoot()).onShow();
        this.f63008b.llTokens.setLayoutManager(new LinearLayoutManager(getContext()));
        OperationResultObserver operationResultObserver = new OperationResultObserver();
        this.f63009c = operationResultObserver;
        OperationResultListener.addInstance(operationResultObserver);
        this.mModel.getRemoveResult().observe(getViewLifecycleOwner(), new i(this, 2));
        int i10 = 1;
        this.mModel.getRenameResult().observe(getViewLifecycleOwner(), new b6.a(this, i10));
        this.mModel.getFidoMethodsLiveData().observe(getViewLifecycleOwner(), new c6.b(this, i10));
        this.f63009c.getLiveData().observe(getViewLifecycleOwner(), new c6.c(this, i10));
        this.f63008b.btnRemoveAll.setVisibility(8);
        this.f63008b.btnRemoveAll.setOnClickListener(new w8.a(this, 3));
        if (!NetworkConnection.isNetworkAvailable(requireContext())) {
            NetworkConnection.showNetworkUnavailableMessage(getContext());
        } else if (bundle == null) {
            this.mController.onRefresh(this.mModel);
        }
    }

    public TokenDeregistrationFragment(ManageRegistrationController manageRegistrationController) {
        super(manageRegistrationController);
        this.f63007a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<org.json.JSONObject>] */
    public void a(ManageRegistrationViewModel.ManageRegResultParam manageRegResultParam) {
        a(manageRegResultParam.jsonRegList);
        RegistrationsListAdapter registrationsListAdapter = new RegistrationsListAdapter(this.f63007a);
        this.f63008b.llTokens.setAdapter(registrationsListAdapter);
        registrationsListAdapter.notifyDataSetChanged();
        if (this.f63007a.isEmpty()) {
            this.f63008b.btnRemoveAll.setVisibility(8);
        } else {
            this.f63008b.btnRemoveAll.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, JSONObject jSONObject, String str) {
        view.setOnClickListener(new ic.a(this, str, 1, jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final String str, final JSONObject jSONObject, final View view) {
        view.setEnabled(false);
        final NnlRenameRegDialogBinding nnlRenameRegDialogBindingInflate = NnlRenameRegDialogBinding.inflate(getLayoutInflater());
        new ViewWrapper(nnlRenameRegDialogBindingInflate.getRoot()).onShow();
        nnlRenameRegDialogBindingInflate.etRenameReg.setText(str);
        EditText editText = nnlRenameRegDialogBindingInflate.etRenameReg;
        editText.setSelection(editText.getText().length());
        nnlRenameRegDialogBindingInflate.btnConfirm.setEnabled(false);
        nnlRenameRegDialogBindingInflate.btnConfirm.setAlpha(0.25f);
        final AlertDialog alertDialogCreate = DialogBuilder.getInstance(getActivity()).create(nnlRenameRegDialogBindingInflate.getRoot());
        nnlRenameRegDialogBindingInflate.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.management.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TokenDeregistrationFragment.b(view, alertDialogCreate, view2);
            }
        });
        nnlRenameRegDialogBindingInflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.management.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f63023p0.a(nnlRenameRegDialogBindingInflate, jSONObject, view, alertDialogCreate, view2);
            }
        });
        nnlRenameRegDialogBindingInflate.etRenameReg.addTextChangedListener(new TextWatcher() { // from class: com.noknok.android.client.appsdk_plus.management.TokenDeregistrationFragment.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String strValueOf = String.valueOf(editable);
                boolean z10 = (strValueOf.isEmpty() || strValueOf.equals(str) || strValueOf.length() > 64) ? false : true;
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
    public /* synthetic */ void a(OperationResult operationResult) {
        this.mController.onOpCompleted(this.mModel, operationResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final View view) {
        view.setEnabled(false);
        DialogBuilder dialogBuilder = DialogBuilder.getInstance(getActivity());
        NnlRemoveAllRegsConfirmDialogBinding nnlRemoveAllRegsConfirmDialogBindingInflate = NnlRemoveAllRegsConfirmDialogBinding.inflate(LayoutInflater.from(dialogBuilder.getContext()));
        new ViewWrapper(nnlRemoveAllRegsConfirmDialogBindingInflate.getRoot()).onShow();
        final AlertDialog alertDialogCreate = dialogBuilder.create(nnlRemoveAllRegsConfirmDialogBindingInflate.getRoot());
        nnlRemoveAllRegsConfirmDialogBindingInflate.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.management.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TokenDeregistrationFragment.c(view, alertDialogCreate, view2);
            }
        });
        nnlRemoveAllRegsConfirmDialogBindingInflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.management.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f63030p0.d(view, alertDialogCreate, view2);
            }
        });
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(View view, AlertDialog alertDialog, View view2) {
        view.setEnabled(true);
        alertDialog.dismiss();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<org.json.JSONObject>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<org.json.JSONObject>] */
    private void a(JSONArray jSONArray) {
        try {
            this.f63007a.clear();
            ArrayList<JSONObject> arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getJSONObject(i10));
            }
            Collections.sort(arrayList, new c());
            HashMap map = new HashMap();
            for (JSONObject jSONObject : arrayList) {
                String string = jSONObject.getString(AppSDKPlus.AUTHENTICATOR_NAME);
                int iIntValue = map.get(string) == null ? 1 : ((Integer) map.get(string)).intValue();
                while (true) {
                    if (!map.containsKey(string + " " + iIntValue)) {
                        break;
                    } else {
                        iIntValue++;
                    }
                }
                if (iIntValue > 1) {
                    jSONObject.put(AppSDKPlus.AUTHENTICATOR_NAME, string + " " + iIntValue);
                }
                map.put(string, Integer.valueOf(iIntValue + 1));
                this.f63007a.add(jSONObject);
            }
        } catch (JSONException e5) {
            Logger.e("TokenDeregistrationFragment", "JSON parsing issue while getting registrations list", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            return Long.compare(jSONObject2.getLong("createdTimeStamp"), jSONObject.getLong("createdTimeStamp"));
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, JSONObject jSONObject, String str) {
        view.setOnClickListener(new ic.c(this, str, 2, jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, final JSONObject jSONObject, final View view) {
        view.setEnabled(false);
        NnlRemoveRegConfirmDialogBinding nnlRemoveRegConfirmDialogBindingInflate = NnlRemoveRegConfirmDialogBinding.inflate(getLayoutInflater());
        new ViewWrapper(nnlRemoveRegConfirmDialogBindingInflate.getRoot()).onShow();
        nnlRemoveRegConfirmDialogBindingInflate.authenticatorName.setText(str);
        final AlertDialog alertDialogCreate = DialogBuilder.getInstance(getContext()).create(nnlRemoveRegConfirmDialogBindingInflate.getRoot());
        nnlRemoveRegConfirmDialogBindingInflate.btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.management.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TokenDeregistrationFragment.a(view, alertDialogCreate, view2);
            }
        });
        nnlRemoveRegConfirmDialogBindingInflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.management.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f63018p0.a(jSONObject, alertDialogCreate, view2);
            }
        });
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(View view, AlertDialog alertDialog, View view2) {
        view.setEnabled(true);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(JSONObject jSONObject, AlertDialog alertDialog, View view) {
        if (!NetworkConnection.isNetworkAvailable(getContext())) {
            NetworkConnection.showNetworkUnavailableMessage(getContext());
        } else {
            this.mController.onRemove(requireActivity(), jSONObject, this.mModel);
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(NnlRenameRegDialogBinding nnlRenameRegDialogBinding, JSONObject jSONObject, View view, AlertDialog alertDialog, View view2) {
        RegData regData = new RegData();
        regData.authenticatorName = nnlRenameRegDialogBinding.etRenameReg.getText().toString().trim();
        this.mController.onRename(requireActivity(), jSONObject, regData, this.mModel);
        view.setEnabled(true);
        alertDialog.dismiss();
    }

    private String a(Context context, String str, int i10, String str2, String str3, int i11, int i12) {
        if (i10 != 1) {
            str2 = str3;
        }
        if (i10 != 1) {
            i11 = i12;
        }
        return MessageFormat.format(str, Integer.valueOf(i10), UiConfig.getText(context, UIConfigTags.LEVELS_MANAGE_REG_VIEW, str2, i11));
    }
}
