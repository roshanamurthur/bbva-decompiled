package yf;

import androidx.annotation.Nullable;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.encoders.DataEncoder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: MetaDataStore.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f94804b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStore f94805a;

    public e(FileStore fileStore) {
        this.f94805a = fileStore;
    }

    public static HashMap a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                DataEncoder dataEncoder = RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER;
                JSONObject jSONObject = new JSONObject(string);
                arrayList.add(RolloutAssignment.create(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion")));
            } catch (Exception e5) {
                Logger.getLogger().w("Failed de-serializing rollouts state. " + string, e5);
            }
        }
        return arrayList;
    }

    public static String e(List<RolloutAssignment> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i10))));
            } catch (JSONException e5) {
                Logger.getLogger().w("Exception parsing rollout assignment!", e5);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Logger.getLogger().i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final Map<String, String> c(String str, boolean z10) throws Throwable {
        FileInputStream fileInputStream;
        Exception e5;
        FileStore fileStore = this.f94805a;
        File sessionFile = z10 ? fileStore.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME) : fileStore.getSessionFile(str, "keys");
        if (sessionFile.exists()) {
            ?? length = sessionFile.length();
            if (length != 0) {
                ?? r10 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(sessionFile);
                        try {
                            HashMap mapA = a(CommonUtils.streamToString(fileInputStream));
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return mapA;
                        } catch (Exception e7) {
                            e5 = e7;
                            Logger.getLogger().w("Error deserializing user metadata.", e5);
                            f(sessionFile);
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = length;
                        CommonUtils.closeOrLog(r10, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e10) {
                    fileInputStream = null;
                    e5 = e10;
                } catch (Throwable th3) {
                    th = th3;
                    CommonUtils.closeOrLog(r10, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        f(sessionFile);
        return Collections.emptyMap();
    }

    @Nullable
    public final String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        File sessionFile = this.f94805a.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        FileInputStream fileInputStream2 = null;
        if (!sessionFile.exists() || sessionFile.length() == 0) {
            Logger.getLogger().d("No userId set for session " + str);
            f(sessionFile);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(sessionFile);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(CommonUtils.streamToString(fileInputStream));
                    String strOptString = !jSONObject.isNull(Constants.backendRequestUserId) ? jSONObject.optString(Constants.backendRequestUserId, null) : null;
                    Logger.getLogger().d("Loaded userId " + strOptString + " for session " + str);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return strOptString;
                } catch (Exception e5) {
                    e = e5;
                    Logger.getLogger().w("Error deserializing user metadata.", e);
                    f(sessionFile);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final void g(String str, Map<String, String> map, boolean z10) throws Throwable {
        FileStore fileStore = this.f94805a;
        File sessionFile = z10 ? fileStore.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME) : fileStore.getSessionFile(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sessionFile), f94804b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e5) {
                    e = e5;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().w("Error serializing key/value metadata.", e);
                    f(sessionFile);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void h(String str, List<RolloutAssignment> list) throws Throwable {
        File sessionFile = this.f94805a.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
        if (list.isEmpty()) {
            f(sessionFile);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strE = e(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sessionFile), f94804b));
                try {
                    bufferedWriter2.write(strE);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e5) {
                    e = e5;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().w("Error serializing rollouts state.", e);
                    f(sessionFile);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void i(String str, String str2) throws Throwable {
        File sessionFile = this.f94805a.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new d(str2).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sessionFile), f94804b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e5) {
                    e = e5;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().w("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }
}
