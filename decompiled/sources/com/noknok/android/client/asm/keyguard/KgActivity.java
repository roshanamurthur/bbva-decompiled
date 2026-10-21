package com.noknok.android.client.asm.keyguard;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import androidx.collection.k;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.ActivityInOutParams;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;

/* JADX INFO: loaded from: classes11.dex */
public class KgActivity extends Activity {
    public static final String KEY_IN_TRANSACTION_TEXT = "TRANSACTION_TEXT";
    public static final String KEY_IS_REG_OPERATION = "KEY_IS_REG_OPERATION";
    public static final String KEY_PROMPT_TEXT = "KEY_PROMPT_TEXT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63276a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63277b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63278c = false;

    private void a(IMatcher.RESULT result) {
        Logger.i("KgActivity", "Set result: " + result.toString());
        ActivityInOutParams.setResult(this, result);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Logger.d("KgActivity", k.c("onActivityResult(requestCode=", i10, ", resultCode=", i11, ")"));
        if (i10 != 1) {
            a(IMatcher.RESULT.ERRORAUTH);
            return;
        }
        if (i11 == -1) {
            a(IMatcher.RESULT.SUCCESS);
        } else if (i11 != 0) {
            a(IMatcher.RESULT.ERRORAUTH);
        } else {
            a(IMatcher.RESULT.CANCEL);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.v("KgActivity", "onBackPressed");
        a(IMatcher.RESULT.CANCEL);
    }

    @Override // android.app.Activity
    @TargetApi(21)
    public void onCreate(Bundle bundle) {
        String text;
        super.onCreate(bundle);
        Logger.i("KgActivity", "onCreate");
        this.f63277b = getIntent().getStringExtra(KEY_IN_TRANSACTION_TEXT);
        this.f63276a = getIntent().getStringExtra("KEY_PROMPT_TEXT");
        this.f63278c = getIntent().getBooleanExtra(KEY_IS_REG_OPERATION, false);
        if (ActivityInOutParams.onActivityCreate(this)) {
            KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
            if (!keyguardManager.isKeyguardSecure()) {
                a(IMatcher.RESULT.USER_NOT_ENROLLED);
            }
            String string = getString(R.string.nnl_kg_title);
            String str = this.f63276a;
            if (str != null && !str.isEmpty()) {
                text = this.f63276a;
            } else if (this.f63278c) {
                text = UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_FIDO_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_REGISTER, R.string.nnl_asmsdk_uaf_reg_default_prompt);
            } else {
                text = this.f63277b != null ? UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_METHODS_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_TRANSACTION, R.string.nnl_asmsdk_uaf_trans_default_prompt) : UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_METHODS_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_SIGN_IN, R.string.nnl_asmsdk_uaf_auth_default_prompt);
            }
            Intent intentCreateConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(string, text);
            if (intentCreateConfirmDeviceCredentialIntent == null) {
                a(IMatcher.RESULT.USER_NOT_ENROLLED);
            }
            startActivityForResult(intentCreateConfirmDeviceCredentialIntent, 1);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            a(IMatcher.RESULT.SYSTEM_CANCELED);
        }
    }
}
