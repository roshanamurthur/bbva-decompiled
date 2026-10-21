package mx.openpay.library.data.taponphone.di;

import android.content.Context;
import com.google.gson.Gson;
import com.sun.mail.imap.IMAPStore;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ICallbackListeners;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.PinPadSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapOnPhoneDependenciesProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lmx/openpay/library/data/taponphone/di/TapOnPhoneDependenciesProvider;", "", "()V", "providePinPadSdk", "Lcom/viergegroup/sdk/taptophone/vierge/SdkTapOnPhone/PinPadSdk;", "context", "Landroid/content/Context;", "commandCallbackListeners", "Lcom/viergegroup/sdk/taptophone/vierge/SdkTapOnPhone/ICallbackListeners;", "provideResponseChannel", "Lkotlinx/coroutines/channels/Channel;", "Lmx/openpay/library/domain/util/Result;", IMAPStore.ID_COMMAND, "", "provideTapOnPhonePinPadSdkWrapper", "Lmx/openpay/library/data/taponphone/TapOnPhonePinPadSdkWrapper;", "gson", "Lcom/google/gson/Gson;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TapOnPhoneDependenciesProvider {

    @NotNull
    public static final TapOnPhoneDependenciesProvider INSTANCE = new TapOnPhoneDependenciesProvider();

    @NotNull
    public final PinPadSdk providePinPadSdk(@NotNull Context context, @NotNull ICallbackListeners commandCallbackListeners) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(commandCallbackListeners, "commandCallbackListeners");
        return new PinPadSdk(context, commandCallbackListeners);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final Channel<? extends Result<Object>> provideResponseChannel(@NotNull String command) {
        Intrinsics.checkNotNullParameter(command, "command");
        int iHashCode = command.hashCode();
        if (iHashCode == 2567) {
            if (command.equals(CommandConstants.COMMAND_Q8)) {
                return ChannelKt.Channel$default(-1, null, null, 6, null);
            }
            return null;
        }
        if (iHashCode == 66079) {
            if (command.equals(CommandConstants.COMMAND_C51)) {
                return ChannelKt.Channel$default(-1, null, null, 6, null);
            }
            return null;
        }
        if (iHashCode == 66082) {
            if (command.equals(CommandConstants.COMMAND_C54)) {
                return ChannelKt.Channel$default(-1, null, null, 6, null);
            }
            return null;
        }
        if (iHashCode == 71845) {
            if (command.equals(CommandConstants.COMMAND_I51)) {
                return ChannelKt.Channel$default(-1, null, null, 6, null);
            }
            return null;
        }
        switch (iHashCode) {
            case 88057:
                if (command.equals(CommandConstants.COMMAND_Z10)) {
                    return ChannelKt.Channel$default(-1, null, null, 6, null);
                }
                return null;
            case 88058:
                if (command.equals(CommandConstants.COMMAND_Z11)) {
                    return ChannelKt.Channel$default(-1, null, null, 6, null);
                }
                return null;
            case 88059:
                if (command.equals(CommandConstants.COMMAND_Z12)) {
                    return ChannelKt.Channel$default(-1, null, null, 6, null);
                }
                return null;
            case 88060:
                if (command.equals(CommandConstants.COMMAND_Z13)) {
                    return ChannelKt.Channel$default(-1, null, null, 6, null);
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    public final TapOnPhonePinPadSdkWrapper provideTapOnPhonePinPadSdkWrapper(@NotNull Context context, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return new TapOnPhonePinPadSdkWrapper(context, gson);
    }
}
