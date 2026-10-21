package com.google.mlkit.common.sdkinternal.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.ktx.BuildConfig;
import com.google.mlkit.common.MlKitException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
@WorkerThread
public class ModelLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GmsLogger f49452b = new GmsLogger("ModelLoader", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ModelLoadingLogger f49453a;

    @Nullable
    @KeepForSdk
    public final LocalModelLoader localModelLoader;

    @NonNull
    @KeepForSdk
    protected ModelLoadingState modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;

    @Nullable
    @KeepForSdk
    @VisibleForTesting
    public final RemoteModelLoader remoteModelLoader;

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public interface ModelContentHandler {
        @KeepForSdk
        void constructModel(@NonNull MappedByteBuffer mappedByteBuffer) throws MlKitException;
    }

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public interface ModelLoadingLogger {
        @KeepForSdk
        void logErrorCodes(@NonNull List<Integer> list);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public static final class ModelLoadingState {

        @NonNull
        @KeepForSdk
        public static final ModelLoadingState LOCAL_MODEL_LOADED;

        @NonNull
        @KeepForSdk
        public static final ModelLoadingState NO_MODEL_LOADED;

        @NonNull
        @KeepForSdk
        public static final ModelLoadingState REMOTE_MODEL_LOADED;
        private static final /* synthetic */ ModelLoadingState[] zza;

        static {
            ModelLoadingState modelLoadingState = new ModelLoadingState("NO_MODEL_LOADED", 0);
            NO_MODEL_LOADED = modelLoadingState;
            ModelLoadingState modelLoadingState2 = new ModelLoadingState("REMOTE_MODEL_LOADED", 1);
            REMOTE_MODEL_LOADED = modelLoadingState2;
            ModelLoadingState modelLoadingState3 = new ModelLoadingState("LOCAL_MODEL_LOADED", 2);
            LOCAL_MODEL_LOADED = modelLoadingState3;
            zza = new ModelLoadingState[]{modelLoadingState, modelLoadingState2, modelLoadingState3};
        }

        @NonNull
        public static ModelLoadingState[] values() {
            return (ModelLoadingState[]) zza.clone();
        }
    }

    @KeepForSdk
    public ModelLoader(@Nullable RemoteModelLoader remoteModelLoader, @Nullable LocalModelLoader localModelLoader, @NonNull ModelLoadingLogger modelLoadingLogger) {
        boolean z10 = true;
        if (remoteModelLoader == null && localModelLoader == null) {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        Preconditions.checkNotNull(modelLoadingLogger);
        this.remoteModelLoader = remoteModelLoader;
        this.localModelLoader = localModelLoader;
        this.f49453a = modelLoadingLogger;
    }

    public final String a() {
        LocalModelLoader localModelLoader = this.localModelLoader;
        String string = null;
        if (localModelLoader != null) {
            if (localModelLoader.getLocalModel().getAssetFilePath() != null) {
                string = this.localModelLoader.getLocalModel().getAssetFilePath();
            } else if (this.localModelLoader.getLocalModel().getAbsoluteFilePath() != null) {
                string = this.localModelLoader.getLocalModel().getAbsoluteFilePath();
            } else if (this.localModelLoader.getLocalModel().getUri() != null) {
                string = ((Uri) Preconditions.checkNotNull(this.localModelLoader.getLocalModel().getUri())).toString();
            }
        }
        RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        return String.format("Local model path: %s. Remote model name: %s. ", string, remoteModelLoader == null ? BuildConfig.VERSION_NAME : remoteModelLoader.getRemoteModel().getUniqueModelNameForPersist());
    }

    public final synchronized boolean b(ModelContentHandler modelContentHandler, ArrayList arrayList) throws MlKitException {
        MappedByteBuffer mappedByteBufferLoad;
        LocalModelLoader localModelLoader = this.localModelLoader;
        if (localModelLoader == null || (mappedByteBufferLoad = localModelLoader.load()) == null) {
            return false;
        }
        try {
            modelContentHandler.constructModel(mappedByteBufferLoad);
            f49452b.d("ModelLoader", "Local model source is loaded successfully");
            return true;
        } catch (RuntimeException e5) {
            arrayList.add(18);
            throw e5;
        }
    }

    public final synchronized boolean c(ModelContentHandler modelContentHandler, ArrayList arrayList) throws MlKitException {
        RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        if (remoteModelLoader != null) {
            try {
                MappedByteBuffer mappedByteBufferLoad = remoteModelLoader.load();
                if (mappedByteBufferLoad != null) {
                    try {
                        modelContentHandler.constructModel(mappedByteBufferLoad);
                        f49452b.d("ModelLoader", "Remote model source is loaded successfully");
                        return true;
                    } catch (RuntimeException e5) {
                        arrayList.add(19);
                        throw e5;
                    }
                }
                f49452b.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                arrayList.add(21);
            } catch (MlKitException e7) {
                f49452b.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                arrayList.add(20);
                throw e7;
            }
        }
        return false;
    }

    @KeepForSdk
    public synchronized boolean isRemoteModelLoaded() {
        return this.modelLoadingState == ModelLoadingState.REMOTE_MODEL_LOADED;
    }

    @KeepForSdk
    public synchronized void loadWithModelContentHandler(@NonNull ModelContentHandler modelContentHandler) throws MlKitException {
        Exception exc;
        boolean zC;
        ArrayList arrayList = new ArrayList();
        boolean zB = false;
        Exception e5 = null;
        try {
            zC = c(modelContentHandler, arrayList);
            exc = null;
        } catch (Exception e7) {
            exc = e7;
            zC = false;
        }
        if (zC) {
            this.f49453a.logErrorCodes(arrayList);
            this.modelLoadingState = ModelLoadingState.REMOTE_MODEL_LOADED;
            return;
        }
        try {
            zB = b(modelContentHandler, arrayList);
        } catch (Exception e10) {
            e5 = e10;
        }
        if (zB) {
            this.f49453a.logErrorCodes(arrayList);
            this.modelLoadingState = ModelLoadingState.LOCAL_MODEL_LOADED;
            return;
        }
        arrayList.add(17);
        this.f49453a.logErrorCodes(arrayList);
        this.modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;
        if (exc != null) {
            throw new MlKitException("Remote model load failed with the model options: ".concat(String.valueOf(a())), 14, exc);
        }
        if (e5 == null) {
            throw new MlKitException("Cannot load any model with the model options: ".concat(String.valueOf(a())), 14);
        }
        throw new MlKitException("Local model load failed with the model options: ".concat(String.valueOf(a())), 14, e5);
    }
}
