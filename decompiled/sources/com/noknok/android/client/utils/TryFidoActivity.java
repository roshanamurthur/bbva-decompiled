package com.noknok.android.client.utils;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.noknok.android.common.databinding.NnlTryFidoLayoutBinding;

/* JADX INFO: loaded from: classes11.dex */
public class TryFidoActivity extends FragmentActivity implements ITimeoutListener {
    public static final String KEY_POSITIVE_BUTTON = "KEY_POSITIVE_BUTTON";
    public static final String KEY_PROMPT_SUB_TEXT = "KEY_PROMPT_SUB_TEXT";
    public static final String KEY_PROMPT_TEXT = "KEY_PROMPT_TEXT";
    public static final String KEY_SHOW_WHEN_LOCKED = "KEY_SHOW_WHEN_LOCKED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63484a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InactivityTimer f63485b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, View view) {
        Logger.d("TryFidoActivity", "'Decline' button pressed, canceling");
        ActivityInOutParams.setResult(this, Outcome.CANCELED);
        alertDialog.dismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AlertDialog alertDialog, View view) {
        ActivityInOutParams.setResult(this, Outcome.SUCCESS);
        alertDialog.dismiss();
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f63484a = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Logger.i("TryFidoActivity", "BACK button is pressed");
        ActivityInOutParams.setResult(this, Outcome.CANCELED);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.v("TryFidoActivity", "onCreate");
        this.f63485b = new InactivityTimer(this, AppSDKConfig.getInstance(this).get(AppSDKConfig.Key.inactivityTimeout).getAsInt());
        DialogBuilder dialogBuilder = DialogBuilder.getInstance(this);
        NnlTryFidoLayoutBinding nnlTryFidoLayoutBindingInflate = NnlTryFidoLayoutBinding.inflate(LayoutInflater.from(dialogBuilder.getContext()));
        new ViewWrapper(nnlTryFidoLayoutBindingInflate.getRoot()).onShow();
        if (getIntent().getBooleanExtra("KEY_SHOW_WHEN_LOCKED", false)) {
            ShowWhenLocked.enable(this);
        }
        if (ActivityInOutParams.onActivityCreate(this)) {
            Intent intent = getIntent();
            if (intent.hasExtra("KEY_PROMPT_TEXT")) {
                nnlTryFidoLayoutBindingInflate.tryFidoTitle.setText(intent.getStringExtra("KEY_PROMPT_TEXT"));
                nnlTryFidoLayoutBindingInflate.tryFidoTitle.setVisibility(0);
            }
            if (intent.hasExtra("KEY_PROMPT_SUB_TEXT")) {
                nnlTryFidoLayoutBindingInflate.tryFidoSubTitle.setText(intent.getStringExtra("KEY_PROMPT_SUB_TEXT"));
                nnlTryFidoLayoutBindingInflate.tryFidoSubTitle.setVisibility(0);
            }
            if (intent.hasExtra("KEY_POSITIVE_BUTTON")) {
                nnlTryFidoLayoutBindingInflate.tryFidoButton.setText(intent.getStringExtra("KEY_POSITIVE_BUTTON"));
            }
            final AlertDialog alertDialogCreate = dialogBuilder.create(nnlTryFidoLayoutBindingInflate.getRoot());
            nnlTryFidoLayoutBindingInflate.declineButton.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.utils.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f63503p0.a(alertDialogCreate, view);
                }
            });
            nnlTryFidoLayoutBindingInflate.tryFidoButton.setOnClickListener(new wb.a(this, alertDialogCreate, 2));
            alertDialogCreate.show();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Logger.i("TryFidoActivity", "onPause called");
        super.onPause();
        this.f63485b.stop();
        if (isFinishing() || this.f63484a) {
            ActivityInOutParams.setResult(this, Outcome.SYSTEM_CANCELED);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f63485b.start();
    }

    @Override // com.noknok.android.client.utils.ITimeoutListener
    public void onTimeOut() {
        ActivityInOutParams.setResult(this, Outcome.TIMEOUT);
        finish();
    }
}
