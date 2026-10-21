package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.io.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes11.dex */
public abstract class KeyboardLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resource f63687b;

    public KeyboardLoader(String str, Resource resource) {
        this.f63686a = str;
        this.f63687b = resource;
    }

    public abstract Keyboard.AdjacentGraphBuilder buildAdjacentGraphBuilder(String str);

    public Keyboard load() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f63687b.getInputStream(), "UTF-8"));
            try {
                StringBuilder sb2 = new StringBuilder(4096);
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String string = sb2.toString();
                        bufferedReader.close();
                        return new Keyboard(this.f63686a, buildAdjacentGraphBuilder(string));
                    }
                    sb2.append(line);
                    sb2.append('\n');
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e5) {
            throw new IllegalArgumentException(e5);
        }
    }
}
