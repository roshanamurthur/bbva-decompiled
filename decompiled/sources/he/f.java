package he;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* JADX INFO: compiled from: ResourcesLoaderUtils.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(api = 30)
public final class f {
    public static boolean a(Context context, Map<Integer, Integer> map) throws Throwable {
        FileDescriptor fileDescriptorMemfd_create;
        ResourcesLoader resourcesLoader = null;
        try {
            byte[] bArrC = c.c(context, map);
            int length = bArrC.length;
            if (bArrC.length != 0) {
                try {
                    fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
                    try {
                        if (fileDescriptorMemfd_create == null) {
                            Log.w("ColorResLoaderCreator", "Cannot create memory file descriptor.");
                            if (fileDescriptorMemfd_create != null) {
                                Os.close(fileDescriptorMemfd_create);
                            }
                        } else {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                            try {
                                fileOutputStream.write(bArrC);
                                ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                                try {
                                    a.a();
                                    ResourcesLoader resourcesLoaderA = androidx.camera.camera2.internal.b.a();
                                    resourcesLoaderA.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                                    if (parcelFileDescriptorDup != null) {
                                        parcelFileDescriptorDup.close();
                                    }
                                    fileOutputStream.close();
                                    Os.close(fileDescriptorMemfd_create);
                                    resourcesLoader = resourcesLoaderA;
                                } catch (Throwable th2) {
                                    if (parcelFileDescriptorDup != null) {
                                        try {
                                            parcelFileDescriptorDup.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        if (fileDescriptorMemfd_create != null) {
                            Os.close(fileDescriptorMemfd_create);
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    fileDescriptorMemfd_create = null;
                }
            }
        } catch (Exception unused) {
        }
        if (resourcesLoader == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoader);
        return true;
    }
}
