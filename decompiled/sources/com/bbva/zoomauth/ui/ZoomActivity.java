package com.bbva.zoomauth.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bbva.zoomauth.R;
import com.bbva.zoomauth.facialauth.AuxCache;
import com.bbva.zoomauth.facialauth.FacialAuthCallback;
import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import com.bbva.zoomauth.facialauth.ResponseDataUtil;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.facetec.sdk.FaceTecSDKStatus;
import com.facetec.sdk.FaceTecSessionStatus;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ZoomActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u001a\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016¨\u0006\u001a"}, d2 = {"Lcom/bbva/zoomauth/ui/ZoomActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/bbva/zoomauth/facialauth/FacialAuthCallback;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onFacialBiometricGenericError", "Lcom/facetec/sdk/FaceTecSDKStatus;", "zoomSDKStatus", "onFaceTecStatusError", "Lcom/facetec/sdk/FaceTecSessionStatus;", "zoomVerificationStatus", "onFaceTecSessionStatusError", "onSDKFinishedLoading", "", "facialBiometricJson", "Landroid/graphics/Bitmap;", "picture", "onFacialBiometricSuccess", "onDeviceLockedOut", "onUserCancelled", "onBackPressed", "<init>", "()V", "Companion", "zoomauth_release"}, k = 1, mv = {1, 5, 1})
public final class ZoomActivity extends AppCompatActivity implements FacialAuthCallback {

    @NotNull
    public static final String DEVICE_LOCKED_OUT = "Locked out";

    @NotNull
    public static final String EXTRA_ZOOM_AUTH_RESULT = "Zoom_auth_result";
    public static final int IMAGE_QUALITY = 80;

    @NotNull
    public static final String USER_CANCELLED = "Cancelled";

    @NotNull
    public static final String USER_NAME = "userName";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public FacialAuthFragment f37794p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public String f37795q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f37796r0;

    public final void f(int i10, String str, boolean z10) {
        String json;
        Intent intent = new Intent();
        Gson gson = new Gson();
        if (z10) {
            json = gson.toJson(ResponseDataUtil.INSTANCE.getSuccessResponse());
            Intrinsics.checkNotNullExpressionValue(json, "{\n            gson.toJson(ResponseDataUtil.getSuccessResponse())\n        }");
        } else {
            json = gson.toJson(ResponseDataUtil.INSTANCE.getErrorResponse(str));
            Intrinsics.checkNotNullExpressionValue(json, "{\n            gson.toJson(ResponseDataUtil.getErrorResponse(detail))\n        }");
        }
        intent.putExtra(EXTRA_ZOOM_AUTH_RESULT, json);
        setResult(i10, intent);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        f(0, "Cancelled", false);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        Intent intent = getIntent();
        String string = null;
        if (intent != null && (extras2 = intent.getExtras()) != null) {
            string = extras2.getString("userName");
        }
        this.f37795q0 = string;
        Intent intent2 = getIntent();
        if (intent2 != null && (extras = intent2.getExtras()) != null && extras.getInt("requestCode", 0) == 99551244) {
            this.f37796r0 = true;
        }
        this.f37794p0 = new FacialAuthFragment(this.f37795q0);
        Bundle bundle = new Bundle();
        bundle.putBoolean(AuthConstants.EXTRA_KEY_FACIAL_AUTH_DATA, true ^ this.f37796r0);
        FacialAuthFragment facialAuthFragment = this.f37794p0;
        Intrinsics.checkNotNull(facialAuthFragment);
        facialAuthFragment.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "fragmentManager.beginTransaction()");
        int i10 = R.id.parentLayoutFacial;
        FacialAuthFragment facialAuthFragment2 = this.f37794p0;
        Intrinsics.checkNotNull(facialAuthFragment2);
        fragmentTransactionBeginTransaction.add(i10, facialAuthFragment2).commit();
    }

    @Override // com.bbva.zoomauth.facialauth.FacialAuthCallback
    public void onDeviceLockedOut() {
        f(-1, DEVICE_LOCKED_OUT, false);
    }

    @Override // com.bbva.zoomauth.facialauth.FacialAuthCallback
    public void onFaceTecSessionStatusError(@Nullable FaceTecSessionStatus zoomVerificationStatus) {
        f(-1, String.valueOf(zoomVerificationStatus), false);
    }

    @Override // com.bbva.zoomauth.facialauth.FacialAuthCallback
    public void onFaceTecStatusError(@Nullable FaceTecSDKStatus zoomSDKStatus) {
        f(-1, String.valueOf(zoomSDKStatus), false);
    }

    @Override // com.bbva.zoomauth.facialauth.FacialAuthCallback
    public void onFacialBiometricGenericError() {
        f(-1, null, false);
    }

    @Override // com.bbva.zoomauth.facialauth.FacialAuthCallback
    public void onFacialBiometricSuccess(@NotNull String facialBiometricJson, @Nullable Bitmap picture) {
        Intrinsics.checkNotNullParameter(facialBiometricJson, "facialBiometricJson");
        AuxCache auxCache = AuxCache.INSTANCE;
        auxCache.setSUCCESS_FACIAL_AUTH_DATA(facialBiometricJson);
        if (this.f37796r0 && picture != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            picture.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "byteArrayOutputStream.toByteArray()");
            String strEncodeToString = Base64.encodeToString(byteArray, 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(byteArray, Base64.DEFAULT)");
            auxCache.setSUCCESS_BASE_64_DATA(strEncodeToString);
        }
        f(-1, null, true);
    }

    @Override // com.bbva.zoomauth.facialauth.FacialAuthCallback
    public void onSDKFinishedLoading() {
        FacialAuthFragment facialAuthFragment = this.f37794p0;
        if (facialAuthFragment == null) {
            return;
        }
        facialAuthFragment.launchFacialSDK();
    }

    @Override // com.bbva.zoomauth.facialauth.FacialAuthCallback
    public void onUserCancelled() {
        f(0, "Cancelled", false);
    }
}
