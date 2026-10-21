package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.R;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IamModalActivity extends f {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64637a;

        static {
            int[] iArr = new int[InAppMessage.LayoutOrder.values().length];
            f64637a = iArr;
            try {
                iArr[InAppMessage.LayoutOrder.ImageTitleBody.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64637a[InAppMessage.LayoutOrder.TitleImageBody.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public int a(InAppMessage inAppMessage) {
        int i10 = R.layout.mcsdk_iam_modal_inset_itb;
        InAppMessage.Media media = inAppMessage.media();
        int i11 = a.f64637a[inAppMessage.layoutOrder().ordinal()];
        if (i11 == 1) {
            return (media == null || media.size() != InAppMessage.Media.ImageSize.e2e) ? i10 : R.layout.mcsdk_iam_modal_e2e_itb;
        }
        if (i11 != 2) {
            return i10;
        }
        return (media == null || media.size() != InAppMessage.Media.ImageSize.e2e) ? R.layout.mcsdk_iam_modal_inset_tib : R.layout.mcsdk_iam_modal_e2e_tib;
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

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (isFinishing()) {
            return;
        }
        setContentView(a(c().d()));
        new l(this, c().k()).a(findViewById(android.R.id.content), c());
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
