package com.mastercard.sonic.sonicasset;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.media.SoundPool;
import com.mastercard.sonic.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultSonicAsset.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/mastercard/sonic/sonicasset/DefaultSonicAsset;", "Lcom/mastercard/sonic/sonicasset/SonicAsset;", "Landroid/media/SoundPool;", "soundPool", "", "loadSoundAssets", "", "calculateSonicSoundDuration", "Ljava/io/BufferedReader;", "getBufferedReaderForHapticsFile", "getBufferedReaderForAnimation", "getBufferedReaderForPlayConfig", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class DefaultSonicAsset extends SonicAsset {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f51535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f51539g;

    public DefaultSonicAsset(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51535c = context;
        this.f51536d = R.raw.audio;
        this.f51537e = R.raw.play_config;
        this.f51538f = R.raw.animation;
        this.f51539g = R.raw.signature_forte;
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    @NotNull
    public String calculateSonicSoundDuration() {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f51535c.getResources().openRawResourceFd(this.f51536d);
        mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        Intrinsics.checkNotNull(strExtractMetadata);
        return strExtractMetadata;
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    @NotNull
    public BufferedReader getBufferedReaderForAnimation() {
        InputStream inputStreamOpenRawResource = this.f51535c.getResources().openRawResource(this.f51538f);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "context.resources.openRa…(animationAssetsResource)");
        return new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    @NotNull
    public BufferedReader getBufferedReaderForHapticsFile() {
        InputStream inputStreamOpenRawResource = this.f51535c.getResources().openRawResource(this.f51539g);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "context.resources.openRa…urce(hapticsFileResource)");
        return new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    @NotNull
    public BufferedReader getBufferedReaderForPlayConfig() {
        InputStream inputStreamOpenRawResource = this.f51535c.getResources().openRawResource(this.f51537e);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "context.resources.openRa…ource(playConfigResource)");
        return new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
    }

    @Override // com.mastercard.sonic.sonicasset.SonicAsset
    public int loadSoundAssets(@NotNull SoundPool soundPool) {
        Intrinsics.checkNotNullParameter(soundPool, "soundPool");
        return soundPool.load(this.f51535c, this.f51536d, 1);
    }
}
