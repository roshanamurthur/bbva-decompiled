package com.bbva.library.digipassmanager.helpers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import androidx.activity.result.ActivityResultLauncher;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.library.digipassmanager.DigipassManager;
import com.bbva.library.digipassmanager.callbacks.OnDeleteTokenCronto;
import com.bbva.library.digipassmanager.callbacks.OnDigipassOperation;
import com.bbva.library.digipassmanager.callbacks.OnGenerateOtpOperation;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DigipassManagerHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J&\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0012J\u001c\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0010\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u001a¨\u0006\u001f"}, d2 = {"Lcom/bbva/library/digipassmanager/helpers/DigipassManagerHelper;", "", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "storage", "", "secureChannelMessage", "deviceId", "Lcom/bbva/library/digipassmanager/callbacks/OnDigipassOperation;", "callback", "", "validateTokenHash", "activateTokenHash", "Landroid/content/Context;", "context", ClientData.KEY_CHALLENGE, "generateOtp", "", "getTimeRemaining", "Lcom/bbva/library/digipassmanager/callbacks/OnDeleteTokenCronto;", "deleteToken", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "openQRScanner", "Ljava/lang/Class;", "getQRCodeScannerTarget", "<init>", "()V", "Companion", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
public final class DigipassManagerHelper {
    public static final int DISCOUNT_TIME = 1000;
    public static final int INITIAL_TIME = 30000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public CountDownTimer f34945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f34946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f34947c = "";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final DigipassManagerHelper f34944d = new DigipassManagerHelper();

    /* JADX INFO: compiled from: DigipassManagerHelper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/library/digipassmanager/helpers/DigipassManagerHelper$Companion;", "", "()V", "DISCOUNT_TIME", "", "INITIAL_TIME", "<set-?>", "Lcom/bbva/library/digipassmanager/helpers/DigipassManagerHelper;", "instance", "getInstance", "()Lcom/bbva/library/digipassmanager/helpers/DigipassManagerHelper;", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DigipassManagerHelper getInstance() {
            return DigipassManagerHelper.f34944d;
        }
    }

    public static final void access$stopTimer(DigipassManagerHelper digipassManagerHelper) {
        CountDownTimer countDownTimer = digipassManagerHelper.f34945a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public static final String access$validateOtp(final DigipassManagerHelper digipassManagerHelper, String str) {
        if (digipassManagerHelper.f34947c.length() == 0) {
            digipassManagerHelper.f34947c = str;
            digipassManagerHelper.f34945a = new CountDownTimer() { // from class: com.bbva.library.digipassmanager.helpers.DigipassManagerHelper$startTimer$1
                {
                    super(30000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    DigipassManagerHelper.access$stopTimer(this.f34950a);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long time) {
                    this.f34950a.f34946b = time / ((long) 1000);
                }
            }.start();
            return str;
        }
        if (str.contentEquals(digipassManagerHelper.f34947c)) {
            return str;
        }
        digipassManagerHelper.f34947c = str;
        CountDownTimer countDownTimer = digipassManagerHelper.f34945a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        digipassManagerHelper.f34945a = new CountDownTimer() { // from class: com.bbva.library.digipassmanager.helpers.DigipassManagerHelper$startTimer$1
            {
                super(30000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                DigipassManagerHelper.access$stopTimer(this.f34950a);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long time) {
                this.f34950a.f34946b = time / ((long) 1000);
            }
        }.start();
        return digipassManagerHelper.f34947c;
    }

    public final void activateTokenHash(@NotNull SecureSharing storage, @NotNull String secureChannelMessage, @NotNull String deviceId, @NotNull OnDigipassOperation callback) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(secureChannelMessage, "secureChannelMessage");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DigipassManager.INSTANCE.getInstance().activateTokenCrontoHash(storage, secureChannelMessage, deviceId, callback);
    }

    public final void deleteToken(@NotNull Context context, @NotNull OnDeleteTokenCronto callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new DigipassManager.TokenCrontoMaintenance(DigipassManager.INSTANCE.getInstance(), new SecureSharing(context), callback).delete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String generateOtp(@NotNull Context context, @NotNull String deviceId, @NotNull String challenge) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        SecureSharing secureSharing = new SecureSharing(context);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        if (deviceId.length() > 0) {
            DigipassManager.INSTANCE.getInstance().generateOtpTokenCronto(deviceId, challenge, secureSharing, new OnGenerateOtpOperation() { // from class: com.bbva.library.digipassmanager.helpers.DigipassManagerHelper.generateOtp.1
                /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, java.lang.String] */
                @Override // com.bbva.library.digipassmanager.callbacks.OnGenerateOtpOperation
                public void onGenerationComplete(@NotNull JSONObject responseComplete) throws JSONException {
                    Intrinsics.checkNotNullParameter(responseComplete, "responseComplete");
                    if (responseComplete.getString(DigipassManagerConstants.KEY_OPERATION_CODE).equals(DigipassManagerConstants.OPERATION_CODE_GENERATE_OTP)) {
                        ?? string = responseComplete.getString(DigipassManagerConstants.KEY_RESPONSE);
                        Intrinsics.checkNotNullExpressionValue(string, "responseComplete.getStri…erConstants.KEY_RESPONSE)");
                        Ref.ObjectRef<String> objectRef2 = objectRef;
                        objectRef2.element = string;
                        DigipassManagerHelper.access$validateOtp(this, objectRef2.element);
                    }
                }

                @Override // com.bbva.library.digipassmanager.callbacks.OnGenerateOtpOperation
                public void onGenerationFailure(@NotNull JSONObject responseFailure) {
                    Intrinsics.checkNotNullParameter(responseFailure, "responseFailure");
                    if (responseFailure.getString(DigipassManagerConstants.KEY_OPERATION_CODE).equals(DigipassManagerConstants.OPERATION_CODE_GENERATE_OTP)) {
                        objectRef.element = "";
                    }
                }
            });
        } else {
            objectRef.element = "";
        }
        return (String) objectRef.element;
    }

    @NotNull
    public final Class<? extends Activity> getQRCodeScannerTarget() {
        return new DigipassManager.TokenCrontoQRScanner(DigipassManager.INSTANCE.getInstance()).getQRCodeScannerTarget();
    }

    /* JADX INFO: renamed from: getTimeRemaining, reason: from getter */
    public final long getF34946b() {
        return this.f34946b;
    }

    public final void openQRScanner(@NotNull Activity activity, @NotNull ActivityResultLauncher<Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        new DigipassManager.TokenCrontoQRScanner(DigipassManager.INSTANCE.getInstance()).openScanner(activity, activityResultLauncher);
    }

    public final void validateTokenHash(@NotNull SecureSharing storage, @NotNull String secureChannelMessage, @NotNull String deviceId, @NotNull OnDigipassOperation callback) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(secureChannelMessage, "secureChannelMessage");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DigipassManager.INSTANCE.getInstance().validateTokenCrontoHash(storage, secureChannelMessage, deviceId, callback);
    }
}
