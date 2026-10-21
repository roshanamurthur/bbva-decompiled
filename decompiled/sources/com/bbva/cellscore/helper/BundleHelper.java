package com.bbva.cellscore.helper;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleHelper {
    public static boolean addObjectToBundle(Bundle bundle, String str, Object obj) {
        if (obj instanceof Byte) {
            bundle.putByte(str, ((Byte) obj).byteValue());
            return true;
        }
        if (obj instanceof Character) {
            bundle.putChar(str, ((Character) obj).charValue());
            return true;
        }
        if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof float[]) {
            bundle.putFloatArray(str, (float[]) obj);
        } else {
            if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
                return true;
            }
            if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
                return true;
            }
            if (obj instanceof Map) {
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    addObjectToBundle(bundle2, (String) entry.getKey(), entry.getValue());
                }
                bundle.putBundle(str, bundle2);
                return true;
            }
            if (obj instanceof Map[]) {
                Map[] mapArr = (Map[]) obj;
                Parcelable[] parcelableArr = new Bundle[mapArr.length];
                for (int i10 = 0; i10 < mapArr.length; i10++) {
                    Map map = mapArr[i10];
                    Bundle bundle3 = new Bundle();
                    for (Map.Entry entry2 : map.entrySet()) {
                        addObjectToBundle(bundle3, (String) entry2.getKey(), entry2.getValue());
                    }
                    parcelableArr[i10] = bundle3;
                }
                bundle.putParcelableArray(str, parcelableArr);
                return true;
            }
            if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
                return true;
            }
        }
        return false;
    }

    public static boolean addToBundleIfPossible(Bundle bundle, Object obj) {
        return addObjectToBundle(bundle, "value", obj);
    }

    public static String getActivityMetadata(Activity activity, String str) {
        try {
            Bundle bundle = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString(str);
            }
            activity.getLocalClassName();
            return null;
        } catch (Exception e5) {
            e5.getMessage();
            return null;
        }
    }

    public static Object tryGetValue(Bundle bundle) {
        return bundle.get("value");
    }
}
