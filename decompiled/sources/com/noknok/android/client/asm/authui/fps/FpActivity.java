package com.noknok.android.client.asm.authui.fps;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.ActivityInOutParams;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.ITimeoutListener;
import com.noknok.android.client.utils.InactivityTimer;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.ShowWhenLocked;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import java.security.Signature;

/* JADX INFO: loaded from: classes11.dex */
public class FpActivity extends FragmentActivity implements ITimeoutListener {
    public static final String KEY_FALLBACK_TEXT = "KEY_FALLBACK_TEXT";
    public static final String KEY_FPS_ACTION = "FPS_ACTION";
    public static final String KEY_IN_TRANSACTION_TEXT = "TRANS_TEXT";
    public static final String KEY_PROMPT_TEXT = "KEY_PROMPT_TEXT";
    public static final String KEY_SHOW_WHEN_LOCKED = "KEY_SHOW_WHEN_LOCKED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Signature f63154a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FPS_ACTION f63156c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InactivityTimer f63160g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63155b = null;
    public boolean mAttachedToWindow = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63157d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63158e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63159f = false;

    public enum FPS_ACTION {
        REGISTER,
        AUTHENTICATE,
        ACTION_MAX
    }

    private void a() {
        Logger.d("FpActivity", "showAuthenticationFragment");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FpAuthUiFragment fpAuthUiFragment = (FpAuthUiFragment) supportFragmentManager.findFragmentByTag("FPSFragment");
        if (fpAuthUiFragment == null) {
            fpAuthUiFragment = new FpAuthUiFragment();
            supportFragmentManager.beginTransaction().add(fpAuthUiFragment, "FPSFragment").commit();
        }
        fpAuthUiFragment.setCryptoObject(new FingerprintManager.CryptoObject(this.f63154a));
        String str = this.f63158e;
        if (str != null && !str.isEmpty()) {
            fpAuthUiFragment.setDescriptionText(this.f63158e);
            return;
        }
        if (FPS_ACTION.REGISTER.equals(this.f63156c)) {
            fpAuthUiFragment.setDescriptionText(UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_FIDO_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_REGISTER, R.string.nnl_asmsdk_uaf_reg_default_prompt));
            return;
        }
        if (this.f63155b != null) {
            fpAuthUiFragment.setDescriptionText(UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_METHODS_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_TRANSACTION, R.string.nnl_asmsdk_uaf_trans_default_prompt));
            return;
        }
        fpAuthUiFragment.setDescriptionText(UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_METHODS_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_SIGN_IN, R.string.nnl_asmsdk_uaf_auth_default_prompt));
        String str2 = this.f63157d;
        if (str2 != null) {
            fpAuthUiFragment.setFallbackTitle(str2);
        }
    }

    public final boolean b() {
        return ((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked();
    }

    public final boolean c() {
        return this.f63159f;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.i("FpActivity", "onAttachedToWindow");
        this.mAttachedToWindow = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Logger.v("FpActivity", "onBackPressed");
        onCompleted(IMatcher.RESULT.CANCEL, null);
    }

    @TargetApi(23)
    public void onCompleted(IMatcher.RESULT result, FingerprintManager.AuthenticationResult authenticationResult) {
        FpMatcher.ActivityStarterResult activityStarterResult = new FpMatcher.ActivityStarterResult();
        activityStarterResult.Result = result;
        if (result == IMatcher.RESULT.SUCCESS) {
            if (authenticationResult == null || authenticationResult.getCryptoObject() == null) {
                activityStarterResult.Result = IMatcher.RESULT.ERRORAUTH;
                activityStarterResult.f63174a = null;
            } else {
                activityStarterResult.f63174a = authenticationResult.getCryptoObject();
            }
        }
        ActivityInOutParams.setResult(this, activityStarterResult);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @TargetApi(23)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63160g = new InactivityTimer(this, AppSDKConfig.getInstance(this).get(AppSDKConfig.Key.inactivityTimeout).getAsInt());
        this.f63157d = getIntent().getStringExtra(KEY_FALLBACK_TEXT);
        this.f63158e = getIntent().getStringExtra("KEY_PROMPT_TEXT");
        if (getIntent().getBooleanExtra("KEY_SHOW_WHEN_LOCKED", false)) {
            this.f63159f = true;
            ShowWhenLocked.enable(this);
        }
        setContentView(R.layout.nnl_asm_native_fps_activity_main);
        Intent intent = getIntent();
        if (ActivityInOutParams.onActivityCreate(this)) {
            FPS_ACTION[] fps_actionArrValues = FPS_ACTION.values();
            FPS_ACTION fps_action = FPS_ACTION.ACTION_MAX;
            FPS_ACTION fps_action2 = fps_actionArrValues[intent.getIntExtra(KEY_FPS_ACTION, fps_action.ordinal())];
            this.f63156c = fps_action2;
            if (fps_action.equals(fps_action2)) {
                return;
            }
            String stringExtra = intent.getStringExtra(KEY_IN_TRANSACTION_TEXT);
            this.f63155b = stringExtra;
            if (stringExtra != null) {
                Logger.d("FpActivity", "Transaction Text: " + this.f63155b);
            }
            Logger.d("FpActivity", "Starting Identify and Sign Action");
            FpMatcher.ActivityParams activityParams = (FpMatcher.ActivityParams) ActivityInOutParams.getIncomingData(this);
            Signature signature = activityParams.f63173b;
            this.f63154a = signature;
            if (signature == null) {
                Logger.e("FpActivity", "Signature crypto object is null");
            } else if (!activityParams.f63172a) {
                a();
            } else {
                Logger.e("FpActivity", "FPMatcher.UserLockout");
                onCompleted(IMatcher.RESULT.USER_LOCKOUT, null);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Logger.v("FpActivity", "onPause");
        super.onPause();
        this.f63160g.stop();
        if (this.f63159f) {
            return;
        }
        if (b() || this.mAttachedToWindow) {
            onCompleted(IMatcher.RESULT.SYSTEM_CANCELED, null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 0 || iArr[0] != 0) {
            Logger.d("FpActivity", "FPS permission not granted");
        } else {
            Logger.d("FpActivity", "FPS permission granted, performing authentication");
            a();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f63160g.start();
        if (!b() || this.f63159f) {
            return;
        }
        onCompleted(IMatcher.RESULT.CANCEL, null);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // com.noknok.android.client.utils.ITimeoutListener
    public void onTimeOut() {
        onCompleted(IMatcher.RESULT.TIMEOUT, null);
    }

    public void resetInactivityTimer() {
        this.f63160g.start();
    }
}
