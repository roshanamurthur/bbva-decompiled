package androidx.databinding.adapters;

import android.widget.AutoCompleteTextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@BindingMethods({@BindingMethod(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @BindingMethod(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @BindingMethod(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @BindingMethod(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AutoCompleteTextViewBindingAdapter {

    public interface FixText {
        CharSequence fixText(CharSequence charSequence);
    }

    public interface IsValid {
        boolean isValid(CharSequence charSequence);
    }

    public class a implements AutoCompleteTextView.Validator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IsValid f20577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FixText f20578b;

        public a(IsValid isValid, FixText fixText) {
            this.f20577a = isValid;
            this.f20578b = fixText;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public final CharSequence fixText(CharSequence charSequence) {
            FixText fixText = this.f20578b;
            return fixText != null ? fixText.fixText(charSequence) : charSequence;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public final boolean isValid(CharSequence charSequence) {
            IsValid isValid = this.f20577a;
            if (isValid != null) {
                return isValid.isValid(charSequence);
            }
            return true;
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void setOnItemSelectedListener(AutoCompleteTextView autoCompleteTextView, AdapterViewBindingAdapter.OnItemSelected onItemSelected, AdapterViewBindingAdapter.OnNothingSelected onNothingSelected) {
        if (onItemSelected == null && onNothingSelected == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new AdapterViewBindingAdapter.OnItemSelectedComponentListener(onItemSelected, onNothingSelected, null));
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void setValidator(AutoCompleteTextView autoCompleteTextView, FixText fixText, IsValid isValid) {
        if (fixText == null && isValid == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new a(isValid, fixText));
        }
    }
}
