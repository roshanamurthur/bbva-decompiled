package com.mastercard.sonic.utils;

import ad.d;
import android.content.Context;
import android.content.SharedPreferences;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import ik.e;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileDirUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u001e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010#\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010%R$\u00101\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/mastercard/sonic/utils/FileDirUtils;", "", "Landroid/content/Context;", "context", "", "getSonicSoundFilePath", "getSonicSoundFilePathActive", "getSonicVersionConfigFilePath", "getSonicAssetAnimationFilePath", "getSonicAssetAnimationFilePathActive", "getSonicAssetPlayConfigFilePath", "getSonicAssetPlayConfigFilePathActive", "getMixPanelRequestFilePath", "getMixPanelRequestToSyncFilePath", "getMixPanelRequestFailedToSyncFilePath", "getSonicDirAssetTempPath", "getSonicAssetHapticsFilePath", "filePath", "", "doFileExist", "fileContents", "writeToFile", "readFromFile", "deleteFile", "newNameFilePath", "renameFile", DigipassManagerConstants.KEY_RESPONSE, "fileName", "storeAssetsInTempDir", "moveFromTempToActive", "jsonString", "", "storeVersionConfigFile", "clearStoredData$sonic_sdk_release", "(Landroid/content/Context;)V", "clearStoredData", "SONIC_SDK_VERSION_CONFIG_FILENAME", "Ljava/lang/String;", "SONIC_SDK_ASSET_PLAY_CONFIG_FILENAME", "SONIC_SDK_ASSET_ANIMATION_FILENAME", "SONIC_SDK_ASSET_SOUND_FILENAME", "SONIC_SDK_ASSETS_PATH", "SONIC_ASSET_HAPTICS_FILENAME", "SLASH", "a", "getSonicCue", "()Ljava/lang/String;", "setSonicCue", "(Ljava/lang/String;)V", "sonicCue", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFileDirUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDirUtils.kt\ncom/mastercard/sonic/utils/FileDirUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
public final class FileDirUtils {

    @NotNull
    public static final FileDirUtils INSTANCE = new FileDirUtils();

    @NotNull
    public static final String SLASH = "/";

    @NotNull
    public static final String SONIC_ASSET_HAPTICS_FILENAME = "signature_forte.ahap";

    @NotNull
    public static final String SONIC_SDK_ASSETS_PATH = "filepath";

    @NotNull
    public static final String SONIC_SDK_ASSET_ANIMATION_FILENAME = "animation.json";

    @NotNull
    public static final String SONIC_SDK_ASSET_PLAY_CONFIG_FILENAME = "play_config.json";

    @NotNull
    public static final String SONIC_SDK_ASSET_SOUND_FILENAME = "audio.mp3";

    @NotNull
    public static final String SONIC_SDK_VERSION_CONFIG_FILENAME = "version_config.json";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static String sonicCue;

