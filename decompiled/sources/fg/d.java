package fg;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: ProtobufValueEncoderContext.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements ValueEncoderContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f68447a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f68448b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FieldDescriptor f68449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.firebase.encoders.proto.a f68450d;

    public d(com.google.firebase.encoders.proto.a aVar) {
        this.f68450d = aVar;
    }

    public final void a() {
        if (this.f68447a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f68447a = true;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@Nullable String str) throws IOException {
        a();
        this.f68450d.e(this.f68449c, str, this.f68448b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(float f6) throws IOException {
        a();
        this.f68450d.b(this.f68449c, f6, this.f68448b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(double d2) throws IOException {
        a();
        this.f68450d.a(this.f68449c, d2, this.f68448b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(int i10) throws IOException {
        a();
        this.f68450d.c(this.f68449c, i10, this.f68448b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(long j10) throws IOException {
        a();
        this.f68450d.d(this.f68449c, j10, this.f68448b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(boolean z10) throws IOException {
        a();
        this.f68450d.c(this.f68449c, z10 ? 1 : 0, this.f68448b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@NonNull byte[] bArr) throws IOException {
        a();
        this.f68450d.e(this.f68449c, bArr, this.f68448b);
        return this;
    }
}
