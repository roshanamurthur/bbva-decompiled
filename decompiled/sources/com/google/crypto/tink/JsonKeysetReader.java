package com.google.crypto.tink;

import androidx.annotation.RequiresApi;
import bf.g;
import com.google.crypto.tink.internal.JsonParser;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.subtle.Base64;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes10.dex */
public final class JsonKeysetReader implements KeysetReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f46406c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f46407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46408b = false;

    public JsonKeysetReader(InputStream inputStream) {
        this.f46407a = inputStream;
    }

    public static int b(JsonElement jsonElement) throws IOException {
        try {
            long parsedNumberAsLongOrThrow = JsonParser.getParsedNumberAsLongOrThrow(jsonElement);
            if (parsedNumberAsLongOrThrow > 4294967295L || parsedNumberAsLongOrThrow < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jsonElement.getAsLong();
        } catch (NumberFormatException e5) {
            throw new IOException(e5);
        }
    }

    public static OutputPrefixType c(String str) {
        str.getClass();
        switch (str) {
            case "LEGACY":
                return OutputPrefixType.LEGACY;
            case "RAW":
                return OutputPrefixType.RAW;
            case "TINK":
                return OutputPrefixType.TINK;
            case "CRUNCHY":
                return OutputPrefixType.CRUNCHY;
            default:
                throw new JsonParseException("unknown output prefix type: ".concat(str));
        }
    }

    public static KeyStatusType d(String str) {
        str.getClass();
        switch (str) {
            case "ENABLED":
                return KeyStatusType.ENABLED;
            case "DESTROYED":
                return KeyStatusType.DESTROYED;
            case "DISABLED":
                return KeyStatusType.DISABLED;
            default:
                throw new JsonParseException("unknown status: ".concat(str));
        }
    }

    public static JsonKeysetReader withBytes(byte[] bArr) {
        return new JsonKeysetReader(new ByteArrayInputStream(bArr));
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetReader", "java.io.FileInputStream"}, replacement = "JsonKeysetReader.withInputStream(new FileInputStream(file))")
    @Deprecated
    public static JsonKeysetReader withFile(File file) throws IOException {
        return withInputStream(new FileInputStream(file));
    }

    public static JsonKeysetReader withInputStream(InputStream inputStream) throws IOException {
        return new JsonKeysetReader(inputStream);
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetReader"}, replacement = "JsonKeysetReader.withString(input.toString())")
    @Deprecated
    public static JsonKeysetReader withJsonObject(Object obj) {
        return withString(obj.toString());
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetReader", "java.io.File", "java.io.FileInputStream"}, replacement = "JsonKeysetReader.withInputStream(new FileInputStream(new File(path)))")
    @Deprecated
    public static JsonKeysetReader withPath(String str) throws IOException {
        return withInputStream(new FileInputStream(new File(str)));
    }

    public static JsonKeysetReader withString(String str) {
        return new JsonKeysetReader(new ByteArrayInputStream(str.getBytes(f46406c)));
    }

    public final EncryptedKeyset a(JsonObject jsonObject) throws IOException {
        if (!jsonObject.has("encryptedKeyset")) {
            throw new JsonParseException("invalid encrypted keyset");
        }
        byte[] bArrUrlSafeDecode = this.f46408b ? Base64.urlSafeDecode(jsonObject.get("encryptedKeyset").getAsString()) : Base64.decode(jsonObject.get("encryptedKeyset").getAsString());
        if (!jsonObject.has("keysetInfo")) {
            return EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(bArrUrlSafeDecode)).build();
        }
        EncryptedKeyset.Builder encryptedKeyset = EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(bArrUrlSafeDecode));
        JsonObject asJsonObject = jsonObject.getAsJsonObject("keysetInfo");
        KeysetInfo.Builder builderNewBuilder = KeysetInfo.newBuilder();
        if (asJsonObject.has("primaryKeyId")) {
            builderNewBuilder.setPrimaryKeyId(b(asJsonObject.get("primaryKeyId")));
        }
        if (asJsonObject.has("keyInfo")) {
            JsonArray asJsonArray = asJsonObject.getAsJsonArray("keyInfo");
            for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
                JsonObject asJsonObject2 = asJsonArray.get(i10).getAsJsonObject();
                builderNewBuilder.addKeyInfo(KeysetInfo.KeyInfo.newBuilder().setStatus(d(asJsonObject2.get("status").getAsString())).setKeyId(b(asJsonObject2.get("keyId"))).setOutputPrefixType(c(asJsonObject2.get("outputPrefixType").getAsString())).setTypeUrl(asJsonObject2.get("typeUrl").getAsString()).build());
            }
        }
        return encryptedKeyset.setKeysetInfo(builderNewBuilder.build()).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[SYNTHETIC] */
    public final Keyset e(JsonObject jsonObject) throws IOException {
        KeyData.KeyMaterialType keyMaterialType;
        if (!jsonObject.has("key") || jsonObject.getAsJsonArray("key").size() == 0) {
            throw new JsonParseException("invalid keyset");
        }
        Keyset.Builder builderNewBuilder = Keyset.newBuilder();
        if (jsonObject.has("primaryKeyId")) {
            builderNewBuilder.setPrimaryKeyId(b(jsonObject.get("primaryKeyId")));
        }
        JsonArray asJsonArray = jsonObject.getAsJsonArray("key");
        int i10 = 0;
        while (i10 < asJsonArray.size()) {
            JsonObject asJsonObject = asJsonArray.get(i10).getAsJsonObject();
            if (!asJsonObject.has("keyData") || !asJsonObject.has("status") || !asJsonObject.has("keyId") || !asJsonObject.has("outputPrefixType")) {
                throw new JsonParseException("invalid key");
            }
            Keyset.Key.newBuilder().setStatus(d(asJsonObject.get("status").getAsString())).setKeyId(b(asJsonObject.get("keyId"))).setOutputPrefixType(c(asJsonObject.get("outputPrefixType").getAsString()));
            JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("keyData");
            if (!asJsonObject2.has("typeUrl") || !asJsonObject2.has("value") || !asJsonObject2.has("keyMaterialType")) {
                throw new JsonParseException("invalid keyData");
            }
            KeyData.newBuilder().setTypeUrl(asJsonObject2.get("typeUrl").getAsString()).setValue(ByteString.copyFrom(this.f46408b ? Base64.urlSafeDecode(asJsonObject2.get("value").getAsString()) : Base64.decode(asJsonObject2.get("value").getAsString())));
            String asString = asJsonObject2.get("keyMaterialType").getAsString();
            asString.getClass();
            byte b10 = -1;
            switch (asString) {
                case "REMOTE":
                    b10 = 0;
                case "SYMMETRIC":
                    b10 = 1;
                case "ASYMMETRIC_PRIVATE":
                    b10 = 2;
                case "ASYMMETRIC_PUBLIC":
                    b10 = 3;
                default:
                    switch (b10) {
                        case 0:
                            keyMaterialType = KeyData.KeyMaterialType.REMOTE;
                            break;
                        case 1:
                            keyMaterialType = KeyData.KeyMaterialType.SYMMETRIC;
                            break;
                        case 2:
                            keyMaterialType = KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
                            break;
                        case 3:
                            keyMaterialType = KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
                            break;
                        default:
                            throw new JsonParseException("unknown key material type: ".concat(asString));
                    }
            }
        }
        return builderNewBuilder.build();
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() throws IOException {
        InputStream inputStream = this.f46407a;
        try {
            try {
                int i10 = g.f25203a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = inputStream.read(bArr);
                    if (i11 == -1) {
                        return e(JsonParser.parse(new String(byteArrayOutputStream.toByteArray(), f46406c)).getAsJsonObject());
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (JsonParseException | IllegalStateException e5) {
            throw new IOException(e5);
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() throws IOException {
        InputStream inputStream = this.f46407a;
        try {
            try {
                int i10 = g.f25203a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = inputStream.read(bArr);
                    if (i11 == -1) {
                        return a(JsonParser.parse(new String(byteArrayOutputStream.toByteArray(), f46406c)).getAsJsonObject());
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (JsonParseException | IllegalStateException e5) {
            throw new IOException(e5);
        }
    }

    @CanIgnoreReturnValue
    public JsonKeysetReader withUrlSafeBase64() {
        this.f46408b = true;
        return this;
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetReader", "java.io.FileInputStream"}, replacement = "JsonKeysetReader.withInputStream(new FileInputStream(path.toFile()))")
    @RequiresApi(26)
    @Deprecated
    public static JsonKeysetReader withPath(Path path) throws IOException {
        return withInputStream(new FileInputStream(path.toFile()));
    }
}
