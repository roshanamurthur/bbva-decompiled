package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class AFa1jSDK implements AFa1fSDK {
    private final AFb1bSDK AFInAppEventType;

    public static final class AFa1wSDK {
        final String AFInAppEventParameterName;
        private final boolean values;

        public AFa1wSDK(String str, boolean z10) {
            this.AFInAppEventParameterName = str;
            this.values = z10;
        }

        public final boolean AFKeystoreWrapper() {
            return this.values;
        }
    }

    public static final class AFa1zSDK implements IInterface {
        private final IBinder AFKeystoreWrapper;

        public AFa1zSDK(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        public final boolean AFInAppEventType() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        public final String valueOf() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public AFa1jSDK() {
    }

    public AFa1jSDK(AFb1bSDK aFb1bSDK) {
        this.AFInAppEventType = aFb1bSDK;
    }

    public static AFa1wSDK AFInAppEventType(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1xSDK aFa1xSDK = new AFa1xSDK((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1xSDK, 1)) {
                context.unbindService(aFa1xSDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1xSDK.AFInAppEventParameterName) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1xSDK.AFInAppEventParameterName = true;
            IBinder iBinderPoll = aFa1xSDK.valueOf.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1zSDK aFa1zSDK = new AFa1zSDK(iBinderPoll);
            AFa1wSDK aFa1wSDK = new AFa1wSDK(aFa1zSDK.valueOf(), aFa1zSDK.AFInAppEventType());
            context.unbindService(aFa1xSDK);
            return aFa1wSDK;
        } catch (Throwable th2) {
            context.unbindService(aFa1xSDK);
            throw th2;
        }
    }

    @Override // com.appsflyer.internal.AFa1fSDK
    @WorkerThread
    public final void AFInAppEventParameterName() {
        try {
            if (new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e5) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e5);
        }
    }

    @Override // com.appsflyer.internal.AFa1fSDK
    @NonNull
    @WorkerThread
    public final List<AFa1rSDK> AFKeystoreWrapper() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return arrayList;
            }
            for (File file2 : fileArrListFiles) {
                StringBuilder sb2 = new StringBuilder("CACHE: Found cached request");
                sb2.append(file2.getName());
                AFLogger.afInfoLog(sb2.toString());
                arrayList.add(AFInAppEventType(file2));
            }
        } catch (Exception e5) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e5);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFa1fSDK
    @Nullable
    @WorkerThread
    public final String valueOf(AFa1rSDK aFa1rSDK) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            File file = new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return null;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 40) {
                AFLogger.afInfoLog("CACHE: reached cache limit, not caching request");
                return null;
            }
            StringBuilder sb2 = new StringBuilder("CACHE: caching request with URL: ");
            sb2.append(aFa1rSDK.values);
            AFLogger.afInfoLog(sb2.toString());
            String string = Long.toString(System.currentTimeMillis());
            File file2 = new File(new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache"), string);
            file2.createNewFile();
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true), Charset.defaultCharset());
            try {
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFa1rSDK.valueOf);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFa1rSDK.values);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFa1rSDK.valueOf(), 2));
                    outputStreamWriter.write(10);
                    AFd1vSDK aFd1vSDK = aFa1rSDK.AFInAppEventParameterName;
                    if (aFd1vSDK != null) {
                        outputStreamWriter.write("type=");
                        outputStreamWriter.write(aFd1vSDK.name());
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    AFLogger.afInfoLog("CACHE: done, cacheKey: ".concat(String.valueOf(string)));
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e5) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e5);
                    }
                    return string;
                } catch (Exception e7) {
                    e = e7;
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e10) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e10);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                if (outputStreamWriter2 != null) {
                    try {
                        outputStreamWriter2.close();
                    } catch (IOException e11) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e11);
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            outputStreamWriter = null;
        } catch (Throwable th3) {
            th = th3;
            if (outputStreamWriter2 != null) {
                outputStreamWriter2.close();
            }
            throw th;
        }
    }

    public static final class AFa1xSDK implements ServiceConnection {
        boolean AFInAppEventParameterName;
        final LinkedBlockingQueue<IBinder> valueOf;

        private AFa1xSDK() {
            this.valueOf = new LinkedBlockingQueue<>(1);
            this.AFInAppEventParameterName = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.valueOf.put(iBinder);
            } catch (InterruptedException e5) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e5);
            }
        }

        public /* synthetic */ AFa1xSDK(byte b10) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    private static AFa1rSDK AFInAppEventType(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                try {
                    char[] cArr = new char[(int) file.length()];
                    inputStreamReader.read(cArr);
                    AFa1rSDK aFa1rSDK = new AFa1rSDK(cArr);
                    aFa1rSDK.AFKeystoreWrapper = file.getName();
                    try {
                        inputStreamReader.close();
                    } catch (IOException e5) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e5);
                    }
                    return aFa1rSDK;
                } catch (Exception e7) {
                    e = e7;
                    AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", e);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e10) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e10);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader2 = inputStreamReader;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException e11) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e11);
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFa1fSDK
    @WorkerThread
    public final boolean valueOf(String str) {
        File file = new File(new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
        sb2.append(str);
        sb2.append(" from cache");
        AFLogger.afInfoLog(sb2.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e5) {
            StringBuilder sb3 = new StringBuilder("CACHE: Could not delete ");
            sb3.append(str);
            sb3.append(" from cache");
            AFLogger.afErrorLog(sb3.toString(), e5);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFa1fSDK
    @WorkerThread
    public final void valueOf() {
        try {
            File file = new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                StringBuilder sb2 = new StringBuilder("CACHE: Found cached request");
                sb2.append(file2.getName());
                AFLogger.afInfoLog(sb2.toString());
                StringBuilder sb3 = new StringBuilder("CACHE: Deleting ");
                sb3.append(file2.getName());
                sb3.append(" from cache");
                AFLogger.afInfoLog(sb3.toString());
                file2.delete();
            }
        } catch (Exception e5) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e5);
        }
    }
}
