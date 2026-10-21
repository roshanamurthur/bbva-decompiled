package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.library.baseAdapters.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@BindingMethods({@BindingMethod(attribute = "android:autoLink", method = "setAutoLinkMask", type = TextView.class), @BindingMethod(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = TextView.class), @BindingMethod(attribute = "android:editorExtras", method = "setInputExtras", type = TextView.class), @BindingMethod(attribute = "android:inputType", method = "setRawInputType", type = TextView.class), @BindingMethod(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = TextView.class), @BindingMethod(attribute = "android:textAllCaps", method = "setAllCaps", type = TextView.class), @BindingMethod(attribute = "android:textColorHighlight", method = "setHighlightColor", type = TextView.class), @BindingMethod(attribute = "android:textColorHint", method = "setHintTextColor", type = TextView.class), @BindingMethod(attribute = "android:textColorLink", method = "setLinkTextColor", type = TextView.class), @BindingMethod(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = TextView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TextViewBindingAdapter {
    public static final int DECIMAL = 5;
    public static final int INTEGER = 1;
    public static final int SIGNED = 3;

    public interface AfterTextChanged {
        void afterTextChanged(Editable editable);
    }

    public interface BeforeTextChanged {
        void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12);
    }

    public interface OnTextChanged {
        void onTextChanged(CharSequence charSequence, int i10, int i11, int i12);
    }

    public class a implements TextWatcher {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BeforeTextChanged f20604p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ OnTextChanged f20605q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20606r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AfterTextChanged f20607s0;

        public a(BeforeTextChanged beforeTextChanged, OnTextChanged onTextChanged, InverseBindingListener inverseBindingListener, AfterTextChanged afterTextChanged) {
            this.f20604p0 = beforeTextChanged;
            this.f20605q0 = onTextChanged;
            this.f20606r0 = inverseBindingListener;
            this.f20607s0 = afterTextChanged;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AfterTextChanged afterTextChanged = this.f20607s0;
            if (afterTextChanged != null) {
                afterTextChanged.afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            BeforeTextChanged beforeTextChanged = this.f20604p0;
            if (beforeTextChanged != null) {
                beforeTextChanged.beforeTextChanged(charSequence, i10, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            OnTextChanged onTextChanged = this.f20605q0;
            if (onTextChanged != null) {
                onTextChanged.onTextChanged(charSequence, i10, i11, i12);
            }
            InverseBindingListener inverseBindingListener = this.f20606r0;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
        }
    }

    public static void a(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @InverseBindingAdapter(attribute = "android:text", event = "android:textAttrChanged")
    public static String getTextString(TextView textView) {
        return textView.getText().toString();
    }

    @BindingAdapter({"android:autoText"})
    public static void setAutoText(TextView textView, boolean z10) {
        KeyListener keyListener = textView.getKeyListener();
        TextKeyListener.Capitalize capitalize = TextKeyListener.Capitalize.NONE;
        int inputType = keyListener != null ? keyListener.getInputType() : 0;
        if ((inputType & 4096) != 0) {
            capitalize = TextKeyListener.Capitalize.CHARACTERS;
        } else if ((inputType & 8192) != 0) {
            capitalize = TextKeyListener.Capitalize.WORDS;
        } else if ((inputType & 16384) != 0) {
            capitalize = TextKeyListener.Capitalize.SENTENCES;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z10, capitalize));
    }

    @BindingAdapter({"android:bufferType"})
    public static void setBufferType(TextView textView, TextView.BufferType bufferType) {
        textView.setText(textView.getText(), bufferType);
    }

    @BindingAdapter({"android:capitalize"})
    public static void setCapitalize(TextView textView, TextKeyListener.Capitalize capitalize) {
        textView.setKeyListener(TextKeyListener.getInstance((textView.getKeyListener().getInputType() & 32768) != 0, capitalize));
    }

    @BindingAdapter({"android:digits"})
    public static void setDigits(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            textView.setKeyListener(DigitsKeyListener.getInstance(charSequence.toString()));
        } else if (textView.getKeyListener() instanceof DigitsKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @BindingAdapter({"android:drawableBottom"})
    public static void setDrawableBottom(TextView textView, Drawable drawable) {
        a(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    @BindingAdapter({"android:drawableEnd"})
    public static void setDrawableEnd(TextView textView, Drawable drawable) {
        a(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    @BindingAdapter({"android:drawableLeft"})
    public static void setDrawableLeft(TextView textView, Drawable drawable) {
        a(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    @BindingAdapter({"android:drawableRight"})
    public static void setDrawableRight(TextView textView, Drawable drawable) {
        a(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    @BindingAdapter({"android:drawableStart"})
    public static void setDrawableStart(TextView textView, Drawable drawable) {
        a(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @BindingAdapter({"android:drawableTop"})
    public static void setDrawableTop(TextView textView, Drawable drawable) {
        a(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    @BindingAdapter({"android:imeActionLabel"})
    public static void setImeActionLabel(TextView textView, CharSequence charSequence) {
        textView.setImeActionLabel(charSequence, textView.getImeActionId());
    }

    @BindingAdapter({"android:inputMethod"})
    public static void setInputMethod(TextView textView, CharSequence charSequence) {
        try {
            textView.setKeyListener((KeyListener) Class.forName(charSequence.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Objects.toString(charSequence);
        } catch (IllegalAccessException unused2) {
            Objects.toString(charSequence);
        } catch (InstantiationException unused3) {
            Objects.toString(charSequence);
        }
    }

    @BindingAdapter({"android:lineSpacingExtra"})
    public static void setLineSpacingExtra(TextView textView, float f6) {
        textView.setLineSpacing(f6, textView.getLineSpacingMultiplier());
    }

    @BindingAdapter({"android:lineSpacingMultiplier"})
    public static void setLineSpacingMultiplier(TextView textView, float f6) {
        textView.setLineSpacing(textView.getLineSpacingExtra(), f6);
    }

    @BindingAdapter({"android:maxLength"})
    public static void setMaxLength(TextView textView, int i10) {
        InputFilter[] filters = textView.getFilters();
        if (filters == null) {
            filters = new InputFilter[]{new InputFilter.LengthFilter(i10)};
        } else {
            for (int i11 = 0; i11 < filters.length; i11++) {
                InputFilter inputFilter = filters[i11];
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    if (((InputFilter.LengthFilter) inputFilter).getMax() != i10) {
                        filters[i11] = new InputFilter.LengthFilter(i10);
                    }
                }
            }
            int length = filters.length;
            InputFilter[] inputFilterArr = new InputFilter[length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[length] = new InputFilter.LengthFilter(i10);
            filters = inputFilterArr;
        }
        textView.setFilters(filters);
    }

    @BindingAdapter({"android:numeric"})
    public static void setNumeric(TextView textView, int i10) {
        textView.setKeyListener(DigitsKeyListener.getInstance((i10 & 3) != 0, (i10 & 5) != 0));
    }

    @BindingAdapter({"android:password"})
    public static void setPassword(TextView textView, boolean z10) {
        if (z10) {
            textView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textView.setTransformationMethod(null);
        }
    }

    @BindingAdapter({"android:phoneNumber"})
    public static void setPhoneNumber(TextView textView, boolean z10) {
        if (z10) {
            textView.setKeyListener(DialerKeyListener.getInstance());
        } else if (textView.getKeyListener() instanceof DialerKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @BindingAdapter({"android:shadowColor"})
    public static void setShadowColor(TextView textView, int i10) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i10);
    }

    @BindingAdapter({"android:shadowDx"})
    public static void setShadowDx(TextView textView, float f6) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), f6, textView.getShadowDy(), shadowColor);
    }

    @BindingAdapter({"android:shadowDy"})
    public static void setShadowDy(TextView textView, float f6) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f6, shadowColor);
    }

    @BindingAdapter({"android:shadowRadius"})
    public static void setShadowRadius(TextView textView, float f6) {
        textView.setShadowLayer(f6, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
    }

    @BindingAdapter({"android:text"})
    public static void setText(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (!(charSequence instanceof Spanned)) {
                if ((charSequence == null) == (text == null)) {
                    if (charSequence == null) {
                        return;
                    }
                    int length = charSequence.length();
                    if (length == text.length()) {
                        for (int i10 = 0; i10 < length; i10++) {
                            if (charSequence.charAt(i10) == text.charAt(i10)) {
                            }
                        }
                        return;
                    }
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    @BindingAdapter({"android:textSize"})
    public static void setTextSize(TextView textView, float f6) {
        textView.setTextSize(0, f6);
    }

    @BindingAdapter(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    public static void setTextWatcher(TextView textView, BeforeTextChanged beforeTextChanged, OnTextChanged onTextChanged, AfterTextChanged afterTextChanged, InverseBindingListener inverseBindingListener) {
        a aVar = (beforeTextChanged == null && afterTextChanged == null && onTextChanged == null && inverseBindingListener == null) ? null : new a(beforeTextChanged, onTextChanged, inverseBindingListener, afterTextChanged);
        TextWatcher textWatcher = (TextWatcher) ListenerUtil.trackListener(textView, aVar, R.id.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }

    @BindingAdapter({"android:imeActionId"})
    public static void setImeActionLabel(TextView textView, int i10) {
        textView.setImeActionLabel(textView.getImeActionLabel(), i10);
    }
}
