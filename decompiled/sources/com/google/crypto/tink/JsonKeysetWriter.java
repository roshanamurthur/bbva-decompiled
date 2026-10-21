package com.google.crypto.tink;

import androidx.annotation.RequiresApi;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.subtle.Base64;
import com.google.errorprone.annotations.InlineMe;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes10.dex */
public final class JsonKeysetWriter implements KeysetWriter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f46409b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f46410a;

    public JsonKeysetWriter(OutputStream outputStream) {
        this.f46410a = outputStream;
    }

    public static JsonObject a(Keyset keyset) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("primaryKeyId", Long.valueOf(((long) keyset.getPrimaryKeyId()) & 4294967295L));
        JsonArray jsonArray = new JsonArray();
        for (Keyset.Key key : keyset.getKeyList()) {
            JsonObject jsonObject2 = new JsonObject();
            KeyData keyData = key.getKeyData();
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("typeUrl", keyData.getTypeUrl());
            jsonObject3.addProperty("value", Base64.encode(keyData.getValue().toByteArray()));
            jsonObject3.addProperty("keyMaterialType", keyData.getKeyMaterialType().name());
            jsonObject2.add("keyData", jsonObject3);
            jsonObject2.addProperty("status", key.getStatus().name());
            jsonObject2.addProperty("keyId", Long.valueOf(((long) key.getKeyId()) & 4294967295L));
            jsonObject2.addProperty("outputPrefixType", key.getOutputPrefixType().name());
            jsonArray.add(jsonObject2);
        }
        jsonObject.add("key", jsonArray);
        return jsonObject;
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetWriter", "java.io.FileOutputStream"}, replacement = "JsonKeysetWriter.withOutputStream(new FileOutputStream(file))")
    @Deprecated
    public static KeysetWriter withFile(File file) throws IOException {
        return withOutputStream(new FileOutputStream(file));
    }

    public static KeysetWriter withOutputStream(OutputStream outputStream) {
        return new JsonKeysetWriter(outputStream);
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetWriter", "java.io.File", "java.io.FileOutputStream"}, replacement = "JsonKeysetWriter.withOutputStream(new FileOutputStream(new File(path)))")
    @Deprecated
    public static KeysetWriter withPath(String str) throws IOException {
        return withOutputStream(new FileOutputStream(new File(str)));
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        OutputStream outputStream = this.f46410a;
        try {
            try {
                String string = a(keyset).toString();
                Charset charset = f46409b;
                outputStream.write(string.getBytes(charset));
                outputStream.write(System.lineSeparator().getBytes(charset));
                outputStream.close();
            } catch (JsonParseException e5) {
                throw new IOException(e5);
            }
        } catch (Throwable th2) {
            outputStream.close();
            throw th2;
        }
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetWriter", "java.io.FileOutputStream"}, replacement = "JsonKeysetWriter.withOutputStream(new FileOutputStream(path.toFile()))")
    @RequiresApi(26)
    @Deprecated
    public static KeysetWriter withPath(Path path) throws IOException {
        return withOutputStream(new FileOutputStream(path.toFile()));
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset encryptedKeyset) throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("encryptedKeyset", Base64.encode(encryptedKeyset.getEncryptedKeyset().toByteArray()));
        KeysetInfo keysetInfo = encryptedKeyset.getKeysetInfo();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("primaryKeyId", Long.valueOf(((long) keysetInfo.getPrimaryKeyId()) & 4294967295L));
        JsonArray jsonArray = new JsonArray();
        for (KeysetInfo.KeyInfo keyInfo : keysetInfo.getKeyInfoList()) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("typeUrl", keyInfo.getTypeUrl());
            jsonObject3.addProperty("status", keyInfo.getStatus().name());
            jsonObject3.addProperty("keyId", Long.valueOf(((long) keyInfo.getKeyId()) & 4294967295L));
            jsonObject3.addProperty("outputPrefixType", keyInfo.getOutputPrefixType().name());
            jsonArray.add(jsonObject3);
        }
        jsonObject2.add("keyInfo", jsonArray);
        jsonObject.add("keysetInfo", jsonObject2);
        String string = jsonObject.toString();
        Charset charset = f46409b;
        byte[] bytes = string.getBytes(charset);
        OutputStream outputStream = this.f46410a;
        outputStream.write(bytes);
        outputStream.write(System.lineSeparator().getBytes(charset));
        outputStream.close();
    }
}
