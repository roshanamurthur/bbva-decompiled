package com.salesforce.marketingcloud.messages.iam;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.salesforce.marketingcloud.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
class b extends d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64647a;

        static {
            int[] iArr = new int[InAppMessage.Size.values().length];
            f64647a = iArr;
            try {
                iArr[InAppMessage.Size.l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64647a[InAppMessage.Size.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64647a[InAppMessage.Size.s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(View.OnClickListener onClickListener, @Nullable Typeface typeface) {
        super(onClickListener, typeface);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public float a(Resources resources) {
        return resources.getDimension(R.dimen.mcsdk_iam_banner_closebtn_hitbox_increase);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public float b(Resources resources) {
        return resources.getDimension(R.dimen.mcsdk_button_group_horizontal_divider);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public float c(Resources resources) {
        return resources.getDimension(R.dimen.mcsdk_button_group_vertical_divider);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public int d() {
        return R.id.mcsdk_iam_media;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public int e() {
        return R.id.mcsdk_iam_media;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public int f() {
        return R.id.mcsdk_iam_container;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public int g() {
        return R.id.mcsdk_iam_parent;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public int h() {
        return R.id.mcsdk_iam_title;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public float a(Resources resources, InAppMessage.Size size) {
        int i10;
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        int i11 = a.f64647a[size.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? R.dimen.mcsdk_iam_banner_body_font_small : R.dimen.mcsdk_iam_banner_body_font_medium;
        } else {
            i10 = R.dimen.mcsdk_iam_banner_body_font_large;
        }
        return resources.getDimension(i10);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public float b(Resources resources, InAppMessage.Size size) {
        int i10;
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        int i11 = a.f64647a[size.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? R.dimen.mcsdk_iam_banner_btn_font_small : R.dimen.mcsdk_iam_banner_btn_font_medium;
        } else {
            i10 = R.dimen.mcsdk_iam_banner_btn_font_large;
        }
        return resources.getDimension(i10);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public float c(Resources resources, InAppMessage.Size size) {
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        int i10 = a.f64647a[size.ordinal()];
        return resources.getDimension((i10 == 1 || i10 == 2) ? R.dimen.mcsdk_iam_banner_title_font_large : R.dimen.mcsdk_iam_banner_title_font_small);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public int a() {
        return R.id.mcsdk_iam_body;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public int b() {
        return R.id.mcsdk_iam_buttons;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public int c() {
        return R.id.mcsdk_iam_close;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public void a(View view, InAppMessage.ButtonConfig buttonConfig, List<InAppMessage.Button> list) {
        super.a(view, InAppMessage.ButtonConfig.twoUp, list);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public void b(@NonNull View view, @NonNull k kVar) {
        ConstraintLayout constraintLayout;
        super.b(view, kVar);
        InAppMessage inAppMessageD = kVar.d();
        if (inAppMessageD.closeButton() == null || d.a(inAppMessageD.title()) || (constraintLayout = (ConstraintLayout) view.findViewById(f())) == null) {
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.connect(a(), 7, c(), 6);
        constraintSet.applyTo(constraintLayout);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public void a(View view, String str) {
    }
}
