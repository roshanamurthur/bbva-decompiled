package com.noknok.android.client.utils;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.noknok.android.common.databinding.NnlConfirmationLayoutBinding;

/* JADX INFO: loaded from: classes11.dex */
public class ConfirmationActivity extends FragmentActivity implements ITimeoutListener {
    public static final String KEY_DIALOG_HEADER = "KEY_DIALOG_HEADER";
    public static final String KEY_NEGATIVE_BUTTON = "KEY_NEGATIVE_BUTTON";
    public static final String KEY_POSITIVE_BUTTON = "KEY_POSITIVE_BUTTON";
    public static final String KEY_PROMPT_IMG_64 = "KEY_PROMPT_IMG_64";
    public static final String KEY_PROMPT_SUB_TEXT = "KEY_PROMPT_SUB_TEXT";
    public static final String KEY_PROMPT_TEXT = "KEY_PROMPT_TEXT";
    public static final String KEY_SHOW_PASSKEY_ICON = "KEY_SHOW_PASSKEY_ICON";
    public static final String KEY_SHOW_WHEN_LOCKED = "KEY_SHOW_WHEN_LOCKED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63429a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InactivityTimer f63430b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, View view) {
        Logger.d("ConfirmationActivity", "'Decline' button pressed, canceling");
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
        this.f63429a = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Logger.i("ConfirmationActivity", "BACK button is pressed");
        ActivityInOutParams.setResult(this, Outcome.CANCELED);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        Logger.v("ConfirmationActivity", "onCreate");
        this.f63430b = new InactivityTimer(this, AppSDKConfig.getInstance(this).get(AppSDKConfig.Key.inactivityTimeout).getAsInt());
        DialogBuilder dialogBuilder = DialogBuilder.getInstance(this);
        NnlConfirmationLayoutBinding nnlConfirmationLayoutBindingInflate = NnlConfirmationLayoutBinding.inflate(LayoutInflater.from(dialogBuilder.getContext()));
        new ViewWrapper(nnlConfirmationLayoutBindingInflate.getRoot()).onShow();
        if (getIntent().getBooleanExtra("KEY_SHOW_WHEN_LOCKED", false)) {
            ShowWhenLocked.enable(this);
        }
        if (ActivityInOutParams.onActivityCreate(this)) {
            Intent intent = getIntent();
            if (intent.hasExtra(KEY_DIALOG_HEADER)) {
                nnlConfirmationLayoutBindingInflate.dialogTitle.setText(intent.getStringExtra(KEY_DIALOG_HEADER));
                nnlConfirmationLayoutBindingInflate.dialogHeader.setVisibility(0);
            }
            if (intent.hasExtra(KEY_PROMPT_IMG_64) && (stringExtra = intent.getStringExtra(KEY_PROMPT_IMG_64)) != null) {
                byte[] bArrDecode = Base64.decode(stringExtra, 0);
                if (bArrDecode.length == 0) {
                    Logger.e("ConfirmationActivity", "Nothing to display");
                    return;
                } else {
                    nnlConfirmationLayoutBindingInflate.imageContent.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                    nnlConfirmationLayoutBindingInflate.imageContent.setVisibility(0);
                }
            }
            if (intent.hasExtra("KEY_PROMPT_TEXT")) {
                nnlConfirmationLayoutBindingInflate.confirmationTitle.setText(intent.getStringExtra("KEY_PROMPT_TEXT"));
                nnlConfirmationLayoutBindingInflate.confirmationTitle.setVisibility(0);
            }
            if (intent.hasExtra("KEY_PROMPT_SUB_TEXT")) {
                nnlConfirmationLayoutBindingInflate.confirmationSubTitle.setText(intent.getStringExtra("KEY_PROMPT_SUB_TEXT"));
                nnlConfirmationLayoutBindingInflate.confirmationSubTitle.setVisibility(0);
            }
            if (intent.hasExtra("KEY_POSITIVE_BUTTON")) {
                nnlConfirmationLayoutBindingInflate.tvAuthorizeText.setText(intent.getStringExtra("KEY_POSITIVE_BUTTON"));
            }
            if (intent.hasExtra(KEY_NEGATIVE_BUTTON)) {
                nnlConfirmationLayoutBindingInflate.tvCancelText.setText(intent.getStringExtra(KEY_NEGATIVE_BUTTON));
            }
            if (intent.hasExtra(KEY_SHOW_PASSKEY_ICON)) {
                nnlConfirmationLayoutBindingInflate.ivConfirmStart.setVisibility(0);
                nnlConfirmationLayoutBindingInflate.tvAuthorizeText.setPadding((int) (getResources().getDisplayMetrics().density * 56.0f), 0, nnlConfirmationLayoutBindingInflate.tvAuthorizeText.getPaddingRight(), 0);
            } else {
                nnlConfirmationLayoutBindingInflate.ivConfirmStart.setVisibility(8);
                nnlConfirmationLayoutBindingInflate.tvAuthorizeText.setPadding((int) (getResources().getDisplayMetrics().density * 20.0f), 0, nnlConfirmationLayoutBindingInflate.tvAuthorizeText.getPaddingRight(), 0);
            }
            AlertDialog alertDialogCreate = dialogBuilder.create(nnlConfirmationLayoutBindingInflate.getRoot());
            int i10 = 1;
            nnlConfirmationLayoutBindingInflate.declineButton.setOnClickListener(new d9.c(this, alertDialogCreate, i10));
            nnlConfirmationLayoutBindingInflate.authorizeButton.setOnClickListener(new d9.d(this, alertDialogCreate, i10));
            alertDialogCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.noknok.android.client.utils.f
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f63501p0.a(dialogInterface);
                }
            });
            alertDialogCreate.show();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Logger.i("ConfirmationActivity", "onPause called");
        super.onPause();
        this.f63430b.stop();
        if (isFinishing() || this.f63429a) {
            ActivityInOutParams.setResult(this, Outcome.SYSTEM_CANCELED);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f63430b.start();
    }

    @Override // com.noknok.android.client.utils.ITimeoutListener
    public void onTimeOut() {
        ActivityInOutParams.setResult(this, Outcome.TIMEOUT);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        Logger.d("ConfirmationActivity", "'Back' button pressed, canceling");
        ActivityInOutParams.setResult(this, Outcome.CANCELED);
        finish();
    }
}
