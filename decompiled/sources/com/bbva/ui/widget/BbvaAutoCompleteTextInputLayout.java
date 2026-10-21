package com.bbva.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ui.R;
import com.bbva.ui.extensions.ContextKt;
import com.bbva.ui.extensions.FloatKt;
import com.bbva.ui.widget.BbvaAutoCompleteTextInputLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import da.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lc.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BbvaAutoCompleteTextInputLayout.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00105\u001a\u00020\u0002\u0012\b\b\u0002\u00106\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J)\u0010\u0010\u001a\u00020\u00052!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\nJ+\u0010\u0013\u001a\u00020\u00052#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0018\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001b\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0011J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0002J\u0006\u0010%\u001a\u00020\u0005J#\u0010*\u001a\u00020\u0005\"\f\b\u0000\u0010(*\u00020&*\u00020'2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+J\u000e\u0010-\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020,J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0002H\u0002J\b\u00100\u001a\u00020\u0011H\u0002¨\u00069"}, d2 = {"Lcom/bbva/ui/widget/BbvaAutoCompleteTextInputLayout;", "Landroid/widget/FrameLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/view/View$OnClickListener;", "l", "setEditTextOnClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "hasFocus", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFocusChangedListener", "", "sequence", "setTextChangedListener", "Landroid/text/TextWatcher;", "textWatcher", "clearTextChangedListeners", "Lkotlin/Function0;", "setOnDoneKeyPressedListener", "hint", "setHint", "getText", "text", "setText", "clearText", "maxLength", "setMaxLength", "contentDescription", "setClearContentDescription", FirebaseAnalytics.Param.INDEX, "setSelection", "showDropDown", "Landroid/widget/ListAdapter;", "Landroid/widget/Filterable;", ExifInterface.GPS_DIRECTION_TRUE, "adapter", "setAdapter", "(Landroid/widget/ListAdapter;)V", "Landroid/widget/AdapterView$OnItemClickListener;", "setOnItemClickListener", "inputType", "setInputType", "getClearContentDescription", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBbvaAutoCompleteTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BbvaAutoCompleteTextInputLayout.kt\ncom/bbva/ui/widget/BbvaAutoCompleteTextInputLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,341:1\n1#2:342\n68#3,4:343\n40#3:347\n56#3:348\n75#3:349\n68#3,4:350\n40#3:354\n56#3:355\n75#3:356\n233#4,3:357\n*S KotlinDebug\n*F\n+ 1 BbvaAutoCompleteTextInputLayout.kt\ncom/bbva/ui/widget/BbvaAutoCompleteTextInputLayout\n*L\n88#1:343,4\n88#1:347\n88#1:348\n88#1:349\n100#1:350,4\n100#1:354\n100#1:355\n100#1:356\n112#1:357,3\n*E\n"})
public final class BbvaAutoCompleteTextInputLayout extends FrameLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f37650p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final TextView f37651q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final BbvaAutoCompleteTextView f37652r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ImageView f37653s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final View f37654t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public String f37655u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f37656w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public TextWatcher f37657x0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BbvaAutoCompleteTextInputLayout(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$onTextChanged(BbvaAutoCompleteTextInputLayout bbvaAutoCompleteTextInputLayout, CharSequence charSequence, boolean z10) {
        bbvaAutoCompleteTextInputLayout.getClass();
        int length = charSequence.length();
        ImageView imageView = bbvaAutoCompleteTextInputLayout.f37653s0;
        if (length == 0) {
            imageView.setClickable(false);
            imageView.animate().setDuration(150L).alpha(0.0f);
        } else {
            imageView.setClickable(true);
            if (z10) {
                imageView.animate().setDuration(150L).alpha(1.0f);
            }
        }
    }

    private final String getClearContentDescription() {
        String str = this.f37655u0;
        if (str != null) {
            return str;
        }
        String string = getContext().getString(R.string.ui_clear_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final void setInputType(int inputType) {
        BbvaAutoCompleteTextView bbvaAutoCompleteTextView = this.f37652r0;
        int selectionStart = bbvaAutoCompleteTextView.getSelectionStart();
        bbvaAutoCompleteTextView.setInputType(inputType);
        bbvaAutoCompleteTextView.setSelection(selectionStart);
    }

    public final void a() {
        Editable text;
        BbvaAutoCompleteTextView bbvaAutoCompleteTextView = this.f37652r0;
        boolean zHasFocus = bbvaAutoCompleteTextView.hasFocus();
        TextView textView = this.f37651q0;
        if (zHasFocus || !((text = bbvaAutoCompleteTextView.getText()) == null || text.length() == 0)) {
            textView.animate().setDuration(200L).translationY(-this.v0).scaleX(0.75f).scaleY(0.75f);
            bbvaAutoCompleteTextView.animate().setDuration(200L).translationY(this.f37656w0);
        } else {
            textView.animate().setDuration(200L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f);
            bbvaAutoCompleteTextView.animate().setDuration(200L).translationY(0.0f);
        }
    }

    public final void clearText() {
        this.f37652r0.setText("");
        a();
    }

    public final synchronized void clearTextChangedListeners() {
        this.f37652r0.removeTextChangedListener(this.f37657x0);
        this.f37657x0 = null;
    }

    @NotNull
    public final String getText() {
        return this.f37652r0.getText().toString();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.v0 == Float.MIN_VALUE) {
            TextView textView = this.f37651q0;
            this.v0 = textView.getMeasuredHeight() / 2.0f;
            textView.setPivotX(0.0f);
        }
        if (this.f37656w0 == Float.MIN_VALUE) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f37656w0 = FloatKt.toPx(4.0f, context);
            a();
        }
    }

    public final <T extends ListAdapter & Filterable> void setAdapter(@NotNull T adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f37652r0.setAdapter(adapter);
    }

    public final void setClearContentDescription(@NotNull String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f37655u0 = contentDescription;
        this.f37653s0.setContentDescription(contentDescription);
    }

    public final void setEditTextOnClickListener(@Nullable View.OnClickListener l6) {
        BbvaAutoCompleteTextView bbvaAutoCompleteTextView = this.f37652r0;
        bbvaAutoCompleteTextView.setFocusable(false);
        bbvaAutoCompleteTextView.setOnClickListener(l6);
    }

    public final void setHint(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f37651q0.setText(hint);
    }

    public final void setMaxLength(int maxLength) {
        if (maxLength > 0) {
            BbvaAutoCompleteTextView bbvaAutoCompleteTextView = this.f37652r0;
            InputFilter[] filters = bbvaAutoCompleteTextView.getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
            bbvaAutoCompleteTextView.setFilters((InputFilter[]) ArraysKt___ArraysJvmKt.plus((InputFilter.LengthFilter[]) filters, new InputFilter.LengthFilter(maxLength)));
        }
    }

    public final void setOnDoneKeyPressedListener(@NotNull final Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f37652r0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lc.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                int i11 = BbvaAutoCompleteTextInputLayout.$stable;
                Function0 listener2 = listener;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                if (i10 != 6) {
                    return false;
                }
                listener2.invoke();
                return true;
            }
        });
    }

    public final void setOnFocusChangedListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f37652r0.setOnFocusChangeListener(new c(this, listener, 0));
    }

    public final void setOnItemClickListener(@NotNull AdapterView.OnItemClickListener l6) {
        Intrinsics.checkNotNullParameter(l6, "l");
        this.f37652r0.setOnItemClickListener(l6);
    }

    public final void setSelection(int index) {
        this.f37652r0.setSelection(index);
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f37652r0.setText(text);
        a();
    }

    public final void setTextChangedListener(@Nullable final Function1<? super String, Unit> listener) {
        if (listener == null) {
            clearTextChangedListeners();
        } else {
            setTextChangedListener(new DefaultTextWatcher() { // from class: com.bbva.ui.widget.BbvaAutoCompleteTextInputLayout.setTextChangedListener.1
                @Override // com.bbva.ui.widget.DefaultTextWatcher, android.text.TextWatcher
                public void afterTextChanged(@NotNull Editable editable) {
                    Intrinsics.checkNotNullParameter(editable, "editable");
                    listener.invoke(editable.toString());
                }
            });
        }
    }

    public final void showDropDown() {
        this.f37652r0.showDropDown();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BbvaAutoCompleteTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BbvaAutoCompleteTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final synchronized void setTextChangedListener(@NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.f37652r0.addTextChangedListener(textWatcher);
        this.f37657x0 = textWatcher;
    }

    public /* synthetic */ BbvaAutoCompleteTextInputLayout(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BbvaAutoCompleteTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        ConstraintLayout constraintLayout;
        ImageView imageView;
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.v0 = Float.MIN_VALUE;
        this.f37656w0 = Float.MIN_VALUE;
        View.inflate(context, R.layout.ui_bbva_autocomplete_text_input_layout, this);
        View viewFindViewById = findViewById(R.id.constraintLayout);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById;
        constraintLayout2.setClipToOutline(true);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "apply(...)");
        this.f37650p0 = constraintLayout2;
        View viewFindViewById2 = findViewById(R.id.hintTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f37651q0 = textView;
        View viewFindViewById3 = findViewById(R.id.editText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        BbvaAutoCompleteTextView bbvaAutoCompleteTextView = (BbvaAutoCompleteTextView) viewFindViewById3;
        this.f37652r0 = bbvaAutoCompleteTextView;
        View viewFindViewById4 = findViewById(R.id.iconImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.clearImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView3 = (ImageView) viewFindViewById5;
        this.f37653s0 = imageView3;
        View viewFindViewById6 = findViewById(R.id.lineView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f37654t0 = viewFindViewById6;
        if (attributeSet == null) {
            constraintLayout = constraintLayout2;
            imageView = imageView3;
        } else {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.BbvaTextInputLayout);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            CharSequence text = typedArrayObtainStyledAttributes.getText(R.styleable.BbvaTextInputLayout_hint);
            this.f37655u0 = typedArrayObtainStyledAttributes.getString(R.styleable.BbvaTextInputLayout_clearContentDescription);
            textView.setText(text);
            bbvaAutoCompleteTextView.setMaxLines(1);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            constraintLayout = constraintLayout2;
            imageView = imageView3;
            ViewCompat.setAccessibilityDelegate(bbvaAutoCompleteTextView, new BbvaTextInputLayout.AccessibilityDelegate(context2, bbvaAutoCompleteTextView, textView, null, false, 0, 56, null));
            Unit unit = Unit.INSTANCE;
            typedArrayObtainStyledAttributes.recycle();
            if (isInEditMode()) {
                bbvaAutoCompleteTextView.setVisibility(8);
                imageView.setVisibility(8);
            }
        }
        imageView.setOnClickListener(new e(this, 2));
        imageView.setClickable(false);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        imageView.setColorFilter(ContextKt.themeColor(context3, R.attr.form_input_icon_default));
        imageView.setContentDescription(getClearContentDescription());
        imageView2.setAlpha(1.0f);
        imageView2.setVisibility(0);
        imageView2.setImageResource(R.drawable.ic_search);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        imageView2.setColorFilter(ContextKt.themeColor(context4, R.attr.form_input_icon_read_only));
        Context context5 = getRootView().getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        bbvaAutoCompleteTextView.setDropDownVerticalOffset((int) FloatKt.toPx(16.0f, context5));
        Context context6 = getRootView().getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        bbvaAutoCompleteTextView.setDropDownHorizontalOffset((int) FloatKt.toPx(-16.0f, context6));
        if (ViewCompat.isLaidOut(constraintLayout) && !constraintLayout.isLayoutRequested()) {
            this.f37652r0.setDropDownWidth(this.f37650p0.getWidth());
        } else {
            constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bbva.ui.widget.BbvaAutoCompleteTextInputLayout$special$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    BbvaAutoCompleteTextInputLayout bbvaAutoCompleteTextInputLayout = this.f37660a;
                    bbvaAutoCompleteTextInputLayout.f37652r0.setDropDownWidth(bbvaAutoCompleteTextInputLayout.f37650p0.getWidth());
                }
            });
        }
        bbvaAutoCompleteTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: lc.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                int i12 = BbvaAutoCompleteTextInputLayout.$stable;
                BbvaAutoCompleteTextInputLayout this$0 = this.f83174a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.a();
            }
        });
        bbvaAutoCompleteTextView.addTextChangedListener(new DefaultTextWatcher() { // from class: com.bbva.ui.widget.BbvaAutoCompleteTextInputLayout.4
            @Override // com.bbva.ui.widget.DefaultTextWatcher, android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence sequence, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                boolean z10 = before == 0 && count == sequence.length();
                BbvaAutoCompleteTextInputLayout bbvaAutoCompleteTextInputLayout = BbvaAutoCompleteTextInputLayout.this;
                BbvaAutoCompleteTextInputLayout.access$onTextChanged(bbvaAutoCompleteTextInputLayout, sequence, z10);
                if (count > 1) {
                    bbvaAutoCompleteTextInputLayout.a();
                }
            }
        });
        if (ViewCompat.isLaidOut(this) && !isLayoutRequested()) {
            Rect rect = new Rect();
            this.f37650p0.getHitRect(rect);
            this.f37650p0.setTouchDelegate(new TouchDelegate(rect, this.f37652r0));
            return;
        }
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bbva.ui.widget.BbvaAutoCompleteTextInputLayout$special$$inlined$doOnLayout$2
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                Rect rect2 = new Rect();
                BbvaAutoCompleteTextInputLayout bbvaAutoCompleteTextInputLayout = this.f37661a;
                bbvaAutoCompleteTextInputLayout.f37650p0.getHitRect(rect2);
                bbvaAutoCompleteTextInputLayout.f37650p0.setTouchDelegate(new TouchDelegate(rect2, bbvaAutoCompleteTextInputLayout.f37652r0));
            }
        });
    }
}
