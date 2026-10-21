package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class ParcelFileDescriptorRewinder implements DataRewinder<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InternalRewinder f38163a;

    @RequiresApi(21)
    public static final class Factory implements DataRewinder.Factory<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public Class<ParcelFileDescriptor> getDataClass() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public DataRewinder<ParcelFileDescriptor> build(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @RequiresApi(21)
    public static final class InternalRewinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f38164a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f38164a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.f38164a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e5) {
                throw new IOException(e5);
            }
        }
    }

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f38163a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean isSupported() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.DataRewinder
    @NonNull
    @RequiresApi(21)
    public ParcelFileDescriptor rewindAndGet() throws IOException {
        return this.f38163a.rewind();
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }
}
