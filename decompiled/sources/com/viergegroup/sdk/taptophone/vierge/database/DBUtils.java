package com.viergegroup.sdk.taptophone.vierge.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.SdkTapOnPhoneVierge;

/* JADX INFO: loaded from: classes7.dex */
public class DBUtils {
    public static Boolean getDevServerFlag() {
        int i10 = 0;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = SdkTapOnPhoneVierge.getDatabaseHelper().getReadableDatabase().rawQuery("SELECT dev_server_flag FROM serialNumber", new String[0]);
                if (cursorRawQuery.getCount() > 0) {
                    cursorRawQuery.moveToFirst();
                    int columnIndex = cursorRawQuery.getColumnIndex("dev_server_flag");
                    if (columnIndex != -1) {
                        i10 = cursorRawQuery.getInt(columnIndex);
                    }
                }
                cursorRawQuery.close();
                if (i10 != 0) {
                    return Boolean.TRUE;
                }
            } catch (Exception e5) {
                e5.toString();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
            return Boolean.FALSE;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public static Integer getNumberOperation() {
        int iValueOf = 0;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = SdkTapOnPhoneVierge.getDatabaseHelper().getReadableDatabase().rawQuery("SELECT number_operation FROM serialNumber", new String[0]);
                if (cursorRawQuery.getCount() > 0) {
                    cursorRawQuery.moveToFirst();
                    int columnIndex = cursorRawQuery.getColumnIndex("number_operation");
                    if (columnIndex >= 0) {
                        iValueOf = Integer.valueOf(cursorRawQuery.getInt(columnIndex));
                    }
                }
            } catch (Exception e5) {
                e5.toString();
                if (cursorRawQuery != null) {
                }
                return iValueOf;
            }
            cursorRawQuery.close();
            return iValueOf;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public static String getSerialNumber() {
        String string = "";
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = SdkTapOnPhoneVierge.getDatabaseHelper().getReadableDatabase().rawQuery("SELECT serial_number FROM serialNumber", new String[0]);
                if (cursorRawQuery.getCount() > 0) {
                    cursorRawQuery.moveToFirst();
                    int columnIndex = cursorRawQuery.getColumnIndex("serial_number");
                    if (columnIndex >= 0) {
                        string = cursorRawQuery.getString(columnIndex);
                    }
                }
            } catch (Exception e5) {
                e5.toString();
                if (cursorRawQuery != null) {
                }
                return string;
            }
            cursorRawQuery.close();
            return string;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public static void updateDevServerFlag(Boolean bool) {
        SdkTapOnPhoneVierge.getDatabaseHelper().getReadableDatabase().execSQL(bool.booleanValue() ? "UPDATE serialNumber SET dev_server_flag='1'" : "UPDATE serialNumber SET dev_server_flag='0'");
    }

    public static void updateNumberOperation(Integer num) {
        SQLiteDatabase readableDatabase = SdkTapOnPhoneVierge.getDatabaseHelper().getReadableDatabase();
        StringBuilder sb2 = new StringBuilder("UPDATE serialNumber SET number_operation='");
        sb2.append(num);
        sb2.append("'");
        readableDatabase.execSQL(sb2.toString());
    }

    public static void updateSerialNumber(String str) {
        SQLiteDatabase readableDatabase = SdkTapOnPhoneVierge.getDatabaseHelper().getReadableDatabase();
        DigipassManagerConstants.KEY_SERIAL_NUMBER.concat(String.valueOf(str));
        if (str != null && str.length() <= 20) {
            StringBuilder sb2 = new StringBuilder("UPDATE serialNumber SET serial_number='");
            sb2.append(str);
            sb2.append("'");
            readableDatabase.execSQL(sb2.toString());
        }
    }
}
