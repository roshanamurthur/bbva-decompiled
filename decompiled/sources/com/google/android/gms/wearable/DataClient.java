package com.google.android.gms.wearable;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.tasks.Task;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DataClient extends GoogleApi<Wearable.WearableOptions> {
    public static final String ACTION_DATA_CHANGED = "com.google.android.gms.wearable.DATA_CHANGED";
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilterType {
    }

    public static abstract class GetFdForAssetResponse implements Releasable {
        public abstract ParcelFileDescriptor getFdForAsset();

        public abstract InputStream getInputStream();
    }

    public interface OnDataChangedListener extends DataApi.DataListener {
        @Override // com.google.android.gms.wearable.DataApi.DataListener
        void onDataChanged(@NonNull DataEventBuffer dataEventBuffer);
    }

    public DataClient(@NonNull Context context, @NonNull GoogleApi.Settings settings) {
        super(context, Wearable.API, (Api.ApiOptions) null, settings);
    }

    public abstract Task<Void> addListener(@NonNull OnDataChangedListener onDataChangedListener);

    public abstract Task<Void> addListener(@NonNull OnDataChangedListener onDataChangedListener, @NonNull Uri uri, int i10);

    public abstract Task<Integer> deleteDataItems(@NonNull Uri uri);

    public abstract Task<Integer> deleteDataItems(@NonNull Uri uri, int i10);

    public abstract Task<DataItem> getDataItem(@NonNull Uri uri);

    public abstract Task<DataItemBuffer> getDataItems();

    public abstract Task<DataItemBuffer> getDataItems(@NonNull Uri uri);

    public abstract Task<DataItemBuffer> getDataItems(@NonNull Uri uri, int i10);

    public abstract Task<GetFdForAssetResponse> getFdForAsset(@NonNull Asset asset);

    public abstract Task<GetFdForAssetResponse> getFdForAsset(@NonNull DataItemAsset dataItemAsset);

    public abstract Task<DataItem> putDataItem(@NonNull PutDataRequest putDataRequest);

    public abstract Task<Boolean> removeListener(@NonNull OnDataChangedListener onDataChangedListener);

    public DataClient(@NonNull Activity activity, @NonNull GoogleApi.Settings settings) {
        super(activity, (Api<Api.ApiOptions>) Wearable.API, (Api.ApiOptions) null, settings);
    }
}
