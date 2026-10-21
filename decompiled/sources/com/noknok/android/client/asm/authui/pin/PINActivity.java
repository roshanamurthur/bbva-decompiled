package com.noknok.android.client.asm.authui.pin;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.authenticator.UVTHelper;
import com.noknok.android.client.asm.authui.pin.pinpad.PinManageProcess;
import com.noknok.android.client.asm.authui.pin.pinpad.PinPad;
import com.noknok.android.client.asm.pinmanagement.PinDatabase;
import com.noknok.android.client.asm.pinmanagement.PinManager;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.UVTMatcherInParams;
import com.noknok.android.client.asm.sdk.UVTMatcherOutParams;
import com.noknok.android.client.utils.ActivityInOutParams;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.ITimeoutListener;
import com.noknok.android.client.utils.InactivityTimer;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.ShowWhenLocked;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import java.text.MessageFormat;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PINActivity extends FragmentActivity implements ITimeoutListener {
    public static final String KEY_PROMPT_TEXT = "KEY_PROMPT_TEXT";
    public static final String KEY_SHOW_WHEN_LOCKED = "KEY_SHOW_WHEN_LOCKED";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PINMatcher.ACTION f63197e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IMatcher.IAntiHammeringCallback f63199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private UVTMatcherInParams f63200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PinManager f63201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PinDatabase.PinConfig f63202j;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f63205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InactivityTimer f63206o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PINProcessorState f63193a = PINProcessorState.UI_ID_MAX;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63194b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PinProcessor f63195c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PinPad f63196d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63198f = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f63203k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f63204l = null;

    /* JADX INFO: renamed from: com.noknok.android.client.asm.authui.pin.PINActivity$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63207a;

        static {
            int[] iArr = new int[PINProcessorState.values().length];
            f63207a = iArr;
            try {
                iArr[PINProcessorState.UI_ID_CREATEPIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63207a[PINProcessorState.UI_ID_CREATEPIN_CONF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63207a[PINProcessorState.UI_ID_CHECKPIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63207a[PINProcessorState.UI_ID_CHANGEPIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63207a[PINProcessorState.UI_ID_CHANGEPIN_NEW1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63207a[PINProcessorState.UI_ID_CHANGEPIN_NEW2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum PINProcessorState {
        UI_ID_CREATEPIN(PinPad.TYPE.CREATE_PIN),
        UI_ID_CREATEPIN_CONF(PinPad.TYPE.CONFIRM_PIN),
        UI_ID_CHECKPIN(PinPad.TYPE.ENTER_PIN),
        UI_ID_CHANGEPIN(PinPad.TYPE.OLD_PIN),
        UI_ID_CHANGEPIN_NEW1(PinPad.TYPE.NEW_PIN_1),
        UI_ID_CHANGEPIN_NEW2(PinPad.TYPE.NEW_PIN_2),
        UI_ID_MAX(PinPad.TYPE.INVALID_TYPE);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PinPad.TYPE f63209a;

        PINProcessorState(PinPad.TYPE type) {
            this.f63209a = type;
        }

        public PinPad.TYPE getPinPadType() {
            return this.f63209a;
        }
    }

    public class PinProcessor implements PinManageProcess {
        public /* synthetic */ PinProcessor(PINActivity pINActivity, int i10) {
            this();
        }

        @Override // com.noknok.android.client.asm.authui.pin.pinpad.PinManageProcess
        public void onCancel() {
            a(IMatcher.RESULT.CANCEL);
        }

        @Override // com.noknok.android.client.asm.authui.pin.pinpad.PinManageProcess
        public void onEnter(String str) {
            boolean z10;
            int[] iArr = AnonymousClass1.f63207a;
            switch (iArr[PINActivity.this.f63193a.ordinal()]) {
                case 1:
                    Logger.i("PINActivity", "Begin to confirm pin");
                    PINActivity pINActivity = PINActivity.this;
                    PinDatabase.PinConfig pinConfig = pINActivity.f63202j;
                    if (!pINActivity.a(str, pinConfig.maxRepeatDigits, pinConfig.maxSequentialDigits)) {
                        PINActivity pINActivity2 = PINActivity.this;
                        pINActivity2.f63196d.setInfoText(pINActivity2, UiConfig.getText(pINActivity2.getApplicationContext(), UIConfigTags.LEVELS_PIN_VIEW, UIConfigTags.TAG_PIN_ERROR_MESSAGE_CRITERIA_NOT_MET, R.string.nnl_asm_pin_not_meet_criteria));
                        PINActivity.this.f63196d.reset();
                    } else {
                        PINActivity pINActivity3 = PINActivity.this;
                        pINActivity3.f63205n = str;
                        pINActivity3.f63193a = PINProcessorState.UI_ID_CREATEPIN_CONF;
                        pINActivity3.b();
                    }
                    break;
                case 2:
                    if (!PINActivity.this.f63205n.equals(str)) {
                        Logger.i("PINActivity", "Confirm pin failed");
                        PINActivity pINActivity4 = PINActivity.this;
                        pINActivity4.f63193a = PINProcessorState.UI_ID_CREATEPIN;
                        pINActivity4.b();
                        PINActivity pINActivity5 = PINActivity.this;
                        pINActivity5.f63196d.setInfoText(pINActivity5, UiConfig.getText(pINActivity5.getApplicationContext(), UIConfigTags.LEVELS_PIN_VIEW, UIConfigTags.TAG_PIN_ERROR_NO_MATCH, R.string.nnl_asm_pin_pins_dont_match));
                    } else {
                        Logger.i("PINActivity", "Create new pin succeeded");
                        PINActivity pINActivity6 = PINActivity.this;
                        pINActivity6.f63193a = PINProcessorState.UI_ID_MAX;
                        try {
                            pINActivity6.f63201i.enroll(str);
                            a(IMatcher.RESULT.SUCCESS);
                        } catch (AsmException unused) {
                            String str2 = PINActivity.KEY_SHOW_WHEN_LOCKED;
                            Logger.e("PINActivity", "PIN enrollment failed");
                            a(IMatcher.RESULT.CANCEL);
                            return;
                        }
                    }
                    break;
                case 3:
                case 4:
                    PINActivity pINActivity7 = PINActivity.this;
                    PINProcessorState pINProcessorState = pINActivity7.f63193a;
                    pINActivity7.f63193a = PINProcessorState.UI_ID_MAX;
                    PinManager.VerifyStatus verifyStatusVerify = pINActivity7.f63201i.verify(str);
                    if (verifyStatusVerify.equals(PinManager.VerifyStatus.SUCCESS)) {
                        z10 = true;
                    } else {
                        Logger.e("PINActivity", "PIN Match operation failed, state: " + pINProcessorState);
                        pINActivity7.f63203k = pINActivity7.f63199g.getFailedCount();
                        if (verifyStatusVerify.equals(PinManager.VerifyStatus.PIN_LOCKOUT)) {
                            pINActivity7.f63195c.a(IMatcher.RESULT.USER_LOCKOUT);
                        }
                        if (verifyStatusVerify.equals(PinManager.VerifyStatus.PIN_ERASED)) {
                            Logger.e("PINActivity", "Anti-hammering test failed");
                            pINActivity7.f63195c.a(IMatcher.RESULT.KEY_DISAPPEARED_PERMANENTLY);
                        }
                        z10 = false;
                    }
                    int i10 = iArr[pINProcessorState.ordinal()];
                    if (i10 == 3) {
                        if (!z10) {
                            Logger.i("PINActivity", "Auth pin failed");
                            pINActivity7.a();
                            pINActivity7.f63193a = PINProcessorState.UI_ID_CHECKPIN;
                            pINActivity7.f63196d.reset();
                        } else {
                            pINActivity7.f63195c.a(IMatcher.RESULT.SUCCESS);
                        }
                        break;
                    } else if (i10 == 4) {
                        if (!z10) {
                            pINActivity7.a();
                            pINActivity7.f63193a = PINProcessorState.UI_ID_CHANGEPIN;
                            Logger.i("PINActivity", "Confirm pin failed");
                            pINActivity7.f63196d.reset();
                        } else {
                            Logger.i("PINActivity", "Begin to confirm new pin 1");
                            pINActivity7.m = str;
                            pINActivity7.f63193a = PINProcessorState.UI_ID_CHANGEPIN_NEW1;
                            pINActivity7.b();
                        }
                        break;
                    }
                    break;
                case 5:
                    Logger.i("PINActivity", "Begin to confirm new pin 2");
                    PINActivity pINActivity8 = PINActivity.this;
                    PinDatabase.PinConfig pinConfig2 = pINActivity8.f63202j;
                    String text = pINActivity8.a(str, pinConfig2.maxRepeatDigits, pinConfig2.maxSequentialDigits) ? PINActivity.this.f63201i.hasPinBeenUsed(str) ? UiConfig.getText(PINActivity.this.getApplicationContext(), UIConfigTags.LEVELS_PIN_VIEW, UIConfigTags.TAG_PIN_ERROR_MESSAGE_USED_BEFORE, R.string.nnl_asm_pin_used_before) : null : UiConfig.getText(PINActivity.this.getApplicationContext(), UIConfigTags.LEVELS_PIN_VIEW, UIConfigTags.TAG_PIN_ERROR_MESSAGE_CRITERIA_NOT_MET, R.string.nnl_asm_pin_not_meet_criteria);
                    if (text != null) {
                        PINActivity pINActivity9 = PINActivity.this;
                        pINActivity9.f63196d.setInfoText(pINActivity9, text);
                        PINActivity.this.f63196d.reset();
                    } else {
                        PINActivity pINActivity10 = PINActivity.this;
                        pINActivity10.f63205n = str;
                        pINActivity10.f63193a = PINProcessorState.UI_ID_CHANGEPIN_NEW2;
                        pINActivity10.b();
                    }
                    break;
                case 6:
                    if (!PINActivity.this.f63205n.equals(str)) {
                        Logger.i("PINActivity", "Change pin failed");
                        PINActivity pINActivity11 = PINActivity.this;
                        pINActivity11.f63193a = PINProcessorState.UI_ID_CHANGEPIN_NEW1;
                        pINActivity11.b();
                        PINActivity pINActivity12 = PINActivity.this;
                        pINActivity12.f63196d.setInfoText(pINActivity12, UiConfig.getText(pINActivity12.getApplicationContext(), UIConfigTags.LEVELS_PIN_VIEW, UIConfigTags.TAG_PIN_ERROR_NO_MATCH, R.string.nnl_asm_pin_pins_dont_match));
                    } else {
                        PINActivity pINActivity13 = PINActivity.this;
                        if (!pINActivity13.f63201i.changePin(pINActivity13.m, str).equals(PinManager.VerifyStatus.SUCCESS)) {
                            Logger.i("PINActivity", "Change pin failed");
                            a(IMatcher.RESULT.CANCEL);
                        } else {
                            Logger.i("PINActivity", "Change pin succeeded");
                            a(IMatcher.RESULT.SUCCESS);
                        }
                    }
                    break;
            }
        }

        @Override // com.noknok.android.client.asm.authui.pin.pinpad.PinManageProcess
        public void onKeyDown() {
            if (PINActivity.this.isFinishing()) {
                return;
            }
            PINActivity.this.f63206o.start();
        }

        private PinProcessor() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(IMatcher.RESULT result) {
            PINActivity pINActivity = PINActivity.this;
            if (pINActivity.f63198f) {
                ActivityInOutParams.setResult(pINActivity, new IMatcher.MatcherSettingsOutParams(result));
            } else {
                ActivityInOutParams.setResult(pINActivity, new UVTMatcherOutParams(result, null, null, new UVTHelper(PINActivity.this.f63200h.getAAID(), PINActivity.this.f63200h.getFinalChallenge()).createUVT()));
            }
            PINActivity pINActivity2 = PINActivity.this;
            pINActivity2.f63195c = null;
            pINActivity2.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, int i10, int i11) {
        int i12 = 1;
        int i13 = 1;
        int i14 = 1;
        int i15 = 0;
        while (i15 < str.length() - 1) {
            int numericValue = Character.getNumericValue(str.charAt(i15));
            i15++;
            int numericValue2 = Character.getNumericValue(str.charAt(i15));
            if (numericValue == numericValue2) {
                i12++;
                i13 = 1;
            } else {
                if (numericValue == numericValue2 - 1) {
                    i13++;
                    i12 = 1;
                    i14 = 1;
                } else if (numericValue == numericValue2 + 1) {
                    i14++;
                    i12 = 1;
                    i13 = 1;
                } else {
                    i12 = 1;
                    i13 = 1;
                }
                if (i12 <= i10 || i13 > i11 || i14 > i11) {
                    return false;
                }
            }
            i14 = i13;
            if (i12 <= i10) {
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String text;
        Logger.i("PINActivity", "updatePinpad. State: " + this.f63193a);
        PINProcessorState pINProcessorState = this.f63193a;
        if (pINProcessorState == null || pINProcessorState.getPinPadType() == PinPad.TYPE.INVALID_TYPE) {
            PinProcessor pinProcessor = this.f63195c;
            if (pinProcessor != null) {
                pinProcessor.onCancel();
                return;
            }
            return;
        }
        PinProcessor pinProcessor2 = this.f63195c;
        PinPad.TYPE pinPadType = this.f63193a.getPinPadType();
        int i10 = getResources().getConfiguration().orientation;
        PinDatabase.PinConfig pinConfig = this.f63202j;
        int pinLength = this.f63201i.getPinLength();
        String str = this.f63204l;
        if (str == null || str.isEmpty()) {
            PINMatcher.ACTION action = this.f63197e;
            if (action == PINMatcher.ACTION.ENROLL || action == PINMatcher.ACTION.REGISTER) {
                text = UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_FIDO_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_REGISTER, R.string.nnl_asmsdk_uaf_reg_default_prompt);
            } else {
                text = (action != PINMatcher.ACTION.IDENTIFY || this.f63200h.getTransText() == null) ? UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_METHODS_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_SIGN_IN, R.string.nnl_asmsdk_uaf_auth_default_prompt) : UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_METHODS_VIEW, UIConfigTags.TAG_METHOD_MESSAGE_TRANSACTION, R.string.nnl_asmsdk_uaf_trans_default_prompt);
            }
        } else {
            text = this.f63204l;
        }
        this.f63196d = new PinPad(this, pinProcessor2, pinPadType, i10, pinConfig, pinLength, text);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        Logger.v("PINActivity", "onAttachedToWindow");
        this.f63194b = true;
        super.onAttachedToWindow();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Logger.v("PINActivity", "onBackPressed");
        PinProcessor pinProcessor = this.f63195c;
        if (pinProcessor != null) {
            pinProcessor.onCancel();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Bundle bundle = new Bundle();
        this.f63196d.onSaveState(bundle);
        b();
        this.f63196d.onRestoreState(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63206o = new InactivityTimer(this, AppSDKConfig.getInstance(this).get(AppSDKConfig.Key.inactivityTimeout).getAsInt());
        try {
            int i10 = 0;
            if (getIntent().getBooleanExtra("KEY_SHOW_WHEN_LOCKED", false)) {
                ShowWhenLocked.enable(this);
            }
            this.f63204l = getIntent().getStringExtra("KEY_PROMPT_TEXT");
            Intent intent = getIntent();
            boolean booleanExtra = intent.getBooleanExtra("GLOBAL_ENROLLMENT", true);
            this.f63197e = PINMatcher.ACTION.values()[intent.getIntExtra("ACTION", PINMatcher.ACTION.MAX.ordinal())];
            if (ActivityInOutParams.onActivityCreate(this)) {
                try {
                    UVTMatcherInParams uVTMatcherInParams = (UVTMatcherInParams) ActivityInOutParams.getIncomingData(this);
                    this.f63200h = uVTMatcherInParams;
                    PINMatcher.ACTION action = this.f63197e;
                    if (action == PINMatcher.ACTION.ENROLL) {
                        this.f63193a = PINProcessorState.UI_ID_CREATEPIN;
                    } else if (action == PINMatcher.ACTION.IDENTIFY || action == PINMatcher.ACTION.REGISTER) {
                        this.f63193a = PINProcessorState.UI_ID_CHECKPIN;
                    } else {
                        if (action != PINMatcher.ACTION.MANAGE) {
                            Logger.e("PINActivity", "Unexpected state");
                            ActivityInOutParams.setResult(this, new IMatcher.MatcherOutParams(IMatcher.RESULT.ERRORAUTH));
                            finish();
                            return;
                        }
                        this.f63193a = PINProcessorState.UI_ID_CHANGEPIN;
                    }
                    IMatcher.IAntiHammeringCallback antiHammeringCallback = uVTMatcherInParams.getAntiHammeringCallback();
                    this.f63199g = antiHammeringCallback;
                    this.f63203k = antiHammeringCallback.getFailedCount();
                    this.f63201i = new PinManager(this.f63200h.getAAID(), this, this.f63199g).setCallerId(this.f63200h.getCallerId()).setAppId(this.f63200h.getAppId()).setKeyId(this.f63200h.getKeyId()).setGlobalEnrollment(booleanExtra);
                } catch (ClassCastException unused) {
                    Logger.i("PINActivity", "Failed to get MatcherInParams, check for PINChangeInParams");
                    IMatcher.MatcherSettingsInParams matcherSettingsInParams = (IMatcher.MatcherSettingsInParams) ActivityInOutParams.getIncomingData(this);
                    this.f63198f = true;
                    if (this.f63197e != PINMatcher.ACTION.MANAGE) {
                        Logger.e("PINActivity", "Unexpected state, expected MANAGE state");
                        ActivityInOutParams.setResult(this, new IMatcher.MatcherSettingsOutParams(IMatcher.RESULT.ERRORAUTH));
                        finish();
                        return;
                    } else {
                        this.f63193a = PINProcessorState.UI_ID_CHANGEPIN;
                        IMatcher.IAntiHammeringCallback antiHammeringCallback2 = matcherSettingsInParams.getAntiHammeringCallback();
                        this.f63199g = antiHammeringCallback2;
                        this.f63203k = antiHammeringCallback2.getFailedCount();
                        this.f63201i = new PinManager(matcherSettingsInParams.getAAID(), this, this.f63199g).setGlobalEnrollment(booleanExtra);
                    }
                }
                this.f63202j = this.f63201i.getPinConfig();
            }
            if (bundle != null) {
                this.f63193a = (PINProcessorState) bundle.getSerializable("STATE");
                this.m = bundle.getString("CURRENT_PIN");
                this.f63205n = bundle.getString("NEW_PIN");
            }
            this.f63195c = new PinProcessor(this, i10);
            b();
            this.f63196d.onRestoreState(bundle);
        } catch (AsmException e5) {
            Logger.e("PINActivity", "Unexpected condition. This may indicate a programming issue", e5);
            ActivityInOutParams.setResult(this, new IMatcher.MatcherOutParams(IMatcher.RESULT.ERRORAUTH));
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Logger.v("PINActivity", "onDestroy");
        PinProcessor pinProcessor = this.f63195c;
        if (pinProcessor != null) {
            pinProcessor.a(IMatcher.RESULT.SYSTEM_CANCELED);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Logger.v("PINActivity", "onPause");
        this.f63206o.stop();
        PinProcessor pinProcessor = this.f63195c;
        if (pinProcessor != null && this.f63194b) {
            pinProcessor.a(IMatcher.RESULT.SYSTEM_CANCELED);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f63206o.start();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("STATE", this.f63193a);
        bundle.putString("CURRENT_PIN", this.m);
        bundle.putString("NEW_PIN", this.f63205n);
        this.f63196d.onSaveState(bundle);
    }

    @Override // com.noknok.android.client.utils.ITimeoutListener
    public void onTimeOut() {
        PinProcessor pinProcessor = this.f63195c;
        if (pinProcessor != null) {
            pinProcessor.a(IMatcher.RESULT.TIMEOUT);
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f63206o.start();
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Context applicationContext = getApplicationContext();
        List<String> list = UIConfigTags.LEVELS_PIN_VIEW;
        String text = UiConfig.getText(applicationContext, list, UIConfigTags.TAG_PIN_ERROR_MESSAGE_INVALID, R.string.nnl_asm_pin_msg_invalid_pin);
        PinDatabase.PinConfig pinConfig = this.f63202j;
        if (pinConfig.lockoutPeriod != 0) {
            this.f63196d.setInfoText(this, text);
            return;
        }
        if (this.f63203k >= pinConfig.maxFalseAttempts / 2) {
            text = MessageFormat.format(UiConfig.getText(getApplicationContext(), list, UIConfigTags.TAG_PIN_ERROR_MESSAGE_INCORRECT_ATTEMPTS, R.string.nnl_asm_pin_invalid_pin_with_number), Integer.valueOf(this.f63203k));
        }
        int i10 = this.f63203k;
        int i11 = this.f63202j.maxFalseAttempts;
        if (i10 == i11 - 1) {
            a(UiConfig.getText(getApplicationContext(), list, UIConfigTags.TAG_PIN_ERROR_MESSAGE_LAST_ATTEMPT, R.string.nnl_asm_pin_alert_message_before_last_attempt));
        } else {
            int i12 = i11 / 2;
            if (i10 == i12 + 2) {
                a(MessageFormat.format(UiConfig.getText(getApplicationContext(), list, UIConfigTags.TAG_PIN_ERROR_MESSAGE_REMAINING_ATTEMPTS, R.string.nnl_asm_pin_antihammering_alert_message), Integer.valueOf(this.f63202j.maxFalseAttempts)));
            } else if (i10 == i12) {
                a(text);
            } else {
                if (i10 == i11) {
                }
                this.f63196d.setInfoText(this, text);
            }
        }
        text = null;
        this.f63196d.setInfoText(this, text);
    }

    private void a(String str) {
        new AlertDialog.Builder(this).setTitle(UiConfig.getText(getApplicationContext(), UIConfigTags.LEVELS_PIN_VIEW, UIConfigTags.TAG_PIN_ERROR_TITLE, R.string.nnl_asm_pin_alert)).setMessage(str).setCancelable(false).setPositiveButton(UiConfig.getText(getApplicationContext(), UIConfigTags.GLOBAL_LEVEL, UIConfigTags.TAG_OK_BUTTON, R.string.nnl_asm_pin_ok), (DialogInterface.OnClickListener) null).create().show();
    }
}
