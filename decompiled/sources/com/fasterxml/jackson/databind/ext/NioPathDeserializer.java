package com.fasterxml.jackson.databind.ext;

import com.esotericsoftware.kryo.serializers.f0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes9.dex */
public class NioPathDeserializer extends StdScalarDeserializer<Path> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final boolean f43309p0;

    static {
        boolean z10 = false;
        for (File file : File.listRoots()) {
            String path = file.getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z10 = true;
                break;
            }
        }
        f43309p0 = z10;
    }

    public NioPathDeserializer() {
        super((Class<?>) f0.d());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Path deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return (Path) deserializationContext.handleUnexpectedToken(Path.class, jsonParser);
        }
        String text = jsonParser.getText();
        if (text.indexOf(58) < 0) {
            return Paths.get(text, new String[0]);
        }
        if (f43309p0 && text.length() >= 2 && Character.isLetter(text.charAt(0)) && text.charAt(1) == ':') {
            return Paths.get(text, new String[0]);
        }
        try {
            URI uri = new URI(text);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e5) {
                try {
                    String scheme = uri.getScheme();
                    for (FileSystemProvider fileSystemProvider : ServiceLoader.load(FileSystemProvider.class)) {
                        if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProvider.getPath(uri);
                        }
                    }
                    return (Path) deserializationContext.handleInstantiationProblem(handledType(), text, e5);
                } catch (Throwable th2) {
                    th2.addSuppressed(e5);
                    return (Path) deserializationContext.handleInstantiationProblem(handledType(), text, th2);
                }
            } catch (Throwable th3) {
                return (Path) deserializationContext.handleInstantiationProblem(handledType(), text, th3);
            }
        } catch (URISyntaxException e7) {
            return (Path) deserializationContext.handleInstantiationProblem(handledType(), text, e7);
        }
    }
}
