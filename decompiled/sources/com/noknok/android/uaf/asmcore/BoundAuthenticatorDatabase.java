package com.noknok.android.uaf.asmcore;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.fido.android.framework.tm.core.inf.ICryptoModule;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.sdk.AuthenticatorException;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class BoundAuthenticatorDatabase extends AuthenticatorDatabase {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashMap<String, BoundAuthenticatorDatabase> f63528g = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ICryptoModule f63529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f63530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Database f63531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f63532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Gson f63533e = new Gson();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, Map<String, String>> f63534f = new HashMap();

    public static class Database {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f63535v = 1;
        final HashMap<String, String> kvs = new HashMap<>();
        List<AuthenticatorDatabase.RegistrationRecord> regs = new ArrayList();
    }

    private BoundAuthenticatorDatabase(String str, ICryptoModule iCryptoModule, Context context) throws Throwable {
        this.f63530b = str;
        this.f63529a = iCryptoModule;
        this.f63532d = context;
        b();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0075 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            r10 = this;
            java.lang.String r0 = "Failed to close database file."
            java.lang.String r1 = "BoundAuthenticatorDatabase"
            java.lang.String r2 = "%s.tmp"
            r3 = 0
            com.google.gson.Gson r4 = r10.f63533e     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            com.noknok.android.uaf.asmcore.BoundAuthenticatorDatabase$Database r5 = r10.f63531c     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r4 = r4.toJson(r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.nio.charset.Charset r5 = com.noknok.android.client.utils.Charsets.utf8Charset     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            com.fido.android.framework.tm.core.inf.ICryptoModule r5 = r10.f63529a     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            byte[] r4 = r5.encryptData(r4, r3)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            android.content.Context r5 = r10.f63532d     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r8 = r10.f63530b     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r7 = java.lang.String.format(r2, r7)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.io.FileOutputStream r3 = r5.openFileOutput(r7, r9)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r3.write(r4)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.io.FileDescriptor r4 = r3.getFD()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r4.sync()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r3.flush()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            android.content.Context r4 = r10.f63532d     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r5 = r10.f63530b     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r4.deleteFile(r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            android.content.Context r4 = r10.f63532d     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r6 = r10.f63530b     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r5[r9] = r6     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r2 = java.lang.String.format(r2, r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.io.File r2 = r4.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r5 = r2.getParent()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r6 = r10.f63530b     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            boolean r2 = r2.renameTo(r4)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            if (r2 == 0) goto L6b
            r3.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r2 = move-exception
            com.noknok.android.client.utils.Logger.e(r1, r0, r2)
        L6a:
            return
        L6b:
            com.noknok.android.client.asm.api.AsmException r2 = new com.noknok.android.client.asm.api.AsmException     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            com.noknok.android.client.utils.Outcome r4 = com.noknok.android.client.utils.Outcome.FAILURE     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r5 = "Failed to rename database file."
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            throw r2     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
        L75:
            r2 = move-exception
            goto L82
        L77:
            r2 = move-exception
            com.noknok.android.client.asm.api.AsmException r4 = new com.noknok.android.client.asm.api.AsmException     // Catch: java.lang.Throwable -> L75
            com.noknok.android.client.utils.Outcome r5 = com.noknok.android.client.utils.Outcome.FAILURE     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = "Exception writing database files."
            r4.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> L75
            throw r4     // Catch: java.lang.Throwable -> L75
        L82:
            if (r3 == 0) goto L8c
            r3.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r3 = move-exception
            com.noknok.android.client.utils.Logger.e(r1, r0, r3)
        L8c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.noknok.android.uaf.asmcore.BoundAuthenticatorDatabase.a():void");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: IOException -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x0054, blocks: (B:7:0x0050, B:26:0x0079), top: B:42:0x0016 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007d -> B:38:0x0080). Please report as a decompilation issue!!! */
    private void b() throws Throwable {
        Logger.i("BoundAuthenticatorDatabase", String.format("load: %s", this.f63530b));
        ?? r3 = 0;
        fileInputStream = null;
        FileInputStream fileInputStream = null;
        r3 = 0;
        try {
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = this.f63532d.openFileInput(this.f63530b);
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        if (fileInputStreamOpenFileInput.read(bArr, 0, iAvailable) != iAvailable) {
                            throw new IOException("Failed to read DB file");
                        }
                        String str = new String(this.f63529a.decryptData(bArr, null), Charsets.utf8Charset);
                        Logger.i("BoundAuthenticatorDatabase", String.format("DB File Content: %s", str));
                        Class<Database> cls = Database.class;
                        this.f63531c = (Database) this.f63533e.fromJson(str, (Class) cls);
                        fileInputStreamOpenFileInput.close();
                        r3 = cls;
                    } catch (JsonParseException e5) {
                        e = e5;
                        fileInputStream = fileInputStreamOpenFileInput;
                        Logger.w("BoundAuthenticatorDatabase", "Failed to read the database. Create new one.", e);
                        this.f63531c = new Database();
                        r3 = fileInputStream;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            r3 = fileInputStream;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        fileInputStream = fileInputStreamOpenFileInput;
                        Logger.w("BoundAuthenticatorDatabase", "Failed to read the database. Create new one.", e);
                        this.f63531c = new Database();
                        r3 = fileInputStream;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            r3 = fileInputStream;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = fileInputStreamOpenFileInput;
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (IOException e10) {
                                Logger.e("BoundAuthenticatorDatabase", "Failed to close database file.", e10);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (JsonParseException e11) {
                e = e11;
            } catch (IOException e12) {
                e = e12;
            }
        } catch (IOException e13) {
            Logger.e("BoundAuthenticatorDatabase", "Failed to close database file.", e13);
            r3 = r3;
        }
    }

    public static BoundAuthenticatorDatabase getInstance(String str, ICryptoModule iCryptoModule, Context context) {
        HashMap<String, BoundAuthenticatorDatabase> map = f63528g;
        BoundAuthenticatorDatabase boundAuthenticatorDatabase = map.get(str);
        if (boundAuthenticatorDatabase == null) {
            synchronized (BoundAuthenticatorDatabase.class) {
                boundAuthenticatorDatabase = new BoundAuthenticatorDatabase(str, iCryptoModule, context);
                map.put(str, boundAuthenticatorDatabase);
            }
        }
        return boundAuthenticatorDatabase;
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void addKeyValue(String str, String str2) {
        if (str == null || str2 == null) {
            throw new AsmException(Outcome.FAILURE);
        }
        this.f63531c.kvs.put(str, str2);
        a();
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void addRegistration(AuthenticatorDatabase.RegistrationRecord registrationRecord) {
        String str;
        String str2;
        String str3;
        if (registrationRecord == null) {
            throw new IllegalArgumentException("registration record is empty");
        }
        String str4 = registrationRecord.appID;
        if (str4 == null || str4.equals("") || (str = registrationRecord.callerID) == null || str.equals("") || (str2 = registrationRecord.keyID) == null || str2.equals("") || (str3 = registrationRecord.keyHandle) == null || str3.equals("") || registrationRecord.timeStamp == 0) {
            throw new IllegalArgumentException("Invalid registration record, missing key fields");
        }
        this.f63531c.regs.add(registrationRecord);
        a();
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void eraseDatabase() {
        this.f63531c = new Database();
        a();
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public List<AuthenticatorDatabase.RegistrationRecord> getRegistrations(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("The callerID is invalid");
        }
        ArrayList arrayList = new ArrayList();
        for (AuthenticatorDatabase.RegistrationRecord registrationRecord : getRegistrations()) {
            if (str.equals(registrationRecord.callerID)) {
                arrayList.add(registrationRecord);
            }
        }
        return arrayList;
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public String getValue(String str) {
        return this.f63531c.kvs.get(str);
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public boolean hasRegistrations() {
        return this.f63531c.regs.size() > 0;
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void removeAllRegistrations() {
        this.f63531c.regs = new ArrayList();
        a();
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void removeRegistration(String str, String str2, String str3) {
        Iterator<AuthenticatorDatabase.RegistrationRecord> it = this.f63531c.regs.iterator();
        while (it.hasNext()) {
            AuthenticatorDatabase.RegistrationRecord next = it.next();
            if (next.callerID.equals(str) && next.appID.equals(str2) && next.keyID.equals(str3)) {
                it.remove();
                a();
                return;
            }
        }
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void removeRegistrations(String str, String str2) {
        Iterator<AuthenticatorDatabase.RegistrationRecord> it = this.f63531c.regs.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            AuthenticatorDatabase.RegistrationRecord next = it.next();
            if (next.callerID.equals(str) && next.appID.equals(str2)) {
                it.remove();
                z10 = true;
            }
        }
        if (z10) {
            a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void storeStashId(@NonNull String str, Map<String, String> map) {
        this.f63534f.put(str, map);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void transferStashedData(@NonNull String str, @NonNull AuthenticatorDatabase.RegistrationRecord registrationRecord) {
        if (this.f63534f.containsKey(str)) {
            registrationRecord.kvs.putAll((Map) this.f63534f.get(str));
            this.f63534f.remove(str);
        }
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void updateRegistrationRecord(@NonNull AuthenticatorDatabase.RegistrationRecord registrationRecord) {
        ListIterator<AuthenticatorDatabase.RegistrationRecord> listIterator = this.f63531c.regs.listIterator();
        while (listIterator.hasNext()) {
            AuthenticatorDatabase.RegistrationRecord next = listIterator.next();
            if (next.callerID.equals(registrationRecord.callerID) && next.appID.equals(registrationRecord.appID) && next.keyID.equals(registrationRecord.keyID)) {
                listIterator.set(registrationRecord);
                a();
                return;
            }
        }
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public void validateUserRegistrations(IMatcher iMatcher) {
        Iterator<AuthenticatorDatabase.RegistrationRecord> it = this.f63531c.regs.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            AuthenticatorDatabase.RegistrationRecord next = it.next();
            String str = next.userID;
            if (str != null && !str.equals("")) {
                try {
                    if (!iMatcher.isUserIDValid(Base64.decode(next.userID, 0))) {
                        z10 = true;
                        Logger.d("BoundAuthenticatorDatabase", String.format("UserID (%s) not valid. Removing the record.", next.userID));
                        it.remove();
                    }
                } catch (AuthenticatorException e5) {
                    Logger.e("BoundAuthenticatorDatabase", "Failed to execute Matcher.isIDValid. Do not run cleanup.", e5);
                }
            }
        }
        if (z10) {
            a();
        }
    }

    @Override // com.noknok.android.uaf.asmcore.AuthenticatorDatabase
    public List<AuthenticatorDatabase.RegistrationRecord> getRegistrations() {
        return new ArrayList(this.f63531c.regs);
    }
}
