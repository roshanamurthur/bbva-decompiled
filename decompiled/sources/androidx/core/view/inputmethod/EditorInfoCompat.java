package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class EditorInfoCompat {
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f20396a = new String[0];

    @RequiresApi(30)
    public static class a {
        public static CharSequence a(@NonNull EditorInfo editorInfo, int i10) {
            return editorInfo.getInitialSelectedText(i10);
        }

        public static CharSequence b(@NonNull EditorInfo editorInfo, int i10, int i11) {
            return editorInfo.getInitialTextAfterCursor(i10, i11);
        }

        public static CharSequence c(@NonNull EditorInfo editorInfo, int i10, int i11) {
            return editorInfo.getInitialTextBeforeCursor(i10, i11);
        }

        public static void d(@NonNull EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    @Deprecated
    public EditorInfoCompat() {
    }

    public static void a(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    @NonNull
    public static String[] getContentMimeTypes(@NonNull EditorInfo editorInfo) {
        int i10 = Build.VERSION.SDK_INT;
        String[] strArr = f20396a;
        if (i10 >= 25) {
            String[] strArr2 = editorInfo.contentMimeTypes;
            return strArr2 != null ? strArr2 : strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return strArr;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : strArr;
    }

    @Nullable
    public static CharSequence getInitialSelectedText(@NonNull EditorInfo editorInfo, int i10) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i10);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int iMin = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int iMax = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i11 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int i12 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int i13 = iMax - iMin;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i12 - i11 != i13 || (charSequence = editorInfo.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        return (i10 & 1) != 0 ? charSequence.subSequence(i11, i12) : TextUtils.substring(charSequence, i11, i12);
    }

    @Nullable
    public static CharSequence getInitialTextAfterCursor(@NonNull EditorInfo editorInfo, int i10, int i11) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i10, i11);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i12 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int iMin = Math.min(i10, charSequence.length() - i12);
        return (i11 & 1) != 0 ? charSequence.subSequence(i12, iMin + i12) : TextUtils.substring(charSequence, i12, iMin + i12);
    }

    @Nullable
    public static CharSequence getInitialTextBeforeCursor(@NonNull EditorInfo editorInfo, int i10, int i11) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i10, i11);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT")) == null) {
            return null;
        }
        int i12 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int iMin = Math.min(i10, i12);
        return (i11 & 1) != 0 ? charSequence.subSequence(i12 - iMin, i12) : TextUtils.substring(charSequence, i12 - iMin, i12);
    }

    public static void setContentMimeTypes(@NonNull EditorInfo editorInfo, @Nullable String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void setInitialSurroundingSubText(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence, int i10) {
        Preconditions.checkNotNull(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i10);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 - i10 : i11 - i10;
        int i14 = i11 > i12 ? i11 - i10 : i12 - i10;
        int length = charSequence.length();
        if (i10 < 0 || i13 < 0 || i14 > length) {
            a(editorInfo, null, 0, 0);
            return;
        }
        int i15 = editorInfo.inputType & 4095;
        if (i15 == 129 || i15 == 225 || i15 == 18) {
            a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            a(editorInfo, charSequence, i13, i14);
            return;
        }
        int i16 = i14 - i13;
        int i17 = i16 > 1024 ? 0 : i16;
        int i18 = 2048 - i17;
        int iMin = Math.min(charSequence.length() - i14, i18 - Math.min(i13, (int) (((double) i18) * 0.8d)));
        int iMin2 = Math.min(i13, i18 - iMin);
        int i19 = i13 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i19))) {
            i19++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i14 + iMin) - 1))) {
            iMin--;
        }
        int i20 = iMin2 + i17;
        a(editorInfo, i17 != i16 ? TextUtils.concat(charSequence.subSequence(i19, i19 + iMin2), charSequence.subSequence(i14, iMin + i14)) : charSequence.subSequence(i19, i20 + iMin + i19), iMin2, i20);
    }

    public static void setInitialSurroundingText(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }
}
