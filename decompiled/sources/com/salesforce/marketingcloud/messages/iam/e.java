package com.salesforce.marketingcloud.messages.iam;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.R;

/* JADX INFO: loaded from: classes11.dex */
class e extends d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64659a;

        static {
            int[] iArr = new int[InAppMessage.Size.values().length];
            f64659a = iArr;
            try {
                iArr[InAppMessage.Size.l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64659a[InAppMessage.Size.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64659a[InAppMessage.Size.s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(View.OnClickListener onClickListener, @Nullable Typeface typeface) {
        super(onClickListener, typeface);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public float a(Resources resources) {
        return resources.getDimension(R.dimen.mcsdk_iam_fs_closebtn_hitbox_increase);
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
        return R.id.mcsdk_iam_media_group;
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
        return 0;
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
        int i11 = a.f64659a[size.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? R.dimen.mcsdk_iam_fs_body_font_small : R.dimen.mcsdk_iam_fs_body_font_medium;
        } else {
            i10 = R.dimen.mcsdk_iam_fs_body_font_large;
        }
        return resources.getDimension(i10);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public float b(Resources resources, InAppMessage.Size size) {
        int i10;
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        int i11 = a.f64659a[size.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? R.dimen.mcsdk_iam_fs_btn_font_small : R.dimen.mcsdk_iam_fs_btn_font_medium;
        } else {
            i10 = R.dimen.mcsdk_iam_fs_btn_font_large;
        }
        return resources.getDimension(i10);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public float c(Resources resources, InAppMessage.Size size) {
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        int i10 = a.f64659a[size.ordinal()];
        return resources.getDimension((i10 == 1 || i10 == 2) ? R.dimen.mcsdk_iam_fs_title_font_large : R.dimen.mcsdk_iam_fs_title_font_small);
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
    public void a(View view, String str) {
    }

    @Override // com.salesforce.marketingcloud.messages.iam.d
    public void a(View view, String str, String str2, InAppMessage.Size size, InAppMessage.Size size2) {
        View viewFindViewById = view.findViewById(f());
        if (str == null || viewFindViewById == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(g.a(view.getContext(), str, R.color.mcsdk_iam_default_message_background));
    }
}
