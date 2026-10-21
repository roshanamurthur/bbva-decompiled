package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class PersistedInstallation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f48473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FirebaseApp f48474b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RegistrationStatus {
        private static final /* synthetic */ RegistrationStatus[] $VALUES;
        public static final RegistrationStatus ATTEMPT_MIGRATION;
        public static final RegistrationStatus NOT_GENERATED;
        public static final RegistrationStatus REGISTERED;
        public static final RegistrationStatus REGISTER_ERROR;
        public static final RegistrationStatus UNREGISTERED;

        static {
            RegistrationStatus registrationStatus = new RegistrationStatus("ATTEMPT_MIGRATION", 0);
            ATTEMPT_MIGRATION = registrationStatus;
            RegistrationStatus registrationStatus2 = new RegistrationStatus("NOT_GENERATED", 1);
            NOT_GENERATED = registrationStatus2;
            RegistrationStatus registrationStatus3 = new RegistrationStatus("UNREGISTERED", 2);
            UNREGISTERED = registrationStatus3;
            RegistrationStatus registrationStatus4 = new RegistrationStatus("REGISTERED", 3);
            REGISTERED = registrationStatus4;
            RegistrationStatus registrationStatus5 = new RegistrationStatus("REGISTER_ERROR", 4);
            REGISTER_ERROR = registrationStatus5;
            $VALUES = new RegistrationStatus[]{registrationStatus, registrationStatus2, registrationStatus3, registrationStatus4, registrationStatus5};
        }

        public RegistrationStatus() {
            throw null;
        }

        public static RegistrationStatus valueOf(String str) {
            return (RegistrationStatus) Enum.valueOf(RegistrationStatus.class, str);
        }

        public static RegistrationStatus[] values() {
            return (RegistrationStatus[]) $VALUES.clone();
        }
    }

    public PersistedInstallation(@NonNull FirebaseApp firebaseApp) {
        this.f48474b = firebaseApp;
    }

    public final File a() {
        if (this.f48473a == null) {
            synchronized (this) {
                try {
                    if (this.f48473a == null) {
                        this.f48473a = new File(this.f48474b.getApplicationContext().getFilesDir(), "PersistedInstallation." + this.f48474b.getPersistenceKey() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f48473a;
    }

    public void clearForTesting() {
        a().delete();
    }

    @NonNull
    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put("Status", persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.getAuthToken());
            jSONObject.put("RefreshToken", persistedInstallationEntry.getRefreshToken());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put("FisError", persistedInstallationEntry.getFisError());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f48474b.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return persistedInstallationEntry;
    }

    @NonNull
    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(strOptString).setRegistrationStatus(RegistrationStatus.values()[iOptInt]).setAuthToken(strOptString2).setRefreshToken(strOptString3).setTokenCreationEpochInSecs(jOptLong).setExpiresInSecs(jOptLong2).setFisError(jSONObject.optString("FisError", null)).build();
    }
}
