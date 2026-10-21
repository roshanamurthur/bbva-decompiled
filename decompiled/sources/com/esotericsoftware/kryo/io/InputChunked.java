package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.minlog.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class InputChunked extends Input {
    private int chunkSize;

    public InputChunked() {
        this.chunkSize = -1;
    }

    private boolean readChunkSize() {
        try {
            InputStream inputStream = getInputStream();
            int i10 = 0;
            for (int i11 = 0; i11 < 32; i11 += 7) {
                int i12 = inputStream.read();
                if (i12 == -1) {
                    return false;
                }
                i10 |= (i12 & 127) << i11;
                if ((i12 & 128) == 0) {
                    this.chunkSize = i10;
                    if (!Log.TRACE || i10 <= 0) {
                        return true;
                    }
                    Log.trace("kryo", "Read chunk: " + this.chunkSize);
                    return true;
                }
            }
            throw new KryoException("Unable to read chunk size: malformed integer");
        } catch (IOException e5) {
            throw new KryoException("Unable to read chunk size.", e5);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int fill(byte[] bArr, int i10, int i11) throws KryoException {
        int i12 = this.chunkSize;
        if (i12 == -1) {
            if (!readChunkSize()) {
                return -1;
            }
        } else if (i12 == 0) {
            return -1;
        }
        int iFill = super.fill(bArr, i10, Math.min(this.chunkSize, i11));
        int i13 = this.chunkSize - iFill;
        this.chunkSize = i13;
        if (i13 != 0 || readChunkSize()) {
            return iFill;
        }
        return -1;
    }

    public void nextChunk() {
        if (this.chunkSize == -1) {
            readChunkSize();
        }
        while (true) {
            int i10 = this.chunkSize;
            if (i10 <= 0) {
                break;
            } else {
                skip(i10);
            }
        }
        this.chunkSize = -1;
        if (Log.TRACE) {
            Log.trace("kryo", "Next chunk.");
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream, com.esotericsoftware.kryo.util.Pool.Poolable
    public void reset() {
        super.reset();
        this.chunkSize = -1;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setBuffer(byte[] bArr, int i10, int i11) {
        super.setBuffer(bArr, i10, i11);
        this.chunkSize = -1;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setInputStream(InputStream inputStream) {
        super.setInputStream(inputStream);
        this.chunkSize = -1;
    }

    public InputChunked(int i10) {
        super(i10);
        this.chunkSize = -1;
    }

    public InputChunked(InputStream inputStream) {
        super(inputStream);
        this.chunkSize = -1;
    }

    public InputChunked(InputStream inputStream, int i10) {
        super(inputStream, i10);
        this.chunkSize = -1;
    }
}
