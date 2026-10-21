package com.bbva.ui.compose;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\u0003 !\"¨\u0006#"}, d2 = {"Lcom/bbva/ui/compose/TextFieldType;", "", "Lcom/bbva/ui/compose/IconType;", "a", "Lcom/bbva/ui/compose/IconType;", "getIconType", "()Lcom/bbva/ui/compose/IconType;", "iconType", "", "b", "Ljava/lang/Integer;", "getIconResId", "()Ljava/lang/Integer;", "iconResId", "c", "getIconToggledResId", "iconToggledResId", "d", "getIconContentDescription", "iconContentDescription", "e", "getIconToggledContentDescription", "iconToggledContentDescription", "Landroidx/compose/foundation/text/KeyboardOptions;", "f", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Password", "Search", "Text", "Lcom/bbva/ui/compose/TextFieldType$Password;", "Lcom/bbva/ui/compose/TextFieldType$Search;", "Lcom/bbva/ui/compose/TextFieldType$Text;", "ui_release"}, k = 1, mv = {1, 9, 0})
public abstract class TextFieldType {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final IconType iconType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer iconResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer iconToggledResId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer iconContentDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer iconToggledContentDescription;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KeyboardOptions keyboardOptions;

    /* JADX INFO: compiled from: TextField.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/ui/compose/TextFieldType$Password;", "Lcom/bbva/ui/compose/TextFieldType;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Password extends TextFieldType {
        public static final int $stable = 0;

        @NotNull
        public static final Password INSTANCE = new Password();

        public Password() {
            super(IconType.ACTIONABLE_ALWAYS_VISIBLE, Integer.valueOf(R.drawable.ic_eye), Integer.valueOf(R.drawable.ic_eye_closed), Integer.valueOf(R.string.ui_show_password), Integer.valueOf(R.string.ui_hide_password), KeyboardOptions.m504copy3m2b7yw$default(KeyboardOptions.INSTANCE.getDefault(), 0, false, KeyboardType.INSTANCE.m4167getPasswordPjHm6EE(), ImeAction.INSTANCE.m4117getDoneeUduSuo(), 3, null), null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Password)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1798348162;
        }

        @NotNull
        public String toString() {
            return "Password";
        }
    }

    /* JADX INFO: compiled from: TextField.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/ui/compose/TextFieldType$Search;", "Lcom/bbva/ui/compose/TextFieldType;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Search extends TextFieldType {
        public static final int $stable = 0;

        @NotNull
        public static final Search INSTANCE = new Search();

        public Search() {
            super(IconType.DECORATIVE, Integer.valueOf(R.drawable.ic_search), null, null, null, null, 60, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Search)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 721081935;
        }

        @NotNull
        public String toString() {
            return "Search";
        }
    }

    /* JADX INFO: compiled from: TextField.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/ui/compose/TextFieldType$Text;", "Lcom/bbva/ui/compose/TextFieldType;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Text extends TextFieldType {
        public static final int $stable = 0;

        @NotNull
        public static final Text INSTANCE = new Text();

        public Text() {
            super(null, null, null, null, null, null, 63, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -803687532;
        }

        @NotNull
        public String toString() {
            return "Text";
        }
    }

    public TextFieldType(IconType iconType, Integer num, Integer num2, Integer num3, Integer num4, KeyboardOptions keyboardOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this.iconType = iconType;
        this.iconResId = num;
        this.iconToggledResId = num2;
        this.iconContentDescription = num3;
        this.iconToggledContentDescription = num4;
        this.keyboardOptions = keyboardOptions;
    }

    @Nullable
    public final Integer getIconContentDescription() {
        return this.iconContentDescription;
    }

    @Nullable
    public final Integer getIconResId() {
        return this.iconResId;
    }

    @Nullable
    public final Integer getIconToggledContentDescription() {
        return this.iconToggledContentDescription;
    }

    @Nullable
    public final Integer getIconToggledResId() {
        return this.iconToggledResId;
    }

    @Nullable
    public final IconType getIconType() {
        return this.iconType;
    }

    @NotNull
    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public /* synthetic */ TextFieldType(IconType iconType, Integer num, Integer num2, Integer num3, Integer num4, KeyboardOptions keyboardOptions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : iconType, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) == 0 ? num4 : null, (i10 & 32) != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions, null);
    }
}
