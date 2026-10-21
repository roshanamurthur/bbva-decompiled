package com.viergegroup.sdk.taptophone.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.viergegroup.sdk.taptophone.DeviceNfcStatus;
import com.viergegroup.sdk.taptophone.R;
import com.viergegroup.sdk.taptophone.UtilsKt;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.SdkTapOnPhoneVierge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\u0007H\u0014J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/NfcErrorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "subtitleText", "Landroid/widget/TextView;", "titleText", "initUI", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "syncWithNfcStatus", "deviceNfcStatus", "Lcom/viergegroup/sdk/taptophone/DeviceNfcStatus;", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NfcErrorActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f67606p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f67607q0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceNfcStatus.values().length];
            try {
                iArr[DeviceNfcStatus.NO_NFC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceNfcStatus.NFC_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceNfcStatus.NFC_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nfc_error_activity);
        View viewFindViewById = findViewById(R.id.titleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.f67606p0 = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.subtitleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.f67607q0 = (TextView) viewFindViewById2;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Context context = SdkTapOnPhoneVierge.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i10 = WhenMappings.$EnumSwitchMapping$0[UtilsKt.deviceNfcStatus(context).ordinal()];
        TextView textView = null;
        if (i10 == 1) {
            TextView textView2 = this.f67606p0;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView2 = null;
            }
            textView2.setText("Unsupported device");
            TextView textView3 = this.f67607q0;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                textView = textView3;
            }
            textView.setText("This app requires NFC to run");
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            finish();
            return;
        }
        TextView textView4 = this.f67606p0;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView4 = null;
        }
        textView4.setText("NFC Disabled");
        TextView textView5 = this.f67607q0;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView = textView5;
        }
        textView.setText("Please enable NFC");
    }
}
