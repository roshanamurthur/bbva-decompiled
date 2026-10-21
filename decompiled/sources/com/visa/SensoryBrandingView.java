package com.visa;

import a.s1v3;
import a.str1;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Insets;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import android.widget.RelativeLayout;
import androidx.core.graphics.ColorUtils;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.visa.internal.CheckmarkElement;
import com.visa.internal.LogoElement;
import com.visa.internal.a;
import com.visa.internal.irts6;
import com.visa.internal.mast2;
import com.visa.internal.tsam7;
import com.visa.internal.v1s;
import com.visa.internal.vsb2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import mk.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010<\u001a\u00020;\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J1\u0010\u000e\u001a\u00020\u00052)\u0010\r\u001a%\u0012\u001b\u0012\u0019\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\u0007R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR*\u0010*\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006A"}, d2 = {"Lcom/visa/SensoryBrandingView;", "Landroid/widget/RelativeLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Lkotlin/Function1;", "Ljava/lang/Error;", "Lkotlin/Error;", "Lkotlin/ParameterName;", "name", "result", "completion", "animate", "value", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getBackdropColor", "()I", "setBackdropColor", "(I)V", "backdropColor", "", "e", "Z", "getSoundEnabled", "()Z", "setSoundEnabled", "(Z)V", "soundEnabled", "f", "getHapticEnabled", "setHapticEnabled", "hapticEnabled", "Lcom/visa/CheckmarkMode;", "g", "Lcom/visa/CheckmarkMode;", "getCheckmarkMode", "()Lcom/visa/CheckmarkMode;", "setCheckmarkMode", "(Lcom/visa/CheckmarkMode;)V", "checkmarkMode", "Lcom/visa/CheckmarkTextOption;", "h", "Lcom/visa/CheckmarkTextOption;", "getCheckmarkText", "()Lcom/visa/CheckmarkTextOption;", "setCheckmarkText", "(Lcom/visa/CheckmarkTextOption;)V", "checkmarkText", "", "i", "Ljava/lang/String;", "getLanguageCode", "()Ljava/lang/String;", "setLanguageCode", "(Ljava/lang/String;)V", "languageCode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "visa-sensory-branding_release"}, k = 1, mv = {1, 8, 0})
public final class SensoryBrandingView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int backdropColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean soundEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean hapticEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public CheckmarkMode checkmarkMode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public CheckmarkTextOption checkmarkText;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public String languageCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f68002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LogoElement f68003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CheckmarkElement f68004l;
    public final a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vsb2 f68005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final tsam7[] f68006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f68007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mast2 f68008q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SensoryBrandingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67993a = "Previous animation still in progress, cannot start a new animation.";
        this.f67994b = "Invalid background color selected, contrast levels are below 3:1 against #FFFFFF and #1434CB.";
        this.f67995c = "Alpha channel is not supported for backdrop color.";
        this.backdropColor = -1;
        this.soundEnabled = true;
        this.hapticEnabled = true;
        this.checkmarkMode = CheckmarkMode.CHECKMARK_WITH_TEXT;
        this.checkmarkText = CheckmarkTextOption.COMPLETE;
        this.languageCode = "en";
        a aVar = new a();
        this.m = aVar;
        vsb2 vsb2Var = new vsb2();
        this.f68005n = vsb2Var;
        this.f68007p = new AtomicBoolean(false);
        this.f68008q = new mast2(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sensory_branding, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.backdrop_canvas);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.backdrop_canvas)");
        this.f68002j = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.logo_group);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "rootView.findViewById(R.id.logo_group)");
        LogoElement logoElement = (LogoElement) viewFindViewById2;
        this.f68003k = logoElement;
        View viewFindViewById3 = viewInflate.findViewById(R.id.checkmark_group);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "rootView.findViewById(R.id.checkmark_group)");
        CheckmarkElement checkmarkElement = (CheckmarkElement) viewFindViewById3;
        this.f68004l = checkmarkElement;
        this.f68006o = new tsam7[]{logoElement, checkmarkElement, aVar, vsb2Var};
        a();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "this.baseContext");
        return a(baseContext);
    }

    public final void animate(Function1<? super Error, Unit> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (this.f68007p.get()) {
            completion.invoke(new Error(this.f67993a));
            return;
        }
        this.f68007p.set(true);
        String strA = a();
        if (true ^ l.isBlank(strA)) {
            completion.invoke(new Error(strA));
            return;
        }
        for (tsam7 tsam7Var : this.f68006o) {
            tsam7Var.a();
        }
        LogoElement logoElement = this.f68003k;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        logoElement.a(context, new s1v3(this, completion));
        a aVar = this.m;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        aVar.a(context2, null);
        vsb2 vsb2Var = this.f68005n;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        vsb2Var.a(context3, null);
    }

    public final int getBackdropColor() {
        return this.backdropColor;
    }

    public final CheckmarkMode getCheckmarkMode() {
        return this.checkmarkMode;
    }

    public final CheckmarkTextOption getCheckmarkText() {
        return this.checkmarkText;
    }

    public final boolean getHapticEnabled() {
        return this.hapticEnabled;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final boolean getSoundEnabled() {
        return this.soundEnabled;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iWidth;
        double d2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Activity activityA = a(context);
        if (activityA == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = activityA.getWindowManager().getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "activity.windowManager.currentWindowMetrics");
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
            iWidth = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activityA.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            iWidth = displayMetrics.widthPixels;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        double d3 = iWidth;
        double d7 = 0.6d * d3 * 1.38d;
        double d10 = d3 * 0.2d * 1.38d;
        double d11 = size;
        if (d11 > d7) {
            size = c.roundToInt(d7);
        } else if (d11 < d10) {
            size = c.roundToInt(d10);
        }
        int i10 = str1.f139a[this.checkmarkMode.ordinal()];
        if (i10 == 1) {
            d2 = 1.0d;
        } else if (i10 == 2) {
            d2 = 1.6d;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d2 = 2.5d;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (((double) size) * 0.3197879858657244d * d2 * 0.724d), 1073741824));
    }

    public final void setBackdropColor(int i10) {
        this.backdropColor = i10;
        a();
    }

    public final void setCheckmarkMode(CheckmarkMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.checkmarkMode = value;
        requestLayout();
    }

    public final void setCheckmarkText(CheckmarkTextOption checkmarkTextOption) {
        Intrinsics.checkNotNullParameter(checkmarkTextOption, "<set-?>");
        this.checkmarkText = checkmarkTextOption;
    }

    public final void setHapticEnabled(boolean z10) {
        this.hapticEnabled = z10;
    }

    public final void setLanguageCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.languageCode = str;
    }

    public final void setSoundEnabled(boolean z10) {
        this.soundEnabled = z10;
    }

    public final String a() {
        Integer numValueOf;
        if (Color.alpha(this.backdropColor) != 255) {
            return this.f67995c;
        }
        int i10 = this.backdropColor;
        int i11 = v1s.f68045a;
        double dCalculateContrast = ColorUtils.calculateContrast(-1, i10);
        double dCalculateContrast2 = ColorUtils.calculateContrast(i11, i10);
        if (dCalculateContrast > 3.0d || dCalculateContrast2 > 3.0d) {
            if (dCalculateContrast > dCalculateContrast2) {
                i11 = -1;
            }
            numValueOf = Integer.valueOf(i11);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return this.f67994b;
        }
        int iIntValue = numValueOf.intValue();
        this.f68002j.setBackgroundColor(this.backdropColor);
        irts6 irts6Var = new irts6(this.backdropColor, iIntValue, this.soundEnabled, this.hapticEnabled, this.checkmarkMode, this.checkmarkText, this.languageCode, this.f68008q);
        irts6Var.toString();
        for (tsam7 tsam7Var : this.f68006o) {
            tsam7Var.a(irts6Var);
        }
        return "";
    }
}
