package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1gSDK extends AFf1nSDK {
    private final AFc1zSDK valueOf;

    public AFf1gSDK(Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("store", "huawei", runnable);
        this.valueOf = aFc1zSDK;
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(Context context) {
        values(this.valueOf.AFKeystoreWrapper(), new AFb1qSDK<Map<String, Object>>(context, this.valueOf, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.AFf1gSDK.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1qSDK
            /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> AFInAppEventType() {
                String str = ((PackageItemInfo) this.AFInAppEventType.getPackageManager().resolveContentProvider(this.AFInAppEventParameterName, 128)).packageName;
                AFf1gSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(this.AFInAppEventType, str)));
                AFf1gSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(this.AFInAppEventType, str));
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.AFInAppEventParameterName);
                        sb2.append("/item/5");
                        cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), null, null, new String[]{this.AFInAppEventType.getPackageName()}, null);
                        if (cursorQuery == null) {
                            AFf1gSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFf1gSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "OK");
                            AFf1gSDK.this.AFKeystoreWrapper.put("referrer", cursorQuery.getString(0));
                            AFf1gSDK.this.AFKeystoreWrapper.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                            AFf1gSDK.this.AFKeystoreWrapper.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                            if (cursorQuery.getColumnCount() > 3) {
                                AFf1gSDK.this.AFKeystoreWrapper.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                                HashMap map = new HashMap();
                                String string = cursorQuery.getString(4);
                                if (string != null) {
                                    map.put("track_id", string);
                                }
                                map.put("referrer_ex", cursorQuery.getString(5));
                                AFf1gSDK.this.AFKeystoreWrapper.put("huawei_custom", map);
                            }
                        } else {
                            AFf1gSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e5) {
                        AFf1gSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e5.getMessage(), e5);
                        if (0 != 0) {
                        }
                    }
                    AFf1gSDK.this.AFInAppEventType();
                    return AFf1gSDK.this.AFKeystoreWrapper;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }
        });
    }
}
