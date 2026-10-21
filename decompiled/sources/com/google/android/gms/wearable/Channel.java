package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public interface Channel extends Parcelable {

    @Deprecated
    public interface GetInputStreamResult extends Releasable, Result {
        @Nullable
        InputStream getInputStream();
    }

    @Deprecated
    public interface GetOutputStreamResult extends Releasable, Result {
        @Nullable
        OutputStream getOutputStream();
    }

    PendingResult<Status> addListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener);

    PendingResult<Status> close(GoogleApiClient googleApiClient);

    PendingResult<Status> close(GoogleApiClient googleApiClient, int i10);

    PendingResult<GetInputStreamResult> getInputStream(GoogleApiClient googleApiClient);

    String getNodeId();

    PendingResult<GetOutputStreamResult> getOutputStream(GoogleApiClient googleApiClient);

    String getPath();

    PendingResult<Status> receiveFile(GoogleApiClient googleApiClient, Uri uri, boolean z10);

    PendingResult<Status> removeListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener);

    PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri);

    PendingResult<Status> sendFile(GoogleApiClient googleApiClient, Uri uri, long j10, long j11);
}