    public static String a(InputStream inputStream) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    String string = new BigInteger(1, messageDigest.digest()).toString(16);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%32s", Arrays.copyOf(new Object[]{string}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    return l.replace$default(str, ' ', '0', false, 4, (Object) null);
                }
                messageDigest.update(bArr, 0, i10);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static String b(Context context) {
        String strD = d(context);
        char c10 = File.separatorChar;
        return strD + c10 + "sonic_assets_active" + c10 + sonicCue;
    }

    public static String c(Context context) {
        String strD = d(context);
        char c10 = File.separatorChar;
        String str = strD + c10 + "sonic_assets_active" + c10 + sonicCue;
        new File(str).mkdirs();
        return str;
    }

    public static String d(Context context) {
        String path = context.getApplicationInfo().dataDir;
        Intrinsics.checkNotNullExpressionValue(path, "path");
        new File(path).mkdirs();
        String absolutePath = new File(path).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getDataDir(context).absolutePath");
        String strE = d.e(absolutePath, File.separatorChar, "sonic");
        new File(strE).mkdirs();
        return strE;
    }

    public final void clearStoredData$sonic_sdk_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("SonicSharedPreferences", 0);
        File file = new File(c(context));
        if (file.exists()) {
            e.deleteRecursively(file);
        }
        sharedPreferences.edit().remove("animation_version_" + sonicCue).apply();
    }

    public final boolean deleteFile(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new File(filePath).delete();
    }

    public final boolean doFileExist(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new File(filePath).exists();
    }

    @NotNull
    public final String getMixPanelRequestFailedToSyncFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(d(context), File.separatorChar, "Failed_MixPanelRequestToSync");
    }

    @NotNull
    public final String getMixPanelRequestFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(d(context), File.separatorChar, "mix-panel.json");
    }

    @NotNull
    public final String getMixPanelRequestToSyncFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(d(context), File.separatorChar, "mix-panel-to-sync.json");
    }

    @NotNull
    public final String getSonicAssetAnimationFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(c(context), File.separatorChar, SONIC_SDK_ASSET_ANIMATION_FILENAME);
    }

    @NotNull
    public final String getSonicAssetAnimationFilePathActive(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(b(context), File.separatorChar, SONIC_SDK_ASSET_ANIMATION_FILENAME);
    }

    @NotNull
    public final String getSonicAssetHapticsFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(c(context), File.separatorChar, SONIC_ASSET_HAPTICS_FILENAME);
    }

    @NotNull
    public final String getSonicAssetPlayConfigFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(c(context), File.separatorChar, SONIC_SDK_ASSET_PLAY_CONFIG_FILENAME);
    }

    @NotNull
    public final String getSonicAssetPlayConfigFilePathActive(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(b(context), File.separatorChar, SONIC_SDK_ASSET_PLAY_CONFIG_FILENAME);
    }

    @Nullable
    public final String getSonicCue() {
        return sonicCue;
    }

    @NotNull
    public final String getSonicDirAssetTempPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strD = d(context);
        char c10 = File.separatorChar;
        String str = strD + c10 + "sonic_assets_temp" + c10 + sonicCue;
        new File(str).mkdirs();
        return str;
    }

    @NotNull
    public final String getSonicSoundFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(c(context), File.separatorChar, SONIC_SDK_ASSET_SOUND_FILENAME);
    }

    @NotNull
    public final String getSonicSoundFilePathActive(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(b(context), File.separatorChar, SONIC_SDK_ASSET_SOUND_FILENAME);
    }

    @NotNull
    public final String getSonicVersionConfigFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d.e(d(context), File.separatorChar, SONIC_SDK_VERSION_CONFIG_FILENAME);
    }

    public final boolean moveFromTempToActive(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(c(context));
        File file2 = new File(getSonicDirAssetTempPath(context));
        if (file.exists()) {
            e.deleteRecursively(file);
        }
        return file2.renameTo(file);
    }

    @Nullable
    public final String readFromFile(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            File file = new File(filePath);
            if (!file.exists() && !file.isFile()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    return sb2.toString();
                }
                sb2.append(line);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public final boolean renameFile(@NotNull String filePath, @NotNull String newNameFilePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(newNameFilePath, "newNameFilePath");
        return new File(filePath).renameTo(new File(newNameFilePath));
    }

    public final void setSonicCue(@Nullable String str) {
        sonicCue = str;
    }

    public final boolean storeAssetsInTempDir(@NotNull String response, @NotNull String fileName, @NotNull Context context) throws NoSuchAlgorithmException, IOException {
        String strA;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(getSonicDirAssetTempPath(context), fileName);
        file.createNewFile();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        Charset charset = Charsets.UTF_8;
        byte[] bytes = response.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();
        byte[] bytes2 = response.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        String strA2 = a(new ByteArrayInputStream(bytes2));
        if (strA2 == null) {
            strA2 = "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
            strA = a(fileInputStream);
            fileInputStream.close();
        } catch (IOException e5) {
            e5.getMessage();
            strA = null;
        }
        file.getAbsolutePath();
        return Intrinsics.areEqual(strA2, strA);
    }

    public final void storeVersionConfigFile(@NotNull String jsonString, @NotNull String fileName, @NotNull Context context) throws IOException {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getClass();
        String path = context.getApplicationInfo().dataDir;
        Intrinsics.checkNotNullExpressionValue(path, "path");
        new File(path).mkdirs();
        String absolutePath = new File(path).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "FileDirUtils.getDataDir(context).absolutePath");
        File file = new File(absolutePath, "sonic");
        file.mkdir();
        File file2 = new File(file.getAbsolutePath(), fileName);
        JsonElement string = JsonParser.parseString(jsonString);
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder().setPrettyPrinting().create()");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        bufferedWriter.write(gsonCreate.toJson(string));
        bufferedWriter.close();
    }

    public final boolean writeToFile(@NotNull String fileContents, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(fileContents, "fileContents");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePath)));
            bufferedWriter.write(fileContents);
            bufferedWriter.close();
            return true;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }
}
