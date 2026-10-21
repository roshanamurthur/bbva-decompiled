package com.huawei.hms.feature.broadcast;

import android.content.Context;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50183a = "LocalApk-FeatureCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f50184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.feature.dynamicinstall.h f50185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.huawei.hms.feature.dynamicinstall.d f50186d = new com.huawei.hms.feature.dynamicinstall.d();

    /* JADX INFO: renamed from: com.huawei.hms.feature.broadcast.a$a, reason: collision with other inner class name */
    public class RunnableC0222a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f50187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f50188b;

        public RunnableC0222a(f fVar, List list) {
            this.f50187a = fVar;
            this.f50188b = list;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl intercept");
            try {
                boolean booleanExtra = new SafeIntent(this.f50187a.b()).getBooleanExtra("triggered_by_app", false);
                if (!booleanExtra) {
                    a.this.e(this.f50188b);
                    booleanExtra = c.a(a.this.f50185c, (List<Intent>) this.f50188b);
                }
                Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl intercept isExist : " + booleanExtra);
                if (!booleanExtra) {
                    a.this.b((List<Intent>) this.f50188b, this.f50187a);
                    return;
                }
                Logger.i("LocalApk-FeatureCompat", "Verify file exist,begin install");
                a.this.d(this.f50188b);
                a.this.a(this.f50187a);
            } catch (Exception e5) {
                Logger.e("LocalApk-FeatureCompat", "Checking verified files failed .", e5);
                this.f50187a.a(-11);
            }
        }
    }

    public a(Context context, com.huawei.hms.feature.dynamicinstall.h hVar) {
        this.f50184b = context;
        this.f50185c = hVar;
    }

    private final int b(List<Intent> list) {
        try {
            c(list);
            Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl Splits copied.");
            try {
                if (c.a(this.f50184b, this.f50185c)) {
                    Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl Splits verified.");
                    return 0;
                }
                Logger.e("LocalApk-FeatureCompat", "BroadcastInterceptorImpl Split verification failed.");
                return -11;
            } catch (Exception e5) {
                Logger.e("LocalApk-FeatureCompat", "Verifying splits failed.", e5);
                return -11;
            }
        } catch (Exception e7) {
            Logger.e("LocalApk-FeatureCompat", "Copying splits failed .", e7);
            return -13;
        }
    }

    private void c(List<Intent> list) throws IOException {
        Logger.i("LocalApk-FeatureCompat", "begin  rename  temp file to UnVerified file");
        Iterator<Intent> it = list.iterator();
        while (it.hasNext()) {
            String stringExtra = it.next().getStringExtra(com.huawei.hms.feature.model.b.f50442l);
            if (!TextUtils.isEmpty(stringExtra)) {
                File fileG = this.f50185c.g(stringExtra);
                Logger.d("LocalApk-FeatureCompat", "begin  rename temp file  " + stringExtra);
                if (fileG.exists() && this.f50185c.h(stringExtra).exists()) {
                    com.huawei.hms.feature.utils.c.a(this.f50185c.h(stringExtra));
                }
                if (fileG.exists() && this.f50185c.i(stringExtra).exists()) {
                    com.huawei.hms.feature.utils.c.a(this.f50185c.i(stringExtra));
                }
                if (!this.f50185c.h(stringExtra).exists() && !this.f50185c.i(stringExtra).exists()) {
                    Logger.i("RemoteFeatureCompat", "copy split_id " + stringExtra);
                    Logger.i("LocalApk-FeatureCompat", "end  rename temp file ,reuslt: " + fileG.renameTo(this.f50185c.h(stringExtra)));
                }
            }
        }
        Logger.i("LocalApk-FeatureCompat", "end  rename  temp file to UnVerified file");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<Intent> list) {
        Logger.i("LocalApk-FeatureCompat", "begin  delete  temp file before install ");
        Iterator<Intent> it = list.iterator();
        while (it.hasNext()) {
            String stringExtra = it.next().getStringExtra(com.huawei.hms.feature.model.b.f50442l);
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    if (this.f50185c.g(stringExtra).exists()) {
                        com.huawei.hms.feature.utils.c.a(this.f50185c.g(stringExtra));
                    }
                } catch (IOException unused) {
                    Logger.w("LocalApk-FeatureCompat", " delete  temp file encoutor error ");
                }
            }
        }
        Logger.i("LocalApk-FeatureCompat", "end  delete  temp file before install ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<Intent> list) throws Throwable {
        File fileA;
        Logger.i("LocalApk-FeatureCompat", "begin reset  SessionStateIntents");
        for (Intent intent : list) {
            try {
                fileA = a(intent);
            } catch (IOException e5) {
                Logger.e("LocalApk-FeatureCompat", "Error hapened: ", e5);
                fileA = null;
            }
            intent.putExtra(com.huawei.hms.feature.model.b.f50442l, fileA != null ? fileA.getName() : "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.huawei.hms.feature.broadcast.a] */
    private File a(Intent intent) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor;
        Object obj;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        String str;
        Logger.i("LocalApk-FeatureCompat", "begin reset :  ");
        String strA = com.huawei.hms.feature.utils.c.a(10);
        Logger.i("LocalApk-FeatureCompat", "temp file name :  " + strA);
        File fileG = this.f50185c.g(strA);
        if (fileG.exists()) {
            Logger.d("LocalApk-FeatureCompat", "begin delete old file :  " + fileG.getCanonicalPath());
            com.huawei.hms.feature.utils.c.a(fileG);
        }
        Logger.i("LocalApk-FeatureCompat", "begin get  data from market   ");
        ?? r3 = 0;
        try {
            if (intent.getData() == null) {
                Logger.w("LocalApk-FeatureCompat", "get intent data error.");
                return null;
            }
            String str2 = "r";
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f50184b.getContentResolver().openFileDescriptor(intent.getData(), "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    str = str2;
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    obj = fileInputStream;
                } catch (Exception e5) {
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    e = e5;
                    Logger.e("LocalApk-FeatureCompat", "remote file is not found", e);
                    parcelFileDescriptorOpenFileDescriptor = parcelFileDescriptor;
                    str = "remote file is not found";
                    str = str2;
                    bufferedInputStream = null;
                    obj = str;
                }
            } else {
                str = str2;
                bufferedInputStream = null;
                obj = str;
            }
            try {
                if (bufferedInputStream == null) {
                    Logger.w("LocalApk-FeatureCompat", "get file error,  bufferedInputStream is null  ");
                } else {
                    try {
                        fileOutputStream = new FileOutputStream(fileG);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = bufferedInputStream.read(bArr);
                                if (i10 <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i10);
                            }
                            if (c.a(this.f50184b, fileG)) {
                                File fileG2 = this.f50185c.g(com.huawei.hms.feature.utils.f.a(fileG));
                                Logger.i("LocalApk-FeatureCompat", "end get  data from market");
                                Logger.i("LocalApk-FeatureCompat", fileG.getName() + " rename to  " + fileG2.getName());
                                fileG.renameTo(fileG2);
                                a(bufferedInputStream);
                                a(fileOutputStream);
                                a(parcelFileDescriptorOpenFileDescriptor);
                                return fileG2;
                            }
                            a(fileG);
                            a(bufferedInputStream);
                            a(fileOutputStream);
                        } catch (Exception unused) {
                            a(fileG);
                            Logger.w("LocalApk-FeatureCompat", "copy exception");
                        }
                    } catch (Exception unused2) {
                        fileOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        a(bufferedInputStream);
                        a(r3);
                        a(parcelFileDescriptorOpenFileDescriptor);
                        throw th;
                    }
                }
                a(parcelFileDescriptorOpenFileDescriptor);
                return null;
            } catch (Throwable th3) {
                th = th3;
                r3 = obj;
            }
        } catch (Exception e7) {
            e = e7;
            parcelFileDescriptor = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private final Integer a(List<Intent> list) throws Throwable {
        ?? r10;
        FileLock fileLockTryLock;
        Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl copyFromMarket");
        ?? ValueOf = 0;
        ValueOf = 0;
        ValueOf = 0;
        FileChannel fileChannel = null;
        try {
            try {
                FileChannel channel = new RandomAccessFile(this.f50185c.c(), RootService.RW).getChannel();
                try {
                    try {
                        fileLockTryLock = channel.tryLock();
                    } catch (OverlappingFileLockException unused) {
                        fileLockTryLock = null;
                    }
                    if (fileLockTryLock != null) {
                        ValueOf = Integer.valueOf(b(list));
                        fileLockTryLock.release();
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Exception e5) {
                            Logger.e("LocalApk-FeatureCompat", "Locking files failed", e5);
                            return -13;
                        }
                    }
                } catch (FileNotFoundException unused2) {
                    r10 = ValueOf;
                    fileChannel = channel;
                    Logger.e("LocalApk-FeatureCompat", "copy-from-market file not found.");
                    if (fileChannel != null) {
                        channel = fileChannel;
                        ValueOf = r10;
                        channel.close();
                    } else {
                        ValueOf = r10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ValueOf = channel;
                    if (ValueOf != 0) {
                        ValueOf.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException unused3) {
            r10 = 0;
        }
        return ValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(List<Intent> list, f fVar) throws Throwable {
        Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl copyEmulatedInstall");
        Integer numA = a(list);
        if (numA == null) {
            return;
        }
        Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl copyEmulatedInstall installFlag : " + numA);
        if (numA.intValue() == 0) {
            fVar.a();
        } else {
            fVar.a(numA.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(f fVar) {
        Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl emulatedInstall");
        try {
            if (this.f50186d.a(this.f50184b.getApplicationContext())) {
                Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl Splits installed.");
                fVar.c();
            } else {
                Logger.e("LocalApk-FeatureCompat", "BroadcastInterceptorImpl Emulating splits failed.");
                fVar.a(-12);
            }
        } catch (Exception e5) {
            Logger.e("LocalApk-FeatureCompat", "Error emulating splits.", e5);
            fVar.a(-12);
        }
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Logger.d("LocalApk-FeatureCompat", "close exception");
            }
        }
    }

    private void a(File file) {
        if (file != null) {
            try {
                com.huawei.hms.feature.utils.c.a(file);
            } catch (IOException unused) {
                Logger.w("LocalApk-FeatureCompat", "delete file error: " + file.getName() + " ");
            }
        }
    }

    @Override // com.huawei.hms.feature.broadcast.g
    public void a(List<Intent> list, f fVar) {
        if (!this.f50186d.a()) {
            throw new IllegalStateException("App not in SplitCompat mode.");
        }
        Logger.i("LocalApk-FeatureCompat", "BroadcastInterceptorImpl isInSplitMode");
        com.huawei.hms.feature.dynamicinstall.c.a().execute(new RunnableC0222a(fVar, list));
    }
}
