package com.google.android.gms.wearable;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public abstract class MessageClient extends GoogleApi<Wearable.WearableOptions> {
    public static final String ACTION_MESSAGE_RECEIVED = "com.google.android.gms.wearable.MESSAGE_RECEIVED";
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilterType {
    }

    public interface OnMessageReceivedListener extends MessageApi.MessageListener {
        @Override // com.google.android.gms.wearable.MessageApi.MessageListener
        void onMessageReceived(@NonNull MessageEvent messageEvent);
    }

    public MessageClient(@NonNull Context context, @NonNull GoogleApi.Settings settings) {
        super(context, Wearable.API, (Api.ApiOptions) null, settings);
    }

    public abstract Task<Void> addListener(@NonNull OnMessageReceivedListener onMessageReceivedListener);

    public abstract Task<Void> addListener(@NonNull OnMessageReceivedListener onMessageReceivedListener, @NonNull Uri uri, int i10);

    public abstract Task<Boolean> removeListener(@NonNull OnMessageReceivedListener onMessageReceivedListener);

    public abstract Task<Integer> sendMessage(@NonNull String str, @NonNull String str2, @Nullable byte[] bArr);

    public MessageClient(@NonNull Activity activity, @NonNull GoogleApi.Settings settings) {
        super(activity, (Api<Api.ApiOptions>) Wearable.API, (Api.ApiOptions) null, settings);
    }
}
