package com.salesforce.marketingcloud.messages.iam;

import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.MCKeep;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
public interface InAppMessageManager {

    @MCKeep
    public interface EventListener {
        void didCloseMessage(@NonNull InAppMessage inAppMessage);

        void didShowMessage(@NonNull InAppMessage inAppMessage);

        boolean shouldShowMessage(@NonNull InAppMessage inAppMessage);
    }

    void setInAppMessageListener(@Nullable EventListener eventListener);

    void setStatusBarColor(@ColorInt int i10);

    void setTypeface(@Nullable Typeface typeface);

    void showMessage(@NonNull String str);
}
