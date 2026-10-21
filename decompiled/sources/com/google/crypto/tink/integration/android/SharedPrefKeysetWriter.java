package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.subtle.Hex;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class SharedPrefKeysetWriter implements KeysetWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f46620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46621b;

    public SharedPrefKeysetWriter(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f46621b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f46620a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f46620a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        if (!this.f46620a.putString(this.f46621b, Hex.encode(keyset.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset encryptedKeyset) throws IOException {
        if (!this.f46620a.putString(this.f46621b, Hex.encode(encryptedKeyset.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
