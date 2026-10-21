package com.mastercard.sonic.sonicasset;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.media.SoundPool;
import com.mastercard.sonic.utils.FileDirUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StorageSonicAsset.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/mastercard/sonic/sonicasset/StorageSonicAsset;", "Lcom/mastercard/sonic/sonicasset/SonicAsset;", "Landroid/media/SoundPool;", "soundPool", "", "loadSoundAssets", "", "calculateSonicSoundDuration", "Ljava/io/BufferedReader;", "getBufferedReaderForHapticsFile", "getBufferedReaderForAnimation", "getBufferedReaderForPlayConfig", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class StorageSonicAsset extends SonicAsset {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f51571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f51572d;

    public StorageSonicAsset(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51571c = context;
        this.f51572d = FileDirUtils.INSTANCE.getSonicSoundFilePath(context);
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    @NotNull
    public String calculateSonicSoundDuration() throws IOException {
        String str = "Unknown";
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.f51572d);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (strExtractMetadata != null) {
                str = strExtractMetadata;
            }
        } catch (Exception e5) {
            e5.getMessage();
        } finally {
            mediaMetadataRetriever.release();
        }
        return str;
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    @NotNull
    public BufferedReader getBufferedReaderForAnimation() {
        return new BufferedReader(new FileReader(new File(FileDirUtils.INSTANCE.getSonicAssetAnimationFilePath(this.f51571c))));
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    @NotNull
    public BufferedReader getBufferedReaderForHapticsFile() {
        return new BufferedReader(new FileReader(new File(FileDirUtils.INSTANCE.getSonicAssetHapticsFilePath(this.f51571c))));
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    @NotNull
    public BufferedReader getBufferedReaderForPlayConfig() {
        return new BufferedReader(new FileReader(new File(FileDirUtils.INSTANCE.getSonicAssetPlayConfigFilePath(this.f51571c))));
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    public int loadSoundAssets(@NotNull SoundPool soundPool) {
        Intrinsics.checkNotNullParameter(soundPool, "soundPool");
        return soundPool.load(this.f51572d, 1);
    }
}
