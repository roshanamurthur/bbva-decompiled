package com.salesforce.marketingcloud.messages.iam;

import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.media.o;

/* JADX INFO: loaded from: classes11.dex */
interface i {
    boolean canDisplay(@NonNull InAppMessage inAppMessage);

    @ColorInt
    int getStatusBarColor();

    @Nullable
    Typeface getTypeface();

    void handleMessageFinished(@NonNull InAppMessage inAppMessage, @NonNull j jVar);

    o imageHandler();

    UrlHandler urlHandler();
}
