package com.mastercard.sonic.sonicasset;

import android.media.SoundPool;
import android.util.SparseArray;
import com.mastercard.sonic.androidsvg.SVG;
import java.io.BufferedReader;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SonicAsset.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b \u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0002H&J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u000f\u001a\u00020\u0007J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017¨\u0006\u001d"}, d2 = {"Lcom/mastercard/sonic/sonicasset/SonicAsset;", "", "Ljava/io/BufferedReader;", "getBufferedReaderForPlayConfig", "getBufferedReaderForAnimation", "Landroid/media/SoundPool;", "soundPool", "", "loadSoundAssets", "", "calculateSonicSoundDuration", "getBufferedReaderForHapticsFile", "Landroid/util/SparseArray;", "Lcom/mastercard/sonic/androidsvg/SVG;", "loadAnimationAssets", "getNumberOfFrames", "", "getFrameSizes", "getSoundDelayInMillis", "getAnimationDelayInMillis", "", "isHapticsSupportedForCue", "getBufferedHapticsFile", "", "setAnimationJsonFromFile", "setPlayConfigFromFile", "<init>", "()V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSonicAsset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SonicAsset.kt\ncom/mastercard/sonic/sonicasset/SonicAsset\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public abstract class SonicAsset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f51540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f51541b;

    public static String a(BufferedReader bufferedReader) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        return string;
    }

    @NotNull
    public abstract String calculateSonicSoundDuration();

    public final int getAnimationDelayInMillis() {
        JSONObject jSONObject = this.f51540a;
        if (jSONObject == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playConfigJson");
            jSONObject = null;
        }
        return jSONObject.getInt("animationDelayInMillis");
    }

    @NotNull
    public final BufferedReader getBufferedHapticsFile() {
        return getBufferedReaderForHapticsFile();
    }

    @NotNull
    public abstract BufferedReader getBufferedReaderForAnimation();

    @NotNull
    public abstract BufferedReader getBufferedReaderForHapticsFile();

    @NotNull
    public abstract BufferedReader getBufferedReaderForPlayConfig();

    @NotNull
    public final SparseArray<Long> getFrameSizes() throws JSONException {
        SparseArray<Long> sparseArray = new SparseArray<>();
        JSONObject jSONObject = this.f51540a;
        if (jSONObject == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playConfigJson");
            jSONObject = null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("frameTime");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "playConfigJson.getJSONObject(FRAME_TIME)");
        int length = jSONObject2.length();
        int i10 = 0;
        while (i10 < length) {
            i10++;
            sparseArray.put(i10, Long.valueOf(c.roundToLong(jSONObject2.getDouble("Frame_" + i10))));
        }
        return sparseArray;
    }

    public final int getNumberOfFrames() {
        JSONObject jSONObject = this.f51540a;
        if (jSONObject == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playConfigJson");
            jSONObject = null;
        }
        return jSONObject.getInt("totalFrames");
    }

    public final int getSoundDelayInMillis() {
        JSONObject jSONObject = this.f51540a;
        if (jSONObject == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playConfigJson");
            jSONObject = null;
        }
        return jSONObject.getInt("soundDelayInMillis");
    }

    public final boolean isHapticsSupportedForCue() throws JSONException {
        if (this.f51540a == null) {
            setPlayConfigFromFile();
        }
        JSONObject jSONObject = this.f51540a;
        JSONObject jSONObject2 = null;
        if (jSONObject == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playConfigJson");
            jSONObject = null;
        }
        if (!jSONObject.has("isHapticsSupported")) {
            return false;
        }
        JSONObject jSONObject3 = this.f51540a;
        if (jSONObject3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playConfigJson");
        } else {
            jSONObject2 = jSONObject3;
        }
        return jSONObject2.getBoolean("isHapticsSupported");
    }

    @NotNull
    public final SparseArray<SVG> loadAnimationAssets() throws JSONException {
        SparseArray<SVG> sparseArray = new SparseArray<>();
        JSONArray jSONArray = this.f51541b;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animationJson");
            jSONArray = null;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                SVG.Companion companion = SVG.INSTANCE;
                JSONArray jSONArray2 = this.f51541b;
                if (jSONArray2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("animationJson");
                    jSONArray2 = null;
                }
                String string = jSONArray2.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string, "animationJson.getString(svgIndex)");
                sparseArray.put(i10, companion.getFromString(string));
            } catch (IOException unused) {
            }
        }
        return sparseArray;
    }

    public abstract int loadSoundAssets(@NotNull SoundPool soundPool);

    public final void setAnimationJsonFromFile() throws JSONException {
        this.f51541b = new JSONArray(a(getBufferedReaderForAnimation()));
    }

    public final void setPlayConfigFromFile() throws JSONException {
        this.f51540a = new JSONObject(a(getBufferedReaderForPlayConfig()));
    }
}
