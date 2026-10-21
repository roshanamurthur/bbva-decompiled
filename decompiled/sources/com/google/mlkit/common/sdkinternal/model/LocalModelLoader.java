package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.camera.camera2.internal.h0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.LocalModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class LocalModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MappedByteBuffer f49446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f49447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalModel f49448c;

    @KeepForSdk
    public LocalModelLoader(@NonNull Context context, @NonNull LocalModel localModel) {
        this.f49447b = context;
        this.f49448c = localModel;
    }

    @NonNull
    @KeepForSdk
    public LocalModel getLocalModel() {
        return this.f49448c;
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public MappedByteBuffer load() throws MlKitException {
        Context context = this.f49447b;
        Preconditions.checkNotNull(context, "Context can not be null");
        LocalModel localModel = this.f49448c;
        Preconditions.checkNotNull(localModel, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.f49446a;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        String assetFilePath = localModel.getAssetFilePath();
        Uri uri = localModel.getUri();
        if (absoluteFilePath != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(absoluteFilePath, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        this.f49446a = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                        channel.close();
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException e5) {
                throw new MlKitException("Can not open the local file: ".concat(String.valueOf(localModel.getAbsoluteFilePath())), 14, e5);
            }
        } else if (assetFilePath != null) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(assetFilePath);
                try {
                    FileChannel channel2 = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel();
                    try {
                        this.f49446a = channel2.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
                        channel2.close();
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th6) {
                        if (channel2 != null) {
                            try {
                                channel2.close();
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                        }
                    }
                    throw th8;
                }
            } catch (IOException e7) {
                throw new MlKitException(h0.b("Can not load the file from asset: ", assetFilePath, ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"), 14, e7);
            }
        } else {
            if (uri == null) {
                throw new MlKitException("Can not load the model. One of filePath, assetFilePath or URI must be set for the model.", 14);
            }
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(context, uri, "r");
                try {
                    FileChannel channel3 = assetFileDescriptorZza.createInputStream().getChannel();
                    try {
                        this.f49446a = channel3.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorZza.getStartOffset(), assetFileDescriptorZza.getLength());
                        channel3.close();
                        assetFileDescriptorZza.close();
                    } catch (Throwable th10) {
                        if (channel3 != null) {
                            try {
                                channel3.close();
                            } catch (Throwable th11) {
                                th10.addSuppressed(th11);
                            }
                        }
                        throw th10;
                    }
                } catch (Throwable th12) {
                    if (assetFileDescriptorZza != null) {
                        try {
                            assetFileDescriptorZza.close();
                        } catch (Throwable th13) {
                            th12.addSuppressed(th13);
                        }
                    }
                    throw th12;
                }
            } catch (IOException e10) {
                throw new MlKitException("Can not load the file from URI: ".concat(uri.toString()), 14, e10);
            }
        }
        return this.f49446a;
    }
}
