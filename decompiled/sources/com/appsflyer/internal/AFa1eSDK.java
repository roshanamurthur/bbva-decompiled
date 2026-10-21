package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.adobe.marketing.mobile.EventDataKeys;

/* JADX INFO: loaded from: classes2.dex */
final class AFa1eSDK extends AFb1qSDK<String> {
    public AFa1eSDK(Context context, AFc1zSDK aFc1zSDK) {
        super(context, aFc1zSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1qSDK
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public String AFInAppEventType() throws Throwable {
        Cursor cursorQuery;
        Throwable th2;
        try {
            ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.AFInAppEventParameterName);
            cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), new String[]{EventDataKeys.Analytics.ANALYTICS_ID}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(EventDataKeys.Analytics.ANALYTICS_ID));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            cursorQuery = null;
            th2 = th4;
        }
    }

    @Nullable
    public final String AFInAppEventParameterName() {
        this.AFKeystoreWrapper.valueOf().execute(this.values);
        return (String) super.values();
    }

    @Override // com.appsflyer.internal.AFb1qSDK
    @Nullable
    public final /* synthetic */ String values() {
        this.AFKeystoreWrapper.valueOf().execute(this.values);
        return (String) super.values();
    }
}
