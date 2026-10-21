package com.noknok.android.uaf.framework.service;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.utils.ActivityInOutParams;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.ITimeoutListener;
import com.noknok.android.client.utils.InactivityTimer;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.ShowWhenLocked;
import com.noknok.android.client.utils.ViewWrapper;
import com.noknok.android.mfac.uaf.R;
import com.noknok.android.mfac.uaf.databinding.NnlMfacUafMessageDialogBinding;
import com.noknok.android.mfac.uaf.databinding.NnlMfacUafSelectAuthenticatorBinding;
import java.util.ArrayList;
import java.util.List;
import w8.f;

/* JADX INFO: loaded from: classes11.dex */
public class SelectAuthenticatorActivity extends FragmentActivity implements ITimeoutListener {
    public static final String KEY_SHOW_WHEN_LOCKED = "KEY_SHOW_WHEN_LOCKED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayAdapterItem f63592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<Choice> f63593b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63594c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InactivityTimer f63595d;

    public static class Choice {
        final String mDescription;
        final String mIcon;
        final String mTitle;

        public Choice(String str, String str2, String str3) {
            this.mTitle = str;
            this.mDescription = str2;
            this.mIcon = str3;
        }

        public String getDescription() {
            return this.mDescription;
        }

        public String getIcon() {
            return this.mIcon;
        }

        public String getTitle() {
            return this.mTitle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(AdapterView adapterView, View view, int i10, long j10) {
        String str = String.format("[%1$s]%n%2$s", this.f63593b.get(i10).getTitle(), this.f63593b.get(i10).getDescription());
        NnlMfacUafMessageDialogBinding nnlMfacUafMessageDialogBindingInflate = NnlMfacUafMessageDialogBinding.inflate(getLayoutInflater());
        new ViewWrapper(nnlMfacUafMessageDialogBindingInflate.getRoot()).onShow();
        Dialog dialog = new Dialog(this, R.style.NNLMessageDialogTheme);
        dialog.setContentView(nnlMfacUafMessageDialogBindingInflate.getRoot());
        ((TextView) dialog.findViewById(R.id.tvMsg)).setText(str);
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.i("SelectAuthenticatorActivity", "onAttachedToWindow");
        this.f63594c = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Logger.v("SelectAuthenticatorActivity", "onBackPressed");
        a(-1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.v("SelectAuthenticatorActivity", "onCreate");
        this.f63595d = new InactivityTimer(this, AppSDKConfig.getInstance(this).get(AppSDKConfig.Key.inactivityTimeout).getAsInt());
        if (getIntent().getBooleanExtra("KEY_SHOW_WHEN_LOCKED", false)) {
            ShowWhenLocked.enable(this);
        }
        NnlMfacUafSelectAuthenticatorBinding nnlMfacUafSelectAuthenticatorBindingInflate = NnlMfacUafSelectAuthenticatorBinding.inflate(getLayoutInflater());
        setContentView(nnlMfacUafSelectAuthenticatorBindingInflate.getRoot());
        new ViewWrapper(nnlMfacUafSelectAuthenticatorBindingInflate.getRoot()).onShow();
        if (getIntent().getExtras() == null) {
            throw new IllegalStateException("Unexpected empty bundle.");
        }
        ActivityInOutParams.onActivityCreate(this);
        for (List<AuthenticatorInfo> list : (ArrayList) ActivityInOutParams.getIncomingData(this)) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            for (AuthenticatorInfo authenticatorInfo : list) {
                if (sb2.length() > 0) {
                    sb2.append(RootService.LINE_BREAK);
                }
                sb2.append(authenticatorInfo.title);
                if (sb3.length() > 0) {
                    sb3.append(RootService.LINE_BREAK);
                }
                sb3.append(authenticatorInfo.description);
            }
            this.f63593b.add(new Choice(sb2.toString(), sb3.toString(), ((AuthenticatorInfo) list.get(0)).icon));
        }
        this.f63592a = new ArrayAdapterItem(this, R.layout.nnl_mfac_uaf_authenticator_row, this.f63593b);
        nnlMfacUafSelectAuthenticatorBindingInflate.cancelButton.setOnClickListener(new f(this, 2));
        nnlMfacUafSelectAuthenticatorBindingInflate.authListView.setAdapter((ListAdapter) this.f63592a);
        nnlMfacUafSelectAuthenticatorBindingInflate.authListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.noknok.android.uaf.framework.service.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                this.f63612p0.a(adapterView, view, i10, j10);
            }
        });
        nnlMfacUafSelectAuthenticatorBindingInflate.authListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.noknok.android.uaf.framework.service.b
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i10, long j10) {
                return this.f63613a.b(adapterView, view, i10, j10);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Logger.i("SelectAuthenticatorActivity", "onPause");
        super.onPause();
        this.f63595d.stop();
        if (this.f63594c) {
            a(-2);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f63595d.start();
    }

    @Override // com.noknok.android.client.utils.ITimeoutListener
    public void onTimeOut() {
        a(-3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdapterView adapterView, View view, int i10, long j10) {
        a(i10);
        this.f63592a.notifyDataSetChanged();
    }

    private void a(int i10) {
        ActivityInOutParams.setResult(this, Integer.valueOf(i10));
        finish();
    }
}
