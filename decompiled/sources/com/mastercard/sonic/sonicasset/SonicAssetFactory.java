package com.mastercard.sonic.sonicasset;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SonicAssetFactory.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mastercard/sonic/sonicasset/SonicAssetFactory;", "", "()V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SonicAssetFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SonicAssetFactory.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/mastercard/sonic/sonicasset/SonicAssetFactory$Companion;", "", "()V", "createSonicAsset", "Lcom/mastercard/sonic/sonicasset/SonicAsset;", "fileName", "", "context", "Landroid/content/Context;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SonicAsset createSonicAsset(@NotNull String fileName, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(context, "context");
            return new File(fileName).exists() ? new StorageSonicAsset(context) : new DefaultSonicAsset(context);
        }
    }

    @JvmStatic
    @NotNull
    public static final SonicAsset createSonicAsset(@NotNull String str, @NotNull Context context) {
        return INSTANCE.createSonicAsset(str, context);
    }
}
