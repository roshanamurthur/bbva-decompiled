package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.io.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class DictionaryLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resource f63674b;

    public DictionaryLoader(String str, Resource resource) {
        this.f63673a = str;
        this.f63674b = resource;
    }

    public Dictionary load() throws IOException {
        String str = this.f63673a;
        ArrayList arrayList = new ArrayList();
        try {
            InputStream inputStream = this.f63674b.getInputStream();
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            arrayList.add(line);
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                        throw th;
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return new Dictionary(str, arrayList);
                } catch (Throwable th5) {
                    inputStreamReader.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        } catch (IOException unused) {
            throw new RuntimeException("Error while reading " + str);
        }
    }
}
