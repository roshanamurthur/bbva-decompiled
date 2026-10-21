package com.salesforce.marketingcloud.messages.iam;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.salesforce.marketingcloud.R;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IamFullscreenActivity extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    protected View f64632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f64633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InAppMessage f64634h;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f64636b;

        static {
            int[] iArr = new int[InAppMessage.Type.values().length];
            f64636b = iArr;
            try {
                iArr[InAppMessage.Type.full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64636b[InAppMessage.Type.fullImageFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[InAppMessage.LayoutOrder.values().length];
            f64635a = iArr2;
            try {
                iArr2[InAppMessage.LayoutOrder.ImageTitleBody.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64635a[InAppMessage.LayoutOrder.TitleImageBody.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private int a(InAppMessage inAppMessage) {
        int i10 = R.layout.mcsdk_iam_full_inset_itb;
        int i11 = a.f64636b[inAppMessage.type().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return i10;
            }
            return (inAppMessage.media() == null || inAppMessage.media().size() != InAppMessage.Media.ImageSize.e2e) ? R.layout.mcsdk_iam_fif_inset_itb : R.layout.mcsdk_iam_fif_e2e_itb;
        }
        int i12 = a.f64635a[inAppMessage.layoutOrder().ordinal()];
        if (i12 == 1) {
            return (inAppMessage.media() == null || inAppMessage.media().size() != InAppMessage.Media.ImageSize.e2e) ? i10 : R.layout.mcsdk_iam_full_e2e_itb;
        }
        if (i12 != 2) {
            return i10;
        }
        return (inAppMessage.media() == null || inAppMessage.media().size() != InAppMessage.Media.ImageSize.e2e) ? R.layout.mcsdk_iam_full_inset_tib : R.layout.mcsdk_iam_full_e2e_tib;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f
    public /* bridge */ /* synthetic */ void b(InAppMessage.Button button) {
        super.b(button);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, android.app.Activity
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, android.view.View.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        k kVar;
        super.onConfigurationChanged(configuration);
        InAppMessage inAppMessage = this.f64634h;
        if (inAppMessage == null || inAppMessage.type() != InAppMessage.Type.fullImageFill || configuration.orientation != 2 || (kVar = this.f64633g) == null) {
            return;
        }
        kVar.a(j.a(kVar.c(), this.f64633g.b()));
        finish();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (isFinishing()) {
            return;
        }
        this.f64632f = findViewById(android.R.id.content);
        k kVarC = c();
        this.f64633g = kVarC;
        InAppMessage inAppMessageD = kVarC.d();
        this.f64634h = inAppMessageD;
        setContentView(a(inAppMessageD));
        new e(this, this.f64633g.k()).a(this.f64632f, this.f64633g);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        View view = this.f64632f;
        if (view != null) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
        }
        super.onDestroy();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public /* bridge */ /* synthetic */ void onDismissed() {
        super.onDismissed();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public /* bridge */ /* synthetic */ void onSwipeStarted() {
        super.onSwipeStarted();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public /* bridge */ /* synthetic */ void onViewSettled() {
        super.onViewSettled();
    }
}
