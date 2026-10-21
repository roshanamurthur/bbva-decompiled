package com.google.android.gms.wearable;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ChannelClient extends GoogleApi<Wearable.WearableOptions> {
    public static final String ACTION_CHANNEL_EVENT = "com.google.android.gms.wearable.CHANNEL_EVENT";

    public interface Channel extends Parcelable {
        String getNodeId();

        String getPath();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CloseReason {
    }

    public ChannelClient(@NonNull Context context, @NonNull GoogleApi.Settings settings) {
        super(context, Wearable.API, (Api.ApiOptions) null, settings);
    }

    public abstract Task<Void> close(@NonNull Channel channel);

    public abstract Task<Void> close(@NonNull Channel channel, int i10);

    public abstract Task<InputStream> getInputStream(@NonNull Channel channel);

    public abstract Task<OutputStream> getOutputStream(@NonNull Channel channel);

    public abstract Task<Channel> openChannel(@NonNull String str, @NonNull String str2);

    public abstract Task<Void> receiveFile(@NonNull Channel channel, @NonNull Uri uri, boolean z10);

    public abstract Task<Void> registerChannelCallback(@NonNull Channel channel, @NonNull ChannelCallback channelCallback);

    public abstract Task<Void> registerChannelCallback(@NonNull ChannelCallback channelCallback);

    public abstract Task<Void> sendFile(@NonNull Channel channel, @NonNull Uri uri);

    public abstract Task<Void> sendFile(@NonNull Channel channel, @NonNull Uri uri, long j10, long j11);

    public abstract Task<Boolean> unregisterChannelCallback(@NonNull Channel channel, @NonNull ChannelCallback channelCallback);

    public abstract Task<Boolean> unregisterChannelCallback(@NonNull ChannelCallback channelCallback);

    public ChannelClient(@NonNull Activity activity, @NonNull GoogleApi.Settings settings) {
        super(activity, (Api<Api.ApiOptions>) Wearable.API, (Api.ApiOptions) null, settings);
    }

    public static abstract class ChannelCallback {
        public static final int CLOSE_REASON_DISCONNECTED = 1;
        public static final int CLOSE_REASON_LOCAL_CLOSE = 3;
        public static final int CLOSE_REASON_NORMAL = 0;
        public static final int CLOSE_REASON_REMOTE_CLOSE = 2;

        public void onChannelOpened(@NonNull Channel channel) {
        }

        public void onChannelClosed(@NonNull Channel channel, int i10, int i11) {
        }

        public void onInputClosed(@NonNull Channel channel, int i10, int i11) {
        }

        public void onOutputClosed(@NonNull Channel channel, int i10, int i11) {
        }
    }
}
