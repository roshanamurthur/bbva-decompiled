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
public final class AFf1hSDK extends AFf1nSDK {
    private final AFc1zSDK valueOf;

    public AFf1hSDK(Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("store", "samsung", runnable);
        this.valueOf = aFc1zSDK;
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(Context context) {
        values(this.valueOf.AFKeystoreWrapper(), new AFb1qSDK<Map<String, Object>>(context, this.valueOf, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFf1hSDK.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1qSDK
            /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> AFInAppEventType() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.AFInAppEventParameterName);
                        cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            AFf1hSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFf1hSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "OK");
                            AFKeystoreWrapper("referrer", AFf1hSDK.this.AFKeystoreWrapper, cursorQuery);
                            values("click_ts", AFf1hSDK.this.AFKeystoreWrapper, cursorQuery);
                            values("install_begin_ts", AFf1hSDK.this.AFKeystoreWrapper, cursorQuery);
                            values("install_end_ts", AFf1hSDK.this.AFKeystoreWrapper, cursorQuery);
                            AFKeystoreWrapper("organic_keywords", AFf1hSDK.this.AFKeystoreWrapper, cursorQuery);
                            AFKeystoreWrapper("attr_type", AFf1hSDK.this.AFKeystoreWrapper, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            values("click_server_ts", map, cursorQuery);
                            values("install_begin_server_ts", map, cursorQuery);
                            AFKeystoreWrapper("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                AFf1hSDK.this.AFKeystoreWrapper.put("custom", map);
                            }
                        } else {
                            AFf1hSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e5) {
                        AFf1hSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e5.getMessage(), e5);
                        if (0 != 0) {
                        }
                    }
                    String str = ((PackageItemInfo) this.AFInAppEventType.getPackageManager().resolveContentProvider(this.AFInAppEventParameterName, 128)).packageName;
                    AFf1hSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(this.AFInAppEventType, str)));
                    AFf1hSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(this.AFInAppEventType, str));
                    AFf1hSDK.this.AFInAppEventType();
                    return AFf1hSDK.this.AFKeystoreWrapper;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            private static void values(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j10 = cursor.getLong(columnIndex);
                if (j10 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j10));
            }
        });
    }
}
