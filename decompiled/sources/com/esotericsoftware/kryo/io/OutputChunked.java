package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class OutputChunked extends Output {
    public OutputChunked() {
    }

    private void writeChunkSize() throws IOException {
        int iPosition = position();
        if (Log.TRACE) {
            Log.trace("kryo", "Write chunk: " + iPosition + Util.pos(iPosition));
        }
        OutputStream outputStream = getOutputStream();
        if ((iPosition & (-128)) == 0) {
            outputStream.write(iPosition);
            return;
        }
        outputStream.write((iPosition & 127) | 128);
        int i10 = iPosition >>> 7;
        if ((i10 & (-128)) == 0) {
            outputStream.write(i10);
            return;
        }
        outputStream.write((i10 & 127) | 128);
        int i11 = iPosition >>> 14;
        if ((i11 & (-128)) == 0) {
            outputStream.write(i11);
            return;
        }
        outputStream.write((i11 & 127) | 128);
        int i12 = iPosition >>> 21;
        if ((i12 & (-128)) == 0) {
            outputStream.write(i12);
        } else {
            outputStream.write((i12 & 127) | 128);
            outputStream.write(iPosition >>> 28);
        }
    }

    public void endChunk() {
        flush();
        if (Log.TRACE) {
            Log.trace("kryo", "End chunk.");
        }
        try {
            getOutputStream().write(0);
        } catch (IOException e5) {
            throw new KryoException(e5);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream, java.io.Flushable
    public void flush() throws KryoException {
        if (position() > 0) {
            try {
                writeChunkSize();
                super.flush();
            } catch (IOException e5) {
                throw new KryoException(e5);
            }
        }
        super.flush();
    }

    public OutputChunked(int i10) {
        super(i10);
    }

    public OutputChunked(OutputStream outputStream) {
        super(outputStream);
    }

    public OutputChunked(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
