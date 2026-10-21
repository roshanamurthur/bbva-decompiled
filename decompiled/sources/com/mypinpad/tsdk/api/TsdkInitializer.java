package com.mypinpad.tsdk.api;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\b0\u0007H\u0017¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/api/TsdkInitializer;", "Landroidx/startup/Initializer;", "Lcom/mypinpad/tsdk/api/TerminalSdk;", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Lcom/mypinpad/tsdk/api/TerminalSdk;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TsdkInitializer implements Initializer<TerminalSdk> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f51633a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51634b = 1;

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ TerminalSdk create(Context context) throws Throwable {
        int i10 = f51633a;
        int i11 = (i10 | 29) << 1;
        int i12 = -(((~i10) & 29) | (i10 & (-30)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f51634b = i13 % 128;
        if (i13 % 2 == 0) {
            create(context);
            throw null;
        }
        TerminalSdk terminalSdkCreate = create(context);
        int i14 = f51633a;
        int i15 = (i14 ^ 37) + ((i14 & 37) << 1);
        f51634b = i15 % 128;
        int i16 = i15 % 2;
        return terminalSdkCreate;
    }

    @Override // androidx.startup.Initializer
    @NotNull
    public final List<Class<? extends Initializer<?>>> dependencies() {
        int i10 = f51633a;
        int i11 = (i10 & 27) + (i10 | 27);
        f51634b = i11 % 128;
        int i12 = i11 % 2;
        List<Class<? extends Initializer<?>>> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        if (i12 == 0) {
            int i13 = 22 / 0;
        }
        return listEmptyList;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NotNull
    public final TerminalSdk create(@NotNull Context context) throws Throwable {
        TerminalSdk terminalSdkInit$sdk_android_release;
        int i10 = f51634b;
        int i11 = i10 & 15;
        int i12 = ((i10 ^ 15) | i11) << 1;
        int i13 = -((i10 | 15) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f51633a = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            terminalSdkInit$sdk_android_release = TsdkManualInitializer.INSTANCE.init$sdk_android_release(context, false);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            terminalSdkInit$sdk_android_release = TsdkManualInitializer.INSTANCE.init$sdk_android_release(context, true);
        }
        int i15 = f51634b + 25;
        f51633a = i15 % 128;
        int i16 = i15 % 2;
        return terminalSdkInit$sdk_android_release;
    }
}
