package com.bbva.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ui.R;
import com.bbva.ui.utils.TypefaceManager;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BbvaTextView.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bbva/ui/widget/BbvaTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/text/SpannableString;", "spannableString", "", "setSizeSpans", "", "text", "setParagraphText", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBbvaTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BbvaTextView.kt\ncom/bbva/ui/widget/BbvaTextView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n13309#2,2:100\n1855#3,2:102\n*S KotlinDebug\n*F\n+ 1 BbvaTextView.kt\ncom/bbva/ui/widget/BbvaTextView\n*L\n69#1:100,2\n91#1:102,2\n*E\n"})
public final class BbvaTextView extends AppCompatTextView {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(BbvaTextView bbvaTextView, Context context, AttributeSet attributeSet, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        bbvaTextView.getClass();
        Resources.Theme theme = context.getTheme();
        TypefaceManager.Companion companion = TypefaceManager.INSTANCE;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, companion.getATTRS(), i10, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CustomTextView_paragraph, false);
        if (!bbvaTextView.isInEditMode()) {
            companion.applyTypeface(bbvaTextView, typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z10) {
            bbvaTextView.setParagraphText(bbvaTextView.getText());
        }
    }

    private final void setSizeSpans(SpannableString spannableString) {
        Iterator it = StringsKt__StringsKt.split$default((CharSequence) spannableString, new String[]{"\n\n"}, false, 0, 6, (Object) null).iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((String) it.next()).length() + 2;
            if (length < spannableString.length()) {
                spannableString.setSpan(new RelativeSizeSpan(0.3f), length - 1, length, 33);
            }
        }
    }

    public final void setParagraphText(@Nullable CharSequence text) {
        String strReplace;
        if (text == null || (strReplace = new Regex(RootService.LINE_BREAK).replace(text, "\n\n")) == null) {
            strReplace = "";
        }
        SpannableString spannableString = new SpannableString(strReplace);
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            Intrinsics.checkNotNull(characterStyleArr);
            for (CharacterStyle characterStyle : characterStyleArr) {
                int spanStart = spanned.getSpanStart(characterStyle);
                int spanEnd = spanned.getSpanEnd(characterStyle);
                int spanFlags = spanned.getSpanFlags(characterStyle);
                String string = spanned.subSequence(0, spanStart).toString();
                int length = string.length() - l.replace$default(string, RootService.LINE_BREAK, "", false, 4, (Object) null).length();
                String string2 = spanned.subSequence(spanStart, spanEnd).toString();
                spannableString.setSpan(characterStyle, spanStart + length, spanEnd + length + (string2.length() - l.replace$default(string2, RootService.LINE_BREAK, "", false, 4, (Object) null).length()), spanFlags);
            }
        }
        setSizeSpans(spannableString);
        setText(spannableString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        a(this, context, attrs, 0, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaTextView(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        a(this, context, attrs, i10, 8);
    }
}
