package com.salesforce.marketingcloud.messages.iam;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.salesforce.marketingcloud.R;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.media.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f64651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Typeface f64652b;

    public class a implements Comparator<InAppMessage.Button> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(InAppMessage.Button button, InAppMessage.Button button2) {
            return button.index() - button2.index();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f64654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f64655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f64656c;

        public b(View view, int i10, View view2) {
            this.f64654a = view;
            this.f64655b = i10;
            this.f64656c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            this.f64654a.getHitRect(rect);
            int i10 = rect.top;
            int i11 = this.f64655b;
            rect.top = i10 - i11;
            rect.left -= i11;
            rect.bottom += i11;
            rect.right += i11;
            this.f64656c.setTouchDelegate(new TouchDelegate(rect, this.f64654a));
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64658a;

        static {
            int[] iArr = new int[InAppMessage.Size.values().length];
            f64658a = iArr;
            try {
                iArr[InAppMessage.Size.l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64658a[InAppMessage.Size.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64658a[InAppMessage.Size.s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(View.OnClickListener onClickListener, @Nullable Typeface typeface) {
        this.f64651a = onClickListener;
        this.f64652b = typeface;
    }

    @Dimension
    private float a(Context context, InAppMessage.Size size) {
        int i10;
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        Resources resources = context.getResources();
        int i11 = c.f64658a[size.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? R.dimen.mcsdk_border_width_small : R.dimen.mcsdk_border_width_medium;
        } else {
            i10 = R.dimen.mcsdk_border_width_large;
        }
        return resources.getDimension(i10);
    }

    @Dimension
    private float b(Context context, InAppMessage.Size size) {
        int i10;
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        Resources resources = context.getResources();
        int i11 = c.f64658a[size.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? R.dimen.mcsdk_corner_radius_small : R.dimen.mcsdk_corner_radius_medium;
        } else {
            i10 = R.dimen.mcsdk_corner_radius_large;
        }
        return resources.getDimension(i10);
    }

    @Dimension
    public abstract float a(Resources resources);

    @Dimension
    public abstract float a(Resources resources, InAppMessage.Size size);

    @IdRes
    public abstract int a();

    @Dimension
    public abstract float b(Resources resources);

    @Dimension
    public abstract float b(Resources resources, InAppMessage.Size size);

    @IdRes
    public abstract int b();

    @Dimension
    public abstract float c(Resources resources);

    @Dimension
    public abstract float c(Resources resources, InAppMessage.Size size);

    @IdRes
    public abstract int c();

    @IdRes
    public abstract int d();

    @IdRes
    public abstract int e();

    @IdRes
    public abstract int f();

    @IdRes
    public abstract int g();

    @IdRes
    public abstract int h();

    private void a(View view) {
        if (view == null) {
            return;
        }
        View view2 = (View) view.getParent();
        view2.post(new b(view, Math.round(a(view.getContext().getResources())), view2));
    }

    private void b(View view, InAppMessage.TextField textField) {
        TextView textView = (TextView) view.findViewById(h());
        if (textView == null) {
            return;
        }
        if (!a(textField)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Typeface typeface = this.f64652b;
        if (typeface != null) {
            textView.setTypeface(typeface, 1);
        }
        g.a(textView, textField.text(), g.a(view.getContext(), textField.fontColor(), R.color.mcsdk_iam_default_font_color), c(view.getContext().getResources(), textField.fontSize()), g.a(textField.alignment()));
    }

    private void a(View view, o oVar, InAppMessage.Media media, InAppMessage.Type type) {
        ImageView imageView = (ImageView) view.findViewById(e());
        if (imageView == null) {
            return;
        }
        Context context = view.getContext();
        if (media == null) {
            View viewFindViewById = view.findViewById(d());
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
                return;
            } else {
                imageView.setVisibility(8);
                return;
            }
        }
        if (oVar != null) {
            imageView.setVisibility(0);
            t tVarD = oVar.b(media.url()).d();
            if (type == InAppMessage.Type.fullImageFill) {
                tVarD.b();
            } else {
                tVarD.a();
            }
            tVarD.a(b(context, media.cornerRadius()), a(context, media.borderWidth()), g.a(context, media.borderColor(), R.color.mcsdk_iam_default_border)).a(imageView);
        }
    }

    public void b(@NonNull View view, @NonNull k kVar) {
    }

    private void b(ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        space.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(c(viewGroup.getResources()))));
        viewGroup.addView(space);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public void a(View view, InAppMessage.ButtonConfig buttonConfig, List<InAppMessage.Button> list) {
        int i10;
        Context context = view.getContext();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(b());
        ?? r10 = 0;
        if (buttonConfig == InAppMessage.ButtonConfig.stacked) {
            linearLayout.setOrientation(1);
            i10 = R.layout.mcsdk_iam_stacked_button;
        } else {
            linearLayout.setOrientation(0);
            i10 = R.layout.mcsdk_iam_sbs_button;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int size = list.size();
        int i11 = 0;
        while (i11 < 2 && i11 < size) {
            InAppMessage.Button button = list.get(i11);
            Button button2 = (Button) layoutInflaterFrom.inflate(i10, linearLayout, (boolean) r10);
            Typeface typeface = this.f64652b;
            if (typeface != null) {
                button2.setTypeface(typeface, r10);
            }
            g.a(button2, button.text(), g.a(context, button.fontColor(), R.color.mcsdk_iam_default_font_color), b(context.getResources(), button.fontSize()), g.a(InAppMessage.Alignment.center));
            ViewCompat.setBackground(button2, g.a(g.a(context, button.backgroundColor(), R.color.mcsdk_iam_default_btn_background), b(context, button.cornerRadius()), g.a(context, button.borderColor(), R.color.mcsdk_iam_default_border), a(context, button.borderWidth())));
            button2.setTag(button);
            button2.setOnClickListener(this.f64651a);
            linearLayout.addView(button2);
            if (i11 == 0 && size > 1) {
                if (buttonConfig == InAppMessage.ButtonConfig.stacked) {
                    b(linearLayout);
                } else {
                    a((ViewGroup) linearLayout);
                }
            }
            i11++;
            r10 = 0;
        }
    }

    private void a(View view, InAppMessage.CloseButton closeButton) {
        ImageButton imageButton = (ImageButton) view.findViewById(c());
        if (imageButton == null) {
            return;
        }
        if (closeButton == null) {
            imageButton.setVisibility(8);
            return;
        }
        ViewCompat.setTranslationZ(imageButton, 1.0f);
        imageButton.setVisibility(0);
        imageButton.setTag(closeButton);
        imageButton.setOnClickListener(this.f64651a);
        a(imageButton);
    }

    private void a(View view, InAppMessage.TextField textField) {
        TextView textView = (TextView) view.findViewById(a());
        if (textView == null) {
            return;
        }
        if (!a(textField)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Typeface typeface = this.f64652b;
        if (typeface != null) {
            textView.setTypeface(typeface, 0);
        }
        g.a(textView, textField.text(), g.a(view.getContext(), textField.fontColor(), R.color.mcsdk_iam_default_font_color), a(view.getContext().getResources(), textField.fontSize()), g.a(textField.alignment()));
    }

    public void a(View view, k kVar) {
        if (kVar == null || view == null) {
            return;
        }
        InAppMessage inAppMessageD = kVar.d();
        a(view, inAppMessageD.windowColor());
        a(view, inAppMessageD.backgroundColor(), inAppMessageD.borderColor(), inAppMessageD.borderWidth(), inAppMessageD.cornerRadius());
        b(view, inAppMessageD.title());
        a(view, inAppMessageD.body());
        a(view, a(inAppMessageD) ? inAppMessageD.closeButton() : com.salesforce.marketingcloud.internal.a.a());
        List<InAppMessage.Button> listButtons = inAppMessageD.buttons();
        if (listButtons == null || listButtons.isEmpty()) {
            View viewFindViewById = view.findViewById(b());
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        } else {
            ArrayList arrayList = new ArrayList(listButtons);
            Collections.sort(arrayList, new a());
            a(view, inAppMessageD.buttonConfiguration(), arrayList);
        }
        a(view, kVar.e(), inAppMessageD.media(), inAppMessageD.type());
        b(view, kVar);
    }

    public void a(View view, @Nullable String str) {
        View viewFindViewById = view.findViewById(g());
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(g.a(view.getContext(), str, R.color.mcsdk_iam_default_window_background));
    }

    public void a(View view, String str, String str2, InAppMessage.Size size, InAppMessage.Size size2) {
        View viewFindViewById = view.findViewById(f());
        if (viewFindViewById == null) {
            return;
        }
        Context context = view.getContext();
        float fB = b(context, size2);
        float fA = a(context, size);
        ViewCompat.setBackground(viewFindViewById, g.a(g.a(context, str, R.color.mcsdk_iam_default_message_background), fB, g.a(context, str2, R.color.mcsdk_iam_default_border), fA));
        if (viewFindViewById instanceof ClippingConstraintLayout) {
            ((ClippingConstraintLayout) viewFindViewById).setClippingDetails(fA, fB);
        }
    }

    private void a(ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        space.setLayoutParams(new LinearLayout.LayoutParams(Math.round(b(viewGroup.getResources())), -1));
        viewGroup.addView(space);
    }

    public static boolean a(InAppMessage.TextField textField) {
        return (textField == null || TextUtils.isEmpty(textField.text())) ? false : true;
    }

    public static boolean a(InAppMessage inAppMessage) {
        return ((inAppMessage.type() == InAppMessage.Type.full || inAppMessage.type() == InAppMessage.Type.modal) && inAppMessage.closeButton() == null && (inAppMessage.buttons() == null || inAppMessage.buttons().isEmpty())) ? false : true;
    }
}
