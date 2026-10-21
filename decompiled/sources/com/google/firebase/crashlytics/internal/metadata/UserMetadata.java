package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import yf.c;
import yf.e;
import yf.h;

/* JADX INFO: loaded from: classes10.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";

    @VisibleForTesting
    public static final int MAX_ATTRIBUTES = 64;

    @VisibleForTesting
    public static final int MAX_ATTRIBUTE_SIZE = 1024;

    @VisibleForTesting
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;

    @VisibleForTesting
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f47849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsBackgroundWorker f47850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f47851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f47852d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f47853e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RolloutAssignmentList f47854f = new RolloutAssignmentList(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicMarkableReference<String> f47855g = new AtomicMarkableReference<>(null, false);

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference<c> f47856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<Callable<Void>> f47857b = new AtomicReference<>(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f47858c;

        public a(boolean z10) {
            this.f47858c = z10;
            this.f47856a = new AtomicMarkableReference<>(new c(z10 ? 8192 : 1024), false);
        }

        public final boolean a(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f47856a.getReference().c(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<c> atomicMarkableReference = this.f47856a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    h hVar = new h(this, 0);
                    AtomicReference<Callable<Void>> atomicReference = this.f47857b;
                    while (!atomicReference.compareAndSet(null, hVar)) {
                        if (atomicReference.get() != null) {
                            return true;
                        }
                    }
                    UserMetadata.this.f47850b.submit(hVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        this.f47851c = str;
        this.f47849a = new e(fileStore);
        this.f47850b = crashlyticsBackgroundWorker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) throws Throwable {
        ?? EmptyList;
        e eVar = new e(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsBackgroundWorker);
        userMetadata.f47852d.f47856a.getReference().d(eVar.c(str, false));
        userMetadata.f47853e.f47856a.getReference().d(eVar.c(str, true));
        userMetadata.f47855g.set(eVar.d(str), false);
        File sessionFile = fileStore.getSessionFile(str, ROLLOUTS_STATE_FILENAME);
        if (!sessionFile.exists() || sessionFile.length() == 0) {
            e.f(sessionFile);
            EmptyList = Collections.emptyList();
        } else {
            EmptyList = 0;
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(sessionFile);
                    try {
                        ArrayList arrayListB = e.b(CommonUtils.streamToString(fileInputStream2));
                        Logger.getLogger().d("Loaded rollouts state:\n" + arrayListB + "\nfor session " + str);
                        CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                        EmptyList = arrayListB;
                    } catch (Exception e5) {
                        e = e5;
                        fileInputStream = fileInputStream2;
                        Logger.getLogger().w("Error deserializing rollouts state.", e);
                        e.f(sessionFile);
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                        EmptyList = Collections.emptyList();
                    } catch (Throwable th2) {
                        th = th2;
                        EmptyList = fileInputStream2;
                        CommonUtils.closeOrLog(EmptyList, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e7) {
                e = e7;
            }
        }
        userMetadata.f47854f.updateRolloutAssignmentList(EmptyList);
        return userMetadata;
    }

    @Nullable
    public static String readUserId(String str, FileStore fileStore) {
        return new e(fileStore).d(str);
    }

    public Map<String, String> getCustomKeys() {
        return this.f47852d.f47856a.getReference().a();
    }

    public Map<String, String> getInternalKeys() {
        return this.f47853e.f47856a.getReference().a();
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.f47854f.getReportRolloutsState();
    }

    @Nullable
    public String getUserId() {
        return this.f47855g.getReference();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.f47852d.a(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        a aVar = this.f47852d;
        synchronized (aVar) {
            aVar.f47856a.getReference().d(map);
            AtomicMarkableReference<c> atomicMarkableReference = aVar.f47856a;
            atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
        }
        h hVar = new h(aVar, 0);
        AtomicReference<Callable<Void>> atomicReference = aVar.f47857b;
        while (!atomicReference.compareAndSet(null, hVar)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        UserMetadata.this.f47850b.submit(hVar);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.f47853e.a(str, str2);
    }

    public void setNewSession(String str) {
        synchronized (this.f47851c) {
            try {
                this.f47851c = str;
                Map<String, String> mapA = this.f47852d.f47856a.getReference().a();
                List<RolloutAssignment> rolloutAssignmentList = this.f47854f.getRolloutAssignmentList();
                if (getUserId() != null) {
                    this.f47849a.i(str, getUserId());
                }
                if (!mapA.isEmpty()) {
                    this.f47849a.g(str, mapA, false);
                }
                if (!rolloutAssignmentList.isEmpty()) {
                    this.f47849a.h(str, rolloutAssignmentList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setUserId(String str) {
        String strB = c.b(1024, str);
        synchronized (this.f47855g) {
            try {
                if (CommonUtils.nullSafeEquals(strB, this.f47855g.getReference())) {
                    return;
                }
                this.f47855g.set(strB, true);
                this.f47850b.submit(new Callable() { // from class: yf.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        boolean z10;
                        String userId;
                        UserMetadata userMetadata = this.f94806p0;
                        synchronized (userMetadata.f47855g) {
                            try {
                                z10 = false;
                                if (userMetadata.f47855g.isMarked()) {
                                    userId = userMetadata.getUserId();
                                    userMetadata.f47855g.set(userId, false);
                                    z10 = true;
                                } else {
                                    userId = null;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z10) {
                            userMetadata.f47849a.i(userMetadata.f47851c, userId);
                        }
                        return null;
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.f47854f) {
            try {
                if (!this.f47854f.updateRolloutAssignmentList(list)) {
                    return false;
                }
                final List<RolloutAssignment> rolloutAssignmentList = this.f47854f.getRolloutAssignmentList();
                this.f47850b.submit(new Callable() { // from class: yf.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        UserMetadata userMetadata = this.f94807p0;
                        userMetadata.f47849a.h(userMetadata.f47851c, rolloutAssignmentList);
                        return null;
                    }
                });
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
