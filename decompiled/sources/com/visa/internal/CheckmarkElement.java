package com.visa.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.s1;
import androidx.camera.core.p;
import androidx.camera.core.w0;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.TextViewCompat;
import bk.q;
import com.visa.CheckmarkMode;
import com.visa.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/visa/internal/CheckmarkElement;", "Landroid/widget/LinearLayout;", "Lcom/visa/internal/tsam7;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "visa-sensory-branding_release"}, k = 1, mv = {1, 8, 0})
public final class CheckmarkElement extends LinearLayout implements tsam7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f68009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f68010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f68011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Space f68012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Space f68013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public irts6 f68014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f68015g;

    public CheckmarkElement(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68015g = q.mapOf(TuplesKt.to("noto_sans_arabic", Integer.valueOf(R.font.noto_sans_arabic)), TuplesKt.to("noto_sans_georgian", Integer.valueOf(R.font.noto_sans_georgian)), TuplesKt.to("noto_sans_hebrew", Integer.valueOf(R.font.noto_sans_hebrew)), TuplesKt.to("noto_sans_japanese", Integer.valueOf(R.font.noto_sans_japanese)), TuplesKt.to("noto_sans_khmer", Integer.valueOf(R.font.noto_sans_khmer)), TuplesKt.to("noto_sans_korean", Integer.valueOf(R.font.noto_sans_korean)), TuplesKt.to("noto_sans_simplified_chinese", Integer.valueOf(R.font.noto_sans_simplified_chinese)), TuplesKt.to("noto_sans_thai", Integer.valueOf(R.font.noto_sans_thai)), TuplesKt.to("noto_sans_traditional_chinese", Integer.valueOf(R.font.noto_sans_traditional_chinese)), TuplesKt.to("visa_font", Integer.valueOf(R.font.visa_font)));
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.checkmark_layer, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.checkmark_tick);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.checkmark_tick)");
        this.f68009a = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.checkmark_space);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "rootView.findViewById(R.id.checkmark_space)");
        this.f68010b = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.checkmark_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "rootView.findViewById(R.id.checkmark_text)");
        TextView textView = (TextView) viewFindViewById3;
        this.f68011c = textView;
        View viewFindViewById4 = viewInflate.findViewById(R.id.checkmark_top_spacer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "rootView.findViewById(R.id.checkmark_top_spacer)");
        this.f68012d = (Space) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.checkmark_bottom_spacer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "rootView.findViewById(R.….checkmark_bottom_spacer)");
        this.f68013e = (Space) viewFindViewById5;
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, 1, 2048, 1, 1);
        setOrientation(1);
        setVisibility(8);
    }

    public static final void b(CheckmarkElement this$0, Function0 function0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.visa.internal.tsam7
    public final void a(irts6 config) {
        LinearLayout.LayoutParams layoutParams;
        float f6;
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68014f = config;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(config.f68031b);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(config.foregroundColor)");
        this.f68009a.setImageTintList(colorStateListValueOf);
        this.f68011c.setTextColor(config.f68031b);
        mast2 mast2Var = config.f68037h;
        String code = config.f68036g;
        mast2Var.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        ama3 ama3Var = (ama3) mast2Var.f68040a.get(code);
        if (ama3Var == null) {
            mast2 mast2Var2 = config.f68037h;
            mast2Var2.getClass();
            Intrinsics.checkNotNullParameter("en", "code");
            ama3Var = (ama3) mast2Var2.f68040a.get("en");
            Intrinsics.checkNotNull(ama3Var);
        }
        this.f68011c.setText(config.f68035f.getMapValue().get(ama3Var.f68028e));
        Integer num = (Integer) this.f68015g.get(ama3Var.f68026c);
        if (num != null) {
            this.f68011c.setTypeface(ResourcesCompat.getFont(getContext(), num.intValue()));
        }
        if (Intrinsics.areEqual(config.f68036g, "ar")) {
            ViewGroup.LayoutParams layoutParams2 = this.f68010b.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams2).weight = 6.0f;
            ViewGroup.LayoutParams layoutParams3 = this.f68011c.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            layoutParams = (LinearLayout.LayoutParams) layoutParams3;
            f6 = 60.0f;
        } else {
            ViewGroup.LayoutParams layoutParams4 = this.f68010b.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams4).weight = 20.0f;
            ViewGroup.LayoutParams layoutParams5 = this.f68011c.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            layoutParams = (LinearLayout.LayoutParams) layoutParams5;
            f6 = 46.0f;
        }
        layoutParams.weight = f6;
    }

    public final void a(Context context, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        post(new p(this, function0, 3));
    }

    public static final void a(CheckmarkElement this$0, Function0 function0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.announceForAccessibility(this$0.f68011c.getText());
        irts6 irts6Var = this$0.f68014f;
        if (irts6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            irts6Var = null;
        }
        if (irts6Var.f68034e != CheckmarkMode.NONE) {
            this$0.a(function0);
            return;
        }
        this$0.a();
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.visa.internal.tsam7
    public final void a() {
        setVisibility(8);
        this.f68009a.setVisibility(8);
        this.f68010b.setVisibility(8);
        this.f68011c.setVisibility(8);
    }

    public final void a(Function0 function0) {
        setVisibility(0);
        post(new s1(this, 8));
        postDelayed(new w0(this, function0, 2), 667L);
    }

    public static final void a(CheckmarkElement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        irts6 irts6Var = this$0.f68014f;
        if (irts6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            irts6Var = null;
        }
        if (irts6Var.f68034e == CheckmarkMode.CHECKMARK) {
            this$0.f68010b.setVisibility(8);
            this$0.f68011c.setVisibility(8);
            this$0.f68012d.setVisibility(8);
            this$0.f68013e.setVisibility(8);
        } else {
            this$0.f68010b.setVisibility(0);
            this$0.f68011c.setVisibility(0);
            this$0.f68012d.setVisibility(0);
            this$0.f68013e.setVisibility(0);
        }
        this$0.f68009a.setVisibility(0);
    }
}
